import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
final class class107 implements class337 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnm;)V"
	)
	class107(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	public void vmethod6238() {
		if (this.val$cc != null && this.val$cc.method6617().field3609 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2317(this.val$cc);
			var1.setArgs(this.val$cc.method6617().field3609);
			class7.method58().addFirst(var1);
		}

	}
}
