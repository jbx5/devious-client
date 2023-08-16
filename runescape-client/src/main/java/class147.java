import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class147 extends class143 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1691;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1887192453
	)
	int field1693;
	@ObfuscatedName("ae")
	byte field1692;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class147(class146 var1) {
		this.this$0 = var1;
		this.field1693 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1693 = var1.readUnsignedShort();
		this.field1692 = var1.readByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3230(this.field1693, this.field1692);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldh;III)V",
		garbageValue = "1066790817"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		SoundCache.Interpreter_intStackSize = 0;
		class137.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field893 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label932: {
			label933: {
				try {
					int var13;
					try {
						var29 = true;
						Varps.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount];
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

								Varps.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field890 = var0.field1093;

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

								var14 = PacketWriter.method2801(var32, var1, var34);
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
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
								WorldMapDecoration.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label932;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								Varps.Interpreter_intLocals = var39.intLocals;
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClientPreferences.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								Frames.method4723(var13, Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								SoundCache.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Varps.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Varps.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class137.Interpreter_stringStackSize -= var13;
								var20 = WorldMapID.method5496(Interpreter.Interpreter_stringStack, class137.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--SoundCache.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class137.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = KeyHandler.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										KeyHandler.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										SoundCache.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = KeyHandler.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											KeyHandler.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = KeyHandler.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											KeyHandler.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class466.field4802.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = class139.field1654.method8287(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class133.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (SoundCache.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class137.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									SoundCache.Interpreter_intStackSize -= var35.intArgumentCount;
									class137.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Varps.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Varps.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");
						var13 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8);
								Messages.RunException_sendStackTrace(var26.toString(), var30);
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field889.size() > 0) {
							class102 var19 = (class102)Interpreter.field889.remove(0);
							class47.widgetDefaultMenuAction(var19.method2658(), var19.method2661(), var19.method2652(), var19.method2647(), "");
						}

						if (Interpreter.field893) {
							Interpreter.field893 = false;
							WorldMapIcon_1.method5076();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field889.size() > 0) {
					class102 var25 = (class102)Interpreter.field889.remove(0);
					class47.widgetDefaultMenuAction(var25.method2658(), var25.method2661(), var25.method2652(), var25.method2647(), "");
				}

				if (Interpreter.field893) {
					Interpreter.field893 = false;
					WorldMapIcon_1.method5076();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field889.size() > 0) {
				class102 var33 = (class102)Interpreter.field889.remove(0);
				class47.widgetDefaultMenuAction(var33.method2658(), var33.method2661(), var33.method2652(), var33.method2647(), "");
			}

			if (Interpreter.field893) {
				Interpreter.field893 = false;
				WorldMapIcon_1.method5076();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field889.size() > 0) {
			class102 var40 = (class102)Interpreter.field889.remove(0);
			class47.widgetDefaultMenuAction(var40.method2658(), var40.method2661(), var40.method2652(), var40.method2647(), "");
		}

		if (Interpreter.field893) {
			Interpreter.field893 = false;
			WorldMapIcon_1.method5076();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			Messages.RunException_sendStackTrace("Warning: Script " + var1.field1014 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-531661874"
	)
	static void method3137() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class92.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
