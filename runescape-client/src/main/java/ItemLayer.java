import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1738797291
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1428347469
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1795281107
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8933060122100064223L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1853806987
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "1856605907"
	)
	public static void method4586(AbstractArchive var0) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "-439952169"
	)
	public static String method4585(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}
}
