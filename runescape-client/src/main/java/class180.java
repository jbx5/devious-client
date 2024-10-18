import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class180 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static IndexedSprite field1897;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -1487645105
	)
	static int field1896;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lum;III)I",
		garbageValue = "1388728920"
	)
	static int method3850(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lct;",
		garbageValue = "-79"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}
}
