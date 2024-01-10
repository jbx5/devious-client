import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2008618263
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1779165333
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1698733663
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1241087257
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2054073063
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1687785517
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2054791723
	)
	int field2500;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1182669067
	)
	int field2501;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 73689317
	)
	int field2502;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1611301059
	)
	int field2499;

	WorldMapSection2() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljr;S)V",
		garbageValue = "30931"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2500) {
			var1.regionLowX = this.field2500;
		}

		if (var1.regionHighX < this.field2502) {
			var1.regionHighX = this.field2502;
		}

		if (var1.regionLowY > this.field2501) {
			var1.regionLowY = this.field2501;
		}

		if (var1.regionHighY < this.field2499) {
			var1.regionHighY = this.field2499;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1446024671"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field2500 && var1 >> 6 <= this.field2502 && var2 >> 6 >= this.field2501 && var2 >> 6 <= this.field2499;
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
			int[] var4 = new int[]{this.field2500 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2501 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field2500 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2501 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "16"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2500 = var1.readUnsignedShort();
		this.field2501 = var1.readUnsignedShort();
		this.field2502 = var1.readUnsignedShort();
		this.field2499 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3564"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;Ltb;I)Ltb;",
		garbageValue = "1401945175"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = ItemContainer.method2347(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}
}
