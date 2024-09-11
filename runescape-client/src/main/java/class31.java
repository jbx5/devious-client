import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class31 {
	@ObfuscatedName("ac")
	public static Applet field147;
	@ObfuscatedName("ae")
	public static String field143;

	static {
		field147 = null;
		field143 = "";
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-45"
	)
	public static final void method459(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field731[var4] = true;
			}
		}

	}
}
