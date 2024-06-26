import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1673746339
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -860148807
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1168172891
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 716391559
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -233451403
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("an")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -448594561
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIII)V",
		garbageValue = "464797774"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = class164.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var7.id != var8.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var8.id != var15.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = FileSystem.calculateTag(var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, class169.getTileHeight(var0, class376.method7084(var2), class376.method7084(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
