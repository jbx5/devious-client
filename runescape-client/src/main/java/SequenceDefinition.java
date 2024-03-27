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
	@ObfuscatedName("az")
	static boolean field2400;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1158511669
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ag")
	public Map field2373;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 355460473
	)
	int field2383;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1153977257
	)
	int field2384;
	@ObfuscatedName("ar")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("aj")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("au")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lim;"
	)
	@Export("soundEffects")
	public Sound[] soundEffects;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1326039963
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("av")
	int[] field2390;
	@ObfuscatedName("aa")
	boolean[] field2391;
	@ObfuscatedName("aq")
	public boolean field2376;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1407034777
	)
	public int field2393;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1356573699
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1389248087
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 350626781
	)
	public int field2388;
	@ObfuscatedName("bp")
	public boolean field2397;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1128908439
	)
	public int field2398;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1758700787
	)
	public int field2399;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1127724015
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2400 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2383 = 0;
		this.field2384 = 0;
		this.frameCount = -1;
		this.field2376 = false;
		this.field2393 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2388 = 99;
		this.field2397 = false;
		this.field2398 = -1;
		this.field2399 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1018876135"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "550667970"
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
			this.field2390 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2390[var4] = var1.readUnsignedByte();
			}

			this.field2390[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2376 = true;
		} else if (var2 == 5) {
			this.field2393 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2388 = var1.readUnsignedByte();
			this.field2397 = true;
		} else if (var2 == 9) {
			this.field2398 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2399 = var1.readUnsignedByte();
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
					label155: {
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
								break label155;
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
				this.field2373 = new HashMap();

				for (var4 = 0; var4 < var3; ++var4) {
					int var5;
					Sound var6;
					label168: {
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
								break label168;
							}
						}

						var6 = null;
					}

					this.field2373.put(var5, var6);
				}
			} else if (var2 == 16) {
				this.field2383 = var1.readUnsignedShort();
				this.field2384 = var1.readUnsignedShort();
			} else if (var2 == 17) {
				this.field2391 = new boolean[256];

				for (var3 = 0; var3 < this.field2391.length; ++var3) {
					this.field2391[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field2391[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-681718141"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2398 == -1) {
			if (this.field2390 == null && this.field2391 == null) {
				this.field2398 = 0;
			} else {
				this.field2398 = 2;
			}
		}

		if (this.field2399 == -1) {
			if (this.field2390 == null && this.field2391 == null) {
				this.field2399 = 0;
			} else {
				this.field2399 = 2;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "-74"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class204.getFrames(var2 >> 16);
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
			if (class192.method3717(var4) != 0) {
				var3 = null;
			} else {
				var3 = class90.method2315(var4);
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3089());
				var6.method4960(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljn;III)Ljn;",
		garbageValue = "-85472262"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = class204.getFrames(var2 >> 16);
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
			if (class192.method3717(var5) != 0) {
				var4 = null;
			} else {
				var4 = class90.method2315(var5);
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3089());
				var3 &= 3;
				if (var3 == 1) {
					var7.rotateY270Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY90Ccw();
				}

				var7.method4960(var4, var2);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "-39"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class204.getFrames(var2 >> 16);
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
			if (class192.method3717(var4) != 0) {
				var3 = null;
			} else {
				var3 = class90.method2315(var4);
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method3089());
				var6.method4960(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILig;IB)Ljn;",
		garbageValue = "122"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2400 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4229(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class138 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4233();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2391 == null) {
					var5.method4960(var9, var2);
					return var5;
				}

				var8 = var9.field1635;
				var5.method4964(var8, var9, var2, this.field2391, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class204.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2390 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2390 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5060(var7, var2, this.field2390, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4233();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1635;
				}

				var5.method4964(var8, var9, var4, this.field2391, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class204.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5060(var10, var4, this.field2390, true);
			}

			if (var6 && var7 != null) {
				var5.method5060(var7, var2, this.field2390, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILig;II)Ljn;",
		garbageValue = "-1536368955"
	)
	Model method4229(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class204.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class204.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2390);
				return var7;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "63"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class204.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class204.getFrames(var6 >> 16);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1986690179"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "58"
	)
	public int method4232() {
		return this.field2384 - this.field2383;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lfa;",
		garbageValue = "513425715"
	)
	class138 method4233() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class138 var1;
			if (class192.method3717(var2) != 0) {
				var1 = null;
			} else {
				var1 = class90.method2315(var2);
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1639567067"
	)
	static final void method4270() {
		class6.method40("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1946307811"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
