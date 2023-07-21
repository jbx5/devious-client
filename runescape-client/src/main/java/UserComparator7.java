import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public static class370 field1455;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;B)I",
		garbageValue = "92"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;B)V",
		garbageValue = "7"
	)
	public static void method2873(AbstractArchive var0, AbstractArchive var1) {
		World.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = World.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1065913503"
	)
	static final void method2869(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
			Object var22;
			if (var9 < var7) {
				var22 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var22 == class136.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			class303.drawActor2d((Actor)var22, var9, var0, var1, var2, var3);
		}

		if (Client.field766 && var6 != -1) {
			class303.drawActor2d(class136.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			class303.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var10 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var21 = 0; var21 < var9; ++var21) {
					if (var11 + 2 > Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] && var11 - var13 < Client.overheadTextYs[var21] + 2 && var10 - var12 < Client.overheadTextXs[var21] + Client.overheadTextXOffsets[var21] && var12 + var10 > Client.overheadTextXs[var21] - Client.overheadTextXOffsets[var21] && Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] < var11) {
						var11 = Client.overheadTextYs[var21] - Client.overheadTextAscents[var21];
						var14 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var15 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field744[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) {
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.overheadTextColors[var9] == 12 && Client.field638[var9] == null) {
					var17 = var15.length();
					Client.field638[var9] = new int[var17];

					for (var18 = 0; var18 < var17; ++var18) {
						int var19 = (int)((float)var18 / (float)var17 * 64.0F);
						int var20 = var19 << 10 | 896 | 64;
						Client.field638[var9][var18] = class467.field4797[var20];
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					Calendar.fontBold12.method7517(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field638[var9]);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					Calendar.fontBold12.method7477(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field638[var9]);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					Calendar.fontBold12.method7478(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field638[var9]);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					Calendar.fontBold12.method7479(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9], Client.field638[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (Calendar.fontBold12.stringWidth(var15) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					Calendar.fontBold12.method7510(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field638[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Calendar.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					Calendar.fontBold12.method7517(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field638[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				Calendar.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1051570454"
	)
	static void method2871() {
		if (Client.oculusOrbState == 1) {
			Client.field613 = true;
		}

	}
}
