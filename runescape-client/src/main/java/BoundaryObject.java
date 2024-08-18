import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -28800837
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1972820805
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 762408535
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 807272083
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 391570297
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5494974717742791213L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 974700247
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-4"
	)
	public static int method4470(int var0) {
		return WorldMapLabelSize.method5531(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "264973536"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4509 != 0 && var3 > AbstractArchive.field4509) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4509 == 0 || var4 <= AbstractArchive.field4509)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
