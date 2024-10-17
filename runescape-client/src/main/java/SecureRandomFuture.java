import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ap")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aw")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1341038202"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-505225048"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return class326.method6528();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-1234362545"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhv;",
		garbageValue = "1"
	)
	public static FloorUnderlayDefinition method2433(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;III)Lqi;",
		garbageValue = "194974548"
	)
	public static Font method2435(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!class53.method1110(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, SpriteBufferProperties.SpriteBuffer_xOffsets, class497.SpriteBuffer_yOffsets, class7.SpriteBuffer_spriteWidths, SpriteBufferProperties.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, class280.SpriteBuffer_pixels);
				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				class497.SpriteBuffer_yOffsets = null;
				class7.SpriteBuffer_spriteWidths = null;
				SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
				SpriteBufferProperties.SpriteBuffer_spritePalette = null;
				class280.SpriteBuffer_pixels = null;
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-1292187209"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
