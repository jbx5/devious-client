import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public abstract class class148 extends Node {
	class148() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	abstract void vmethod3619(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	abstract void vmethod3621(ClanSettings var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lml;",
		garbageValue = "1666586298"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3397, ServerPacket.REBUILD_REGION, ServerPacket.IF_SETHIDE, ServerPacket.field3384, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3386, ServerPacket.field3510, ServerPacket.REBUILD_NORMAL, ServerPacket.field3389, ServerPacket.field3390, ServerPacket.field3391, ServerPacket.IF_SETOBJECT, ServerPacket.field3479, ServerPacket.field3502, ServerPacket.field3395, ServerPacket.field3396, ServerPacket.IF_MOVESUB, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3400, ServerPacket.field3401, ServerPacket.IF_SETMODEL, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3404, ServerPacket.UPDATE_UID192, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3407, ServerPacket.field3439, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3394, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.LOGOUT, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_CLOSESUB, ServerPacket.field3415, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3432, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3419, ServerPacket.field3436, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.UPDATE_STAT, ServerPacket.field3422, ServerPacket.field3424, ServerPacket.MESSAGE_PRIVATE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3427, ServerPacket.field3494, ServerPacket.field3429, ServerPacket.field3430, ServerPacket.PLAYER_INFO, ServerPacket.IF_SETANGLE, ServerPacket.field3433, ServerPacket.IF_SETPOSITION, ServerPacket.field3435, ServerPacket.field3458, ServerPacket.field3437, ServerPacket.field3423, ServerPacket.field3428, ServerPacket.field3440, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3443, ServerPacket.VARP_LARGE, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.CAM_SETANGLE, ServerPacket.field3447, ServerPacket.field3482, ServerPacket.field3498, ServerPacket.CAM_RESET, ServerPacket.CAM_MOVETO, ServerPacket.VARP_SMALL, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3517, ServerPacket.MIDI_SONG, ServerPacket.field3456, ServerPacket.field3465, ServerPacket.MINIMAP_TOGGLE, ServerPacket.SET_PLAYER_OP, ServerPacket.field3449, ServerPacket.field3461, ServerPacket.field3462, ServerPacket.field3388, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.URL_OPEN, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3387, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.UPDATE_IGNORELIST, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3473, ServerPacket.field3474, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3476, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.IF_SETSCROLLPOS, ServerPacket.MESSAGE_GAME, ServerPacket.field3480, ServerPacket.field3481, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3501, ServerPacket.field3484, ServerPacket.REFLECTION_CHECKER, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3383, ServerPacket.field3438, ServerPacket.CAM_LOOKAT, ServerPacket.HINT_ARROW, ServerPacket.field3491, ServerPacket.field3492, ServerPacket.field3493, ServerPacket.SET_PRIVCHATMODE, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.NPC_SPOTANIM, ServerPacket.field3497, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3505, ServerPacket.field3500, ServerPacket.field3488, ServerPacket.IF_SETNPCHEAD, ServerPacket.PROJECTILE_SPAWN, ServerPacket.IF_SETCOLOUR, ServerPacket.field3471, ServerPacket.field3464, ServerPacket.LOGOUT_FULL, ServerPacket.field3508, ServerPacket.field3509, ServerPacket.field3410, ServerPacket.field3516, ServerPacket.field3512, ServerPacket.field3513, ServerPacket.field3514, ServerPacket.field3515};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "31"
	)
	static final int method3352(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1766923773"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
