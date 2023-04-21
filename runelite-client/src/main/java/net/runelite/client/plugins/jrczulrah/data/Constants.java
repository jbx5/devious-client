package net.runelite.client.plugins.jrczulrah.data;

import com.google.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Constants
{
    @Inject
    private JRCZulrahConfig config;
    public static final String BANK_NAME = "Bank chest";
    public static final String ZULRAH_NAME = "Zulrah";
    public static final String DART_NAME = "dart";
    public static final String TOXIC_BLOWPIPE_NAME = "Toxic blowpipe";
    public static final String MAGIC_SHORTBOW_NAME = "Magic shortbow";
    public static final String TWISTED_BOW_NAME = "Twisted bow";
    public static final String NPC_BOB_NAME = "Bob";
    public static final String BANKER_NAME = "Banker";
    public static final String GE_CLERK_NAME = "Grand Exchange Clerk";
    public static final Predicate<TileItem> NON_DART_PICKABLE = x -> !x.getName().contains(Constants.DART_NAME);
    public static final Integer[] REPAIR_VALUES = {25, 50, 75, 100};

    public static final List<String> LOOT_TABLE = Arrays.asList("Zulrah's scales", "Tanzanite fang", "Magic fang", "Serpentine visage",
            "Uncut onyx", "Dragon med helm", "Dragon halberd", "Law rune", "Pure essence", "Toadflax",
            "Snapdragon", "Dwarf weed", "Torstol", "Flax", "Snakeskin", "Dragonstone bolt tips", "Yew logs", "Mahogany logs",
            "Coal", "Runite ore", "Calquat tree seed", "Palm tree seed", "Papaya tree seed", "Magic seed", "Toadflax seed", "Snapdragon seed",
            "Dwarf weed seed", "Torstol seed", "Crystal seed", "Dragon bones", "Coconut", "Grapes",
            "Battlestaff", "Antidote++(4)", "Manta ray", "Swamp tar", "Crushed nest", "Adamantite bar", "Uncut sapphire", "Uncut emerald",
            "Uncut ruby", "Chaos talisman", "Uncut diamond", "Rune javelin", "Loop half of key", "Tooth half of key", "Rune spear", "Shield left half",
            "Dragon spear", "Nature talisman", "Runite bar", "Dragonstone", "Silver ore", "Rune kiteshield", "Rune sq shield", "Rune battleaxe", "Rune 2h sword",
            "Nature rune", "Steel arrow", "Rune arrow", "Adamant javelin", "Rune javelin",
            "Tanzanite mutagen", "Magma mutagen", "Jar of swamp", "Pet snakeling", "Death rune", "Chaos rune");
    public static final String EAT_ACTION = "Eat";
    public static final String ZULRAH_TRIGGER = "priestess rows you";
    public static final String ZUL_ANDRA_TELEPORT = "Zul-andra teleport";
    public static final String RING_OF_RECOIL = "Ring of recoil";
    public static final String PRAYER_POT = "Prayer potion";
    public static final String KARAMBWAN = "Cooked karambwan";
    public static final String ANTIVENOM_POT = "Anti-venom+";
    public static final String MAGIC_POT = "Magic potion";
    public static final String RING_OF_DUELING = "Ring of dueling";
    public static final String BOAT = "Sacrificial boat";
    public static final int DISAPPEAR_ANIMATION = 5072;
    public static final int CUMSHOT_ID = 1047;
    public static final HashMap<Integer, Integer> WORLDS_PING = new HashMap<>();
    public static final HashMap<Integer, Integer> EXPENSES = new HashMap<>();

    public static final String BOARD_ACTION = "Board";
    public static final String DRINK_ACTION = "Drink";
    public static final String PORTAL = "Free-for-all portal";
    public static final String PORTAL_EXIT = "Portal";
    public static final String TELEPORT_ACTION = "Teleport";
    public static final String PORTAL_ENTER_ACTION = "Enter";
    public static final String ZUL_ANDRA_NPC = "Zul-Urgish";
    public static final String COLLECT_NPC = "Priestess Zul-Gwenwynig";
    public static final String COLLECT_ACTION = "Collect";
    public static final String RUB_ACTION = "Rub";
    public static final String CLAN_WARS_OPTION = "Ferox Enclave";
    public static final String WEAR_ACTION = "Wear";
    public static final String WIELD_ACTION = "Wield";
    public static final String EQUIP_ACTION = "Equip";
    public static final String TAKE_ACTION = "Take";
    public static final int TELEPORT_OUT = 11701;
    public static final String TELEPORT_INTERACT_OPTION = "Read";
    public static final String FREE_SPACE_MSG = "enough free";
    public static final String PICK_UP_ACTION = "Pick-up";
    public static final int MAX_BANKING_ATTEMPTS = 2;
    public static final String BLOWPIPE_SUBSTRING = "blowpipe";
    public static final String TRIDENT_PREFIX = "trident";
    public static final String CHECK_ACTION = "Check";
    public static final String TOXIC_TRIDENT_SUBSTRING = "swamp";
    public static final String IMBUED_HEART = "Imbued heart";
    public static final String REMOVE_ACTION = "Remove";
    public static final String USE_ACTION = "Use";
    public static final String RECHARGE_MSG_SCALES = "scales.";
    public static final String RECHARGE_MSG_BLOWPIPE = "blowpipe needs to be";
    public static final int SCALES_ID = 12934;
    public static final String FIRE_RUNE = "Fire rune";
    public static final String DEATH_RUNE = "Death rune";
    public static final String CHAOS_RUNE = "Chaos rune";
    public static final String COINS = "Coins";
    public static final int COINS_ID = 995;
    public static final String ZULRAH_SCALES = "Zulrah's scales";
    public static final String RECHARGE_MSG_TRIDENT = "trident only has 100 charges";
    public static final String RECHARGE_MSG_TRIDENT_EMPTY = "Your weapon has";
    public static final String RECHARGE_MSG_IBAN = "charges left on the staff.";
    public static final String ATTACK_ACTION = "Attack";
    public static final int APPEAR_ANIMATION = 5073;
    public static final String PRAYER_POTION = "Prayer potion";
    public static final int MAX_HIT = 42;
    public static final int EAT_ANIMATION = 829;
    public static final int KARAMBWAN_HEAL = 18;
    public static final String IMBUED_HEART_USE_ACTION = "Invigorate";
    public static final String IMBUED_HEART_RECHARGED_MSG = "regained its";
    public static final int PROJECTILE_RANGED_ID = 1044;
    public static final int PROJECTILE_MAGE_ID = 1046;
    public static final int INVENTORY_SIZE = 28;
    public static final String RECOIL_BROKE_MSG = "Ring of Recoil";
    public static final int VENOM_SPIT_PROJECTILE = 1045;
    public static final int VENOM_CLOUD_ID = 11700;
    public static final int SPECIAL_ATTACK_LIMIT = 50;
    public static final int DECANT_NPC_ID = 5449;
    public static final String DECANT_ACTION = "Decant";
    public static final String LUMBRIDGE_TELEPORT = "Lumbridge teleport";
    public static final String AHRIM_PREFIX = "Ahrim";
    public static final String CLAN_WARS_CHAT_OPTION = "Ferox Enclave";
    public static final String BREAK_ACTION = "Break";
    public static final String REPAIR_OPTION = "Repair";
    public static final int KEEP_SCALES = 2000;
    public static final Predicate<Item> RING_OF_WEALTH_PREFIX = x -> x.getName().contains("Ring of wealth (");
    public static final String GE_CHAT_OPTION = "Grand Exchange";
    public static final String BANK_OPTION = "Bank";
    public static final String EXCHANGE_OPTION = "Exchange";
    public static final String ZULRAH_KILL_COUNT_MSG = "Zulrah kill count";
    public static final String CAMELOT_TELEPORT = "Camelot teleport";
    public static final WorldPoint CHARTER_SHIP_POS = new WorldPoint(2795, 3414, 0);
    public static final WorldPoint BOAT_POS = new WorldPoint(2208, 3057, 0);
    public static final String TRADER_CREWMEMBER = "Trader Crewmember";
    public static final String CHARTER_OPTION = "Charter";
    public static final String GANGPLANK = "Gangplank";
    public static final String CROSS_OPTION = "Cross";
    public static final String PORT_TYRAS_OPTION = "Port Tyras";
    public static final String IBAN_PREFIX = "Iban's";
    public static final String WEST_ARDY_TELE = "West ardougne teleport";
    public static final int RECHARGE_MAGE_ID = 7753;
    public static final String STAFF_RECHARGE_OPTION = "Staves";
    public static final WorldPoint RECHARGE_MAGE_POSITION = new WorldPoint(2457, 3315, 0);
    public static final String SUFFERING_SUBSTRING = "suffering";
}