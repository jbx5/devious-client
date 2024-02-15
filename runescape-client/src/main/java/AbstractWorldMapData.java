import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1803188160
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 454397952
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1295108297
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1351980941
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 490173871
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1123347927
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -576946011
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1139121135
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aj")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("af")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ax")
	byte[][][] field2623;
	@ObfuscatedName("an")
	byte[][][] field2626;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljk;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("am")
	boolean field2628;
	@ObfuscatedName("ad")
	boolean field2624;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2628 = false;
		this.field2624 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2145241583"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1976221798"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2628 && this.field2624;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1409434879"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2628 = true;
				this.field2624 = true;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1853690656"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2623 = null;
		this.field2626 = null;
		this.decorations = null;
		this.field2628 = false;
		this.field2624 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILuq;I)V",
		garbageValue = "1344412054"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5007(var1, var2, var3, var4);
			} else {
				this.method5008(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IILuq;II)V",
		garbageValue = "-822100848"
	)
	void method5007(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IILuq;II)V",
		garbageValue = "2113154650"
	)
	void method5008(int var1, int var2, Buffer var3, int var4) {
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
					this.field2623[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2626[var9][var1][var2] = (byte)(var11 & 3);
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
		descriptor = "(S)I",
		garbageValue = "16630"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-374771233"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	static void method5005() {
		Login.worldSelectOpen = false;
		Login.leftTitleSprite.drawAt(Login.xPadding, 0);
		WorldMapLabelSize.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
	}
}
