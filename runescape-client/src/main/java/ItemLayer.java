import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ga")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(descriptor = "Lqb;")
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1374473349)
	@Export("z")
	int z;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1358614507)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1685727285)
	@Export("y")
	int y;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("first")
	Renderable first;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("second")
	Renderable second;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("third")
	Renderable third;

	@ObfuscatedName("z")
	@ObfuscatedGetter(longValue = 941116361045476339L)
	@Export("tag")
	long tag;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 376334293)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1286813343")
	public static int method3911(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}
		return var2;
	}
}