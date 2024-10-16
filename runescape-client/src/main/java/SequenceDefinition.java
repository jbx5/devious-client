import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ap")
	static boolean field2316;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1773066635
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("an")
	public Map field2310;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1657458627
	)
	int field2303;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1218449545
	)
	int field2312;
	@ObfuscatedName("ar")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ab")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("az")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -333115385
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ad")
	int[] field2317;
	@ObfuscatedName("ac")
	boolean[] field2318;
	@ObfuscatedName("av")
	public boolean field2319;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 759834377
	)
	public int field2320;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1318370301
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -629298107
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 125679259
	)
	public int field2323;
	@ObfuscatedName("ah")
	public boolean field2324;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1111773607
	)
	public int field2325;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 805033701
	)
	public int field2327;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1713937817
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2316 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2303 = 0;
		this.field2312 = 0;
		this.frameCount = -1;
		this.field2319 = false;
		this.field2320 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2323 = 99;
		this.field2324 = false;
		this.field2325 = -1;
		this.field2327 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "32"
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
		descriptor = "(Lvl;II)V",
		garbageValue = "-233487200"
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
			this.field2317 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2317[var4] = var1.readUnsignedByte();
			}

			this.field2317[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2319 = true;
		} else if (var2 == 5) {
			this.field2320 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2323 = var1.readUnsignedByte();
			this.field2324 = true;
		} else if (var2 == 9) {
			this.field2325 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2327 = var1.readUnsignedByte();
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
			if (class555.field5457 >= 226) {
				this.SequenceDefinition_cachedModelId = var1.readInt();
			} else {
				var3 = var1.readUnsignedByte();
				if (this.field2310 == null) {
					this.field2310 = new HashMap();
				}

				for (var4 = 0; var4 < var3; ++var4) {
					class208 var7 = FileSystem.method4535(var1);
					if (var7 != null) {
						if (!this.field2310.containsKey(var4)) {
							this.field2310.put(var4, new ArrayList());
						}

						((ArrayList)this.field2310.get(var4)).add(var7);
					}
				}
			}
		} else {
			int var5;
			class208 var6;
			if (var2 == 14) {
				if (class555.field5457 >= 226) {
					var3 = var1.readUnsignedShort();
					if (this.field2310 == null) {
						this.field2310 = new HashMap();
					}

					for (var4 = 0; var4 < var3; ++var4) {
						var5 = var1.readUnsignedShort();
						var6 = FileSystem.method4535(var1);
						if (var6 != null) {
							if (!this.field2310.containsKey(var5)) {
								this.field2310.put(var5, new ArrayList());
							}

							((ArrayList)this.field2310.get(var5)).add(var6);
						}
					}
				} else {
					this.SequenceDefinition_cachedModelId = var1.readInt();
				}
			} else if (var2 == 15) {
				if (class555.field5457 >= 226) {
					this.field2303 = var1.readUnsignedShort();
					this.field2312 = var1.readUnsignedShort();
				} else {
					var3 = var1.readUnsignedShort();
					if (this.field2310 == null) {
						this.field2310 = new HashMap();
					}

					for (var4 = 0; var4 < var3; ++var4) {
						var5 = var1.readUnsignedShort();
						var6 = FileSystem.method4535(var1);
						if (var6 != null) {
							if (!this.field2310.containsKey(var5)) {
								this.field2310.put(var5, new ArrayList());
							}

							((ArrayList)this.field2310.get(var5)).add(var6);
						}
					}
				}
			} else if (var2 == 16) {
				if (class555.field5457 < 226) {
					this.field2303 = var1.readUnsignedShort();
					this.field2312 = var1.readUnsignedShort();
				}
			} else if (var2 == 17) {
				this.field2318 = new boolean[256];

				for (var3 = 0; var3 < this.field2318.length; ++var3) {
					this.field2318[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field2318[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2325 == -1) {
			if (this.field2317 == null && this.field2318 == null) {
				this.field2325 = 0;
			} else {
				this.field2325 = 2;
			}
		}

		if (this.field2327 == -1) {
			if (this.field2317 == null && this.field2318 == null) {
				this.field2327 = 0;
			} else {
				this.field2327 = 2;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IB)Ljy;",
		garbageValue = "32"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class190.getFrames(var2 >> 16);
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
			class145 var3;
			if (AuthenticationScheme.method3356(var4) != 0) {
				var3 = null;
			} else {
				class145 var6 = (class145)SequenceDefinition_cachedModel.get((long)var4);
				class145 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = WorldMapSection1.method6334(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var3.method3540());
				var9.method5338(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIB)Ljy;",
		garbageValue = "-29"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = class190.getFrames(var2 >> 16);
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
			class145 var4;
			if (AuthenticationScheme.method3356(var5) != 0) {
				var4 = null;
			} else {
				class145 var7 = (class145)SequenceDefinition_cachedModel.get((long)var5);
				class145 var6;
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = WorldMapSection1.method6334(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var5, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var5);
					}

					var6 = var7;
				}

				var4 = var6;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var4.method3540());
				var3 &= 3;
				if (var3 == 1) {
					var10.rotateY270Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY90Ccw();
				}

				var10.method5338(var4, var2);
				if (var3 == 1) {
					var10.rotateY90Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY270Ccw();
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IB)Ljy;",
		garbageValue = "59"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class190.getFrames(var2 >> 16);
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
			class145 var3;
			if (AuthenticationScheme.method3356(var4) != 0) {
				var3 = null;
			} else {
				class145 var6 = (class145)SequenceDefinition_cachedModel.get((long)var4);
				class145 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = WorldMapSection1.method6334(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var9 = var1.toSharedSpotAnimationModel(!var3.method3540());
				var9.method5338(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljy;ILiu;II)Ljy;",
		garbageValue = "-237623590"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2316 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4364(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class145 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4360();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2318 == null) {
					var5.method5338(var9, var2);
					return var5;
				}

				var8 = var9.field1663;
				var5.method5332(var8, var9, var2, this.field2318, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class190.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2317 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2317 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5400(var7, var2, this.field2317, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4360();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1663;
				}

				var5.method5332(var8, var9, var4, this.field2318, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class190.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5400(var10, var4, this.field2317, true);
			}

			if (var6 && var7 != null) {
				var5.method5400(var7, var2, this.field2317, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljy;ILiu;II)Ljy;",
		garbageValue = "-1505426327"
	)
	Model method4364(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class190.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class190.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2317);
				return var7;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljy;II)Ljy;",
		garbageValue = "1277300901"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class190.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class190.getFrames(var6 >> 16);
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
		descriptor = "(B)Z",
		garbageValue = "76"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "28"
	)
	public int method4367() {
		return this.field2312 - this.field2303;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lfr;",
		garbageValue = "529797865"
	)
	class145 method4360() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class145 var1;
			if (AuthenticationScheme.method3356(var2) != 0) {
				var1 = null;
			} else {
				class145 var4 = (class145)SequenceDefinition_cachedModel.get((long)var2);
				class145 var3;
				if (var4 != null) {
					var3 = var4;
				} else {
					var4 = WorldMapSection1.method6334(class219.SequenceDefinition_animationsArchive, class219.SequenceDefinition_skeletonsArchive, var2, false);
					if (var4 != null) {
						SequenceDefinition_cachedModel.put(var4, (long)var2);
					}

					var3 = var4;
				}

				var1 = var3;
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "27"
	)
	static int method4398(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lds;",
		garbageValue = "659131672"
	)
	static class92[] method4384() {
		return new class92[]{class92.field1120, class92.field1124, class92.field1121, class92.field1119, class92.field1117};
	}
}
