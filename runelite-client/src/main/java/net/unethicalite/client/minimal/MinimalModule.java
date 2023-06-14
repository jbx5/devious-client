package net.unethicalite.client.minimal;

import com.google.common.base.Strings;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.openosrs.client.config.OpenOSRSConfig;
import joptsimple.OptionSet;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.NonScheduledExecutorServiceExceptionLogger;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
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
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@Singleton
@RequiredArgsConstructor
public class MinimalModule extends AbstractModule
{
	private final boolean developerMode;
	private final OkHttpClient okHttpClient;
	private final Supplier<Applet> clientLoader;
	private final File config;
	private final OptionSet optionSet;

	@Override
	protected void configure()
	{
		Properties properties = RuneLiteProperties.getProperties();
		for (String key : properties.stringPropertyNames())
		{
			String value = properties.getProperty(key);
			bindConstant().annotatedWith(Names.named(key)).to(value);
		}

		bind(OptionSet.class).annotatedWith(Names.named("clientArgs")).toInstance(optionSet);
		bindConstant().annotatedWith(Names.named("developerMode")).to(developerMode);
		bindConstant().annotatedWith(Names.named("safeMode")).to(false);
		bind(File.class).annotatedWith(Names.named("config")).toInstance(config);
		bind(ScheduledExecutorService.class).toInstance(new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
		bind(OkHttpClient.class).toInstance(okHttpClient);

		bind(MenuManager.class);
		bind(ChatMessageManager.class);
		bind(ItemManager.class);
		bind(Scheduler.class);

		bind(Gson.class).toInstance(RuneLiteAPI.GSON);

		bind(Callbacks.class).to(MinimalHooks.class);

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
