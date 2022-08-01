import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
@ObfuscatedName("aj")
public class class28 {
	@ObfuscatedName("lq")
	@ObfuscatedSignature(descriptor = "Lcz;")
	@Export("localPlayer")
	static Player localPlayer;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("f")
	public static boolean method388(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = ((int) (var0 >>> 16 & 1L)) == 1;
			var2 = !var3;
		}
		return var2;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "-68")
	static final void method387(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field691[var4] = true;
			}
		}
	}
}