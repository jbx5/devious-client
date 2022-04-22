



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class127 extends class128 {
	@ObfuscatedName("as")
	@Export("client")
	@ObfuscatedSignature(descriptor = 
	"Lclient;")

	static Client client;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1073843279)

	int field1518;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class127(class131 var1) {
		this.this$0 = var1;
		this.field1518 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1518 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2960(this.field1518);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Ljv;", garbageValue = 
	"-78")

	static LoginPacket[] method2836() {
		return new LoginPacket[]{ LoginPacket.field3137, LoginPacket.field3132, LoginPacket.field3134, LoginPacket.field3131, LoginPacket.field3133, LoginPacket.field3130 };
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Lky;", garbageValue = 
	"-1735575897")

	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if ((Widget.Widget_interfaceComponents[var1] == null) || (Widget.Widget_interfaceComponents[var1][var2] == null)) {
			boolean var3 = class155.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"([Lbb;II[I[IB)V", garbageValue = 
	"-21")

	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if ((var11 == (-1)) && (var4[var10] == 1)) {
								var11 = 2001;
							}

							if ((var12 == (-1)) && (var4[var10] == 1)) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if (((var4[var10] != 1) || (var11 <= var12)) && ((var4[var10] != 0) || (var11 >= var12))) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if ((var11 == (-1)) && (var4[var10] == 1)) {
								var11 = 2001;
							}

							if ((var12 == (-1)) && (var4[var10] == 1)) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if (((var4[var10] != 1) || (var11 >= var12)) && ((var4[var10] != 0) || (var11 <= var12))) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			} 

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"451726103")

	static int method2840(int var0, Script var1, boolean var2) {
		Widget var3 = getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (((var3.actions != null) && (var4 < var3.actions.length)) && (var3.actions[var4] != null)) {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"799305208")

	static final void method2830(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class131.clientPreferences.method2244(var0);
	}
}