import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("by")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1172052861
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -159750307
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2074398649
	)
	int field1347;

	TileItem() {
		this.field1347 = 31;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2123957786"
	)
	void method2671(int var1) {
		this.field1347 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class125.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-83"
	)
	boolean method2672(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1347 & 1 << var1) != 0;
		} else {
			return true;
		}
	}
}
