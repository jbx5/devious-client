import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("bf")
	protected static String field120;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("am")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1288797139"
	)
	static final void method334(String var0) {
		GrandExchangeEvents.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "73"
	)
	static final void method333(String var0) {
		method334("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkn;Lii;I)V",
		garbageValue = "-470023103"
	)
	static final void method332(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class137.getObjectDefinition(var4);
		int var11 = var7 >= 0 ? var7 : var10.animationId;
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) {
			var14 = (var12 >> 1) + var2;
			var15 = var2 + (var12 + 1 >> 1);
		} else {
			var14 = var2;
			var15 = var2 + 1;
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) {
			var16 = var3 + (var13 >> 1);
			var17 = var3 + (var13 + 1 >> 1);
		} else {
			var16 = var3;
			var17 = var3 + 1;
		}

		int[][] var18 = Tiles.Tiles_heights[var1];
		int var19 = var18[var15][var17] + var18[var15][var16] + var18[var14][var16] + var18[var14][var17] >> 2;
		int var20 = (var2 << 7) + (var12 << 6);
		int var21 = (var3 << 7) + (var13 << 6);
		long var22 = DynamicObject.calculateTag(var2, var3, 2, var10.int1 == 0, var4);
		int var24 = (var5 << 6) + var6;
		if (var10.int3 == 1) {
			var24 += 256;
		}

		Object var32;
		if (var6 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var32 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
			}

			var8.newFloorDecoration(var0, var2, var3, var19, (Renderable)var32, var22, var24);
			if (var10.interactType == 1) {
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.method5521(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24);
				if (var10.interactType != 0) {
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var32 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1014[var5], 0, var22, var24);
				if (var10.interactType != 0) {
					var9.method4466(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var32 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var32 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1015[var5], 0, var22, var24);
				if (var10.interactType != 0) {
					var9.method4466(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var25;
				if (var6 == 2) {
					var25 = var5 + 1 & 3;
					Object var27;
					Object var33;
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(2, var5 + 4, var18, var20, var19, var21);
						var27 = var10.getModel(2, var25, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						var27 = new DynamicObject(var4, 2, var25, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var33, (Renderable)var27, Tiles.field1014[var5], Tiles.field1014[var25], var22, var24);
					if (var10.interactType != 0) {
						var9.method4466(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var32 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1015[var5], 0, var22, var24);
					if (var10.interactType != 0) {
						var9.method4466(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var32 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.method5521(var0, var2, var3, var19, 1, 1, (Renderable)var32, 0, var22, var24);
					if (var10.interactType != 0) {
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var32 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var32 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, Tiles.field1014[var5], 0, 0, 0, var22, var24);
				} else {
					long var26;
					Object var28;
					if (var6 == 5) {
						var25 = 16;
						var26 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (var26 != 0L) {
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field1014[var5], 0, var25 * Tiles.field1018[var5], var25 * Tiles.field1017[var5], var22, var24);
					} else if (var6 == 6) {
						var25 = 8;
						var26 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var26) {
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var25 * Tiles.field1010[var5], var25 * Tiles.field1007[var5], var22, var24);
					} else if (var6 == 7) {
						int var31 = var5 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var32 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var32 = new DynamicObject(var4, 4, var31 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var32, (Renderable)null, 256, var31, 0, 0, var22, var24);
					} else if (var6 == 8) {
						var25 = 8;
						var26 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var26) {
							var25 = class137.getObjectDefinition(class167.Entity_unpackID(var26)).int2 / 2;
						}

						int var30 = var5 + 2 & 3;
						Object var29;
						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var25 * Tiles.field1010[var5], var25 * Tiles.field1007[var5], var22, var24);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var32 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var32 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
			}

			if (var32 != null) {
				var8.method5521(var0, var2, var3, var19, var12, var13, (Renderable)var32, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) {
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-830137151"
	)
	static final void method327(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class93.clientPreferences.updateSoundEffectVolume(var0);
	}
}
