import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dv")
public class class119 implements MouseWheel {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1883864704
	)
	static int field1479;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1480;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1470;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1473;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1472;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1471;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static final class119 field1474;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1003591649
	)
	final int field1475;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -139197625
	)
	final int field1476;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2132375559
	)
	final int field1481;

	static {
		field1480 = new class119(0, 0, (String)null, 0); // L: 14
		field1470 = new class119(1, 1, (String)null, 9); // L: 15
		field1473 = new class119(2, 2, (String)null, 3); // L: 16
		field1472 = new class119(3, 3, (String)null, 6); // L: 17
		field1471 = new class119(4, 4, (String)null, 1);
		field1474 = new class119(5, 5, (String)null, 3);
	}

	class119(int var1, int var2, String var3, int var4) {
		this.field1475 = var1; // L: 25
		this.field1476 = var2; // L: 26
		this.field1481 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1476; // L: 46
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1462804223"
	)
	int method2901() {
		return this.field1481; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfo;",
		garbageValue = "-21"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "2"
	)
	static int method2911(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class438 var6;
		int var7;
		if (var0 != ScriptOpcodes.DB_FIND_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND) { // L: 4472
			if (var0 != ScriptOpcodes.DB_FINDNEXT) { // L: 4494
				int var19;
				int var20;
				if (var0 == ScriptOpcodes.DB_GETFIELD) { // L: 4503
					Interpreter.Interpreter_intStackSize -= 3; // L: 4504
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4505
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4506
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4507
					var20 = class425.method7664(var19); // L: 4508
					var7 = TaskHandler.method3414(var19); // L: 4509
					int var21 = Renderable.method4462(var19); // L: 4510
					DbRowType var26 = SecureRandomCallable.getDbRowType(var3); // L: 4511
					DbTableType var27 = class229.getDbTableType(var20); // L: 4512
					int[] var28 = var27.types[var7]; // L: 4513
					int var12 = 0; // L: 4514
					int var13 = var28.length; // L: 4515
					if (var21 >= 0) { // L: 4516
						if (var21 >= var13) { // L: 4517
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4518
						}

						var12 = var21; // L: 4520
						var13 = var21 + 1; // L: 4521
					}

					Object[] var14 = var26.getColumnType(var7); // L: 4523
					if (var14 == null && var27.defaultValues != null) { // L: 4524 4525
						var14 = var27.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4527
						for (var15 = var12; var15 < var13; ++var15) { // L: 4528
							var16 = var28[var15]; // L: 4529
							class434 var22 = class360.method6732(var16); // L: 4530
							if (var22 == class434.field4689) { // L: 4531
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Bounds.method7118(var16); // L: 4532
							}
						}

						return 1; // L: 4534
					} else {
						var15 = var14.length / var28.length; // L: 4536
						if (var5 >= 0 && var5 < var15) { // L: 4537
							for (var16 = var12; var16 < var13; ++var16) { // L: 4540
								int var17 = var16 + var28.length * var5; // L: 4541
								class434 var18 = class360.method6732(var28[var16]); // L: 4542
								if (var18 == class434.field4689) { // L: 4543
									Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4544
								}
							}

							return 1; // L: 4546
						} else {
							throw new RuntimeException(); // L: 4538
						}
					}
				} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) { // L: 4548
					Interpreter.Interpreter_intStackSize -= 2; // L: 4549
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4550
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4551
					var5 = 0; // L: 4552
					var20 = class425.method7664(var19); // L: 4553
					var7 = TaskHandler.method3414(var19); // L: 4554
					DbRowType var25 = SecureRandomCallable.getDbRowType(var3); // L: 4555
					DbTableType var9 = class229.getDbTableType(var20); // L: 4556
					int[] var10 = var9.types[var7]; // L: 4557
					Object[] var11 = var25.getColumnType(var7); // L: 4558
					if (var11 == null && var9.defaultValues != null) { // L: 4559 4560
						var11 = var9.defaultValues[var7]; // L: 4561
					}

					if (var11 != null) { // L: 4564
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 4565
					return 1; // L: 4566
				} else if (var0 != ScriptOpcodes.DB_FINDALL_WITH_COUNT && var0 != ScriptOpcodes.DB_FINDALL) { // L: 4568
					if (var0 == ScriptOpcodes.DB_GETROWTABLE) { // L: 4585
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4586
						DbRowType var24 = SecureRandomCallable.getDbRowType(var3); // L: 4587
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.tableId; // L: 4588
						return 1; // L: 4589
					} else if (var0 == ScriptOpcodes.DB_GETROW) { // L: 4591
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4592
						var19 = -1; // L: 4593
						if (class161.field1784 != null && var3 >= 0 && var3 < class161.field1784.size()) { // L: 4594
							var19 = (Integer)class161.field1784.get(var3); // L: 4595
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 4597
						return 1; // L: 4598
					} else if (var0 != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT && var0 != ScriptOpcodes.DB_FIND_FILTER) { // L: 4600
						return 2; // L: 4627
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4601
						var4 = class13.method184(var3); // L: 4602
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4603
						var6 = VarpDefinition.method3527(var5); // L: 4604
						if (var6 == null) { // L: 4605
							throw new RuntimeException(); // L: 4606
						} else if (class425.method7664(var5) != Client.field618) { // L: 4608
							throw new RuntimeException(); // L: 4609
						} else if (class161.field1784 == null && class161.field1784.isEmpty()) { // L: 4611
							throw new RuntimeException(); // L: 4612
						} else {
							var7 = Renderable.method4462(var5); // L: 4614
							List var8 = var6.method7824(var4, var7); // L: 4615
							class161.field1784 = new LinkedList(class161.field1784); // L: 4616
							if (var8 != null) { // L: 4617
								class161.field1784.retainAll(var8); // L: 4618
							} else {
								class161.field1784.clear(); // L: 4621
							}

							class17.field100 = class161.field1784.iterator(); // L: 4623
							if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) { // L: 4624
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class161.field1784.size();
							}

							return 1; // L: 4625
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 4569
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4570
					class438 var23 = Decimator.method1103(var3); // L: 4571
					if (var23 == null) { // L: 4572
						throw new RuntimeException(); // L: 4573
					} else {
						class161.field1784 = var23.method7824(0, 0); // L: 4575
						var5 = 0; // L: 4576
						if (class161.field1784 != null) { // L: 4577
							Client.field618 = var3; // L: 4578
							class17.field100 = class161.field1784.iterator(); // L: 4579
							var5 = class161.field1784.size(); // L: 4580
						}

						if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) { // L: 4582
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 4583
					}
				}
			} else {
				if (class17.field100 != null && class17.field100.hasNext()) { // L: 4495
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class17.field100.next(); // L: 4496
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4499
				}

				return 1; // L: 4501
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4473
			var4 = class13.method184(var3); // L: 4474
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4475
			var6 = VarpDefinition.method3527(var5); // L: 4476
			if (var6 == null) { // L: 4477
				throw new RuntimeException(); // L: 4478
			} else {
				var7 = Renderable.method4462(var5); // L: 4480
				class161.field1784 = var6.method7824(var4, var7); // L: 4481
				if (class161.field1784 != null) { // L: 4482
					Client.field618 = class425.method7664(var5); // L: 4483
					class17.field100 = class161.field1784.iterator(); // L: 4484
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) { // L: 4485
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class161.field1784.size();
					}
				} else {
					Client.field618 = -1; // L: 4488
					class17.field100 = null; // L: 4489
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) { // L: 4490
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4492
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "157009554"
	)
	static final void method2909() {
		int var0 = SceneTilePaint.field2638 * 128 + 64; // L: 3701
		int var1 = UrlRequester.field1355 * 128 + 64; // L: 3702
		int var2 = class120.getTileHeight(var0, var1, Tiles.Client_plane) - Strings.field3978; // L: 3703
		Tile.method4128(var0, var2, var1); // L: 3704
		var0 = field1479 * 16384 + 64; // L: 3705
		var1 = MusicPatchNode.field3301 * 128 + 64; // L: 3706
		var2 = class120.getTileHeight(var0, var1, Tiles.Client_plane) - class123.field1520; // L: 3707
		int var3 = var0 - TaskHandler.cameraX; // L: 3708
		int var4 = var2 - SecureRandomFuture.cameraY; // L: 3709
		int var5 = var1 - ApproximateRouteStrategy.cameraZ; // L: 3710
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 3711
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 3712
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 3713
		class7.method67(var7, var8); // L: 3714
	} // L: 3715

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIII)V",
		garbageValue = "115669779"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9565
		if (Client.menuOptionsCount < 400) { // L: 9566
			if (var4.transforms != null) { // L: 9567
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9568
				if (var4.isInteractable) { // L: 9569
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9570
						String var5 = var0.method2505(); // L: 9571
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1203 != 0) { // L: 9572
							var6 = var0.field1203 != -1 ? var0.field1203 : var4.combatLevel; // L: 9573
							var9 = class67.localPlayer.combatLevel; // L: 9576
							int var10 = var9 - var6; // L: 9578
							String var8;
							if (var10 < -9) { // L: 9579
								var8 = SoundCache.colorStartTag(16711680); // L: 9580
							} else if (var10 < -6) { // L: 9583
								var8 = SoundCache.colorStartTag(16723968); // L: 9584
							} else if (var10 < -3) { // L: 9587
								var8 = SoundCache.colorStartTag(16740352); // L: 9588
							} else if (var10 < 0) { // L: 9591
								var8 = SoundCache.colorStartTag(16756736); // L: 9592
							} else if (var10 > 9) { // L: 9595
								var8 = SoundCache.colorStartTag(65280); // L: 9596
							} else if (var10 > 6) { // L: 9599
								var8 = SoundCache.colorStartTag(4259584); // L: 9600
							} else if (var10 > 3) { // L: 9603
								var8 = SoundCache.colorStartTag(8453888); // L: 9604
							} else if (var10 > 0) { // L: 9607
								var8 = SoundCache.colorStartTag(12648192); // L: 9608
							} else {
								var8 = SoundCache.colorStartTag(16776960); // L: 9611
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9613
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9615
							class135.insertMenuItemNoShift("Examine", SoundCache.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9616
						}

						if (Client.isItemSelected == 1) { // L: 9619
							class135.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SoundCache.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9620
						} else if (Client.isSpellSelected) { // L: 9623
							if ((UrlRequest.selectedSpellFlags & 2) == 2) { // L: 9624
								class135.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SoundCache.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9625
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9630
							String[] var7 = var4.actions; // L: 9631
							int var11;
							if (var7 != null) { // L: 9632
								for (var11 = 4; var11 >= 0; --var11) { // L: 9633
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9634
										var9 = 0; // L: 9635
										if (var11 == 0) { // L: 9636
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9637
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9638
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9639
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9640
											var9 = var6 + 13;
										}

										class135.insertMenuItemNoShift(var7[var11], SoundCache.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9641
									}
								}
							}

							if (var7 != null) { // L: 9646
								for (var11 = 4; var11 >= 0; --var11) { // L: 9647
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9648
										short var12 = 0; // L: 9649
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9650
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class67.localPlayer.combatLevel) { // L: 9651
												var12 = 2000; // L: 9652
											}

											var9 = 0; // L: 9654
											if (var11 == 0) { // L: 9655
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9656
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9657
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9658
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9659
												var9 = var12 + 13;
											}

											class135.insertMenuItemNoShift(var7[var11], SoundCache.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9660
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9665
								class135.insertMenuItemNoShift("Examine", SoundCache.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9666
							}
						}

					}
				}
			}
		}
	} // L: 9670
}
