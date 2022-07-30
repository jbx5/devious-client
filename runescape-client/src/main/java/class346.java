import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("mg")
public final class class346 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "[Lpm;")
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	@ObfuscatedName("o")
	final Object field4185;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1666879287)
	int field4184;

	class346(Object var1, int var2) {
		this.field4185 = var1;
		this.field4184 = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "903011029")
	public static void method6353() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(Lae;I)V", garbageValue = "1359963642")
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}
		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}
	}
}