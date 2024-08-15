import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field1936;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1971455075
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1224103521
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2126447787
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1529247323
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1635070169
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1226617715
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 274618617
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("af")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("aa")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ah")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -39092603
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1453539795
	)
	int field1917;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1582442833
	)
	int field1933;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -57431121
	)
	int field1929;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIIILkd;B)V",
		garbageValue = "44"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = class222.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var12][var14] + var15[var11][var13] + var15[var12][var13] + var15[var11][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = class218.calculateTag(var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class224.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method3919(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = WorldMapDecoration.field3177[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1015[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								class431.Tiles_underlays2[var1][var2][var3] = 50;
								class431.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = WorldMapDecoration.field3177[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								class431.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								class431.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = WorldMapDecoration.field3177[var1][var2];
								var10000[1 + var3] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								class431.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								class431.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = WorldMapDecoration.field3177[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								class431.Tiles_underlays2[var1][var2][var3] = 50;
								class431.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = WorldMapDecoration.field3177[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5388(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method3904(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1023[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								class431.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								class431.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								class431.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								class431.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5388(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field1015[var5], Tiles.field1015[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[var3] |= 585;
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[var3 + 1] |= 1170;
								} else if (var5 == 1) {
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[1 + var3] |= 1170;
									var10000 = WorldMapDecoration.field3177[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = WorldMapDecoration.field3177[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[var3] |= 1170;
									var10000 = WorldMapDecoration.field3177[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5388(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method3904(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1023[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									class431.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									class431.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									class431.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									class431.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5388(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method3919(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method3904(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1015[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = class222.getObjectDefinition(class513.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field1015[var5], 0, var23 * Tiles.field1017[var5], var23 * Tiles.field1025[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = class222.getObjectDefinition(class513.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1026[var5], var23 * Tiles.field1022[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = class222.getObjectDefinition(class513.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1026[var5], var23 * Tiles.field1022[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method3919(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method4225() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > class431.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									class431.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbx;B)V",
		garbageValue = "14"
	)
	static void method3726(GameEngine var0) {
		IndexCheck var1 = class230.method4774();

		while (var1.method5375()) {
			if (var1.field2930 == 13) {
				class387.method7242();
				return;
			}

			if (var1.field2930 == 96) {
				if (Login.worldSelectPage > 0 && NpcOverrides.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field2930 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class264.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldMapSprite.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class387.method7242();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = class319.World_worlds[Login.hoveredWorldIndex];
				boolean var7 = class453.method8428(Client.worldProperties, class543.field5344);
				boolean var8 = var6.isDeadman();
				class380.field4407 = var8;
				var6.field810 = var8 ? "beta" : var6.field810;
				class132.changeWorld(var6);
				class387.method7242();
				if (var8 != var7) {
					class273.method5468();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && NpcOverrides.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= NpcOverrides.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= ApproximateRouteStrategy.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ApproximateRouteStrategy.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class264.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= NPC.canvasWidth - class264.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= NPC.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= ApproximateRouteStrategy.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ApproximateRouteStrategy.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
