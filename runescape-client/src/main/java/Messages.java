import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("aw")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1617029295
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lls;",
		garbageValue = "-1826957735"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3216, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3305, ServerPacket.field3221, ServerPacket.SET_PLAYER_OP, ServerPacket.VARP_LARGE, ServerPacket.IF_SETOBJECT, ServerPacket.URL_OPEN, ServerPacket.IF_MOVESUB, ServerPacket.field3235, ServerPacket.field3228, ServerPacket.field3229, ServerPacket.field3230, ServerPacket.field3231, ServerPacket.field3217, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3314, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3312, ServerPacket.field3239, ServerPacket.field3331, ServerPacket.IF_SETNPCHEAD, ServerPacket.IF_CLOSESUB, ServerPacket.UPDATE_STAT, ServerPacket.UPDATE_IGNORELIST, ServerPacket.IF_SETCOLOUR, ServerPacket.field3250, ServerPacket.NPC_SPOTANIM, ServerPacket.field3248, ServerPacket.field3249, ServerPacket.field3335, ServerPacket.field3251, ServerPacket.field3252, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.VARP_SMALL, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3219, ServerPacket.field3257, ServerPacket.field3258, ServerPacket.field3259, ServerPacket.field3260, ServerPacket.field3277, ServerPacket.HINT_ARROW, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3246, ServerPacket.IF_SETANGLE, ServerPacket.field3296, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_SETSCROLLPOS, ServerPacket.REBUILD_REGION, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.MESSAGE_GAME, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3273, ServerPacket.field3274, ServerPacket.IF_SETMODEL, ServerPacket.UPDATE_UID192, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3291, ServerPacket.CAM_SETANGLE, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.MINIMAP_TOGGLE, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3284, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3286, ServerPacket.IF_SETPOSITION, ServerPacket.UPDATE_INV_FULL, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3290, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.SET_PRIVCHATMODE, ServerPacket.PLAYER_INFO, ServerPacket.field3232, ServerPacket.field3223, ServerPacket.field3297, ServerPacket.field3298, ServerPacket.field3322, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3280, ServerPacket.field3302, ServerPacket.field3299, ServerPacket.MIDI_SONG, ServerPacket.IF_SETHIDE, ServerPacket.field3306, ServerPacket.field3224, ServerPacket.field3308, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3311, ServerPacket.CAM_RESET, ServerPacket.field3313, ServerPacket.REBUILD_NORMAL, ServerPacket.LOGOUT, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3303, ServerPacket.field3321, ServerPacket.field3247, ServerPacket.CAM_LOOKAT, ServerPacket.field3324, ServerPacket.field3325, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3327, ServerPacket.field3328, ServerPacket.field3329, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3332, ServerPacket.field3270, ServerPacket.field3220, ServerPacket.field3334, ServerPacket.field3301, ServerPacket.field3336};
	}
}
