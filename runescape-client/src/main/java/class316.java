import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ma")
public final class class316 {
	@ObfuscatedName("af")
	static final HashMap field3466;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		field3466 = new HashMap();
		TimeZone var0;
		synchronized(field3466) {
			TimeZone var2 = (TimeZone)field3466.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3466.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmf;",
		garbageValue = "-1958860708"
	)
	static class314[] method5942() {
		return new class314[]{class314.field3457, class314.field3450, class314.field3453, class314.field3451, class314.field3454, class314.field3455, class314.field3449, class314.field3448};
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1009527792"
	)
	static int method5941(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class184.method3662(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = World.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = UserComparator8.method2872(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = FriendsChat.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class172.Client_plane;
					var4 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
					var5 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					HttpRequestTask.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class184.method3662(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					HttpRequestTask.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = World.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					HttpRequestTask.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = UserComparator8.method2872(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					HttpRequestTask.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.field795;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.field525;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.field656[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
