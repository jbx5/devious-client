import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1273141056
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2078342592
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1373419273
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 812086533
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1206718537
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -674498187
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -659215
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1601592819
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ah")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ax")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aa")
	byte[][][] field2981;
	@ObfuscatedName("au")
	byte[][][] field2992;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkk;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ab")
	boolean field2994;
	@ObfuscatedName("ad")
	boolean field2995;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2994 = false;
		this.field2995 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "81"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2994 && this.field2995;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1020767316"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2994 = true;
				this.field2995 = true;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2981 = null;
		this.field2992 = null;
		this.decorations = null;
		this.field2994 = false;
		this.field2995 = false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILty;B)V",
		garbageValue = "77"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5476(var1, var2, var3, var4);
			} else {
				this.method5477(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILty;IB)V",
		garbageValue = "12"
	)
	void method5476(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILty;IB)V",
		garbageValue = "-51"
	)
	void method5477(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2981[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2992[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1822909116"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903586613"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}
}
