import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 758237961
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ag")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ak")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "702035000"
	)
	static final void method1193(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
