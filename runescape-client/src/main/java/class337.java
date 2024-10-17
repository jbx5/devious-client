import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class337 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1650939479
	)
	int field3691;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	class53 field3690;

	@ObfuscatedSignature(
		descriptor = "(ILcb;)V"
	)
	class337(int var1, class53 var2) {
		this.field3691 = var1;
		this.field3690 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2067790797"
	)
	public static float method6771(int var0) {
		var0 &= 2047;
		return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-960317598"
	)
	public static boolean method6770() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}
}
