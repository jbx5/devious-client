import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rj")
public class class463 {
	@ObfuscatedName("at")
	float field4776;
	@ObfuscatedName("ah")
	float field4775;
	@ObfuscatedName("ar")
	float field4785;
	@ObfuscatedName("ao")
	float field4777;
	@ObfuscatedName("ab")
	float field4778;
	@ObfuscatedName("au")
	float field4779;
	@ObfuscatedName("aa")
	float field4780;
	@ObfuscatedName("ac")
	float field4781;
	@ObfuscatedName("al")
	float field4782;
	@ObfuscatedName("az")
	float field4783;
	@ObfuscatedName("ap")
	float field4784;
	@ObfuscatedName("av")
	float field4774;

	static {
		new class463();
	}

	class463() {
		this.method8497();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1136254272"
	)
	void method8497() {
		this.field4774 = 0.0F;
		this.field4784 = 0.0F;
		this.field4783 = 0.0F;
		this.field4781 = 0.0F;
		this.field4780 = 0.0F;
		this.field4779 = 0.0F;
		this.field4777 = 0.0F;
		this.field4785 = 0.0F;
		this.field4775 = 0.0F;
		this.field4782 = 1.0F;
		this.field4778 = 1.0F;
		this.field4776 = 1.0F;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1766211153"
	)
	void method8498(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4775;
		float var5 = this.field4778;
		float var6 = this.field4781;
		float var7 = this.field4784;
		this.field4775 = var2 * var4 - this.field4785 * var3;
		this.field4785 = var4 * var3 + var2 * this.field4785;
		this.field4778 = var5 * var2 - this.field4779 * var3;
		this.field4779 = this.field4779 * var2 + var5 * var3;
		this.field4781 = var2 * var6 - var3 * this.field4782;
		this.field4782 = this.field4782 * var2 + var3 * var6;
		this.field4784 = var7 * var2 - this.field4774 * var3;
		this.field4774 = var3 * var7 + var2 * this.field4774;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "16"
	)
	void method8514(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4776;
		float var5 = this.field4777;
		float var6 = this.field4780;
		float var7 = this.field4783;
		this.field4776 = var3 * this.field4785 + var2 * var4;
		this.field4785 = var2 * this.field4785 - var3 * var4;
		this.field4777 = var3 * this.field4779 + var5 * var2;
		this.field4779 = this.field4779 * var2 - var3 * var5;
		this.field4780 = var2 * var6 + var3 * this.field4782;
		this.field4782 = var2 * this.field4782 - var3 * var6;
		this.field4783 = var7 * var2 + var3 * this.field4774;
		this.field4774 = var2 * this.field4774 - var7 * var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1612992617"
	)
	void method8499(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4776;
		float var5 = this.field4777;
		float var6 = this.field4780;
		float var7 = this.field4783;
		this.field4776 = var4 * var2 - this.field4775 * var3;
		this.field4775 = this.field4775 * var2 + var4 * var3;
		this.field4777 = var5 * var2 - var3 * this.field4778;
		this.field4778 = var2 * this.field4778 + var3 * var5;
		this.field4780 = var6 * var2 - var3 * this.field4781;
		this.field4781 = var3 * var6 + var2 * this.field4781;
		this.field4783 = var7 * var2 - var3 * this.field4784;
		this.field4784 = var3 * var7 + this.field4784 * var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "4"
	)
	void method8501(float var1, float var2, float var3) {
		this.field4783 += var1;
		this.field4784 += var2;
		this.field4774 += var3;
	}

	public String toString() {
		return this.field4776 + "," + this.field4777 + "," + this.field4780 + "," + this.field4783 + "\n" + this.field4775 + "," + this.field4778 + "," + this.field4781 + "," + this.field4784 + "\n" + this.field4785 + "," + this.field4779 + "," + this.field4782 + "," + this.field4774;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-99"
	)
	static int method8506(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				DbTableType.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ClientPreferences.method2570(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				DbTableType.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class182.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				DbTableType.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class27.method446(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = LoginPacket.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = ItemLayer.Client_plane;
					var4 = NpcOverrides.baseX * 64 + (class229.localPlayer.x >> 7);
					var5 = class101.baseY * 64 + (class229.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ClientPreferences.method2570(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class182.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class27.method446(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					DbTableType.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.field501;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.field502;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.field540[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
