import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("jz")
public class class263 {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(intValue = 618564155)
	static int field3029;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3022 = new class263(5);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3023 = new class263(15);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3021 = new class263(5);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3025 = new class263(6);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3024 = new class263(2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3028 = new class263(4);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3020 = new class263(14);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3026 = new class263(3);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3027 = new class263(4);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ljz;")
	public static final class263 field3019 = new class263(7);

	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "5")
	class263(int var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1634179589")
	static int method5194(int var0, int var1) {
		long var2 = ((long) ((var0 << 16) + var1));
		return ClanChannel.NetCache_currentResponse != null && ClanChannel.NetCache_currentResponse.key == var2 ? WorldMapSection2.NetCache_responseArchiveBuffer.offset * 99 / (WorldMapSection2.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2040542732")
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}
		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}
		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}
		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}
		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}
		return var0 + var1;
	}
}