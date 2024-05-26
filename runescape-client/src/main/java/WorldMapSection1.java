import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1316206855
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1708241963
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -52320051
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -750409921
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 651180661
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2118401763
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "45239804"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1685132689"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1460062086"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1177670631"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lnj;",
		garbageValue = "-2141859493"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-78"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1853160503"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZI)F",
		garbageValue = "-1968575974"
	)
	static float method5975(class133 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3085() != 0) {
			float var4 = (float)var0.field1582[0].field1534;
			float var5 = (float)var0.field1582[var0.method3085() - 1].field1534;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1582[0].field1531;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1600 == class131.field1569) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1600 != class131.field1573 && var0.field1600 != class131.field1568) {
						if (var0.field1600 == class131.field1566) {
							var11 = var4 - var1;
							var16 = var0.field1582[0].field1533;
							var17 = var0.field1582[0].field1532;
							var3 = var0.field1582[0].field1531;
							if (0.0D != (double)var16) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1581 == class131.field1569) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1581 != class131.field1573 && var0.field1581 != class131.field1568) {
					if (var0.field1581 == class131.field1566) {
						var11 = var1 - var5;
						var16 = var0.field1582[var0.method3085() - 1].field1535;
						var17 = var0.field1582[var0.method3085() - 1].field1536;
						var3 = var0.field1582[var0.method3085() - 1].field1531;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = ModelData0.method5452(var0, var11);
				float var18;
				if (var2 && var0.field1600 == class131.field1568) {
					var18 = var0.field1582[var0.method3085() - 1].field1531 - var0.field1582[0].field1531;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1581 == class131.field1568) {
					var18 = var0.field1582[var0.method3085() - 1].field1531 - var0.field1582[0].field1531;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "904081313"
	)
	public static void method5981() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lor;IIB)[Lvc;",
		garbageValue = "19"
	)
	public static SpritePixels[] method5980(AbstractArchive var0, int var1, int var2) {
		return !class108.method2769(var0, var1, var2) ? null : VarbitComposition.method4089();
	}
}
