import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("az")
	public static short[][] field1098;
	@ObfuscatedName("aq")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ad")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1670544525
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ap")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("an")
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
		for (; this.isRunning; class188.method3688(50L)) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1733985196"
	)
	public static void method2386() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < RestClientThreadFactory.field76; ++var0) {
				class163.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
