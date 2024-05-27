import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class30 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field158;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static WorldView field155;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	static IndexedSprite[] field156;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmz;",
		garbageValue = "111"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.PROJECTILE_SPAWN, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3404, ServerPacket.field3519, ServerPacket.field3406, ServerPacket.field3467, ServerPacket.field3408, ServerPacket.field3409, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3411, ServerPacket.IF_SETHIDE, ServerPacket.field3413, ServerPacket.field3414, ServerPacket.CAM_RESET, ServerPacket.field3506, ServerPacket.field3464, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3493, ServerPacket.field3420, ServerPacket.field3421, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3423, ServerPacket.field3416, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3427, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_INV_FULL, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3431, ServerPacket.field3432, ServerPacket.field3433, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.IF_SETANGLE, ServerPacket.field3500, ServerPacket.PLAYER_INFO, ServerPacket.field3438, ServerPacket.field3530, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3531, ServerPacket.UPDATE_UID192, ServerPacket.field3479, ServerPacket.field3444, ServerPacket.field3445, ServerPacket.field3465, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.LOGOUT, ServerPacket.VARP_LARGE, ServerPacket.field3446, ServerPacket.field3410, ServerPacket.field3453, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3455, ServerPacket.field3422, ServerPacket.field3457, ServerPacket.IF_SETCOLOUR, ServerPacket.IF_SETOBJECT, ServerPacket.HINT_ARROW, ServerPacket.REBUILD_REGION, ServerPacket.field3462, ServerPacket.field3503, ServerPacket.CAM_LOOKAT, ServerPacket.field3405, ServerPacket.field3466, ServerPacket.field3403, ServerPacket.field3468, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3470, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3472, ServerPacket.field3448, ServerPacket.MINIMAP_TOGGLE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3476, ServerPacket.field3477, ServerPacket.field3489, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3480, ServerPacket.field3486, ServerPacket.field3482, ServerPacket.IF_MOVESUB, ServerPacket.MIDI_SONG, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3512, ServerPacket.field3487, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3502, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.IF_SETPOSITION, ServerPacket.IF_CLOSESUB, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3494, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.REBUILD_NORMAL, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETMODEL, ServerPacket.field3496, ServerPacket.field3501, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.PLAYER_SPOTANIM, ServerPacket.VARP_SMALL, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3507, ServerPacket.field3508, ServerPacket.field3509, ServerPacket.field3504, ServerPacket.field3511, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3419, ServerPacket.field3514, ServerPacket.NPC_SPOTANIM, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.URL_OPEN, ServerPacket.field3518, ServerPacket.field3527, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3522, ServerPacket.field3523, ServerPacket.SET_PLAYER_OP, ServerPacket.field3525, ServerPacket.MESSAGE_GAME, ServerPacket.field3521, ServerPacket.field3528, ServerPacket.field3490};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2122436127"
	)
	public static void method445() {
		DbRowType.DBRowType_cache.clear();
	}
}
