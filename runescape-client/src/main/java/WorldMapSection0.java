import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	344231223)

	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1035393563)

	@Export("newZ")
	int newZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1997888961)

	@Export("oldX")
	int oldX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	1272815325)

	@Export("oldY")
	int oldY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	656734223)

	@Export("newX")
	int newX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	2030926423)

	@Export("newY")
	int newY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	854326889)

	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-175837381)

	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	276851)

	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1589908823)

	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-534968503)

	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1567190027)

	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1196152405)

	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-2098383461)

	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lhw;I)V", garbageValue = 
	"-1521793701")

	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Z", garbageValue = 
	"-2091891709")

	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if ((var1 >= this.oldZ) && (var1 < (this.newZ + this.oldZ))) {
			return (((var2 >= ((this.oldX << 6) + (this.oldChunkXLow << 3))) && (var2 <= (((this.oldX << 6) + (this.oldChunkXHigh << 3)) + 7))) && (var3 >= ((this.oldY << 6) + (this.oldChunkYLow << 3)))) && (var3 <= (((this.oldY << 6) + (this.oldChunkYHigh << 3)) + 7));
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
		return (((var1 >= ((this.newX << 6) + (this.newChunkXLow << 3))) && (var1 <= (((this.newX << 6) + (this.newChunkXHigh << 3)) + 7))) && (var2 >= ((this.newY << 6) + (this.newChunkYLow << 3)))) && (var2 <= (((this.newY << 6) + (this.newChunkYHigh << 3)) + 7));
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
			int[] var4 = new int[]{ (var2 + ((this.newX * 64) - (this.oldX * 64))) + ((this.newChunkXLow * 8) - (this.oldChunkXLow * 8)), (var3 + ((this.newY * 64) - (this.oldY * 64))) + ((this.newChunkYLow * 8) - (this.oldChunkYLow * 8)) };
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
			int var3 = (((this.oldX * 64) - (this.newX * 64)) + ((this.oldChunkXLow * 8) - (this.newChunkXLow * 8))) + var1;
			int var4 = (var2 + ((this.oldY * 64) - (this.newY * 64))) + ((this.oldChunkYLow * 8) - (this.newChunkYLow * 8));
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"119")

	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1570988725")

	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1704295952")

	static final void method4940(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (((float) (var0)) / 200.0F) + 0.5F;
		class175.method3439(((double) (var1)));
	}
}