import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class273 {
	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-644224068"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-939807421"
	)
	public static int method5525(int var0) {
		class137 var2 = (class137)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class137 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			AbstractArchive var4 = class333.SequenceDefinition_animationsArchive;
			AbstractArchive var5 = class169.SequenceDefinition_skeletonsArchive;
			boolean var6 = true;
			byte[] var7 = var4.getFile(var0 >> 16 & 65535, var0 & 65535);
			class137 var3;
			if (var7 == null) {
				var6 = false;
				var3 = null;
			} else {
				int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
				byte[] var9 = var5.getFile(var8, 0);
				if (var9 == null) {
					var6 = false;
				}

				if (!var6) {
					var3 = null;
				} else {
					if (SoundCache.field344 == null) {
						UserComparator4.field1444 = Runtime.getRuntime().availableProcessors();
						SoundCache.field344 = new ThreadPoolExecutor(0, UserComparator4.field1444, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(UserComparator4.field1444 * 100 + 100), new class184());
					}

					try {
						var3 = new class137(var4, var5, var0, false);
					} catch (Exception var11) {
						var3 = null;
					}
				}
			}

			if (var3 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var3, (long)var0);
			}

			var1 = var3;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3056() ? 0 : 1;
		}
	}
}
