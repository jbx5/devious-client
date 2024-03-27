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
		return new ServerPacket[]{ServerPacket.field3363, ServerPacket.field3323, ServerPacket.field3422, ServerPacket.field3325, ServerPacket.field3326, ServerPacket.field3327, ServerPacket.field3340, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3361, ServerPacket.field3333, ServerPacket.field3334, ServerPacket.field3386, ServerPacket.field3322, ServerPacket.field3335, ServerPacket.field3338, ServerPacket.field3376, ServerPacket.field3413, ServerPacket.field3435, ServerPacket.field3342, ServerPacket.field3421, ServerPacket.field3344, ServerPacket.field3345, ServerPacket.field3346, ServerPacket.field3377, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3350, ServerPacket.field3400, ServerPacket.field3353, ServerPacket.field3412, ServerPacket.field3354, ServerPacket.field3439, ServerPacket.field3356, ServerPacket.field3357, ServerPacket.field3358, ServerPacket.field3445, ServerPacket.field3360, ServerPacket.field3416, ServerPacket.field3351, ServerPacket.field3382, ServerPacket.field3364, ServerPacket.field3373, ServerPacket.field3366, ServerPacket.field3367, ServerPacket.field3368, ServerPacket.field3369, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3372, ServerPacket.field3424, ServerPacket.field3374, ServerPacket.field3375, ServerPacket.field3390, ServerPacket.field3407, ServerPacket.field3378, ServerPacket.field3379, ServerPacket.field3332, ServerPacket.field3362, ServerPacket.field3419, ServerPacket.field3383, ServerPacket.field3359, ServerPacket.field3385, ServerPacket.field3398, ServerPacket.field3387, ServerPacket.field3388, ServerPacket.field3389, ServerPacket.field3328, ServerPacket.field3391, ServerPacket.field3337, ServerPacket.field3393, ServerPacket.field3394, ServerPacket.field3324, ServerPacket.field3425, ServerPacket.field3397, ServerPacket.field3417, ServerPacket.field3399, ServerPacket.field3428, ServerPacket.field3355, ServerPacket.field3402, ServerPacket.field3403, ServerPacket.field3404, ServerPacket.field3405, ServerPacket.field3406, ServerPacket.field3408, ServerPacket.field3347, ServerPacket.field3384, ServerPacket.field3410, ServerPacket.field3411, ServerPacket.field3395, ServerPacket.field3380, ServerPacket.field3414, ServerPacket.field3415, ServerPacket.field3365, ServerPacket.field3336, ServerPacket.field3418, ServerPacket.field3352, ServerPacket.field3420, ServerPacket.field3381, ServerPacket.field3432, ServerPacket.field3423, ServerPacket.field3341, ServerPacket.field3339, ServerPacket.field3426, ServerPacket.field3427, ServerPacket.field3401, ServerPacket.field3429, ServerPacket.field3430, ServerPacket.field3431, ServerPacket.field3409, ServerPacket.field3433, ServerPacket.field3434, ServerPacket.field3343, ServerPacket.field3436, ServerPacket.field3437, ServerPacket.field3438, ServerPacket.field3396, ServerPacket.field3392, ServerPacket.field3441, ServerPacket.field3442, ServerPacket.field3443, ServerPacket.field3444, ServerPacket.field3440};
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
