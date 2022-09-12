import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public final class class269 {
	@ObfuscatedName("f")
	static final HashMap field3192;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 659320505
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Bounds field3195;
	@ObfuscatedName("hg")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("hb")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		field3192 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5362("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/util/TimeZone;",
		garbageValue = "-6"
	)
	static TimeZone method5362(String var0) {
		synchronized(field3192) { // L: 22
			TimeZone var2 = (TimeZone)field3192.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3192.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)Ljava/lang/Object;",
		garbageValue = "-189745240"
	)
	static Object method5366(class434 var0) {
		if (var0 == null) { // L: 4659
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 4660
		} else {
			switch(var0.field4694) { // L: 4662
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4668
			case 2:
				return Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 4664
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 4666
			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1214293925"
	)
	static final void method5365() {
		Players.method2581(false); // L: 5529
		Client.field523 = 0; // L: 5530
		boolean var0 = true; // L: 5531

		int var1;
		for (var1 = 0; var1 < regionLandArchives.length; ++var1) { // L: 5532
			if (class124.regionMapArchiveIds[var1] != -1 && regionLandArchives[var1] == null) { // L: 5533 5534
				regionLandArchives[var1] = class434.archive9.takeFile(class124.regionMapArchiveIds[var1], 0); // L: 5535
				if (regionLandArchives[var1] == null) { // L: 5536
					var0 = false; // L: 5537
					++Client.field523; // L: 5538
				}
			}

			if (HitSplatDefinition.regionLandArchiveIds[var1] != -1 && class33.regionMapArchives[var1] == null) { // L: 5542 5543
				class33.regionMapArchives[var1] = class434.archive9.takeFileEncrypted(HitSplatDefinition.regionLandArchiveIds[var1], 0, class202.xteaKeys[var1]); // L: 5544
				if (class33.regionMapArchives[var1] == null) { // L: 5545
					var0 = false; // L: 5546
					++Client.field523; // L: 5547
				}
			}
		}

		if (!var0) { // L: 5552
			Client.field774 = 1; // L: 5553
		} else {
			Client.field558 = 0; // L: 5556
			var0 = true; // L: 5557

			int var3;
			int var4;
			for (var1 = 0; var1 < regionLandArchives.length; ++var1) { // L: 5558
				byte[] var15 = class33.regionMapArchives[var1]; // L: 5559
				if (var15 != null) { // L: 5560
					var3 = (regions[var1] >> 8) * 64 - class128.baseX * 64; // L: 5561
					var4 = (regions[var1] & 255) * 64 - WorldMapData_1.baseY * 64; // L: 5562
					if (Client.isInInstance) { // L: 5563
						var3 = 10; // L: 5564
						var4 = 10; // L: 5565
					}

					var0 &= Buddy.method6989(var15, var3, var4); // L: 5567
				}
			}

			if (!var0) { // L: 5570
				Client.field774 = 2; // L: 5571
			} else {
				if (Client.field774 != 0) { // L: 5574
					class146.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class14.playPcmPlayers(); // L: 5575
				MusicPatchNode.scene.clear(); // L: 5576

				for (var1 = 0; var1 < 4; ++var1) { // L: 5577
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5578
					for (var2 = 0; var2 < 104; ++var2) { // L: 5579
						for (var3 = 0; var3 < 104; ++var3) { // L: 5580
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5581
						}
					}
				}

				class14.playPcmPlayers(); // L: 5585
				class148.method3260(); // L: 5586
				var1 = regionLandArchives.length; // L: 5587
				class303.method5918(); // L: 5588
				Players.method2581(true); // L: 5589
				int var5;
				if (!Client.isInInstance) { // L: 5590
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5591
						var3 = (regions[var2] >> 8) * 64 - class128.baseX * 64; // L: 5592
						var4 = (regions[var2] & 255) * 64 - WorldMapData_1.baseY * 64; // L: 5593
						var14 = regionLandArchives[var2]; // L: 5594
						if (var14 != null) { // L: 5595
							class14.playPcmPlayers(); // L: 5596
							PacketBufferNode.method5355(var14, var3, var4, class6.field17 * 8 - 48, class146.field1684 * 8 - 48, Client.collisionMaps); // L: 5597
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5600
						var3 = (regions[var2] >> 8) * 64 - class128.baseX * 64; // L: 5601
						var4 = (regions[var2] & 255) * 64 - WorldMapData_1.baseY * 64; // L: 5602
						var14 = regionLandArchives[var2]; // L: 5603
						if (var14 == null && class146.field1684 < 800) { // L: 5604
							class14.playPcmPlayers(); // L: 5605
							Decimator.method1104(var3, var4, 64, 64); // L: 5606
						}
					}

					Players.method2581(true); // L: 5609

					for (var2 = 0; var2 < var1; ++var2) { // L: 5610
						byte[] var13 = class33.regionMapArchives[var2]; // L: 5611
						if (var13 != null) { // L: 5612
							var4 = (regions[var2] >> 8) * 64 - class128.baseX * 64; // L: 5613
							var5 = (regions[var2] & 255) * 64 - WorldMapData_1.baseY * 64; // L: 5614
							class14.playPcmPlayers(); // L: 5615
							Language.method6230(var13, var4, var5, MusicPatchNode.scene, Client.collisionMaps); // L: 5616
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5620
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5621
						class14.playPcmPlayers(); // L: 5622

						for (var3 = 0; var3 < 13; ++var3) { // L: 5623
							for (var4 = 0; var4 < 13; ++var4) { // L: 5624
								boolean var16 = false; // L: 5625
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5626
								if (var6 != -1) { // L: 5627
									var7 = var6 >> 24 & 3; // L: 5628
									var8 = var6 >> 1 & 3; // L: 5629
									var9 = var6 >> 14 & 1023; // L: 5630
									var10 = var6 >> 3 & 2047; // L: 5631
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5632

									for (int var12 = 0; var12 < regions.length; ++var12) { // L: 5633
										if (regions[var12] == var11 && regionLandArchives[var12] != null) { // L: 5634
											class21.method315(regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5635
											var16 = true; // L: 5636
											break;
										}
									}
								}

								if (!var16) { // L: 5641
									class364.method6771(var2, var3 * 8, var4 * 8); // L: 5642
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5647
						for (var3 = 0; var3 < 13; ++var3) { // L: 5648
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5649
							if (var4 == -1) { // L: 5650
								Decimator.method1104(var2 * 8, var3 * 8, 8, 8); // L: 5651
							}
						}
					}

					Players.method2581(true); // L: 5655

					for (var2 = 0; var2 < 4; ++var2) { // L: 5656
						class14.playPcmPlayers(); // L: 5657

						for (var3 = 0; var3 < 13; ++var3) { // L: 5658
							for (var4 = 0; var4 < 13; ++var4) { // L: 5659
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5660
								if (var5 != -1) { // L: 5661
									var6 = var5 >> 24 & 3; // L: 5662
									var7 = var5 >> 1 & 3; // L: 5663
									var8 = var5 >> 14 & 1023; // L: 5664
									var9 = var5 >> 3 & 2047; // L: 5665
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5666

									for (var11 = 0; var11 < regions.length; ++var11) { // L: 5667
										if (regions[var11] == var10 && class33.regionMapArchives[var11] != null) { // L: 5668
											Tiles.method2148(class33.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, MusicPatchNode.scene, Client.collisionMaps); // L: 5669
											break; // L: 5670
										}
									}
								}
							}
						}
					}
				}

				Players.method2581(true); // L: 5678
				class14.playPcmPlayers(); // L: 5679
				WorldMapArea.method4808(MusicPatchNode.scene, Client.collisionMaps); // L: 5680
				Players.method2581(true); // L: 5681
				var2 = Tiles.Tiles_minPlane; // L: 5682
				if (var2 > Tiles.Client_plane) { // L: 5683
					var2 = Tiles.Client_plane;
				}

				if (var2 < Tiles.Client_plane - 1) { // L: 5684
					var2 = Tiles.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5685
					MusicPatchNode.scene.init(Tiles.Tiles_minPlane);
				} else {
					MusicPatchNode.scene.init(0); // L: 5686
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5687
					for (var4 = 0; var4 < 104; ++var4) { // L: 5688
						Friend.updateItemPile(var3, var4); // L: 5689
					}
				}

				class14.playPcmPlayers(); // L: 5692
				ScriptFrame.method1133(); // L: 5693
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5694
				PacketBufferNode var17;
				if (IgnoreList.client.hasFrame()) { // L: 5695
					var17 = class120.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher); // L: 5697
					var17.packetBuffer.writeInt(1057001181); // L: 5698
					Client.packetWriter.addNode(var17); // L: 5699
				}

				if (!Client.isInInstance) { // L: 5701
					var3 = (class6.field17 - 6) / 8; // L: 5702
					var4 = (class6.field17 + 6) / 8; // L: 5703
					var5 = (class146.field1684 - 6) / 8; // L: 5704
					var6 = (class146.field1684 + 6) / 8; // L: 5705

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5706
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5707
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5708
								class434.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 5709
								class434.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 5710
							}
						}
					}
				}

				Coord.updateGameState(30); // L: 5714
				class14.playPcmPlayers(); // L: 5715
				class12.method176(); // L: 5716
				var17 = class120.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 5717
				Client.packetWriter.addNode(var17); // L: 5718
				class18.method282(); // L: 5719
			}
		}
	} // L: 5554 5572 5720

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "16711935"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class33.method647(); // L: 11622
		NPC.method2528(); // L: 11623
		int var1 = class119.VarpDefinition_get(var0).type; // L: 11624
		if (var1 != 0) { // L: 11625
			int var2 = Varps.Varps_main[var0]; // L: 11626
			if (var1 == 1) { // L: 11627
				if (var2 == 1) { // L: 11628
					class124.method2965(0.9D);
				}

				if (var2 == 2) { // L: 11629
					class124.method2965(0.8D);
				}

				if (var2 == 3) { // L: 11630
					class124.method2965(0.7D);
				}

				if (var2 == 4) { // L: 11631
					class124.method2965(0.6D);
				}
			}

			if (var1 == 3) { // L: 11633
				if (var2 == 0) { // L: 11634
					NPC.method2511(255);
				}

				if (var2 == 1) { // L: 11635
					NPC.method2511(192);
				}

				if (var2 == 2) { // L: 11636
					NPC.method2511(128);
				}

				if (var2 == 3) { // L: 11637
					NPC.method2511(64);
				}

				if (var2 == 4) { // L: 11638
					NPC.method2511(0);
				}
			}

			if (var1 == 4) { // L: 11640
				if (var2 == 0) { // L: 11641
					class150.method3286(127);
				}

				if (var2 == 1) { // L: 11642
					class150.method3286(96);
				}

				if (var2 == 2) { // L: 11643
					class150.method3286(64);
				}

				if (var2 == 3) { // L: 11644
					class150.method3286(32);
				}

				if (var2 == 4) { // L: 11645
					class150.method3286(0);
				}
			}

			if (var1 == 5) { // L: 11647
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) { // L: 11648
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 11649
				Client.field565 = var2;
			}

			if (var1 == 10) { // L: 11650
				if (var2 == 0) { // L: 11651
					class264.method5345(127);
				}

				if (var2 == 1) { // L: 11652
					class264.method5345(96);
				}

				if (var2 == 2) { // L: 11653
					class264.method5345(64);
				}

				if (var2 == 3) { // L: 11654
					class264.method5345(32);
				}

				if (var2 == 4) { // L: 11655
					class264.method5345(0);
				}
			}

			if (var1 == 17) { // L: 11657
				Client.followerIndex = var2 & 65535; // L: 11658
			}

			if (var1 == 18) { // L: 11660
				Client.playerAttackOption = (AttackOption)Varps.findEnumerated(FontName.method7594(), var2); // L: 11661
				if (Client.playerAttackOption == null) { // L: 11662
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11664
				if (var2 == -1) { // L: 11665
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11666
				}
			}

			if (var1 == 22) { // L: 11668
				Client.npcAttackOption = (AttackOption)Varps.findEnumerated(FontName.method7594(), var2); // L: 11669
				if (Client.npcAttackOption == null) { // L: 11670
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11672
}
