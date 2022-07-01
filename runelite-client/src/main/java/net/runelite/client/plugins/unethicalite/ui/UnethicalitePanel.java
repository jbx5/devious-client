package net.runelite.client.plugins.unethicalite.ui;

import lombok.extern.slf4j.Slf4j;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.ui.PluginPanel;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class UnethicalitePanel extends PluginPanel
{
	private final List<PanelContainer> containers = new ArrayList<>();
	private final JTabbedPane tabbedPane = new JTabbedPane();

	public UnethicalitePanel(Client client, UnethicaliteConfig config, ConfigManager configManager)
	{
		setLayout(new MigLayout());

		InteractionContainer interactionContainer = new InteractionContainer(config, configManager);

		containers.add(interactionContainer);

		add(tabbedPane);

		tabbedPane.addTab(interactionContainer.getTitle(), interactionContainer);
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged e)
	{
		if (!e.getGroup().equals(UnethicaliteConfig.CONFIG_GROUP))
		{
			return;
		}

		SwingUtilities.invokeLater(() -> containers.forEach(PanelContainer::rebuild));
	}
}
