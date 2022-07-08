import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("i")
public class class9 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Li;")
	public static final class9 field36;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Li;")
	public static final class9 field30;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Li;")
	static final class9 field31;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Li;")
	static final class9 field39;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Li;")
	static final class9 field33;

	@ObfuscatedName("iq")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -145879233)
	int field29;

	@ObfuscatedName("g")
	String field35;

	@ObfuscatedName("w")
	boolean field40;

	@ObfuscatedName("y")
	boolean field37;

	static {
		field36 = new class9(0, "POST", true, true);
		field30 = new class9(1, "GET", true, false);
		field31 = new class9(2, "PUT", false, true);
		field39 = new class9(3, "PATCH", false, true);
		field33 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field29 = var1;
		this.field35 = var2;
		this.field40 = var3;
		this.field37 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field29;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1680698316")
	boolean method61() {
		return this.field40;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "311")
	public String method64() {
		return this.field35;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1657994418")
	boolean method62() {
		return this.field37;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1270247165")
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(descriptor = "(Lkb;III)V", garbageValue = "2138979483")
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			class4.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}
		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = WorldMapIcon_0.Widget_getSpellActionName(var0);
			if (var3 != null) {
				class4.insertMenuItemNoShift(var3, class122.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}
		if (var0.buttonType == 3) {
			class4.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}
		if (var0.buttonType == 4) {
			class4.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}
		if (var0.buttonType == 5) {
			class4.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}
		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class4.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}
		int var4;
		int var13;
		if (var0.type == 2) {
			var13 = 0;
			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var15 = 0; var15 < var0.width; ++var15) {
					int var6 = (var0.paddingX + 32) * var15;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}
					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						class161.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = EnumComposition.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && class120.method2759(class124.getWidgetFlags(var0))) {
								if (var0.id != ModeWhere.selectedItemWidget || var13 != EnumComposition.selectedItemSlot) {
									class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && class120.method2759(class124.getWidgetFlags(var0))) {
								if ((HealthBar.selectedSpellFlags & 16) == 16) {
									class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop) {
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}
								int var16;
								if (class120.method2759(class124.getWidgetFlags(var0))) {
									for (var16 = 4; var16 >= 3; --var16) {
										if (var16 != var10) {
											class150.addWidgetItemMenuItem(var0, var8, var13, var16, false);
										}
									}
								}
								if (FontName.method7386(class124.getWidgetFlags(var0))) {
									class4.insertMenuItemNoShift("Use", class122.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}
								if (class120.method2759(class124.getWidgetFlags(var0))) {
									for (var16 = 2; var16 >= 0; --var16) {
										if (var10 != var16) {
											class150.addWidgetItemMenuItem(var0, var8, var13, var16, false);
										}
									}
									if (var10 >= 0) {
										class150.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}
								var9 = var0.itemActions;
								if (var9 != null) {
									for (var16 = 4; var16 >= 0; --var16) {
										if (var9[var16] != null) {
											byte var12 = 0;
											if (var16 == 0) {
												var12 = 39;
											}
											if (var16 == 1) {
												var12 = 40;
											}
											if (var16 == 2) {
												var12 = 41;
											}
											if (var16 == 3) {
												var12 = 42;
											}
											if (var16 == 4) {
												var12 = 43;
											}
											class4.insertMenuItemNoShift(var9[var16], class122.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}
								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}
					++var13;
				}
			}
		}
		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class67.method1885(class124.getWidgetFlags(var0)) && (HealthBar.selectedSpellFlags & 32) == 32) {
					class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var14 = class14.method157(var0, var13);
					if (var14 != null) {
						class4.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}
				var3 = WorldMapIcon_0.Widget_getSpellActionName(var0);
				if (var3 != null) {
					class4.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}
				for (var4 = 4; var4 >= 0; --var4) {
					String var5 = class14.method157(var0, var4);
					if (var5 != null) {
						class268.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}
				if (FontName.method7385(class124.getWidgetFlags(var0))) {
					class4.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-112")
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}