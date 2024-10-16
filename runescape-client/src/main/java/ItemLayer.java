import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1361011875
	)
	static int field2480;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1971597997
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 83642561
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1288618688
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -7408577255103144717L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1986226129
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "193155358"
	)
	public static boolean method4678() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class333.field3623.isEmpty()) {
			SongTask var2 = (SongTask)class333.field3623.get(0);
			if (var2 == null) {
				class333.field3623.remove(0);
			} else if (var2.vmethod8740()) {
				if (var2.method8721()) {
					System.out.println("Error in midimanager.service: " + var2.method8723());
					var0 = true;
				} else {
					if (var2.method8724() != null) {
						class333.field3623.add(1, var2.method8724());
					}

					var1 = var2.method8732();
				}

				class333.field3623.remove(0);
			} else {
				var1 = var2.method8732();
			}
		}

		if (var0) {
			class333.field3623.clear();
			Actor.method2730();
		}

		return var1;
	}
}
