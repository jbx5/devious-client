import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field1068;
	@ObfuscatedName("ae")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ao")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96469770"
	)
	public static void method2269() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2139499432"
	)
	static final void method2271(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			HealthBar.worldToScreen((Client.hintArrowX - UrlRequester.baseX * 64 << 7) + Client.hintArrowSubX * 4096, Client.hintArrowSubY * 64 + (Client.hintArrowY - class47.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				ArchiveLoader.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	}
}
