import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class361 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	static {
		int var0 = 0;
		int var1 = 0;
		class357[] var2 = new class357[]{class357.field3895, class357.field3897};
		class357[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class357 var5 = var3[var4];
			if (var5.field3894 > var0) {
				var0 = var5.field3894;
			}

			if (var5.field3893 > var1) {
				var1 = var5.field3893;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1795808199"
	)
	public static int method6868(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "571282441"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
