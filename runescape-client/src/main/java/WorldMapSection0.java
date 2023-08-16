import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1792280127
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -746964345
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -109610817
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1959218127
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1662310837
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1890782763
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -896878445
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1299825047
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1410904803
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1503844023
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1810659993
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -699661283
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -993644741
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1961552345
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1295172600"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lls;",
		garbageValue = "14"
	)
	public static class295[] method5424() {
		return new class295[]{class295.field3214, class295.field3207, class295.field3209, class295.field3210, class295.field3218, class295.field3212, class295.field3208, class295.field3215, class295.field3213, class295.field3216, class295.field3217, class295.field3211};
	}
}
