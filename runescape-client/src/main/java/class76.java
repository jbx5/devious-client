import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class76 {
	@ObfuscatedName("ak")
	static final BigInteger field935;
	@ObfuscatedName("al")
	static final BigInteger field936;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -763033945
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 1156664192
	)
	static int field938;

	static {
		field935 = new BigInteger("10001", 16);
		field936 = new BigInteger("b6ecb07cf4c0f9d84e72bdd5d3e9ae492e386bc55f238705f6f05d8ca54ca4cc0552132507360c1aa650b16b11274aff0ef72db07b6d87276f2dd3105aeb28503f810900d3ce309c621ca62527e66855deeb6ee3be1669c5dae360e2d5cf2d61eed8ac2d52e5bb3485b5aa4735b1843295380c6e020e2fffefb8b4a9abe84019", 16);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)D",
		garbageValue = "24"
	)
	static double method2119(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var3 > 0.0D && var3 < 1.0D) {
			double var5;
			double var7;
			switch(var2) {
			case 0:
				return var3;
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var3 * var3;
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3);
			case 6:
				return var3 < 0.5D ? 2.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var3 * var3 * var3;
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D);
			case 9:
				return var3 < 0.5D ? var3 * var3 * var3 * 4.0D : 1.0D - Math.pow(2.0D + var3 * -2.0D, 3.0D) / 2.0D;
			case 10:
				return var3 * var3 * var3 * var3;
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D);
			case 12:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var3 * var3 * var3 * var3 * var3;
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D);
			case 15:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3);
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 2.70158D * var3 * var3 * var3 - var3 * 1.70158D * var3;
			case 23:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
			case 24:
				var5 = 1.70158D;
				var7 = 2.5949095D;
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (2.5949095D + 3.5949095D * (var3 * 2.0D - 2.0D)) + 2.0D) / 2.0D;
			case 25:
				var5 = 2.0943951023931953D;
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (var3 * 10.0D - 10.75D));
			case 26:
				var5 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (var3 * 10.0D - 0.75D)) + 1.0D;
			case 27:
				var5 = 1.3962634015954636D;
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D);
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D;
			default:
				return var3;
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D;
		}
	}
}
