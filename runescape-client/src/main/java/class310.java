import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public abstract class class310 implements class312 {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 935359149
	)
	protected int field3279;

	@ObfuscatedSignature(
		descriptor = "(Lob;Lpx;I)V"
	)
	protected class310(StudioGame var1, Language var2, int var3) {
		this.field3279 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "-1207228854"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3442, ServerPacket.field3434, ServerPacket.field3435, ServerPacket.field3473, ServerPacket.field3437, ServerPacket.field3438, ServerPacket.field3439, ServerPacket.field3440, ServerPacket.field3441, ServerPacket.field3484, ServerPacket.field3540, ServerPacket.field3570, ServerPacket.field3445, ServerPacket.field3446, ServerPacket.field3447, ServerPacket.field3448, ServerPacket.field3517, ServerPacket.field3450, ServerPacket.field3472, ServerPacket.field3549, ServerPacket.field3453, ServerPacket.field3454, ServerPacket.field3455, ServerPacket.field3511, ServerPacket.field3457, ServerPacket.field3458, ServerPacket.field3557, ServerPacket.field3460, ServerPacket.field3461, ServerPacket.field3462, ServerPacket.field3463, ServerPacket.field3464, ServerPacket.field3558, ServerPacket.field3466, ServerPacket.field3452, ServerPacket.field3468, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3471, ServerPacket.field3509, ServerPacket.field3533, ServerPacket.field3474, ServerPacket.field3465, ServerPacket.field3564, ServerPacket.field3451, ServerPacket.field3478, ServerPacket.field3506, ServerPacket.field3488, ServerPacket.field3481, ServerPacket.field3482, ServerPacket.field3565, ServerPacket.field3541, ServerPacket.field3485, ServerPacket.field3486, ServerPacket.field3487, ServerPacket.field3476, ServerPacket.field3489, ServerPacket.field3497, ServerPacket.field3491, ServerPacket.field3492, ServerPacket.field3499, ServerPacket.field3494, ServerPacket.field3495, ServerPacket.field3496, ServerPacket.field3566, ServerPacket.field3498, ServerPacket.field3513, ServerPacket.field3480, ServerPacket.field3501, ServerPacket.field3502, ServerPacket.field3490, ServerPacket.field3504, ServerPacket.field3505, ServerPacket.field3526, ServerPacket.field3507, ServerPacket.field3508, ServerPacket.field3512, ServerPacket.field3510, ServerPacket.field3521, ServerPacket.field3443, ServerPacket.field3459, ServerPacket.field3467, ServerPacket.field3515, ServerPacket.field3516, ServerPacket.field3524, ServerPacket.field3531, ServerPacket.field3514, ServerPacket.field3520, ServerPacket.field3433, ServerPacket.field3522, ServerPacket.field3523, ServerPacket.field3477, ServerPacket.field3525, ServerPacket.field3537, ServerPacket.field3527, ServerPacket.field3528, ServerPacket.field3479, ServerPacket.field3530, ServerPacket.field3483, ServerPacket.field3532, ServerPacket.field3500, ServerPacket.field3534, ServerPacket.field3535, ServerPacket.field3536, ServerPacket.field3444, ServerPacket.field3518, ServerPacket.field3539, ServerPacket.field3449, ServerPacket.field3546, ServerPacket.field3542, ServerPacket.field3456, ServerPacket.field3544, ServerPacket.field3545, ServerPacket.field3475, ServerPacket.field3547, ServerPacket.field3548, ServerPacket.field3436, ServerPacket.field3550, ServerPacket.field3551, ServerPacket.field3552, ServerPacket.field3553, ServerPacket.field3554, ServerPacket.field3555, ServerPacket.field3556, ServerPacket.field3529, ServerPacket.field3493, ServerPacket.field3559, ServerPacket.field3560, ServerPacket.field3561, ServerPacket.field3519, ServerPacket.field3563, ServerPacket.field3503, ServerPacket.field3538, ServerPacket.field3562, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.field3569};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "1"
	)
	static void method6339(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = var0[0] * (var0[0] - 2.0F + var0[1]) + var0[1] * (var0[1] - 2.0F) + 1.0F;
			if (class133.field1561 + var1 > 0.0F) {
				class180.method3807(var0);
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lny;B)I",
		garbageValue = "5"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	static void method6340() {
		for (int var0 = 0; var0 < Client.field809.size(); ++var0) {
			int var2 = (Integer)Client.field809.get(var0);
			class145 var3 = GameEngine.method658(var2);
			int var1;
			if (var3 == null) {
				var1 = 2;
			} else {
				var1 = var3.method3396() ? 0 : 1;
			}

			if (var1 != 2) {
				Client.field809.remove(var0);
				--var0;
			}
		}

	}
}
