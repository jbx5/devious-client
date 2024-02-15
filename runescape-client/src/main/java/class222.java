import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class222 {
	@ObfuscatedName("ai")
	public String field2394;
	@ObfuscatedName("ar")
	public float[] field2399;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 776962611
	)
	public int field2395;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 151618499
	)
	public int field2396;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1753802885
	)
	public int field2397;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;)V"
	)
	class222(class221 var1) {
		this.this$0 = var1;
		this.field2399 = new float[4];
		this.field2395 = 1;
		this.field2396 = 1;
		this.field2397 = 0;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	static final void method4344(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class30.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
