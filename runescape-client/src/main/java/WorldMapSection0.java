import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static Bounds field2593;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1535711209
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1132794749
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 466239837
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1420998895
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -356735879
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2053219027
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -198325951
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2114111879
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -341538293
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -679910723
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1712794079
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2081464963
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 363584625
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1760815649
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljr;S)V",
		garbageValue = "30931"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1446024671"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1938918886"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2068201380"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Lmu;",
		garbageValue = "1554678257"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "16"
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
		descriptor = "(I)V",
		garbageValue = "328659164"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "31859955"
	)
	static final void method4978(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method5265(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method5265(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
