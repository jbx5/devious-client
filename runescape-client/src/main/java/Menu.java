import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vl")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ac")
	boolean field5553;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2098117423
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ag")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("am")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ax")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("aq")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("af")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("at")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("au")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ad")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1940751655
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 116697629
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -827800175
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("az")
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1410667587
	)
	int field5563;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1982400513
	)
	int field5562;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 1925236832760371557L
	)
	long field5565;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5553 = var1;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "16776960"
	)
	public final String method10554(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1312384289"
	)
	void method10536() {
		this.menuWidth = class33.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = class33.fontBold12.stringWidth(this.method10554(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * -407222349 + 1609394292;
		if (this.field5553) {
			this.menuHeight += -1347660278;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-195869575"
	)
	public final void method10537(int var1, int var2) {
		this.method10536();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuWidth + this.menuX > class154.canvasWidth) {
			this.menuX = class154.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuY + this.menuHeight * 1044396085 > UrlRequester.canvasHeight) {
			this.menuY = UrlRequester.canvasHeight - this.menuHeight * 1044396085;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5563 != -1 && this.subMenus[this.field5563] != null) {
			this.subMenus[this.field5563].method10538(this);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "1058661487"
	)
	final void method10538(Menu var1) {
		this.method10536();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuX + this.menuWidth > class154.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5563 * 15 + var1.menuY;
		if (var1.field5553) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuY + this.menuHeight * 1044396085 > UrlRequester.canvasHeight) {
			this.menuY = var3 - this.menuHeight * 1044396085;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "98633240"
	)
	final int method10539(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5553) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	public final void method10540(int var1) {
		if (var1 >= 0) {
			class416.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1209062440"
	)
	public final boolean method10577(int var1, int var2) {
		if (this.field5563 != -1 && this.subMenus[this.field5563] != null && this.subMenus[this.field5563].method10577(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuY + this.menuHeight * 1044396085 + 10) {
			int var3 = this.method10539(var1, var2);
			if (var3 != -1 && var3 != this.field5563) {
				if (var3 != this.field5562) {
					this.field5562 = var3;
					this.field5565 = WorldMapElement.method3843();
					if (this.field5563 != -1) {
						this.field5565 += 300L;
					}
				}

				if (this.field5565 <= WorldMapElement.method3843()) {
					this.field5562 = -1;
					this.method10559();
					if (this.subMenus[var3] != null) {
						this.field5563 = var3;
						this.subMenus[var3].method10538(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public final boolean method10542(int var1, int var2) {
		if (this.field5563 != -1 && this.subMenus[this.field5563] != null && this.subMenus[this.field5563].method10542(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10539(var1, var2);
			if (var3 != -1) {
				this.method10540(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2126268064"
	)
	public final void method10556() {
		this.field5563 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10556();
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-682470517"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight * 1044396085;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetXs[var5] + Client.rootWidgetWidths[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var2 + var4) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10559();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	final void method10559() {
		if (this.field5563 != -1) {
			if (this.subMenus[this.field5563] != null) {
				this.subMenus[this.field5563].invalidateWidgetsUnder();
			}

			this.field5563 = -1;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "124"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1766287933"
	)
	public final void method10547() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * 1044396085, var3);
		if (this.field5553) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * 1044396085 - 19, 0);
			class33.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * 1044396085 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5553) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5563 || var6 == this.field5562 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			class33.fontBold12.draw(this.method10554(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				class33.fontBold12.method8443(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		class31.method459(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 1044396085);
		if (this.field5563 != -1 && this.subMenus[this.field5563] != null) {
			this.subMenus[this.field5563].method10547();
		}

	}
}
