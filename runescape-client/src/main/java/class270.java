import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class270 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -285962511
	)
	int field2963;

	@ObfuscatedSignature(
		descriptor = "(Lky;I)V"
	)
	class270(class275 var1, int var2) {
		this.field2963 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21389"
	)
	public int method5427() {
		return this.field2963;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lnq;IIB)V",
		garbageValue = "-105"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = class358.method6669(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = class358.method6669(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class535.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var6 = Client.menu.menuOptionsCount - 1;
					if (var6 != -1) {
						Renderable.method4139(var6);
					}

					return;
				}
			}

		}
	}
}
