import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cr")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("uv")
	@ObfuscatedGetter(intValue = 
	270412709)

	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("v")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("o")
	@Export("lock")
	Object lock;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-154058261)

	@Export("index")
	int index;
	@ObfuscatedName("g")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("l")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("n")
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
		for (; this.isRunning; GrandExchangeOfferTotalQuantityComparator.method6007(50L)) {
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