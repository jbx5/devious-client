import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1616725987
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1010826727
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1846608577
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -95056223
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-85425751"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldu;Ldg;III)V",
		garbageValue = "-1950945045"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		class130.Interpreter_intStackSize = 0;
		class337.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field863 = false;
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
						RestClientThreadFactory.Interpreter_stringLocals = new String[var1.localStringCount];
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

								RestClientThreadFactory.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field872 = var0.field1090;

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

								var14 = StructComposition.method3871(var32, var1, var34);
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
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								SecureRandomFuture.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
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
								RestClientThreadFactory.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class162.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class225.method4304(var13, Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								class130.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = RestClientThreadFactory.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								RestClientThreadFactory.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class337.Interpreter_stringStackSize -= var13;
								var20 = class6.method41(Interpreter.Interpreter_stringStack, class337.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--class130.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class337.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Archive.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										Archive.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										class130.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = Archive.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											Archive.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = Archive.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											Archive.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class562.field5476.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = PendingSpawn.field1171.method8796(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class195.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class130.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class337.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class130.Interpreter_intStackSize -= var35.intArgumentCount;
									class337.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = RestClientThreadFactory.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									RestClientThreadFactory.Interpreter_stringLocals = var16;
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
						FriendsChat.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label934;
					}
				} finally {
					if (var29) {
						while (Interpreter.field860.size() > 0) {
							class105 var19 = (class105)Interpreter.field860.remove(0);
							SongTask.widgetDefaultMenuAction(var19.method2772(), var19.method2777(), var19.method2779(), var19.method2776(), "");
						}

						if (Interpreter.field863) {
							Interpreter.field863 = false;
							class109.method2818();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							FriendsChat.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field860.size() > 0) {
					class105 var40 = (class105)Interpreter.field860.remove(0);
					SongTask.widgetDefaultMenuAction(var40.method2772(), var40.method2777(), var40.method2779(), var40.method2776(), "");
				}

				if (Interpreter.field863) {
					Interpreter.field863 = false;
					class109.method2818();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					FriendsChat.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field860.size() > 0) {
				class105 var25 = (class105)Interpreter.field860.remove(0);
				SongTask.widgetDefaultMenuAction(var25.method2772(), var25.method2777(), var25.method2779(), var25.method2776(), "");
			}

			if (Interpreter.field863) {
				Interpreter.field863 = false;
				class109.method2818();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				FriendsChat.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field860.size() > 0) {
			class105 var33 = (class105)Interpreter.field860.remove(0);
			SongTask.widgetDefaultMenuAction(var33.method2772(), var33.method2777(), var33.method2779(), var33.method2776(), "");
		}

		if (Interpreter.field863) {
			Interpreter.field863 = false;
			class109.method2818();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			FriendsChat.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
