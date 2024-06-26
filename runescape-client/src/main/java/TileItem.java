import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2050678185
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 203441303
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1382347441
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -104143091
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 587627049
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("an")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1829546599
	)
	@Export("flag")
	int flag;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1837399962"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-94"
	)
	boolean method2799(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class164.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfd;B)V",
		garbageValue = "2"
	)
	static void method2795(float var0, float var1, float var2, float var3, class135 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1586 = var7 - var6 - var8;
		var4.field1585 = var8 + var8 + var8;
		var4.field1590 = var5 + var5 + var5;
		var4.field1581 = var0;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1609375983"
	)
	static boolean method2805() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
