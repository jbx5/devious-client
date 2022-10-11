import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("rw")
	static boolean field964;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 753704077
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("c")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("p")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-924338289"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "610108675"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return class271.method5377(); // L: 31
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIS)J",
		garbageValue = "128"
	)
	static long method2111(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-92"
	)
	static String method2108(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqf;II)V",
		garbageValue = "-907276343"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		int var4;
		int var6;
		byte[] var10000;
		int var20;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var20 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1290[var20] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1290; // L: 81
					var10000[var20] = (byte)(var10000[var20] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = Renderable.method4461(var0); // L: 86
						var10000 = Players.field1290; // L: 87
						var10000[var20] = (byte)(var10000[var20] | 2);
					} else {
						class259.readPlayerUpdate(var0, var20); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var20 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1290[var20] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1290; // L: 103
						var10000[var20] = (byte)(var10000[var20] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = Renderable.method4461(var0); // L: 108
							var10000 = Players.field1290; // L: 109
							var10000[var20] = (byte)(var10000[var20] | 2);
						} else {
							class259.readPlayerUpdate(var0, var20); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var20 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1290[var20] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1290; // L: 125
							var10000[var20] = (byte)(var10000[var20] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = Renderable.method4461(var0); // L: 130
								var10000 = Players.field1290; // L: 131
								var10000[var20] = (byte)(var10000[var20] | 2);
							} else if (class139.updateExternalPlayer(var0, var20)) { // L: 134
								var10000 = Players.field1290;
								var10000[var20] = (byte)(var10000[var20] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var20 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1290[var20] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1290; // L: 147
								var10000[var20] = (byte)(var10000[var20] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = Renderable.method4461(var0); // L: 152
									var10000 = Players.field1290; // L: 153
									var10000[var20] = (byte)(var10000[var20] | 2);
								} else if (class139.updateExternalPlayer(var0, var20)) { // L: 156
									var10000 = Players.field1290;
									var10000[var20] = (byte)(var10000[var20] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1290; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 173
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 174
							var5 = Client.players[var4]; // L: 175
							var6 = var0.readUnsignedByte(); // L: 176
							if ((var6 & 128) != 0) { // L: 177
								var6 += var0.readUnsignedByte() << 8;
							}

							byte var7 = class193.field2248.field2245; // L: 179
							if ((var6 & 8) != 0) { // L: 180
								var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 181
								if (var5.overheadText.charAt(0) == '~') { // L: 182
									var5.overheadText = var5.overheadText.substring(1); // L: 183
									class65.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 184
								} else if (var5 == class67.localPlayer) { // L: 186
									class65.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 187
								}

								var5.isAutoChatting = false; // L: 189
								var5.overheadTextColor = 0; // L: 190
								var5.overheadTextEffect = 0; // L: 191
								var5.overheadTextCyclesRemaining = 150; // L: 192
							}

							if ((var6 & 1024) != 0) { // L: 194
								var7 = var0.readByte(); // L: 195
							}

							int var8;
							int var11;
							int var12;
							int var15;
							if ((var6 & 1) != 0) { // L: 197
								var8 = var0.readUnsignedShortLE(); // L: 198
								PlayerType var9 = (PlayerType)Varps.findEnumerated(DbTableType.PlayerType_values(), var0.readUnsignedByteAdd()); // L: 199
								boolean var10 = var0.readUnsignedByteAdd() == 1; // L: 200
								var11 = var0.readUnsignedByte(); // L: 201
								var12 = var0.offset; // L: 202
								if (var5.username != null && var5.appearance != null) { // L: 203
									boolean var13 = false; // L: 204
									if (var9.isUser && Varps.friendSystem.isIgnored(var5.username)) { // L: 205 206
										var13 = true;
									}

									if (!var13 && Client.field617 == 0 && !var5.isHidden) { // L: 208
										Players.field1302.offset = 0; // L: 209
										var0.readBytes(Players.field1302.array, 0, var11); // L: 210
										Players.field1302.offset = 0; // L: 211
										String var14 = AbstractFont.escapeBrackets(class123.method2954(Occluder.method4474(Players.field1302))); // L: 212
										var5.overheadText = var14.trim(); // L: 213
										var5.overheadTextColor = var8 >> 8; // L: 214
										var5.overheadTextEffect = var8 & 255; // L: 215
										var5.overheadTextCyclesRemaining = 150; // L: 216
										var5.isAutoChatting = var10; // L: 217
										var5.field1150 = var5 != class67.localPlayer && var9.isUser && "" != Client.field752 && var14.toLowerCase().indexOf(Client.field752) == -1; // L: 218
										if (var9.isPrivileged) { // L: 220
											var15 = var10 ? 91 : 1;
										} else {
											var15 = var10 ? 90 : 2; // L: 221
										}

										if (var9.modIcon != -1) { // L: 222
											class65.addGameMessage(var15, method2108(var9.modIcon) + var5.username.getName(), var14);
										} else {
											class65.addGameMessage(var15, var5.username.getName(), var14); // L: 223
										}
									}
								}

								var0.offset = var11 + var12; // L: 226
							}

							int var16;
							if ((var6 & 32) != 0) { // L: 228
								var8 = var0.readUnsignedByte(); // L: 229
								int var19;
								int var23;
								int var24;
								if (var8 > 0) { // L: 230
									for (var16 = 0; var16 < var8; ++var16) { // L: 231
										var11 = -1; // L: 233
										var12 = -1; // L: 234
										var24 = -1; // L: 235
										var23 = var0.readUShortSmart(); // L: 236
										if (var23 == 32767) { // L: 237
											var23 = var0.readUShortSmart(); // L: 238
											var12 = var0.readUShortSmart(); // L: 239
											var11 = var0.readUShortSmart(); // L: 240
											var24 = var0.readUShortSmart(); // L: 241
										} else if (var23 != 32766) { // L: 243
											var12 = var0.readUShortSmart(); // L: 244
										} else {
											var23 = -1; // L: 246
										}

										var19 = var0.readUShortSmart(); // L: 247
										var5.addHitSplat(var23, var12, var11, var24, Client.cycle, var19); // L: 248
									}
								}

								var16 = var0.readUnsignedByte(); // L: 251
								if (var16 > 0) { // L: 252
									for (var23 = 0; var23 < var16; ++var23) { // L: 253
										var11 = var0.readUShortSmart(); // L: 254
										var12 = var0.readUShortSmart(); // L: 255
										if (var12 != 32767) { // L: 256
											var24 = var0.readUShortSmart(); // L: 257
											var19 = var0.readUnsignedByteSub(); // L: 258
											var15 = var12 > 0 ? var0.readUnsignedByteNeg() : var19; // L: 259
											var5.addHealthBar(var11, Client.cycle, var12, var24, var19, var15); // L: 260
										} else {
											var5.removeHealthBar(var11); // L: 262
										}
									}
								}
							}

							if ((var6 & 512) != 0) { // L: 266
								class193[] var17 = Players.field1291; // L: 267
								class193[] var18 = new class193[]{class193.field2247, class193.field2248, class193.field2246, class193.field2244}; // L: 271
								var17[var4] = (class193)Varps.findEnumerated(var18, var0.readByte()); // L: 273
							}

							if ((var6 & 16) != 0) { // L: 275
								var5.field1163 = var0.readUnsignedShortAddLE(); // L: 276
								if (var5.pathLength == 0) { // L: 277
									var5.orientation = var5.field1163; // L: 278
									var5.field1163 = -1; // L: 279
								}
							}

							if ((var6 & 16384) != 0) { // L: 282
								var5.field1192 = var0.readByteAdd(); // L: 283
								var5.field1181 = var0.readByte(); // L: 284
								var5.field1180 = var0.readByte(); // L: 285
								var5.field1140 = var0.readByte(); // L: 286
								var5.field1183 = var0.readUnsignedShortAdd() + Client.cycle; // L: 287
								var5.field1136 = var0.readUnsignedShort() + Client.cycle; // L: 288
								var5.field1185 = var0.readUnsignedShortAdd(); // L: 289
								if (var5.field1103) { // L: 290
									var5.field1192 += var5.tileX; // L: 291
									var5.field1181 += var5.tileY; // L: 292
									var5.field1180 += var5.tileX; // L: 293
									var5.field1140 += var5.tileY; // L: 294
									var5.pathLength = 0; // L: 295
								} else {
									var5.field1192 += var5.pathX[0]; // L: 298
									var5.field1181 += var5.pathY[0]; // L: 299
									var5.field1180 += var5.pathX[0]; // L: 300
									var5.field1140 += var5.pathY[0]; // L: 301
									var5.pathLength = 1; // L: 302
								}

								var5.field1202 = 0; // L: 304
							}

							if ((var6 & 2) != 0) { // L: 306
								var5.targetIndex = var0.readUnsignedShortAdd(); // L: 307
								if (var5.targetIndex == 65535) { // L: 308
									var5.targetIndex = -1;
								}
							}

							if ((var6 & 2048) != 0) { // L: 310
								var5.field1188 = Client.cycle + var0.readUnsignedShortAdd(); // L: 311
								var5.field1158 = Client.cycle + var0.readUnsignedShortAddLE(); // L: 312
								var5.field1190 = var0.readByteSub(); // L: 313
								var5.field1191 = var0.readByte(); // L: 314
								var5.field1169 = var0.readByteSub(); // L: 315
								var5.field1194 = (byte)var0.readUnsignedByteSub(); // L: 316
							}

							if ((var6 & 4) != 0) { // L: 318
								var8 = var0.readUnsignedByteSub(); // L: 319
								byte[] var21 = new byte[var8]; // L: 320
								Buffer var26 = new Buffer(var21); // L: 321
								var0.readBytesLE(var21, 0, var8); // L: 322
								Players.field1292[var4] = var26; // L: 323
								var5.read(var26); // L: 324
							}

							if ((var6 & 256) != 0) { // L: 326
								var5.spotAnimation = var0.readUnsignedShort(); // L: 327
								var8 = var0.readUnsignedIntME(); // L: 328
								var5.spotAnimationHeight = var8 >> 16; // L: 329
								var5.field1147 = (var8 & 65535) + Client.cycle; // L: 330
								var5.spotAnimationFrame = 0; // L: 331
								var5.spotAnimationFrameCycle = 0; // L: 332
								if (var5.field1147 > Client.cycle) { // L: 333
									var5.spotAnimationFrame = -1;
								}

								if (var5.spotAnimation == 65535) { // L: 334
									var5.spotAnimation = -1;
								}
							}

							if ((var6 & 8192) != 0) { // L: 336
								for (var8 = 0; var8 < 3; ++var8) { // L: 337
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}

							if ((var6 & 64) != 0) { // L: 339
								var8 = var0.readUnsignedShortLE(); // L: 340
								if (var8 == 65535) { // L: 341
									var8 = -1;
								}

								var16 = var0.readUnsignedByteAdd(); // L: 342
								class120.performPlayerAnimation(var5, var8, var16); // L: 343
							}

							if (var5.field1103) { // L: 345
								if (var7 == 127) { // L: 346
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									class193 var25;
									if (var7 != class193.field2248.field2245) { // L: 349
										class193[] var22 = new class193[]{class193.field2247, class193.field2248, class193.field2246, class193.field2244}; // L: 352
										var25 = (class193)Varps.findEnumerated(var22, var7); // L: 354
									} else {
										var25 = Players.field1291[var4]; // L: 356
									}

									var5.method2282(var5.tileX, var5.tileY, var25); // L: 357
								}
							}
						}

						if (var0.offset - var2 != var1) { // L: 364
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 365
						}
					}
				}
			}
		}
	} // L: 367

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-229358462"
	)
	static int method2103(int var0, Script var1, boolean var2) {
		return 2; // L: 4459
	}
}
