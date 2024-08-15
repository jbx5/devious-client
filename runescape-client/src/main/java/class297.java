import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class297 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static final class297 field3187;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static final class297 field3190;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1725404129
	)
	@Export("value")
	final int value;

	static {
		field3187 = new class297(0);
		field3190 = new class297(1);
	}

	class297(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-107"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class535.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1107820800"
	)
	static int method5962() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field799;
		} else {
			return 10000;
		}
	}
}
