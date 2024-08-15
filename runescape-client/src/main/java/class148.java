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
		return new ServerPacket[]{ServerPacket.field3397, ServerPacket.field3382, ServerPacket.field3468, ServerPacket.field3384, ServerPacket.field3385, ServerPacket.field3386, ServerPacket.field3510, ServerPacket.field3455, ServerPacket.field3389, ServerPacket.field3390, ServerPacket.field3391, ServerPacket.field3392, ServerPacket.field3479, ServerPacket.field3502, ServerPacket.field3395, ServerPacket.field3396, ServerPacket.field3448, ServerPacket.field3398, ServerPacket.field3399, ServerPacket.field3400, ServerPacket.field3401, ServerPacket.field3402, ServerPacket.field3403, ServerPacket.field3404, ServerPacket.field3405, ServerPacket.field3406, ServerPacket.field3407, ServerPacket.field3439, ServerPacket.field3409, ServerPacket.field3394, ServerPacket.field3411, ServerPacket.field3412, ServerPacket.field3420, ServerPacket.field3414, ServerPacket.field3415, ServerPacket.field3487, ServerPacket.field3432, ServerPacket.field3418, ServerPacket.field3419, ServerPacket.field3436, ServerPacket.field3421, ServerPacket.field3416, ServerPacket.field3422, ServerPacket.field3424, ServerPacket.field3425, ServerPacket.field3417, ServerPacket.field3427, ServerPacket.field3494, ServerPacket.field3429, ServerPacket.field3430, ServerPacket.field3431, ServerPacket.field3506, ServerPacket.field3433, ServerPacket.field3511, ServerPacket.field3435, ServerPacket.field3458, ServerPacket.field3437, ServerPacket.field3423, ServerPacket.field3428, ServerPacket.field3440, ServerPacket.field3441, ServerPacket.field3442, ServerPacket.field3443, ServerPacket.field3444, ServerPacket.field3445, ServerPacket.field3446, ServerPacket.field3447, ServerPacket.field3482, ServerPacket.field3498, ServerPacket.field3450, ServerPacket.field3451, ServerPacket.field3452, ServerPacket.field3453, ServerPacket.field3517, ServerPacket.field3413, ServerPacket.field3456, ServerPacket.field3465, ServerPacket.field3408, ServerPacket.field3459, ServerPacket.field3449, ServerPacket.field3461, ServerPacket.field3462, ServerPacket.field3388, ServerPacket.field3503, ServerPacket.field3507, ServerPacket.field3466, ServerPacket.field3467, ServerPacket.field3387, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3426, ServerPacket.field3472, ServerPacket.field3473, ServerPacket.field3474, ServerPacket.field3475, ServerPacket.field3476, ServerPacket.field3477, ServerPacket.field3478, ServerPacket.field3483, ServerPacket.field3480, ServerPacket.field3481, ServerPacket.field3381, ServerPacket.field3501, ServerPacket.field3484, ServerPacket.field3485, ServerPacket.field3434, ServerPacket.field3383, ServerPacket.field3438, ServerPacket.field3489, ServerPacket.field3490, ServerPacket.field3491, ServerPacket.field3492, ServerPacket.field3493, ServerPacket.field3495, ServerPacket.field3393, ServerPacket.field3496, ServerPacket.field3497, ServerPacket.field3460, ServerPacket.field3505, ServerPacket.field3500, ServerPacket.field3488, ServerPacket.field3454, ServerPacket.field3486, ServerPacket.field3504, ServerPacket.field3471, ServerPacket.field3464, ServerPacket.field3499, ServerPacket.field3508, ServerPacket.field3509, ServerPacket.field3410, ServerPacket.field3516, ServerPacket.field3512, ServerPacket.field3513, ServerPacket.field3514, ServerPacket.field3515};
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
