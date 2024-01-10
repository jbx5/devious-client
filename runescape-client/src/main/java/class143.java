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
		return new ServerPacket[]{ServerPacket.field3378, ServerPacket.field3286, ServerPacket.field3314, ServerPacket.field3288, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3292, ServerPacket.field3407, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.field3296, ServerPacket.field3297, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3300, ServerPacket.field3410, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3369, ServerPacket.field3346, ServerPacket.field3308, ServerPacket.field3309, ServerPacket.field3310, ServerPacket.field3316, ServerPacket.field3312, ServerPacket.field3285, ServerPacket.field3306, ServerPacket.field3315, ServerPacket.field3317, ServerPacket.field3394, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3307, ServerPacket.field3301, ServerPacket.field3392, ServerPacket.field3324, ServerPacket.field3311, ServerPacket.field3326, ServerPacket.field3313, ServerPacket.field3328, ServerPacket.field3329, ServerPacket.field3335, ServerPacket.field3331, ServerPacket.field3332, ServerPacket.field3382, ServerPacket.field3334, ServerPacket.field3413, ServerPacket.field3336, ServerPacket.field3337, ServerPacket.field3322, ServerPacket.field3412, ServerPacket.field3340, ServerPacket.field3341, ServerPacket.field3342, ServerPacket.field3387, ServerPacket.field3368, ServerPacket.field3344, ServerPacket.field3330, ServerPacket.field3347, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3404, ServerPacket.field3351, ServerPacket.field3352, ServerPacket.field3353, ServerPacket.field3354, ServerPacket.field3355, ServerPacket.field3323, ServerPacket.field3357, ServerPacket.field3338, ServerPacket.field3359, ServerPacket.field3360, ServerPacket.field3361, ServerPacket.field3362, ServerPacket.field3325, ServerPacket.field3364, ServerPacket.field3365, ServerPacket.field3366, ServerPacket.field3367, ServerPacket.field3381, ServerPacket.field3372, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3343, ServerPacket.field3405, ServerPacket.field3374, ServerPacket.field3339, ServerPacket.field3376, ServerPacket.field3377, ServerPacket.field3397, ServerPacket.field3379, ServerPacket.field3380, ServerPacket.field3406, ServerPacket.field3327, ServerPacket.field3383, ServerPacket.field3384, ServerPacket.field3385, ServerPacket.field3358, ServerPacket.field3395, ServerPacket.field3388, ServerPacket.field3350, ServerPacket.field3390, ServerPacket.field3391, ServerPacket.field3363, ServerPacket.field3393, ServerPacket.field3356, ServerPacket.field3386, ServerPacket.field3396, ServerPacket.field3293, ServerPacket.field3287, ServerPacket.field3399, ServerPacket.field3400, ServerPacket.field3401, ServerPacket.field3402, ServerPacket.field3403, ServerPacket.field3375, ServerPacket.field3321, ServerPacket.field3389, ServerPacket.field3345, ServerPacket.field3408, ServerPacket.field3409, ServerPacket.field3398, ServerPacket.field3411};
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
