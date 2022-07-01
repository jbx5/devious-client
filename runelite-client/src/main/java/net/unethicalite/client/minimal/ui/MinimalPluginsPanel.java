package net.unethicalite.client.minimal.ui;

import net.runelite.api.Client;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.client.managers.MinimalPluginManager;
import net.unethicalite.client.minimal.MinimalModule;
import net.unethicalite.client.minimal.plugins.PluginEntry;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MinimalPluginsPanel
{

	@Inject
	private Client client;

	@Inject
	private MinimalPluginManager minimalPluginManager;

	private JList<PluginEntry> pluginList;
	private JFrame frame;

	public void open()
	{
		if (frame == null)
		{
			frame = new JFrame("Scripts");
			frame.setAlwaysOnTop(true);
			pluginList = new JList<>();
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frame.setPreferredSize(new Dimension(500, 300));

			loadScripts();

			//north
			Panel northPanel = new Panel(new GridLayout(1, 0));

			//startButton
			JButton startButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "play_arrow_white_18x18.png")));
			startButton.addActionListener(e ->
			{
				if (minimalPluginManager.isScriptRunning())
				{
					minimalPluginManager.stopPlugin();
				}
				PluginEntry selected = pluginList.getSelectedValue();
				minimalPluginManager.startPlugin(selected);
				frame.setVisible(false);
			});
			northPanel.add(startButton);

			//pauseButton
			JButton pauseButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "pause_white_18x18.png")));
			pauseButton.addActionListener(e -> minimalPluginManager.pauseScript());
			northPanel.add(pauseButton);

			//stopButton
			JButton stopButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "stop_white_18x18.png")));
			stopButton.addActionListener(e ->
			{
				minimalPluginManager.stopPlugin();
				loadScripts();
			});
			northPanel.add(stopButton);

			//refreshButton
			JButton refreshButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "reset.png")));
			refreshButton.addActionListener(e -> reloadScript());
			northPanel.add(refreshButton);

			frame.add(northPanel, BorderLayout.NORTH);

			//center
			Panel centerPanel = new Panel(new GridLayout(0, 1));

			//scriptScrollPane
			JScrollPane scriptScrollPane = new JScrollPane(pluginList);
			scriptScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			centerPanel.add(scriptScrollPane);
			frame.setLocationRelativeTo(client.getCanvas());
			frame.add(centerPanel, BorderLayout.CENTER);
			frame.pack();
		}

		loadScripts();
		frame.setVisible(!frame.isVisible());
	}

	public List<PluginEntry> loadScripts()
	{
		List<PluginEntry> scriptListEntries = new ArrayList<>(minimalPluginManager.loadPlugins());
		pluginList.setListData(scriptListEntries.toArray(new PluginEntry[0]));
		return scriptListEntries;
	}

	public void reloadScript()
	{
		loadScripts();
		minimalPluginManager.restartPlugin();
	}
}
