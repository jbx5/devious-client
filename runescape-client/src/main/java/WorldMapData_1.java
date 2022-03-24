import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("en")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1652459631)

	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	2125666913)

	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1369214467)

	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1403244579)

	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-1584785156")

	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2826.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort();
			super.regionYLow = var1.readUnsignedShort();
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"1809174469")

	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2793 = new byte[super.planes][64][64];
		super.field2792 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class239.field2819.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if ((((var3 == super.regionX) && (var4 == super.regionY)) && (var5 == this.chunkX)) && (var6 == this.chunkY)) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + (this.chunkX * 8), var8 + (this.chunkY * 8), var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"31")

	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"1")

	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"606761017")

	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-111904746")

	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = ((WorldMapData_1) (var1));
			if ((super.regionX == var2.regionX) && (super.regionY == var2.regionY)) {
				return (var2.chunkX == this.chunkX) && (this.chunkY == var2.chunkY);
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return ((super.regionX | (super.regionY << 8)) | (this.chunkX << 16)) | (this.chunkY << 24);
	}
}