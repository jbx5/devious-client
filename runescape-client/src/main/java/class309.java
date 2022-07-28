import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("kj")
public enum class309 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkj;")
	field3961(-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkj;")
	field3957(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkj;")
	field3960(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkj;")
	field3958(2);
	@ObfuscatedName("dh")
	@ObfuscatedSignature(descriptor = "Lcp;")
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1554888163)
	final int field3959;

	class309(int var3) {
		this.field3959 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3959;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IIIIIILgo;Lgr;I)V", garbageValue = "16711680")
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}
			ObjectComposition var8 = WorldMapDecoration.getObjectDefinition(var3);
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
			long var19 = class394.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}
			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 128;
				var22.y = var2 * 16384;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}
				var22.maxX = (var23 + var1) * 128;
				var22.maxY = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field814 = var8.int7 * 128;
				var22.field817 = var8.int5;
				var22.field823 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}
				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field818 = var22.field817 + ((int) (Math.random() * ((double) (var22.field823 - var22.field817))));
				}
			}
			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}
					var6.newFloorDecoration(var0, var1, var2, var16, ((Renderable) (var34)), var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}
				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}
					var6.method4118(var0, var1, var2, var16, 1, 1, ((Renderable) (var34)), 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = MouseRecorder.field1060[var0][var1];
						var10000[var2] |= 2340;
					}
					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}
				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}
					var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field1001[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							Tiles.field998[var0][var1][var2] = 50;
							Tiles.field998[var0][var1][var2 + 1] = 50;
						}
						if (var8.modelClipped) {
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							Tiles.field998[var0][var1][var2 + 1] = 50;
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
						}
						if (var8.modelClipped) {
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							Tiles.field998[var0][var1 + 1][var2] = 50;
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
						}
						if (var8.modelClipped) {
							var10000 = MouseRecorder.field1060[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							Tiles.field998[var0][var1][var2] = 50;
							Tiles.field998[var0][var1 + 1][var2] = 50;
						}
						if (var8.modelClipped) {
							var10000 = MouseRecorder.field1060[var0][var1];
							var10000[var2] |= 1170;
						}
					}
					if (var8.interactType != 0 && var7 != null) {
						var7.method3878(var1, var2, var5, var4, var8.boolean1);
					}
					if (var8.int2 != 16) {
						var6.method4124(var0, var1, var2, var8.int2);
					}
				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}
					var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field1002[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							Tiles.field998[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							Tiles.field998[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							Tiles.field998[var0][var1][var2] = 50;
						}
					}
					if (var8.interactType != 0 && var7 != null) {
						var7.method3878(var1, var2, var5, var4, var8.boolean1);
					}
				} else {
					int var28;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) {
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}
						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var31)), ((Renderable) (var32)), Tiles.field1001[var4], Tiles.field1001[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[var2] |= 585;
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) {
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[var2 + 1] |= 1170;
								var10000 = MouseRecorder.field1060[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = MouseRecorder.field1060[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[var2] |= 1170;
								var10000 = MouseRecorder.field1060[var0][var1];
								var10000[var2] |= 585;
							}
						}
						if (var8.interactType != 0 && var7 != null) {
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}
						if (var8.int2 != 16) {
							var6.method4124(var0, var1, var2, var8.int2);
						}
					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}
						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field1002[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								Tiles.field998[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Tiles.field998[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Tiles.field998[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Tiles.field998[var0][var1][var2] = 50;
							}
						}
						if (var8.interactType != 0 && var7 != null) {
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}
					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}
						var6.method4118(var0, var1, var2, var16, 1, 1, ((Renderable) (var34)), 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}
						if (var8.int2 != 16) {
							var6.method4124(var0, var1, var2, var8.int2);
						}
					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}
						var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field1001[var4], 0, 0, 0, var19, var21);
					} else {
						Object var25;
						long var29;
						if (var5 == 5) {
							var28 = 16;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2;
							}
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}
							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), Tiles.field1001[var4], 0, var28 * Tiles.field1008[var4], var28 * Tiles.field1009[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2 / 2;
							}
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}
							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), 256, var4, var28 * Tiles.field1005[var4], var28 * Tiles.field1006[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}
							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = WorldMapDecoration.getObjectDefinition(class141.Entity_unpackID(var29)).int2 / 2;
							}
							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}
							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (var26)), 256, var4, var28 * Tiles.field1005[var4], var28 * Tiles.field1006[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
				}
				if (var34 != null && var6.method4118(var0, var1, var2, var16, var9, var10, ((Renderable) (var34)), var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model) (var34)).method4350() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}
					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var33 = 0; var33 <= var10; ++var33) {
							if (var23 > Tiles.field998[var0][var24 + var1][var33 + var2]) {
								Tiles.field998[var0][var24 + var1][var33 + var2] = ((byte) (var23));
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