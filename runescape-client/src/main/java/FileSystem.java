import java.lang.management.ManagementFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Hashtable;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
@ObfuscatedName("fw")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("c")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;

	@ObfuscatedName("v")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;

	@ObfuscatedName("q")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([FIFB)F", garbageValue = "-127")
	static float method3281(float[] var0, int var1, float var2) {
		float var3 = var0[var1];
		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}
		return var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(CLlb;I)C", garbageValue = "2136665955")
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}
			if (var0 == 199) {
				return 'C';
			}
			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}
			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}
			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}
			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}
			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}
			if (var0 == 221) {
				return 'Y';
			}
			if (var0 == 223) {
				return 's';
			}
			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}
			if (var0 == 231) {
				return 'c';
			}
			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}
			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}
			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}
			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}
			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}
			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}
		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1243687493")
	public static void method3282() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1055608683")
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class162.garbageCollector == null || !class162.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = ((GarbageCollectorMXBean) (var1.next()));
					if (var2.isValid()) {
						class162.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				} 
			} catch (Throwable var11) {
			}
		}
		if (class162.garbageCollector != null) {
			long var9 = class115.method2692();
			long var3 = class162.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = ((int) (var5 * 100L / var7));
				}
			}
			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}
		return var0;
	}
}