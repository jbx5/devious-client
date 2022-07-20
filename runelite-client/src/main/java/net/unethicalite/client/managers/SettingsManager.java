package net.unethicalite.client.managers;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import net.unethicalite.client.minimal.config.DisableRenderCallbacks;
import net.unethicalite.client.minimal.plugins.PluginEntry;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

@Slf4j
public class SettingsManager
{
	private static final DisableRenderCallbacks DISABLE_RENDERING = new DisableRenderCallbacks();

	private final Client client;
	private final OptionSet clientArgs;
	private final ConfigManager configManager;

	private boolean initializedArgs;

	@Inject
	public SettingsManager(
			Client client,
			@Named("clientArgs")
			OptionSet clientArgs,
			EventBus eventBus,
			ConfigManager configManager
	)
	{
		this.client = client;
		this.clientArgs = clientArgs;
		this.configManager = configManager;
		eventBus.register(this);
	}

	public static OptionSet parseArgs(OptionParser parser, String... args)
	{
		var accInfo = parser
				.accepts("account")
				.withRequiredArg().ofType(String.class);

		var cacheDirInfo = parser
				.accepts("cache-dir")
				.withOptionalArg().ofType(String.class);

		parser.accepts("minimal");
		parser.accepts("norender");

		parser.accepts("script")
				.withRequiredArg().ofType(String.class);

		parser.accepts("scriptArgs")
				.withRequiredArg().ofType(String.class);

		var options = parser.parse(args);

		if (options.has("account"))
		{
			var details = options.valueOf(accInfo).split(":");
			GameAccount gameAccount = new GameAccount(details[0], details[1]);
			if (details.length >= 3)
			{
				gameAccount.setAuth(details[2]);
			}

			Game.setGameAccount(gameAccount);
		}

		if (options.has("scriptArgs"))
		{
			Static.setScriptArgs(((String) options.valueOf("scriptArgs")).split(","));
		}

		if (options.has("cache-dir"))
		{
			var cacheDir = options.valueOf(cacheDirInfo);

			if (cacheDir != null)
			{
				System.setProperty("unethicalite.cache-dir", cacheDir);
			}
			else
			{
				var acc = Game.getGameAccount();
				if (acc != null)
				{
					System.setProperty("unethicalite.cache-dir", acc.getUsername());
				}
				else
				{
					System.setProperty("unethicalite.cache-dir", UUID.randomUUID().toString());
				}
			}
		}

		return options;
	}

	public static void quickLaunch(MinimalPluginManager minimalPluginManager, OptionSet options)
	{
		if (options.has("script"))
		{
			String script = (String) options.valueOf("script");

			PluginEntry quickStartScript = minimalPluginManager.loadPlugins()
					.stream().filter(x -> x.getScriptClass().getAnnotation(PluginDescriptor.class).name().equals(script))
					.findFirst()
					.orElse(null);
			if (quickStartScript == null || !quickStartScript.isScript())
			{
				return;
			}

			minimalPluginManager.startPlugin(quickStartScript);
		}
	}

	private void initArgs()
	{
		if (clientArgs.has("norender"))
		{
			configManager.setConfiguration("unethicalite", "renderOff", true);
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged e)
	{
		if (e.getGameState() == GameState.LOGIN_SCREEN && !initializedArgs)
		{
			initArgs();
			initializedArgs = true;
		}
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("unethicalite"))
		{
			return;
		}

		if ("renderOff".equals(event.getKey()))
		{
			boolean enabled = Boolean.parseBoolean(event.getNewValue());
			client.setLowCpu(enabled);

			if (enabled)
			{
				client.setDrawCallbacks(DISABLE_RENDERING);
			}
			else
			{
				client.setDrawCallbacks(null);
			}
		}
	}
}
