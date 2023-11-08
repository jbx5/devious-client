import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ah")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ar")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}
}
