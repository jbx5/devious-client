import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lko;")

	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lko;")

	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	26016061)

	@Export("screenX")
	int screenX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1132630309)

	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(descriptor = 
	"(Lko;Lko;)V")

	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2078584239")

	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Liw;", garbageValue = 
	"-2105037058")

	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"388705804")

	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-54")

	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"-1964398833")

	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1239297952")

	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"787430314")

	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class19.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch (var3.horizontalAlignment.value) {
				case 0 :
					if ((var1 > (this.screenX - var4)) && (var1 <= this.screenX)) {
						break;
					}

					return false;
				case 1 :
					if ((var1 < (this.screenX - (var4 / 2))) || (var1 > ((var4 / 2) + this.screenX))) {
						return false;
					}
					break;
				case 2 :
					if ((var1 < this.screenX) || (var1 >= (var4 + this.screenX))) {
						return false;
					}}


			switch (var3.verticalAlignment.value) {
				case 0 :
					if ((var2 >= (this.screenY - (var5 / 2))) && (var2 <= ((var5 / 2) + this.screenY))) {
						break;
					}

					return false;
				case 1 :
					if ((var2 >= this.screenY) && (var2 < (var5 + this.screenY))) {
						break;
					}

					return false;
				case 2 :
					if ((var2 <= (this.screenY - var5)) || (var2 > this.screenY)) {
						return false;
					}}


			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"1182827308")

	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if ((var1 >= (this.screenX - (var3.width / 2))) && (var1 <= ((var3.width / 2) + this.screenX))) {
			return (var2 >= this.screenY) && (var2 <= (var3.height + this.screenY));
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Ldo;", garbageValue = 
	"336008502")

	static class119[] method5059() {
		return new class119[]{ class119.field1457, class119.field1454, class119.field1455, class119.field1456, class119.field1471, class119.field1458, class119.field1459, class119.field1453, class119.field1465, class119.field1468, class119.field1463, class119.field1464, class119.field1462, class119.field1466, class119.field1467, class119.field1460, class119.field1469 };
	}
}