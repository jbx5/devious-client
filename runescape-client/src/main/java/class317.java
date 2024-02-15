import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public final class class317 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 4265980981988299735L
	)
	static long field3452;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -862621412235294415L
	)
	static long field3451;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 263905059
	)
	static int field3456;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -766053417
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Luh;B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	static Object method6067(class521 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5127) {
			case 0:
				return Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "910821399"
	)
	static final void method6071(int var0, int var1, int var2, int var3) {
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

				if (var22 == VarpDefinition.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			Occluder.drawActor2d((Actor)var22, var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var6 != -1) {
			Occluder.drawActor2d(VarpDefinition.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			Occluder.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
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
					if (var11 + 2 > Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] && var11 - var13 < Client.overheadTextYs[var21] + 2 && var10 - var12 < Client.overheadTextXs[var21] + Client.overheadTextXOffsets[var21] && var10 + var12 > Client.overheadTextXs[var21] - Client.overheadTextXOffsets[var21] && Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] < var11) {
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
					var16 = Client.field758[Client.overheadTextColors[var9]];
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
				if (Client.overheadTextColors[var9] == 12 && Client.field637[var9] == null) {
					var17 = var15.length();
					Client.field637[var9] = new int[var17];

					for (var18 = 0; var18 < var17; ++var18) {
						int var19 = (int)((float)var18 / (float)var17 * 64.0F);
						int var20 = var19 << 10 | 896 | 64;
						Client.field637[var9][var18] = class485.field4904[var20];
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					class166.fontBold12.method7917(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field637[var9]);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					class166.fontBold12.method7850(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field637[var9]);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					class166.fontBold12.method7883(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field637[var9]);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					class166.fontBold12.method7852(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9], Client.field637[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class166.fontBold12.stringWidth(var15) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class166.fontBold12.method7854(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field637[var9]);
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

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class166.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class166.fontBold12.method7917(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field637[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class166.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "921272258"
	)
	static final void method6072() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
					String var2 = Client.menuTargets[var1];
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
					Client.menuTargets[var1 + 1] = var2;
					String var3 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var3;
					int var4 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var4;
					var4 = Client.menuArguments1[var1];
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
					Client.menuArguments1[var1 + 1] = var4;
					var4 = Client.menuArguments2[var1];
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
					Client.menuArguments2[var1 + 1] = var4;
					var4 = Client.menuIdentifiers[var1];
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
					Client.menuIdentifiers[var1 + 1] = var4;
					var4 = Client.menuItemIds[var1];
					Client.menuItemIds[var1] = Client.menuItemIds[var1 + 1];
					Client.menuItemIds[var1 + 1] = var4;
					boolean var5 = Client.menuShiftClick[var1];
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					Client.menuShiftClick[var1 + 1] = var5;
					var0 = false;
				}
			}
		}

	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "96"
	)
	static String method6073(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class106.field1372 != null) {
			var3 = "/p=" + class106.field1372;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + WorldMapCacheName.clientLanguage + "/a=" + class403.field4531 + var3 + "/";
	}
}
