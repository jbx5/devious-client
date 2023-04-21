package net.runelite.client.plugins.jrczulrah.framework;

import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.plugins.Task;
import net.runelite.client.plugins.jrczulrah.data.phases.ZulrahCycle;

@Getter
@Setter
public abstract class ZulrahTask implements Task
{
    @Inject
    private JRCZulrahConfig config;
    @Provides
    JRCZulrahConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(JRCZulrahConfig.class);
    }
    private ZulrahCycle zulrahCycle;
    private WorldPoint origin;

    public ZulrahTask()
    {
        this.config = config;
    }

    protected boolean isCloud(WorldPoint position)
    {
        for (TileObject cloud : TileObjects.getSurrounding(
                Players.getLocal().getWorldLocation(), 10, 11700))
        {
            if (cloud instanceof GameObject)
            {
                WorldArea area = ((GameObject) cloud).getWorldArea();
                if (area.contains(position))
                {
                    return true;
                }
            }
        }

        return false;
    }

    protected boolean inCloud()
    {
        return isCloud(Players.getLocal().getWorldLocation());
    }
}