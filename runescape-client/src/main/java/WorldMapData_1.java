import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 235439019
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1698399857
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2059766783
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -988032613
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "2144176634"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3213.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1682284620"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3170 = new byte[super.planes][64][64];
		super.field3181 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class294.field3206.value) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1959867320"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-647153132"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1202352411"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Lii;",
		garbageValue = "-1614"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class411.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	static void method5808(int var0) {
		Client.oculusOrbState = var0;
	}
}
