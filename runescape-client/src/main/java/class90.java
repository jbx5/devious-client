import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public enum class90 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1107(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1105(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1100(2, 7),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1101(3, 8),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1098(4, 9);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1696853149
	)
	final int field1103;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1877154107
	)
	final int field1099;

	class90(int var3, int var4) {
		this.field1103 = var3;
		this.field1099 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1099;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "529573649"
	)
	public static int method2322(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "-1371111861"
	)
	static class138 method2315(int var0) {
		class138 var1 = (class138)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = class343.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = UrlRequest.SequenceDefinition_skeletonsArchive;
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
					if (class328.field3567 == null) {
						class154.field1730 = Runtime.getRuntime().availableProcessors();
						class328.field3567 = new ThreadPoolExecutor(0, class154.field1730, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class154.field1730 * 100 + 100), new class188());
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
