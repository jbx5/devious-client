import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
class class326 implements Callable {
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmk;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class326(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3496;

		while (true) {
			class323 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class323)var1.remove();
			}

			var2.field3518.method1098();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1965469996"
	)
	static void method6257() {
		ByteArrayPool.field4627.clear();
		ByteArrayPool.field4627.add(100);
		ByteArrayPool.field4627.add(5000);
		ByteArrayPool.field4627.add(10000);
		ByteArrayPool.field4627.add(30000);
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "-201240370"
	)
	static final void method6261(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field736 == -1) {
				Client.field736 = var0.spriteId2;
				Client.field787 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field736;
			} else {
				var0.spriteId2 = Client.field787;
			}

		} else if (var1 == 325) {
			if (Client.field736 == -1) {
				Client.field736 = var0.spriteId2;
				Client.field787 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field787;
			} else {
				var0.spriteId2 = Client.field736;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
