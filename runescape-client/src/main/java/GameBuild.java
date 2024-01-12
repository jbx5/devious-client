import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nb")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("bg")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aq")
	@Export("name")
	public final String name;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2142977125
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ap")
	static final void method6934(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "321012486"
	)
	static int method6935(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Buddy.method8383(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = EnumComposition.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class149.method3293(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = SoundSystem.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = SecureUrlRequester.Client_plane;
					var4 = HealthBarDefinition.baseX * 64 + (KeyHandler.localPlayer.x >> 7);
					var5 = WorldMapScaleHandler.baseY * 64 + (KeyHandler.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Buddy.method8383(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = EnumComposition.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class149.method3293(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					UserComparator6.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field512;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field783;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field644[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
