package net.runelite.client.plugins.jrcbirdhouses;

import lombok.experimental.Delegate;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.ui.PluginPanel;

import net.runelite.client.plugins.jrcbirdhouses.model.BirdHouse;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JRCBirdHousesPanel extends PluginPanel
{
    @Delegate
    private final JRCBirdHousesPlugin plugin;

    private final JPanel container = new JPanel();
    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    JRCBirdHousesPanel(JRCBirdHousesPlugin plugin)
    {
        this.plugin = plugin;

        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        add(container);

        executorService.scheduleAtFixedRate(() -> SwingUtilities.invokeLater(this::rebuild), 0, 1, TimeUnit.SECONDS);
    }

    private void rebuild()
    {
        container.removeAll();

        container.add(new JLabel("Task: " + (getCurrentTask() != null ? getCurrentTask().getClass().getSimpleName() : "None")));

        for (BirdHouse birdHouse : getBirdHouses())
        {
            container.add(new JLabel(
                    birdHouse.getLocation().toString() + ": "
                            + (birdHouse.isComplete() ? "Complete" : birdHouse.getTimeLeft().toMinutesPart() + "m " + birdHouse.getTimeLeft().toSecondsPart() + "s")));
        }

        repaint();
        revalidate();
    }

    @Subscribe
    private void onPluginChanged(PluginChanged e)
    {
        if (e.getPlugin() == plugin)
        {
            executorService.shutdown();
        }
    }
}