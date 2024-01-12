import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("am")
	static boolean field2231;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1635263435
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("an")
	public Map field2228;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1045519337
	)
	int field2229;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1909784595
	)
	int field2241;
	@ObfuscatedName("aw")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("az")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("av")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ak")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1609959357
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("as")
	int[] field2236;
	@ObfuscatedName("ab")
	boolean[] field2223;
	@ObfuscatedName("ah")
	public boolean field2238;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1235576383
	)
	public int field2220;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -973083085
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 722601619
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -9981513
	)
	public int field2242;
	@ObfuscatedName("bj")
	public boolean field2235;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2103885911
	)
	public int field2244;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 682714777
	)
	public int field2226;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -10256845
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2231 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2229 = 0;
		this.field2241 = 0;
		this.frameCount = -1;
		this.field2238 = false;
		this.field2220 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2242 = 99;
		this.field2235 = false;
		this.field2244 = -1;
		this.field2226 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-442022302"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "668196048"
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
			this.field2236 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2236[var4] = var1.readUnsignedByte();
			}

			this.field2236[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2238 = true;
		} else if (var2 == 5) {
			this.field2220 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2242 = var1.readUnsignedByte();
			this.field2235 = true;
		} else if (var2 == 9) {
			this.field2244 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2226 = var1.readUnsignedByte();
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
			this.field2228 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2228.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2229 = var1.readUnsignedShort();
			this.field2241 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2223 = new boolean[256];

			for (var3 = 0; var3 < this.field2223.length; ++var3) {
				this.field2223[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2223[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-212721931"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2244 == -1) {
			if (this.field2236 == null && this.field2223 == null) {
				this.field2244 = 0;
			} else {
				this.field2244 = 2;
			}
		}

		if (this.field2226 == -1) {
			if (this.field2236 == null && this.field2223 == null) {
				this.field2226 = 0;
			} else {
				this.field2226 = 2;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-1598781637"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class165.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class138 var3;
			if (RouteStrategy.method4508(var4) != 0) {
				var3 = null;
			} else {
				var3 = class430.method8064(var4);
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3161());
				var6.method5749(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Lko;",
		garbageValue = "-1880887547"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = class165.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var8.rotateY270Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2);
				if (var3 == 1) {
					var8.rotateY90Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY270Ccw();
				}

				return var8;
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId;
			class138 var4;
			if (RouteStrategy.method4508(var5) != 0) {
				var4 = null;
			} else {
				var4 = class430.method8064(var5);
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3161());
				var3 &= 3;
				if (var3 == 1) {
					var7.rotateY270Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY90Ccw();
				}

				var7.method5749(var4, var2);
				if (var3 == 1) {
					var7.rotateY90Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY270Ccw();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-2038269298"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class165.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class138 var3;
			if (RouteStrategy.method4508(var4) != 0) {
				var3 = null;
			} else {
				var3 = class430.method8064(var4);
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method3161());
				var6.method5749(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lko;ILhl;II)Lko;",
		garbageValue = "677104730"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2231 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4076(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class138 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4118();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2223 == null) {
					var5.method5749(var9, var2);
					return var5;
				}

				var8 = var9.field1601;
				var5.method5650(var8, var9, var2, this.field2223, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class165.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2236 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2236 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5652(var7, var2, this.field2236, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4118();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1601;
				}

				var5.method5650(var8, var9, var4, this.field2223, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class165.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5652(var10, var4, this.field2236, true);
			}

			if (var6 && var7 != null) {
				var5.method5652(var7, var2, this.field2236, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lko;ILhl;II)Lko;",
		garbageValue = "863867270"
	)
	Model method4076(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class165.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class165.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2236);
				return var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-1321918544"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class165.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class165.getFrames(var6 >> 16);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-73"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1536177939"
	)
	public int method4106() {
		return this.field2241 - this.field2229;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfu;",
		garbageValue = "-2116033712"
	)
	class138 method4118() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class138 var1;
			if (RouteStrategy.method4508(var2) != 0) {
				var1 = null;
			} else {
				var1 = class430.method8064(var2);
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-173005104"
	)
	static int method4122(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("aq")
	public static int method4123(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
