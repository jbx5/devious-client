package net.unethicalite.client.managers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.CollisionData;
import net.runelite.api.CollisionDataFlag;
import net.runelite.api.InventoryID;
import net.runelite.api.Tile;
import net.runelite.api.Varbits;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.unethicalite.regions.TileFlag;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Singleton
public class RegionManager
{
    private static final Set<Integer> REFRESH_WIDGET_IDS = Set.of(WidgetInfo.QUEST_COMPLETED_NAME_TEXT.getGroupId(), WidgetInfo.LEVEL_UP_LEVEL.getGroupId());
    private static final Set<String> pathfinderConfigKeys = Set.of("useTransports", "useTeleports", "avoidWilderness", "usePoh",
        "hasMountedGlory", "hasMountedDigsitePendant", "hasMountedMythicalCape", "hasMountedXericsTalisman", "hasJewelryBox",
        "housePortals", "useEquipmentJewellery", "useMinigameTeleports", "useEquipmentTeleports");

    private static final Set<Integer> REFRESH_VARBITS = Set.of(
            // Motherlode mine shortcut (54 agility)
            QuestVarbits.ACHIEVEMENT_DIARY_FALADOR_MEDIUM.getId(),

            // Draynor village wall shortcut (42 agility)
            QuestVarbits.ACHIEVEMENT_DIARY_LUMBRIDGE_MEDIUM.getId(),

            // Big windows shortcut in Al Kharid Palace (70 agility)
            QuestVarbits.ACHIEVEMENT_DIARY_DESERT_HARD.getId(),

            // Constructible darkmeyer shortcut on the eastern wall (63 agility)
            Varbits.DARKMEYER_EAST_WALL_SHORTCUT_1, Varbits.DARKMEYER_EAST_WALL_SHORTCUT_2,

            // Digsite gate might be accessible when value is >=153
            Varbits.KUDOS,

            // Zeah transport dialog is different first time talking to Veos
            Varbits.VEOS_HAS_TALKED_TO_BEFORE,
            // Zeah transport dialog is different when getting to a certain point in X Marks the spot (progress varbit >= 7)
            QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId(),

            // Door states change depending on the lever states
            Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_1_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_2_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_3_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_4_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_5_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_6_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_7_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_8_STATE, Varbits.DRAYNOR_MANOR_BASEMENT_DOOR_9_STATE

    );

    private static boolean REFRESH_PATH = false;
    private static boolean INITIAL_LOGIN = true;

    @Inject
    private ScheduledExecutorService executorService;

    public static boolean avoidWilderness()
    {
        return Static.getUnethicaliteConfig().avoidWilderness();
    }

    public static boolean shouldRefreshPath()
    {
        boolean refreshPath = REFRESH_PATH;
        REFRESH_PATH = false;
        return refreshPath;
    }

    public static boolean useEquipmentJewellery()
    {
        return Static.getUnethicaliteConfig().useEquipmentJewellery();
    }

    public static boolean useEquipmentTeleports()
    {
        return Static.getUnethicaliteConfig().useEquipmentTeleports();
    }

    public static boolean usePoh()
    {
        return Static.getUnethicaliteConfig().usePoh();
    }

    public static boolean hasMountedGlory()
    {
        return Static.getUnethicaliteConfig().hasMountedGlory();
    }

    public static boolean hasMountedDigsitePendant()
    {
        return Static.getUnethicaliteConfig().hasMountedDigsitePendant();
    }

    public static boolean hasMountedMythicalCape()
    {
        return Static.getUnethicaliteConfig().hasMountedMythicalCape();
    }

    public static boolean hasMountedXericsTalisman()
    {
        return Static.getUnethicaliteConfig().hasMountedXericsTalisman();
    }

    public static JewelryBox hasJewelryBox()
    {
        return Static.getUnethicaliteConfig().hasJewelryBox();
    }

    public static boolean useMinigameTeleports()
    {
        return Static.getUnethicaliteConfig().useMinigameTeleports();
    }

    public static Set<HousePortal> getHousePortals()
    {
        return Static.getUnethicaliteConfig().housePortals();
    }

    @Inject
    public void init()
    {
        executorService.submit(TransportLoader::init);
        Static.getEventBus().register(this);
    }

    @Subscribe(priority = Integer.MAX_VALUE)
    public void onGameStateChanged(GameStateChanged event)
    {
        switch (event.getGameState())
        {
            case UNKNOWN:
            case STARTING:
            case LOGIN_SCREEN:
            case LOGIN_SCREEN_AUTHENTICATOR:
            case CONNECTION_LOST:
                INITIAL_LOGIN = true;
                break;
            case LOGGED_IN:
                if (INITIAL_LOGIN)
                {
                    INITIAL_LOGIN = false;
                    executorService.schedule(() -> {
                        REFRESH_PATH = true;
                        TeleportLoader.refreshTeleports();
                        TransportLoader.refreshTransports();
                    }, 1000, TimeUnit.MILLISECONDS);
                }
        }
    }

    public boolean isTransport(List<Transport> transports, WorldPoint from, WorldPoint to)
    {
        if (transports == null)
        {
            return false;
        }

        return transports.stream().anyMatch(t -> t.getSource().equals(from) && t.getDestination().equals(to));
    }

    @Subscribe(priority = Integer.MAX_VALUE)
    public void onWidgetLoaded(WidgetLoaded event)
    {
        if (REFRESH_WIDGET_IDS.contains(event.getGroupId()))
        {
            if (hasChanged())
            {
                REFRESH_PATH = true;
            }
        }
    }

    @Subscribe(priority = Integer.MAX_VALUE)
    public void onVarChanged(VarbitChanged event)
    {
        if (REFRESH_VARBITS.contains(event.getVarbitId()))
        {
            if (hasChanged())
            {
                log.debug("Path refresh triggered by varbit {} change", event.getVarbitId());
                REFRESH_PATH = true;
            }
        }
    }

    @Subscribe(priority = Integer.MAX_VALUE)
    public void onItemContainerChanged(ItemContainerChanged event)
    {
        if (event.getContainerId() == InventoryID.INVENTORY.getId() || event.getContainerId() == InventoryID.EQUIPMENT.getId()
        || event.getContainerId() == InventoryID.BANK.getId())
        {
            if (hasChanged())
            {
                REFRESH_PATH = true;
            }
        }
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event)
    {
        if (!event.getGroup().equals(UnethicaliteConfig.CONFIG_GROUP))
        {
            return;
        }
        if (pathfinderConfigKeys.contains(event.getKey()))
        {
            REFRESH_PATH = true;
            if (Game.isLoggedIn())
            {
                TransportLoader.refreshTransports();
                TeleportLoader.refreshTeleports();
            }
        }
    }

    private boolean hasChanged()
    {
        boolean tranChanged = transportsChanged();
        boolean teleChanged = teleportsChanged();

        boolean changed = tranChanged || teleChanged;

        if (changed)
        {
            log.debug("Transports/teleports changed!");
        }

        return changed;
    }

    private boolean transportsChanged()
    {
        List<WorldPoint> path = Walker.remainingPath(Walker.buildPath());

        if (path.isEmpty())
        {
            TransportLoader.refreshTransports();
            return false;
        }

        Map<WorldPoint, List<Transport>> previousTransports = Walker.buildTransportLinksOnPath(path);
        TransportLoader.refreshTransports();
        Map<WorldPoint, List<Transport>> currentTransports = Walker.buildTransportLinksOnPath(path);

        for (WorldPoint point : path)
        {
            List<Transport> prevTran = previousTransports.getOrDefault(point, new ArrayList<>());
            List<Transport> currTran = currentTransports.getOrDefault(point, new ArrayList<>());
            if (!prevTran.equals(currTran))
            {
                return true;
            }
        }

        return false;
    }

    private boolean teleportsChanged()
    {
        List<WorldPoint> path = Walker.remainingPath(Walker.buildPath());

        if (path.isEmpty())
        {
            TeleportLoader.refreshTeleports();
            return false;
        }

        LinkedHashMap<WorldPoint, Teleport> previousTeleports = Walker.buildTeleportLinksOnPath(path);
        TeleportLoader.refreshTeleports();
        LinkedHashMap<WorldPoint, Teleport> currentTeleports = Walker.buildTeleportLinksOnPath(path);

        for (WorldPoint point : path)
        {
            Teleport prevTele = previousTeleports.getOrDefault(point, null);
            Teleport currTele = currentTeleports.getOrDefault(point, null);
            if ((prevTele == null && currTele != null) || (prevTele != null && currTele == null))
            {
                return true;
            }
        }

        return false;
    }

    public List<TileFlag> getTileFlags()
    {
        CollisionData[] col = Static.getClient().getCollisionMaps();
        if (col == null)
        {
            return new ArrayList<>();
        }

        List<TileFlag> tileFlags = new ArrayList<>();
        Map<WorldPoint, List<Transport>> transportLinks = Walker.buildTransportLinks();
        int plane = Static.getClient().getPlane();
        CollisionData data = col[plane];
        if (data == null)
        {
            return new ArrayList<>();
        }

        int[][] flags = data.getFlags();
        for (int x = 0; x < flags.length; x++)
        {
            for (int y = 0; y < flags.length; y++)
            {
                int tileX = x + Static.getClient().getBaseX();
                int tileY = y + Static.getClient().getBaseY();
                int flag = flags[x][y];

                // Stop if we reach any tiles which dont have collision data loaded
                // Usually occurs for tiles which are loaded in the 104x104 scene, but are outside the region
                if (flag == 0xFFFFFF)
                {
                    continue;
                }

                int regionId = ((tileX >> 6) << 8) | (tileY >> 6);

                // Set the full block flag in case tiles are null (ex. on upper levels)
                TileFlag tileFlag = new TileFlag(tileX, tileY, plane, CollisionDataFlag.BLOCK_MOVEMENT_FULL, regionId);
                Tile tile = Tiles.getAt(tileX, tileY, plane);
                if (tile == null)
                {
                    tileFlags.add(tileFlag);
                    continue;
                }

                tileFlag.setFlag(flag);
                WorldPoint tileCoords = tile.getWorldLocation();

                // Check if we are blocked by objects
                // We don't need to parse west/south because they're checked by parsing adjacent tiles for north/east
                // We also skip the current tile if an adjacent tile does not have their flags loaded
                WorldPoint northernTile = tileCoords.dy(1);
                if (Reachable.getCollisionFlag(northernTile) == 0xFFFFFF)
                {
                    continue;
                }

                if (Reachable.isObstacle(northernTile) && !Reachable.isWalled(Direction.NORTH, tileFlag.getFlag()))
                {
                    tileFlag.setFlag(tileFlag.getFlag() + CollisionDataFlag.BLOCK_MOVEMENT_NORTH);
                }

                WorldPoint easternTile = tileCoords.dx(1);
                if (Reachable.getCollisionFlag(easternTile) == 0xFFFFFF)
                {
                    continue;
                }

                if (Reachable.isObstacle(easternTile) && !Reachable.isWalled(Direction.EAST, tileFlag.getFlag()))
                {
                    tileFlag.setFlag(tileFlag.getFlag() + CollisionDataFlag.BLOCK_MOVEMENT_EAST);
                }

                List<Transport> transports = transportLinks.get(tileCoords);
                if (plane == Static.getClient().getPlane())
                {
                    for (Direction direction : Direction.values())
                    {
                        switch (direction)
                        {
                            case NORTH:
                                if ((Reachable.hasDoor(tile, direction) || Reachable.hasDoor(northernTile, Direction.SOUTH)) && !isTransport(transports, tileCoords, northernTile))
                                {
                                    tileFlag.setFlag(tileFlag.getFlag() - CollisionDataFlag.BLOCK_MOVEMENT_NORTH);
                                }
                                break;
                            case EAST:
                                if ((Reachable.hasDoor(tile, direction) || Reachable.hasDoor(easternTile, Direction.WEST)) && !isTransport(transports, tileCoords, easternTile))
                                {
                                    tileFlag.setFlag(tileFlag.getFlag() - CollisionDataFlag.BLOCK_MOVEMENT_EAST);
                                }
                                break;
                        }
                    }
                }

                tileFlags.add(tileFlag);
            }
        }
        return tileFlags;
    }
}
