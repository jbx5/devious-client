import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public final class class4 {
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 559950057
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;Lis;Z[I[ILij;I)I",
		garbageValue = "-375034258"
	)
	public static int method13(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class216 var8) {
		var8.method4234();
		int var9 = var8.method4199();
		int var10 = var8.method4216();
		int[][] var11 = var8.method4202();
		int[][] var12 = var8.method4222();
		int[] var13 = var8.method4203();
		int[] var14 = var8.method4204();
		boolean var15;
		int var17;
		int var18;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var31;
		int var33;
		int var42;
		if (var2 == 1) {
			var17 = var8.method4199();
			var18 = var8.method4216();
			int[][] var19 = var8.method4202();
			int[][] var20 = var8.method4222();
			int[] var21 = var8.method4203();
			int[] var22 = var8.method4204();
			var23 = var8.method4205();
			var24 = var0;
			var25 = var1;
			var26 = var17 >> 1;
			var27 = var18 >> 1;
			var28 = var0 - var26;
			var29 = var1 - var27;
			var20[var26][var27] = 99;
			var19[var26][var27] = 0;
			byte var30 = 0;
			var31 = 0;
			var21[var30] = var0;
			var42 = var30 + 1;
			var22[var30] = var1;
			int[][] var32 = var4.flags;

			boolean var16;
			while (true) {
				if (var42 == var31) {
					var8.method4196(var24, var25);
					var16 = false;
					break;
				}

				var24 = var21[var31];
				var25 = var22[var31];
				var31 = var31 + 1 & var23;
				var26 = var24 - var28;
				var27 = var25 - var29;
				var33 = var24 - var4.xInset;
				int var34 = var25 - var4.yInset;
				if (var3.hasArrived(1, var24, var25, var4)) {
					var8.method4196(var24, var25);
					var16 = true;
					break;
				}

				int var35 = var19[var26][var27] + 1;
				if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136776) == 0) {
					var21[var42] = var24 - 1;
					var22[var42] = var25;
					var42 = var42 + 1 & var23;
					var20[var26 - 1][var27] = 2;
					var19[var26 - 1][var27] = var35;
				}

				if (var26 < var17 - 1 && var20[var26 + 1][var27] == 0 && (var32[var33 + 1][var34] & 19136896) == 0) {
					var21[var42] = var24 + 1;
					var22[var42] = var25;
					var42 = var42 + 1 & var23;
					var20[var26 + 1][var27] = 8;
					var19[var26 + 1][var27] = var35;
				}

				if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
					var21[var42] = var24;
					var22[var42] = var25 - 1;
					var42 = var42 + 1 & var23;
					var20[var26][var27 - 1] = 1;
					var19[var26][var27 - 1] = var35;
				}

				if (var27 < var18 - 1 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
					var21[var42] = var24;
					var22[var42] = var25 + 1;
					var42 = var42 + 1 & var23;
					var20[var26][var27 + 1] = 4;
					var19[var26][var27 + 1] = var35;
				}

				if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
					var21[var42] = var24 - 1;
					var22[var42] = var25 - 1;
					var42 = var42 + 1 & var23;
					var20[var26 - 1][var27 - 1] = 3;
					var19[var26 - 1][var27 - 1] = var35;
				}

				if (var26 < var17 - 1 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) {
					var21[var42] = var24 + 1;
					var22[var42] = var25 - 1;
					var42 = var42 + 1 & var23;
					var20[var26 + 1][var27 - 1] = 9;
					var19[var26 + 1][var27 - 1] = var35;
				}

				if (var26 > 0 && var27 < var18 - 1 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
					var21[var42] = var24 - 1;
					var22[var42] = var25 + 1;
					var42 = var42 + 1 & var23;
					var20[var26 - 1][var27 + 1] = 6;
					var19[var26 - 1][var27 + 1] = var35;
				}

				if (var26 < var17 - 1 && var27 < var18 - 1 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 1] & 19136992) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) {
					var21[var42] = var24 + 1;
					var22[var42] = var25 + 1;
					var42 = var42 + 1 & var23;
					var20[var26 + 1][var27 + 1] = 12;
					var19[var26 + 1][var27 + 1] = var35;
				}
			}

			var15 = var16;
		} else if (var2 == 2) {
			var15 = LoginPacket.method5713(var0, var1, var3, var4, var8);
		} else {
			var15 = FontName.method8702(var0, var1, var2, var3, var4, var8);
		}

		int var41 = var0 - (var9 >> 1);
		var17 = var1 - (var10 >> 1);
		var18 = var8.method4197();
		int var36 = var8.method4198();
		int var37;
		int var38;
		if (!var15) {
			var37 = Integer.MAX_VALUE;
			var38 = Integer.MAX_VALUE;
			byte var39 = 10;
			var23 = var3.approxDestinationX;
			var24 = var3.approxDestinationY;
			var25 = var3.approxDestinationSizeX;
			var26 = var3.approxDestinationSizeY;

			for (var27 = var23 - var39; var27 <= var39 + var23; ++var27) {
				for (var28 = var24 - var39; var28 <= var24 + var39; ++var28) {
					var29 = var27 - var41;
					var42 = var28 - var17;
					if (var29 >= 0 && var42 >= 0 && var29 < var9 && var42 < var10 && var11[var29][var42] < 100) {
						var31 = 0;
						if (var27 < var23) {
							var31 = var23 - var27;
						} else if (var27 > var23 + var25 - 1) {
							var31 = var27 - (var25 + var23 - 1);
						}

						int var40 = 0;
						if (var28 < var24) {
							var40 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var40 = var28 - (var26 + var24 - 1);
						}

						var33 = var40 * var40 + var31 * var31;
						if (var33 < var37 || var33 == var37 && var11[var29][var42] < var38) {
							var37 = var33;
							var38 = var11[var29][var42];
							var18 = var27;
							var36 = var28;
						}
					}
				}
			}

			if (var37 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var18 && var36 == var1) {
			var6[0] = var18;
			var7[0] = var36;
			return 0;
		} else {
			byte var43 = 0;
			var13[var43] = var18;
			var37 = var43 + 1;
			var14[var43] = var36;

			int var44;
			for (var38 = var44 = var12[var18 - var41][var36 - var17]; var0 != var18 || var36 != var1; var38 = var12[var18 - var41][var36 - var17]) {
				if (var38 != var44) {
					var44 = var38;
					var13[var37] = var18;
					var14[var37++] = var36;
				}

				if ((var38 & 2) != 0) {
					++var18;
				} else if ((var38 & 8) != 0) {
					--var18;
				}

				if ((var38 & 1) != 0) {
					++var36;
				} else if ((var38 & 4) != 0) {
					--var36;
				}
			}

			var23 = 0;

			while (var37-- > 0) {
				var6[var23] = var13[var37];
				var7[var23++] = var14[var37];
				if (var23 >= var6.length) {
					break;
				}
			}

			return var23;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lui;",
		garbageValue = "693042452"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = InvDefinition.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = InvDefinition.ItemDefinition_get(var10);
			}
		}

		Model var22 = var9.getModel(1);
		if (var22 == null) {
			return null;
		} else {
			SpritePixels var23 = null;
			if (var9.noteTemplate != -1) {
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var23 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var23 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var23 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.field5184;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method4388(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.method4389();
			Rasterizer3D.method4449(16, 16);
			Rasterizer3D.clips.field2811 = false;
			if (var9.placeholderTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var22.calculateBoundsCylinder();
			var22.method4785(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method4388(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var20 = class452.ItemDefinition_fontPlain11;
				String var21;
				if (var1 < 100000) {
					var21 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var20.draw(var21, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4388(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.method4389();
			Rasterizer3D.clips.field2811 = true;
			return var8;
		}
	}
}
