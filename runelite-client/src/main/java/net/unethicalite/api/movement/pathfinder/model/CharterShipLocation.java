package net.unethicalite.api.movement.pathfinder.model;

import lombok.Getter;
import net.runelite.api.ItemID;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.quests.Quests;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static net.unethicalite.api.movement.pathfinder.TransportLoader.charterTransport;

@Getter
public enum CharterShipLocation
{
    BRIMHAVEN_DOCK(new WorldPoint(2760, 3238, 0)),
    BRIMHAVEN_SHIP(new WorldPoint(2763, 3238, 1)),
    CATHERBY_DOCK(new WorldPoint(2792, 3414, 0)),
    CATHERBY_SHIP(new WorldPoint(2792, 3417, 1)),
    CORSAIR_COVE_DOCK(new WorldPoint(2589, 2851, 0)),
    CORSAIR_COVE_SHIP(new WorldPoint(2592, 2851, 1)),
    MUSA_POINT_DOCK(new WorldPoint(2954, 3158, 0)),
    MUSA_POINT_SHIP(new WorldPoint(2957, 3158, 1)),
    MOS_LE_HARMLESS_DOCK(new WorldPoint(3671, 2931, 0)),
    MOS_LE_HARMLESS_SHIP(new WorldPoint(3668, 2931, 1)),
    PORT_KHAZARD_DOCK(new WorldPoint(2674, 3144, 0)),
    PORT_KHAZARD_SHIP(new WorldPoint(2674, 3141, 1)),
    PORT_PHASMATYS_DOCK(new WorldPoint(3702, 3503, 0)),
    PORT_PHASMATYS_SHIP(new WorldPoint(3705, 3503, 1)),
    PORT_SARIM_DOCK(new WorldPoint(3038, 3192, 0)),
    PORT_SARIM_SHIP(new WorldPoint(3038, 3189, 1)),
    PORT_TYRAS_DOCK(new WorldPoint(2142, 3122, 0)),
    PORT_TYRAS_SHIP(new WorldPoint(2142, 3125, 1)),
    SHIP_YARD_DOCK(new WorldPoint(3001, 3032, 0)),
    SHIP_YARD_SHIP(new WorldPoint(2998, 3032, 1)),
    PRIFFDINAS_DOCK(new WorldPoint(2157, 3330, 0)),
    PRIFFDINAS_SHIP(new WorldPoint(2157, 3333, 1)),
    ;

    private final WorldPoint worldPoint;
    private static final Map<Pair<WorldPoint, WorldPoint>, Integer> priceMap = new HashMap<>();

    CharterShipLocation(WorldPoint worldPoint)
    {
        this.worldPoint = worldPoint;
    }
    static
    {
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 480);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 680);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 3900);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 480);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 400);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 2900);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 400);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 480);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 1000);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 480);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 3500);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 3500);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1000);
        priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 680);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 1000);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 800);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 4080);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 600);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 4040);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1200);
        priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 800);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 200);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 480);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 800);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 1100);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 400);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 1100);
        priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 200);
        if (Quests.getState(Quest.CABIN_FEVER) == QuestState.FINISHED)
        {
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 2900);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 2500);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 4080);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 4100);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 1100);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1300);
            priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 1100);
            if (Quests.getState(Quest.REGICIDE) == QuestState.FINISHED)
            {
                priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            }
            if (Quests.getState(Quest.SONG_OF_THE_ELVES) == QuestState.FINISHED)
            {
                priceMap.put(Pair.of(MOS_LE_HARMLESS_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 4950);
            }
        }
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 600);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 4100);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 4100);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1280);
        priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 2900);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 3500);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 4040);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 1100);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 4100);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 1300);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 3200);
        priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 5200);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 1000);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 1200);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 1300);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 1280);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 1300);
        priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 400);
        if (Quests.getState(Quest.REGICIDE) == QuestState.FINISHED)
        {
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_PHASMATYS_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
        }
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 400);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 1600);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 800);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 200);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 1100);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 720);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 1100);
        priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 400);
        if (Quests.getState(Quest.SONG_OF_THE_ELVES) == QuestState.FINISHED)
        {
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), BRIMHAVEN_SHIP.getWorldPoint()), 3450);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), CATHERBY_SHIP.getWorldPoint()), 3560);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), CORSAIR_COVE_SHIP.getWorldPoint()), 1420);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), MUSA_POINT_SHIP.getWorldPoint()), 4400);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), MOS_LE_HARMLESS_SHIP.getWorldPoint()), 4950);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), PORT_KHAZARD_SHIP.getWorldPoint()), 2800);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), PORT_PHASMATYS_SHIP.getWorldPoint()), 5200);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), PORT_SARIM_SHIP.getWorldPoint()), 4800);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), PORT_TYRAS_SHIP.getWorldPoint()), 3200);
            priceMap.put(Pair.of(PRIFFDINAS_DOCK.getWorldPoint(), SHIP_YARD_SHIP.getWorldPoint()), 4000);
            priceMap.put(Pair.of(BRIMHAVEN_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 3450);
            priceMap.put(Pair.of(CATHERBY_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 3560);
            priceMap.put(Pair.of(CORSAIR_COVE_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 1420);
            priceMap.put(Pair.of(MUSA_POINT_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 4400);
            priceMap.put(Pair.of(PORT_KHAZARD_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 2800);
            priceMap.put(Pair.of(PORT_SARIM_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 4800);
            priceMap.put(Pair.of(SHIP_YARD_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 4000);
            priceMap.put(Pair.of(PORT_TYRAS_DOCK.getWorldPoint(), PRIFFDINAS_SHIP.getWorldPoint()), 3200);
        }
    }

    public static int getCharterShipCost(WorldPoint source, WorldPoint destination, boolean ringOfCharos)
    {
        double priceModifier = 1.0;
        if (ringOfCharos)
        {
            priceModifier *= 0.5;
        }
        if (Quests.getState(Quest.CABIN_FEVER) == QuestState.FINISHED)
        {
            priceModifier *= 0.5;
        }
        return (int) (priceMap.getOrDefault(Pair.of(source, destination), 0) * priceModifier);
    }
    public static Collection<Transport> getCharterShips(int gold)
    {
        Collection<Transport> transports = new ArrayList<>();
        double priceModifier = 1.0;
        if (Equipment.contains(ItemID.RING_OF_CHAROSA))
        {
            priceModifier *= 0.5;
        }
        if (Quests.getState(Quest.CABIN_FEVER) == QuestState.FINISHED)
        {
            priceModifier *= 0.5;
            if (gold >= 1100 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
                transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
                transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 1300 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
                transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 2500 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
            }
            if (gold >= 2900 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            }
            if (gold >= 3200 * priceModifier && Quests.getState(Quest.REGICIDE) == QuestState.FINISHED)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 3500 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 3900 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 4080 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
                transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
            if (gold >= 4100 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
                transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
        }
        if (Quests.getState(Quest.SONG_OF_THE_ELVES) == QuestState.FINISHED)
        {
            if (gold >= 1420 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
            }
            if (gold >= 2800 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
            }
            if (gold >= 3200 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
            }
            if (gold >= 3450 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            }
            if (gold >= 3560 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
            }
            if (gold >= 4000 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            }
            if (gold >= 4400 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            }
            if (gold >= 4800 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            }

            if (gold >= 5200 * priceModifier)
            {
                transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            }
            if (gold >= 4950 * priceModifier && Quests.getState(Quest.CABIN_FEVER) == QuestState.FINISHED)
            {
                transports.add(charterTransport(CharterShipLocation.MOS_LE_HARMLESS_DOCK.getWorldPoint(), CharterShipLocation.PRIFFDINAS_SHIP.getWorldPoint(), 33));
                transports.add(charterTransport(CharterShipLocation.PRIFFDINAS_DOCK.getWorldPoint(), CharterShipLocation.MOS_LE_HARMLESS_SHIP.getWorldPoint(), 26));
            }
        }
        if (gold >= 200 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
        }
        if (gold >= 400 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
        }
        if (gold >= 480 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
        }
        if (gold >= 600 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
        }
        if (gold >= 680 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));

        }
        if (gold >= 720 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
        }
        if (gold >= 800 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
        }
        if (gold >= 1000 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
        }
        if (gold >= 1100 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
        }
        if (gold >= 1200 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
        }
        if (gold >= 1280 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
        }
        if (gold >= 1300 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
        }
        if (gold >= 1600 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
            transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
        }
        if (gold >= 2900 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.BRIMHAVEN_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
        }
        if (gold >= 3200 * priceModifier)
        {
            if (Quests.getState(Quest.REGICIDE) == QuestState.FINISHED)
            {
                transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.MUSA_POINT_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.PORT_SARIM_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.SHIP_YARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_TYRAS_SHIP.getWorldPoint(), 2));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.BRIMHAVEN_SHIP.getWorldPoint(), 17));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.MUSA_POINT_SHIP.getWorldPoint(), 14));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.PORT_SARIM_SHIP.getWorldPoint(), 23));
                transports.add(charterTransport(CharterShipLocation.PORT_TYRAS_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
            }
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.SHIP_YARD_SHIP.getWorldPoint(), 11));
        }
        if (gold >= 3500 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CATHERBY_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.CATHERBY_SHIP.getWorldPoint(), 8));
        }
        if (gold >= 4040 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.CORSAIR_COVE_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.CORSAIR_COVE_SHIP.getWorldPoint(), 32));
        }
        if (gold >= 4100 * priceModifier)
        {
            transports.add(charterTransport(CharterShipLocation.PORT_KHAZARD_DOCK.getWorldPoint(), CharterShipLocation.PORT_PHASMATYS_SHIP.getWorldPoint(), 5));
            transports.add(charterTransport(CharterShipLocation.PORT_PHASMATYS_DOCK.getWorldPoint(), CharterShipLocation.PORT_KHAZARD_SHIP.getWorldPoint(), 20));
        }
        return transports;
    }

}
