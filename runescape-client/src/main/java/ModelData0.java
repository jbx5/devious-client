import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1888550529
	)
	static int field2994;

	ModelData0() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "1105352009"
	)
	static float method5452(class133 var0, float var1) {
		if (var0 != null && var0.method3085() != 0) {
			if (var1 < (float)var0.field1582[0].field1534) {
				return var0.field1600 == class131.field1570 ? var0.field1582[0].field1531 : WorldMapSection1.method5975(var0, var1, true);
			} else if (var1 > (float)var0.field1582[var0.method3085() - 1].field1534) {
				return var0.field1581 == class131.field1570 ? var0.field1582[var0.method3085() - 1].field1531 : WorldMapSection1.method5975(var0, var1, false);
			} else if (var0.field1579) {
				return var0.field1582[0].field1531;
			} else {
				class128 var2 = var0.method3096(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1535 && 0.0D == (double)var2.field1536) {
						var3 = true;
					} else if (var2.field1535 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1536) {
						var4 = true;
					} else if (var2.field1537 != null) {
						if (var0.field1594) {
							var5 = (float)var2.field1534;
							float var9 = var2.field1531;
							var6 = var2.field1535 * 0.33333334F + var5;
							float var10 = var9 + var2.field1536 * 0.33333334F;
							float var8 = (float)var2.field1537.field1534;
							float var12 = var2.field1537.field1531;
							var7 = var8 - 0.33333334F * var2.field1537.field1533;
							float var11 = var12 - var2.field1537.field1532 * 0.33333334F;
							if (var0.field1586) {
								ModeWhere.method7489(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else if (var0 != null) {
								var0.field1584 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if ((double)var15 != 0.0D) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0D != (double)var15) {
									var17 = (var12 - var11) / var15;
								}

								float var18 = 1.0F / (var13 * var13);
								float var19 = var13 * var16;
								float var20 = var13 * var17;
								var0.field1596 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1587 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1601 = var16;
								var0.field1589 = var9;
							}

							var0.field1594 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1531;
					} else if (var4) {
						return (float)var2.field1534 != var1 && var2.field1537 != null ? var2.field1537.field1531 : var2.field1531;
					} else if (var0.field1586) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var1 == var0.field1584) {
								var6 = 0.0F;
							} else if (var0.field1585 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1584) / (var0.field1585 - var0.field1584);
							}

							if (var0.field1583) {
								var7 = var6;
							} else {
								class129.field1544[3] = var0.field1589;
								class129.field1544[2] = var0.field1601;
								class129.field1544[1] = var0.field1587;
								class129.field1544[0] = var0.field1596 - var6;
								class129.field1539[0] = 0.0F;
								class129.field1539[1] = 0.0F;
								class129.field1539[2] = 0.0F;
								class129.field1539[3] = 0.0F;
								class129.field1539[4] = 0.0F;
								int var21 = class195.method3802(class129.field1544, 3, 0.0F, true, 1.0F, true, class129.field1539);
								if (var21 == 1) {
									var7 = class129.field1539[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = (var7 * (var0.field1592 + var0.field1578 * var7) + var0.field1591) * var7 + var0.field1590;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1584;
							var5 = var0.field1589 + ((var0.field1587 + var6 * var0.field1596) * var6 + var0.field1601) * var6;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1203349375"
	)
	public static int method5451() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "507902544"
	)
	static int method5453(int var0, Script var1, boolean var2) {
		Widget var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = TaskHandler.Widget_unpackTargetMask(class160.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "88109315"
	)
	static void method5454() {
		Client.packetWriter.addNode(WorldMapElement.getPacketBufferNode(ClientPacket.field3314, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
