import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ap")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "16777215"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "325169216"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "48"
	)
	static void method5027(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				Client.groundItems[var0][var1][var2] = null;
			}

			class134.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "2027497164"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			ObjectSound.method1983(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = FontName.Widget_getSpellActionName(var0);
			if (var1 != null) {
				ObjectSound.method1983(var1, class208.colorStartTag(65280) + var0.field3830, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class385.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class385.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var2;
			if (Client.isSpellSelected) {
				var2 = class405.getWidgetFlags(var0);
				boolean var4 = (var2 >> 21 & 1) != 0;
				if (var4 && (class60.selectedSpellFlags & 32) == 32) {
					ObjectSound.method1983(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) {
					String var5 = HealthBarUpdate.method2496(var0, var6);
					if (var5 != null) {
						ObjectSound.method1983(var5, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = FontName.Widget_getSpellActionName(var0);
				if (var1 != null) {
					ObjectSound.method1983(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					String var3 = HealthBarUpdate.method2496(var0, var2);
					if (var3 != null) {
						Huffman.insertMenuItem(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				if (class304.method5978(class405.getWidgetFlags(var0))) {
					class385.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
