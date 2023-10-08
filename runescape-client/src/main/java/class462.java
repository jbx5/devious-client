import java.applet.Applet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class462 {
	@ObfuscatedName("ac")
	@Export("RunException_applet")
	public static Applet RunException_applet;

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-123351457"
	)
	static void method8308(int var0) {
		SequenceDefinition var1 = class36.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class139 var5 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3);
			class139 var4;
			if (var5 != null) {
				var4 = var5;
			} else {
				AbstractArchive var7 = SequenceDefinition.SequenceDefinition_animationsArchive;
				AbstractArchive var8 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
				boolean var9 = true;
				byte[] var10 = var7.getFile(var3 >> 16 & 65535, var3 & 65535);
				class139 var6;
				if (var10 == null) {
					var9 = false;
					var6 = null;
				} else {
					int var11 = (var10[1] & 255) << 8 | var10[2] & 255;
					byte[] var12 = var8.getFile(var11, 0);
					if (var12 == null) {
						var9 = false;
					}

					if (!var9) {
						var6 = null;
					} else {
						if (SoundCache.field333 == null) {
							MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors();
							SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class73());
						}

						try {
							var6 = new class139(var7, var8, var3, false);
						} catch (Exception var14) {
							var6 = null;
						}
					}
				}

				if (var6 != null) {
					SequenceDefinition.SequenceDefinition_cachedModel.put(var6, (long)var3);
				}

				var4 = var6;
			}

			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3091() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field815.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
