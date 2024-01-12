import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
final class class106 implements class337 {
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1503351495
	)
	static int field1342;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1083303950"
	)
	public void vmethod6342() {
		if (this.val$cc != null && this.val$cc.method6716().field3632 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2355(this.val$cc);
			var1.setArgs(this.val$cc.method6716().field3632);
			class27.method401().addFirst(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1518339493"
	)
	public static void method2774() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field2303; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
