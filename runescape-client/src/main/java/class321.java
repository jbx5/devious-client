import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mn")
public class class321 {
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	static Widget[] field3302;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "106"
	)
	static int method6402(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class320.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ItemContainer.method2497(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class320.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class7.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class320.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Message.method1223(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = ClientPreferences.topLevelWorldView.plane;
					var4 = (AddRequestTask.localPlayer.x >> 7) + ClientPreferences.topLevelWorldView.baseX;
					var5 = (AddRequestTask.localPlayer.y >> 7) + ClientPreferences.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Coord.method6781(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Coord.method6817(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Coord.method6786(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Coord.method6788(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ItemContainer.method2497(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class7.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Message.method1223(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class320.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
					int var7 = Coord.method6781(var5, var4, var6);
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.field648;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.field535;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.field662[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = Client.field597;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
