package dev.hoot.bot.managers;

import dev.hoot.bot.Bot;
import dev.hoot.bot.script.BotScript;
import dev.hoot.bot.script.ScriptEntry;
import dev.hoot.bot.script.ScriptMeta;
import dev.hoot.bot.script.ScriptThread;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;

@Singleton
@Slf4j
public class ScriptManager
{
	private String[] args = null;
	private ScriptEntry scriptEntry = null;
	private ScriptThread scriptThread = null;
	private BotScript botScript = null;

	public List<ScriptEntry> loadScripts()
	{
		return loadScripts(Bot.SCRIPTS_DIR);
	}

	public List<ScriptEntry> loadScripts(File dir)
	{
		List<ScriptEntry> scripts = new ArrayList<>();
		try
		{
			File[] files = dir.listFiles();
			if (files == null)
			{
				return scripts;
			}
			for (File file : files)
			{
				if (file.isDirectory() || !file.getName().endsWith(".jar"))
				{
					continue;
				}

				JarFile jar = new JarFile(file);
				try (ScriptClassLoader ucl = new ScriptClassLoader(new URL[]{file.toURI().toURL()}))
				{
					var elems = jar.entries();

					while (elems.hasMoreElements())
					{
						var entry = elems.nextElement();
						if (!entry.getName().endsWith(".class"))
						{
							continue;
						}

						String name = entry.getName();
						name = name.substring(0, name.length() - ".class".length())
								.replace('/', '.');

						try
						{
							var clazz = ucl.loadClass(name);
							if (!BotScript.class.isAssignableFrom(clazz)
									|| Modifier.isAbstract(clazz.getModifiers())
									|| clazz.getAnnotation(ScriptMeta.class) == null)
							{
								continue;
							}

							Class<? extends BotScript> scriptClass = (Class<? extends BotScript>) clazz;
							scripts.add(new ScriptEntry(scriptClass, scriptClass.getAnnotationsByType(ScriptMeta.class)[0]));
						}
						catch (Exception | NoClassDefFoundError e)
						{
							log.error("Failed to load class: " + name, e.getMessage());
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return scripts;
	}

	public void startScript(ScriptEntry entry, String... scriptArgs)
	{
		if (scriptThread != null && scriptThread.isAlive())
		{
			return;
		}

		try
		{
			scriptThread = new ScriptThread(entry, scriptArgs);
			scriptThread.start();
			botScript = scriptThread.getScript();
			args = scriptArgs;
			scriptEntry = entry;
		}
		catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}

	public void stopScript()
	{
		if (scriptThread == null || botScript == null)
		{
			return;
		}

		while (scriptThread.isAlive() || botScript.isRunning())
		{
			botScript.stopLooping();
		}

		botScript = null;
		scriptThread = null;
	}

	public void restartScript()
	{
		while (scriptThread != null)
		{
			stopScript();
		}

		if (args != null && scriptEntry != null)
		{
			ScriptEntry reloaded = loadScripts().stream()
					.filter(x -> x.getMeta().equals(scriptEntry.getMeta()))
					.findFirst()
					.orElse(null);
			startScript(reloaded, args);
		}
	}

	public void pauseScript()
	{
		if (botScript == null)
		{
			return;
		}

		botScript.pauseScript();
	}

	public boolean isScriptRunning()
	{
		return scriptThread != null && scriptThread.isAlive() &&
				botScript != null && botScript.isRunning() && !botScript.isPaused();
	}

	public BotScript getBotScript()
	{
		return botScript;
	}
}
