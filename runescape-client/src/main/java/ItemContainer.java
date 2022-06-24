import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bd")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("itemContainers")
	static NodeHashTable itemContainers;

	@ObfuscatedName("v")
	@Export("ids")
	int[] ids;

	@ObfuscatedName("q")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{ -1 };
		this.quantities = new int[]{ 0 };
	}
}