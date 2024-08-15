import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 8020472437427463609L
	)
	long field4846;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 6915062178235874085L
	)
	long field4845;
	@ObfuscatedName("an")
	public boolean field4839;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6742558613789220293L
	)
	long field4838;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -4354866474639807921L
	)
	long field4841;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -5174050983737845177L
	)
	long field4842;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1681461677
	)
	int field4837;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2133889727
	)
	int field4844;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1465814133
	)
	int field4840;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 21385459
	)
	int field4843;

	public Timer() {
		this.field4846 = -1L;
		this.field4845 = -1L;
		this.field4839 = false;
		this.field4838 = 0L;
		this.field4841 = 0L;
		this.field4842 = 0L;
		this.field4837 = 0;
		this.field4844 = 0;
		this.field4840 = 0;
		this.field4843 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public void method8417() {
		this.field4846 = RouteStrategy.method5439();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-890466419"
	)
	public void method8426() {
		if (-1L != this.field4846) {
			this.field4841 = RouteStrategy.method5439() - this.field4846;
			this.field4846 = -1L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-396836287"
	)
	public void method8424(int var1) {
		this.field4845 = RouteStrategy.method5439();
		this.field4837 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1794036815"
	)
	public void method8403() {
		if (this.field4845 != -1L) {
			this.field4838 = RouteStrategy.method5439() - this.field4845;
			this.field4845 = -1L;
		}

		++this.field4840;
		this.field4839 = true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1730511297"
	)
	public void method8404() {
		this.field4839 = false;
		this.field4844 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1297092990"
	)
	public void method8423() {
		this.method8403();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1684366549"
	)
	@Export("write")
	public void write(Buffer var1) {
		SpriteMask.method6493(var1, this.field4841);
		SpriteMask.method6493(var1, this.field4838);
		SpriteMask.method6493(var1, this.field4842);
		var1.writeShort(this.field4837);
		var1.writeShort(this.field4844);
		var1.writeShort(this.field4840);
		var1.writeShort(this.field4843);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Luc;",
		garbageValue = "2034593431"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5321.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9505(new Buffer(var2));
			}

			var1.method9509();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lob;III)[Lvc;",
		garbageValue = "-1263994215"
	)
	public static SpritePixels[] method8427(AbstractArchive var0, int var1, int var2) {
		if (!class415.method7697(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class563.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class563.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = class563.SpriteBuffer_spriteHeight;
				var6.xOffset = class149.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class563.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class563.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class372.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subHeight * var6.subWidth;
				byte[] var8 = class563.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = RouteStrategy.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class149.SpriteBuffer_xOffsets = null;
			class563.SpriteBuffer_yOffsets = null;
			class563.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			RouteStrategy.SpriteBuffer_spritePalette = null;
			class563.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIB)V",
		garbageValue = "-19"
	)
	static final void method8412(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = var0.playerUpdateManager.playerCount;
		int[] var9 = var0.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.npcCount; ++var10) {
			Object var23;
			if (var10 < var8) {
				var23 = var0.players[var9[var10]];
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == class253.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = var0.npcs[var0.npcIndices[var10 - var8]];
			}

			class92.drawActor2d(var0, (Actor)var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			class92.drawActor2d(var0, class253.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			class92.drawActor2d(var0, var0.players[Client.combatTargetPlayerIndex], var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < Client.overheadTextCount; ++var10) {
			int var11 = Client.overheadTextXs[var10];
			int var12 = Client.overheadTextYs[var10];
			int var13 = Client.overheadTextXOffsets[var10];
			int var14 = Client.overheadTextAscents[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXs[var22] + Client.overheadTextXOffsets[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
						var12 = Client.overheadTextYs[var22] - Client.overheadTextAscents[var22];
						var15 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var10];
			Client.viewportTempY = Client.overheadTextYs[var10] = var12;
			String var16 = Client.overheadText[var10];
			if (Client.chatEffects == 0) {
				int var17 = 16776960;
				if (Client.overheadTextColors[var10] < 6) {
					var17 = Client.field687[Client.overheadTextColors[var10]];
				}

				if (Client.overheadTextColors[var10] == 6) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var10] == 7) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var10] == 8) {
					var17 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.overheadTextColors[var10] == 9) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var10] == 10) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var10] == 11) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.overheadTextColors[var10] == 12 && Client.field616[var10] == null) {
					var18 = var16.length();
					Client.field616[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)((float)var19 / (float)var18 * 64.0F);
						int var21 = var20 << 10 | 896 | 64;
						Client.field616[var10][var19] = class499.field5055[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					WorldMapLabelSize.fontBold12.method8171(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field616[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					WorldMapLabelSize.fontBold12.method8169(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field616[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					WorldMapLabelSize.fontBold12.method8170(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field616[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					WorldMapLabelSize.fontBold12.method8191(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var10], Client.field616[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (WorldMapLabelSize.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					WorldMapLabelSize.fontBold12.method8172(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field616[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (Client.overheadTextEffects[var10] == 5) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - WorldMapLabelSize.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					WorldMapLabelSize.fontBold12.method8171(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field616[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				WorldMapLabelSize.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
