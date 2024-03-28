import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1390124801
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1619610669
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -406311
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -284501949
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2098515701
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 617199395
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmi;",
		garbageValue = "-44"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3363, ServerPacket.field3323, ServerPacket.field3422, ServerPacket.field3325, ServerPacket.field3326, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.REBUILD_REGION, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.IF_SETMODEL, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.UPDATE_UID192, ServerPacket.MESSAGE_PRIVATE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3413, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3342, ServerPacket.LOGOUT_FULL, ServerPacket.field3344, ServerPacket.field3345, ServerPacket.VARP_SMALL, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3350, ServerPacket.field3400, ServerPacket.field3353, ServerPacket.field3412, ServerPacket.IF_SETCOLOUR, ServerPacket.MIDI_SONG, ServerPacket.CAM_RESET, ServerPacket.PLAYER_INFO, ServerPacket.field3358, ServerPacket.field3445, ServerPacket.field3360, ServerPacket.field3416, ServerPacket.field3351, ServerPacket.field3382, ServerPacket.field3364, ServerPacket.field3373, ServerPacket.field3366, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3368, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3372, ServerPacket.SET_PLAYER_OP, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.NPC_SPOTANIM, ServerPacket.REBUILD_NORMAL, ServerPacket.UPDATE_INV_FULL, ServerPacket.IF_CLOSESUB, ServerPacket.IF_SETOBJECT, ServerPacket.field3332, ServerPacket.field3362, ServerPacket.field3419, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3359, ServerPacket.field3385, ServerPacket.URL_OPEN, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.IF_SETPOSITION, ServerPacket.field3389, ServerPacket.field3328, ServerPacket.VARP_LARGE, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3393, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3324, ServerPacket.field3425, ServerPacket.field3397, ServerPacket.field3417, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3428, ServerPacket.field3355, ServerPacket.field3402, ServerPacket.CAM_LOOKAT, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3408, ServerPacket.field3347, ServerPacket.CAM_SETANGLE, ServerPacket.field3410, ServerPacket.field3411, ServerPacket.IF_MOVESUB, ServerPacket.field3380, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3365, ServerPacket.field3336, ServerPacket.field3418, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT, ServerPacket.field3432, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.UPDATE_STAT, ServerPacket.MINIMAP_TOGGLE, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3401, ServerPacket.field3429, ServerPacket.HINT_ARROW, ServerPacket.field3431, ServerPacket.field3409, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3434, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3437, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3396, ServerPacket.IF_SETANGLE, ServerPacket.IF_SETHIDE, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3443, ServerPacket.field3444, ServerPacket.field3440};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1536629727"
	)
	public static void method4876(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
