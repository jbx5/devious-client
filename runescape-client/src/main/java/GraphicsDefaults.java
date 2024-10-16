import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 503417565
	)
	public int field5109;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1977446041
	)
	public int field5100;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1772993219
	)
	public int field5101;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1949030099
	)
	public int field5102;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1954160561
	)
	public int field5103;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 186764659
	)
	public int field5104;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -352944179
	)
	public int field5105;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1654505333
	)
	public int field5106;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -285352093
	)
	public int field5114;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 811617695
	)
	public int field5108;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1494415031
	)
	public int field5107;
	@ObfuscatedName("an")
	final int field5099;
	@ObfuscatedName("ao")
	final int field5115;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5112;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5113;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5110;
	@ObfuscatedName("az")
	public final int[][] field5111;

	public GraphicsDefaults() {
		this.field5109 = -1;
		this.field5100 = -1;
		this.field5101 = -1;
		this.field5102 = -1;
		this.field5103 = -1;
		this.field5104 = -1;
		this.field5105 = -1;
		this.field5106 = -1;
		this.field5114 = -1;
		this.field5108 = -1;
		this.field5107 = -1;
		this.field5099 = 1;
		this.field5115 = 2;
		this.field5112 = 1;
		this.field5113 = 1;
		this.field5110 = 1;
		this.field5111 = new int[3][5];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "-104"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5096.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			while (true) {
				int var4 = var3.readUnsignedByte();
				if (var4 == 0) {
					return;
				}

				switch(var4) {
				case 1:
					var3.readMedium();
					break;
				case 2:
					this.field5109 = var3.method10108();
					this.field5100 = var3.method10108();
					this.field5101 = var3.method10108();
					this.field5102 = var3.method10108();
					this.field5103 = var3.method10108();
					this.field5104 = var3.method10108();
					this.field5105 = var3.method10108();
					this.field5106 = var3.method10108();
					this.field5114 = var3.method10108();
					this.field5108 = var3.method10108();
					this.field5107 = var3.method10108();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5111.length; ++var5) {
						for (int var6 = 0; var6 < this.field5111[var5].length; ++var6) {
							this.field5111[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Lda;IIB)V",
		garbageValue = "-113"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		class96.Interpreter_intStackSize = 0;
		class208.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field855 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label940: {
			label941: {
				try {
					int var13;
					try {
						var29 = true;
						LoginPacket.Interpreter_intLocals = new int[var1.localIntCount];
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

								if (var14 == -2147483638) {
									var14 = var0.field1103;
								}

								LoginPacket.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field865 = var0.field1108;

						label928:
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

								var14 = class374.method7517(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label928;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								class356.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label941;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								LoginPacket.Interpreter_intLocals = var39.intLocals;
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Projectile.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								AbstractWorldMapData.method6284(var13, Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								class96.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = LoginPacket.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								LoginPacket.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class208.Interpreter_stringStackSize -= var13;
								var20 = KeyHandler.method380(Interpreter.Interpreter_stringStack, class208.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--class96.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class208.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class508.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class508.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										class96.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = class508.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											class508.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = class508.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											class508.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = AccessFile.field5352.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = class544.field5379.method9317(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class298.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class96.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class208.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class96.Interpreter_intStackSize -= var35.intArgumentCount;
									class208.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = LoginPacket.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									LoginPacket.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
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
						HttpHeaders.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label940;
					}
				} finally {
					if (var29) {
						while (Interpreter.field857.size() > 0) {
							class107 var19 = (class107)Interpreter.field857.remove(0);
							class145.widgetDefaultMenuAction(var19.method3042(), var19.method3034(), var19.method3035(), var19.method3036(), "");
						}

						if (Interpreter.field855) {
							Interpreter.field855 = false;
							Message.method1253();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							HttpHeaders.RunException_sendStackTrace("Warning: Script " + var1.field1002 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field857.size() > 0) {
					class107 var33 = (class107)Interpreter.field857.remove(0);
					class145.widgetDefaultMenuAction(var33.method3042(), var33.method3034(), var33.method3035(), var33.method3036(), "");
				}

				if (Interpreter.field855) {
					Interpreter.field855 = false;
					Message.method1253();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					HttpHeaders.RunException_sendStackTrace("Warning: Script " + var1.field1002 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field857.size() > 0) {
				class107 var40 = (class107)Interpreter.field857.remove(0);
				class145.widgetDefaultMenuAction(var40.method3042(), var40.method3034(), var40.method3035(), var40.method3036(), "");
			}

			if (Interpreter.field855) {
				Interpreter.field855 = false;
				Message.method1253();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				HttpHeaders.RunException_sendStackTrace("Warning: Script " + var1.field1002 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field857.size() > 0) {
			class107 var25 = (class107)Interpreter.field857.remove(0);
			class145.widgetDefaultMenuAction(var25.method3042(), var25.method3034(), var25.method3035(), var25.method3036(), "");
		}

		if (Interpreter.field855) {
			Interpreter.field855 = false;
			Message.method1253();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			HttpHeaders.RunException_sendStackTrace("Warning: Script " + var1.field1002 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
