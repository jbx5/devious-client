package net.unethicalite.api.movement.pathfinder.model;

import net.runelite.api.ItemID;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;

public enum TeleportItem
{
    // Prioritize house tab
    HOUSE_TAB(MovementConstants.HOUSE_POINT(), "Break", null, ItemID.TELEPORT_TO_HOUSE),

    // Tabs
    WATERBIRTH_TELEPORT_TAB(new WorldPoint(2546, 3757, 0), "Break", null, ItemID.WATERBIRTH_TELEPORT),
    KHAZARD_TELEPORT_TAB(new WorldPoint(2637, 3166, 0), "Break", null, ItemID.KHAZARD_TELEPORT),
    VARROCK_TELEPORT_TAB(new WorldPoint(3212, 3424, 0), "Break", null, ItemID.VARROCK_TELEPORT),
    LUMBRIDGE_TELEPORT_TAB(new WorldPoint(3225, 3219, 0), "Break", null, ItemID.LUMBRIDGE_TELEPORT),
    FALADOR_TELEPORT_TAB(new WorldPoint(2966, 3379, 0), "Break", null, ItemID.FALADOR_TELEPORT),
    CAMELOT_TELEPORT_TAB(new WorldPoint(2757, 3479, 0), "Break", null, ItemID.CAMELOT_TELEPORT),
    ARDOUGNE_TELEPORT_TAB(new WorldPoint(2661, 3300, 0), "Break", null, ItemID.ARDOUGNE_TELEPORT),
    WEST_ARDOUGNE_TELEPORT_TAB(new WorldPoint(2500, 3290, 0), "Break", null, ItemID.WEST_ARDOUGNE_TELEPORT),
    RIMMINGTON_TELEPORT_TAB(new WorldPoint(2954, 3224, 0), "Break", null, ItemID.RIMMINGTON_TELEPORT),
    TAVERLEY_TELEPORT_TAB(new WorldPoint(2894, 3465, 0), "Break", null, ItemID.TAVERLEY_TELEPORT),
    RELLEKKA_TELEPORT_TAB(new WorldPoint(2668, 3631, 0), "Break", null, ItemID.RELLEKKA_TELEPORT),
    BRIMHAVEN_TELEPORT_TAB(new WorldPoint(2758, 3178, 0), "Break", null, ItemID.BRIMHAVEN_TELEPORT),
    POLLNIVNEACH_TELEPORT_TAB(new WorldPoint(3340, 3004, 0), "Break", null, ItemID.POLLNIVNEACH_TELEPORT),
    YANILLE_TELEPORT_TAB(new WorldPoint(2544, 3095, 0), "Break", null, ItemID.YANILLE_TELEPORT),
    HOSIDIUS_TELEPORT_TAB(new WorldPoint(1744, 3517, 0), "Break", null, ItemID.HOSIDIUS_TELEPORT),
    SALVE_GRAVEYARD_TELEPORT_TAB(new WorldPoint(3432, 3460, 0), "Break", null, ItemID.SALVE_GRAVEYARD_TELEPORT),
    DRAYNOR_MANOR_TELEPORT_TAB(new WorldPoint(3109, 3350, 0), "Break", null, ItemID.DRAYNOR_MANOR_TELEPORT),
    FENKENSTRAINS_CASTLE_TELEPORT_TAB(new WorldPoint(3549, 3530, 0), "Break", null, ItemID.FENKENSTRAINS_CASTLE_TELEPORT),

    RIMMINGTON_TAB(new WorldPoint(2954, 3223, 0), "Break", null, ItemID.RIMMINGTON_TELEPORT),
    TAVERLEY_TAB(new WorldPoint(2894, 3466, 0), "Break", null, ItemID.TAVERLEY_TELEPORT),
    POLLNIVNEACH_TAB(new WorldPoint(3339, 3004, 0), "Break", null, ItemID.POLLNIVNEACH_TELEPORT),
    HOSIDIUS_TAB(new WorldPoint(1744, 3518, 0), "Break", null, ItemID.HOSIDIUS_TELEPORT),
    RELLEKKA_TAB(new WorldPoint(2671, 3631, 0), "Break", null, ItemID.RELLEKKA_TELEPORT),
    BRIMHAVEN_TAB(new WorldPoint(2758, 3177, 0), "Break", null, ItemID.BRIMHAVEN_TELEPORT),
    YANILLE_TAB(new WorldPoint(2545, 3096, 0), "Break", null, ItemID.YANILLE_TELEPORT),
    TROLLHEIM_TAB(new WorldPoint(2890, 3679, 0), "Break", null, ItemID.TROLLHEIM_TELEPORT),
    PRIFDDINAS_TAB(new WorldPoint(3239, 6076, 0), "Break", null, ItemID.PRIFDDINAS_TELEPORT),

    // Scrolls
    FELDIP_HILLS_TELEPORT(new WorldPoint(2541, 2925, 0), "Teleport", null, ItemID.FELDIP_HILLS_TELEPORT),
    PISCATORIS_TELEPORT(new WorldPoint(2342, 3647, 0), "Teleport", null, ItemID.PISCATORIS_TELEPORT),
    MORTTON_TELEPORT(new WorldPoint(3488, 3288, 0), "Teleport", null, ItemID.MORTTON_TELEPORT),
    DIGSITE_TELEPORT(new WorldPoint(3324, 3412, 0), "Teleport", null, ItemID.DIGSITE_TELEPORT),
    NARDAH_TELEPORT(new WorldPoint(3420, 2917, 0), "Teleport", null, ItemID.NARDAH_TELEPORT),
    LUMBERYARD_TELEPORT(new WorldPoint(3302, 3486, 0), "Teleport", null, ItemID.LUMBERYARD_TELEPORT),
    TAI_BWO_TELEPORT(new WorldPoint(2789, 3066, 0), "Teleport", null, ItemID.TAI_BWO_WANNAI_TELEPORT),
    ZULANDRA_TELEPORT(new WorldPoint(2197, 3055, 0), "Teleport", null, ItemID.ZULANDRA_TELEPORT),
    IORWERTH_TELEPORT(new WorldPoint(2194, 3258, 0), "Teleport", null, ItemID.IORWERTH_CAMP_TELEPORT),
    LUNAR_ISLE_TELEPORT(new WorldPoint(2093, 3912, 0), "Teleport", null, ItemID.LUNAR_ISLE_TELEPORT),
    MOS_LEHARMLESS_TELEPORT(new WorldPoint(3701, 2996, 0), "Teleport", null, ItemID.MOS_LEHARMLESS_TELEPORT),
    PEST_CONTROL_TELEPORT(new WorldPoint(2657, 2660, 0), "Teleport", null, ItemID.PEST_CONTROL_TELEPORT),
    KEY_MASTER_TELEPORT(new WorldPoint(2686, 9882, 0), "Teleport", null, ItemID.KEY_MASTER_TELEPORT),
    REVENANT_CAVE_TELEPORT(new WorldPoint(3127, 3833, 0), "Teleport", null, ItemID.REVENANT_CAVE_TELEPORT),
    WATSON_TELEPORT(new WorldPoint(1645, 3579, 0), "Teleport", null, ItemID.WATSON_TELEPORT),

    // Misc consumables
    WEISS_ICY_BASALT(new WorldPoint(2846, 3940, 0), "Weiss", Quest.MAKING_FRIENDS_WITH_MY_ARM, ItemID.ICY_BASALT),
    TROLL_STRONGHOLD(new WorldPoint(2838, 3693, 0), "Troll Stronghold", Quest.MAKING_FRIENDS_WITH_MY_ARM, ItemID.STONY_BASALT),
    TROLL_STRONGHOLD_OUTSIDE(new WorldPoint(2844, 3693, 0), "Troll Stronghold", Quest.MAKING_FRIENDS_WITH_MY_ARM, ItemID.STONY_BASALT),

    // Reusable
    ROYAL_SEED_POD(new WorldPoint(2465, 3495, 0), "Commune", Quest.MONKEY_MADNESS_II, ItemID.ROYAL_SEED_POD),
    ECTOPHIAL(new WorldPoint(3659, 3523, 0), "Empty", null, ItemID.ECTOPHIAL),
    TELEPORT_CRYSTAL_LLETYA(new WorldPoint(2330, 3172, 0), "Lletya", null, MovementConstants.TELEPORT_CRYSTAL),
    TELEPORT_CRYSTAL_PRIFDDINAS(new WorldPoint(3264, 6065, 0), "Prifddinas", Quest.SONG_OF_THE_ELVES, MovementConstants.TELEPORT_CRYSTAL),

    // TODO move these to teleport loader since they are equippable...
    //	CHAMPIONS_GUILD_CHRONICLE(new WorldPoint(3202, 3357, 0), "Champions' Guild", null, ItemID.CHRONICLE),
    RELLEKKKA_LYRE(new WorldPoint(2664, 3643, 0), "Rellekka", Quest.THE_FREMENNIK_TRIALS, MovementConstants.ENCHANTED_LYRE),
    WATERBIRTH_ISLAND_LYRE(new WorldPoint(2550, 3756, 0), "Waterbirth Island", Quest.THE_FREMENNIK_TRIALS, MovementConstants.ENCHANTED_LYRE),
    NEITIZNOT_LYRE(new WorldPoint(2336, 3801, 0), "Neitiznot", Quest.THE_FREMENNIK_TRIALS, MovementConstants.ENCHANTED_LYRE),
    JATIZSO_LYRE(new WorldPoint(2409, 3809, 0), "Jatizso", Quest.THE_FREMENNIK_TRIALS, MovementConstants.ENCHANTED_LYRE),
    ;

    private final WorldPoint destination;
    private final Quest requirement;
    private final int[] itemIds;
    private final String action;

    TeleportItem(WorldPoint destination, String action, Quest requirement, int... itemIds)
    {
        this.destination = destination;
        this.requirement = requirement;
        this.itemIds = itemIds;
        this.action = action;
    }

    public WorldPoint getDestination()
    {
        return destination;
    }

    public int[] getItemId()
    {
        return itemIds;
    }

    public String getAction()
    {
        return action;
    }

    public boolean canUse()
    {
        return hasRequirements() && Inventory.getFirst(itemIds) != null;
    }

    public boolean hasRequirements()
    {
        boolean hasQuestReqs = (requirement == null || Quests.getState(requirement) == QuestState.FINISHED);
        switch (this)
        {
            case JATIZSO_LYRE:
            case NEITIZNOT_LYRE:
                return hasQuestReqs && Vars.getBit(Varbits.DIARY_FREMENNIK_ELITE) > 0;
            case WATERBIRTH_ISLAND_LYRE:
                return hasQuestReqs && Vars.getBit(Varbits.DIARY_FREMENNIK_HARD) > 0;
            case TROLL_STRONGHOLD:
                return hasQuestReqs && Skills.getLevel(Skill.AGILITY) >= 73 && Vars.getBit(Varbits.DIARY_FREMENNIK_HARD) > 0;
            case ARDOUGNE_TELEPORT_TAB:
                return hasQuestReqs && Vars.getVarp(165) >= 30;
            case SALVE_GRAVEYARD_TELEPORT_TAB:
                return hasQuestReqs && Vars.getVarp(302) >= 61;
            default:
                return hasQuestReqs;
        }
    }
}
