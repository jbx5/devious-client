package net.unethicalite.client.managers;

import com.google.inject.Key;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.plugins.Plugins;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.minimal.MinimalClient;
import net.unethicalite.client.minimal.plugins.MinimalClassLoader;
import net.unethicalite.client.minimal.plugins.MinimalPluginChanged;
import net.unethicalite.client.minimal.plugins.MinimalPluginState;
import net.unethicalite.client.minimal.plugins.PluginEntry;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.jar.JarFile;

@Singleton
@Slf4j
public class MinimalPluginManager
{
	private static final File PLUGINS_DIR = new File(MinimalClient.CLIENT_DIR, "plugins");

	@Inject
	private UnethicaliteConfig minimalConfig;

	@Inject
	private ExecutorService executorService;

	@Inject
	private Client client;

	@Inject
	private PluginManager pluginManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private WorldService worldService;

	private PluginEntry pluginEntry = null;

	@Getter
	private Plugin plugin = null;

	@Getter
	private Config config = null;

	private boolean worldSet;

	public List<PluginEntry> loadPlugins()
	{
		return loadPlugins(PLUGINS_DIR);
	}

	public List<PluginEntry> loadPlugins(File dir)
	{
		List<PluginEntry> plugins = new ArrayList<>();

		try
		{
			File[] files = dir.listFiles();
			if (files == null)
			{
				return plugins;
			}
			for (File file : files)
			{
				if (file.isDirectory() || !file.getName().endsWith(".jar"))
				{
					continue;
				}

				try (JarFile jar = new JarFile(file);
					 MinimalClassLoader ucl = new MinimalClassLoader(new URL[]{file.toURI().toURL()}))
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
							if (!Plugin.class.isAssignableFrom(clazz)
									|| Modifier.isAbstract(clazz.getModifiers())
									|| clazz.getAnnotation(PluginDescriptor.class) == null)
							{
								continue;
							}

							Class<? extends Plugin> scriptClass = (Class<? extends Plugin>) clazz;
							plugins.add(
									new PluginEntry(
											scriptClass,
											scriptClass.getAnnotationsByType(PluginDescriptor.class)[0],
											jar.getManifest()
									)
							);
						}
						catch (Exception | NoClassDefFoundError e)
						{
							log.error("Failed to load class: {}", name, e);
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return plugins;
	}

	public void startPlugin(PluginEntry entry)
	{
		try
		{
			plugin = pluginManager.loadPlugins(List.of(entry.getScriptClass()), null)
					.stream().findFirst().orElse(null);
			if (plugin == null)
			{
				return;
			}
			log.debug("Loaded plugin: {}", plugin.getName());
			if (!Plugins.startPlugin(plugin))
			{
				return;
			}

			pluginEntry = entry;

			for (Key<?> key : plugin.getInjector().getBindings().keySet())
			{
				Class<?> type = key.getTypeLiteral().getRawType();
				if (Config.class.isAssignableFrom(type))
				{
					if (type.getPackageName().startsWith(plugin.getClass().getPackageName()))
					{
						config = (Config) plugin.getInjector().getInstance(key);
						configManager.setDefaultConfiguration(config, false);
					}
				}
			}

			client.getCallbacks().post(new MinimalPluginChanged(plugin, MinimalPluginState.STARTED));
		}
		catch (PluginInstantiationException e)
		{
			throw new RuntimeException(e);
		}
	}

	public void stopPlugin()
	{
		if (!Plugins.stopPlugin(plugin))
		{
			return;
		}

		client.getCallbacks().post(new MinimalPluginChanged(plugin, MinimalPluginState.STOPPED));
		plugin = null;
		pluginEntry = null;
		config = null;
	}

	public void restartPlugin()
	{
		String currentPlugin = pluginEntry.toString();
		stopPlugin();
		List<PluginEntry> plugins = loadPlugins();
		PluginEntry newEntry = plugins.stream()
				.filter(e -> e.toString().equals(currentPlugin))
				.findFirst().orElse(null);
		if (newEntry == null)
		{
			return;
		}
		startPlugin(newEntry);
	}

	public void pauseScript()
	{
		if (plugin == null || (!(plugin instanceof Script)))
		{
			return;
		}

		((Script) plugin).pauseScript();
	}

	public boolean isScriptRunning()
	{
		return plugin != null && plugin instanceof Script;
	}

	@Subscribe
	private void onMinimalPluginChanged(MinimalPluginChanged e)
	{
		log.info("Minimal Plugin state changed: {} [{}]", e.getPlugin().getName(), e.getState());

		if (e.getState() == MinimalPluginState.RESTARTING)
		{
			executorService.execute(this::restartPlugin);
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged e)
	{
		if (worldSet || e.getGameState() != GameState.LOGIN_SCREEN)
		{
			return;
		}

		Optional<Integer> worldArg = Optional.ofNullable(System.getProperty("cli.world")).map(Integer::parseInt);
		worldArg.ifPresent(this::setWorld);
		worldSet = true;
	}

	private void setWorld(int cliWorld)
	{
		int correctedWorld = cliWorld < 300 ? cliWorld + 300 : cliWorld;

		if (correctedWorld <= 300 || client.getWorld() == correctedWorld)
		{
			return;
		}

		final WorldResult worldResult = worldService.getWorlds();

		if (worldResult == null)
		{
			log.warn("Failed to lookup worlds.");
			return;
		}

		final World world = worldResult.findWorld(correctedWorld);

		if (world != null)
		{
			final net.runelite.api.World rsWorld = client.createWorld();
			rsWorld.setActivity(world.getActivity());
			rsWorld.setAddress(world.getAddress());
			rsWorld.setId(world.getId());
			rsWorld.setPlayerCount(world.getPlayers());
			rsWorld.setLocation(world.getLocation());
			rsWorld.setTypes(WorldUtil.toWorldTypes(world.getTypes()));

			client.changeWorld(rsWorld);
			log.debug("Applied new world {}", correctedWorld);
		}
		else
		{
			log.warn("World {} not found.", correctedWorld);
		}
	}
}
