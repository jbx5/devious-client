package dev.hoot.bot;

import com.google.common.base.Strings;
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
import dev.hoot.bot.managers.interaction.InteractionConfig;
import dev.hoot.bot.script.ScriptEventBus;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.client.NonScheduledExecutorServiceExceptionLogger;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.task.Scheduler;
import net.runelite.client.util.DeferredEventBus;
import net.runelite.client.util.ExecutorServiceExceptionLogger;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import java.applet.Applet;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.zip.GZIPInputStream;

@Singleton
public class BotModule extends AbstractModule
{
	private final OkHttpClient okHttpClient;
	private final Supplier<Applet> clientLoader;
	private final File config;

	public BotModule(OkHttpClient okHttpClient, Supplier<Applet> clientLoader, File config)
	{
		this.okHttpClient = okHttpClient;
		this.clientLoader = clientLoader;
		this.config = config;
	}

	@Override
	protected void configure()
	{
		Properties properties = RuneLiteProperties.getProperties();
		for (String key : properties.stringPropertyNames())
		{
			String value = properties.getProperty(key);
			bindConstant().annotatedWith(Names.named(key)).to(value);
		}

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
				ScriptEventBus.class,
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
	@Named("runelite.api.base")
	HttpUrl provideApiBase(@Named("runelite.api.base") String s)
	{
		final String prop = System.getProperty("runelite.http-service.url");
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
			LoggerFactory.getLogger(BotModule.class)
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

	@Provides
	@Singleton
	InteractionConfig provideInteractionConfig(ConfigManager configManager)
	{
		return configManager.getConfig(InteractionConfig.class);
	}
}
