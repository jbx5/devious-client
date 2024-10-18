import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
public class class171 {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1849;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-235828725"
	)
	static int method3807(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class96.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class153.method3590(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class96.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class155.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class96.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = UserComparator8.method3269(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class158.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class198.topLevelWorldView.plane;
					var4 = (SpriteMask.localPlayer.x >> 7) + class198.topLevelWorldView.baseX;
					var5 = (SpriteMask.localPlayer.y >> 7) + class198.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Coord.method6849(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Coord.method6845(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Coord.method6862(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Coord.method6882(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class153.method3590(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class155.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = UserComparator8.method3269(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class96.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
					int var7 = Coord.method6849(var5, var4, var6);
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.field706;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.field723;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.field647[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Client.field633;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "658500742"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
