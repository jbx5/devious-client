import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 984030419
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 208936685
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1127564039
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2137849511
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -2639242213156283701L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1161885443
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 56923103
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1159272925
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -4674151039641362503L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 351854957
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 493916127
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -527643925
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -627536390283187533L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -88156479
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -208904825
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1503556707
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 2357983475643731013L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive6")
	static Archive archive6;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-397380741"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class77.method2338();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIIIIIILko;I)V",
		garbageValue = "-2143788034"
	)
	static final void method665(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9) {
		ObjectComposition var10 = UrlRequest.getObjectDefinition(var5);
		int var11 = var8 >= 0 ? var8 : var10.animationId;
		int var12;
		int var13;
		if (var6 != 1 && var6 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var3 + var12 <= var0.sizeX) {
			var14 = var3 + (var12 >> 1);
			var15 = var3 + (var12 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int var16;
		int var17;
		if (var13 + var4 <= var0.sizeY) {
			var16 = (var13 >> 1) + var4;
			var17 = var4 + (var13 + 1 >> 1);
		} else {
			var16 = var4;
			var17 = var4 + 1;
		}

		int[][] var18 = var0.tileHeights[var2];
		int var19 = var18[var15][var17] + var18[var14][var16] + var18[var15][var16] + var18[var14][var17] >> 2;
		int var20 = (var3 << 7) + (var12 << 6);
		int var21 = (var4 << 7) + (var13 << 6);
		Scene var22 = var0.scene;
		long var23 = class140.calculateTag(var3, var4, 2, var10.int1 == 0, var5, var0.id);
		int var25 = (var6 << 6) + var7;
		if (var10.int3 == 1) {
			var25 += 256;
		}

		Object var33;
		if (var7 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(22, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			var22.newFloorDecoration(var1, var3, var4, var19, (Renderable)var33, var23, var25);
			if (var10.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.method5072(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
				}

			} else if (var7 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(0, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1043[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5686(var3, var4, var7, var6, var10.boolean1);
				}

			} else if (var7 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(1, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1044[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5686(var3, var4, var7, var6, var10.boolean1);
				}

			} else {
				int var26;
				if (var7 == 2) {
					var26 = var6 + 1 & 3;
					Object var28;
					Object var34;
					if (var11 == -1 && var10.transforms == null) {
						var34 = var10.getModel(2, var6 + 4, var18, var20, var19, var21);
						var28 = var10.getModel(2, var26, var18, var20, var19, var21);
					} else {
						var34 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						var28 = new DynamicObject(var0, var5, 2, var26, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var34, (Renderable)var28, Tiles.field1043[var6], Tiles.field1043[var26], var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5686(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(3, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1044[var6], 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5686(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.method5072(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
					}

				} else if (var7 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(4, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1043[var6], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var7 == 5) {
						var26 = 16;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = UrlRequest.getObjectDefinition(class309.Entity_unpackID(var27)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, Tiles.field1043[var6], 0, Tiles.field1045[var6] * var26, Tiles.field1033[var6] * var26, var23, var25);
					} else if (var7 == 6) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = UrlRequest.getObjectDefinition(class309.Entity_unpackID(var27)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, 256, var6, Tiles.field1035[var6] * var26, Tiles.field1047[var6] * var26, var23, var25);
					} else if (var7 == 7) {
						int var32 = var6 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var33 = var10.getModel(4, var32 + 4, var18, var20, var19, var21);
						} else {
							var33 = new DynamicObject(var0, var5, 4, var32 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, 256, var32, 0, 0, var23, var25);
					} else if (var7 == 8) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (var27 != 0L) {
							var26 = UrlRequest.getObjectDefinition(class309.Entity_unpackID(var27)).int2 / 2;
						}

						int var31 = var6 + 2 & 3;
						Object var30;
						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
							var30 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
							var30 = new DynamicObject(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)var30, 256, var6, Tiles.field1035[var6] * var26, Tiles.field1047[var6] * var26, var23, var25);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(10, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			if (var33 != null) {
				var22.method5072(var1, var3, var4, var19, var12, var13, (Renderable)var33, var7 == 11 ? 256 : 0, var23, var25);
			}

			if (var10.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
			}

		}
	}
}
