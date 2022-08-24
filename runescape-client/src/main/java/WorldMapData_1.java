import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hz")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("tk")
	@ObfuscatedGetter(intValue = 1242378975)
	static int field2759;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1062025967)
	@Export("chunkXLow")
	int chunkXLow;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -2000179473)
	@Export("chunkYLow")
	int chunkYLow;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1632822297)
	@Export("chunkX")
	int chunkX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -135385345)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-1419359032")
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2846.value) {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "42")
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2814 = new byte[super.planes][64][64];
		super.field2808 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class238.field2842.value) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-59")
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "255")
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1710796282")
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "21")
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = ((WorldMapData_1) (var1));
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([Lbd;II[I[IB)V", garbageValue = "55")
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;
			while (var5 < var6) {
				boolean var9 = true;
				int var10;
				int var11;
				int var12;
				do {
					--var6;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}
						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				var9 = true;
				do {
					++var5;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}
						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			} 
			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "1672722835")
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4210) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4201) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4211) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4209 < ByteArrayPool.field4212) {
			ByteArrayPool.field4216[++ByteArrayPool.field4209 - 1] = var0;
		} else if (AbstractByteArrayCopier.ByteArrayPool_arrays != null) {
			for (int var1 = 0; var1 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var1) {
				if (var0.length == UserComparator4.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < AbstractByteArrayCopier.ByteArrayPool_arrays[var1].length) {
					AbstractByteArrayCopier.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
					return;
				}
			}
		}
	}
}