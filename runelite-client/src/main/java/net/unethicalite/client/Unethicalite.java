package net.unethicalite.client;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.managers.MinimalPluginManager;
import net.unethicalite.client.minimal.MinimalClient;
import net.unethicalite.client.minimal.plugins.PluginEntry;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

import static net.runelite.client.RuneLite.OPENOSRS;

@Slf4j
public class Unethicalite
{
	public static final File CLIENT_DIR = new File(System.getProperty("user.home"), ".openosrs");

	public static void main(String[] args) throws Exception
	{
		if (Arrays.asList(args).contains("--minimal"))
		{
			System.setProperty("unethicalite.minimal", "true");
			MinimalClient.main(args);
		}
		else
		{
			RuneLite.main(args);
		}
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

	public static void initArgs(ConfigManager configManager, OptionSet options)
	{
		if (options.has("norender"))
		{
			log.debug("No render");
			configManager.setConfiguration("unethicalite", "renderOff", true);
		}
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

	private static String getCacheDir()
	{
		var dir = System.getProperty("unethicalite.cache-dir");
		if (dir != null)
		{
			return dir;
		}

		return OPENOSRS;
	}

	public static File getCacheDirectory()
	{
		var dir = getCacheDir();
		if (Objects.equals(dir, OPENOSRS))
		{
			return new File(CLIENT_DIR, "jagexcache");
		}

		var cacheDirs = new File(CLIENT_DIR, "custom-cache");
		return new File(cacheDirs, dir);
	}
}
