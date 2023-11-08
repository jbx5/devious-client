import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 533863423
	)
	static int field2040;
	@ObfuscatedName("ar")
	@Export("type")
	char type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -349054401
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ab")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("au")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-2107778896"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "56"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class17.method262(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-232171801"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;B)V",
		garbageValue = "74"
	)
	static void method3830(Font var0, Font var1) {
		if (class108.worldSelectBackSprites == null) {
			class108.worldSelectBackSprites = Players.method2779(GrandExchangeOfferOwnWorldComparator.archive8, "sl_back", "");
		}

		if (class130.worldSelectFlagSprites == null) {
			class130.worldSelectFlagSprites = Skills.method6857(GrandExchangeOfferOwnWorldComparator.archive8, "sl_flags", "");
		}

		if (class148.worldSelectArrows == null) {
			class148.worldSelectArrows = Skills.method6857(GrandExchangeOfferOwnWorldComparator.archive8, "sl_arrows", "");
		}

		if (class228.worldSelectStars == null) {
			class228.worldSelectStars = Skills.method6857(GrandExchangeOfferOwnWorldComparator.archive8, "sl_stars", "");
		}

		if (Varps.worldSelectLeftSprite == null) {
			Varps.worldSelectLeftSprite = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "leftarrow", "");
		}

		if (class105.worldSelectRightSprite == null) {
			class105.worldSelectRightSprite = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class228.worldSelectStars != null) {
			class228.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class228.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (class148.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class148.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class148.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class148.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class148.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class148.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class148.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class148.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class148.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class148.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class148.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class108.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var4 != var7);

			var6 = (765 - var4 * var23) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (Varps.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				Varps.worldSelectLeftSprite.drawAt(8, class47.canvasHeight / 2 - Varps.worldSelectLeftSprite.subHeight / 2);
			}

			if (class105.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class105.worldSelectRightSprite.drawAt(Language.canvasWidth - class105.worldSelectRightSprite.subWidth - 8, class47.canvasHeight / 2 - class105.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class361.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class108 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class108.field1374 : class108.field1376;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class108.field1385 : class108.field1384;
				} else if (var17.method1856()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class108.field1377 : class108.field1382;
				} else if (var17.method1858()) {
					var20 = var17.isMembersOnly() ? class108.field1372 : class108.field1378;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class108.field1373 : class108.field1370;
				} else if (var17.method1859()) {
					var20 = var17.isMembersOnly() ? class108.field1381 : class108.field1380;
				} else if (var17.method1869()) {
					var20 = var17.isMembersOnly() ? class108.field1390 : class108.field1375;
				}

				if (var20 == null || var20.field1386 >= class108.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class108.field1371 : class108.field1379;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var11 + var24 && var18) {
					Login.hoveredWorldIndex = var16;
					class108.worldSelectBackSprites[var20.field1386].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class108.worldSelectBackSprites[var20.field1386].drawAt(var12, var11);
				}

				if (class130.worldSelectFlagSprites != null) {
					class130.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var24;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class361.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(class361.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}
}
