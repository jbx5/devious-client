import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1426005251
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1843285696
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1170083840
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2120216349
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1867099901
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1668026273
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 811288849
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -109294215
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1485676715
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ap")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ay")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("as")
	byte[][][] field3034;
	@ObfuscatedName("aj")
	byte[][][] field3035;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkt;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("au")
	boolean field3024;
	@ObfuscatedName("ai")
	boolean field3038;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3024 = false;
		this.field3038 = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "2115325709"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "780555008"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3024 && this.field3038;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "905694632"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3024 = true;
				this.field3038 = true;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1430776643"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3034 = null;
		this.field3035 = null;
		this.decorations = null;
		this.field3024 = false;
		this.field3038 = false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IILul;I)V",
		garbageValue = "744133359"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5622(var1, var2, var3, var4);
			} else {
				this.method5623(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IILul;II)V",
		garbageValue = "1523871519"
	)
	void method5622(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IILul;II)V",
		garbageValue = "1937265234"
	)
	void method5623(int var1, int var2, Buffer var3, int var4) {
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
					this.field3034[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3035[var9][var1][var2] = (byte)(var11 & 3);
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
		descriptor = "(B)I",
		garbageValue = "-66"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1500412713"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-91"
	)
	static final int method5648(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1780027636"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? UserComparator5.method2903(var0, 10, var1) : Integer.toString(var0);
	}
}
