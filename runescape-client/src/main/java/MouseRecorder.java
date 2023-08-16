import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dt")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1283573311
	)
	static int field1105;
	@ObfuscatedName("au")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ae")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1540170903
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ac")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ai")
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
		for (; this.isRunning; PendingSpawn.method2365(50L)) {
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
}
