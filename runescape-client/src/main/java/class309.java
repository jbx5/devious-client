import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
class class309 implements ThreadFactory {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 576671459
	)
	static int field3456;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Llc;)V"
	)
	class309(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
