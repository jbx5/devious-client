import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public enum class117 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1451(0, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1444(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1445(2, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1443(3, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1446(4, 4);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1577250489
	)
	final int field1448;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 887433533
	)
	final int field1449;

	class117(int var3, int var4) {
		this.field1448 = var3; // L: 143
		this.field1449 = var4; // L: 144
	} // L: 145

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1449; // L: 148
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "251993992"
	)
	public static void method2859(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 44
			try {
				Buffer var1 = new Buffer(4); // L: 46
				var1.writeByte(var0 ? 2 : 3); // L: 47
				var1.writeMedium(0); // L: 48
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 49
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 53
				} catch (Exception var3) { // L: 55
				}

				++NetCache.NetCache_ioExceptions; // L: 56
				NetCache.NetCache_socket = null; // L: 57
			}

		}
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Ls;",
		garbageValue = "0"
	)
	public static class6[] method2863() {
		return new class6[]{class6.field19}; // L: 12
	}
}
