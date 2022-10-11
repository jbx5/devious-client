import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1908361649
	)
	public static int field1841;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -220539481
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;S)V",
		garbageValue = "8196"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "1285334577"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "1112569904"
	)
	static class438 method3527(int var0) {
		class438 var1 = (class438)Client.DBTableIndex_cache.get((long)var0); // L: 12201
		if (var1 == null) { // L: 12202
			var1 = new class438(PcmPlayer.field308, class425.method7664(var0), TaskHandler.method3414(var0)); // L: 12203
			Client.DBTableIndex_cache.put(var1, (long)var0); // L: 12204
		}

		return var1; // L: 12206
	}
}
