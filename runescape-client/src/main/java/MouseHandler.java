import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1857024705
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2047320811
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 977148359
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 945191471
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -4035055762233838803L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 25202373
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1913220207
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 829657881
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 4097880529516814601L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1189220541
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 410797131
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -573628821
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -6451265465804548835L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 19384673
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1038761335
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -506884275
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -6800864048650361821L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 705211165
	)
	static int field214;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1909988933"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = RouteStrategy.method5439();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldc;Ldp;III)V",
		garbageValue = "-1683823699"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		Interpreter.Interpreter_intStackSize = 0;
		class230.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field861 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label937: {
			label938: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						class534.Interpreter_stringLocals = new String[var1.localStringCount];
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
									var14 = var0.field1068;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								class534.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field863 = var0.field1066;

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

								var14 = WorldMapArea.method5641(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label937;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								class59.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
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
								class534.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class143.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								UrlRequest.method3034(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = class534.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								class534.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class230.Interpreter_stringStackSize -= var13;
								var20 = ReflectionCheck.method677(Interpreter.Interpreter_stringStack, class230.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--Interpreter.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class230.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectComposition.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										ObjectComposition.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										Interpreter.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = ObjectComposition.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											ObjectComposition.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = ObjectComposition.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											ObjectComposition.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = FontName.field5226.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = Buddy.field4934.method8865(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = ScriptEvent.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class230.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
									class230.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = class534.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									class534.Interpreter_stringLocals = var16;
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
						Script.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label938;
					}
				} finally {
					if (var29) {
						while (Interpreter.field862.size() > 0) {
							class105 var19 = (class105)Interpreter.field862.remove(0);
							HttpRequestTask.widgetDefaultMenuAction(var19.method2832(), var19.method2825(), var19.method2826(), var19.method2827(), "");
						}

						if (Interpreter.field861) {
							Interpreter.field861 = false;
							class60.method1145();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							Script.RunException_sendStackTrace("Warning: Script " + var1.field984 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field862.size() > 0) {
					class105 var40 = (class105)Interpreter.field862.remove(0);
					HttpRequestTask.widgetDefaultMenuAction(var40.method2832(), var40.method2825(), var40.method2826(), var40.method2827(), "");
				}

				if (Interpreter.field861) {
					Interpreter.field861 = false;
					class60.method1145();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					Script.RunException_sendStackTrace("Warning: Script " + var1.field984 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field862.size() > 0) {
				class105 var25 = (class105)Interpreter.field862.remove(0);
				HttpRequestTask.widgetDefaultMenuAction(var25.method2832(), var25.method2825(), var25.method2826(), var25.method2827(), "");
			}

			if (Interpreter.field861) {
				Interpreter.field861 = false;
				class60.method1145();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				Script.RunException_sendStackTrace("Warning: Script " + var1.field984 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field862.size() > 0) {
			class105 var33 = (class105)Interpreter.field862.remove(0);
			HttpRequestTask.widgetDefaultMenuAction(var33.method2832(), var33.method2825(), var33.method2826(), var33.method2827(), "");
		}

		if (Interpreter.field861) {
			Interpreter.field861 = false;
			class60.method1145();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			Script.RunException_sendStackTrace("Warning: Script " + var1.field984 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;III)Lqe;",
		garbageValue = "789821776"
	)
	public static Font method658(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		return !class415.method7697(var0, var2, var3) ? null : class442.method8313(var1.takeFile(var2, var3));
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "109132841"
	)
	static int method638(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field771 = (short)LoginPacket.method3331(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field771 <= 0) {
				Client.field771 = 256;
			}

			Client.field691 = (short)LoginPacket.method3331(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field691 <= 0) {
				Client.field691 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field546 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field546 <= 0) {
				Client.field546 = 1;
			}

			Client.field775 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field775 <= 0) {
				Client.field775 = 32767;
			} else if (Client.field775 < Client.field546) {
				Client.field775 = Client.field546;
			}

			Client.field579 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field579 <= 0) {
				Client.field579 = 1;
			}

			Client.field778 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field778 <= 0) {
				Client.field778 = 32767;
			} else if (Client.field778 < Client.field579) {
				Client.field778 = Client.field579;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class59.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SwapSongTask.method8303(Client.field771);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SwapSongTask.method8303(Client.field691);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NPC.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
