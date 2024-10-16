import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ww")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ap")
	boolean field5617;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1577732637
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ak")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("aj")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ai")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("ay")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("as")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("ae")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("am")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("at")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lww;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("an")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -384113843
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -22278381
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 505512799
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("ab")
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1846465855
	)
	int field5606;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -744385555
	)
	int field5616;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -3128963449872465969L
	)
	long field5602;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5617 = var1;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1128570449"
	)
	public final String method10757(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "954898160"
	)
	void method10758() {
		this.menuWidth = Calendar.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = Calendar.fontBold12.stringWidth(this.method10757(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 1916962425 + 511189980;
		if (this.field5617) {
			this.menuHeight += -1994612386;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1878313980"
	)
	public final void method10759(int var1, int var2) {
		this.method10758();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuWidth + this.menuX > HttpRequestTask.canvasWidth) {
			this.menuX = HttpRequestTask.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight * -334022457 + this.menuY > class268.canvasHeight) {
			this.menuY = class268.canvasHeight - this.menuHeight * -334022457;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5606 != -1 && this.subMenus[this.field5606] != null) {
			this.subMenus[this.field5606].method10760(this);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lww;I)V",
		garbageValue = "44833278"
	)
	final void method10760(Menu var1) {
		this.method10758();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuX + this.menuWidth > HttpRequestTask.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5606 * 15 + var1.menuY;
		if (var1.field5617) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight * -334022457 + this.menuY > class268.canvasHeight) {
			this.menuY = var3 - this.menuHeight * -334022457;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1092545121"
	)
	final int method10766(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5617) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	public final void method10797(int var1) {
		if (var1 >= 0) {
			class276.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "71"
	)
	public final boolean method10809(int var1, int var2) {
		if (this.field5606 != -1 && this.subMenus[this.field5606] != null && this.subMenus[this.field5606].method10809(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuX + this.menuWidth + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight * -334022457 + this.menuY + 10) {
			int var3 = this.method10766(var1, var2);
			if (var3 != -1 && var3 != this.field5606) {
				if (var3 != this.field5616) {
					this.field5616 = var3;
					this.field5602 = class77.method2338();
					if (this.field5606 != -1) {
						this.field5602 += 300L;
					}
				}

				if (this.field5602 <= class77.method2338()) {
					this.field5616 = -1;
					this.method10767();
					if (this.subMenus[var3] != null) {
						this.field5606 = var3;
						this.subMenus[var3].method10760(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public final boolean method10764(int var1, int var2) {
		if (this.field5606 != -1 && this.subMenus[this.field5606] != null && this.subMenus[this.field5606].method10764(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10766(var1, var2);
			if (var3 != -1) {
				this.method10797(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-404628057"
	)
	public final void method10765() {
		this.field5606 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10765();
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1829927992"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight * -334022457;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetWidths[var5] + Client.rootWidgetXs[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var2 + var4) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10767();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087649755"
	)
	final void method10767() {
		if (this.field5606 != -1) {
			if (this.subMenus[this.field5606] != null) {
				this.subMenus[this.field5606].invalidateWidgetsUnder();
			}

			this.field5606 = -1;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "843542173"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	public final void method10775() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * -334022457, var3);
		if (this.field5617) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * -334022457 - 19, 0);
			Calendar.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * -334022457 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		int var6;
		int var7;
		int var8;
		for (var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5617) {
				var7 += 17;
			}

			var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5606 || var6 == this.field5616 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			Calendar.fontBold12.draw(this.method10757(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				Calendar.fontBold12.method8580(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		var6 = this.menuX;
		var7 = this.menuY;
		var8 = this.menuWidth;
		int var9 = this.menuHeight * -334022457;

		for (int var10 = 0; var10 < Client.rootWidgetCount; ++var10) {
			if (Client.rootWidgetWidths[var10] + Client.rootWidgetXs[var10] > var6 && Client.rootWidgetXs[var10] < var6 + var8 && Client.rootWidgetYs[var10] + Client.rootWidgetHeights[var10] > var7 && Client.rootWidgetYs[var10] < var7 + var9) {
				Client.field716[var10] = true;
			}
		}

		if (this.field5606 != -1 && this.subMenus[this.field5606] != null) {
			this.subMenus[this.field5606].method10775();
		}

	}
}
