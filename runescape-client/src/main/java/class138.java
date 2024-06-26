import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
public class class138 implements class129 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "74722071"
	)
	public static void method3192() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lft;",
		garbageValue = "1133821230"
	)
	public static class142 method3190(int var0) {
		class142 var1 = (class142)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = class177.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = WorldMapLabelSize.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535);
			class142 var2;
			if (var6 == null) {
				var5 = false;
				var2 = null;
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
				byte[] var8 = var4.getFile(var7, 0);
				if (var8 == null) {
					var5 = false;
				}

				if (!var5) {
					var2 = null;
				} else {
					if (class142.field1655 == null) {
						class142.field1649 = Runtime.getRuntime().availableProcessors();
						class142.field1655 = new ThreadPoolExecutor(0, class142.field1649, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class142.field1649 * 100 + 100), new class173());
					}

					try {
						var2 = new class142(var3, var4, var0, false);
					} catch (Exception var10) {
						var2 = null;
					}
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "854971823"
	)
	static int method3191(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class130.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class188.method3687(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class130.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class31.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class130.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class165.method3467(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapCacheName.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class511.topLevelWorldView.plane;
					var4 = (SoundCache.localPlayer.x >> 7) + class511.topLevelWorldView.baseX;
					var5 = (SoundCache.localPlayer.y >> 7) + class511.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6460(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6468(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6469(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6474(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class188.method3687(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class31.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class165.method3467(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class130.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
					int var7 = Coord.method6460(var5, var4, var6);
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 + var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field519;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field807;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field775[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
