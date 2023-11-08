import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1860064437
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;I)Z",
		garbageValue = "729664573"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldo;Ldt;IIB)V",
		garbageValue = "113"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		DbTableType.Interpreter_intStackSize = 0;
		class127.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field846 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label933: {
			label934: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						class60.Interpreter_stringLocals = new String[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								class60.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field849 = var0.field1063;

						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 >= 100) {
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false;
								}

								var14 = class149.method3270(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label933;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								Projectile.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								Interpreter.Interpreter_intLocals = var39.intLocals;
								class60.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = HealthBar.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class306.method5910(var13, Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								DbTableType.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class60.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								class60.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class127.Interpreter_stringStackSize -= var13;
								var20 = BoundaryObject.method5819(Interpreter.Interpreter_stringStack, class127.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--DbTableType.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class127.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class176.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class176.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
										if (var23 < 0 || var23 > 5000) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23;
										byte var24 = -1;
										if (var14 == 105) {
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) {
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) {
										var13 = var7[var5];
										var14 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										DbTableType.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = class176.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											class176.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = class176.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											class176.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = Timer.field4599.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = Client.field677.method8529(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = HealthBarUpdate.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (DbTableType.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class127.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									DbTableType.Interpreter_intStackSize -= var35.intArgumentCount;
									class127.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = class60.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									class60.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label934;
					}
				} finally {
					if (var29) {
						while (Interpreter.field847.size() > 0) {
							class102 var19 = (class102)Interpreter.field847.remove(0);
							FloorOverlayDefinition.widgetDefaultMenuAction(var19.method2734(), var19.method2730(), var19.method2731(), var19.method2732(), "");
						}

						if (Interpreter.field846) {
							Interpreter.field846 = false;
							class520.method9190();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field847.size() > 0) {
					class102 var40 = (class102)Interpreter.field847.remove(0);
					FloorOverlayDefinition.widgetDefaultMenuAction(var40.method2734(), var40.method2730(), var40.method2731(), var40.method2732(), "");
				}

				if (Interpreter.field846) {
					Interpreter.field846 = false;
					class520.method9190();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field847.size() > 0) {
				class102 var25 = (class102)Interpreter.field847.remove(0);
				FloorOverlayDefinition.widgetDefaultMenuAction(var25.method2734(), var25.method2730(), var25.method2731(), var25.method2732(), "");
			}

			if (Interpreter.field846) {
				Interpreter.field846 = false;
				class520.method9190();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field847.size() > 0) {
			class102 var33 = (class102)Interpreter.field847.remove(0);
			FloorOverlayDefinition.widgetDefaultMenuAction(var33.method2734(), var33.method2730(), var33.method2731(), var33.method2732(), "");
		}

		if (Interpreter.field846) {
			Interpreter.field846 = false;
			class520.method9190();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Warning: Script " + var1.field974 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1367539098"
	)
	static int method1251(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			DbTableType.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			EnumComposition var10 = ObjectComposition.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				EnumComposition var4 = ObjectComposition.getEnum(var3);
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			DbTableType.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
			EnumComposition var7 = ObjectComposition.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097312971"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
