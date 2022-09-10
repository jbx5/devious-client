import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2073861103
	)
	static int field256;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -148423469
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 53739603
	)
	@Export("size")
	int size;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("n")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("k")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("w")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("s")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("q")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;Lpq;I)Lpq;",
		garbageValue = "1337986767"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = ClanChannel.method3285(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IB)I",
		garbageValue = "52"
	)
	static final int method648(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10474
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10476
				int var3 = 0; // L: 10477
				int var4 = 0; // L: 10478
				byte var5 = 0; // L: 10479

				while (true) {
					int var6 = var2[var4++]; // L: 10481
					int var7 = 0; // L: 10482
					byte var8 = 0; // L: 10483
					if (var6 == 0) { // L: 10484
						return var3;
					}

					if (var6 == 1) { // L: 10485
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10486
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10487
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10488
						var9 = var2[var4++] << 16; // L: 10489
						var9 += var2[var4++]; // L: 10490
						var10 = SpotAnimationDefinition.getWidget(var9); // L: 10491
						var11 = var2[var4++]; // L: 10492
						if (var11 != -1 && (!UserComparator3.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10493
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10494
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10495
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10499
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10500
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10501
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10502
						var7 = class67.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10503
						for (var9 = 0; var9 < 25; ++var9) { // L: 10504
							if (Skills.Skills_enabled[var9]) { // L: 10505
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10508
						var9 = var2[var4++] << 16; // L: 10509
						var9 += var2[var4++]; // L: 10510
						var10 = SpotAnimationDefinition.getWidget(var9); // L: 10511
						var11 = var2[var4++]; // L: 10512
						if (var11 != -1 && (!UserComparator3.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10513
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10514
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10515
									var7 = 999999999; // L: 10516
									break; // L: 10517
								}
							}
						}
					}

					if (var6 == 11) { // L: 10522
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10523
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10524
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10525
						int var13 = var2[var4++]; // L: 10526
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10527
					}

					if (var6 == 14) { // L: 10529
						var9 = var2[var4++]; // L: 10530
						var7 = UserComparator8.getVarbit(var9); // L: 10531
					}

					if (var6 == 15) { // L: 10533
						var8 = 1;
					}

					if (var6 == 16) { // L: 10534
						var8 = 2;
					}

					if (var6 == 17) { // L: 10535
						var8 = 3;
					}

					if (var6 == 18) { // L: 10536
						var7 = class128.baseX * 64 + (class67.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 10537
						var7 = WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 10538
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10539
						if (var5 == 0) { // L: 10540
							var3 += var7;
						}

						if (var5 == 1) { // L: 10541
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10542
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10543
							var3 *= var7;
						}

						var5 = 0; // L: 10544
					} else {
						var5 = var8; // L: 10546
					}
				}
			} catch (Exception var14) { // L: 10549
				return -1; // L: 10550
			}
		} else {
			return -2;
		}
	}
}
