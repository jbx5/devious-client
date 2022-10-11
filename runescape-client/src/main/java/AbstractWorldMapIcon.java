import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("h")
	public static boolean field2886;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1057912125
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -67686915
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "922846736"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lik;",
		garbageValue = "-114"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1340019060"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2085066872"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "71754135"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class139.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 54
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 49
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 61
					return false;
				}
				break;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 71
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "673345187"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	static void method5183() {
		Client.menuOptionsCount = 0; // L: 8121
		Client.isMenuOpen = false; // L: 8122
	} // L: 8123
}
