import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1861509568
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1709715456
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1390819561
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1450012245
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 292819307
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 110739939
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1906254581
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -512944657
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aj")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("as")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aw")
	byte[][][] field3158;
	@ObfuscatedName("af")
	byte[][][] field3159;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[[Llw;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ah")
	boolean field3148;
	@ObfuscatedName("ag")
	boolean field3152;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3148 = false;
		this.field3152 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-2033952891"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3148 && this.field3152;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lob;I)V",
		garbageValue = "-47126832"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3148 = true;
				this.field3152 = true;
			}

		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3158 = null;
		this.field3159 = null;
		this.decorations = null;
		this.field3148 = false;
		this.field3152 = false;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IILvg;B)V",
		garbageValue = "-30"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5921(var1, var2, var3, var4);
			} else {
				this.method5924(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IILvg;II)V",
		garbageValue = "362773391"
	)
	void method5921(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IILvg;II)V",
		garbageValue = "-448005744"
	)
	void method5924(int var1, int var2, Buffer var3, int var4) {
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
					this.field3158[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3159[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1383345326"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2086948085"
	)
	static void method5949() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				ScriptFrame.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				ScriptFrame.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}
}
