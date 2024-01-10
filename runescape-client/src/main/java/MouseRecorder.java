import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -170100783
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("am")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ap")
	@Export("lock")
	Object lock;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 849276385
	)
	@Export("index")
	int index;
	@ObfuscatedName("aj")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("aq")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ar")
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
		for (; this.isRunning; BuddyRankComparator.method2992(50L)) {
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

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1726004576"
	)
	static String method2371(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class426.field4608 != null) {
			var3 = "/p=" + class426.field4608;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class92.clientLanguage + "/a=" + WorldMapData_0.field2467 + var3 + "/";
	}
}
