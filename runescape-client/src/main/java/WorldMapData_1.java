import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1189550107)

	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1085074515)

	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1863655397)

	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1631671287)

	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"1916863393")

	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2387.value) {
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
		if (var2 != class214.field2378.value) {
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-8")

	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"16777215")

	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2037619431")

	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"93025886")

	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = ((WorldMapData_1) (var1));
			if ((super.regionX == var2.regionX) && (var2.regionY == super.regionY)) {
				return (this.chunkX == var2.chunkX) && (this.chunkY == var2.chunkY);
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return ((super.regionX | (super.regionY << 8)) | (this.chunkX << 16)) | (this.chunkY << 24);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"([BIII)Ljava/lang/String;", garbageValue = 
	"-264358279")

	static String method4226(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < (var2 + var1); var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class346.field4136[var5 >>> 2]);
			if (var4 < (var2 - 1)) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class346.field4136[((var5 & 3) << 4) | (var6 >>> 4)]);
				if (var4 < (var2 - 2)) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class346.field4136[((var6 & 15) << 2) | (var7 >>> 6)]).append(class346.field4136[var7 & 63]);
				} else {
					var3.append(class346.field4136[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class346.field4136[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}
}