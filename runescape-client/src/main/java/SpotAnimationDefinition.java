import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("DBTableMasterIndex_cache")
	static EvictingDualNodeHashTable DBTableMasterIndex_cache;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -529110127
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 201436745
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 253020647
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ab")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1359832271
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1245789773
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -314997151
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 226238365
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1173342985
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1113058920"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "2121319025"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljn;",
		garbageValue = "1896803273"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3863();
		Model var3;
		if (this.sequence != -1 && var1 != -1) {
			var3 = class36.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var3 = var2.toSharedSpotAnimationModel(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var3.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var3.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var3.rotateY90Ccw();
				var3.rotateY90Ccw();
			}

			if (this.orientation == 270) {
				var3.rotateY90Ccw();
				var3.rotateY90Ccw();
				var3.rotateY90Ccw();
			}
		}

		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "6"
	)
	public final Model method3863() {
		Model var1 = (Model)DBTableMasterIndex_cache.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			DBTableMasterIndex_cache.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public static final void method3868() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
