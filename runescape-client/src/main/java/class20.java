import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class20 implements Callable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	final class10 field107;

	@ObfuscatedSignature(descriptor = 
	"Ld;")

	final class14 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ld;Lr;)V")

	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field107 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field107.method86()) {
				class93.method2384(10L);
			} 
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field107.method81();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;IIIIIIB)V", garbageValue = 
	"1")

	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = (var2 + var4) + 932731;
						int var12 = (var3 + var5) + 556238;
						int var13 = ((UserComparator9.method2615(45365 + var11, var12 + 91923, 4) - 128) + ((UserComparator9.method2615(10294 + var11, 37821 + var12, 2) - 128) >> 1)) + ((UserComparator9.method2615(var11, var12, 1) - 128) >> 2);
						var13 = ((int) (0.3 * ((double) (var13)))) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = (-var13) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = (-var8) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - (var8 * 8);
					}
					break;
				}

				if (var7 <= 49) {
					class14.Tiles_overlays[var1][var2][var3] = var0.readByte();
					class147.Tiles_shapes[var1][var2][var3] = ((byte) ((var7 - 2) / 4));
					Tiles.field983[var1][var2][var3] = ((byte) (((var7 - 2) + var6) & 3));
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = ((byte) (var7 - 49));
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = ((byte) (var7 - 81));
				}
			} 
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			} 
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(descriptor = 
	"(Lcz;IIII)V", garbageValue = 
	"1063086800")

	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (GrandExchangeEvents.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = (var0.actions[0] + var0.username) + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = GrandExchangeEvents.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < (-9)) {
						var6 = UserComparator9.colorStartTag(16711680);
					} else if (var9 < (-6)) {
						var6 = UserComparator9.colorStartTag(16723968);
					} else if (var9 < (-3)) {
						var6 = UserComparator9.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = UserComparator9.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = UserComparator9.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = UserComparator9.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = UserComparator9.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = UserComparator9.colorStartTag(12648192);
					} else {
						var6 = UserComparator9.colorStartTag(16776960);
					}

					var4 = ((((((var5 + var6) + " ") + " (") + "level-") + var0.combatLevel) + ")") + var0.actions[2];
				} else {
					var4 = (((((((var0.actions[0] + var0.username) + var0.actions[1]) + " ") + " (") + "skill-") + var0.skillLevel) + ")") + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					class21.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + UserComparator9.colorStartTag(16777215)) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class17.selectedSpellFlags & 8) == 8) {
						class21.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + UserComparator9.colorStartTag(16777215)) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if ((AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption) || ((Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels) && (var0.combatLevel > GrandExchangeEvents.localPlayer.combatLevel))) {
									var11 = 2000;
								}

								if ((GrandExchangeEvents.localPlayer.team != 0) && (var0.team != 0)) {
									if (var0.team == GrandExchangeEvents.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if ((Client.playerAttackOption == AttackOption.field1263) && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							class21.insertMenuItemNoShift(Client.playerMenuActions[var10], UserComparator9.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = UserComparator9.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-124")

	static final void method294() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field842 = true;

		for (InterfaceParent var1 = ((InterfaceParent) (Client.interfaceParents.first())); var1 != null; var1 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			if ((var1.type == 0) || (var1.type == 3)) {
				Script.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class346.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field842 = false;
	}
}