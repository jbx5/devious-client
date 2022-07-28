import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gg")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1388843001)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;

	@ObfuscatedName("ao")
	static String field2446;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 441859475)
	@Export("x")
	int x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1924986293)
	@Export("y")
	int y;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1485857077)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1767120472")
	static int method4303() {
		return Login.field930.length + Login.field907.length;
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-933849045")
	static void method4304() {
		class260.clientPreferences.method2319(Client.field504);
	}
}