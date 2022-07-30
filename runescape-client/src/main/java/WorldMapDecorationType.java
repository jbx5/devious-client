import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ke")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3541(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3549(1, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3540(2, 0),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3559(3, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3542(9, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3538(4, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3544(5, 1),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3545(6, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3543(7, 1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3547(8, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3548(12, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3561(13, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3550(14, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3551(15, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3552(16, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3553(17, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3554(18, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3555(19, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3556(20, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3557(21, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3558(10, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3546(11, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lke;")
	field3560(22, 3);
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 805969907)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "0")
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1930760540")
	public static int method5755(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "([BB)[B", garbageValue = "28")
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4016 != 0 && var3 > AbstractArchive.field4016) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4016 == 0 || var4 <= AbstractArchive.field4016)) {
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