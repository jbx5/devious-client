import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
final class class107 implements class339 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lng;)V"
	)
	class107(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void vmethod6430() {
		if (this.val$cc != null && this.val$cc.method6841().field3658 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2355(this.val$cc);
			var1.setArgs(this.val$cc.method6841().field3658);
			DirectByteArrayCopier.method6959().addFirst(var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "85"
	)
	public static boolean method2782() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}
}
