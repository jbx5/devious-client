import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ft")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lft;")
	field1963(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lft;")
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lft;")
	field1961(1, 2);
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 131762217)
	@Export("value")
	public final int value;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1885985175)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([FIFZFZ[FI)I", garbageValue = "1171943918")
	public static int method3534(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;
		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}
		float var24 = (Math.abs(var2) + Math.abs(var4)) * ((float) (var1 + 1)) * class114.field1429;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];
			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}
			while (Math.abs(var9[var1]) < var24) {
				--var1;
			} 
			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var22 = (var3) ? var2 < var24 + var6[0] : var2 < var6[0] - var24;
				boolean var23 = (var5) ? var4 > var6[0] - var24 : var4 > var6[0] + var24;
				var10 = (var22 && var23) ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}
				return var10;
			} else {
				class389 var11 = new class389(var9, var1);
				float[] var12 = new float[var1 + 1];
				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = ((float) (var13)) * var9[var13];
				}
				float[] var21 = new float[var1 + 1];
				int var14 = method3534(var12, var1 - 1, var2, false, var4, false, var21);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;
					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}
						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = FileSystem.method3281(var9, var1, var2);
							if (Math.abs(var18) <= var24 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}
						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var21[var20];
						}
						var17 = FileSystem.method3281(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var24) {
							if (var14 != var20 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							var6[var10++] = LoginType.method7453(var11, var16, var19, 0.0F);
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}
					return var10;
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "158220165")
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(descriptor = "(IIB)Lgu;", garbageValue = "-19")
	static RouteStrategy method3533(int var0, int var1) {
		Client.field774.approxDestinationX = var0;
		Client.field774.approxDestinationY = var1;
		Client.field774.approxDestinationSizeX = 1;
		Client.field774.approxDestinationSizeY = 1;
		return Client.field774;
	}
}