import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class162 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lql;")

	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("du")
	static boolean field1768;
	@ObfuscatedName("g")
	public String field1771;
	@ObfuscatedName("l")
	public float[] field1769;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1773240959)

	public int field1770;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-2056552437)

	public int field1776;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	521608745)

	public int field1772;

	@ObfuscatedSignature(descriptor = 
	"Lef;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lef;)V")

	class162(class155 var1) {
		this.this$0 = var1;
		this.field1769 = new float[4];
		this.field1770 = 1;
		this.field1776 = 1;
		this.field1772 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIII)I", garbageValue = 
	"137549061")

	public static int method3273(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? (7 - var0) - (var3 - 1) : (7 - var1) - (var4 - 1);
		}
	}

	@ObfuscatedName("o")
	public static boolean method3274(long var0) {
		return (0L != var0) && (!Language.method6131(var0));
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-1444126157")

	public static boolean method3276(int var0) {
		return ((var0 >> 20) & 1) != 0;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"-108")

	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class160.Client_plane][var0][var1];
		if (var2 == null) {
			FriendSystem.scene.removeGroundItemPile(class160.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
				ItemComposition var7 = class67.ItemDefinition_get(var6.id);
				long var11 = ((long) (var7.price));
				if (var7.isStackable == 1) {
					var11 *= ((long) (var6.quantity + 1));
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				FriendSystem.scene.removeGroundItemPile(class160.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if ((var13.id != var6.id) && (var8 == null)) {
							var8 = var6;
						}
					}
				}

				long var9 = MilliClock.calculateTag(var0, var1, 3, false, 0);
				FriendSystem.scene.newGroundItemPile(class160.Client_plane, var0, var1, Archive.getTileHeight((var0 * 128) + 64, (var1 * 128) + 64, class160.Client_plane), var5, var9, var13, var8);
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;IIB)V", garbageValue = 
	"45")

	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + ((var1 - var0.width) / 2);
		} else if (var0.xAlignment == 2) {
			var0.x = (var1 - var0.width) - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = (var0.rawX * var1) >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = ((var1 - var0.width) / 2) + ((var0.rawX * var1) >> 14);
		} else {
			var0.x = (var1 - var0.width) - ((var0.rawX * var1) >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = ((var2 - var0.height) / 2) + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = (var2 - var0.height) - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = (var2 * var0.rawY) >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = ((var2 - var0.height) / 2) + ((var2 * var0.rawY) >> 14);
		} else {
			var0.y = (var2 - var0.height) - ((var2 * var0.rawY) >> 14);
		}

	}
}