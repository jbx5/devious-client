import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 367799447
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;I)I",
		garbageValue = "2143857721"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-996746712"
	)
	static int method3239(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FZB)F",
		garbageValue = "-106"
	)
	static float method3242(class137 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3328() != 0) {
			float var4 = (float)var0.field1607[0].field1554;
			float var5 = (float)var0.field1607[var0.method3328() - 1].field1554;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1607[0].field1555;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1605 == class135.field1591) {
						if (var9 != 0.0F) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1605 != class135.field1588 && var0.field1605 != class135.field1594) {
						if (var0.field1605 == class135.field1587) {
							var10 = var4 - var1;
							var13 = var0.field1607[0].field1556;
							var14 = var0.field1607[0].field1557;
							var3 = var0.field1607[0].field1555;
							if (0.0F != var13) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1606 == class135.field1591) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1606 != class135.field1588 && var0.field1606 != class135.field1594) {
					if (var0.field1606 == class135.field1587) {
						var10 = var1 - var5;
						var13 = var0.field1607[var0.method3328() - 1].field1558;
						var14 = var0.field1607[var0.method3328() - 1].field1559;
						var3 = var0.field1607[var0.method3328() - 1].field1555;
						if (0.0F != var13) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = DynamicObject.method2401(var0, var10);
				float var15;
				if (var2 && var0.field1605 == class135.field1594) {
					var15 = var0.field1607[var0.method3328() - 1].field1555 - var0.field1607[0].field1555;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1606 == class135.field1594) {
					var15 = var0.field1607[var0.method3328() - 1].field1555 - var0.field1607[0].field1555;
					var3 += var15 * var8;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-59"
	)
	public static int method3243(int var0) {
		class145 var1 = GameEngine.method658(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3396() ? 0 : 1;
		}
	}
}
