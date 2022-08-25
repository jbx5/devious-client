import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("br")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(descriptor = "[Lkn;")
	static Widget[] field840;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1041078891)
	@Export("id")
	int id;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -246267537)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -524141109)
	@Export("plane")
	int plane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1314923763)
	@Export("x")
	int x;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1223834635)
	@Export("y")
	int y;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 717022905)
	@Export("z")
	int z;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lgh;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 2064090513)
	@Export("frame")
	int frame;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 557446605)
	@Export("frameCycle")
	int frameCycle;

	@ObfuscatedName("n")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = ArchiveDisk.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "1")
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				} 
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method3729()) {
					this.isFinished = true;
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Lhp;", garbageValue = "4")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveDisk.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lco;III)V", garbageValue = "-828737390")
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (ByteArrayPool.isWorldMapEvent(var0.type)) {
			class160.worldMapEvent = ((WorldMapEvent) (var3[0]));
			WorldMapElement var5 = EnumComposition.WorldMapElement_get(class160.worldMapEvent.mapElement);
			var4 = class127.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = ((Integer) (var3[0]));
			var4 = class10.getScript(var20);
		}
		if (var4 != null) {
			User.Interpreter_intStackSize = 0;
			UserComparator8.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field820 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;
			label954 : {
				label955 : {
					try {
						int var13;
						try {
							var30 = true;
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
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
										var14 = (var0.widget != null) ? var0.widget.id : -1;
									}
									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}
									if (var14 == -2147483643) {
										var14 = (var0.widget != null) ? var0.widget.childIndex : -1;
									}
									if (var14 == -2147483642) {
										var14 = (var0.dragTarget != null) ? var0.dragTarget.id : -1;
									}
									if (var14 == -2147483641) {
										var14 = (var0.dragTarget != null) ? var0.dragTarget.childIndex : -1;
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
									Interpreter.Interpreter_stringLocals[var12++] = var21;
								}
							}
							Interpreter.field830 = var0.field1039;
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
									var14 = InvDefinition.method3279(var33, var4, var35);
									switch (var14) {
										case 0 :
											var30 = false;
											break label954;
										case 1 :
										default :
											break;
										case 2 :
											throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
									class300.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
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
									Interpreter.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class133.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									class220.method4448(var13, Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									User.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									UserComparator8.Interpreter_stringStackSize -= var13;
									var21 = DynamicObject.method1949(Interpreter.Interpreter_stringStack, UserComparator8.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--User.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--UserComparator8.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class341.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class341.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & '￿';
											int var24 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											User.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class341.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}
												Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class341.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class341.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class341.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = ((IntegerNode) (var38.get(((long) (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize])))));
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = Messages.field1326.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}
													var39 = Coord.field3318.method7008(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class10.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];
										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (User.Interpreter_intStackSize - var36.intArgumentCount)];
										}
										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (UserComparator8.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}
										User.Interpreter_intStackSize -= var36.intArgumentCount;
										UserComparator8.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = Interpreter.Interpreter_intLocals;
										var23.stringLocals = Interpreter.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										Interpreter.Interpreter_intLocals = var15;
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
							class33.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label955;
						}
					} finally {
						if (var30) {
							while (Interpreter.field831.size() > 0) {
								class93 var19 = ((class93) (Interpreter.field831.remove(0)));
								ArchiveDiskAction.widgetDefaultMenuAction(var19.method2354(), var19.method2346(), var19.method2352(), var19.method2347(), "");
							} 
							if (Interpreter.field820) {
								Interpreter.field820 = false;
								WorldMapID.method4919();
							}
							if (!var9 && var2 > 0 && var10 >= var2) {
								class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
							}
						}
					}
					while (Interpreter.field831.size() > 0) {
						class93 var41 = ((class93) (Interpreter.field831.remove(0)));
						ArchiveDiskAction.widgetDefaultMenuAction(var41.method2354(), var41.method2346(), var41.method2352(), var41.method2347(), "");
					} 
					if (Interpreter.field820) {
						Interpreter.field820 = false;
						WorldMapID.method4919();
					}
					if (!var9 && var2 > 0 && var10 >= var2) {
						class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
					}
					return;
				}
				while (Interpreter.field831.size() > 0) {
					class93 var26 = ((class93) (Interpreter.field831.remove(0)));
					ArchiveDiskAction.widgetDefaultMenuAction(var26.method2354(), var26.method2346(), var26.method2352(), var26.method2347(), "");
				} 
				if (Interpreter.field820) {
					Interpreter.field820 = false;
					WorldMapID.method4919();
				}
				if (!var9 && var2 > 0 && var10 >= var2) {
					class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
				}
				return;
			}
			while (Interpreter.field831.size() > 0) {
				class93 var34 = ((class93) (Interpreter.field831.remove(0)));
				ArchiveDiskAction.widgetDefaultMenuAction(var34.method2354(), var34.method2346(), var34.method2352(), var34.method2347(), "");
			} 
			if (Interpreter.field820) {
				Interpreter.field820 = false;
				WorldMapID.method4919();
			}
			if (!var9 && var2 > 0 && var10 >= var2) {
				class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ZZI)Lqe;", garbageValue = "-437393904")
	static IndexedSprite method1852(boolean var0, boolean var1) {
		return var0 ? var1 ? KeyHandler.field127 : VerticalAlignment.options_buttons_2Sprite : var1 ? Login.field874 : class29.options_buttons_0Sprite;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(S)Lbd;", garbageValue = "-9933")
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return FriendSystem.getNextWorldListWorld();
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(descriptor = "(IIIIIIII)V", garbageValue = "1518456316")
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ParamComposition.loadInterface(var0)) {
			Coord.updateInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	public GraphicsObject() {
	}
}