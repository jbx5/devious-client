import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public enum class365 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3989(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3991(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3990(2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3988(3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3987(4);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 794544199
	)
	final int field3992;

	class365(int var3) {
		this.field3992 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3992;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method7116() {
		Client.field650 = 0;
		int var0 = (class17.localPlayer.x >> 7) + class358.topLevelWorldView.baseX;
		int var1 = (class17.localPlayer.y >> 7) + class358.topLevelWorldView.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field650 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field650 = 1;
		}

		if (Client.field650 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field650 = 0;
		}

	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "2"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (AsyncRestClient.widgetDefinition.loadInterface(var0)) {
			class197.field2010 = null;
			class364.drawInterface(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class197.field2010 != null) {
				class364.drawInterface(class197.field2010, -1412584499, var1, var2, var3, var4, class182.field1908, class4.field4, var7);
				class197.field2010 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
