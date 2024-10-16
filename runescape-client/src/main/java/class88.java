import java.util.Arrays;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class88 {
	@ObfuscatedName("wh")
	static List field1087;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CLpn;B)C",
		garbageValue = "-5"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "63"
	)
	static void method2558(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		TileItem.method3066(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < MusicPatchPcmStream.field3716.length; ++var4) {
			if (VarbitComposition.field2125[var4] != -1 && MusicPatchPcmStream.field3716[var4] == null) {
				MusicPatchPcmStream.field3716[var4] = EnumComposition.archive9.takeFile(VarbitComposition.field2125[var4], 0);
				if (MusicPatchPcmStream.field3716[var4] == null) {
					var3 = false;
				}
			}

			if (FloatProjection.field2733[var4] != -1 && class330.field3608[var4] == null) {
				class330.field3608[var4] = EnumComposition.archive9.takeFileEncrypted(FloatProjection.field2733[var4], 0, MusicPatchPcmStream.field3717[var4]);
				if (class330.field3608[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			TileItem.method3066(false);
			var3 = true;

			for (var4 = 0; var4 < MusicPatchPcmStream.field3716.length; ++var4) {
				byte[] var17 = class330.field3608[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= ChatChannel.method2472(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				class149.method3569();
				UrlRequest.method3253();
				class289.method6205();
				TileItem.method3066(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					class149.method3569();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field576[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < NPC.field1374.length; ++var14) {
									if (NPC.field1374[var14] == var13 && MusicPatchPcmStream.field3716[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										class463.method8879(var0, MusicPatchPcmStream.field3716[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								class141.method3497(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field576[0][var4][var5];
						if (var18 == -1) {
							DynamicObject.method2455(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				TileItem.method3066(true);

				for (var4 = 0; var4 < 4; ++var4) {
					class149.method3569();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field576[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < NPC.field1374.length; ++var13) {
									if (NPC.field1374[var13] == var12 && class330.field3608[var13] != null) {
										Tiles.method2515(var0, class330.field3608[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				TileItem.method3066(true);
				class149.method3569();
				class508.method9435(var0);
				TileItem.method3066(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				class149.method3569();
				class93.method2587();
				Client.field618 = false;
			}
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "456817604"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class187.method3964(var1);
		Widget var4 = class416.widgetDefinition.method6911(var0);
		class110.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class110.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		SoundCache.revalidateWidgetScroll(class416.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		LoginState.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			AbstractUserComparator.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
