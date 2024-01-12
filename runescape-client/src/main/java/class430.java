import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class430 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "24"
	)
	static class138 method8064(int var0) {
		class138 var1 = (class138)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class332.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535);
			class138 var2;
			if (var6 == null) {
				var5 = false;
				var2 = null;
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
				byte[] var8 = var4.getFile(var7, 0);
				if (var8 == null) {
					var5 = false;
				}

				if (!var5) {
					var2 = null;
				} else {
					if (AsyncHttpResponse.field85 == null) {
						class74.field897 = Runtime.getRuntime().availableProcessors();
						AsyncHttpResponse.field85 = new ThreadPoolExecutor(0, class74.field897, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class74.field897 * 100 + 100), new class169());
					}

					try {
						var2 = new class138(var3, var4, var0, false);
					} catch (Exception var10) {
						var2 = null;
					}
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
