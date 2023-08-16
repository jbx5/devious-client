import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
class class308 implements ThreadFactory {
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static JagNetThread field3462;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Llf;)V"
	)
	class308(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
