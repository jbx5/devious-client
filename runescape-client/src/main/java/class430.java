import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class430 {
	@ObfuscatedName("ap")
	float[] field4801;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1448224687
	)
	int field4800;

	class430(float[] var1, int var2) {
		this.field4801 = var1;
		this.field4800 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "58"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class418.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;FLkt;I)V",
		garbageValue = "396921514"
	)
	static void method8358(class274 var0, class274 var1, float var2, class274 var3) {
		var2 = GrandExchangeOfferOwnWorldComparator.method1279(0.0F, 1.0F, var2);
		int var4 = var1.method5765() - var0.method5765();
		int var5 = var1.method5767() - var0.method5767();
		var4 = (int)((float)var4 * var2);
		var5 = (int)(var2 * (float)var5);
		var3.method5800(var0.method5765() + var4, var0.method5767() + var5);
		int var6 = IndexCheck.method5659(var0.method5781(), var1.method5781());
		var6 = (int)((float)var6 * var2);
		var3.method5773(var0.method5781() + var6);
	}
}
