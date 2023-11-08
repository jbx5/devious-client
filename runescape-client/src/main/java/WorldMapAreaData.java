import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field2641;
	@ObfuscatedName("as")
	HashSet field2635;
	@ObfuscatedName("ay")
	HashSet field2636;
	@ObfuscatedName("ak")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Luj;Luj;IZZI)V",
		garbageValue = "-605935351"
	)
	void method5036(Buffer var1, Buffer var2, int var3, boolean var4, boolean var5) {
		this.method4547(var1, var3, var5);
		int var6 = var2.readUnsignedShort();
		this.field2635 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			WorldMapData_0 var8 = new WorldMapData_0();

			try {
				var8.init(var2);
			} catch (IllegalStateException var13) {
				continue;
			}

			this.field2635.add(var8);
		}

		var7 = var2.readUnsignedShort();
		this.field2636 = new HashSet(var7);

		for (int var11 = 0; var11 < var7; ++var11) {
			WorldMapData_1 var9 = new WorldMapData_1();

			try {
				var9.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field2636.add(var9);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Luj;ZI)V",
		garbageValue = "950262169"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1883889398"
	)
	static final float method5039(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "-1973089018"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3672 == null) {
			throw new RuntimeException();
		} else {
			var0.field3672[var1] = var2;
			var0.field3756[var1] = var3;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-113"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != ItemLayer.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = class36.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = class36.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = class36.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = class36.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			if (0L != var8) {
				var13 = class36.scene.getObjectFlags(var0, var2, var3, var8);
				int var43 = class232.Entity_unpackID(var8);
				int var44 = var13 & 31;
				int var45 = var13 >> 6 & 3;
				ObjectComposition var14 = WorldMapSection2.getObjectDefinition(var43);
				if (var14 != null && var14.hasSound()) {
					var17 = var14.sizeX;
					var18 = var14.sizeY;
					if (var45 == 1 || var45 == 3) {
						var17 = var14.sizeY;
						var18 = var14.sizeX;
					}

					var19 = (var17 + var2) * 128;
					var20 = (var3 + var18) * 128;
					int var15 = var2 * 128;
					int var16 = var3 * 128;
					var21 = var14.ambientSoundId;
					var22 = var14.int7 * 16384;
					if (var14.transforms != null) {
						ObjectComposition var23 = var14.transform();
						if (var23 != null) {
							var21 = var23.ambientSoundId;
							var22 = var23.int7 * 16384;
						}
					}

					Object var10000 = null;

					for (ObjectSound var47 = (ObjectSound)ObjectSound.objectSounds.last(); var47 != null; var47 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var0 == var47.plane && var15 == var47.x * 16384 && var16 == var47.y * 128 && var19 == var47.maxX * 128 && var20 == var47.maxY * 128 && var21 == var47.soundEffectId && var22 == var47.field824) {
							if (var47.stream1 != null) {
								LoginScreenAnimation.pcmStreamMixer.removeSubStream(var47.stream1);
								var47.stream1 = null;
							}

							if (var47.stream2 != null) {
								LoginScreenAnimation.pcmStreamMixer.removeSubStream(var47.stream2);
								var47.stream2 = null;
							}

							var47.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var1 == 0) {
					class36.scene.removeBoundaryObject(var0, var2, var3);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4382(var2, var3, var44, var45, var14.boolean1);
					}
				}

				if (var1 == 1) {
					class36.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					class36.scene.removeGameObject(var0, var2, var3);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var45, var14.boolean1);
					}
				}

				if (var1 == 3) {
					class36.scene.removeFloorDecoration(var0, var2, var3);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4362(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				Scene var46 = class36.scene;
				CollisionMap var37 = Client.collisionMaps[var0];
				ObjectComposition var38 = WorldMapSection2.getObjectDefinition(var4);
				var17 = var7 >= 0 ? var7 : var38.animationId;
				if (var5 != 1 && var5 != 3) {
					var18 = var38.sizeX;
					var19 = var38.sizeY;
				} else {
					var18 = var38.sizeY;
					var19 = var38.sizeX;
				}

				if (var18 + var2 <= 104) {
					var20 = (var18 >> 1) + var2;
					var21 = var2 + (var18 + 1 >> 1);
				} else {
					var20 = var2;
					var21 = var2 + 1;
				}

				int var39;
				if (var3 + var19 <= 104) {
					var22 = var3 + (var19 >> 1);
					var39 = var3 + (var19 + 1 >> 1);
				} else {
					var22 = var3;
					var39 = var3 + 1;
				}

				int[][] var24 = Tiles.Tiles_heights[var13];
				int var25 = var24[var20][var22] + var24[var21][var22] + var24[var20][var39] + var24[var21][var39] >> 2;
				int var26 = (var2 << 7) + (var18 << 6);
				int var27 = (var3 << 7) + (var19 << 6);
				long var28 = Player.calculateTag(var2, var3, 2, var38.int1 == 0, var4);
				int var30 = (var5 << 6) + var6;
				if (var38.int3 == 1) {
					var30 += 256;
				}

				Object var41;
				if (var6 == 22) {
					if (var17 == -1 && var38.transforms == null) {
						var41 = var38.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var41 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
					}

					var46.newFloorDecoration(var0, var2, var3, var25, (Renderable)var41, var28, var30);
					if (var38.interactType == 1) {
						var37.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var17 == -1 && var38.transforms == null) {
							var41 = var38.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
						}

						var46.method5334(var0, var2, var3, var25, 1, 1, (Renderable)var41, 0, var28, var30);
						if (var38.interactType != 0) {
							var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
						}
					} else if (var6 == 0) {
						if (var17 == -1 && var38.transforms == null) {
							var41 = var38.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
						}

						var46.newBoundaryObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1006[var5], 0, var28, var30);
						if (var38.interactType != 0) {
							var37.method4349(var2, var3, var6, var5, var38.boolean1);
						}
					} else if (var6 == 1) {
						if (var17 == -1 && var38.transforms == null) {
							var41 = var38.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
						}

						var46.newBoundaryObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1005[var5], 0, var28, var30);
						if (var38.interactType != 0) {
							var37.method4349(var2, var3, var6, var5, var38.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) {
							var31 = var5 + 1 & 3;
							Object var33;
							Object var42;
							if (var17 == -1 && var38.transforms == null) {
								var42 = var38.getModel(2, var5 + 4, var24, var26, var25, var27);
								var33 = var38.getModel(2, var31, var24, var26, var25, var27);
							} else {
								var42 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
							}

							var46.newBoundaryObject(var0, var2, var3, var25, (Renderable)var42, (Renderable)var33, Tiles.field1006[var5], Tiles.field1006[var31], var28, var30);
							if (var38.interactType != 0) {
								var37.method4349(var2, var3, var6, var5, var38.boolean1);
							}
						} else if (var6 == 3) {
							if (var17 == -1 && var38.transforms == null) {
								var41 = var38.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
							}

							var46.newBoundaryObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1005[var5], 0, var28, var30);
							if (var38.interactType != 0) {
								var37.method4349(var2, var3, var6, var5, var38.boolean1);
							}
						} else if (var6 == 9) {
							if (var17 == -1 && var38.transforms == null) {
								var41 = var38.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
							}

							var46.method5334(var0, var2, var3, var25, 1, 1, (Renderable)var41, 0, var28, var30);
							if (var38.interactType != 0) {
								var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
							}
						} else if (var6 == 4) {
							if (var17 == -1 && var38.transforms == null) {
								var41 = var38.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
							}

							var46.newWallDecoration(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1006[var5], 0, 0, 0, var28, var30);
						} else {
							long var32;
							Object var34;
							if (var6 == 5) {
								var31 = 16;
								var32 = var46.getBoundaryObjectTag(var0, var2, var3);
								if (var32 != 0L) {
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var38.transforms == null) {
									var34 = var38.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
								}

								var46.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1006[var5], 0, var31 * Tiles.field1010[var5], var31 * Tiles.field1007[var5], var28, var30);
							} else if (var6 == 6) {
								var31 = 8;
								var32 = var46.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var32) {
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var38.transforms == null) {
									var34 = var38.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
								}

								var46.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1008[var5], var31 * Tiles.field1009[var5], var28, var30);
							} else if (var6 == 7) {
								int var40 = var5 + 2 & 3;
								if (var17 == -1 && var38.transforms == null) {
									var41 = var38.getModel(4, var40 + 4, var24, var26, var25, var27);
								} else {
									var41 = new DynamicObject(var4, 4, var40 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
								}

								var46.newWallDecoration(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, 256, var40, 0, 0, var28, var30);
							} else if (var6 == 8) {
								var31 = 8;
								var32 = var46.getBoundaryObjectTag(var0, var2, var3);
								if (var32 != 0L) {
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3;
								Object var35;
								if (var17 == -1 && var38.transforms == null) {
									var34 = var38.getModel(4, var5 + 4, var24, var26, var25, var27);
									var35 = var38.getModel(4, var36 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
								}

								var46.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1008[var5], var31 * Tiles.field1009[var5], var28, var30);
							}
						}
					}
				} else {
					if (var17 == -1 && var38.transforms == null) {
						var41 = var38.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var41 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null);
					}

					if (var41 != null) {
						var46.method5334(var0, var2, var3, var25, var18, var19, (Renderable)var41, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var38.interactType != 0) {
						var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
					}
				}

				var38 = WorldMapSection2.getObjectDefinition(var4);
				if (var38 != null && var38.hasSound()) {
					UrlRequester.createObjectSound(var13, var2, var3, var38, var5);
				}
			}
		}

	}
}
