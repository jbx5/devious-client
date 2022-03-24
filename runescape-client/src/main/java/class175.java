



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class175 {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(intValue = 
	327954161)

	static int field1883;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lca;III)V", garbageValue = 
	"-1185850498")

	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (MusicPatchNode2.isWorldMapEvent(var0.type)) {
			class293.worldMapEvent = ((WorldMapEvent) (var3[0]));
			WorldMapElement var5 = class19.WorldMapElement_get(class293.worldMapEvent.mapElement);
			var4 = FriendSystem.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = ((Integer) (var3[0]));
			var4 = class101.getScript(var20);
		}

		if (var4 != null) {
			class295.Interpreter_intStackSize = 0;
			ChatChannel.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field837 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label951 : {
				label952 : {
					try {
						int var13;
						try {
							var30 = true;
							class385.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) {
								if (var3[var13] instanceof Integer) {
									var14 = ((Integer) (var3[var13]));
									if (var14 == (-2147483647)) {
										var14 = var0.mouseX;
									}

									if (var14 == (-2147483646)) {
										var14 = var0.mouseY;
									}

									if (var14 == (-2147483645)) {
										var14 = (var0.widget != null) ? (var0.widget.id * 2073510769) * (-769712751) : -1;
									}

									if (var14 == (-2147483644)) {
										var14 = var0.opIndex;
									}

									if (var14 == (-2147483643)) {
										var14 = (var0.widget != null) ? (var0.widget.childIndex * (-241424449)) * 1035716671 : -1;
									}

									if (var14 == (-2147483642)) {
										var14 = (var0.dragTarget != null) ? (var0.dragTarget.id * 2073510769) * (-769712751) : -1;
									}

									if (var14 == (-2147483641)) {
										var14 = (var0.dragTarget != null) ? (var0.dragTarget.childIndex * (-241424449)) * 1035716671 : -1;
									}

									if (var14 == (-2147483640)) {
										var14 = var0.keyTyped;
									}

									if (var14 == (-2147483639)) {
										var14 = var0.keyPressed;
									}

									class385.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = ((String) (var3[var13]));
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field827 = var0.field1053;

							label935 : while (
							true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}

								++var20;
								int var33 = var6[var20];
								if (var33 >= 100) {
									boolean var35;
									if (var4.intOperands[var20] == 1) {
										var35 = true;
									} else {
										var35 = false;
									}

									var14 = UserComparator2.method8042(var33, var4, var35);
									switch (var14) {
										case 0 :
											var30 = false;
											break label935;
										case 1 :
										default :
											break;
										case 2 :
											throw new IllegalStateException();}

								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
									class78.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label952;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									class385.Interpreter_intLocals = var40.intLocals;
									Interpreter.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = WorldMapRegion.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									WorldMapElement.method3384(var13, Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									class295.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class385.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									class385.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									ChatChannel.Interpreter_stringStackSize -= var13;
									var21 = class273.method5271(Interpreter.Interpreter_stringStack, ChatChannel.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--class295.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--ChatChannel.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = JagexCache.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											JagexCache.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
											if ((var24 < 0) || (var24 > 5000)) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
											if ((var14 < 0) || (var14 >= Interpreter.Interpreter_arrayLengths[var13])) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											class295.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
											if ((var14 < 0) || (var14 >= Interpreter.Interpreter_arrayLengths[var13])) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = JagexCache.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												JagexCache.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = JagexCache.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												JagexCache.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = ((IntegerNode) (var38.get(((long) (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize])))));
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = class129.field1535.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = GameEngine.field205.method7164(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class101.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class295.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (ChatChannel.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class295.Interpreter_intStackSize -= var36.intArgumentCount;
										ChatChannel.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = class385.Interpreter_intLocals;
										var23.stringLocals = Interpreter.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[(++Interpreter.Interpreter_frameDepth) - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										class385.Interpreter_intLocals = var15;
										Interpreter.Interpreter_stringLocals = var16;
									}
								}
							} 
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8);
							class301.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label951;
						}
					} finally {
						if (var30) {
							while (Interpreter.field839.size() > 0) {
								class93 var19 = ((class93) (Interpreter.field839.remove(0)));
								Message.widgetDefaultMenuAction(var19.method2381(), var19.method2376(), var19.method2377(), var19.method2378(), "");
							} 

							if (Interpreter.field837) {
								Interpreter.field837 = false;
								class9.method85();
							}

							if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
								class301.RunException_sendStackTrace((((("Warning: Script " + var4.field959) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
							}

						}
					}

					while (Interpreter.field839.size() > 0) {
						class93 var34 = ((class93) (Interpreter.field839.remove(0)));
						Message.widgetDefaultMenuAction(var34.method2381(), var34.method2376(), var34.method2377(), var34.method2378(), "");
					} 

					if (Interpreter.field837) {
						Interpreter.field837 = false;
						class9.method85();
					}

					if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
						class301.RunException_sendStackTrace((((("Warning: Script " + var4.field959) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
					}

					return;
				}

				while (Interpreter.field839.size() > 0) {
					class93 var41 = ((class93) (Interpreter.field839.remove(0)));
					Message.widgetDefaultMenuAction(var41.method2381(), var41.method2376(), var41.method2377(), var41.method2378(), "");
				} 

				if (Interpreter.field837) {
					Interpreter.field837 = false;
					class9.method85();
				}

				if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
					class301.RunException_sendStackTrace((((("Warning: Script " + var4.field959) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
				}

				return;
			}

			while (Interpreter.field839.size() > 0) {
				class93 var26 = ((class93) (Interpreter.field839.remove(0)));
				Message.widgetDefaultMenuAction(var26.method2381(), var26.method2376(), var26.method2377(), var26.method2378(), "");
			} 

			if (Interpreter.field837) {
				Interpreter.field837 = false;
				class9.method85();
			}

			if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
				class301.RunException_sendStackTrace((((("Warning: Script " + var4.field959) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
			}

		}
	}

	@ObfuscatedName("kn")
	static final void method3439(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(var0);
		class82.method2122();
		Interpreter.clientPreferences.method2260(var0);
	}
}