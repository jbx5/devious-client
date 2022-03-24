import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class113 {
	@ObfuscatedName("u")
	static int[] field1387;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-57602381)

	int field1384;
	@ObfuscatedName("o")
	float field1385;
	@ObfuscatedName("h")
	float field1386;
	@ObfuscatedName("g")
	float field1390;
	@ObfuscatedName("l")
	float field1388;
	@ObfuscatedName("n")
	float field1389;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Ldh;")

	class113 field1392;

	class113() {
		this.field1386 = Float.MAX_VALUE;
		this.field1390 = Float.MAX_VALUE;
		this.field1388 = Float.MAX_VALUE;
		this.field1389 = Float.MAX_VALUE;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"938981955")

	void method2632(Buffer var1, int var2) {
		this.field1384 = var1.readShort();
		this.field1385 = var1.method7965();
		this.field1386 = var1.method7965();
		this.field1390 = var1.method7965();
		this.field1388 = var1.method7965();
		this.field1389 = var1.method7965();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)Ljava/lang/String;", garbageValue = 
	"90")

	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if ((var6 >= 128) && (var6 < 160)) {
					char var7 = class345.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = ((char) (var6));
			}
		}

		return new String(var3, 0, var4);
	}
}