import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class172 {
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ap")
	@Export("Tiles_hue")
	static int[] Tiles_hue;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILin;Lij;Liq;I)Z",
		garbageValue = "135723678"
	)
	static final boolean method3519(int var0, int var1, RouteStrategy var2, CollisionMap var3, class217 var4) {
		int var5 = var4.method4236();
		int var6 = var4.method4237();
		int[][] var7 = var4.method4260();
		int[][] var8 = var4.method4238();
		int[] var9 = var4.method4240();
		int[] var10 = var4.method4241();
		int var11 = var4.method4242();
		int var12 = var0;
		int var13 = var1;
		int var14 = var5 >> 1;
		int var15 = var6 >> 1;
		int var16 = var0 - var14;
		int var17 = var1 - var15;
		var8[var14][var15] = 99;
		var7[var14][var15] = 0;
		byte var18 = 0;
		int var19 = 0;
		var9[var18] = var0;
		byte var10001 = var18;
		int var24 = var18 + 1;
		var10[var10001] = var1;
		int[][] var20 = var3.flags;

		while (var19 != var24) {
			var12 = var9[var19];
			var13 = var10[var19];
			var19 = var19 + 1 & var11;
			var14 = var12 - var16;
			var15 = var13 - var17;
			int var21 = var12 - var3.xInset;
			int var22 = var13 - var3.yInset;
			if (var2.hasArrived(1, var12, var13, var3)) {
				var4.method4233(var12, var13);
				return true;
			}

			int var23 = var7[var14][var15] + 1;
			if (var14 > 0 && var8[var14 - 1][var15] == 0 && (var20[var21 - 1][var22] & 19136776) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15] = 2;
				var7[var14 - 1][var15] = var23;
			}

			if (var14 < var5 - 1 && var8[var14 + 1][var15] == 0 && (var20[var21 + 1][var22] & 19136896) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15] = 8;
				var7[var14 + 1][var15] = var23;
			}

			if (var15 > 0 && var8[var14][var15 - 1] == 0 && (var20[var21][var22 - 1] & 19136770) == 0) {
				var9[var24] = var12;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14][var15 - 1] = 1;
				var7[var14][var15 - 1] = var23;
			}

			if (var15 < var6 - 1 && var8[var14][var15 + 1] == 0 && (var20[var21][var22 + 1] & 19136800) == 0) {
				var9[var24] = var12;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14][var15 + 1] = 4;
				var7[var14][var15 + 1] = var23;
			}

			if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && (var20[var21 - 1][var22 - 1] & 19136782) == 0 && (var20[var21 - 1][var22] & 19136776) == 0 && (var20[var21][var22 - 1] & 19136770) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15 - 1] = 3;
				var7[var14 - 1][var15 - 1] = var23;
			}

			if (var14 < var5 - 1 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 19136899) == 0 && (var20[var21 + 1][var22] & 19136896) == 0 && (var20[var21][var22 - 1] & 19136770) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13 - 1;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15 - 1] = 9;
				var7[var14 + 1][var15 - 1] = var23;
			}

			if (var14 > 0 && var15 < var6 - 1 && var8[var14 - 1][var15 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 19136824) == 0 && (var20[var21 - 1][var22] & 19136776) == 0 && (var20[var21][var22 + 1] & 19136800) == 0) {
				var9[var24] = var12 - 1;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14 - 1][var15 + 1] = 6;
				var7[var14 - 1][var15 + 1] = var23;
			}

			if (var14 < var5 - 1 && var15 < var6 - 1 && var8[var14 + 1][var15 + 1] == 0 && (var20[var21 + 1][var22 + 1] & 19136992) == 0 && (var20[var21 + 1][var22] & 19136896) == 0 && (var20[var21][var22 + 1] & 19136800) == 0) {
				var9[var24] = var12 + 1;
				var10[var24] = var13 + 1;
				var24 = var24 + 1 & var11;
				var8[var14 + 1][var15 + 1] = 12;
				var7[var14 + 1][var15 + 1] = var23;
			}
		}

		var4.method4233(var12, var13);
		return false;
	}
}
