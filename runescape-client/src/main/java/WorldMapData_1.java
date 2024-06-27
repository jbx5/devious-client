import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1161199065
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -517178829
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 271183347
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1038170723
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1951787656"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2714.value) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-32"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2677 = new byte[super.planes][64][64];
		super.field2678 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class261.field2705.value) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1728465445"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "576301002"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2123061810"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851018903"
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
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) {
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1119672011"
	)
	public static final synchronized long method4861() {
		long var0 = System.currentTimeMillis();
		if (var0 < class326.field3556) {
			class326.field3555 += class326.field3556 - var0;
		}

		class326.field3556 = var0;
		return var0 + class326.field3555;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILsq;Loz;B)V",
		garbageValue = "88"
	)
	static void method4885(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4472) {
			if (ArchiveDiskActionHandler.field4468 == 0) {
				class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class261.ArchiveDiskActionHandler_thread.setDaemon(true);
				class261.ArchiveDiskActionHandler_thread.start();
				class261.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4468 = 600;
			ArchiveDiskActionHandler.field4470 = false;
		}
	}
}
