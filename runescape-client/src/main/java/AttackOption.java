import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1366(2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	field1364(4);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 247176547
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	public static int method2841(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "1205977458"
	)
	public static void method2842(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2842(var0, var1, var2, var5 - 1);
			method2842(var0, var1, var5 + 1, var3);
		}

	}
}
