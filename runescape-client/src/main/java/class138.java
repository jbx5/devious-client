import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class138 extends class129 {
	@ObfuscatedName("c")
	String field1619;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class138(class132 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1619 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.name = this.field1619; // L: 237
	} // L: 238

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "2099576217"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 452
		int var2 = var1.readUnsignedByte(); // L: 453
		int var3 = var1.readInt(); // L: 454
		if (var3 < 0 || AbstractArchive.field4054 != 0 && var3 > AbstractArchive.field4054) { // L: 455
			throw new RuntimeException(); // L: 456
		} else if (var2 == 0) { // L: 458
			byte[] var6 = new byte[var3]; // L: 459
			var1.readBytes(var6, 0, var3); // L: 460
			return var6; // L: 461
		} else {
			int var4 = var1.readInt(); // L: 464
			if (var4 >= 0 && (AbstractArchive.field4054 == 0 || var4 <= AbstractArchive.field4054)) { // L: 465
				byte[] var5 = new byte[var4]; // L: 468
				if (var2 == 1) { // L: 469
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 470
				}

				return var5; // L: 471
			} else {
				throw new RuntimeException(); // L: 466
			}
		}
	}
}
