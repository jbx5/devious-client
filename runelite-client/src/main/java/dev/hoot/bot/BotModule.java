package dev.hoot.bot;

import com.google.inject.AbstractModule;
import dev.hoot.bot.account.GameAccount;
import dev.hoot.bot.managers.EventManager;
import dev.hoot.bot.managers.InteractManager;
import dev.hoot.bot.managers.ScriptManager;
import dev.hoot.bot.script.Events;
import dev.hoot.bot.script.ScriptEntry;
import dev.hoot.bot.script.ScriptMeta;
import dev.hoot.bot.script.paint.Paint;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Singleton
public class BotModule extends AbstractModule
{
	private final ConfigManager configManager;
	private final ScriptManager scriptManager;

	private static String acc = null;
	private static String pass = null;
	private static String auth = null;
	private static String script = null;
	private static Boolean noRender = null;
	private static String customCache = null;
	private static String[] scriptArgs = new String[0];

	public static final Map<String, File> CONFIG_FILES = new HashMap<>();

	@Inject
	public BotModule(
			ConfigManager configManager,
			EventBus eventBus,
			ScriptManager scriptManager,
			EventManager eventManager,
			InteractManager interactManager,
			Paint paint,
			OverlayManager overlayManager
	)
	{
		this.configManager = configManager;
		this.scriptManager = scriptManager;

		eventBus.register(eventManager);
		eventBus.register(interactManager);
		overlayManager.add(paint);
	}

	static
	{
		Bot.BOT_DIR.mkdirs();
		Bot.SCRIPTS_DIR.mkdirs();
		Bot.DATA_DIR.mkdirs();
	}

	public void initialize()
	{
//		client.changeMemoryMode(true);

		if (noRender != null)
		{
			configManager.setConfiguration("hoot", "renderOff", true);
		}
	}

	public void quickLaunch()
	{
		if (acc != null && pass != null)
		{
			Bot.gameAccount = new GameAccount(acc, pass);

			if (auth != null)
			{
				Bot.gameAccount.setAuth(auth);
			}
		}

		if (script != null)
		{
			ScriptEntry quickStartScript = scriptManager.loadScripts()
					.stream().filter(x -> x.getScriptClass().getAnnotation(ScriptMeta.class).value().equals(script))
					.findFirst()
					.orElse(null);
			if (quickStartScript == null)
			{
				return;
			}

			scriptManager.startScript(quickStartScript, scriptArgs);
		}
	}

	@Override
	protected void configure()
	{
		requestStaticInjection(
				Events.class
		);
	}

	public static OptionSet parseArgs(OptionParser parser, String... args)
	{
		var accInfo = parser
				.accepts("account")
				.withRequiredArg().ofType(String.class);
		var scriptInfo = parser
				.accepts("script")
				.withRequiredArg().ofType(String.class);
		parser.accepts("norender");
		var customCacheInfo = parser
				.accepts("customCache")
				.withRequiredArg().ofType(String.class);
		var scriptArgsInfo = parser
				.accepts("scriptArgs")
				.withRequiredArg().ofType(String.class);
		var options = parser.parse(args);
		if (options.has("account"))
		{
			var details = options.valueOf(accInfo).split(":");
			acc = details[0];
			pass = details[1];
			if (details.length >= 3)
			{
				auth = details[2];
			}
		}

		if (options.has("script"))
		{
			script = options.valueOf(scriptInfo);
		}

		if (options.has("norender"))
		{
			noRender = true;
		}

		if (options.has("customCache"))
		{
			customCache = options.valueOf(customCacheInfo);
		}

		if (options.has("scriptArgs"))
		{
			scriptArgs = options.valueOf(scriptArgsInfo).split(",");
		}

		if (customCache != null)
		{
			var customPath =
					System.getProperty("user.home") + "/hoot-cache/" + (customCache.equals("random") ? UUID.randomUUID()
							.toString() : customCache);
			System.setProperty("user.home", customPath);
			new File(customPath).mkdirs();
		}

		return options;
	}
}
