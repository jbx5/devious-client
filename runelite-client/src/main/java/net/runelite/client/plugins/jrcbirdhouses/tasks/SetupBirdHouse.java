package net.runelite.client.plugins.jrcbirdhouses.tasks;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesConfig;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesPlugin;

import javax.inject.Inject;

@Slf4j
public class SetupBirdHouse extends BirdHouseTask
{
    @Inject
    private JRCBirdHousesConfig config;

    public SetupBirdHouse(JRCBirdHousesPlugin context)
    {
        super(context);
    }

    @Override
    public boolean validate()
    {
        return getNextBirdHouse().isPresent();
    }

    @Override
    public int execute()
    {
        getNextBirdHouse().ifPresent(birdHouse ->
        {
            switch (birdHouse.getState())
            {
                case EMPTY:
                case UNKNOWN:
                    Item birdHouseItem = Inventory.getFirst(config.type().getItemId());
                    if (birdHouseItem == null)
                    {
                        Item logs = Inventory.getFirst(config.type().getLogItemId());
                        Item chisel = Inventory.getFirst("Chisel");
                        if (logs != null && chisel != null)
                        {
                            logs.useOn(chisel);
                        }
                        else
                        {
                            log.error("Logs & Chisel not found");
                        }
                    }
                    else
                    {
                        TileObject spot = TileObjects.getFirstAt(birdHouse.getWorldPoint(), "Space");
                        if (spot == null)
                        {
                            log.error("Bird house spot was null {}", birdHouse.getWorldPoint());
                            break;
                        }

                        spot.interact("Build");
                    }

                    break;

                case BUILT:
                    Item seeds = Inventory.getFirst(config.seedType().getItemId());
                    if (seeds == null)
                    {
                        log.error("Seeds not found");
                        break;
                    }

                    TileObject emptyHouse = TileObjects.getFirstAt(birdHouse.getWorldPoint(), obj -> obj.hasAction("Seeds"));
                    if (emptyHouse == null)
                    {
                        log.error("Empty bird house not found");
                        break;
                    }

                    seeds.useOn(emptyHouse);
                    break;

                case SEEDED:
                    TileObject completedHouse = TileObjects.getFirstAt(birdHouse.getWorldPoint(), obj -> obj.hasAction("Empty"));
                    if (completedHouse == null)
                    {
                        log.error("Couldn't find completed bird house");
                        break;
                    }

                    completedHouse.interact("Empty");
                    break;
            }
        });

        return -2;
    }
}
