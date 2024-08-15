import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2051699771
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -802576077
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1092564535
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -624922437
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1035647709
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -260647645
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1421552299"
	)
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1107005253"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "63"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lnv;",
		garbageValue = "-554690101"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-597206269"
	)
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1668939625"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "525676400"
	)
	static void method5973(int var0) {
		SequenceDefinition var1 = class182.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class142 var4 = WidgetDefinition.method6556(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3288() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field795.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
