import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("cp")
public class class92 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqr;IIIIIII)V", garbageValue = "-1423465619")
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class433.method7492(var4 + 932731 + var2, 556238 + var3 + var5) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}
				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}
				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					AbstractUserComparator.Tiles_shapes[var1][var2][var3] = ((byte) ((var7 - 2) / 4));
					GrandExchangeOfferOwnWorldComparator.field473[var1][var2][var3] = ((byte) (var7 - 2 + var6 & 3));
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = ((byte) (var7 - 49));
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = ((byte) (var7 - 81));
				}
			} 
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}
				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}
				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			} 
		}
	}
}