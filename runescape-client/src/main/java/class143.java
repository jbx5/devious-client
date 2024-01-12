import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public abstract class class143 extends Node {
	@ObfuscatedName("bl")
	static String field1635;

	class143() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	abstract void vmethod3531(Buffer var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	abstract void vmethod3529(ClanSettings var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Llf;",
		garbageValue = "-105"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.VARP_LARGE, ServerPacket.VARP_SMALL, ServerPacket.field3289, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3291, ServerPacket.MIDI_SONG, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3295, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3297, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.CAM_RESET, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3346, ServerPacket.field3308, ServerPacket.CAM_LOOKAT, ServerPacket.field3310, ServerPacket.field3316, ServerPacket.field3312, ServerPacket.field3285, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_STAT, ServerPacket.field3394, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.MINIMAP_TOGGLE, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_SETANGLE, ServerPacket.field3392, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3311, ServerPacket.field3326, ServerPacket.IF_CLOSESUB, ServerPacket.field3328, ServerPacket.URL_OPEN, ServerPacket.field3335, ServerPacket.field3331, ServerPacket.field3332, ServerPacket.field3382, ServerPacket.field3334, ServerPacket.IF_SETMODEL, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3337, ServerPacket.PLAYER_SPOTANIM, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3340, ServerPacket.field3341, ServerPacket.field3342, ServerPacket.field3387, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3344, ServerPacket.IF_SETPOSITION, ServerPacket.field3347, ServerPacket.field3348, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3404, ServerPacket.field3351, ServerPacket.IF_SETHIDE, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3354, ServerPacket.IF_SETCOLOUR, ServerPacket.field3323, ServerPacket.field3357, ServerPacket.field3338, ServerPacket.IF_MOVESUB, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.IF_SETANGLE, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_UID192, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3365, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3367, ServerPacket.field3381, ServerPacket.REBUILD_NORMAL, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3343, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3374, ServerPacket.field3339, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3377, ServerPacket.field3397, ServerPacket.MESSAGE_GAME, ServerPacket.field3380, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3327, ServerPacket.field3383, ServerPacket.SET_PLAYER_OP, ServerPacket.field3385, ServerPacket.PLAYER_INFO, ServerPacket.IF_SETOBJECT, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3390, ServerPacket.NPC_SPOTANIM, ServerPacket.field3363, ServerPacket.LOGOUT, ServerPacket.field3356, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3396, ServerPacket.MESSAGE_PRIVATE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3399, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3402, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3375, ServerPacket.field3321, ServerPacket.field3389, ServerPacket.field3345, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3409, ServerPacket.HINT_ARROW, ServerPacket.field3411};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "829008783"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4614) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4611) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4620) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4621) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4618 < ByteArrayPool.field4622) {
				ByteArrayPool.field4626[++ByteArrayPool.field4618 - 1] = var0;
			} else {
				if (class155.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class208.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class208.ByteArrayPool_alternativeSizes[var2] && FileSystem.ByteArrayPool_altSizeArrayCounts[var2] < class155.ByteArrayPool_arrays[var2].length) {
							class155.ByteArrayPool_arrays[var2][FileSystem.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
