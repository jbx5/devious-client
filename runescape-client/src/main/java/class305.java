import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class305 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BIIIIIII[Lgv;I)V", garbageValue = 
	"-2138515466")

	static final void method5781(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (((((var9 + var2) > 0) && ((var9 + var2) < 103)) && ((var3 + var10) > 0)) && ((var3 + var10) < 103)) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (((((var10 == var4) && (var11 >= var5)) && (var11 < (var5 + 8))) && (var12 >= var6)) && (var12 < (var6 + 8))) {
						int var15 = var2 + Script.method1996(var11 & 7, var12 & 7, var7);
						int var18 = var11 & 7;
						int var19 = var12 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}

						class20.loadTerrain(var21, var1, var15, var17 + var3, 0, 0, var7);
					} else {
						class20.loadTerrain(var21, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)Lbb;", garbageValue = 
	"1287117449")

	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? DevicePcmPlayerProvider.World_worlds[(++World.World_listCount) - 1] : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)I", garbageValue = 
	"-1357521539")

	static int method5782(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var0.method5624(var1);
			return 1;
		}
	}
}