import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
final class class111 implements class351 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lng;)V"
	)
	class111(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3346"
	)
	public void vmethod6889() {
		if (this.val$item.method7287().field3808 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2565(this.val$item);
			var1.setArgs(this.val$item.method7287().field3808);
			Archive.method7599().addFirst(var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-97637417"
	)
	public static void method3078() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
