import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
class class312 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Llf;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class312(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3423;

		while (true) {
			class309 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class309)var1.remove();
			}

			var2.field3464.method1096();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1739317164"
	)
	static Date method5971() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2037147642"
	)
	static final int method5969(int var0, int var1) {
		int var2 = Strings.method6622(var0 - 1, var1 - 1) + Strings.method6622(1 + var0, var1 - 1) + Strings.method6622(var0 - 1, var1 + 1) + Strings.method6622(1 + var0, var1 + 1);
		int var3 = Strings.method6622(var0 - 1, var1) + Strings.method6622(1 + var0, var1) + Strings.method6622(var0, var1 - 1) + Strings.method6622(var0, var1 + 1);
		int var4 = Strings.method6622(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
