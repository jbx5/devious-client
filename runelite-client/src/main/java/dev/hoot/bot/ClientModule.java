/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package dev.hoot.bot;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.openosrs.client.config.OpenOSRSConfig;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.game.Prices;
import dev.hoot.api.game.Worlds;
import dev.hoot.api.movement.pathfinder.GlobalCollisionMap;
import dev.hoot.api.movement.pathfinder.RegionManager;
import dev.hoot.api.movement.pathfinder.Walker;
import dev.hoot.bot.config.BotConfig;
import dev.hoot.bot.script.Events;
import lombok.AllArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.client.NonScheduledExecutorServiceExceptionLogger;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.task.Scheduler;
import net.runelite.client.util.DeferredEventBus;
import net.runelite.client.util.ExecutorServiceExceptionLogger;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.chat.ChatClient;
import okhttp3.OkHttpClient;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.zip.GZIPInputStream;

@AllArgsConstructor
public class ClientModule extends AbstractModule
{
	private final OkHttpClient okHttpClient;
	private final Supplier<Applet> clientLoader;
	private final File config;

	@Override
	protected void configure()
	{
		bindConstant().annotatedWith(Names.named("safeMode")).to(false);
		bind(File.class).annotatedWith(Names.named("config")).toInstance(config);
		bind(ScheduledExecutorService.class).toInstance(new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
		bind(OkHttpClient.class).toInstance(okHttpClient);
		bind(ItemManager.class);
		bind(Scheduler.class);

		bind(Gson.class).toInstance(RuneLiteAPI.GSON);

		bind(Callbacks.class).to(BotHooks.class);

		bind(EventBus.class)
				.toInstance(new EventBus());

		bind(EventBus.class)
				.annotatedWith(Names.named("Deferred EventBus"))
				.to(DeferredEventBus.class);

		requestStaticInjection(
				Events.class,
				GameThread.class,
				Game.class,
				Prices.class,
				Worlds.class
		);
	}

	@Provides
	@Singleton
	Applet provideApplet()
	{
		return clientLoader.get();
	}

	@Provides
	@Singleton
	Client provideClient(@Nullable Applet applet)
	{
		return applet instanceof Client ? (Client) applet : null;
	}

	@Provides
	@Singleton
	RuneLiteConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RuneLiteConfig.class);
	}

	@Provides
	@Singleton
	ChatColorConfig provideChatColorConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ChatColorConfig.class);
	}

	@Provides
	@Singleton
	ChatClient provideChatClient(OkHttpClient okHttpClient)
	{
		return new ChatClient(okHttpClient);
	}

	@Provides
	@Singleton
	OpenOSRSConfig provideOpenOSRSConfig(ConfigManager configManager)
	{
		return configManager.getConfig(OpenOSRSConfig.class);
	}

	@Provides
	@Singleton
	ExecutorService provideExecutorService()
	{
		int poolSize = 2 * Runtime.getRuntime().availableProcessors();

		// Will start up to poolSize threads (because of allowCoreThreadTimeOut) as necessary, and times out
		// unused threads after 1 minute
		ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize,
				60L, TimeUnit.SECONDS,
				new LinkedBlockingQueue<>(),
				new ThreadFactoryBuilder().setNameFormat("worker-%d").build());
		executor.allowCoreThreadTimeOut(true);

		return new NonScheduledExecutorServiceExceptionLogger(executor);
	}

	@Provides
	@Singleton
	@Nullable
	ClientPacket provideClientPacket(@Nullable Client client)
	{
		assert client != null;
		return client.createClientPacket(-1, -1);
	}

	@Provides
	@Singleton
	GlobalCollisionMap provideGlobalCollisionMap() throws IOException
	{
		try (InputStream is = new URL(RegionManager.API_URL + "/regions").openStream())
		{
			return new GlobalCollisionMap(new GZIPInputStream(new ByteArrayInputStream(is.readAllBytes())).readAllBytes());
		}
		catch (IOException e)
		{
			// Fallback to old map
			LoggerFactory.getLogger(ClientModule.class)
					.warn("Failed to load global collision map, falling back to old map", e);
			return new GlobalCollisionMap(
					new GZIPInputStream(
							new ByteArrayInputStream(
									Walker.class.getResourceAsStream("/regions").readAllBytes()
							)
					).readAllBytes()
			);
		}
	}

	@Provides
	@Singleton
	BotConfig provideBotConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BotConfig.class);
	}
}
