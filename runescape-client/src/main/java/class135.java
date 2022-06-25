import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ea")
public class class135 extends class128 {
	@ObfuscatedName("c")
	boolean field1607;

	@ObfuscatedName("v")
	byte field1605;

	@ObfuscatedName("q")
	byte field1609;

	@ObfuscatedName("f")
	byte field1608;

	@ObfuscatedName("j")
	byte field1606;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class135(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1607 = var1.readUnsignedByte() == 1;
		this.field1605 = var1.readByte();
		this.field1609 = var1.readByte();
		this.field1608 = var1.readByte();
		this.field1606 = var1.readByte();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.allowGuests = this.field1607;
		var1.field1637 = this.field1605;
		var1.field1633 = this.field1609;
		var1.field1634 = this.field1608;
		var1.field1645 = this.field1606;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lcw;III)V", garbageValue = "891167101")
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (MilliClock.isWorldMapEvent(var0.type)) {
			class21.worldMapEvent = ((WorldMapEvent) (var3[0]));
			WorldMapElement var5 = class432.WorldMapElement_get(class21.worldMapEvent.mapElement);
			var4 = class149.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = ((Integer) (var3[0]));
			var4 = Language.getScript(var20);
		}
		if (var4 != null) {
			class446.Interpreter_intStackSize = 0;
			Interpreter.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field829 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;
			label952 : {
				label953 : {
					try {
						int var13;
						try {
							var30 = true;
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							class326.Interpreter_stringLocals = new String[var4.localStringCount];
							int var12 = 0;
							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) {
								if (var3[var13] instanceof Integer) {
									var14 = ((Integer) (var3[var13]));
									if (var14 == -2147483647) {
										var14 = var0.mouseX;
									}
									if (var14 == -2147483646) {
										var14 = var0.mouseY;
									}
									if (var14 == -2147483645) {
										var14 = (var0.widget != null) ? var0.widget.id * -1598663557 * -1038587213 : -1;
									}
									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}
									if (var14 == -2147483643) {
										var14 = (var0.widget != null) ? var0.widget.childIndex * 9919479 * -385493561 : -1;
									}
									if (var14 == -2147483642) {
										var14 = (var0.dragTarget != null) ? var0.dragTarget.id * -1598663557 * -1038587213 : -1;
									}
									if (var14 == -2147483641) {
										var14 = (var0.dragTarget != null) ? var0.dragTarget.childIndex * 9919479 * -385493561 : -1;
									}
									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}
									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}
									Interpreter.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = ((String) (var3[var13]));
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}
									class326.Interpreter_stringLocals[var12++] = var21;
								}
							}
							Interpreter.field850 = var0.field1056;
							while (true) {
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
									var14 = Friend.method6619(var33, var4, var35);
									switch (var14) {
										case 0 :
											var30 = false;
											break label952;
										case 1 :
										default :
											break;
										case 2 :
											throw new IllegalStateException();
									}
								} else if (var33 == ScriptOpcodes.ICONST) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
									class306.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}
									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									Interpreter.Interpreter_intLocals = var40.intLocals;
									class326.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class388.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									PacketBufferNode.method5200(var13, Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									class446.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class326.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									class326.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									Interpreter.Interpreter_stringStackSize -= var13;
									var21 = User.method6679(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--class446.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--Interpreter.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class308.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class308.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
											if (var24 < 0 || var24 > 5000) {
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
											var14 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											class446.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class308.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}
												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class308.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class308.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class308.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = ((IntegerNode) (var38.get(((long) (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize])))));
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = WorldMapID.field2842.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}
													var39 = FontName.field4584.method7055(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = Language.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];
										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class446.Interpreter_intStackSize - var36.intArgumentCount)];
										}
										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}
										class446.Interpreter_intStackSize -= var36.intArgumentCount;
										Interpreter.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = Interpreter.Interpreter_intLocals;
										var23.stringLocals = class326.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										Interpreter.Interpreter_intLocals = var15;
										class326.Interpreter_stringLocals = var16;
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
							class249.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label953;
						}
					} finally {
						if (var30) {
							while (Interpreter.field843.size() > 0) {
								class93 var19 = ((class93) (Interpreter.field843.remove(0)));
								TextureProvider.widgetDefaultMenuAction(var19.method2391(), var19.method2392(), var19.method2400(), var19.method2393(), "");
							} 
							if (Interpreter.field829) {
								Interpreter.field829 = false;
								Occluder.method4354();
							}
							if (!var9 && var2 > 0 && var10 >= var2) {
								class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
							}
						}
					}
					while (Interpreter.field843.size() > 0) {
						class93 var41 = ((class93) (Interpreter.field843.remove(0)));
						TextureProvider.widgetDefaultMenuAction(var41.method2391(), var41.method2392(), var41.method2400(), var41.method2393(), "");
					} 
					if (Interpreter.field829) {
						Interpreter.field829 = false;
						Occluder.method4354();
					}
					if (!var9 && var2 > 0 && var10 >= var2) {
						class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
					}
					return;
				}
				while (Interpreter.field843.size() > 0) {
					class93 var26 = ((class93) (Interpreter.field843.remove(0)));
					TextureProvider.widgetDefaultMenuAction(var26.method2391(), var26.method2392(), var26.method2400(), var26.method2393(), "");
				} 
				if (Interpreter.field829) {
					Interpreter.field829 = false;
					Occluder.method4354();
				}
				if (!var9 && var2 > 0 && var10 >= var2) {
					class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
				}
				return;
			}
			while (Interpreter.field843.size() > 0) {
				class93 var34 = ((class93) (Interpreter.field843.remove(0)));
				TextureProvider.widgetDefaultMenuAction(var34.method2391(), var34.method2392(), var34.method2400(), var34.method2393(), "");
			} 
			if (Interpreter.field829) {
				Interpreter.field829 = false;
				Occluder.method4354();
			}
			if (!var9 && var2 > 0 && var10 >= var2) {
				class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-3")
	public static int method2910(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1627158309")
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class353.client.method1102() && !class353.client.method1103()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			WorldMapData_1.method4872(2);
			if (var0) {
				Login.Login_password = "";
			}
			KeyHandler.method286();
			class29.method357();
		} else {
			WorldMapData_1.method4872(10);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-802967854")
	static void method2917() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;
		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				ByteArrayPool.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}
	}
}