import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
public class class28 {
	@ObfuscatedName("da")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmn;",
		garbageValue = "-900026794"
	)
	public static class319[] method424() {
		return new class319[]{class319.field3385, class319.field3375, class319.field3377, class319.field3378, class319.field3379, class319.field3380, class319.field3387, class319.field3384, class319.field3383, class319.field3388, class319.field3382};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1216078449"
	)
	static int method422(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		}

		class324.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class17.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
				Message.method1187(var3, class17.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (var3.field3902 == null) {
					throw new RuntimeException("");
				} else {
					Player.method2383(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				class13.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				if (var3.field3902 == null) {
					throw new RuntimeException("");
				} else {
					RouteStrategy.method4504(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (var3.field3902 == null) {
					throw new RuntimeException("");
				} else {
					JagNetThread.method7358(var3, class17.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class13.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = KeyHandler.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3871 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3871;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIII)V",
		garbageValue = "42083710"
	)
	static final void method423(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.field1157 != Client.localPlayerIndex) {
			if (Client.menuOptionsCount < 400) {
				String var5;
				if (var0.field1141 == 0) {
					var5 = var0.field1139[0] + var0.username + var0.field1139[1] + class315.method6164(var0.field1147, class17.localPlayer.field1147) + " " + " (" + "level-" + var0.field1147 + ")" + var0.field1139[2];
				} else {
					var5 = var0.field1139[0] + var0.username + var0.field1139[1] + " " + " (" + "skill-" + var0.field1141 + ")" + var0.field1139[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					class194.method3796("Use", Client.field545 + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 8) == 8) {
						class194.method3796(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.overheadText[var6] != null) {
							short var7 = 0;
							if (Client.overheadText[var6].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.field1384 == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.field1147 > class17.localPlayer.field1147) {
									var7 = 2000;
								}

								if (class17.localPlayer.field1164 != 0 && var0.field1164 != 0) {
									if (var0.field1164 == class17.localPlayer.field1164) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1390 && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.field660[var6] + var7;
							class194.method3796(Client.overheadText[var6], HttpAuthenticationHeader.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menuOptionsCount; ++var6) {
					if (Client.menuOpcodes[var6] == 23) {
						Client.menuTargets[var6] = HttpAuthenticationHeader.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
