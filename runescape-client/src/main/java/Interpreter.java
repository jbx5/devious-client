import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("rm")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("b")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("n")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("s")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("l")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-264358279)

	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("o")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-552565383)

	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"[Lbl;")

	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("g")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("x")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field841;
	@ObfuscatedName("j")
	static boolean field842;
	@ObfuscatedName("e")
	static ArrayList field843;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	1021880361)

	static int field844;
	@ObfuscatedName("aw")
	static final double field845;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(descriptor = 
	"Lba;")

	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	static 
	{
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		field841 = false;
		field842 = false;
		field843 = new ArrayList();
		field844 = 0;
		field845 = Math.log(2.0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BB)Lqi;", garbageValue = 
	"-84")

	public static final SpritePixels method1889(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var2 * var3];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BI)Lhn;", garbageValue = 
	"-1771552883")

	static WorldMapSprite method1798(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(method1889(var0).pixels);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lch;III)V", garbageValue = 
	"-1891697067")

	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (class17.isWorldMapEvent(var0.type)) {
			SpotAnimationDefinition.worldMapEvent = ((WorldMapEvent) (var3[0]));
			WorldMapElement var5 = UserComparator7.WorldMapElement_get(SpotAnimationDefinition.worldMapEvent.mapElement);
			var4 = GameObject.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = ((Integer) (var3[0]));
			var4 = ClanChannel.getScript(var20);
		}

		if (var4 != null) {
			Interpreter_intStackSize = 0;
			class122.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter_frameDepth = 0;
			field841 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label950 : {
				label951 : {
					try {
						int var13;
						try {
							var30 = true;
							GrandExchangeOfferNameComparator.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							Interpreter_stringLocals = new String[var4.localStringCount];
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
										var14 = (var0.widget != null) ? (var0.widget.id * 1389111653) * 785571949 : -1;
									}

									if (var14 == (-2147483644)) {
										var14 = var0.opIndex;
									}

									if (var14 == (-2147483643)) {
										var14 = (var0.widget != null) ? (var0.widget.childIndex * (-1989091849)) * (-1317080121) : -1;
									}

									if (var14 == (-2147483642)) {
										var14 = (var0.dragTarget != null) ? (var0.dragTarget.id * 1389111653) * 785571949 : -1;
									}

									if (var14 == (-2147483641)) {
										var14 = (var0.dragTarget != null) ? (var0.dragTarget.childIndex * (-1989091849)) * (-1317080121) : -1;
									}

									if (var14 == (-2147483640)) {
										var14 = var0.keyTyped;
									}

									if (var14 == (-2147483639)) {
										var14 = var0.keyPressed;
									}

									GrandExchangeOfferNameComparator.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = ((String) (var3[var13]));
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									Interpreter_stringLocals[var12++] = var21;
								}
							}

							field844 = var0.field1031;

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

									var14 = MouseHandler.method613(var33, var4, var35);
									switch (var14) {
										case 0 :
											var30 = false;
											break label951;
										case 1 :
										default :
											break;
										case 2 :
											throw new IllegalStateException();}

								} else if (var33 == 0) {
									Interpreter_intStack[(++Interpreter_intStackSize) - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter_intStack[(++Interpreter_intStackSize) - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter_intStack[--Interpreter_intStackSize];
									WorldMapLabel.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] != Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] == Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] < Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] > Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter_frameDepth == 0) {
										var30 = false;
										break label950;
									}

									ScriptFrame var40 = Interpreter_frames[--Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									GrandExchangeOfferNameComparator.Interpreter_intLocals = var40.intLocals;
									Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter_intStack[(++Interpreter_intStackSize) - 1] = SecureRandomCallable.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									Renderable.method4926(var13, Interpreter_intStack[--Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] <= Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									Interpreter_intStackSize -= 2;
									if (Interpreter_intStack[Interpreter_intStackSize] >= Interpreter_intStack[Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter_intStack[(++Interpreter_intStackSize) - 1] = GrandExchangeOfferNameComparator.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									GrandExchangeOfferNameComparator.Interpreter_intLocals[var7[var20]] = Interpreter_intStack[--Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									Interpreter_stringLocals[var7[var20]] = Interpreter_stringStack[--class122.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class122.Interpreter_stringStackSize -= var13;
									var21 = StudioGame.method5780(Interpreter_stringStack, class122.Interpreter_stringStackSize, var13);
									Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class122.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter_intStack[(++Interpreter_intStackSize) - 1] = class160.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class160.varcs.setInt(var7[var20], Interpreter_intStack[--Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter_intStack[--Interpreter_intStackSize];
											if ((var24 < 0) || (var24 > 5000)) {
												throw new RuntimeException();
											}

											Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter_intStack[--Interpreter_intStackSize];
											if ((var14 < 0) || (var14 >= Interpreter_arrayLengths[var13])) {
												throw new RuntimeException();
											}

											Interpreter_intStack[(++Interpreter_intStackSize) - 1] = Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											Interpreter_intStackSize -= 2;
											var14 = Interpreter_intStack[Interpreter_intStackSize];
											if ((var14 < 0) || (var14 >= Interpreter_arrayLengths[var13])) {
												throw new RuntimeException();
											}

											Interpreter_arrays[var13][var14] = Interpreter_intStack[Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class160.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class160.varcs.setStringOld(var7[var20], Interpreter_stringStack[--class122.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class160.varcs.getString(var7[var20]);
												Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class160.varcs.setString(var7[var20], Interpreter_stringStack[--class122.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = ((IntegerNode) (var38.get(((long) (Interpreter_intStack[--Interpreter_intStackSize])))));
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = Calendar.field3269.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter_intStack[(++Interpreter_intStackSize) - 1] = -1;
													} else {
														Interpreter_intStack[(++Interpreter_intStackSize) - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = HorizontalAlignment.field1885.method7105(var7[var20]);
													if (var39 == null) {
														Interpreter_intStack[(++Interpreter_intStackSize) - 1] = -1;
													} else {
														Interpreter_intStack[(++Interpreter_intStackSize) - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = ClanChannel.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter_intStack[var17 + (Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter_stringStack[var17 + (class122.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter_intStackSize -= var36.intArgumentCount;
										class122.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = GrandExchangeOfferNameComparator.Interpreter_intLocals;
										var23.stringLocals = Interpreter_stringLocals;
										Interpreter_frames[(++Interpreter_frameDepth) - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										GrandExchangeOfferNameComparator.Interpreter_intLocals = var15;
										Interpreter_stringLocals = var16;
									}
								}
							} 
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");
							var13 = Interpreter_frameDepth - 1;

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8);
									Widget.RunException_sendStackTrace(var27.toString(), var31);
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter_frames[var13].script.key).append(" ");
								--var13;
							} 
						}
					} finally {
						if (var30) {
							while (field843.size() > 0) {
								class93 var19 = ((class93) (field843.remove(0)));
								WorldMapLabelSize.widgetDefaultMenuAction(var19.method2370(), var19.method2380(), var19.method2372(), var19.method2373(), "");
							} 

							if (field841) {
								field841 = false;
								class20.method294();
							}

							if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
								Widget.RunException_sendStackTrace((((("Warning: Script " + var4.field954) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
							}

						}
					}

					while (field843.size() > 0) {
						class93 var26 = ((class93) (field843.remove(0)));
						WorldMapLabelSize.widgetDefaultMenuAction(var26.method2370(), var26.method2380(), var26.method2372(), var26.method2373(), "");
					} 

					if (field841) {
						field841 = false;
						class20.method294();
					}

					if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
						Widget.RunException_sendStackTrace((((("Warning: Script " + var4.field954) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
					}

					return;
				}

				while (field843.size() > 0) {
					class93 var34 = ((class93) (field843.remove(0)));
					WorldMapLabelSize.widgetDefaultMenuAction(var34.method2370(), var34.method2380(), var34.method2372(), var34.method2373(), "");
				} 

				if (field841) {
					field841 = false;
					class20.method294();
				}

				if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
					Widget.RunException_sendStackTrace((((("Warning: Script " + var4.field954) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
				}

				return;
			}

			while (field843.size() > 0) {
				class93 var41 = ((class93) (field843.remove(0)));
				WorldMapLabelSize.widgetDefaultMenuAction(var41.method2370(), var41.method2380(), var41.method2372(), var41.method2373(), "");
			} 

			if (field841) {
				field841 = false;
				class20.method294();
			}

			if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
				Widget.RunException_sendStackTrace((((("Warning: Script " + var4.field954) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
			}

		}
	}
}