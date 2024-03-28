import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -872465345
	)
	static int field1462;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -713649217
	)
	static int field1464;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ba")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("az")
	final URL field1469;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1353508695
	)
	volatile int field1465;
	@ObfuscatedName("an")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1462 = -1;
		field1464 = -2;
	}

	UrlRequest(URL var1) {
		this.field1465 = field1462;
		this.field1469 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1465 != field1462;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "599950154"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method2857() {
		return this.field1469.toString();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Ldn;III)V",
		garbageValue = "-815822149"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		HttpRequestTask.Interpreter_intStackSize = 0;
		AbstractWorldMapIcon.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field872 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label934: {
			label935: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
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

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field875 = var0.field1087;

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

								var14 = class149.method3186(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label934;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
								class11.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
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
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = SpotAnimationDefinition.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class234.method4464(var13, Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								HttpRequestTask.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								AbstractWorldMapIcon.Interpreter_stringStackSize -= var13;
								var20 = AbstractArchive.method7032(Interpreter.Interpreter_stringStack, AbstractWorldMapIcon.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--HttpRequestTask.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--AbstractWorldMapIcon.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class130.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class130.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										HttpRequestTask.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = class130.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											class130.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = class130.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											class130.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = HttpRequestTask.field84.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = PendingSpawn.field1189.method8494(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class128.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (HttpRequestTask.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (AbstractWorldMapIcon.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									HttpRequestTask.Interpreter_intStackSize -= var35.intArgumentCount;
									AbstractWorldMapIcon.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
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
						class180.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label935;
					}
				} finally {
					if (var29) {
						while (Interpreter.field867.size() > 0) {
							class103 var19 = (class103)Interpreter.field867.remove(0);
							AbstractArchive.widgetDefaultMenuAction(var19.method2666(), var19.method2658(), var19.method2661(), var19.method2662(), "");
						}

						if (Interpreter.field872) {
							Interpreter.field872 = false;
							LoginState.method1200();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field867.size() > 0) {
					class103 var40 = (class103)Interpreter.field867.remove(0);
					AbstractArchive.widgetDefaultMenuAction(var40.method2666(), var40.method2658(), var40.method2661(), var40.method2662(), "");
				}

				if (Interpreter.field872) {
					Interpreter.field872 = false;
					LoginState.method1200();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field867.size() > 0) {
				class103 var25 = (class103)Interpreter.field867.remove(0);
				AbstractArchive.widgetDefaultMenuAction(var25.method2666(), var25.method2658(), var25.method2661(), var25.method2662(), "");
			}

			if (Interpreter.field872) {
				Interpreter.field872 = false;
				LoginState.method1200();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field867.size() > 0) {
			class103 var33 = (class103)Interpreter.field867.remove(0);
			AbstractArchive.widgetDefaultMenuAction(var33.method2666(), var33.method2658(), var33.method2661(), var33.method2662(), "");
		}

		if (Interpreter.field872) {
			Interpreter.field872 = false;
			LoginState.method1200();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class180.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-621653841"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? GrandExchangeOfferTotalQuantityComparator.method7088(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "881116646"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method6658(class243.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var8 * var4 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + class133.localPlayer.x >> 7;
					int var12 = class133.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = FadeInTask.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var11);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortLE(DevicePcmPlayerProvider.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class133.localPlayer.x);
					var13.packetBuffer.writeShort(class133.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
