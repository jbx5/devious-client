import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gt")
public class class157 extends class147 {
	@ObfuscatedName("wv")
	@ObfuscatedGetter(
		intValue = -1064170701
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -731788477
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("id")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1279428031
	)
	int field1756;
	@ObfuscatedName("al")
	String field1754;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class157(class150 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1756 = var1.readInt();
		this.field1754 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3337(this.field1756, this.field1754);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-45"
	)
	static int method3312(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class13.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = MenuAction.method2118(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class13.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class151.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class13.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Login.method2126(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ObjectSound.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class358.scene.field1348;
					var4 = (class17.localPlayer.x >> 7) + class358.scene.field1337;
					var5 = (class17.localPlayer.y >> 7) + class358.scene.field1333;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = MenuAction.method2118(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class151.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Login.method2126(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class13.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.field751;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.field546;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.field669[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "1908309882"
	)
	static final void method3316(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field814 == -1) {
				Client.field814 = var0.spriteId2;
				Client.field815 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field814;
			} else {
				var0.spriteId2 = Client.field815;
			}

		} else if (var1 == 325) {
			if (Client.field814 == -1) {
				Client.field814 = var0.spriteId2;
				Client.field815 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field815;
			} else {
				var0.spriteId2 = Client.field814;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
