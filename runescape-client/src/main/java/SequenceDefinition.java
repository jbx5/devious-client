import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("at")
	static boolean field2206;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -569745451
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("av")
	public Map field2212;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -843852473
	)
	int field2213;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1032248213
	)
	int field2219;
	@ObfuscatedName("ay")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ak")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("aj")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("am")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1433820539
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ai")
	int[] field2220;
	@ObfuscatedName("aw")
	boolean[] field2221;
	@ObfuscatedName("ae")
	public boolean field2224;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1596578627
	)
	public int field2223;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1008837529
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 640845315
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -893117653
	)
	public int field2211;
	@ObfuscatedName("be")
	public boolean field2210;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -595997513
	)
	public int field2218;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1548671259
	)
	public int field2205;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1712808465
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2206 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2213 = 0;
		this.field2219 = 0;
		this.frameCount = -1;
		this.field2224 = false;
		this.field2223 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2211 = 99;
		this.field2210 = false;
		this.field2218 = -1;
		this.field2205 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "724172563"
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
		descriptor = "(Luj;II)V",
		garbageValue = "-848433725"
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
			this.field2220 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2220[var4] = var1.readUnsignedByte();
			}

			this.field2220[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2224 = true;
		} else if (var2 == 5) {
			this.field2223 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2211 = var1.readUnsignedByte();
			this.field2210 = true;
		} else if (var2 == 9) {
			this.field2218 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2205 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.restartMode = var1.readUnsignedByte();
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
			this.field2212 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2212.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2213 = var1.readUnsignedShort();
			this.field2219 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2221 = new boolean[256];

			for (var3 = 0; var3 < this.field2221.length; ++var3) {
				this.field2221[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2221[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2218 == -1) {
			if (this.field2220 == null && this.field2221 == null) {
				this.field2218 = 0;
			} else {
				this.field2218 = 2;
			}
		}

		if (this.field2205 == -1) {
			if (this.field2220 == null && this.field2221 == null) {
				this.field2205 = 0;
			} else {
				this.field2205 = 2;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lka;IB)Lka;",
		garbageValue = "61"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class102.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class139 var3 = class151.method3292(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3187());
				var4.method5572(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lka;III)Lka;",
		garbageValue = "-1872374798"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class102.getFrames(var2 >> 16);
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
			class139 var4 = class151.method3292(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3187());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5572(var4, var2);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lka;IB)Lka;",
		garbageValue = "55"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class102.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class139 var3 = class151.method3292(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3187());
				var4.method5572(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lka;ILhx;IB)Lka;",
		garbageValue = "-75"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2206 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4074(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class139 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4061();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2221 == null) {
					var5.method5572(var9, var2);
					return var5;
				}

				var8 = var9.field1600;
				var5.method5576(var8, var9, var2, this.field2221, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class102.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2220 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2220 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5577(var7, var2, this.field2220, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4061();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1600;
				}

				var5.method5576(var8, var9, var4, this.field2221, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class102.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5577(var10, var4, this.field2220, true);
			}

			if (var6 && var7 != null) {
				var5.method5577(var7, var2, this.field2220, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lka;ILhx;II)Lka;",
		garbageValue = "1735546670"
	)
	Model method4074(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class102.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class102.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2220);
				return var7;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lka;II)Lka;",
		garbageValue = "1947242189"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class102.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class102.getFrames(var6 >> 16);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2015458472"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "759292138"
	)
	public int method4064() {
		return this.field2219 - this.field2213;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lfo;",
		garbageValue = "52"
	)
	class139 method4061() {
		return this.isCachedModelIdSet() ? class151.method3292(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "12"
	)
	public static int method4094(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "294649800"
	)
	public static int method4092(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "2048798044"
	)
	static int method4096(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Loh;",
		garbageValue = "550564154"
	)
	static Archive method4093(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, KeyHandler.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, class302.masterDisk, WorldMapSectionType.field2556, var0, var1, var2, var3, var4, var5);
	}
}
