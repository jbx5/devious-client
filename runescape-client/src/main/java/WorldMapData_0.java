import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1035251675"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3024.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "81"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2981 = new byte[super.planes][64][64];
		super.field2992 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class271.field3021.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return var2.regionX == super.regionX && var2.regionY == super.regionY;
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2074287323"
	)
	static void method5080() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			SongTask.leftTitleSprite = null;
			ScriptFrame.rightTitleSprite = null;
			Login.logoSprite = null;
			class304.title_muteSprite = null;
			WorldMapLabelSize.options_buttons_0Sprite = null;
			class11.options_buttons_2Sprite = null;
			class131.worldSelectBackSprites = null;
			class292.worldSelectFlagSprites = null;
			class30.worldSelectArrows = null;
			class218.worldSelectStars = null;
			class465.field4784 = null;
			class165.loginScreenRunesAnimation.method2459();
			RouteStrategy.method4227(0, 100);
			NewArchiveStuff var0 = class153.field1700;
			var0.method6845(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lpc;I)V",
		garbageValue = "-548197541"
	)
	static void method5082(Font var0, Font var1) {
		int var4;
		int var5;
		if (class131.worldSelectBackSprites == null) {
			Archive var3 = class386.archive8;
			SpritePixels[] var2;
			if (!var3.isValidFileName("sl_back", "")) {
				var2 = null;
			} else {
				var4 = var3.getGroupId("sl_back");
				var5 = var3.getFileId(var4, "");
				var2 = class453.method8339(var3, var4, var5);
			}

			class131.worldSelectBackSprites = var2;
		}

		if (class292.worldSelectFlagSprites == null) {
			class292.worldSelectFlagSprites = DesktopPlatformInfoProvider.method8449(class386.archive8, "sl_flags", "");
		}

		if (class30.worldSelectArrows == null) {
			class30.worldSelectArrows = DesktopPlatformInfoProvider.method8449(class386.archive8, "sl_arrows", "");
		}

		if (class218.worldSelectStars == null) {
			class218.worldSelectStars = DesktopPlatformInfoProvider.method8449(class386.archive8, "sl_stars", "");
		}

		if (class47.worldSelectLeftSprite == null) {
			class47.worldSelectLeftSprite = class451.SpriteBuffer_getIndexedSpriteByName(class386.archive8, "leftarrow", "");
		}

		if (FontName.worldSelectRightSprite == null) {
			FontName.worldSelectRightSprite = class451.SpriteBuffer_getIndexedSpriteByName(class386.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class218.worldSelectStars != null) {
			class218.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class218.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (class30.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class30.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class30.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class30.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class30.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class30.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class30.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class30.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class30.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class30.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class30.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class131.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);

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

			var6 = (765 - var26 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var27 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class47.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class47.worldSelectLeftSprite.drawAt(8, WorldMapArchiveLoader.canvasHeight / 2 - class47.worldSelectLeftSprite.subHeight / 2);
			}

			if (FontName.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				FontName.worldSelectRightSprite.drawAt(GrandExchangeOfferTotalQuantityComparator.canvasWidth - FontName.worldSelectRightSprite.subWidth - 8, WorldMapArchiveLoader.canvasHeight / 2 - FontName.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class387.World_worlds[var16];
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
					var20 = var17.isMembersOnly() ? class108.field1384 : class108.field1389;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class108.field1386 : class108.field1391;
				} else if (var17.method1846()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class108.field1382 : class108.field1392;
				} else if (var17.method1815()) {
					var20 = var17.isMembersOnly() ? class108.field1381 : class108.field1385;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class108.field1380 : class108.field1379;
				} else if (var17.method1816()) {
					var20 = var17.isMembersOnly() ? class108.field1393 : class108.field1387;
				} else if (var17.method1817()) {
					var20 = var17.isMembersOnly() ? class108.field1390 : class108.field1377;
				}

				if (var20 == null || var20.field1388 >= class131.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class108.field1378 : class108.field1383;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) {
					Login.hoveredWorldIndex = var16;
					class131.worldSelectBackSprites[var20.field1388].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class131.worldSelectBackSprites[var20.field1388].drawAt(var12, var11);
				}

				if (class292.worldSelectFlagSprites != null) {
					class292.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var27 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var26 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class387.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var24 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var24 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var24;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
				var1.drawCentered(class387.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

		class156.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "18"
	)
	static final void method5083(String var0, int var1) {
		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteSub(var1);
		Client.packetWriter.addNode(var2);
	}
}
