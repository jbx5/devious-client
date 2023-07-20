import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 987064541
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1577260275
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1755441209
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("av")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ap")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1007984865
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 629405947
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1478414419
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1660525129
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 808325515
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "26"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-797026654"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Ljo;",
		garbageValue = "-2055096855"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3778();
		Model var3;
		if (this.sequence != -1 && var1 != -1) {
			var3 = class135.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "1754203875"
	)
	public final Model method3778() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(class53.SpotAnimationDefinition_modelArchive, this.archive, 0);
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
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}
}
