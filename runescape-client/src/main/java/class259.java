import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class259 {
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 2064904887
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqf;II)V",
		garbageValue = "1620685629"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 380
		if (var2) { // L: 381
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 382
		Player var4 = Client.players[var1]; // L: 383
		if (var3 == 0) { // L: 384
			if (var2) { // L: 385
				var4.field1103 = false; // L: 386
			} else if (Client.localPlayerIndex == var1) { // L: 389
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class128.baseX * 64 + var4.pathX[0] >> 13 << 14) + (WorldMapData_1.baseY * 64 + var4.pathY[0] >> 13); // L: 390
				if (var4.field1163 != -1) { // L: 391
					Players.Players_orientations[var1] = var4.field1163;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 392
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 393
				Client.players[var1] = null; // L: 394
				if (var0.readBits(1) != 0) { // L: 395
					class139.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 398
				var5 = var0.readBits(3); // L: 399
				var6 = var4.pathX[0]; // L: 400
				var7 = var4.pathY[0]; // L: 401
				if (var5 == 0) { // L: 402
					--var6; // L: 403
					--var7; // L: 404
				} else if (var5 == 1) { // L: 406
					--var7;
				} else if (var5 == 2) { // L: 407
					++var6; // L: 408
					--var7; // L: 409
				} else if (var5 == 3) { // L: 411
					--var6;
				} else if (var5 == 4) { // L: 412
					++var6;
				} else if (var5 == 5) { // L: 413
					--var6; // L: 414
					++var7; // L: 415
				} else if (var5 == 6) { // L: 417
					++var7;
				} else if (var5 == 7) { // L: 418
					++var6; // L: 419
					++var7; // L: 420
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 422
					var4.resetPath(var6, var7); // L: 423
					var4.field1103 = false; // L: 424
				} else if (var2) { // L: 426
					var4.field1103 = true; // L: 427
					var4.tileX = var6; // L: 428
					var4.tileY = var7; // L: 429
				} else {
					var4.field1103 = false; // L: 432
					var4.method2282(var6, var7, Players.field1291[var1]); // L: 433
				}

			} else if (var3 == 2) { // L: 437
				var5 = var0.readBits(4); // L: 438
				var6 = var4.pathX[0]; // L: 439
				var7 = var4.pathY[0]; // L: 440
				if (var5 == 0) { // L: 441
					var6 -= 2; // L: 442
					var7 -= 2; // L: 443
				} else if (var5 == 1) { // L: 445
					--var6; // L: 446
					var7 -= 2; // L: 447
				} else if (var5 == 2) { // L: 449
					var7 -= 2;
				} else if (var5 == 3) { // L: 450
					++var6; // L: 451
					var7 -= 2; // L: 452
				} else if (var5 == 4) { // L: 454
					var6 += 2; // L: 455
					var7 -= 2; // L: 456
				} else if (var5 == 5) { // L: 458
					var6 -= 2; // L: 459
					--var7; // L: 460
				} else if (var5 == 6) { // L: 462
					var6 += 2; // L: 463
					--var7; // L: 464
				} else if (var5 == 7) { // L: 466
					var6 -= 2;
				} else if (var5 == 8) { // L: 467
					var6 += 2;
				} else if (var5 == 9) { // L: 468
					var6 -= 2; // L: 469
					++var7; // L: 470
				} else if (var5 == 10) { // L: 472
					var6 += 2; // L: 473
					++var7; // L: 474
				} else if (var5 == 11) { // L: 476
					var6 -= 2; // L: 477
					var7 += 2; // L: 478
				} else if (var5 == 12) { // L: 480
					--var6; // L: 481
					var7 += 2; // L: 482
				} else if (var5 == 13) { // L: 484
					var7 += 2;
				} else if (var5 == 14) { // L: 485
					++var6; // L: 486
					var7 += 2; // L: 487
				} else if (var5 == 15) { // L: 489
					var6 += 2; // L: 490
					var7 += 2; // L: 491
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 493
					if (var2) { // L: 497
						var4.field1103 = true; // L: 498
						var4.tileX = var6; // L: 499
						var4.tileY = var7; // L: 500
					} else {
						var4.field1103 = false; // L: 503
						var4.method2282(var6, var7, Players.field1291[var1]); // L: 504
					}
				} else {
					var4.resetPath(var6, var7); // L: 494
					var4.field1103 = false; // L: 495
				}

			} else {
				var5 = var0.readBits(1); // L: 508
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 509
					var6 = var0.readBits(12); // L: 510
					var7 = var6 >> 10; // L: 511
					var8 = var6 >> 5 & 31; // L: 512
					if (var8 > 15) { // L: 513
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 514
					if (var9 > 15) { // L: 515
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 516
					var11 = var9 + var4.pathY[0]; // L: 517
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 518
						if (var2) { // L: 522
							var4.field1103 = true; // L: 523
							var4.tileX = var10; // L: 524
							var4.tileY = var11; // L: 525
						} else {
							var4.field1103 = false; // L: 528
							var4.method2282(var10, var11, Players.field1291[var1]); // L: 529
						}
					} else {
						var4.resetPath(var10, var11); // L: 519
						var4.field1103 = false; // L: 520
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 531
					if (Client.localPlayerIndex == var1) { // L: 532
						Tiles.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 535
					var7 = var6 >> 28; // L: 536
					var8 = var6 >> 14 & 16383; // L: 537
					var9 = var6 & 16383; // L: 538
					var10 = (class128.baseX * 64 + var8 + var4.pathX[0] & 16383) - class128.baseX * 64; // L: 539
					var11 = (WorldMapData_1.baseY * 64 + var9 + var4.pathY[0] & 16383) - WorldMapData_1.baseY * 64; // L: 540
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 541
						var4.resetPath(var10, var11); // L: 542
						var4.field1103 = false; // L: 543
					} else if (var2) { // L: 545
						var4.field1103 = true; // L: 546
						var4.tileX = var10; // L: 547
						var4.tileY = var11; // L: 548
					} else {
						var4.field1103 = false; // L: 551
						var4.method2282(var10, var11, Players.field1291[var1]); // L: 552
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 554
					if (Client.localPlayerIndex == var1) { // L: 555
						Tiles.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 387 396 435 506 533 556

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "-625260085"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 73
		if (var3) { // L: 74
			var5 |= 65536L;
		}

		return var5; // L: 75
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgp;Lgj;B)V",
		garbageValue = "113"
	)
	static final void method5338(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = PlayerComposition.getObjectDefinition(var4); // L: 1015
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) { // L: 1018
			var10 = var9.sizeX; // L: 1023
			var11 = var9.sizeY; // L: 1024
		} else {
			var10 = var9.sizeY; // L: 1019
			var11 = var9.sizeX; // L: 1020
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) { // L: 1030
			var12 = (var10 >> 1) + var2; // L: 1031
			var13 = var2 + (var10 + 1 >> 1); // L: 1032
		} else {
			var12 = var2; // L: 1035
			var13 = var2 + 1; // L: 1036
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) { // L: 1038
			var14 = var3 + (var11 >> 1); // L: 1039
			var15 = var3 + (var11 + 1 >> 1); // L: 1040
		} else {
			var14 = var3; // L: 1043
			var15 = var3 + 1; // L: 1044
		}

		int[][] var16 = Tiles.Tiles_heights[var1]; // L: 1046
		int var17 = var16[var13][var15] + var16[var12][var15] + var16[var13][var14] + var16[var12][var14] >> 2; // L: 1047
		int var18 = (var2 << 7) + (var10 << 6); // L: 1048
		int var19 = (var3 << 7) + (var11 << 6); // L: 1049
		long var20 = calculateTag(var2, var3, 2, var9.int1 == 0, var4); // L: 1050
		int var22 = (var5 << 6) + var6; // L: 1051
		if (var9.int3 == 1) { // L: 1052
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) { // L: 1053
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1055
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1056
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22); // L: 1057
			if (var9.interactType == 1) { // L: 1058
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) { // L: 1061
			if (var6 >= 12) { // L: 1069
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1071
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1072
				}

				var7.method4413(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1073
				if (var9.interactType != 0) { // L: 1074
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) { // L: 1077
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1079
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1080
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1013[var5], 0, var20, var22); // L: 1081
				if (var9.interactType != 0) { // L: 1082
					var8.method3988(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) { // L: 1085
				if (var9.animationId == -1 && var9.transforms == null) { // L: 1087
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1088
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1005[var5], 0, var20, var22); // L: 1089
				if (var9.interactType != 0) { // L: 1090
					var8.method3988(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) { // L: 1093
					var23 = var5 + 1 & 3; // L: 1094
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1097
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19); // L: 1098
						var25 = var9.getModel(2, var23, var16, var18, var17, var19); // L: 1099
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1102
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1103
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field1013[var5], Tiles.field1013[var23], var20, var22); // L: 1105
					if (var9.interactType != 0) { // L: 1106
						var8.method3988(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) { // L: 1109
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1111
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1112
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1005[var5], 0, var20, var22); // L: 1113
					if (var9.interactType != 0) { // L: 1114
						var8.method3988(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) { // L: 1117
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1119
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1120
					}

					var7.method4413(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22); // L: 1121
					if (var9.interactType != 0) { // L: 1122
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) { // L: 1125
					if (var9.animationId == -1 && var9.transforms == null) { // L: 1127
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1128
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field1013[var5], 0, 0, 0, var20, var22); // L: 1129
				} else {
					long var24;
					Object var26;
					if (var6 == 5) { // L: 1132
						var23 = 16; // L: 1133
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1134
						if (var24 != 0L) { // L: 1135
							var23 = PlayerComposition.getObjectDefinition(class156.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1137
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1138
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field1013[var5], 0, var23 * Tiles.field1006[var5], var23 * Tiles.field1000[var5], var20, var22); // L: 1139
					} else if (var6 == 6) { // L: 1142
						var23 = 8; // L: 1143
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1144
						if (0L != var24) { // L: 1145
							var23 = PlayerComposition.getObjectDefinition(class156.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) { // L: 1147
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1148
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1003[var5], var23 * Tiles.field1009[var5], var20, var22); // L: 1149
					} else if (var6 == 7) { // L: 1152
						int var29 = var5 + 2 & 3; // L: 1154
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1155
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1156
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22); // L: 1157
					} else if (var6 == 8) { // L: 1160
						var23 = 8; // L: 1161
						var24 = var7.getBoundaryObjectTag(var0, var2, var3); // L: 1162
						if (0L != var24) { // L: 1163
							var23 = PlayerComposition.getObjectDefinition(class156.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3; // L: 1166
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) { // L: 1167
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19); // L: 1168
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19); // L: 1169
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1172
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1173
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1003[var5], var23 * Tiles.field1009[var5], var20, var22); // L: 1175
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) { // L: 1063
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null); // L: 1064
			}

			if (var30 != null) {
				var7.method4413(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22); // L: 1065
			}

			if (var9.interactType != 0) { // L: 1066
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	} // L: 1059 1067 1075 1083 1091 1107 1115 1123 1130 1140 1150 1158 1176 1178

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-871644748"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (FloorOverlayDefinition.loadInterface(var0)) { // L: 10785
			class17.updateInterface(Calendar.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10786
		}
	} // L: 10787
}
