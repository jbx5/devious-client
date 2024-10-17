import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
class class340 implements Callable {
	@ObfuscatedName("af")
	public static short[][] field3707;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class340(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class337 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class337)var1.remove();
			}

			var2.field3690.method1105();
		}
	}
}
