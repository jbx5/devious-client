import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
final class class105 implements class334 {
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	public void vmethod6278() {
		if (this.val$cc != null && this.val$cc.method6767().field3588 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2357(this.val$cc);
			var1.setArgs(this.val$cc.method6767().field3588);
			FileSystem.method4225().addFirst(var1);
		}

	}
}
