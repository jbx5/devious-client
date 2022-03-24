import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public enum class123 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1505(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1494(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1495(2, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1496(3, 3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1497(4, 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1498(5, 5),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1493(6, 6),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1500(7, 7),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	field1501(8, 8);

	@ObfuscatedName("hi")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1756049989)

	final int field1503;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1875451971)

	final int field1499;

	class123(int var3, int var4) {
		this.field1503 = var3;
		this.field1499 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1499;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(CI)B", garbageValue = 
	"-1526513264")

	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (((var0 > 0) && (var0 < 128)) || ((var0 >= 160) && (var0 <= 255))) {
			var1 = ((byte) (var0));
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}}