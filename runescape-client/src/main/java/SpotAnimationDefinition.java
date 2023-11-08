import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field2007;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1008653175
	)
	@Export("id")
	int id;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1629473129
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -92053015
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ac")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("al")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("az")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ap")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1335565971
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 214243153
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1513265209
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1824679643
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1346787261
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-1590582359"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "-22"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lka;",
		garbageValue = "-10"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3766();
		Model var3;
		if (this.sequence != -1 && var1 != -1) {
			var3 = DynamicObject.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "115"
	)
	public final Model method3766() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
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
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "43"
	)
	public static final synchronized long method3775() {
		long var0 = System.currentTimeMillis();
		if (var0 < class312.field3394) {
			class312.field3395 += class312.field3394 - var0;
		}

		class312.field3394 = var0;
		return class312.field3395 + var0;
	}
}
