import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ek")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "2124590211"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldt;[BIIIIIIIIII)V",
		garbageValue = "653933494"
	)
	static final void method2998(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var4 + var13] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var17 + var3;
						int var22 = var4 + WorldMapLabel.method5937(var14 & 7, var15 & 7, var8);
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class151.loadTerrain(var0, var25, var2, var21, var22, var23, var24, var8);
					} else {
						class151.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "695243981"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1659106737"
	)
	static int method3002(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class105 var8 = new class105(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field893.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class13.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class105 var6 = new class105(var5, var3, var4, AsyncRestClient.widgetDefinition.method6536(var3).itemId);
					Interpreter.field893.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field901 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1100 = Interpreter.field901 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
