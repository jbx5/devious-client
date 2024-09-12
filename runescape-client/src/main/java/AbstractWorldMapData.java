import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1409288128
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 941436928
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1218392023
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 396801991
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 620960221
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1716288713
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 254431501
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 194517835
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ah")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ap")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ab")
	byte[][][] field3197;
	@ObfuscatedName("az")
	byte[][][] field3200;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[[Llp;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ai")
	boolean field3202;
	@ObfuscatedName("ao")
	boolean field3203;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3202 = false;
		this.field3203 = false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "2131625972"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "38"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3202 && this.field3203;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpo;B)V",
		garbageValue = "14"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3202 = true;
				this.field3203 = true;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087124654"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3197 = null;
		this.field3200 = null;
		this.decorations = null;
		this.field3202 = false;
		this.field3203 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILvf;I)V",
		garbageValue = "1616079330"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6157(var1, var2, var3, var4);
			} else {
				this.method6154(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILvf;II)V",
		garbageValue = "1808722743"
	)
	void method6157(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILvf;II)V",
		garbageValue = "955104181"
	)
	void method6154(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3197[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3200[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1673230467"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-56"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	static int method6187() {
		return class28.KeyHandler_keyCodes.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldo;Ldt;III)V",
		garbageValue = "388340503"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		class320.Interpreter_intStackSize = 0;
		class465.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field882 = false;
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

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field885 = var0.field1099;

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

								var14 = class6.method40(var32, var1, var34);
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
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								class153.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label938;
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
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = LoginPacket.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class156.method3532(var13, Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								class320.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class465.Interpreter_stringStackSize -= var13;
								var20 = class179.method3798(Interpreter.Interpreter_stringStack, class465.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--class320.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class465.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class229.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class229.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										class320.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = class229.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											class229.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = class229.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											class229.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = DirectByteArrayCopier.field4026.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = WorldMapData_0.field3064.method9145(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = HttpResponse.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class320.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class465.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class320.Interpreter_intStackSize -= var35.intArgumentCount;
									class465.Interpreter_stringStackSize -= var35.stringArgumentCount;
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
						var13 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8);
								class171.RunException_sendStackTrace(var26.toString(), var30);
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field870.size() > 0) {
							class107 var19 = (class107)Interpreter.field870.remove(0);
							class216.widgetDefaultMenuAction(var19.method2964(), var19.method2960(), var19.method2961(), var19.method2959(), "");
						}

						if (Interpreter.field882) {
							Interpreter.field882 = false;
							LoginScreenAnimation.method2731();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class171.RunException_sendStackTrace("Warning: Script " + var1.field1026 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field870.size() > 0) {
					class107 var25 = (class107)Interpreter.field870.remove(0);
					class216.widgetDefaultMenuAction(var25.method2964(), var25.method2960(), var25.method2961(), var25.method2959(), "");
				}

				if (Interpreter.field882) {
					Interpreter.field882 = false;
					LoginScreenAnimation.method2731();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class171.RunException_sendStackTrace("Warning: Script " + var1.field1026 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field870.size() > 0) {
				class107 var40 = (class107)Interpreter.field870.remove(0);
				class216.widgetDefaultMenuAction(var40.method2964(), var40.method2960(), var40.method2961(), var40.method2959(), "");
			}

			if (Interpreter.field882) {
				Interpreter.field882 = false;
				LoginScreenAnimation.method2731();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class171.RunException_sendStackTrace("Warning: Script " + var1.field1026 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field870.size() > 0) {
			class107 var33 = (class107)Interpreter.field870.remove(0);
			class216.widgetDefaultMenuAction(var33.method2964(), var33.method2960(), var33.method2961(), var33.method2959(), "");
		}

		if (Interpreter.field882) {
			Interpreter.field882 = false;
			LoginScreenAnimation.method2731();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class171.RunException_sendStackTrace("Warning: Script " + var1.field1026 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
