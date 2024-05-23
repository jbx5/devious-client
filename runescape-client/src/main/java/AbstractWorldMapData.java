import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -797749248
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -806590400
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1860604541
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1684796025
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -709164821
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1482629101
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -530060089
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1204501527
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aq")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ap")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ae")
	byte[][][] field3170;
	@ObfuscatedName("ax")
	byte[][][] field3181;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[[[Lle;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("au")
	boolean field3180;
	@ObfuscatedName("as")
	boolean field3184;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3180 = false;
		this.field3184 = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1682284620"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1738046824"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3180 && this.field3184;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "-1602949943"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3180 = true;
				this.field3184 = true;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1188298676"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3170 = null;
		this.field3181 = null;
		this.decorations = null;
		this.field3180 = false;
		this.field3184 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILua;B)V",
		garbageValue = "-13"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5910(var1, var2, var3, var4);
			} else {
				this.method5906(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILua;II)V",
		garbageValue = "-14863340"
	)
	void method5910(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILua;II)V",
		garbageValue = "-2105044676"
	)
	void method5906(int var1, int var2, Buffer var3, int var4) {
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
					this.field3170[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3181[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1993184746"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "77"
	)
	static void method5932(String var0, String var1, String var2) {
		ParamComposition.updateLoginIndex(7);
		WorldMapSection2.setLoginResponseString(var0, var1, var2);
	}
}
