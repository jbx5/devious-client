import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class138 extends class128 {
	@ObfuscatedName("ly")
	@ObfuscatedSignature(descriptor = 
	"Lit;")

	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(intValue = 
	-1603030107)

	@Export("menuX")
	static int menuX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1526195035)

	int field1580;
	@ObfuscatedName("c")
	String field1576;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class138(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1580 = var1.readInt();
		this.field1576 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2971(this.field1580, this.field1576);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIS)V", garbageValue = 
	"-3167")

	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			class21.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if ((var0.buttonType == 2) && (!Client.isSpellSelected)) {
			var3 = class152.Widget_getSpellActionName(var0);
			if (var3 != null) {
				class21.insertMenuItemNoShift(var3, UserComparator9.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			class21.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class21.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class21.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if ((var0.buttonType == 6) && (Client.meslayerContinueWidget == null)) {
			class21.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var5;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					int var6 = (var0.paddingX + 32) * var5;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if ((((var1 >= var6) && (var2 >= var7)) && (var1 < (var6 + 32))) && (var2 < (var7 + 32))) {
						Client.dragItemSlotDestination = var13;
						GrandExchangeEvent.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = class19.ItemDefinition_get(var0.itemIds[var13] - 1);
							if ((Client.isItemSelected == 1) && class150.method3149(class326.getWidgetFlags(var0))) {
								if ((var0.id != TaskHandler.selectedItemWidget) || (var13 != class432.selectedItemSlot)) {
									class21.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + UserComparator9.colorStartTag(16748608)) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && class150.method3149(class326.getWidgetFlags(var0))) {
								if ((class17.selectedSpellFlags & 16) == 16) {
									class21.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + UserComparator9.colorStartTag(16748608)) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop && class168.method3351()) {
									var10 = var8.getShiftClickIndex();
								}

								int var11;
								if (class150.method3149(class326.getWidgetFlags(var0))) {
									for (var11 = 4; var11 >= 3; --var11) {
										if (var10 != var11) {
											class65.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}
								}

								if (UserComparator10.method2629(class326.getWidgetFlags(var0))) {
									class21.insertMenuItemNoShift("Use", UserComparator9.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (class150.method3149(class326.getWidgetFlags(var0))) {
									for (var11 = 2; var11 >= 0; --var11) {
										if (var11 != var10) {
											class65.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}

									if (var10 >= 0) {
										class65.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var11 = 4; var11 >= 0; --var11) {
										if (var9[var11] != null) {
											byte var12 = 0;
											if (var11 == 0) {
												var12 = 39;
											}

											if (var11 == 1) {
												var12 = 40;
											}

											if (var11 == 2) {
												var12 = 41;
											}

											if (var11 == 3) {
												var12 = 42;
											}

											if (var11 == 4) {
												var12 = 43;
											}

											class21.insertMenuItemNoShift(var9[var11], UserComparator9.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (PacketWriter.method2498(class326.getWidgetFlags(var0)) && ((class17.selectedSpellFlags & 32) == 32)) {
					class21.insertMenuItemNoShift(Client.selectedSpellActionName, (((Client.selectedSpellName + " ") + "->") + " ") + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var15 = class358.method6583(var0, var13);
					if (var15 != null) {
						class21.insertMenuItemNoShift(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = class152.Widget_getSpellActionName(var0);
				if (var3 != null) {
					class21.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var14 = class358.method6583(var0, var4);
					if (var14 != null) {
						class28.insertMenuItem(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				var5 = class326.getWidgetFlags(var0);
				boolean var16 = (var5 & 1) != 0;
				if (var16) {
					class21.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}