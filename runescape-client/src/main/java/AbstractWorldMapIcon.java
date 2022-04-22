import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lks;")

	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lks;")

	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	331814097)

	@Export("screenX")
	int screenX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-247318993)

	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(descriptor = 
	"(Lks;Lks;)V")

	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"364835409")

	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Lho;", garbageValue = 
	"-32")

	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-915724910")

	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1982860019")

	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"-95")

	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1632005333")

	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"845547829")

	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = UserComparator7.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch (var3.horizontalAlignment.value) {
				case 0 :
					if ((var1 >= this.screenX) && (var1 < (var4 + this.screenX))) {
						break;
					}

					return false;
				case 1 :
					if ((var1 < (this.screenX - (var4 / 2))) || (var1 > ((var4 / 2) + this.screenX))) {
						return false;
					}
					break;
				case 2 :
					if ((var1 <= (this.screenX - var4)) || (var1 > this.screenX)) {
						return false;
					}}


			switch (var3.verticalAlignment.value) {
				case 0 :
					if ((var2 >= this.screenY) && (var2 < (var5 + this.screenY))) {
						break;
					}

					return false;
				case 1 :
					if ((var2 >= (this.screenY - (var5 / 2))) && (var2 <= ((var5 / 2) + this.screenY))) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"-1755965847")

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
	public static double method4415(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(((-var8) * var8) / 2.0) / Math.sqrt(6.283185307179586);
		return var6 / var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-151614308")

	static void method4429() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/io/File;ZB)Z", garbageValue = 
	"-95")

	static boolean method4405(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}
}