import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
final class class109 implements class347 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	class109(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "652965052"
	)
	public void vmethod6534() {
		if (this.val$cc != null && this.val$cc.method6945().field3750 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2327(this.val$cc);
			var1.setArgs(this.val$cc.method6945().field3750);
			class47.method887().addFirst(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2110165275"
	)
	public static void method2770() {
		class216.field2136.clear();
	}

	@ObfuscatedName("az")
	public static int method2774(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
