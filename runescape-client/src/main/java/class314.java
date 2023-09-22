import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public final class class314 {
	@ObfuscatedName("ak")
	static final HashMap field3402;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("clock")
	static Clock clock;

	static {
		field3402 = new HashMap();
		java.util.Calendar.getInstance(method5898("Europe/London"));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1775212150"
	)
	static TimeZone method5898(String var0) {
		synchronized(field3402) {
			TimeZone var2 = (TimeZone)field3402.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3402.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	public static boolean method5899(int var0) {
		return var0 >= WorldMapDecorationType.field3878.id && var0 <= WorldMapDecorationType.field3875.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-13"
	)
	static Date method5897() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjt;Lih;I)V",
		garbageValue = "-1981678396"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class91.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = GrandExchangeOfferAgeComparator.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				LoginScreenAnimation.method2497(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method4716(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = UserComparator6.field1486[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1036[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var0][var1][var2] = 50;
								Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator6.field1486[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var0][var1][var2] = 50;
								Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator6.field1486[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4331(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4726(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1037[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Tiles.Tiles_underlays2[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4331(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = var4 + 1 & 3;
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1036[var4], Tiles.field1036[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2] |= 585;
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = UserComparator6.field1486[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = UserComparator6.field1486[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2] |= 1170;
									var10000 = UserComparator6.field1486[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4331(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4726(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1037[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									Tiles.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									Tiles.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									Tiles.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									Tiles.Tiles_underlays2[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4331(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.method4716(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4726(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1036[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1036[var4], 0, var22 * Tiles.field1038[var4], var22 * Tiles.field1033[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1040[var4], var22 * Tiles.field1042[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class91.getObjectDefinition(SecureRandomFuture.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1040[var4], var22 * Tiles.field1042[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var29 != null && var6.method4716(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method4912() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > Tiles.Tiles_underlays2[var0][var31 + var1][var32 + var2]) {
									Tiles.Tiles_underlays2[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-176913511"
	)
	static void method5896() {
		int var0;
		if (Client.field577 == class94.field1161) {
			class10.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			SpriteMask.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.field577 = class94.field1149;
		} else if (class94.field1149 == Client.field577) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.field577 = class94.field1156;
		} else {
			Archive var39;
			if (class94.field1156 == Client.field577) {
				class92.field1117 = class202.newArchive(0, false, true, true, false);
				class199.field2009 = class202.newArchive(1, false, true, true, false);
				SoundSystem.archive2 = class202.newArchive(2, true, false, true, false);
				AbstractByteArrayCopier.archive4 = class202.newArchive(3, false, true, true, false);
				class469.field4812 = class202.newArchive(4, false, true, true, false);
				class198.archive9 = class202.newArchive(5, true, true, true, false);
				CollisionMap.archive6 = class202.newArchive(6, true, true, true, false);
				GrandExchangeOfferOwnWorldComparator.field515 = class202.newArchive(7, false, true, true, false);
				class199.archive8 = class202.newArchive(8, false, true, true, false);
				class241.field2558 = class202.newArchive(9, false, true, true, false);
				class190.archive10 = class202.newArchive(10, false, true, true, false);
				Language.field4435 = class202.newArchive(11, false, true, true, false);
				SongTask.archive12 = class202.newArchive(12, false, true, true, false);
				class27.archive13 = class202.newArchive(13, true, false, true, false);
				ArchiveDiskAction.field4291 = class202.newArchive(14, false, true, true, false);
				class317.field3415 = class202.newArchive(15, false, true, true, false);
				WorldMapDecorationType.field3881 = class202.newArchive(17, true, true, true, false);
				class358.field3898 = class202.newArchive(18, false, true, true, false);
				AABB.field2658 = class202.newArchive(19, false, true, true, false);
				HorizontalAlignment.field2028 = class202.newArchive(20, false, true, true, false);
				class313.field3396 = class202.newArchive(21, false, true, true, false);
				ArchiveDisk var36 = null;
				if (JagexCache.JagexCache_dat2File != null) {
					var36 = new ArchiveDisk(22, JagexCache.JagexCache_dat2File, UserComparator8.JagexCache_idxFiles[22], 1000000);
				}

				var39 = new Archive(var36, UserComparator10.masterDisk, class59.field452, 22, false, true, true, true, true);
				class319.field3442 = var39;
				Login.Login_loadingText = "Connecting to update server";
				Login.Login_loadingPercent = 20;
				Client.field577 = class94.field1151;
			} else if (class94.field1151 == Client.field577) {
				byte var33 = 0;
				var0 = var33 + class92.field1117.percentage() * 4 / 100;
				var0 += class199.field2009.percentage() * 4 / 100;
				var0 += SoundSystem.archive2.percentage() * 2 / 100;
				var0 += AbstractByteArrayCopier.archive4.percentage() * 2 / 100;
				var0 += class469.field4812.percentage() * 6 / 100;
				var0 += class198.archive9.percentage() * 4 / 100;
				var0 += CollisionMap.archive6.percentage() * 2 / 100;
				var0 += GrandExchangeOfferOwnWorldComparator.field515.percentage() * 54 / 100;
				var0 += class199.archive8.percentage() * 2 / 100;
				var0 += class241.field2558.percentage() * 2 / 100;
				var0 += class190.archive10.percentage() * 2 / 100;
				var0 += Language.field4435.percentage() * 2 / 100;
				var0 += SongTask.archive12.percentage() * 2 / 100;
				var0 += class27.archive13.percentage() * 2 / 100;
				var0 += ArchiveDiskAction.field4291.percentage() * 2 / 100;
				var0 += class317.field3415.percentage() * 2 / 100;
				var0 += AABB.field2658.percentage() / 100;
				var0 += class358.field3898.percentage() / 100;
				var0 += HorizontalAlignment.field2028.percentage() / 100;
				var0 += class313.field3396.percentage() / 100;
				var0 += class319.field3442.percentage() / 100;
				var0 += WorldMapDecorationType.field3881.method6856() && WorldMapDecorationType.field3881.isFullyLoaded() ? 1 : 0;
				if (var0 != 100) {
					if (var0 != 0) {
						Login.Login_loadingText = "Checking for updates - " + var0 + "%";
					}

					Login.Login_loadingPercent = 30;
				} else {
					MusicSong.method6210(class92.field1117, "Animations");
					MusicSong.method6210(class199.field2009, "Skeletons");
					MusicSong.method6210(class469.field4812, "Sound FX");
					MusicSong.method6210(class198.archive9, "Maps");
					MusicSong.method6210(CollisionMap.archive6, "Music Tracks");
					MusicSong.method6210(GrandExchangeOfferOwnWorldComparator.field515, "Models");
					MusicSong.method6210(class199.archive8, "Sprites");
					MusicSong.method6210(Language.field4435, "Music Jingles");
					MusicSong.method6210(ArchiveDiskAction.field4291, "Music Samples");
					MusicSong.method6210(class317.field3415, "Music Patches");
					MusicSong.method6210(AABB.field2658, "World Map");
					MusicSong.method6210(class358.field3898, "World Map Geography");
					MusicSong.method6210(HorizontalAlignment.field2028, "World Map Ground");
					class241.field2562 = new GraphicsDefaults();
					class241.field2562.decode(WorldMapDecorationType.field3881);
					Login.Login_loadingText = "Loaded update list";
					Login.Login_loadingPercent = 30;
					Client.field577 = class94.field1152;
				}
			} else {
				int var5;
				if (class94.field1152 == Client.field577) {
					class133.method3060(22050, !Client.isLowDetail, 2);
					ArrayList var41 = new ArrayList(3);
					TaskHandler var28 = GameEngine.taskHandler;
					short var29 = 2048;
					if (var29 < 256) {
						var29 = 256;
					}

					PcmPlayer var34;
					try {
						PcmPlayer var25 = class16.pcmPlayerProvider.player();
						var25.samples = new int[(class306.PcmPlayer_stereo ? 2 : 1) * 256];
						var25.field289 = var29;
						var25.init();
						var25.capacity = (var29 & -1024) + 1024;
						if (var25.capacity > 16384) {
							var25.capacity = 16384;
						}

						var25.open(var25.capacity);
						if (class225.field2372 > 0 && UserComparator4.soundSystem == null) {
							UserComparator4.soundSystem = new SoundSystem();
							class353.soundSystemExecutor = Executors.newScheduledThreadPool(1);
							class353.soundSystemExecutor.scheduleAtFixedRate(UserComparator4.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
						}

						if (UserComparator4.soundSystem != null) {
							if (UserComparator4.soundSystem.players[0] != null) {
								throw new IllegalArgumentException();
							}

							UserComparator4.soundSystem.players[0] = var25;
						}

						var34 = var25;
					} catch (Throwable var22) {
						var34 = new PcmPlayer();
					}

					class171.pcmPlayer1 = var34;
					class140.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var27 = new PcmStreamMixer();
					var27.addSubStream(class140.pcmStreamMixer);

					for (var5 = 0; var5 < 3; ++var5) {
						MidiPcmStream var31 = new MidiPcmStream();
						var31.method5980(9, 128);
						var27.addSubStream(var31);
						var41.add(var31);
					}

					class171.pcmPlayer1.setStream(var27);
					class1.method9(class317.field3415, ArchiveDiskAction.field4291, class469.field4812, var41);
					class136.decimator = new Decimator(22050, PcmPlayer.field306);
					Login.Login_loadingText = "Prepared sound engine";
					Login.Login_loadingPercent = 35;
					Client.field577 = class94.field1158;
					class353.field3846 = new Fonts(class199.archive8, class27.archive13);
				} else {
					int var14;
					if (class94.field1158 == Client.field577) {
						FontName[] var40 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
						var14 = var40.length;
						Fonts var26 = class353.field3846;
						FontName[] var42 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
						Client.fontsMap = var26.createMap(var42);
						if (Client.fontsMap.size() < var14) {
							Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var14 + "%";
							Login.Login_loadingPercent = 40;
						} else {
							class14.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							UserComparator6.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							SoundCache.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							Skeleton.platformInfo = Client.field737.get();
							Login.Login_loadingText = "Loaded fonts";
							Login.Login_loadingPercent = 40;
							Client.field577 = class94.field1154;
						}
					} else {
						Archive var2;
						int var3;
						if (Client.field577 == class94.field1154) {
							var0 = Archive.method6897(class190.archive10, class199.archive8);
							var2 = class199.archive8;
							var3 = Login.field939.length + Login.field962.length;
							String[] var24 = Login.field961;

							for (var5 = 0; var5 < var24.length; ++var5) {
								String var30 = var24[var5];
								if (var2.getGroupId(var30) != -1) {
									++var3;
								}
							}

							if (var0 < var3) {
								Login.Login_loadingText = "Loading title screen - " + var0 * 100 / var3 + "%";
								Login.Login_loadingPercent = 50;
							} else {
								Login.Login_loadingText = "Loaded title screen";
								Login.Login_loadingPercent = 50;
								DefaultsGroup.updateGameState(5);
								Client.field577 = class94.field1155;
							}
						} else if (class94.field1155 == Client.field577) {
							if (!SoundSystem.archive2.isFullyLoaded()) {
								Login.Login_loadingText = "Loading config - " + SoundSystem.archive2.loadPercent() + "%";
								Login.Login_loadingPercent = 60;
							} else if (!class313.field3396.isFullyLoaded()) {
								Login.Login_loadingText = "Loading config - " + (80 + SongTask.archive12.loadPercent() / 6) + "%";
								Login.Login_loadingPercent = 60;
							} else {
								class191.method3628(SoundSystem.archive2);
								var39 = SoundSystem.archive2;
								FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var39;
								class145.method3155(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515);
								class517.method9041(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515, Client.isLowDetail);
								Archive var32 = SoundSystem.archive2;
								var2 = GrandExchangeOfferOwnWorldComparator.field515;
								NPCComposition.NpcDefinition_archive = var32;
								NPCComposition.field2085 = var2;
								class142.method3135(SoundSystem.archive2);
								Projectile.method2185(SoundSystem.archive2, GrandExchangeOfferOwnWorldComparator.field515, Client.isMembersWorld, class14.fontPlain11);
								class138.method3079(SoundSystem.archive2, class92.field1117, class199.field2009);
								Archive var15 = SoundSystem.archive2;
								Archive var4 = GrandExchangeOfferOwnWorldComparator.field515;
								SpotAnimationDefinition.SpotAnimationDefinition_archive = var15;
								SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var4;
								Archive var43 = SoundSystem.archive2;
								VarbitComposition.VarbitDefinition_archive = var43;
								Archive var6 = SoundSystem.archive2;
								VarpDefinition.VarpDefinition_archive = var6;
								VarpDefinition.field1924 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
								class33.widgetDefinition = new WidgetDefinition(AbstractByteArrayCopier.archive4, GrandExchangeOfferOwnWorldComparator.field515, class199.archive8, class27.archive13, class319.field3442);
								Decimator.method1135(SoundSystem.archive2);
								class275.method5567(SoundSystem.archive2);
								class135.method3075(SoundSystem.archive2);
								Message.method1201(SoundSystem.archive2);
								FloorOverlayDefinition.method4157(SoundSystem.archive2);
								MilliClock.method3572(SoundSystem.archive2);
								Varcs.method2787(SoundSystem.archive2);
								HealthBarDefinition.Widget_cachedModels = new class512(UrlRequester.field1436, 54, WorldMapLabelSize.clientLanguage, SoundSystem.archive2);
								class53.Widget_cachedFonts = new class512(UrlRequester.field1436, 47, WorldMapLabelSize.clientLanguage, SoundSystem.archive2);
								class33.varcs = new Varcs();
								UserComparator9.method2917(SoundSystem.archive2, class199.archive8, class27.archive13);
								Archive var35 = SoundSystem.archive2;
								Archive var8 = class199.archive8;
								HealthBarDefinition.HealthBarDefinition_archive = var35;
								HealthBarDefinition.field1979 = var8;
								Archive var37 = SoundSystem.archive2;
								Archive var10 = class199.archive8;
								WorldMapElement.WorldMapElement_archive = var10;
								if (var37.isFullyLoaded()) {
									DevicePcmPlayerProvider.WorldMapElement_count = var37.getGroupFileCount(35);
									WorldMapElement.WorldMapElement_cached = new WorldMapElement[DevicePcmPlayerProvider.WorldMapElement_count];

									for (int var11 = 0; var11 < DevicePcmPlayerProvider.WorldMapElement_count; ++var11) {
										byte[] var12 = var37.takeFile(35, var11);
										WorldMapElement.WorldMapElement_cached[var11] = new WorldMapElement(var11);
										if (var12 != null) {
											WorldMapElement.WorldMapElement_cached[var11].decode(new Buffer(var12));
											WorldMapElement.WorldMapElement_cached[var11].method3666();
										}
									}
								}

								Login.Login_loadingText = "Loaded config";
								Login.Login_loadingPercent = 60;
								Client.field577 = class94.field1159;
							}
						} else if (class94.field1159 == Client.field577) {
							var0 = 0;
							if (class404.compass == null) {
								class404.compass = class47.SpriteBuffer_getSprite(class199.archive8, class241.field2562.field4758, 0);
							} else {
								++var0;
							}

							if (ParamComposition.redHintArrowSprite == null) {
								ParamComposition.redHintArrowSprite = class47.SpriteBuffer_getSprite(class199.archive8, class241.field2562.field4750, 0);
							} else {
								++var0;
							}

							IndexedSprite[] var1;
							if (KitDefinition.mapSceneSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4752;
								if (!class164.method3376(var2, var3, 0)) {
									var1 = null;
								} else {
									var1 = class512.method9001();
								}

								KitDefinition.mapSceneSprites = var1;
							} else {
								++var0;
							}

							SpritePixels var7;
							byte[] var9;
							SpritePixels[] var16;
							int var17;
							int var18;
							int var19;
							SpritePixels[] var23;
							if (UserComparator4.headIconPkSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4749;
								if (!class164.method3376(var2, var3, 0)) {
									var23 = null;
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount];
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453();
											var23 = var16;
											break;
										}

										var7 = var16[var17] = new SpritePixels();
										var7.width = class159.SpriteBuffer_spriteWidth;
										var7.height = class500.SpriteBuffer_spriteHeight;
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17];
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17];
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17];
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17];
										var18 = var7.subWidth * var7.subHeight;
										var9 = AddRequestTask.SpriteBuffer_pixels[var17];
										var7.pixels = new int[var18];

										for (var19 = 0; var19 < var18; ++var19) {
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17;
									}
								}

								UserComparator4.headIconPkSprites = var23;
							} else {
								++var0;
							}

							if (class157.headIconPrayerSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4753;
								if (!class164.method3376(var2, var3, 0)) {
									var23 = null;
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount];
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453();
											var23 = var16;
											break;
										}

										var7 = var16[var17] = new SpritePixels();
										var7.width = class159.SpriteBuffer_spriteWidth;
										var7.height = class500.SpriteBuffer_spriteHeight;
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17];
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17];
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17];
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17];
										var18 = var7.subHeight * var7.subWidth;
										var9 = AddRequestTask.SpriteBuffer_pixels[var17];
										var7.pixels = new int[var18];

										for (var19 = 0; var19 < var18; ++var19) {
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17;
									}
								}

								class157.headIconPrayerSprites = var23;
							} else {
								++var0;
							}

							if (UserComparator8.headIconHintSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4754;
								if (!class164.method3376(var2, var3, 0)) {
									var23 = null;
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount];
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453();
											var23 = var16;
											break;
										}

										var7 = var16[var17] = new SpritePixels();
										var7.width = class159.SpriteBuffer_spriteWidth;
										var7.height = class500.SpriteBuffer_spriteHeight;
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17];
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17];
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17];
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17];
										var18 = var7.subHeight * var7.subWidth;
										var9 = AddRequestTask.SpriteBuffer_pixels[var17];
										var7.pixels = new int[var18];

										for (var19 = 0; var19 < var18; ++var19) {
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17;
									}
								}

								UserComparator8.headIconHintSprites = var23;
							} else {
								++var0;
							}

							if (class47.mapDotSprites == null) {
								class47.mapDotSprites = ScriptEvent.method2331(class199.archive8, class241.field2562.field4755, 0);
							} else {
								++var0;
							}

							if (EnumComposition.crossSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4756;
								if (!class164.method3376(var2, var3, 0)) {
									var23 = null;
								} else {
									var16 = new SpritePixels[class544.SpriteBuffer_spriteCount];
									var17 = 0;

									while (true) {
										if (var17 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453();
											var23 = var16;
											break;
										}

										var7 = var16[var17] = new SpritePixels();
										var7.width = class159.SpriteBuffer_spriteWidth;
										var7.height = class500.SpriteBuffer_spriteHeight;
										var7.xOffset = class326.SpriteBuffer_xOffsets[var17];
										var7.yOffset = ModelData0.SpriteBuffer_yOffsets[var17];
										var7.subWidth = class59.SpriteBuffer_spriteWidths[var17];
										var7.subHeight = class544.SpriteBuffer_spriteHeights[var17];
										var18 = var7.subWidth * var7.subHeight;
										var9 = AddRequestTask.SpriteBuffer_pixels[var17];
										var7.pixels = new int[var18];

										for (var19 = 0; var19 < var18; ++var19) {
											var7.pixels[var19] = class372.SpriteBuffer_spritePalette[var9[var19] & 255];
										}

										++var17;
									}
								}

								EnumComposition.crossSprites = var23;
							} else {
								++var0;
							}

							if (class103.field1336 == null) {
								class103.field1336 = ScriptEvent.method2331(class199.archive8, class241.field2562.field4757, 0);
							} else {
								++var0;
							}

							if (class36.scrollBarSprites == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4751;
								if (!class164.method3376(var2, var3, 0)) {
									var1 = null;
								} else {
									var1 = class512.method9001();
								}

								class36.scrollBarSprites = var1;
							} else {
								++var0;
							}

							if (class178.field1854 == null) {
								var2 = class199.archive8;
								var3 = class241.field2562.field4759;
								if (!class164.method3376(var2, var3, 0)) {
									var1 = null;
								} else {
									var1 = class512.method9001();
								}

								class178.field1854 = var1;
							} else {
								++var0;
							}

							if (var0 < 11) {
								Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
								Login.Login_loadingPercent = 70;
							} else {
								AbstractFont.AbstractFont_modIconSprites = class178.field1854;
								ParamComposition.redHintArrowSprite.normalize();
								var14 = (int)(Math.random() * 21.0D) - 10;
								int var20 = (int)(Math.random() * 21.0D) - 10;
								var3 = (int)(Math.random() * 21.0D) - 10;
								int var21 = (int)(Math.random() * 41.0D) - 20;
								KitDefinition.mapSceneSprites[0].shiftColors(var21 + var14, var20 + var21, var21 + var3);
								Login.Login_loadingText = "Loaded sprites";
								Login.Login_loadingPercent = 70;
								Client.field577 = class94.field1157;
							}
						} else if (class94.field1157 == Client.field577) {
							if (!class241.field2558.isFullyLoaded()) {
								Login.Login_loadingText = "Loading textures - " + "0%";
								Login.Login_loadingPercent = 90;
							} else {
								class305.textureProvider = new TextureProvider(class241.field2558, class199.archive8, 20, class91.clientPreferences.method2513(), Client.isLowDetail ? 64 : 128);
								Rasterizer3D.method4519(class305.textureProvider);
								Rasterizer3D.method4517(class91.clientPreferences.method2513());
								Client.field577 = class94.field1164;
							}
						} else if (class94.field1164 == Client.field577) {
							var0 = class305.textureProvider.getLoadedPercentage();
							if (var0 < 100) {
								Login.Login_loadingText = "Loading textures - " + var0 + "%";
								Login.Login_loadingPercent = 90;
							} else {
								Login.Login_loadingText = "Loaded textures";
								Login.Login_loadingPercent = 90;
								Client.field577 = class94.field1160;
							}
						} else if (class94.field1160 == Client.field577) {
							class233.mouseRecorder = new MouseRecorder();
							GameEngine.taskHandler.newThreadTask(class233.mouseRecorder, 10);
							Login.Login_loadingText = "Loaded input handler";
							Login.Login_loadingPercent = 92;
							Client.field577 = class94.field1148;
						} else if (Client.field577 == class94.field1148) {
							if (!class190.archive10.tryLoadFileByNames("huffman", "")) {
								Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
								Login.Login_loadingPercent = 94;
							} else {
								Huffman var38 = new Huffman(class190.archive10.takeFileByNames("huffman", ""));
								class349.huffman = var38;
								Login.Login_loadingText = "Loaded wordpack";
								Login.Login_loadingPercent = 94;
								Client.field577 = class94.field1153;
							}
						} else if (class94.field1153 == Client.field577) {
							if (!AbstractByteArrayCopier.archive4.isFullyLoaded()) {
								Login.Login_loadingText = "Loading interfaces - " + AbstractByteArrayCopier.archive4.loadPercent() * 4 / 5 + "%";
								Login.Login_loadingPercent = 96;
							} else if (!class319.field3442.isFullyLoaded()) {
								Login.Login_loadingText = "Loading interfaces - " + class319.field3442.loadPercent() * 4 / 5 + "%";
								Login.Login_loadingPercent = 96;
							} else if (!SongTask.archive12.isFullyLoaded()) {
								Login.Login_loadingText = "Loading interfaces - " + (80 + SongTask.archive12.loadPercent() / 6) + "%";
								Login.Login_loadingPercent = 96;
							} else if (!class27.archive13.isFullyLoaded()) {
								Login.Login_loadingText = "Loading interfaces - " + (96 + class27.archive13.loadPercent() / 50) + "%";
								Login.Login_loadingPercent = 96;
							} else {
								Login.Login_loadingText = "Loaded interfaces";
								Login.Login_loadingPercent = 98;
								if (SongTask.archive12.isValidFileName("version.dat", "")) {
									Buffer var13 = new Buffer(SongTask.archive12.takeFileByNames("version.dat", ""));
									var13.readUnsignedShort();
								}

								Client.field577 = class94.field1162;
							}
						} else if (class94.field1162 == Client.field577) {
							Login.Login_loadingPercent = 100;
							if (AABB.field2658.getGroupCount() > 0 && !AABB.field2658.tryLoadGroupByName(WorldMapCacheName.field3095.name)) {
								Login.Login_loadingText = "Loading world map - " + AABB.field2658.groupLoadPercentByName(WorldMapCacheName.field3095.name) / 10 + "%";
							} else {
								if (class434.worldMap == null) {
									class434.worldMap = new WorldMap();
									class434.worldMap.init(AABB.field2658, class358.field3898, HorizontalAlignment.field2028, SoundCache.fontBold12, Client.fontsMap, KitDefinition.mapSceneSprites);
								}

								Login.Login_loadingText = "Loaded world map";
								Client.field577 = class94.field1163;
							}
						} else {
							if (class94.field1163 == Client.field577) {
								DefaultsGroup.updateGameState(10);
							}

						}
					}
				}
			}
		}
	}
}
