import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jy")
public class class271 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1891650379"
	)
	static SecureRandom method5377() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILgb;Lgj;I)Z",
		garbageValue = "163347867"
	)
	public static final boolean method5376(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 229
		int var6 = var1; // L: 230
		byte var7 = 64; // L: 231
		byte var8 = 64; // L: 232
		int var9 = var0 - var7; // L: 233
		int var10 = var1 - var8; // L: 234
		class194.directions[var7][var8] = 99; // L: 235
		class194.distances[var7][var8] = 0; // L: 236
		byte var11 = 0; // L: 237
		int var12 = 0; // L: 238
		class194.bufferX[var11] = var0; // L: 239
		int var20 = var11 + 1;
		class194.bufferY[var11] = var1; // L: 240
		int[][] var13 = var4.flags; // L: 241

		while (true) {
			label309:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label286:
							do {
								if (var12 == var20) { // L: 242
									Bounds.field4422 = var5; // L: 361
									class347.field4205 = var6; // L: 362
									return false; // L: 363
								}

								var5 = class194.bufferX[var12]; // L: 243
								var6 = class194.bufferY[var12]; // L: 244
								var12 = var12 + 1 & 4095; // L: 245
								var18 = var5 - var9; // L: 246
								var19 = var6 - var10; // L: 247
								var14 = var5 - var4.xInset; // L: 248
								var15 = var6 - var4.yInset; // L: 249
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 250
									Bounds.field4422 = var5; // L: 251
									class347.field4205 = var6; // L: 252
									return true; // L: 253
								}

								var16 = class194.distances[var18][var19] + 1; // L: 255
								if (var18 > 0 && class194.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 256 257 258 259
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5 - 1; // L: 263
											class194.bufferY[var20] = var6; // L: 264
											var20 = var20 + 1 & 4095; // L: 265
											class194.directions[var18 - 1][var19] = 2; // L: 266
											class194.distances[var18 - 1][var19] = var16; // L: 267
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) { // L: 261
											break;
										}

										++var17; // L: 260
									}
								}

								if (var18 < 128 - var2 && class194.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 269 270 271 272
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5 + 1; // L: 276
											class194.bufferY[var20] = var6; // L: 277
											var20 = var20 + 1 & 4095; // L: 278
											class194.directions[var18 + 1][var19] = 8; // L: 279
											class194.distances[var18 + 1][var19] = var16; // L: 280
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 274
											break;
										}

										++var17; // L: 273
									}
								}

								if (var19 > 0 && class194.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 282 283 284 285
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5; // L: 289
											class194.bufferY[var20] = var6 - 1; // L: 290
											var20 = var20 + 1 & 4095; // L: 291
											class194.directions[var18][var19 - 1] = 1; // L: 292
											class194.distances[var18][var19 - 1] = var16; // L: 293
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 287
											break;
										}

										++var17; // L: 286
									}
								}

								if (var19 < 128 - var2 && class194.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 295 296 297 298
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5; // L: 302
											class194.bufferY[var20] = var6 + 1; // L: 303
											var20 = var20 + 1 & 4095; // L: 304
											class194.directions[var18][var19 + 1] = 4; // L: 305
											class194.distances[var18][var19 + 1] = var16; // L: 306
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) { // L: 300
											break;
										}

										++var17; // L: 299
									}
								}

								if (var18 > 0 && var19 > 0 && class194.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 308 309 310
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class194.bufferX[var20] = var5 - 1; // L: 315
											class194.bufferY[var20] = var6 - 1; // L: 316
											var20 = var20 + 1 & 4095; // L: 317
											class194.directions[var18 - 1][var19 - 1] = 3; // L: 318
											class194.distances[var18 - 1][var19 - 1] = var16; // L: 319
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 312 313
											break;
										}

										++var17; // L: 311
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class194.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 321 322 323
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class194.bufferX[var20] = var5 + 1; // L: 328
											class194.bufferY[var20] = var6 - 1; // L: 329
											var20 = var20 + 1 & 4095; // L: 330
											class194.directions[var18 + 1][var19 - 1] = 9; // L: 331
											class194.distances[var18 + 1][var19 - 1] = var16; // L: 332
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 325 326
											break;
										}

										++var17; // L: 324
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class194.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 334 335 336
									for (var17 = 1; var17 < var2; ++var17) { // L: 337
										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 338 339
											continue label286;
										}
									}

									class194.bufferX[var20] = var5 - 1; // L: 341
									class194.bufferY[var20] = var6 + 1; // L: 342
									var20 = var20 + 1 & 4095; // L: 343
									class194.directions[var18 - 1][var19 + 1] = 6; // L: 344
									class194.distances[var18 - 1][var19 + 1] = var16; // L: 345
								}
							} while(var18 >= 128 - var2); // L: 347
						} while(var19 >= 128 - var2);
					} while(class194.directions[var18 + 1][var19 + 1] != 0); // L: 348
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 349

				for (var17 = 1; var17 < var2; ++var17) { // L: 350
					if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 351 352
						continue label309;
					}
				}

				class194.bufferX[var20] = var5 + 1; // L: 354
				class194.bufferY[var20] = var6 + 1; // L: 355
				var20 = var20 + 1 & 4095; // L: 356
				class194.directions[var18 + 1][var19 + 1] = 12; // L: 357
				class194.distances[var18 + 1][var19 + 1] = var16; // L: 358
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "39"
	)
	static int method5375(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3497
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3498
			return 1; // L: 3499
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3501
			Interpreter.Interpreter_intStackSize -= 3; // L: 3502
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3503
			class142.privateChatMode = ChatChannel.method2146(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3504
			if (class142.privateChatMode == null) { // L: 3505
				class142.privateChatMode = PrivateChatMode.field4851;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3506
			PacketBufferNode var13 = class120.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher); // L: 3508
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3509
			var13.packetBuffer.writeByte(class142.privateChatMode.field4853); // L: 3510
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3511
			Client.packetWriter.addNode(var13); // L: 3512
			return 1; // L: 3513
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3515
				var8 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3516
				Interpreter.Interpreter_intStackSize -= 2; // L: 3517
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3518
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3519
				var6 = class120.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher); // L: 3521
				var6.packetBuffer.writeByte(class357.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3522
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3523
				var6.packetBuffer.writeByte(var7 - 1); // L: 3524
				var6.packetBuffer.writeByte(var9); // L: 3525
				Client.packetWriter.addNode(var6); // L: 3526
				return 1; // L: 3527
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3529
					Interpreter.Interpreter_intStackSize -= 2; // L: 3530
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3531
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3532
					var5 = class1.Messages_getByChannelAndID(var3, var7); // L: 3533
					if (var5 != null) { // L: 3534
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3535
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3536
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3537
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3538
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3539
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3540
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3543
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3544
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3545
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3546
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3547
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3548
					}

					return 1; // L: 3550
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3552
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3553
						var4 = InterfaceParent.Messages_getMessage(var3); // L: 3554
						if (var4 != null) { // L: 3555
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3556
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3557
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3558
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3559
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3560
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3561
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3564
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3565
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3566
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3567
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3568
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3569
						}

						return 1; // L: 3571
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3573
						if (class142.privateChatMode == null) { // L: 3574
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class142.privateChatMode.field4853; // L: 3575
						}

						return 1; // L: 3576
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3578
							var8 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3579
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3580
							var12 = WallDecoration.method4664(var7, var8, clientLanguage, -1); // L: 3581
							Client.packetWriter.addNode(var12); // L: 3582
							return 1; // L: 3583
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3585
							VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3586
							var8 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 3587
							String var11 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 3588
							var12 = class120.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher); // L: 3590
							var12.packetBuffer.writeShort(0); // L: 3591
							int var10 = var12.packetBuffer.offset; // L: 3592
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3593
							MouseRecorder.method2253(var12.packetBuffer, var11); // L: 3594
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3595
							Client.packetWriter.addNode(var12); // L: 3596
							return 1; // L: 3597
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3599
							var8 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3600
							Interpreter.Interpreter_intStackSize -= 2; // L: 3601
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3602
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3603
							var6 = WallDecoration.method4664(var7, var8, clientLanguage, var9); // L: 3604
							Client.packetWriter.addNode(var6); // L: 3605
							return 1; // L: 3606
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3608
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3615
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3616
								return 1; // L: 3617
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3619
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3620
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class347.Messages_getHistorySize(var3); // L: 3621
								return 1; // L: 3622
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3624
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3625
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class358.Messages_getLastChatID(var3); // L: 3626
								return 1; // L: 3627
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3629
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3630
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.method5699(var3); // L: 3631
								return 1; // L: 3632
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3634
								var8 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3635
								class1.doCheat(var8); // L: 3636
								return 1; // L: 3637
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3639
								Client.field752 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3640
								return 1; // L: 3641
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3643
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = Client.field752; // L: 3644
								return 1; // L: 3645
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3647
								var8 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3648
								System.out.println(var8); // L: 3649
								return 1; // L: 3650
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 3652
								Interpreter.Interpreter_intStackSize -= 2; // L: 3653
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3654
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3655
								var5 = class1.Messages_getByChannelAndID(var3, var7); // L: 3656
								if (var5 != null) { // L: 3657
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3658
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3659
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3660
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3661
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3662
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3663
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3664
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3665
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3668
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3669
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3670
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3671
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3672
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3673
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3674
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3675
								}

								return 1; // L: 3677
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 3679
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3680
								var4 = InterfaceParent.Messages_getMessage(var3); // L: 3681
								if (var4 != null) { // L: 3682
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3683
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3684
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3685
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3686
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3687
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3688
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3689
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3690
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3693
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3694
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3695
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3696
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3697
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3698
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 3699
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3700
								}

								return 1; // L: 3702
							} else {
								return 2; // L: 3704
							}
						} else {
							if (class67.localPlayer != null && class67.localPlayer.username != null) { // L: 3610
								var8 = class67.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3611
							}

							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var8; // L: 3612
							return 1; // L: 3613
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1512778162"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10777
	}
}
