import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ef")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("TOKEN")
	TOKEN(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1521(1, 4);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -788619659
	)
	static int field1517;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1225591323
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 961190565
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FB)F",
		garbageValue = "14"
	)
	static float method3050(class135 var0, float var1) {
		if (var0 != null && var0.method3150() != 0) {
			if (var1 < (float)var0.field1579[0].field1526) {
				return var0.field1580 == class133.field1565 ? var0.field1579[0].field1527 : class189.method3695(var0, var1, true);
			} else if (var1 > (float)var0.field1579[var0.method3150() - 1].field1526) {
				return var0.field1583 == class133.field1565 ? var0.field1579[var0.method3150() - 1].field1527 : class189.method3695(var0, var1, false);
			} else if (var0.field1576) {
				return var0.field1579[0].field1527;
			} else {
				class130 var2 = var0.method3159(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1535 && 0.0D == (double)var2.field1531) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1535 && Float.MAX_VALUE == var2.field1531) {
						var4 = true;
					} else if (var2.field1532 != null) {
						if (var0.field1578) {
							var5 = (float)var2.field1526;
							float var9 = var2.field1527;
							var6 = var5 + var2.field1535 * 0.33333334F;
							float var10 = var2.field1531 * 0.33333334F + var9;
							float var8 = (float)var2.field1532.field1526;
							float var12 = var2.field1532.field1527;
							var7 = var8 - 0.33333334F * var2.field1532.field1528;
							float var11 = var12 - var2.field1532.field1529 * 0.33333334F;
							if (var0.field1575) {
								class33.method480(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else if (var0 != null) {
								var0.field1592 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if (0.0D != (double)var15) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if ((double)var15 != 0.0D) {
									var17 = (var12 - var11) / var15;
								}

								float var18 = 1.0F / (var13 * var13);
								float var19 = var16 * var13;
								float var20 = var13 * var17;
								var0.field1581 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1590 = (var14 + var14 + var14 - var19 - var19 - var20) * var18;
								var0.field1585 = var16;
								var0.field1586 = var9;
							}

							var0.field1578 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1527;
					} else if (var4) {
						return var1 != (float)var2.field1526 && var2.field1532 != null ? var2.field1532.field1527 : var2.field1527;
					} else if (var0.field1575) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1592 == var1) {
								var6 = 0.0F;
							} else if (var1 == var0.field1591) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1592) / (var0.field1591 - var0.field1592);
							}

							if (var0.field1594) {
								var7 = var6;
							} else {
								class131.field1540[3] = var0.field1586;
								class131.field1540[2] = var0.field1585;
								class131.field1540[1] = var0.field1590;
								class131.field1540[0] = var0.field1581 - var6;
								class131.field1542[0] = 0.0F;
								class131.field1542[1] = 0.0F;
								class131.field1542[2] = 0.0F;
								class131.field1542[3] = 0.0F;
								class131.field1542[4] = 0.0F;
								int var21 = DirectByteArrayCopier.method7035(class131.field1540, 3, 0.0F, true, 1.0F, true, class131.field1542);
								if (var21 == 1) {
									var7 = class131.field1542[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var0.field1587 + (var7 * (var0.field1582 * var7 + var0.field1589) + var0.field1588) * var7;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1592;
							var5 = var0.field1586 + var6 * (var0.field1585 + (var0.field1581 * var6 + var0.field1590) * var6);
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1095298527"
	)
	static int method3049(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			var4 = ModeWhere.widgetDefinition.method6519(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class130.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
			TriBool.invalidateWidget(var4);
			class415.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class130.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
			TriBool.invalidateWidget(var4);
			class415.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				TriBool.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
