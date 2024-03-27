import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class31 {
	@ObfuscatedName("az")
	public static Applet field153;
	@ObfuscatedName("ah")
	public static String field150;
	@ObfuscatedName("ga")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;

	static {
		field153 = null;
		field150 = "";
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-2147357601"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			class133.method3069(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class160.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class133.method3069(var1, Decimator.colorStartTag(65280) + var0.field3822, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			Interpreter.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			Interpreter.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			Interpreter.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			Interpreter.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class129.method3000(class33.getWidgetFlags(var0)) && (class352.selectedSpellFlags & 32) == 32) {
					class133.method3069(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) {
					String var9 = SoundSystem.method819(var0, var6);
					if (var9 != null) {
						class133.method3069(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = class160.Widget_getSpellActionName(var0);
				if (var1 != null) {
					class133.method3069(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (int var2 = 4; var2 >= 0; --var2) {
					int var5 = class33.getWidgetFlags(var0);
					boolean var4 = (var5 >> var2 + 1 & 1) != 0;
					String var7;
					if (!var4 && var0.onOp == null) {
						var7 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var7 = var0.actions[var2];
					} else {
						var7 = null;
					}

					if (var7 != null) {
						GraphicsObject.insertMenuItem(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				int var3 = class33.getWidgetFlags(var0);
				boolean var10 = (var3 & 1) != 0;
				if (var10) {
					Interpreter.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "3"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class243.widgetDefinition.loadInterface(var0)) {
			class188.updateInterface(class243.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "1725517927"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var6 = NpcOverrides.method3858(class33.getWidgetFlags(var0));
				Widget var4;
				int var7;
				if (var6 == 0) {
					var4 = null;
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5;
							break;
						}

						var5 = class243.widgetDefinition.method6281(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var7;
					}
				}

				Widget var8 = var4;
				if (var4 == null) {
					var8 = var0.parent;
				}

				if (var8 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var6 = NpcOverrides.method3858(class33.getWidgetFlags(var0));
					if (var6 == 0) {
						var4 = null;
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5;
								break;
							}

							var5 = class243.widgetDefinition.method6281(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var7;
						}
					}

					var8 = var4;
					if (var4 == null) {
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class179.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var9 = Client.menuOptionsCount - 1;
					if (var9 != -1) {
						ItemComposition.method4204(var9);
					}

					return;
				}
			}

		}
	}
}
