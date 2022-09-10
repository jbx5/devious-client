import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ig")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 530936768
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -133271552
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1717207833
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1635559809
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1974353605
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1349661509
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2100978787
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1614049497
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("h")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("t")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("u")
	byte[][][] field2839;
	@ObfuscatedName("d")
	byte[][][] field2834;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[[[[Lie;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("a")
	boolean field2841;
	@ObfuscatedName("l")
	boolean field2842;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2841 = false; // L: 26
		this.field2842 = false; // L: 27
	} // L: 29

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1696330768"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2003631521"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2841 && this.field2842; // L: 32
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)V",
		garbageValue = "-378378532"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2841 = true; // L: 40
				this.field2842 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112715667"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2839 = null; // L: 48
		this.field2834 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2841 = false; // L: 51
		this.field2842 = false; // L: 52
	} // L: 53

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILqq;I)V",
		garbageValue = "-1887413247"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method5086(var1, var2, var3, var4); // L: 61
			} else {
				this.method5083(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILqq;II)V",
		garbageValue = "2046393761"
	)
	void method5086(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILqq;IS)V",
		garbageValue = "173"
	)
	void method5083(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2839[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2834[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.readNullableLargeSmart(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6826"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "728409939"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lcf;III)V",
		garbageValue = "570808655"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 121
		Script var4;
		int var20;
		if (GrandExchangeOfferAgeComparator.isWorldMapEvent(var0.type)) { // L: 123
			class434.worldMapEvent = (WorldMapEvent)var3[0]; // L: 124
			WorldMapElement var5 = class139.WorldMapElement_get(class434.worldMapEvent.mapElement); // L: 125
			var4 = Renderable.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 126
		} else {
			var20 = (Integer)var3[0]; // L: 129
			var4 = class116.getScript(var20); // L: 130
		}

		if (var4 != null) { // L: 132
			Interpreter.Interpreter_intStackSize = 0; // L: 135
			VarbitComposition.Interpreter_stringStackSize = 0; // L: 136
			var20 = -1; // L: 137
			int[] var6 = var4.opcodes; // L: 138
			int[] var7 = var4.intOperands; // L: 139
			byte var8 = -1; // L: 140
			Interpreter.Interpreter_frameDepth = 0; // L: 141
			Interpreter.field843 = false; // L: 142
			boolean var9 = false; // L: 143
			int var10 = 0; // L: 144
			boolean var30 = false;

			label951: {
				label952: {
					try {
						int var13;
						try {
							var30 = true; // L: 146
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 147
							int var11 = 0; // L: 148
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 149
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 150
								if (var3[var13] instanceof Integer) { // L: 151
									var14 = (Integer)var3[var13]; // L: 152
									if (var14 == -2147483647) { // L: 153
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 154
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 155
										var14 = var0.widget != null ? var0.widget.id : -1;
									}

									if (var14 == -2147483644) { // L: 156
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 157
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) { // L: 158
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) { // L: 159
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) { // L: 160
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 161
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 162
								} else if (var3[var13] instanceof String) { // L: 164
									var21 = (String)var3[var13]; // L: 165
									if (var21.equals("event_opbase")) { // L: 166
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 167
								}
							}

							Interpreter.field849 = var0.field1041; // L: 171

							while (true) {
								++var10; // L: 173
								if (var10 > var1) { // L: 174
									throw new RuntimeException();
								}

								++var20; // L: 175
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 176
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 394
										var35 = true;
									} else {
										var35 = false; // L: 395
									}

									var14 = Language.method6235(var33, var4, var35); // L: 396
									switch(var14) { // L: 397
									case 0:
										var30 = false;
										break label951;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 400
									}
								} else if (var33 == 0) { // L: 177
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20]; // L: 178
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 181
									var13 = var7[var20]; // L: 182
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 183
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 186
									var13 = var7[var20]; // L: 187
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 188
									class269.changeGameOptions(var13); // L: 189
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 192
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 193
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 196
									var20 += var7[var20]; // L: 197
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 200
									Interpreter.Interpreter_intStackSize -= 2; // L: 201
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 202
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 205
									Interpreter.Interpreter_intStackSize -= 2; // L: 206
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 207
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 210
									Interpreter.Interpreter_intStackSize -= 2; // L: 211
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 212
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 215
									Interpreter.Interpreter_intStackSize -= 2; // L: 216
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 217
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 220
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 222
									var4 = var40.script; // L: 223
									var6 = var4.opcodes; // L: 224
									var7 = var4.intOperands; // L: 225
									var20 = var40.pc; // L: 226
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 227
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 228
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 231
									var13 = var7[var20]; // L: 232
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator8.getVarbit(var13); // L: 233
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 236
									var13 = var7[var20]; // L: 237
									class1.method9(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 238
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 241
									Interpreter.Interpreter_intStackSize -= 2; // L: 242
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 243
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 246
									Interpreter.Interpreter_intStackSize -= 2; // L: 247
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 248
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 251
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 252
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 255
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 256
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 259
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 260
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 263
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 264
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 267
									var13 = var7[var20]; // L: 268
									VarbitComposition.Interpreter_stringStackSize -= var13; // L: 269
									var21 = class297.method5904(Interpreter.Interpreter_stringStack, VarbitComposition.Interpreter_stringStackSize, var13); // L: 270
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var21; // L: 271
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 274
									--Interpreter.Interpreter_intStackSize; // L: 275
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 278
									--VarbitComposition.Interpreter_stringStackSize; // L: 279
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 282
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 305
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginType.varcs.getInt(var7[var20]); // L: 306
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 309
											LoginType.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 310
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 313
											var13 = var7[var20] >> 16; // L: 314
											var14 = var7[var20] & 65535; // L: 315
											int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 316
											if (var24 < 0 || var24 > 5000) { // L: 317
												throw new RuntimeException(); // L: 318
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 320
											byte var25 = -1; // L: 321
											if (var14 == 105) { // L: 322
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 323
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 326
											var13 = var7[var20]; // L: 327
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 328
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 329
												throw new RuntimeException(); // L: 330
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 332
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 335
											var13 = var7[var20]; // L: 336
											Interpreter.Interpreter_intStackSize -= 2; // L: 337
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 338
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 339
												throw new RuntimeException(); // L: 340
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 342
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 345
												var22 = LoginType.varcs.getStringOld(var7[var20]); // L: 346
												if (var22 == null) { // L: 347
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var22; // L: 348
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 351
												LoginType.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]); // L: 352
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 355
												var22 = LoginType.varcs.getString(var7[var20]); // L: 356
												Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var22; // L: 357
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 360
												LoginType.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]); // L: 361
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 364
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 365
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 366
												if (var37 != null) { // L: 367
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 370
													var39 = class230.field2798.getTitleGroupValue(var7[var20]); // L: 371
													if (var39 == null) { // L: 372
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 373
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 376
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 380
														throw new IllegalStateException(); // L: 390
													}

													var39 = class29.field182.method7265(var7[var20]); // L: 381
													if (var39 == null) { // L: 382
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 383
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 386
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 283
										Script var36 = class116.getScript(var13); // L: 284
										int[] var15 = new int[var36.localIntCount]; // L: 285
										String[] var16 = new String[var36.localStringCount]; // L: 286

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 287
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 288
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (VarbitComposition.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter.Interpreter_intStackSize -= var36.intArgumentCount; // L: 289
										VarbitComposition.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 290
										ScriptFrame var23 = new ScriptFrame(); // L: 291
										var23.script = var4; // L: 292
										var23.pc = var20; // L: 293
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 294
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 295
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 296
										var4 = var36; // L: 297
										var6 = var36.opcodes; // L: 298
										var7 = var36.intOperands; // L: 299
										var20 = -1; // L: 300
										Interpreter.Interpreter_intLocals = var15; // L: 301
										Interpreter.Interpreter_stringLocals = var16; // L: 302
									}
								}
							}
						} catch (Exception var31) { // L: 410
							var9 = true; // L: 411
							StringBuilder var27 = new StringBuilder(30); // L: 413
							var27.append("").append(var4.key).append(" "); // L: 414

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 415
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 416
							Clock.RunException_sendStackTrace(var27.toString(), var31); // L: 417
							var30 = false;
							break label952;
						}
					} finally {
						if (var30) {
							while (Interpreter.field848.size() > 0) {
								class93 var19 = (class93)Interpreter.field848.remove(0); // L: 422
								ApproximateRouteStrategy.widgetDefaultMenuAction(var19.method2553(), var19.method2554(), var19.method2546(), var19.method2542(), "");
							}

							if (Interpreter.field843) { // L: 425
								Interpreter.field843 = false; // L: 426
								class21.method318(); // L: 427
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								Clock.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field848.size() > 0) {
						class93 var41 = (class93)Interpreter.field848.remove(0);
						ApproximateRouteStrategy.widgetDefaultMenuAction(var41.method2553(), var41.method2554(), var41.method2546(), var41.method2542(), "");
					}

					if (Interpreter.field843) {
						Interpreter.field843 = false;
						class21.method318();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						Clock.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 221
				}

				while (Interpreter.field848.size() > 0) { // L: 421
					class93 var26 = (class93)Interpreter.field848.remove(0);
					ApproximateRouteStrategy.widgetDefaultMenuAction(var26.method2553(), var26.method2554(), var26.method2546(), var26.method2542(), "");
				}

				if (Interpreter.field843) {
					Interpreter.field843 = false;
					class21.method318();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					Clock.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 433
			}

			while (Interpreter.field848.size() > 0) {
				class93 var34 = (class93)Interpreter.field848.remove(0);
				ApproximateRouteStrategy.widgetDefaultMenuAction(var34.method2553(), var34.method2554(), var34.method2546(), var34.method2542(), ""); // L: 423
			}

			if (Interpreter.field843) {
				Interpreter.field843 = false;
				class21.method318();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 429
				Clock.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 430
			}

		}
	} // L: 133 403

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-668830240"
	)
	public static void method5107(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class120.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher); // L: 12126
		var4.packetBuffer.writeByteAdd(var2); // L: 12127
		var4.packetBuffer.writeShort(var1); // L: 12128
		var4.packetBuffer.writeIntIME(0); // L: 12129
		var4.packetBuffer.writeShortLE(var0); // L: 12130
		Client.packetWriter.addNode(var4); // L: 12131
	}
}
