import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fs")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1191619801)
	@Export("id")
	int id;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1269812789)
	@Export("archive")
	int archive;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1761170271)
	@Export("sequence")
	public int sequence = -1;

	@ObfuscatedName("j")
	@Export("recolorFrom")
	short[] recolorFrom;

	@ObfuscatedName("h")
	@Export("recolorTo")
	short[] recolorTo;

	@ObfuscatedName("a")
	@Export("retextureFrom")
	short[] retextureFrom;

	@ObfuscatedName("d")
	@Export("retextureTo")
	short[] retextureTo;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 815093525)
	@Export("widthScale")
	int widthScale = 128;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -324694165)
	@Export("heightScale")
	int heightScale = 128;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1783655265)
	@Export("orientation")
	int orientation = 0;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -323007489)
	@Export("ambient")
	int ambient = 0;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1550968009)
	@Export("contrast")
	int contrast = 0;

	SpotAnimationDefinition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1311637335")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "-9")
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
					this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lhd;", garbageValue = "1739734257")
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = ((Model) (SpotAnimationDefinition_cachedModels.get(((long) (this.id)))));
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var3 == null) {
				return null;
			}
			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}
			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}
			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, ((long) (this.id)));
		}
		Model var5;
		if (this.sequence != -1 && var1 != -1) {
			var5 = class14.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true);
		}
		if (this.widthScale != 128 || this.heightScale != 128) {
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}
		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var5.rotateY90Ccw();
			}
			if (this.orientation == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
			if (this.orientation == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}
		return var5;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IS)Z", garbageValue = "13232")
	public static boolean method3518(int var0) {
		return (var0 >> 30 & 1) != 0;
	}
}