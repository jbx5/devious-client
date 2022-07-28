import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("kx")
public class class302 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(descriptor = "Llx;")
	public static class326 field3596;

	@ObfuscatedName("ui")
	@ObfuscatedSignature(descriptor = "Lll;")
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkx;")
	static final class302 field3600 = new class302(51, 27, 800, 0, 16, 16);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkx;")
	static final class302 field3597 = new class302(25, 28, 800, 656, 40, 40);

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2057015371)
	final int field3601;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 929892857)
	final int field3599;

	class302(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3601 = var5;
		this.field3599 = var6;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(descriptor = "(Lku;III)V", garbageValue = "197731620")
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			UserComparator4.method2657(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}
		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = IgnoreList.Widget_getSpellActionName(var0);
			if (var3 != null) {
				UserComparator4.method2657(var3, class82.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId);
			}
		}
		if (var0.buttonType == 3) {
			StructComposition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}
		if (var0.buttonType == 4) {
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}
		if (var0.buttonType == 5) {
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}
		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			StructComposition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}
		int var4;
		int var5;
		int var15;
		if (var0.type == 2) {
			var15 = 0;
			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					int var18 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var15 < 20) {
						var18 += var0.inventoryXOffsets[var15];
						var7 += var0.inventoryYOffsets[var15];
					}
					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var15;
						NetCache.hoveredItemContainer = var0;
						if (var0.itemIds[var15] > 0) {
							ItemComposition var8 = class258.ItemDefinition_get(var0.itemIds[var15] - 1);
							if (Client.isItemSelected == 1 && SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) {
								if (var0.id != GraphicsObject.selectedItemWidget || var15 != GrandExchangeOfferOwnWorldComparator.selectedItemSlot) {
									UserComparator4.method2657("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16748608) + var8.name, 31, 0, var15, var0.id, var8.id);
								}
							} else if (Client.isSpellSelected && SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) {
								if ((Coord.selectedSpellFlags & 16) == 16) {
									UserComparator4.method2657(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16748608) + var8.name, 32, 0, var15, var0.id, var8.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								boolean var11;
								if (Client.shiftClickDrop) {
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}
								if (SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) {
									for (int var20 = 4; var20 >= 3; --var20) {
										if (var20 != var10) {
											Archive.addWidgetItemMenuItem(var0, var8, var15, var20, false);
										}
									}
								}
								int var12 = class67.getWidgetFlags(var0);
								var11 = (var12 >> 31 & 1) != 0;
								if (var11) {
									UserComparator4.method2657("Use", class82.colorStartTag(16748608) + var8.name, 38, 0, var15, var0.id, var8.id);
								}
								Object var10000 = null;
								int var13;
								if (SpotAnimationDefinition.method3518(class67.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) {
										if (var13 != var10) {
											Archive.addWidgetItemMenuItem(var0, var8, var15, var13, false);
										}
									}
									if (var10 >= 0) {
										Archive.addWidgetItemMenuItem(var0, var8, var15, var10, true);
									}
								}
								var9 = var0.itemActions;
								if (var9 != null) {
									for (var13 = 4; var13 >= 0; --var13) {
										if (var9[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 39;
											}
											if (var13 == 1) {
												var14 = 40;
											}
											if (var13 == 2) {
												var14 = 41;
											}
											if (var13 == 3) {
												var14 = 42;
											}
											if (var13 == 4) {
												var14 = 43;
											}
											UserComparator4.method2657(var9[var13], class82.colorStartTag(16748608) + var8.name, var14, 0, var15, var0.id, var8.id);
										}
									}
								}
								UserComparator4.method2657("Examine", class82.colorStartTag(16748608) + var8.name, 1005, 0, var15, var0.id, var8.id);
							}
						}
					}
					++var15;
				}
			}
		}
		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class136.method2955(class67.getWidgetFlags(var0)) && (Coord.selectedSpellFlags & 32) == 32) {
					UserComparator4.method2657(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					String var17;
					if (!class201.method4100(class67.getWidgetFlags(var0), var15) && var0.onOp == null) {
						var17 = null;
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) {
						var17 = var0.actions[var15];
					} else {
						var17 = null;
					}
					if (var17 != null) {
						UserComparator4.method2657(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}
				var3 = IgnoreList.Widget_getSpellActionName(var0);
				if (var3 != null) {
					UserComparator4.method2657(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}
				for (var4 = 4; var4 >= 0; --var4) {
					String var16;
					if (!class201.method4100(class67.getWidgetFlags(var0), var4) && var0.onOp == null) {
						var16 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var16 = var0.actions[var4];
					} else {
						var16 = null;
					}
					if (var16 != null) {
						ViewportMouse.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}
				var5 = class67.getWidgetFlags(var0);
				boolean var19 = (var5 & 1) != 0;
				if (var19) {
					StructComposition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}
	}
}