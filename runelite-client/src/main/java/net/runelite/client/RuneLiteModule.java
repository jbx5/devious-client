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
package net.runelite.client;

import com.google.common.base.Strings;
import com.google.common.math.DoubleMath;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.binder.ConstantBindingBuilder;
import com.google.inject.name.Names;
import com.openosrs.client.config.OpenOSRSConfig;
import joptsimple.OptionSet;
import lombok.AllArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.Hooks;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.task.Scheduler;
import net.runelite.client.util.DeferredEventBus;
import net.runelite.client.util.ExecutorServiceExceptionLogger;
import net.runelite.http.api.RuneLiteAPI;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.config.UnethicaliteProperties;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@AllArgsConstructor
public class RuneLiteModule extends AbstractModule
{
	private final OkHttpClient okHttpClient;
	private final Supplier<Applet> clientLoader;
	private final Supplier<RuntimeConfig> configSupplier;
	private final boolean developerMode;
	private final boolean safeMode;
	private final File sessionfile;
	private final File config;
	private final OptionSet optionSet;
	private final boolean insecureWriteCredentials;
	private final boolean cachedRandomDat;
	private final boolean cachedUUID;

	@Override
	protected void configure()
	{
		Properties properties = RuneLiteProperties.getProperties();
		Map<Object, Object> props = new HashMap<>(properties);

		RuntimeConfig runtimeConfig = configSupplier.get();
		if (runtimeConfig != null && runtimeConfig.getProps() != null)
		{
			props.putAll(runtimeConfig.getProps());
		}

		// bind runelite.properties & runtime config
		for (Map.Entry<?, ?> entry : props.entrySet())
		{
			String key = (String) entry.getKey();
			if (entry.getValue() instanceof String)
			{
				ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(key));
				binder.to((String) entry.getValue());
			}
			else if (entry.getValue() instanceof Double)
			{
				ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(key));
				if (DoubleMath.isMathematicalInteger((double) entry.getValue()))
				{
					binder.to((int) (double) entry.getValue());
				}
				else
				{
					binder.to((double) entry.getValue());
				}
			}
			else if (entry.getValue() instanceof Boolean)
			{
				ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(key));
				binder.to((boolean) entry.getValue());
			}
		}

		bind(OptionSet.class).annotatedWith(Names.named("clientArgs")).toInstance(optionSet);
		bindConstant().annotatedWith(Names.named("developerMode")).to(developerMode);
		bindConstant().annotatedWith(Names.named("safeMode")).to(safeMode);
		bind(File.class).annotatedWith(Names.named("sessionfile")).toInstance(sessionfile);
		bind(File.class).annotatedWith(Names.named("config")).toInstance(config);
		bindConstant().annotatedWith(Names.named("insecureWriteCredentials")).to(insecureWriteCredentials);
		bindConstant().annotatedWith(Names.named("cachedRandomDat")).to(cachedRandomDat);
		bindConstant().annotatedWith(Names.named("cachedUUID")).to(cachedUUID);
		bind(File.class).annotatedWith(Names.named("runeLiteDir")).toInstance(RuneLite.RUNELITE_DIR);
		bind(ScheduledExecutorService.class).toInstance(new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
		bind(OkHttpClient.class).toInstance(okHttpClient);
		bind(MenuManager.class);
		bind(ChatMessageManager.class);
		bind(ItemManager.class);
		bind(Scheduler.class);
		bind(PluginManager.class);
		bind(SessionManager.class);

		bind(Gson.class).toInstance(RuneLiteAPI.GSON);

		bind(Callbacks.class).to(Hooks.class);

		bind(EventBus.class)
				.toInstance(new EventBus());

		bind(EventBus.class)
				.annotatedWith(Names.named("Deferred EventBus"))
				.to(DeferredEventBus.class);

		requestStaticInjection(
				Static.class
		);

		Properties unethicaliteProperties = UnethicaliteProperties.getProperties();
		for (String key : unethicaliteProperties.stringPropertyNames())
		{
			String value = unethicaliteProperties.getProperty(key);
			bindConstant().annotatedWith(Names.named(key)).to(value);
		}
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
	RuntimeConfig provideRuntimeConfig()
	{
		return configSupplier.get();
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
	@Named("runelite.api.base")
	HttpUrl provideApiBase(@Named("runelite.api.base") String s)
	{
		final String prop = System.getProperty("runelite.http-service.url");
		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
	}

	@Provides
	@Named("runelite.session")
	HttpUrl provideSession(@Named("runelite.session") String s)
	{
		final String prop = System.getProperty("runelite.session.url");
		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
	}

	@Provides
	@Named("runelite.static.base")
	HttpUrl provideStaticBase(@Named("runelite.static.base") String s)
	{
		final String prop = System.getProperty("runelite.static.url");
		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
	}

	@Provides
	@Named("runelite.ws")
	HttpUrl provideWs(@Named("runelite.ws") String s)
	{
		final String prop = System.getProperty("runelite.ws.url");
		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
	}

	@Provides
	@Named("runelite.pluginhub.url")
	HttpUrl providePluginHubBase(@Named("runelite.pluginhub.url") String s)
	{
		return HttpUrl.get(System.getProperty("runelite.pluginhub.url", s));
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
	@Nullable
	ServerPacket provideServerPacket(@Nullable Client client)
	{
		assert client != null;
		return client.createServerPacket(-1, -1);
	}

	@Provides
	@Singleton
	GlobalCollisionMap provideGlobalCollisionMap(@Named("unethicalite.api.url") String apiUrl) throws IOException
	{
		return GlobalCollisionMap.fetchFromUrl(apiUrl + "/regions");
	}

	@Provides
	@Singleton
	UnethicaliteConfig provideUnethicaliteConfig(ConfigManager configManager)
	{
		return configManager.getConfig(UnethicaliteConfig.class);
	}
}
