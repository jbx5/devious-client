import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gz")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("y")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lgv;")
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(descriptor = "(Llc;Llc;IZ)V")
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);
		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
			for (Skeleton var12 = ((Skeleton) (var5.last())); var12 != null; var12 = ((Skeleton) (var5.previous()))) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0);
				}
				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}
			this.frames[var7[var8]] = new Animation(var9, var10);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-46")
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;", garbageValue = "1978849198")
	public static String method4310(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();
		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class342.field4169[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class342.field4169[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class342.field4169[(var6 & 15) << 2 | var7 >>> 6]).append(class342.field4169[var7 & 63]);
				} else {
					var3.append(class342.field4169[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class342.field4169[(var5 & 3) << 4]).append("==");
			}
		}
		return var3.toString();
	}

	@ObfuscatedName("q")
	static final void method4305(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}
	}
}