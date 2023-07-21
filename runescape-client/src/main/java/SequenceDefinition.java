import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aw")
	static boolean field2262;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2142553653
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("at")
	public Map field2267;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 979739643
	)
	int field2268;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -308745293
	)
	int field2269;
	@ObfuscatedName("aa")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("au")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ae")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ab")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1098809649
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ao")
	int[] field2275;
	@ObfuscatedName("ac")
	boolean[] field2276;
	@ObfuscatedName("ak")
	public boolean field2277;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 939683273
	)
	public int field2258;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -790885573
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -571050705
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -840348597
	)
	public int field2281;
	@ObfuscatedName("bd")
	public boolean field2285;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -687711657
	)
	public int field2279;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -607267965
	)
	public int field2284;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1329734471
	)
	public int field2274;

	static {
		field2262 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2268 = 0;
		this.field2269 = 0;
		this.frameCount = -1;
		this.field2277 = false;
		this.field2258 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2281 = 99;
		this.field2285 = false;
		this.field2279 = -1;
		this.field2284 = -1;
		this.field2274 = 2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;S)V",
		garbageValue = "-22539"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1148727534"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2275 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2275[var4] = var1.readUnsignedByte();
			}

			this.field2275[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2277 = true;
		} else if (var2 == 5) {
			this.field2258 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2281 = var1.readUnsignedByte();
			this.field2285 = true;
		} else if (var2 == 9) {
			this.field2279 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2284 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2274 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2267 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2267.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2268 = var1.readUnsignedShort();
			this.field2269 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2276 = new boolean[256];

			for (var3 = 0; var3 < this.field2276.length; ++var3) {
				this.field2276[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2276[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2279 == -1) {
			if (this.field2275 == null && this.field2276 == null) {
				this.field2279 = 0;
			} else {
				this.field2279 = 2;
			}
		}

		if (this.field2284 == -1) {
			if (this.field2275 == null && this.field2276 == null) {
				this.field2284 = 0;
			} else {
				this.field2284 = 2;
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljo;II)Ljo;",
		garbageValue = "509430466"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class157.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class137 var3 = class181.method3567(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3073());
				var4.method4802(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljo;IIB)Ljo;",
		garbageValue = "-111"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class157.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class137 var4 = class181.method3567(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3073());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4802(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljo;II)Ljo;",
		garbageValue = "1735736185"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class157.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class137 var3 = class181.method3567(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3073());
				var4.method4802(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljo;ILig;II)Ljo;",
		garbageValue = "-1383318725"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2262 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4071(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class137 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4080();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2276 == null) {
					var5.method4802(var9, var2);
					return var5;
				}

				var8 = var9.field1609;
				var5.method4806(var8, var9, var2, this.field2276, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class157.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2275 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2275 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4807(var7, var2, this.field2275, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4080();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1609;
				}

				var5.method4806(var8, var9, var4, this.field2276, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class157.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4807(var10, var4, this.field2275, true);
			}

			if (var6 && var7 != null) {
				var5.method4807(var7, var2, this.field2275, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljo;ILig;IB)Ljo;",
		garbageValue = "6"
	)
	Model method4071(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class157.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class157.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2275);
				return var7;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljo;II)Ljo;",
		garbageValue = "-2020208153"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class157.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class157.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2102518176"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "791799028"
	)
	public int method4074() {
		return this.field2269 - this.field2268;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lfz;",
		garbageValue = "49"
	)
	class137 method4080() {
		return this.isCachedModelIdSet() ? class181.method3567(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "-1093606391"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < class335.WorldMapElement_cached.length && class335.WorldMapElement_cached[var0] != null ? class335.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}
