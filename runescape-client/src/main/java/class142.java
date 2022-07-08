import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("eh")
public class class142 extends class128 {
	@ObfuscatedName("j")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -1198516523)
	@Export("idxCount")
	static int idxCount;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1343108627)
	int field1664;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1664 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1664 = var1.readUnsignedShort();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method3019(this.field1664);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IIIIIIILgg;Lgv;I)V", garbageValue = "-1981768066")
	static final void method3050(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class162.getObjectDefinition(var4);
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) {
			var10 = var9.sizeX;
			var11 = var9.sizeY;
		} else {
			var10 = var9.sizeY;
			var11 = var9.sizeX;
		}
		int var12;
		int var13;
		if (var10 + var2 <= 104) {
			var12 = (var10 >> 1) + var2;
			var13 = var2 + (var10 + 1 >> 1);
		} else {
			var12 = var2;
			var13 = var2 + 1;
		}
		int var14;
		int var15;
		if (var3 + var11 <= 104) {
			var14 = var3 + (var11 >> 1);
			var15 = var3 + (var11 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}
		int[][] var16 = Tiles.Tiles_heights[var1];
		int var17 = var16[var12][var15] + var16[var13][var14] + var16[var12][var14] + var16[var13][var15] >> 2;
		int var18 = (var2 << 7) + (var10 << 6);
		int var19 = (var3 << 7) + (var11 << 6);
		long var20 = TaskHandler.calculateTag(var2, var3, 2, var9.int1 == 0, var4);
		int var22 = (var5 << 6) + var6;
		if (var9.int3 == 1) {
			var22 += 256;
		}
		Object var30;
		if (var6 == 22) {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
			}
			var7.newFloorDecoration(var0, var2, var3, var17, ((Renderable) (var30)), var20, var22);
			if (var9.interactType == 1) {
				var8.setBlockedByFloorDec(var2, var3);
			}
		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
				}
				var7.method4188(var0, var2, var3, var17, 1, 1, ((Renderable) (var30)), 0, var20, var22);
				if (var9.interactType != 0) {
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}
			} else if (var6 == 0) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
				}
				var7.newBoundaryObject(var0, var2, var3, var17, ((Renderable) (var30)), ((Renderable) (null)), Tiles.field1007[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}
			} else if (var6 == 1) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
				}
				var7.newBoundaryObject(var0, var2, var3, var17, ((Renderable) (var30)), ((Renderable) (null)), Tiles.field1011[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3878(var2, var3, var6, var5, var9.boolean1);
				}
			} else {
				int var23;
				if (var6 == 2) {
					var23 = var5 + 1 & 3;
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) {
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19);
						var25 = var9.getModel(2, var23, var16, var18, var17, var19);
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
					}
					var7.newBoundaryObject(var0, var2, var3, var17, ((Renderable) (var31)), ((Renderable) (var25)), Tiles.field1007[var5], Tiles.field1007[var23], var20, var22);
					if (var9.interactType != 0) {
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}
				} else if (var6 == 3) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
					}
					var7.newBoundaryObject(var0, var2, var3, var17, ((Renderable) (var30)), ((Renderable) (null)), Tiles.field1011[var5], 0, var20, var22);
					if (var9.interactType != 0) {
						var8.method3878(var2, var3, var6, var5, var9.boolean1);
					}
				} else if (var6 == 9) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
					}
					var7.method4188(var0, var2, var3, var17, 1, 1, ((Renderable) (var30)), 0, var20, var22);
					if (var9.interactType != 0) {
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}
				} else if (var6 == 4) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
					}
					var7.newWallDecoration(var0, var2, var3, var17, ((Renderable) (var30)), ((Renderable) (null)), Tiles.field1007[var5], 0, 0, 0, var20, var22);
				} else {
					long var24;
					Object var26;
					if (var6 == 5) {
						var23 = 16;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var24) {
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2;
						}
						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
						}
						var7.newWallDecoration(var0, var2, var3, var17, ((Renderable) (var26)), ((Renderable) (null)), Tiles.field1007[var5], 0, var23 * Tiles.field1003[var5], var23 * Tiles.field1005[var5], var20, var22);
					} else if (var6 == 6) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2 / 2;
						}
						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
						}
						var7.newWallDecoration(var0, var2, var3, var17, ((Renderable) (var26)), ((Renderable) (null)), 256, var5, var23 * Tiles.field1006[var5], var23 * Tiles.field1002[var5], var20, var22);
					} else if (var6 == 7) {
						int var29 = var5 + 2 & 3;
						if (var9.animationId == -1 && var9.transforms == null) {
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
						}
						var7.newWallDecoration(var0, var2, var3, var17, ((Renderable) (var30)), ((Renderable) (null)), 256, var29, 0, 0, var20, var22);
					} else if (var6 == 8) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = class162.getObjectDefinition(Decimator.Entity_unpackID(var24)).int2 / 2;
						}
						int var28 = var5 + 2 & 3;
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
						}
						var7.newWallDecoration(var0, var2, var3, var17, ((Renderable) (var26)), ((Renderable) (var27)), 256, var5, var23 * Tiles.field1006[var5], var23 * Tiles.field1002[var5], var20, var22);
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, ((Renderable) (null)));
			}
			if (var30 != null) {
				var7.method4188(var0, var2, var3, var17, var10, var11, ((Renderable) (var30)), var6 == 11 ? 256 : 0, var20, var22);
			}
			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}
		}
	}
}