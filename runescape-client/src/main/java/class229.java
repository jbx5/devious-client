import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("hj")
public class class229 {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(descriptor = "[Lqn;")
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)Ljava/lang/String;", garbageValue = "894135330")
	public static String method4813(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}
			byte[] var3 = new byte[var2];
			var0.offset += class465.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = PlatformInfo.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}
		return var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "29595")
	static final void method4818(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}
		if (var0 > 383) {
			var0 = 383;
		}
		if (class82.cameraPitch < var0) {
			class82.cameraPitch = (var0 - class82.cameraPitch) * class18.field96 / 1000 + class82.cameraPitch + class21.field113;
			if (class82.cameraPitch > var0) {
				class82.cameraPitch = var0;
			}
		}
		if (class82.cameraPitch > var0) {
			class82.cameraPitch -= (class82.cameraPitch - var0) * class18.field96 / 1000 + class21.field113;
			if (class82.cameraPitch < var0) {
				class82.cameraPitch = var0;
			}
		}
		int var2 = var1 - ClientPreferences.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}
		if (var2 < -1024) {
			var2 += 2048;
		}
		if (var2 > 0) {
			ClientPreferences.cameraYaw = var2 * class18.field96 / 1000 + ClientPreferences.cameraYaw + class21.field113;
			ClientPreferences.cameraYaw &= 2047;
		}
		if (var2 < 0) {
			ClientPreferences.cameraYaw -= -var2 * class18.field96 / 1000 + class21.field113;
			ClientPreferences.cameraYaw &= 2047;
		}
		int var3 = var1 - ClientPreferences.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}
		if (var3 < -1024) {
			var3 += 2048;
		}
		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			ClientPreferences.cameraYaw = var1;
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = "(Lkn;IIB)V", garbageValue = "22")
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class260.method5126(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class260.method5126(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				NPCComposition.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menuOptionsCount - 1;
				if (var3 != -1) {
					class142.method2983(var3);
				}
			}
		}
	}
}