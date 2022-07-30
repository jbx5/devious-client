import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("hh")
public class class228 implements WorldMapSection {
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1137527527)
	@Export("canvasHeight")
	public static int canvasHeight;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -447110187)
	int field2753;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1595498255)
	int field2755;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -993180361)
	int field2749;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1794557413)
	int field2758;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -398812335)
	int field2751;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -378030261)
	int field2752;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 354692025)
	int field2750;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -224048583)
	int field2748;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1887176703)
	int field2757;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 431737037)
	int field2756;

	class228() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lhw;B)V", garbageValue = "11")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2751) {
			var1.regionLowX = this.field2751;
		}
		if (var1.regionHighX < this.field2751) {
			var1.regionHighX = this.field2751;
		}
		if (var1.regionLowY > this.field2752) {
			var1.regionLowY = this.field2752;
		}
		if (var1.regionHighY < this.field2752) {
			var1.regionHighY = this.field2752;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-1974716574")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2753 && var1 < this.field2755 + this.field2753) {
			return var2 >= (this.field2749 << 6) + (this.field2750 << 3) && var2 <= (this.field2749 << 6) + (this.field2750 << 3) + 7 && var3 >= (this.field2758 << 6) + (this.field2748 << 3) && var3 <= (this.field2758 << 6) + (this.field2748 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "819062651")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2751 << 6) + (this.field2757 << 3) && var1 <= (this.field2751 << 6) + (this.field2757 << 3) + 7 && var2 >= (this.field2752 << 6) + (this.field2756 << 3) && var2 <= (this.field2752 << 6) + (this.field2756 << 3) + 7;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)[I", garbageValue = "24")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.field2751 * 64 - this.field2749 * 64 + var2 + (this.field2757 * 8 - this.field2750 * 8), var3 + (this.field2752 * 64 - this.field2758 * 64) + (this.field2756 * 8 - this.field2748 * 8) };
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lkp;", garbageValue = "-711503187")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2749 * 64 - this.field2751 * 64 + (this.field2750 * 8 - this.field2757 * 8) + var1;
			int var4 = this.field2758 * 64 - this.field2752 * 64 + var2 + (this.field2748 * 8 - this.field2756 * 8);
			return new Coord(this.field2753, var3, var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "84")
	@Export("read")
	public void read(Buffer var1) {
		this.field2753 = var1.readUnsignedByte();
		this.field2755 = var1.readUnsignedByte();
		this.field2749 = var1.readUnsignedShort();
		this.field2750 = var1.readUnsignedByte();
		this.field2758 = var1.readUnsignedShort();
		this.field2748 = var1.readUnsignedByte();
		this.field2751 = var1.readUnsignedShort();
		this.field2757 = var1.readUnsignedByte();
		this.field2752 = var1.readUnsignedShort();
		this.field2756 = var1.readUnsignedByte();
		this.method4853();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-91")
	void method4853() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lci;III)V", garbageValue = "418826083")
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (WorldMapRectangle.isWorldMapEvent(var0.type)) {
			class83.worldMapEvent = ((WorldMapEvent) (var3[0]));
			WorldMapElement var5 = TileItem.WorldMapElement_get(class83.worldMapEvent.mapElement);
			var4 = DevicePcmPlayerProvider.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = ((Integer) (var3[0]));
			var4 = Message.getScript(var20);
		}
		if (var4 != null) {
			TaskHandler.Interpreter_intStackSize = 0;
			GrandExchangeOfferAgeComparator.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			int var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field831 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;
			label948 : {
				label949 : {
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
							Interpreter.field844 = var0.field1049;
							while (true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}
								++var20;
								var8 = var6[var20];
								if (var8 >= 100) {
									boolean var34;
									if (var4.intOperands[var20] == 1) {
										var34 = true;
									} else {
										var34 = false;
									}
									var14 = FileSystem.method3276(var8, var4, var34);
									switch (var14) {
										case 0 :
											var30 = false;
											break label949;
										case 1 :
										default :
											break;
										case 2 :
											throw new IllegalStateException();
									}
								} else if (var8 == 0) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var8 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var8 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
									class155.changeGameOptions(var13);
								} else if (var8 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var8 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var8 == ScriptOpcodes.IF_ICMPNE) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.IF_ICMPEQ) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.IF_ICMPLT) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.IF_ICMPGT) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label948;
									}
									ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var39.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var39.pc;
									Interpreter.Interpreter_intLocals = var39.intLocals;
									Interpreter.Interpreter_stringLocals = var39.stringLocals;
								} else if (var8 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class271.getVarbit(var13);
								} else if (var8 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									FriendSystem.method1766(var13, Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
								} else if (var8 == ScriptOpcodes.IF_ICMPLE) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.IF_ICMPGE) {
									TaskHandler.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var8 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
								} else if (var8 == ScriptOpcodes.ISTORE) {
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
								} else if (var8 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
								} else if (var8 == ScriptOpcodes.SSTORE) {
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
								} else if (var8 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= var13;
									var21 = Archive.method5850(Interpreter.Interpreter_stringStack, GrandExchangeOfferAgeComparator.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var21;
								} else if (var8 == ScriptOpcodes.POP_INT) {
									--TaskHandler.Interpreter_intStackSize;
								} else if (var8 == ScriptOpcodes.POP_STRING) {
									--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var8 != ScriptOpcodes.INVOKE) {
										if (var8 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class151.varcs.getInt(var7[var20]);
										} else if (var8 == ScriptOpcodes.SET_VARC_INT) {
											class151.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
										} else if (var8 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & '￿';
											int var24 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
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
										} else if (var8 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var8 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											TaskHandler.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}
											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var8 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class151.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}
												Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var22;
											} else if (var8 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class151.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]);
											} else if (var8 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class151.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var22;
											} else if (var8 == ScriptOpcodes.SET_VARC_STRING) {
												class151.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]);
											} else if (var8 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var37 = var4.switches[var7[var20]];
												IntegerNode var36 = ((IntegerNode) (var37.get(((long) (Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize])))));
												if (var36 != null) {
													var20 += var36.integer;
												}
											} else {
												Integer var38;
												if (var8 == ScriptOpcodes.GET_VARCLANSETTING) {
													var38 = WorldMapDecoration.field2816.getTitleGroupValue(var7[var20]);
													if (var38 == null) {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var38;
													}
												} else {
													if (var8 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}
													var38 = SoundCache.field327.method7099(var7[var20]);
													if (var38 == null) {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var38;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var35 = Message.getScript(var13);
										int[] var15 = new int[var35.localIntCount];
										String[] var16 = new String[var35.localStringCount];
										for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (TaskHandler.Interpreter_intStackSize - var35.intArgumentCount)];
										}
										for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - var35.stringArgumentCount)];
										}
										TaskHandler.Interpreter_intStackSize -= var35.intArgumentCount;
										GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= var35.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = Interpreter.Interpreter_intLocals;
										var23.stringLocals = Interpreter.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var35;
										var6 = var35.opcodes;
										var7 = var35.intOperands;
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
							var13 = Interpreter.Interpreter_frameDepth - 1;
							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8);
									class359.RunException_sendStackTrace(var27.toString(), var31);
									var30 = false;
									break;
								}
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							} 
						}
					} finally {
						if (var30) {
							while (Interpreter.field841.size() > 0) {
								class93 var19 = ((class93) (Interpreter.field841.remove(0)));
								ArchiveLoader.widgetDefaultMenuAction(var19.method2444(), var19.method2449(), var19.method2445(), var19.method2446(), "");
							} 
							if (Interpreter.field831) {
								Interpreter.field831 = false;
								class181.method3547();
							}
							if (!var9 && var2 > 0 && var10 >= var2) {
								class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
							}
						}
					}
					while (Interpreter.field841.size() > 0) {
						class93 var26 = ((class93) (Interpreter.field841.remove(0)));
						ArchiveLoader.widgetDefaultMenuAction(var26.method2444(), var26.method2449(), var26.method2445(), var26.method2446(), "");
					} 
					if (Interpreter.field831) {
						Interpreter.field831 = false;
						class181.method3547();
					}
					if (!var9 && var2 > 0 && var10 >= var2) {
						class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
					}
					return;
				}
				while (Interpreter.field841.size() > 0) {
					class93 var33 = ((class93) (Interpreter.field841.remove(0)));
					ArchiveLoader.widgetDefaultMenuAction(var33.method2444(), var33.method2449(), var33.method2445(), var33.method2446(), "");
				} 
				if (Interpreter.field831) {
					Interpreter.field831 = false;
					class181.method3547();
				}
				if (!var9 && var2 > 0 && var10 >= var2) {
					class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
				}
				return;
			}
			while (Interpreter.field841.size() > 0) {
				class93 var40 = ((class93) (Interpreter.field841.remove(0)));
				ArchiveLoader.widgetDefaultMenuAction(var40.method2444(), var40.method2449(), var40.method2445(), var40.method2446(), "");
			} 
			if (Interpreter.field831) {
				Interpreter.field831 = false;
				class181.method3547();
			}
			if (!var9 && var2 > 0 && var10 >= var2) {
				class359.RunException_sendStackTrace("Warning: Script " + var4.field965 + " finished at op count " + var10 + " of max " + var1, ((Throwable) (null)));
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lji;", garbageValue = "1218682147")
	public static PacketBufferNode method4876() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1519897333")
	static final void method4875(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class260.clientPreferences.method2335()) {
			if (class260.clientPreferences.method2335() == 0 && Client.currentTrackGroupId != -1) {
				FriendsChat.method6678(MouseHandler.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				LoginPacket.method5207();
				Client.playingJingle = false;
			} else {
				KeyHandler.method314(var0);
			}
			class260.clientPreferences.method2357(var0);
		}
	}
}