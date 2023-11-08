import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("at")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ah")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 635201825
	)
	@Export("index")
	int index;
	@ObfuscatedName("ao")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ab")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("au")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class219.method4260(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	public static int method2372(int var0) {
		class139 var2 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class139 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			var2 = Login.method2197(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3164() ? 0 : 1;
		}
	}
}
