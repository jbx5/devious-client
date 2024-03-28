import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILix;I)Z",
		garbageValue = "173564567"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464238055"
	)
	static void method1181() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		AccessFile.Tiles_overlays = new short[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field1028 = new byte[4][104][104];
		class168.field1833 = new int[4][105][105];
		TextureProvider.Tiles_underlays2 = new byte[4][105][105];
		class306.field3195 = new int[105][105];
		World.Tiles_hue = new int[104];
		WorldMapLabelSize.Tiles_saturation = new int[104];
		class539.Tiles_lightness = new int[104];
		Tiles.Tiles_hueMultiplier = new int[104];
		class384.field4473 = new int[104];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "1"
	)
	public static void method1185(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1991559965"
	)
	static final void method1186(int var0) {
		if (class243.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class243.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
