import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ir")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -2036174811)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1537995989)
	@Export("planes")
	int planes;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -300775863)
	@Export("regionStartX")
	int regionStartX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1381396249)
	@Export("regionStartY")
	int regionStartY;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1589676553)
	@Export("regionEndX")
	int regionEndX;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1377237821)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lhg;I)V", garbageValue = "1585435431")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-929111713")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-47549823")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "-561571792")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64) };
			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(III)Lkd;", garbageValue = "531454030")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-27")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1018712398")
	@Export("postRead")
	void postRead() {
	}
}