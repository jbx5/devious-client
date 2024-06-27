import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aq")
	static boolean field2299;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -116545325
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("au")
	public Map field2287;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 996333495
	)
	int field2288;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1347016563
	)
	int field2289;
	@ObfuscatedName("ax")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ac")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("al")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("soundEffects")
	public Sound[] soundEffects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -922081079
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("aa")
	int[] field2285;
	@ObfuscatedName("as")
	boolean[] field2296;
	@ObfuscatedName("aw")
	public boolean field2297;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2074913605
	)
	public int field2298;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1645317391
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1527780161
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1041319035
	)
	public int field2280;
	@ObfuscatedName("bt")
	public boolean field2304;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -524750121
	)
	public int field2303;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 65422091
	)
	public int field2283;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -543932181
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2299 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2288 = 0;
		this.field2289 = 0;
		this.frameCount = -1;
		this.field2297 = false;
		this.field2298 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2280 = 99;
		this.field2304 = false;
		this.field2303 = -1;
		this.field2283 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1231470696"
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
		descriptor = "(Lvp;II)V",
		garbageValue = "549881438"
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
			this.field2285 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2285[var4] = var1.readUnsignedByte();
			}

			this.field2285[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2297 = true;
		} else if (var2 == 5) {
			this.field2298 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2280 = var1.readUnsignedByte();
			this.field2304 = true;
		} else if (var2 == 9) {
			this.field2303 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2283 = var1.readUnsignedByte();
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
		} else {
			boolean var8;
			boolean var9;
			boolean var10;
			int var16;
			int var17;
			int var18;
			if (var2 == 13) {
				var3 = var1.readUnsignedByte();
				this.soundEffects = new Sound[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					Sound var12;
					Sound[] var13;
					label156: {
						var13 = this.soundEffects;
						if (var1 != null) {
							var8 = false;
							var9 = false;
							var10 = false;
							boolean var11 = false;
							var16 = var1.readUnsignedShort();
							var17 = var1.readUnsignedByte();
							var18 = var1.readUnsignedByte();
							int var19 = var1.readUnsignedByte();
							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) {
								var12 = new Sound(var16, var17, var18, var19);
								break label156;
							}
						}

						var12 = null;
					}

					var13[var4] = var12;
				}
			} else if (var2 == 14) {
				this.SequenceDefinition_cachedModelId = var1.readInt();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedShort();
				this.field2287 = new HashMap();

				for (var4 = 0; var4 < var3; ++var4) {
					int var5;
					Sound var6;
					label169: {
						var5 = var1.readUnsignedShort();
						if (var1 != null) {
							boolean var7 = false;
							var8 = false;
							var9 = false;
							var10 = false;
							int var15 = var1.readUnsignedShort();
							var16 = var1.readUnsignedByte();
							var17 = var1.readUnsignedByte();
							var18 = var1.readUnsignedByte();
							if (var15 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) {
								var6 = new Sound(var15, var16, var17, var18);
								break label169;
							}
						}

						var6 = null;
					}

					this.field2287.put(var5, var6);
				}
			} else if (var2 == 16) {
				this.field2288 = var1.readUnsignedShort();
				this.field2289 = var1.readUnsignedShort();
			} else if (var2 == 17) {
				this.field2296 = new boolean[256];

				for (var3 = 0; var3 < this.field2296.length; ++var3) {
					this.field2296[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field2296[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1751869717"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2303 == -1) {
			if (this.field2285 == null && this.field2296 == null) {
				this.field2303 = 0;
			} else {
				this.field2303 = 2;
			}
		}

		if (this.field2283 == -1) {
			if (this.field2285 == null && this.field2296 == null) {
				this.field2283 = 0;
			} else {
				this.field2283 = 2;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "-1857948661"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
				var8.animate(var9, var2);
				return var8;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class142 var6 = class138.method3190(var4);
			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method3231() ? 0 : 1;
			}

			class142 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				var3 = class138.method3190(var4);
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var3.method3206());
				var10.method5822(var3, var2);
				return var10;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)Llv;",
		garbageValue = "762383690"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var10 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var10 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var10.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var9.rotateY270Ccw();
				} else if (var3 == 2) {
					var9.rotateY180();
				} else if (var3 == 3) {
					var9.rotateY90Ccw();
				}

				var9.animate(var10, var2);
				if (var3 == 1) {
					var9.rotateY90Ccw();
				} else if (var3 == 2) {
					var9.rotateY180();
				} else if (var3 == 3) {
					var9.rotateY270Ccw();
				}

				return var9;
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId;
			class142 var7 = class138.method3190(var5);
			int var6;
			if (var7 == null) {
				var6 = 2;
			} else {
				var6 = var7.method3231() ? 0 : 1;
			}

			class142 var4;
			if (var6 != 0) {
				var4 = null;
			} else {
				var4 = class138.method3190(var5);
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var11 = var1.toSharedSequenceModel(!var4.method3206());
				var3 &= 3;
				if (var3 == 1) {
					var11.rotateY270Ccw();
				} else if (var3 == 2) {
					var11.rotateY180();
				} else if (var3 == 3) {
					var11.rotateY90Ccw();
				}

				var11.method5822(var4, var2);
				if (var3 == 1) {
					var11.rotateY90Ccw();
				} else if (var3 == 2) {
					var11.rotateY180();
				} else if (var3 == 3) {
					var11.rotateY270Ccw();
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "1281742568"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var8 = var1.toSharedSpotAnimationModel(!var9.hasAlphaTransform(var2));
				var8.animate(var9, var2);
				return var8;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class142 var6 = class138.method3190(var4);
			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method3231() ? 0 : 1;
			}

			class142 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				var3 = class138.method3190(var4);
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var10 = var1.toSharedSpotAnimationModel(!var3.method3206());
				var10.method5822(var3, var2);
				return var10;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llv;ILii;II)Llv;",
		garbageValue = "-2041267323"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2299 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4061(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class142 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4060();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2296 == null) {
					var5.method5822(var9, var2);
					return var5;
				}

				var8 = var9.field1651;
				var5.method5860(var8, var9, var2, this.field2296, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = MouseHandler.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2285 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2285 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5775(var7, var2, this.field2285, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4060();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1651;
				}

				var5.method5860(var8, var9, var4, this.field2296, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = MouseHandler.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5775(var10, var4, this.field2285, true);
			}

			if (var6 && var7 != null) {
				var5.method5775(var7, var2, this.field2285, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llv;ILii;II)Llv;",
		garbageValue = "-787208312"
	)
	Model method4061(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = MouseHandler.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = MouseHandler.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2285);
				return var7;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "-1428875187"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = MouseHandler.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = MouseHandler.getFrames(var6 >> 16);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1987539688"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-22"
	)
	public int method4059() {
		return this.field2289 - this.field2288;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lft;",
		garbageValue = "2131319309"
	)
	class142 method4060() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class142 var4 = class138.method3190(var2);
			int var3;
			if (var4 == null) {
				var3 = 2;
			} else {
				var3 = var4.method3231() ? 0 : 1;
			}

			class142 var1;
			if (var3 != 0) {
				var1 = null;
			} else {
				var1 = class138.method3190(var2);
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "857885835"
	)
	public static void method4093(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
