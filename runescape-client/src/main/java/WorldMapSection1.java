import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("w")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	337700621)

	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-871255259)

	@Export("planes")
	int planes;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	380425473)

	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-925378869)

	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1275046463)

	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-899633607)

	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lhw;I)V", garbageValue = 
	"-1521793701")

	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Z", garbageValue = 
	"-2091891709")

	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if ((var1 >= this.minPlane) && (var1 < (this.minPlane + this.planes))) {
			return ((var2 >> 6) == this.regionStartX) && ((var3 >> 6) == this.regionStartY);
		} else {
			return false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"-59")

	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return ((var1 >> 6) == this.regionEndX) && ((var2 >> 6) == this.regionEndY);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIII)[I", garbageValue = 
	"-604533765")

	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ var2 + ((this.regionEndX * 64) - (this.regionStartX * 64)), var3 + ((this.regionEndY * 64) - (this.regionStartY * 64)) };
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(III)Lko;", garbageValue = 
	"-41254697")

	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = ((this.regionStartX * 64) - (this.regionEndX * 64)) + var1;
			int var4 = var2 + ((this.regionStartY * 64) - (this.regionEndY * 64));
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"119")

	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"16")

	@Export("postRead")
	void postRead() {
	}
}