package dev.hoot.bot.ui;

import dev.hoot.bot.config.BotConfig;
import dev.hoot.bot.config.ConfigPanel;
import dev.hoot.bot.config.ConfigurationDescriptor;
import dev.hoot.bot.devtools.EntityRenderer;
import dev.hoot.bot.devtools.scriptinspector.ScriptInspector;
import dev.hoot.bot.devtools.varinspector.VarInspector;
import dev.hoot.bot.devtools.widgetinspector.WidgetInspector;
import dev.hoot.bot.managers.ScriptManager;
import dev.hoot.bot.managers.interaction.InteractionConfig;
import dev.hoot.bot.script.events.ScriptChanged;
import dev.hoot.bot.script.events.ScriptState;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;

@Singleton
public class BotToolbar extends JMenuBar
{
	private final VarInspector varInspector;
	private final WidgetInspector widgetInspector;
	private final ScriptInspector scriptInspector;
	private final EntityRenderer entityRenderer;
	private final ScriptManager scriptManager;
	private final ScriptPanel scriptPanel;
	private final ConfigManager configManager;
	private final EventBus eventBus;
	private final BotConfig botConfig;
	private final InteractionConfig interactConfig;
	private final RuneLiteConfig runeLiteConfig;
	private final Client client;

	private JMenuItem stopScript;
	private JMenuItem pauseScript;
	private JMenuItem restartScript;
	private JRadioButton rendering;

	private ConfigPanel botConfigPanel;
	private ConfigPanel interactConfigPanel;
	private ConfigPanel clientConfigPanel;

	@Inject
	public BotToolbar(VarInspector varInspector, WidgetInspector widgetInspector, ScriptInspector scriptInspector,
					  EntityRenderer entityRenderer, ScriptManager scriptManager, ScriptPanel scriptPanel,
					  ConfigManager configManager, EventBus eventBus, BotConfig botConfig, InteractionConfig interactConfig,
					  RuneLiteConfig runeLiteConfig, Client client)
	{
		this.varInspector = varInspector;
		this.widgetInspector = widgetInspector;
		this.scriptInspector = scriptInspector;
		this.entityRenderer = entityRenderer;
		this.scriptManager = scriptManager;
		this.scriptPanel = scriptPanel;
		this.configManager = configManager;
		this.eventBus = eventBus;
		this.botConfig = botConfig;
		this.interactConfig = interactConfig;
		this.runeLiteConfig = runeLiteConfig;
		this.client = client;
	}

	public void init()
	{
		configManager.setDefaultConfiguration(botConfig, false);
		configManager.setDefaultConfiguration(interactConfig, false);
		configManager.setDefaultConfiguration(runeLiteConfig, false);

		ConfigurationDescriptor bot = new ConfigurationDescriptor(
				"Bot",
				"Bot settings",
				configManager.getConfigDescriptor(botConfig)
		);
		botConfigPanel = new ConfigPanel(configManager, eventBus, bot, client);
		botConfigPanel.init();

		ConfigurationDescriptor interact = new ConfigurationDescriptor(
				"Interact",
				"Interact settings",
				configManager.getConfigDescriptor(interactConfig)
		);
		interactConfigPanel = new ConfigPanel(configManager, eventBus, interact, client);
		interactConfigPanel.init();

		ConfigurationDescriptor cl = new ConfigurationDescriptor(
				"Client",
				"Client settings",
				configManager.getConfigDescriptor(runeLiteConfig)
		);
		clientConfigPanel = new ConfigPanel(configManager, eventBus, cl, client);
		clientConfigPanel.init();

		SwingUtilities.invokeLater(() ->
		{
			JMenuItem scripts = new JMenuItem("Scripts");
			scripts.addActionListener(e ->
			{
				scriptPanel.open();
			});
			scripts.setMaximumSize(scripts.getPreferredSize());
			add(scripts);

			JMenu settingsMenu = new JMenu("Settings");
			JMenuItem botSettings = new JMenuItem("Bot Settings");
			botSettings.addActionListener(e ->
			{
				botConfigPanel.open();
			});
			settingsMenu.add(botSettings);

			JMenuItem interactSettings = new JMenuItem("Interact Settings");
			interactSettings.addActionListener(e ->
			{
				interactConfigPanel.open();
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
			rendering.addActionListener(e -> configManager.setConfiguration("hoot", "renderOff", rendering.isSelected()));
			JMenu debug = new JMenu("Debug");
			rendering.setSelected(configManager.getConfiguration("hoot", "renderOff", Boolean.class));
			add(rendering);

			JRadioButton mouseDebug = new JRadioButton("Mouse debug");
			mouseDebug.addActionListener(e -> configManager.setConfiguration("interaction", "drawMouse", mouseDebug.isSelected()));
			debug.add(mouseDebug);

			JRadioButton menuActionDebug = new JRadioButton("MenuAction debug");
			menuActionDebug.addActionListener(e -> configManager.setConfiguration("interaction", "debugInteractions", menuActionDebug.isSelected()));
			debug.add(menuActionDebug);

			JRadioButton dialogDebug = new JRadioButton("Dialog debug");
			dialogDebug.addActionListener(e -> configManager.setConfiguration("interaction", "debugDialogs", dialogDebug.isSelected()));
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

			pauseScript = new JMenuItem("Pause script");
			pauseScript.addActionListener(e ->
			{
				if (scriptManager.getBotScript() != null)
				{
					scriptManager.pauseScript();
				}
			});
			pauseScript.setVisible(false);
			pauseScript.setMaximumSize(pauseScript.getPreferredSize());
			add(pauseScript);

			stopScript = new JMenuItem("Stop script");
			stopScript.addActionListener(e ->
			{
				if (scriptManager.getBotScript() != null)
				{
					scriptManager.stopScript();
				}
			});
			stopScript.setVisible(false);
			stopScript.setMaximumSize(stopScript.getPreferredSize());
			add(stopScript);

			restartScript = new JMenuItem("Restart script");
			restartScript.addActionListener(e ->
			{
				if (scriptManager.getBotScript() != null)
				{
					scriptManager.restartScript();
				}
			});
			restartScript.setVisible(false);
			restartScript.setMaximumSize(restartScript.getPreferredSize());
			add(restartScript);
		});
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("hoot")
				&& event.getKey().equals("renderOff")
				&& rendering != null
		)
		{
			SwingUtilities.invokeLater(() -> rendering.setSelected(Boolean.parseBoolean(event.getNewValue())));
		}
	}

	@Subscribe
	private void onScriptChanged(ScriptChanged event)
	{
		stopScript.setVisible(event.getState() == ScriptState.STARTED || event.getState() == ScriptState.PAUSED);
		pauseScript.setVisible(event.getState() == ScriptState.STARTED || event.getState() == ScriptState.PAUSED);
		restartScript.setVisible(event.getState() == ScriptState.STARTED || event.getState() == ScriptState.PAUSED);

		if (event.getState() == ScriptState.PAUSED)
		{
			pauseScript.setText("Resume script");
		}
		else
		{
			pauseScript.setText("Pause script");
		}
	}
}
