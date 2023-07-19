import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1659239405
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmr;Lmr;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1720811535"
	)
	public static int method5646(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)Lmt;",
		garbageValue = "84"
	)
	static Widget method5647(Widget var0) {
		int var1 = ClientPacket.method5723(UserComparator8.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = VarbitComposition.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
