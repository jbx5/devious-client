import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 1615048077
	)
	static int field327;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field324;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lad;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			Clock.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ljw;S)V",
		garbageValue = "1126"
	)
	static final void method813(class264 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7363
		int var2;
		int var3;
		byte var4;
		int var5;
		int var6;
		int var7;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var37;
		int var38;
		int var39;
		if (class264.field3046 == var0) { // L: 7364
			var2 = var1.readUnsignedShort(); // L: 7365
			var3 = var1.readUnsignedByteNeg() * 4; // L: 7366
			var4 = var1.readByteSub(); // L: 7367
			var5 = var1.readUnsignedByteNeg(); // L: 7368
			var6 = var1.readUnsignedByteNeg(); // L: 7369
			var7 = (var6 >> 4 & 7) + class392.field4456; // L: 7370
			var38 = (var6 & 7) + ItemComposition.field2163; // L: 7371
			var39 = var1.readUnsignedByteSub(); // L: 7372
			byte var40 = var1.readByte(); // L: 7373
			var11 = var1.readUnsignedShortAdd(); // L: 7374
			var12 = var1.readUnsignedShort(); // L: 7375
			var13 = var1.readShort(); // L: 7376
			var14 = var1.readUnsignedByteAdd() * 4; // L: 7377
			var37 = var4 + var7; // L: 7378
			var10 = var40 + var38; // L: 7379
			if (var7 >= 0 && var38 >= 0 && var7 < 104 && var38 < 104 && var37 >= 0 && var10 >= 0 && var37 < 104 && var10 < 104 && var2 != 65535) { // L: 7380
				var7 = var7 * 128 + 64; // L: 7381
				var38 = var38 * 128 + 64; // L: 7382
				var37 = var37 * 128 + 64; // L: 7383
				var10 = var10 * 128 + 64; // L: 7384
				Projectile var36 = new Projectile(var2, Tiles.Client_plane, var7, var38, class120.getTileHeight(var7, var38, Tiles.Client_plane) - var14, var11 + Client.cycle, var12 + Client.cycle, var39, var5, var13, var3); // L: 7385
				var36.setDestination(var37, var10, class120.getTileHeight(var37, var10, Tiles.Client_plane) - var3, var11 + Client.cycle); // L: 7386
				Client.projectiles.addFirst(var36); // L: 7387
			}

		} else {
			if (class264.field3054 == var0) { // L: 7391
				var2 = var1.readUnsignedShort(); // L: 7392
				var3 = var1.readUnsignedShortAdd(); // L: 7393
				var4 = var1.readByteSub(); // L: 7394
				var5 = var1.readUnsignedByteSub(); // L: 7395
				var6 = (var5 >> 4 & 7) + class392.field4456; // L: 7396
				var7 = (var5 & 7) + ItemComposition.field2163; // L: 7397
				byte var8 = var1.readByteSub(); // L: 7398
				byte var9 = var1.readByteAdd(); // L: 7399
				var10 = var1.readUnsignedByteAdd(); // L: 7400
				var11 = var10 >> 2; // L: 7401
				var12 = var10 & 3; // L: 7402
				var13 = Client.field564[var11]; // L: 7403
				var14 = var1.readUnsignedShortLE(); // L: 7404
				byte var15 = var1.readByteNeg(); // L: 7405
				int var16 = var1.readUnsignedShortLE(); // L: 7406
				Player var17;
				if (var16 == Client.localPlayerIndex) { // L: 7408
					var17 = class67.localPlayer;
				} else {
					var17 = Client.players[var16]; // L: 7409
				}

				if (var17 != null) { // L: 7410
					ObjectComposition var18 = PlayerComposition.getObjectDefinition(var2); // L: 7411
					int var19;
					int var20;
					if (var12 != 1 && var12 != 3) { // L: 7414
						var19 = var18.sizeX; // L: 7419
						var20 = var18.sizeY; // L: 7420
					} else {
						var19 = var18.sizeY; // L: 7415
						var20 = var18.sizeX; // L: 7416
					}

					int var21 = var6 + (var19 >> 1); // L: 7422
					int var22 = var6 + (var19 + 1 >> 1); // L: 7423
					int var23 = var7 + (var20 >> 1); // L: 7424
					int var24 = var7 + (var20 + 1 >> 1); // L: 7425
					int[][] var25 = Tiles.Tiles_heights[Tiles.Client_plane]; // L: 7426
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2; // L: 7427
					int var27 = (var6 << 7) + (var19 << 6); // L: 7428
					int var28 = (var7 << 7) + (var20 << 6); // L: 7429
					Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28); // L: 7430
					if (var29 != null) { // L: 7431
						MilliClock.updatePendingSpawn(Tiles.Client_plane, var6, var7, var13, -1, 0, 0, var14 + 1, var3 + 1); // L: 7432
						var17.animationCycleStart = var14 + Client.cycle; // L: 7433
						var17.animationCycleEnd = var3 + Client.cycle; // L: 7434
						var17.model0 = var29; // L: 7435
						var17.field1106 = var6 * 128 + var19 * 64; // L: 7436
						var17.field1096 = var7 * 128 + var20 * 64; // L: 7437
						var17.tileHeight2 = var26; // L: 7438
						byte var30;
						if (var9 > var8) { // L: 7439
							var30 = var9; // L: 7440
							var9 = var8; // L: 7441
							var8 = var30; // L: 7442
						}

						if (var4 > var15) { // L: 7444
							var30 = var4; // L: 7445
							var4 = var15; // L: 7446
							var15 = var30; // L: 7447
						}

						var17.minX = var6 + var9; // L: 7449
						var17.maxX = var6 + var8; // L: 7450
						var17.minY = var7 + var4; // L: 7451
						var17.maxY = var15 + var7; // L: 7452
					}
				}
			}

			TileItem var41;
			if (class264.field3049 == var0) { // L: 7456
				var2 = var1.readUnsignedShortAdd(); // L: 7457
				var3 = var1.readUnsignedByteSub(); // L: 7458
				var37 = (var3 >> 4 & 7) + class392.field4456; // L: 7459
				var5 = (var3 & 7) + ItemComposition.field2163; // L: 7460
				if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7461
					NodeDeque var35 = Client.groundItems[Tiles.Client_plane][var37][var5]; // L: 7462
					if (var35 != null) { // L: 7463
						for (var41 = (TileItem)var35.last(); var41 != null; var41 = (TileItem)var35.previous()) { // L: 7464 7465 7470
							if ((var2 & 32767) == var41.id) { // L: 7466
								var41.remove(); // L: 7467
								break;
							}
						}

						if (var35.last() == null) { // L: 7472
							Client.groundItems[Tiles.Client_plane][var37][var5] = null;
						}

						Friend.updateItemPile(var37, var5); // L: 7473
					}
				}

			} else if (class264.field3052 == var0) { // L: 7478
				var2 = var1.readUnsignedShortAddLE(); // L: 7479
				var3 = var1.readUnsignedByte(); // L: 7480
				var37 = (var3 >> 4 & 7) + class392.field4456; // L: 7481
				var5 = (var3 & 7) + ItemComposition.field2163; // L: 7482
				var6 = var1.readUnsignedShort(); // L: 7483
				var7 = var1.readUnsignedShort(); // L: 7484
				if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7485
					NodeDeque var43 = Client.groundItems[Tiles.Client_plane][var37][var5]; // L: 7486
					if (var43 != null) { // L: 7487
						for (TileItem var34 = (TileItem)var43.last(); var34 != null; var34 = (TileItem)var43.previous()) { // L: 7488 7489 7494
							if ((var2 & 32767) == var34.id && var7 == var34.quantity) { // L: 7490
								var34.quantity = var6; // L: 7491
								break;
							}
						}

						Friend.updateItemPile(var37, var5); // L: 7496
					}
				}

			} else if (class264.field3055 == var0) { // L: 7501
				var2 = var1.readUnsignedByte(); // L: 7502
				var3 = var2 >> 2; // L: 7503
				var37 = var2 & 3; // L: 7504
				var5 = Client.field564[var3]; // L: 7505
				var6 = var1.readUnsignedShortAdd(); // L: 7506
				var7 = var1.readUnsignedByteAdd(); // L: 7507
				var38 = (var7 >> 4 & 7) + class392.field4456; // L: 7508
				var39 = (var7 & 7) + ItemComposition.field2163; // L: 7509
				if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) { // L: 7510
					MilliClock.updatePendingSpawn(Tiles.Client_plane, var38, var39, var5, var6, var3, var37, 0, -1); // L: 7511
				}

			} else {
				if (class264.field3056 == var0) { // L: 7515
					var2 = var1.readUnsignedByte(); // L: 7516
					var3 = var1.readUnsignedByteSub(); // L: 7517
					var37 = (var3 >> 4 & 7) + class392.field4456; // L: 7518
					var5 = (var3 & 7) + ItemComposition.field2163; // L: 7519
					var6 = var1.readUnsignedByteAdd(); // L: 7520
					var7 = var6 >> 4 & 15; // L: 7521
					var38 = var6 & 7; // L: 7522
					var39 = var1.readUnsignedShortAddLE(); // L: 7523
					if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7524
						var10 = var7 + 1; // L: 7525
						if (class67.localPlayer.pathX[0] >= var37 - var10 && class67.localPlayer.pathX[0] <= var10 + var37 && class67.localPlayer.pathY[0] >= var5 - var10 && class67.localPlayer.pathY[0] <= var5 + var10 && Player.clientPreferences.method2474() != 0 && var38 > 0 && Client.soundEffectCount < 50) { // L: 7526 7527
							Client.soundEffectIds[Client.soundEffectCount] = var39; // L: 7528
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var38; // L: 7529
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7530
							Client.soundEffects[Client.soundEffectCount] = null; // L: 7531
							Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var37 << 16); // L: 7532
							++Client.soundEffectCount; // L: 7533
						}
					}
				}

				if (class264.field3051 == var0) { // L: 7538
					var2 = var1.readUnsignedByteNeg(); // L: 7539
					var3 = var2 >> 2; // L: 7540
					var37 = var2 & 3; // L: 7541
					var5 = Client.field564[var3]; // L: 7542
					var6 = var1.readUnsignedByteAdd(); // L: 7543
					var7 = (var6 >> 4 & 7) + class392.field4456; // L: 7544
					var38 = (var6 & 7) + ItemComposition.field2163; // L: 7545
					var39 = var1.readUnsignedShortLE(); // L: 7546
					if (var7 >= 0 && var38 >= 0 && var7 < 103 && var38 < 103) { // L: 7547
						if (var5 == 0) { // L: 7548
							BoundaryObject var33 = MusicPatchNode.scene.method4281(Tiles.Client_plane, var7, var38); // L: 7549
							if (var33 != null) { // L: 7550
								var11 = class156.Entity_unpackID(var33.tag); // L: 7551
								if (var3 == 2) { // L: 7552
									var33.renderable1 = new DynamicObject(var11, 2, var37 + 4, Tiles.Client_plane, var7, var38, var39, false, var33.renderable1); // L: 7553
									var33.renderable2 = new DynamicObject(var11, 2, var37 + 1 & 3, Tiles.Client_plane, var7, var38, var39, false, var33.renderable2); // L: 7554
								} else {
									var33.renderable1 = new DynamicObject(var11, var3, var37, Tiles.Client_plane, var7, var38, var39, false, var33.renderable1); // L: 7556
								}
							}
						}

						if (var5 == 1) { // L: 7559
							WallDecoration var44 = MusicPatchNode.scene.method4282(Tiles.Client_plane, var7, var38); // L: 7560
							if (var44 != null) { // L: 7561
								var11 = class156.Entity_unpackID(var44.tag); // L: 7562
								if (var3 != 4 && var3 != 5) { // L: 7563
									if (var3 == 6) { // L: 7564
										var44.renderable1 = new DynamicObject(var11, 4, var37 + 4, Tiles.Client_plane, var7, var38, var39, false, var44.renderable1);
									} else if (var3 == 7) { // L: 7565
										var44.renderable1 = new DynamicObject(var11, 4, (var37 + 2 & 3) + 4, Tiles.Client_plane, var7, var38, var39, false, var44.renderable1);
									} else if (var3 == 8) { // L: 7566
										var44.renderable1 = new DynamicObject(var11, 4, var37 + 4, Tiles.Client_plane, var7, var38, var39, false, var44.renderable1); // L: 7567
										var44.renderable2 = new DynamicObject(var11, 4, (var37 + 2 & 3) + 4, Tiles.Client_plane, var7, var38, var39, false, var44.renderable2); // L: 7568
									}
								} else {
									var44.renderable1 = new DynamicObject(var11, 4, var37, Tiles.Client_plane, var7, var38, var39, false, var44.renderable1);
								}
							}
						}

						if (var5 == 2) { // L: 7572
							GameObject var45 = MusicPatchNode.scene.getGameObject(Tiles.Client_plane, var7, var38); // L: 7573
							if (var3 == 11) { // L: 7574
								var3 = 10;
							}

							if (var45 != null) {
								var45.renderable = new DynamicObject(class156.Entity_unpackID(var45.tag), var3, var37, Tiles.Client_plane, var7, var38, var39, false, var45.renderable); // L: 7575
							}
						}

						if (var5 == 3) { // L: 7577
							FloorDecoration var46 = MusicPatchNode.scene.getFloorDecoration(Tiles.Client_plane, var7, var38); // L: 7578
							if (var46 != null) { // L: 7579
								var46.renderable = new DynamicObject(class156.Entity_unpackID(var46.tag), 22, var37, Tiles.Client_plane, var7, var38, var39, false, var46.renderable);
							}
						}
					}

				} else if (class264.field3057 == var0) { // L: 7584
					var2 = var1.readUnsignedByteNeg(); // L: 7585
					var3 = (var2 >> 4 & 7) + class392.field4456; // L: 7586
					var37 = (var2 & 7) + ItemComposition.field2163; // L: 7587
					var5 = var1.readUnsignedShortAddLE(); // L: 7588
					var6 = var1.readUnsignedShortAdd(); // L: 7589
					var7 = var1.readUnsignedByteAdd(); // L: 7590
					if (var3 >= 0 && var37 >= 0 && var3 < 104 && var37 < 104) { // L: 7591
						var3 = var3 * 128 + 64; // L: 7592
						var37 = var37 * 128 + 64; // L: 7593
						GraphicsObject var42 = new GraphicsObject(var5, Tiles.Client_plane, var3, var37, class120.getTileHeight(var3, var37, Tiles.Client_plane) - var7, var6, Client.cycle); // L: 7594
						Client.graphicsObjects.addFirst(var42); // L: 7595
					}

				} else if (class264.field3050 != var0) { // L: 7599
					if (class264.field3047 == var0) { // L: 7622
						var2 = var1.readUnsignedShortLE(); // L: 7623
						var3 = var1.readUnsignedShort(); // L: 7624
						var37 = var1.readUnsignedByteAdd(); // L: 7625
						var5 = (var37 >> 4 & 7) + class392.field4456; // L: 7626
						var6 = (var37 & 7) + ItemComposition.field2163; // L: 7627
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7628
							var41 = new TileItem(); // L: 7629
							var41.id = var2; // L: 7630
							var41.quantity = var3; // L: 7631
							if (Client.groundItems[Tiles.Client_plane][var5][var6] == null) { // L: 7632
								Client.groundItems[Tiles.Client_plane][var5][var6] = new NodeDeque();
							}

							Client.groundItems[Tiles.Client_plane][var5][var6].addFirst(var41); // L: 7633
							Friend.updateItemPile(var5, var6); // L: 7634
						}

					} else if (class264.field3053 == var0) { // L: 7638
						var2 = var1.readUnsignedByteSub(); // L: 7639
						var3 = var2 >> 2; // L: 7640
						var37 = var2 & 3; // L: 7641
						var5 = Client.field564[var3]; // L: 7642
						var6 = var1.readUnsignedByteSub(); // L: 7643
						var7 = (var6 >> 4 & 7) + class392.field4456; // L: 7644
						var38 = (var6 & 7) + ItemComposition.field2163; // L: 7645
						if (var7 >= 0 && var38 >= 0 && var7 < 104 && var38 < 104) { // L: 7646
							MilliClock.updatePendingSpawn(Tiles.Client_plane, var7, var38, var5, -1, var3, var37, 0, -1); // L: 7647
						}

					}
				} else {
					var2 = var1.readUnsignedShortLE(); // L: 7600
					var3 = var1.readUnsignedByteNeg(); // L: 7601
					var37 = (var3 >> 4 & 7) + class392.field4456; // L: 7602
					var5 = (var3 & 7) + ItemComposition.field2163; // L: 7603
					var6 = var1.readUnsignedShortAddLE(); // L: 7604
					if (var37 >= 0 && var5 >= 0 && var37 < 104 && var5 < 104) { // L: 7605
						NodeDeque var31 = Client.groundItems[Tiles.Client_plane][var37][var5]; // L: 7606
						if (var31 != null) { // L: 7607
							for (TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7608 7609 7614
								if ((var2 & 32767) == var32.id && var6 == var32.quantity) { // L: 7610
									var32.remove(); // L: 7611
									break;
								}
							}

							if (var31.last() == null) { // L: 7616
								Client.groundItems[Tiles.Client_plane][var37][var5] = null;
							}

							Friend.updateItemPile(var37, var5); // L: 7617
						}
					}

				}
			}
		}
	} // L: 7389 7476 7499 7513 7582 7597 7620 7636 7649 7651

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lkw;B)Z",
		garbageValue = "-25"
	)
	static final boolean method817(Widget var0) {
		int var1 = var0.contentType; // L: 11755
		if (var1 == 205) { // L: 11756
			Client.logoutTimer = 250; // L: 11757
			return true; // L: 11758
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11760
				var2 = (var1 - 300) / 2; // L: 11761
				var3 = var1 & 1; // L: 11762
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11763
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11765
				var2 = (var1 - 314) / 2; // L: 11766
				var3 = var1 & 1; // L: 11767
				Client.playerAppearance.method5730(var2, var3 == 1); // L: 11768
			}

			if (var1 == 324) { // L: 11770
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 11771
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11772
				PacketBufferNode var4 = class120.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 11774
				Client.playerAppearance.write(var4.packetBuffer); // L: 11775
				Client.packetWriter.addNode(var4); // L: 11776
				return true; // L: 11777
			} else {
				return false; // L: 11779
			}
		}
	}
}
