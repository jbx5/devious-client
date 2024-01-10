import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class134 implements class125 {
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "28"
	)
	@Export("updateItemPile")
	static void updateItemPile(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2];
		if (var3 == null) {
			GrandExchangeOfferOwnWorldComparator.scene.removeGroundItemPile(var0, var1, var2);
		} else {
			long var4 = -99999999L;
			TileItem var6 = null;

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
				ItemComposition var8 = class341.ItemDefinition_get(var7.id);
				long var12 = (long)var8.price;
				if (var8.isStackable == 1) {
					var12 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity;
				}

				if (var12 > var4) {
					var4 = var12;
					var6 = var7;
				}
			}

			if (var6 == null) {
				GrandExchangeOfferOwnWorldComparator.scene.removeGroundItemPile(var0, var1, var2);
			} else {
				var3.addLast(var6);
				TileItem var14 = null;
				TileItem var9 = null;

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
					if (var6.id != var7.id) {
						if (var14 == null) {
							var14 = var7;
						}

						if (var7.id != var14.id && var9 == null) {
							var9 = var7;
						}
					}
				}

				long var10 = DynamicObject.calculateTag(var1, var2, 3, false, 0);
				GrandExchangeOfferOwnWorldComparator.scene.newGroundItemPile(var0, var1, var2, HttpRequestTask.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var14, var9);
			}
		}
	}
}
