import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ho")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 944761331)
	@Export("chunkXLow")
	int chunkXLow;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -2108946565)
	@Export("chunkYLow")
	int chunkYLow;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1996140337)
	@Export("chunkX")
	int chunkX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -427207979)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "122")
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2840.value) {
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-2593161")
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2796 = new byte[super.planes][64][64];
		super.field2795 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class238.field2836.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "906993418")
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1946876923")
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "-14250")
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-74")
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = ((WorldMapData_1) (var1));
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[Lcc;", garbageValue = "-217216556")
	static class82[] method4867() {
		return new class82[]{ class82.field1073, class82.field1067, class82.field1069, class82.field1066, class82.field1068 };
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2054852963")
	static void method4872(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(descriptor = "(Lkb;I)V", garbageValue = "-1987300687")
	static final void method4874(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field535 == -1) {
				Client.field535 = var0.spriteId2;
				Client.field763 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field535;
			} else {
				var0.spriteId2 = Client.field763;
			}
		} else if (var1 == 325) {
			if (Client.field535 == -1) {
				Client.field535 = var0.spriteId2;
				Client.field763 = var0.spriteId;
			}
			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field763;
			} else {
				var0.spriteId2 = Client.field535;
			}
		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}