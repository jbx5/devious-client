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
	static void method8358(WorldEntityCoord var0, WorldEntityCoord var1, float var2, WorldEntityCoord var3) {
		var2 = GrandExchangeOfferOwnWorldComparator.method1279(0.0F, 1.0F, var2);
		int var4 = var1.getX() - var0.getX();
		int var5 = var1.getY() - var0.getY();
		var4 = (int)((float)var4 * var2);
		var5 = (int)(var2 * (float)var5);
		var3.method5800(var0.getX() + var4, var0.getY() + var5);
		int var6 = IndexCheck.method5659(var0.getCurrentRotationAngle(), var1.getCurrentRotationAngle());
		var6 = (int)((float)var6 * var2);
		var3.setCurrentRotationAngle(var0.getCurrentRotationAngle() + var6);
	}
}
