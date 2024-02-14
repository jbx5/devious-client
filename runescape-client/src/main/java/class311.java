import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class311 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3284;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3275;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3276;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3277;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3278;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3279;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3286;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3285;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3282;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3281;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3287;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3280;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		field3284 = new class311(4);
		field3275 = new class311(4);
		field3276 = new class311(6);
		field3277 = new class311(7);
		field3278 = new class311(2);
		field3279 = new class311(11);
		field3286 = new class311(5);
		field3285 = new class311(14);
		field3282 = new class311(20);
		field3281 = new class311(14);
		field3287 = new class311(7);
		field3280 = new class311(5);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class311(int var1) {
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "854314220"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4398 != 0 && var3 > AbstractArchive.field4398) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4398 == 0 || var4 <= AbstractArchive.field4398)) {
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
