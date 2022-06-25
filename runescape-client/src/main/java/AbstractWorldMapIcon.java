import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("im")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("coord2")
	public final Coord coord2;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("coord1")
	public final Coord coord1;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1729910963)
	@Export("screenX")
	int screenX;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -218016767)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(descriptor = "(Lkd;Lkd;)V")
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "781292504")
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Liz;", garbageValue = "1473728")
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1263012412")
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-34")
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1869827620")
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "75")
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "0")
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class432.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch (var3.horizontalAlignment.value) {
				case 0 :
					if (var1 < this.screenX || var1 >= var4 + this.screenX) {
						return false;
					}
					break;
				case 1 :
					if (var1 > this.screenX - var4 && var1 <= this.screenX) {
						break;
					}
					return false;
				case 2 :
					if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
						return false;
					}
			}
			switch (var3.verticalAlignment.value) {
				case 0 :
					if (var2 <= this.screenY - var5 || var2 > this.screenY) {
						return false;
					}
					break;
				case 1 :
					if (var2 < this.screenY || var2 >= var5 + this.screenY) {
						return false;
					}
					break;
				case 2 :
					if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
						return false;
					}
			}
			return true;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1782115036")
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
}