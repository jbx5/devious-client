import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "44"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2873.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.readNullableLargeSmart(); // L: 19
			super.fileId = var1.readNullableLargeSmart(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1696330768"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2839 = new byte[super.planes][64][64]; // L: 28
		super.field2834 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class239.field2866.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 53
		}
	}
}
