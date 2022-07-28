import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ir")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("d")
	public static short[] field2859;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("coord2")
	public final Coord coord2;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("coord1")
	public final Coord coord1;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1984485843)
	@Export("screenX")
	int screenX;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1274844871)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(descriptor = "(Lkp;Lkp;)V")
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2045439656")
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Liy;", garbageValue = "1")
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2147415720")
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "740963101")
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1902929704")
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "32")
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "-34")
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = TileItem.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch (var3.horizontalAlignment.value) {
				case 0 :
					if (var1 >= this.screenX && var1 < var4 + this.screenX) {
						break;
					}
					return false;
				case 1 :
					if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
						break;
					}
					return false;
				case 2 :
					if (var1 <= this.screenX - var4 || var1 > this.screenX) {
						return false;
					}
			}
			switch (var3.verticalAlignment.value) {
				case 0 :
					if (var2 > this.screenY - var5 && var2 <= this.screenY) {
						break;
					}
					return false;
				case 1 :
					if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
						break;
					}
					return false;
				case 2 :
					if (var2 < this.screenY || var2 >= var5 + this.screenY) {
						return false;
					}
			}
			return true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "686248728")
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lpy;", garbageValue = "2052552812")
	public static class433 method5044(int var0) {
		int var1 = class431.field4660[var0];
		if (var1 == 1) {
			return class433.field4671;
		} else if (var1 == 2) {
			return class433.field4676;
		} else {
			return var1 == 3 ? class433.field4668 : null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1174105091")
	static void method5045() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1057423277")
	static boolean method5047() {
		return class260.clientPreferences.method2333() >= Client.field504;
	}
}