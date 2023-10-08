import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ac")
	static boolean field2324;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2316;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -171195263
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aa")
	public Map field2322;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1703695491
	)
	int field2323;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1591528455
	)
	int field2335;
	@ObfuscatedName("as")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("aj")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("an")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("au")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1144530421
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ae")
	int[] field2330;
	@ObfuscatedName("aw")
	boolean[] field2331;
	@ObfuscatedName("aq")
	public boolean field2338;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -298932043
	)
	public int field2333;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1468148285
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -873805365
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1821071213
	)
	public int field2341;
	@ObfuscatedName("bn")
	public boolean field2319;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 888504245
	)
	public int field2327;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 234643047
	)
	public int field2339;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1115829053
	)
	public int field2340;

	static {
		field2324 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2323 = 0;
		this.field2335 = 0;
		this.frameCount = -1;
		this.field2338 = false;
		this.field2333 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2341 = 99;
		this.field2319 = false;
		this.field2327 = -1;
		this.field2339 = -1;
		this.field2340 = 2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "-79"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "839529749"
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
			this.field2330 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2330[var4] = var1.readUnsignedByte();
			}

			this.field2330[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2338 = true;
		} else if (var2 == 5) {
			this.field2333 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2341 = var1.readUnsignedByte();
			this.field2319 = true;
		} else if (var2 == 9) {
			this.field2327 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2339 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2340 = var1.readUnsignedByte();
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
			this.field2322 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2322.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2323 = var1.readUnsignedShort();
			this.field2335 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2331 = new boolean[256];

			for (var3 = 0; var3 < this.field2331.length; ++var3) {
				this.field2331[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2331[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12569"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2327 == -1) {
			if (this.field2330 == null && this.field2331 == null) {
				this.field2327 = 0;
			} else {
				this.field2327 = 2;
			}
		}

		if (this.field2339 == -1) {
			if (this.field2330 == null && this.field2331 == null) {
				this.field2339 = 0;
			} else {
				this.field2339 = 2;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljn;II)Ljn;",
		garbageValue = "119029641"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class14.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class139 var3 = class214.method3910(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3088());
				var4.method4915(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljn;III)Ljn;",
		garbageValue = "2034057429"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class14.getFrames(var2 >> 16);
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
			class139 var4 = class214.method3910(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3088());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4915(var4, var2);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "58"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class14.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class139 var3 = class214.method3910(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3088());
				var4.method4915(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILif;II)Ljn;",
		garbageValue = "-130759845"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2324 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4207(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class139 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4170();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2331 == null) {
					var5.method4915(var9, var2);
					return var5;
				}

				var8 = var9.field1606;
				var5.method4918(var8, var9, var2, this.field2331, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class14.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2330 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2330 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4919(var7, var2, this.field2330, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4170();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1606;
				}

				var5.method4918(var8, var9, var4, this.field2331, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class14.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4919(var10, var4, this.field2330, true);
			}

			if (var6 && var7 != null) {
				var5.method4919(var7, var2, this.field2330, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILif;II)Ljn;",
		garbageValue = "-561327832"
	)
	Model method4207(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class14.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class14.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2330);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IS)Ljn;",
		garbageValue = "6000"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class14.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class14.getFrames(var6 >> 16);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1797639917"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1128031722"
	)
	public int method4177() {
		return this.field2335 - this.field2323;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;",
		garbageValue = "-585395726"
	)
	class139 method4170() {
		return this.isCachedModelIdSet() ? class214.method3910(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ac")
	static boolean method4210(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L);
		return var2 == 2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lon;II)Lon;",
		garbageValue = "-805987290"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
