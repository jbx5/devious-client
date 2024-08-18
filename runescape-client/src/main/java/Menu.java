import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ab")
	boolean field5524;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 809284913
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("an")
	@Export("menuArguments1")
	public final int[] menuArguments1;
	@ObfuscatedName("au")
	@Export("menuArguments2")
	public final int[] menuArguments2;
	@ObfuscatedName("ax")
	@Export("menuOpcodes")
	public final int[] menuOpcodes;
	@ObfuscatedName("ao")
	@Export("menuIdentifiers")
	public final int[] menuIdentifiers;
	@ObfuscatedName("am")
	@Export("menuItemIds")
	public final int[] menuItemIds;
	@ObfuscatedName("ac")
	@Export("menuWorldViewIds")
	public final int[] menuWorldViewIds;
	@ObfuscatedName("ae")
	@Export("menuActions")
	public final String[] menuActions;
	@ObfuscatedName("ad")
	@Export("menuTargets")
	public final String[] menuTargets;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lvw;"
	)
	@Export("subMenus")
	public final Menu[] subMenus;
	@ObfuscatedName("al")
	@Export("menuShiftClick")
	public final boolean[] menuShiftClick;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 615979633
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1392142687
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -18684457
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1788236865
	)
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2064708497
	)
	int field5533;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1117737661
	)
	int field5534;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 3093000226942863233L
	)
	long field5535;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5524 = var1;
		this.menuArguments1 = new int[var2];
		this.menuArguments2 = new int[var2];
		this.menuOpcodes = new int[var2];
		this.menuIdentifiers = new int[var2];
		this.menuItemIds = new int[var2];
		this.menuWorldViewIds = new int[var2];
		this.menuActions = new String[var2];
		this.menuTargets = new String[var2];
		this.subMenus = new Menu[var2];
		this.menuShiftClick = new boolean[var2];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "67"
	)
	public final String method10250(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "157225242"
	)
	void method10249() {
		this.menuWidth = WorldMapLabelSize.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = WorldMapLabelSize.fontBold12.stringWidth(this.method10250(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * -996409265 + 1165946628;
		if (this.field5524) {
			this.menuHeight += -1195691118;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "16777215"
	)
	public final void method10252(int var1, int var2) {
		this.method10249();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > NPC.canvasWidth) {
			this.menuX = NPC.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight + this.menuY > ApproximateRouteStrategy.canvasHeight) {
			this.menuY = ApproximateRouteStrategy.canvasHeight - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5533 != -1 && this.subMenus[this.field5533] != null) {
			this.subMenus[this.field5533].method10253(this);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvw;I)V",
		garbageValue = "-1450741089"
	)
	final void method10253(Menu var1) {
		this.method10249();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuWidth + this.menuX > NPC.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5533 * 15 + var1.menuY;
		if (var1.field5524) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight + this.menuY > ApproximateRouteStrategy.canvasHeight) {
			this.menuY = var3 - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1080804360"
	)
	final int method10254(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5524) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1126663380"
	)
	public final void method10255(int var1) {
		if (var1 >= 0) {
			GrandExchangeEvents.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1481712309"
	)
	public final boolean method10256(int var1, int var2) {
		if (this.field5533 != -1 && this.subMenus[this.field5533] != null && this.subMenus[this.field5533].method10256(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight + this.menuY + 10) {
			int var3 = this.method10254(var1, var2);
			if (var3 != -1 && var3 != this.field5533) {
				if (var3 != this.field5534) {
					this.field5534 = var3;
					this.field5535 = RouteStrategy.method5439();
					if (this.field5533 != -1) {
						this.field5535 += 300L;
					}
				}

				if (this.field5535 <= RouteStrategy.method5439()) {
					this.field5534 = -1;
					this.method10260();
					if (this.subMenus[var3] != null) {
						this.field5533 = var3;
						this.subMenus[var3].method10253(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-106"
	)
	public final boolean method10257(int var1, int var2) {
		if (this.field5533 != -1 && this.subMenus[this.field5533] != null && this.subMenus[this.field5533].method10257(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10254(var1, var2);
			if (var3 != -1) {
				this.method10255(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1096248356"
	)
	public final void method10258() {
		this.field5533 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10258();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetWidths[var5] + Client.rootWidgetXs[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var2 + var4) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10260();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method10260() {
		if (this.field5533 != -1) {
			if (this.subMenus[this.field5533] != null) {
				this.subMenus[this.field5533].invalidateWidgetsUnder();
			}

			this.field5533 = -1;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "1855489333"
	)
	@Export("insertMenuItem")
	public final int insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.menuOptionsCount < this.menuActions.length) {
			this.menuActions[this.menuOptionsCount] = var1;
			this.menuTargets[this.menuOptionsCount] = var2;
			this.menuOpcodes[this.menuOptionsCount] = var3;
			this.menuIdentifiers[this.menuOptionsCount] = var4;
			this.menuArguments1[this.menuOptionsCount] = var5;
			this.menuArguments2[this.menuOptionsCount] = var6;
			this.menuItemIds[this.menuOptionsCount] = var7;
			this.menuWorldViewIds[this.menuOptionsCount] = var9;
			this.menuShiftClick[this.menuOptionsCount] = var8;
			this.subMenus[this.menuOptionsCount] = null;
			return ++this.menuOptionsCount - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2114165479"
	)
	public final void method10272() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight, var3);
		if (this.field5524) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight - 19, 0);
			WorldMapLabelSize.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		int var6;
		int var7;
		int var8;
		for (var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5524) {
				var7 += 17;
			}

			var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5533 || var6 == this.field5534 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			WorldMapLabelSize.fontBold12.draw(this.method10250(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				WorldMapLabelSize.fontBold12.method8194(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		var6 = this.menuX;
		var7 = this.menuY;
		var8 = this.menuWidth;
		int var9 = this.menuHeight;

		for (int var10 = 0; var10 < Client.rootWidgetCount; ++var10) {
			if (Client.rootWidgetXs[var10] + Client.rootWidgetWidths[var10] > var6 && Client.rootWidgetXs[var10] < var8 + var6 && Client.rootWidgetHeights[var10] + Client.rootWidgetYs[var10] > var7 && Client.rootWidgetYs[var10] < var7 + var9) {
				Client.field685[var10] = true;
			}
		}

		if (this.field5533 != -1 && this.subMenus[this.field5533] != null) {
			this.subMenus[this.field5533].method10272();
		}

	}
}
