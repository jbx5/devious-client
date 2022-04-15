package dev.unethicalite.client.ui;

import dev.unethicalite.client.MinimalModule;
import dev.unethicalite.managers.ScriptManager;
import dev.unethicalite.client.script.ScriptEntry;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ScriptPanel
{

	@Inject
	private Client client;

	@Inject
	private ScriptManager scriptManager;

	private JList<ScriptEntry> scriptList;
	private JFrame frame;

	public void open()
	{
		if (frame == null)
		{
			frame = new JFrame("Scripts");
			frame.setAlwaysOnTop(true);
			scriptList = new JList<>();
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frame.setPreferredSize(new Dimension(500, 300));

			loadScripts();

			//north
			Panel northPanel = new Panel(new GridLayout(1, 0));

			//south
			JTextField args = new JTextField();
			JPanel argsPanel = new JPanel(new MigLayout("", "[][grow, fill]"));
			frame.add(argsPanel, BorderLayout.SOUTH);
			argsPanel.add(new JLabel("Script args:"));
			argsPanel.add(args, BorderLayout.CENTER);

			//startButton
			JButton startButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "play_arrow_white_18x18.png")));
			startButton.addActionListener(e ->
			{
				scriptManager.startScript(scriptList.getSelectedValue(), args.getText().isBlank() ? new String[]{} : args.getText().split(","));
				frame.setVisible(false);
			});
			northPanel.add(startButton);

			//pauseButton
			JButton pauseButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "pause_white_18x18.png")));
			pauseButton.addActionListener(e -> scriptManager.pauseScript());
			northPanel.add(pauseButton);

			//stopButton
			JButton stopButton = new JButton(new ImageIcon(ImageUtil.loadImageResource(MinimalModule.class, "stop_white_18x18.png")));
			stopButton.addActionListener(e ->
			{
				scriptManager.stopScript();
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
			JScrollPane scriptScrollPane = new JScrollPane(scriptList);
			scriptScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			centerPanel.add(scriptScrollPane);
			frame.setLocationRelativeTo(client.getCanvas());
			frame.add(centerPanel, BorderLayout.CENTER);
			frame.pack();
		}

		loadScripts();
		frame.setVisible(!frame.isVisible());
	}

	public List<ScriptEntry> loadScripts()
	{
		List<ScriptEntry> scriptListEntries = new ArrayList<>(scriptManager.loadScripts());
		scriptList.setListData(scriptListEntries.toArray(new ScriptEntry[0]));
		return scriptListEntries;
	}

	public void reloadScript()
	{
		loadScripts();
		scriptManager.restartScript();
	}
}
