import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class334 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -322822689
	)
	int field3647;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	class53 field3648;

	@ObfuscatedSignature(
		descriptor = "(ILcv;)V"
	)
	class334(int var1, class53 var2) {
		this.field3647 = var1;
		this.field3648 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method6371(int var0) {
		return var0 >= WorldMapDecorationType.field4011.id && var0 <= WorldMapDecorationType.field4032.id || var0 == WorldMapDecorationType.field4013.id;
	}
}
