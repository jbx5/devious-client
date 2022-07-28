import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("kw")
public class class306 {
	@ObfuscatedName("au")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;

	@ObfuscatedName("jm")
	@ObfuscatedGetter(intValue = -511581281)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		int var0 = 0;
		int var1 = 0;
		class302[] var2 = new class302[]{ class302.field3600, class302.field3597 };
		class302[] var3 = var2;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			class302 var5 = var3[var4];
			if (var5.field3601 > var0) {
				var0 = var5.field3601;
			}
			if (var5.field3599 > var1) {
				var1 = var5.field3599;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)Z", garbageValue = "990903620")
	static boolean method5768(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();
			for (int var7 = 0; var7 < var6; ++var7) {
				int var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == 45) {
						var3 = true;
						continue;
					}
					if (var8 == 43) {
						continue;
					}
				}
				if (var8 >= 48 && var8 <= 57) {
					var8 -= 48;
				} else if (var8 >= 65 && var8 <= 90) {
					var8 -= 55;
				} else {
					if (var8 < 97 || var8 > 122) {
						return false;
					}
					var8 -= 87;
				}
				if (var8 >= var1) {
					return false;
				}
				if (var3) {
					var8 = -var8;
				}
				int var9 = var8 + var5 * var1;
				if (var9 / var1 != var5) {
					return false;
				}
				var5 = var9;
				var4 = true;
			}
			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)[Ldi;", garbageValue = "1858590333")
	static class123[] method5767() {
		return new class123[]{ class123.field1511, class123.field1503, class123.field1504, class123.field1505, class123.field1506, class123.field1507, class123.field1508, class123.field1509, class123.field1510 };
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1403137252")
	static final int method5765(int var0, int var1) {
		int var2 = class439.method7671('넵' + var0, 91923 + var1, 4) - 128 + (class439.method7671(var0 + 10294, '鎽' + var1, 2) - 128 >> 1) + (class439.method7671(var0, var1, 1) - 128 >> 2);
		var2 = ((int) (0.3 * ((double) (var2)))) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}
		return var2;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-794324664")
	static boolean method5766() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}