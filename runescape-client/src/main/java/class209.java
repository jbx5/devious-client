import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class209 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2109;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2106;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2110;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2108;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2107;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2105;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class209 field2111;

	static {
		field2109 = new class209(0, class223.field2347);
		field2106 = new class209(1, class223.field2348);
		field2110 = new class209(2, class223.field2346);
		field2108 = new class209(3, class223.field2354);
		field2107 = new class209(4, class223.field2351);
		field2105 = new class209(5, class223.field2349);
		field2111 = new class209(6, class223.field2352);
	}

	@ObfuscatedSignature(
		descriptor = "(ILij;)V"
	)
	class209(int var1, class223 var2) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lng;",
		garbageValue = "-563682826"
	)
	static GameBuild[] method3850() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[Llu;",
		garbageValue = "50"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3283, ServerPacket.IF_SETOBJECT, ServerPacket.UPDATE_UID192, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_LOOKAT, ServerPacket.PLAYER_SPOTANIM, ServerPacket.MIDI_SONG, ServerPacket.field3332, ServerPacket.field3265, ServerPacket.field3266, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3274, ServerPacket.REBUILD_REGION, ServerPacket.field3360, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3278, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3342, ServerPacket.field3273, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3281, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3282, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_STAT, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3287, ServerPacket.LOGOUT, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3376, ServerPacket.UPDATE_IGNORELIST, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3297, ServerPacket.NPC_SPOTANIM, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3383, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3303, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SETCOLOUR, ServerPacket.field3306, ServerPacket.IF_CLOSESUB, ServerPacket.VARP_SMALL, ServerPacket.field3375, ServerPacket.field3310, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3314, ServerPacket.field3315, ServerPacket.IF_SETNPCHEAD, ServerPacket.MESSAGE_GAME, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.URL_OPEN, ServerPacket.field3320, ServerPacket.SET_PLAYER_OP, ServerPacket.field3322, ServerPacket.field3323, ServerPacket.field3324, ServerPacket.field3347, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3327, ServerPacket.field3276, ServerPacket.MINIMAP_TOGGLE, ServerPacket.REBUILD_NORMAL, ServerPacket.field3331, ServerPacket.VARP_LARGE, ServerPacket.field3333, ServerPacket.field3382, ServerPacket.field3354, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3338, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_SETHIDE, ServerPacket.field3341, ServerPacket.field3293, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3344, ServerPacket.field3351, ServerPacket.field3330, ServerPacket.field3369, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3350, ServerPacket.field3264, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3355, ServerPacket.field3356, ServerPacket.field3335, ServerPacket.field3358, ServerPacket.IF_SETANGLE, ServerPacket.field3367, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3362, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.CAM_RESET, ServerPacket.IF_SETMODEL, ServerPacket.CAM_SETANGLE, ServerPacket.field3296, ServerPacket.field3346, ServerPacket.PLAYER_INFO, ServerPacket.field3370, ServerPacket.field3294, ServerPacket.field3372, ServerPacket.field3260, ServerPacket.field3378, ServerPacket.IF_MOVESUB, ServerPacket.HINT_ARROW, ServerPacket.field3381, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3373, ServerPacket.field3380, ServerPacket.field3368};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public static boolean method3851(int var0) {
		return var0 == WorldMapDecorationType.field3879.id;
	}
}
