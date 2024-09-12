import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
final class class110 implements class352 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	class110(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	public void vmethod6836() {
		if (this.val$cc != null && this.val$cc.method7271().field3784 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2511(this.val$cc);
			var1.setArgs(this.val$cc.method7271().field3784);
			class195.method4014().addFirst(var1);
		}

	}
}
