import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class358 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-16")

	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != (-1)) {
			if (MusicPatchNode2.loadInterface(var0)) {
				Widget[] var1 = EnumComposition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class175.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}