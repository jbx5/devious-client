import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -91545537
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2093642685
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1409220733
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 1898908440981449569L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1914587565
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-2147483648"
	)
	static int method3718(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginPacket.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					VarbitComposition.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TileItem.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					TileItem.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)I",
		garbageValue = "-1066442638"
	)
	static final int method3719(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = FloorUnderlayDefinition.widgetDefinition.method6544(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Player.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class253.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = FloorUnderlayDefinition.widgetDefinition.method6544(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Player.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class143.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class253.localPlayer.x >> 7) + ConcurrentMidiTask.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (class253.localPlayer.y >> 7) + ConcurrentMidiTask.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-107"
	)
	public static void method3717(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class218.getPacketBufferNode(ClientPacket.field3304, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShortAdd(var1);
		var4.packetBuffer.writeShort(var0);
		var4.packetBuffer.writeIntIME(var3 ? Client.revision : 0);
		var4.packetBuffer.writeByteAdd(var2);
		Client.packetWriter.addNode(var4);
	}
}
