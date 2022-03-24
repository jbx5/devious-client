import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class346 {
	@ObfuscatedName("v")
	static char[] field4147;
	@ObfuscatedName("o")
	static char[] field4148;
	@ObfuscatedName("h")
	static char[] field4150;
	@ObfuscatedName("g")
	static int[] field4149;
	static 
	{
		field4147 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4147[var0] = ((char) (var0 + 65));
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4147[var0] = ((char) ((var0 + 97) - 26));
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4147[var0] = ((char) ((var0 + 48) - 52));
		}

		field4147[62] = '+';
		field4147[63] = '/';
		field4148 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4148[var0] = ((char) (var0 + 65));
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4148[var0] = ((char) ((var0 + 97) - 26));
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4148[var0] = ((char) ((var0 + 48) - 52));
		}

		field4148[62] = '*';
		field4148[63] = '-';
		field4150 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4150[var0] = ((char) (var0 + 65));
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4150[var0] = ((char) ((var0 + 97) - 26));
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4150[var0] = ((char) ((var0 + 48) - 52));
		}

		field4150[62] = '-';
		field4150[63] = '_';
		field4149 = new int[128];

		for (var0 = 0; var0 < class346.field4149.length; ++var0) {
			field4149[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4149[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4149[var0] = (var0 - 97) + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4149[var0] = (var0 - 48) + 52;
		}

		int[] var2 = field4149;
		field4149[43] = 62;
		var2[42] = 62;
		int[] var1 = field4149;
		field4149[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;IZI)Lgo;", garbageValue = 
	"2016790540")

	public static Frames method6480(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lmr;Lmr;B)V", garbageValue = 
	"103")

	static void method6482(Font var0, Font var1) {
		if (class128.worldSelectBackSprites == null) {
			class128.worldSelectBackSprites = DirectByteArrayCopier.method5541(WorldMapData_1.archive8, "sl_back", "");
		}

		if (class162.worldSelectFlagSprites == null) {
			class162.worldSelectFlagSprites = class271.method5255(WorldMapData_1.archive8, "sl_flags", "");
		}

		if (Client.worldSelectArrows == null) {
			Client.worldSelectArrows = class271.method5255(WorldMapData_1.archive8, "sl_arrows", "");
		}

		if (class29.worldSelectStars == null) {
			class29.worldSelectStars = class271.method5255(WorldMapData_1.archive8, "sl_stars", "");
		}

		if (Interpreter.worldSelectLeftSprite == null) {
			Interpreter.worldSelectLeftSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "leftarrow", "");
		}

		if (class124.worldSelectRightSprite == null) {
			class124.worldSelectRightSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class29.worldSelectStars != null) {
			class29.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class29.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (Client.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 0)) {
				Client.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var2, 4);
			}

			if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 1)) {
				Client.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 0)) {
				Client.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var3, 4);
			}

			if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 1)) {
				Client.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 0)) {
				Client.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var4, 4);
			}

			if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 1)) {
				Client.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 0)) {
				Client.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var5, 4);
			}

			if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 1)) {
				Client.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", (Login.xPadding + 708) + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class128.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = (765 / (var23 + 1)) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if ((var5 * (var4 - 1)) >= World.World_count) {
					--var4;
				}

				if ((var4 * (var5 - 1)) >= World.World_count) {
					--var5;
				}

				if ((var4 * (var5 - 1)) >= World.World_count) {
					--var5;
				}
			} while ((var5 != var6) || (var7 != var4) );

			var6 = (765 - (var23 * var4)) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - (var5 * var24)) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = ((765 - (var4 * var23)) - (var6 * (var4 - 1))) / 2;
			int var9 = ((480 - (var24 * var5)) - (var7 * (var5 - 1))) / 2;
			int var10 = ((var5 + World.World_count) - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if ((Interpreter.worldSelectLeftSprite != null) && (Login.worldSelectPage > 0)) {
				Interpreter.worldSelectLeftSprite.drawAt(8, (class309.canvasHeight / 2) - (Interpreter.worldSelectLeftSprite.subHeight / 2));
			}

			if ((class124.worldSelectRightSprite != null) && (Login.worldSelectPage < Login.worldSelectPagesCount)) {
				class124.worldSelectRightSprite.drawAt((class4.canvasWidth - class124.worldSelectRightSprite.subWidth) - 8, (class309.canvasHeight / 2) - (class124.worldSelectRightSprite.subHeight / 2));
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; (var16 < World.World_count) && ((var15 - Login.worldSelectPage) < var4); ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == (-1)) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1638()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var11)) && (MouseHandler.MouseHandler_x < (var23 + var12))) && (MouseHandler.MouseHandler_y < (var11 + var24))) && var18) {
					Login.hoveredWorldIndex = var16;
					class128.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class128.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (class162.worldSelectFlagSprites != null) {
					class162.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, ((var24 / 2) + var11) + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, ((var24 / 2) + var11) + 5, 268435455, -1);
				var11 = (var11 + var24) + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = (var12 + var23) + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if ((var25 + var22) > 480) {
					var25 = (MouseHandler.MouseHandler_y - 25) - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - (var16 / 2), var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - (var16 / 2), var25, var16, var22, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, (var25 + var1.ascent) + 4, 0, -1);
			}
		}

		SpotAnimationDefinition.rasterProvider.drawFull(0, 0);
	}
}