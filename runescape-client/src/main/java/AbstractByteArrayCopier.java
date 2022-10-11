import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "56"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIB)V",
		garbageValue = "20"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11357
			if (var0 != null) { // L: 11359
				Widget var4 = HitSplatDefinition.method3782(var0); // L: 11362
				if (var4 == null) { // L: 11363
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11366
					Client.clickedWidget = var0; // L: 11370
					var4 = HitSplatDefinition.method3782(var0); // L: 11373
					if (var4 == null) { // L: 11374
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11377
					Client.widgetClickX = var1; // L: 11378
					Client.widgetClickY = var2; // L: 11379
					class259.widgetDragDuration = 0; // L: 11380
					Client.isDraggingWidget = false; // L: 11381
					int var5 = class156.method3411(); // L: 11382
					if (var5 != -1) { // L: 11383
						class146.tempMenuAction = new MenuAction(); // L: 11384
						class146.tempMenuAction.param0 = Client.menuArguments1[var5]; // L: 11385
						class146.tempMenuAction.param1 = Client.menuArguments2[var5]; // L: 11386
						class146.tempMenuAction.opcode = Client.menuOpcodes[var5]; // L: 11387
						class146.tempMenuAction.identifier = Client.menuIdentifiers[var5]; // L: 11388
						class146.tempMenuAction.itemId = Client.menuItemIds[var5]; // L: 11389
						class146.tempMenuAction.action = Client.menuActions[var5]; // L: 11390
						class146.tempMenuAction.target = Client.menuTargets[var5]; // L: 11391
					}

					return; // L: 11393
				}
			}

		}
	} // L: 11368
}
