import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
class class322 implements ThreadFactory {
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	static GraphicsDefaults field3517;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	class322(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
