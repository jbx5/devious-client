package net.unethicalite.client.minimal.ui;

import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.plugins.unethicalite.ui.UnethicalitePanel;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.components.colorpicker.ColorPickerManager;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.devtools.EntityRenderer;
import net.unethicalite.client.devtools.scriptinspector.ScriptInspector;
import net.unethicalite.client.devtools.varinspector.VarInspector;
import net.unethicalite.client.devtools.widgetinspector.WidgetInspector;
import net.unethicalite.client.managers.MinimalFpsManager;
import net.unethicalite.client.managers.MinimalPluginManager;
import net.unethicalite.client.minimal.config.DisableRenderCallbacks;
import net.unethicalite.client.minimal.config.MinimalConfigPanel;
import net.unethicalite.client.minimal.plugins.MinimalPluginChanged;
import net.unethicalite.client.minimal.plugins.MinimalPluginState;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

@Singleton
public class MinimalToolbar extends JMenuBar
{
	private static final DisableRenderCallbacks DISABLE_RENDERING = new DisableRenderCallbacks();

	private final VarInspector varInspector;
	private final WidgetInspector widgetInspector;
	private final ScriptInspector scriptInspector;
	private final EntityRenderer entityRenderer;
	private final MinimalPluginManager minimalPluginManager;
	private final MinimalPluginsPanel minimalPluginsPanel;
	private final ConfigManager configManager;
	private final EventBus eventBus;
	private final UnethicaliteConfig unethicaliteConfig;
	private final RuneLiteConfig runeLiteConfig;
	private final Client client;
	private final MinimalFpsManager minimalFpsManager;
	private final ColorPickerManager colorPickerManager;

	private JMenuItem pluginConfig;
	private JMenuItem stopPlugin;
	private JMenuItem pauseScript;
	private JMenuItem restartPlugin;
	private JRadioButton rendering;

	private MinimalConfigPanel unethicaliteConfigPanel;
	private MinimalConfigPanel clientConfigPanel;

	@Inject
	public MinimalToolbar(VarInspector varInspector, WidgetInspector widgetInspector, ScriptInspector scriptInspector,
						  EntityRenderer entityRenderer, MinimalPluginManager minimalPluginManager, MinimalPluginsPanel minimalPluginsPanel,
						  ConfigManager configManager, EventBus eventBus, UnethicaliteConfig unethicaliteConfig,
						  RuneLiteConfig runeLiteConfig, Client client, MinimalFpsManager minimalFpsManager, ColorPickerManager colorPickerManager)
	{
		this.varInspector = varInspector;
		this.widgetInspector = widgetInspector;
		this.scriptInspector = scriptInspector;
		this.entityRenderer = entityRenderer;
		this.minimalPluginManager = minimalPluginManager;
		this.minimalPluginsPanel = minimalPluginsPanel;
		this.configManager = configManager;
		this.eventBus = eventBus;
		this.unethicaliteConfig = unethicaliteConfig;
		this.runeLiteConfig = runeLiteConfig;
		this.client = client;
		this.minimalFpsManager = minimalFpsManager;
		this.colorPickerManager = colorPickerManager;
	}

	public void init()
	{
		configManager.setDefaultConfiguration(unethicaliteConfig, false);
		configManager.setDefaultConfiguration(runeLiteConfig, false);

		PluginConfigurationDescriptor minimal = new PluginConfigurationDescriptor(
				"Unethicalite",
				"Unethicalite settings",
				new String[]{},
				unethicaliteConfig,
				configManager.getConfigDescriptor(unethicaliteConfig)
		);
		unethicaliteConfigPanel = new MinimalConfigPanel(configManager, colorPickerManager, eventBus);
		unethicaliteConfigPanel.init(minimal);

		PluginConfigurationDescriptor cl = new PluginConfigurationDescriptor(
				"Client",
				"Client settings",
				new String[]{},
				runeLiteConfig,
				configManager.getConfigDescriptor(runeLiteConfig)
		);
		clientConfigPanel = new MinimalConfigPanel(configManager, colorPickerManager, eventBus);
		clientConfigPanel.init(cl);

		UnethicalitePanel unethicalitePanel = new UnethicalitePanel(client, unethicaliteConfig, configManager);
		eventBus.register(unethicalitePanel);

		JFrame interactWindow = new JFrame();
		interactWindow.setVisible(false);
		interactWindow.getContentPane().setBackground(ColorScheme.DARK_GRAY_COLOR);
		interactWindow.setAlwaysOnTop(true);
		interactWindow.setLayout(new MigLayout());
		interactWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		interactWindow.add(unethicalitePanel);
		interactWindow.pack();

		SwingUtilities.invokeLater(() ->
		{
			JMenuItem scripts = new JMenuItem("Plugins");
			scripts.addActionListener(e ->
			{
				minimalPluginsPanel.open();
			});
			scripts.setMaximumSize(scripts.getPreferredSize());
			add(scripts);

			JMenu settingsMenu = new JMenu("Settings");
			JMenuItem unethicaliteSettings = new JMenuItem("Unethicalite Settings");
			unethicaliteSettings.addActionListener(e ->
			{
				unethicaliteConfigPanel.open();
			});
			settingsMenu.add(unethicaliteSettings);

			JMenuItem interactSettings = new JMenuItem("Interaction Settings");
			interactSettings.addActionListener(e ->
			{
				interactWindow.setVisible(!interactWindow.isVisible());
			});
			settingsMenu.add(interactSettings);

			JMenuItem clientSettings = new JMenuItem("Client Settings");
			clientSettings.addActionListener(e ->
			{
				clientConfigPanel.open();
			});
			settingsMenu.add(clientSettings);
			add(settingsMenu);

			rendering = new JRadioButton("Toggle rendering");
			rendering.addActionListener(e -> configManager.setConfiguration("unethicalite", "renderOff",
					rendering.isSelected()));
			JMenu debug = new JMenu("Debug");
			rendering.setSelected(configManager.getConfiguration("unethicalite", "renderOff", Boolean.class));
			add(rendering);

			JRadioButton mouseDebug = new JRadioButton("Mouse debug");
			mouseDebug.addActionListener(e -> configManager.setConfiguration("entityinspector", "drawMouse",
					mouseDebug.isSelected()));
			debug.add(mouseDebug);

			JRadioButton menuActionDebug = new JRadioButton("MenuAction debug");
			menuActionDebug.addActionListener(e -> configManager.setConfiguration("entityinspector", "debugMenuAction", menuActionDebug.isSelected()));
			debug.add(menuActionDebug);

			JRadioButton dialogDebug = new JRadioButton("Dialog debug");
			dialogDebug.addActionListener(e -> configManager.setConfiguration("entityinspector", "debugDialogs", dialogDebug.isSelected()));
			debug.add(dialogDebug);

			JRadioButton collisionDebug = new JRadioButton("Collision map");
			collisionDebug.addActionListener(e -> entityRenderer.setCollisionMap(!entityRenderer.isCollisionMap()));
			debug.add(collisionDebug);

			JRadioButton pathDebug = new JRadioButton("Draw path");
			pathDebug.addActionListener(e -> entityRenderer.setPath(!entityRenderer.isPath()));
			debug.add(pathDebug);

			add(debug);

			JMenu developer = new JMenu("Developer");

			JMenuItem varInspectorItem = new JMenuItem("Var Inspector");
			varInspectorItem.addActionListener(e -> varInspector.open());
			developer.add(varInspectorItem);

			JMenuItem widgetInspectorItem = new JMenuItem("Widget Inspector");
			widgetInspectorItem.addActionListener(e -> widgetInspector.open());
			developer.add(widgetInspectorItem);

			JMenuItem scriptInspectorItem = new JMenuItem("Script Inspector");
			scriptInspectorItem.addActionListener(e -> scriptInspector.open());
			developer.add(scriptInspectorItem);

			JRadioButton gameObjectsBtn = new JRadioButton("Game Objects");
			gameObjectsBtn.addActionListener(e -> entityRenderer.setGameObjects(!entityRenderer.isGameObjects()));
			JRadioButton wallObjectsBtn = new JRadioButton("Wall Objects");
			wallObjectsBtn.addActionListener(e -> entityRenderer.setWallObjects(!entityRenderer.isWallObjects()));
			JRadioButton decorativeObjectsBtn = new JRadioButton("Decorative Objects");
			decorativeObjectsBtn.addActionListener(e -> entityRenderer.setDecorativeObjects(!entityRenderer.isDecorativeObjects()));
			JRadioButton groundObjectsBtn = new JRadioButton("Ground Objects");
			groundObjectsBtn.addActionListener(e -> entityRenderer.setGroundObjects(!entityRenderer.isGroundObjects()));
			JRadioButton npcsBtn = new JRadioButton("NPCs");
			npcsBtn.addActionListener(e -> entityRenderer.setNpcs(!entityRenderer.isNpcs()));
			JRadioButton playersBtn = new JRadioButton("Players");
			playersBtn.addActionListener(e -> entityRenderer.setPlayers(!entityRenderer.isPlayers()));
			JRadioButton tileItemsBtn = new JRadioButton("Tile Items");
			tileItemsBtn.addActionListener(e -> entityRenderer.setTileItems(!entityRenderer.isTileItems()));
			JRadioButton inventoryBtn = new JRadioButton("Inventory");
			inventoryBtn.addActionListener(e -> entityRenderer.setInventory(!entityRenderer.isInventory()));
			JRadioButton projectilesBtn = new JRadioButton("Projectiles");
			projectilesBtn.addActionListener(e -> entityRenderer.setProjectiles(!entityRenderer.isProjectiles()));
			JRadioButton tileLocationBtn = new JRadioButton("Tile Location");
			tileLocationBtn.addActionListener(e -> entityRenderer.setTileLocation(!entityRenderer.isTileLocation()));

			developer.add(gameObjectsBtn);
			developer.add(wallObjectsBtn);
			developer.add(decorativeObjectsBtn);
			developer.add(groundObjectsBtn);
			developer.add(npcsBtn);
			developer.add(playersBtn);
			developer.add(tileItemsBtn);
			developer.add(inventoryBtn);
			developer.add(projectilesBtn);
			developer.add(tileLocationBtn);
			add(developer);

			pluginConfig = new JMenuItem("Plugin config");
			pluginConfig.addActionListener(e ->
			{
				if (minimalPluginManager.getPlugin() != null && minimalPluginManager.getConfig() != null)
				{
					MinimalConfigPanel panel = new MinimalConfigPanel(
							configManager,
							colorPickerManager,
							eventBus
					);

					panel.init(
							new PluginConfigurationDescriptor(
									minimalPluginManager.getPlugin().getName(),
									"",
									new String[]{},
									minimalPluginManager.getConfig(),
									configManager.getConfigDescriptor(minimalPluginManager.getConfig())
							)
					);

					panel.open();
				}
			});
			pluginConfig.setVisible(false);
			pluginConfig.setMaximumSize(pluginConfig.getPreferredSize());
			add(pluginConfig);

			pauseScript = new JMenuItem("Pause script");
			pauseScript.addActionListener(e ->
			{
				if (minimalPluginManager.getPlugin() != null)
				{
					minimalPluginManager.pauseScript();
				}
			});
			pauseScript.setVisible(false);
			pauseScript.setMaximumSize(pauseScript.getPreferredSize());
			add(pauseScript);

			stopPlugin = new JMenuItem("Stop script");
			stopPlugin.addActionListener(e ->
			{
				if (minimalPluginManager.getPlugin() != null)
				{
					minimalPluginManager.stopPlugin();
				}
			});
			stopPlugin.setVisible(false);
			stopPlugin.setMaximumSize(stopPlugin.getPreferredSize());
			add(stopPlugin);

			restartPlugin = new JMenuItem("Restart script");
			restartPlugin.addActionListener(e ->
			{
				if (minimalPluginManager.getPlugin() != null)
				{
					minimalPluginManager.restartPlugin();
				}
			});
			restartPlugin.setVisible(false);
			restartPlugin.setMaximumSize(restartPlugin.getPreferredSize());
			add(restartPlugin);
		});
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("unethicalite"))
		{
			return;
		}

		switch (event.getKey())
		{
			case "renderOff":
				if (rendering != null)
				{
					SwingUtilities.invokeLater(() -> rendering.setSelected(Boolean.parseBoolean(event.getNewValue())));
				}

				break;

			case "fpsLimit":
				minimalFpsManager.reloadConfig(unethicaliteConfig.fpsLimit());
				break;
		}
	}

	@Subscribe
	private void onMinimalPluginChanged(MinimalPluginChanged event)
	{
		pluginConfig.setVisible(event.getState() == MinimalPluginState.STARTED || event.getState() == MinimalPluginState.PAUSED);
		stopPlugin.setVisible(event.getState() == MinimalPluginState.STARTED || event.getState() == MinimalPluginState.PAUSED);
		pauseScript.setVisible(event.getPlugin() instanceof Script &&
				(event.getState() == MinimalPluginState.STARTED || event.getState() == MinimalPluginState.PAUSED)
		);
		restartPlugin.setVisible(event.getState() == MinimalPluginState.STARTED || event.getState() == MinimalPluginState.PAUSED);
		if (event.getState() == MinimalPluginState.STARTED)
		{
			pluginConfig.setText(event.getPlugin().getName());
		}

		if (event.getState() == MinimalPluginState.PAUSED)
		{
			pauseScript.setText("Resume script");
		}
		else
		{
			pauseScript.setText("Pause script");
		}
	}
}
