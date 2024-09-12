import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class268 extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -531861761
	)
	public int field2974;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -984220335
	)
	public int field2966;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1852145887
	)
	public int field2970;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public Widget field2969;

	@ObfuscatedSignature(
		descriptor = "(IIILny;)V"
	)
	public class268(int var1, int var2, int var3, Widget var4) {
		this.field2970 = var1;
		this.field2974 = var2;
		this.field2966 = var3;
		this.field2969 = var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfk;",
		garbageValue = "1313495960"
	)
	static class135[] method5565() {
		return new class135[]{class135.field1590, class135.field1587, class135.field1588, class135.field1594, class135.field1591};
	}
}
