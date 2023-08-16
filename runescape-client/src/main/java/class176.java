import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class176 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lch;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	public UrlRequest field1879;
	@ObfuscatedName("ae")
	public float[] field1880;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class176(class170 var1) {
		this.this$0 = var1;
		this.field1880 = new float[4];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Llg;",
		garbageValue = "-1051328819"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3313, ServerPacket.field3331, ServerPacket.LOGOUT, ServerPacket.PROJECTILE_SPAWN, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.IF_SETANGLE, ServerPacket.field3309, ServerPacket.field3284, ServerPacket.field3248, ServerPacket.field3241, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SETPOSITION, ServerPacket.MINIMAP_TOGGLE, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SETMODEL, ServerPacket.field3314, ServerPacket.field3249, ServerPacket.field3250, ServerPacket.IF_SETOBJECT, ServerPacket.field3252, ServerPacket.field3253, ServerPacket.field3254, ServerPacket.MESSAGE_GAME, ServerPacket.MESSAGE_PRIVATE, ServerPacket.VARP_SMALL, ServerPacket.field3258, ServerPacket.field3259, ServerPacket.LOGOUT_FULL, ServerPacket.field3261, ServerPacket.field3339, ServerPacket.PLAYER_INFO, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3265, ServerPacket.field3266, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3269, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3271, ServerPacket.field3240, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.VARP_LARGE, ServerPacket.field3276, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3278, ServerPacket.UPDATE_STAT, ServerPacket.field3280, ServerPacket.MIDI_SONG, ServerPacket.field3282, ServerPacket.URL_OPEN, ServerPacket.field3302, ServerPacket.field3286, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.IF_SETHIDE, ServerPacket.field3288, ServerPacket.field3297, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.HINT_ARROW, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.CAM_RESET, ServerPacket.field3336, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_INV_FULL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3301, ServerPacket.REBUILD_NORMAL, ServerPacket.field3303, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3244, ServerPacket.field3340, ServerPacket.field3289, ServerPacket.CAM_LOOKAT, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.IF_CLOSESUB, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.EVENT_WORLDHOP, ServerPacket.IF_MOVESUB, ServerPacket.NPC_SPOTANIM, ServerPacket.UPDATE_UID192, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3318, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.CAM_SETANGLE, ServerPacket.field3307, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3260, ServerPacket.IF_SETCOLOUR, ServerPacket.field3233, ServerPacket.field3321, ServerPacket.field3287, ServerPacket.field3262, ServerPacket.field3329, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3272, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3333, ServerPacket.field3334, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3345, ServerPacket.field3325, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3251, ServerPacket.SET_PLAYER_OP, ServerPacket.field3341, ServerPacket.field3274, ServerPacket.field3343, ServerPacket.field3344, ServerPacket.field3247, ServerPacket.field3346, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3350, ServerPacket.field3351, ServerPacket.field3327, ServerPacket.REBUILD_REGION, ServerPacket.field3354};
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1840256196"
	)
	static final String method3493(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
