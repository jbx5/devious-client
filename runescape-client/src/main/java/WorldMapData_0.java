import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;

	WorldMapData_0() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;S)V", garbageValue = 
	"-2625")

	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2383.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort();
			super.regionYLow = var1.readUnsignedShort();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"169222990")

	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2334 = new byte[super.planes][64][64];
		super.field2342 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class214.field2380.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if ((var3 == super.regionX) && (var4 == super.regionY)) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public int hashCode() {
		return super.regionX | (super.regionY << 8);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = ((WorldMapData_0) (var1));
			return (var2.regionX == super.regionX) && (super.regionY == var2.regionY);
		}
	}
}