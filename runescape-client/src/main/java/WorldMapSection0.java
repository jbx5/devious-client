import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -230258157
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1696378069
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 211210449
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1338112141
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1373249731
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1849574529
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -87045039
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2080190201
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1003967193
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1119776789
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -239228391
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -531148493
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -923098139
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -637108547
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "104966018"
	)
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "37"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1055724816"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1968685542"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lmr;",
		garbageValue = "119"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "706418314"
	)
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	@Export("postRead")
	void postRead() {
	}
}
