import java.lang.management.ManagementFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
@ObfuscatedName("dr")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -318993653)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnh;Lnh;I)I", garbageValue = "-126609268")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
	static void method2701(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-2")
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class340.garbageCollector == null || !class340.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = ((GarbageCollectorMXBean) (var1.next()));
					if (var2.isValid()) {
						class340.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				} 
			} catch (Throwable var11) {
			}
		}
		if (class340.garbageCollector != null) {
			long var9 = class131.method2916();
			long var3 = class340.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = ((int) (var5 * 100L / var7));
				}
			}
			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}
		return var0;
	}
}