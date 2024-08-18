import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class378 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 34657635
	)
	static final int field4084;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1359370049
	)
	static final int field4070;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 568057545
	)
	static final int field4085;

	static {
		short var0 = 2048;
		field4084 = var0;
		var0 = 2048;
		field4070 = var0;
		Coord.method6531(field4084);
		Coord.method6531(field4070);
		var0 = 6400;
		field4085 = var0;
		Coord.method6512(field4085);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	public static int method7167(int var0) {
		return var0 * 128 + 64;
	}
}
