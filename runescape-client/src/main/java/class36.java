import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class36 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2115669668"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-873724081"
	)
	static final void method664(int var0, int var1, int var2, int var3) {
		Client.field750 = 0;
		int var4 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
		int var5 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field750 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field750 = 1;
		}

		if (Client.field750 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field750 = 0;
		}

	}
}
