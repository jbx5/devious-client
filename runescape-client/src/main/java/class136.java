import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class136 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;IIIIIII)V",
		garbageValue = "-1443303721"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var8;
		if (var7) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					if (var1 == 0) {
						int[] var15 = Tiles.Tiles_heights[0][var2];
						int var12 = var4 + 932731;
						int var13 = var5 + 556238;
						int var14 = class363.method6942(var12 + 45365, var13 + 91923, 4) - 128 + (class363.method6942(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (class363.method6942(var12, var13, 1) - 128 >> 2);
						var14 = (int)((double)var14 * 0.3D) + 35;
						if (var14 < 10) {
							var14 = 10;
						} else if (var14 > 60) {
							var14 = 60;
						}

						var15[var3] = -var14 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.readUnsignedByte();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					class141.Tiles_shapes[var1][var2][var3] = (byte)((var8 - 2) / 4);
					class208.field2278[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var8 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "521893994"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ClientPacket.method5980();
		class162.method3486();
		int var1 = class128.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					MidiPcmStream.method6190(0.9D);
				}

				if (var2 == 2) {
					MidiPcmStream.method6190(0.8D);
				}

				if (var2 == 3) {
					MidiPcmStream.method6190(0.7D);
				}

				if (var2 == 4) {
					MidiPcmStream.method6190(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class401.setMusicVolume(255);
				}

				if (var2 == 1) {
					class401.setMusicVolume(192);
				}

				if (var2 == 2) {
					class401.setMusicVolume(128);
				}

				if (var2 == 3) {
					class401.setMusicVolume(64);
				}

				if (var2 == 4) {
					class401.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					Canvas.method327(127);
				}

				if (var2 == 1) {
					Canvas.method327(96);
				}

				if (var2 == 2) {
					Canvas.method327(64);
				}

				if (var2 == 3) {
					Canvas.method327(32);
				}

				if (var2 == 4) {
					Canvas.method327(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class165.method3515(127);
				}

				if (var2 == 1) {
					class165.method3515(96);
				}

				if (var2 == 2) {
					class165.method3515(64);
				}

				if (var2 == 3) {
					class165.method3515(32);
				}

				if (var2 == 4) {
					class165.method3515(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)GrandExchangeEvents.findEnumerated(class150.method3301(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)GrandExchangeEvents.findEnumerated(class150.method3301(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
