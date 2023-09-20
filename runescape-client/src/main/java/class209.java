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
		return new ServerPacket[]{ServerPacket.field3283, ServerPacket.field3258, ServerPacket.field3259, ServerPacket.field3328, ServerPacket.field3261, ServerPacket.field3334, ServerPacket.field3263, ServerPacket.field3332, ServerPacket.field3265, ServerPacket.field3266, ServerPacket.field3267, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3300, ServerPacket.field3274, ServerPacket.field3272, ServerPacket.field3360, ServerPacket.field3309, ServerPacket.field3278, ServerPacket.field3271, ServerPacket.field3342, ServerPacket.field3273, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281, ServerPacket.field3326, ServerPacket.field3282, ServerPacket.field3337, ServerPacket.field3285, ServerPacket.field3286, ServerPacket.field3287, ServerPacket.field3288, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3371, ServerPacket.field3376, ServerPacket.field3345, ServerPacket.field3295, ServerPacket.field3363, ServerPacket.field3297, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3383, ServerPacket.field3301, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3306, ServerPacket.field3307, ServerPacket.field3308, ServerPacket.field3375, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3262, ServerPacket.field3314, ServerPacket.field3315, ServerPacket.field3316, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3321, ServerPacket.field3322, ServerPacket.field3323, ServerPacket.field3324, ServerPacket.field3347, ServerPacket.field3292, ServerPacket.field3327, ServerPacket.field3276, ServerPacket.field3329, ServerPacket.field3275, ServerPacket.field3331, ServerPacket.field3359, ServerPacket.field3333, ServerPacket.field3382, ServerPacket.field3354, ServerPacket.field3336, ServerPacket.field3277, ServerPacket.field3338, ServerPacket.field3339, ServerPacket.field3340, ServerPacket.field3341, ServerPacket.field3293, ServerPacket.field3343, ServerPacket.field3344, ServerPacket.field3351, ServerPacket.field3330, ServerPacket.field3369, ServerPacket.field3348, ServerPacket.field3349, ServerPacket.field3350, ServerPacket.field3264, ServerPacket.field3352, ServerPacket.field3353, ServerPacket.field3257, ServerPacket.field3355, ServerPacket.field3356, ServerPacket.field3335, ServerPacket.field3358, ServerPacket.field3366, ServerPacket.field3367, ServerPacket.field3361, ServerPacket.field3362, ServerPacket.field3284, ServerPacket.field3364, ServerPacket.field3365, ServerPacket.field3374, ServerPacket.field3296, ServerPacket.field3346, ServerPacket.field3313, ServerPacket.field3370, ServerPacket.field3294, ServerPacket.field3372, ServerPacket.field3260, ServerPacket.field3378, ServerPacket.field3377, ServerPacket.field3270, ServerPacket.field3381, ServerPacket.field3379, ServerPacket.field3373, ServerPacket.field3380, ServerPacket.field3368};
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
