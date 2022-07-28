import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cp")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("p")
	static int[][][] field1060;

	@ObfuscatedName("o")
	@Export("isRunning")
	boolean isRunning = true;

	@ObfuscatedName("q")
	@Export("lock")
	Object lock = new Object();

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -368891301)
	@Export("index")
	int index = 0;

	@ObfuscatedName("u")
	@Export("xs")
	int[] xs = new int[500];

	@ObfuscatedName("c")
	@Export("ys")
	int[] ys = new int[500];

	@ObfuscatedName("w")
	@Export("millis")
	long[] millis = new long[500];

	MouseRecorder() {
	}

	public void run() {
		for (; this.isRunning; WorldMapDecoration.method4967(50L)) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Lfp;", garbageValue = "-21")
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = ((VarpDefinition) (VarpDefinition.VarpDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			VarpDefinition.VarpDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1517499028")
	static void method2170(int var0, int var1) {
		if (class260.clientPreferences.method2335() != 0 && var0 != -1) {
			FriendsChat.method6678(WorldMapRegion.field2708, var0, 0, class260.clientPreferences.method2335(), false);
			Client.playingJingle = true;
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1640370499")
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}