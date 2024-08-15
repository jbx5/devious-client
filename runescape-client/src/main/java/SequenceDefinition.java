import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ab")
	static boolean field2881;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2132123781
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("al")
	public Map field2868;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -848044183
	)
	int field2869;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -976678369
	)
	int field2884;
	@ObfuscatedName("aw")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("af")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("aa")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljt;"
	)
	@Export("soundEffects")
	public Sound[] soundEffects;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1342396509
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("av")
	int[] field2876;
	@ObfuscatedName("ar")
	boolean[] field2877;
	@ObfuscatedName("ap")
	public boolean field2872;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1295041089
	)
	public int field2867;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2044620017
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1260474425
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -364428165
	)
	public int field2882;
	@ObfuscatedName("bg")
	public boolean field2883;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 747483339
	)
	public int field2866;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1138781401
	)
	public int field2885;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1815817081
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2881 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2869 = 0;
		this.field2884 = 0;
		this.frameCount = -1;
		this.field2872 = false;
		this.field2867 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2882 = 99;
		this.field2883 = false;
		this.field2866 = -1;
		this.field2885 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1796368004"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "1153207476"
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
			this.field2876 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2876[var4] = var1.readUnsignedByte();
			}

			this.field2876[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2872 = true;
		} else if (var2 == 5) {
			this.field2867 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2882 = var1.readUnsignedByte();
			this.field2883 = true;
		} else if (var2 == 9) {
			this.field2866 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2885 = var1.readUnsignedByte();
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
					label154: {
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
								break label154;
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
				this.field2868 = new HashMap();

				for (var4 = 0; var4 < var3; ++var4) {
					int var5;
					Sound var6;
					label167: {
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
								break label167;
							}
						}

						var6 = null;
					}

					this.field2868.put(var5, var6);
				}
			} else if (var2 == 16) {
				this.field2869 = var1.readUnsignedShort();
				this.field2884 = var1.readUnsignedShort();
			} else if (var2 == 17) {
				this.field2877 = new boolean[256];

				for (var3 = 0; var3 < this.field2877.length; ++var3) {
					this.field2877[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field2877[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2866 == -1) {
			if (this.field2876 == null && this.field2877 == null) {
				this.field2866 = 0;
			} else {
				this.field2866 = 2;
			}
		}

		if (this.field2885 == -1) {
			if (this.field2876 == null && this.field2877 == null) {
				this.field2885 = 0;
			} else {
				this.field2885 = 2;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhr;IB)Lhr;",
		garbageValue = "-70"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var10 = GameEngine.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var10 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var10.hasAlphaTransform(var2));
				var9.animate(var10, var2);
				return var9;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class142 var6 = WidgetDefinition.method6556(var4);
			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method3288() ? 0 : 1;
			}

			class142 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				class142 var7 = (class142)SequenceDefinition_cachedModel.get((long)var4);
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = ObjectComposition.method5131(SequenceDefinition_animationsArchive, class164.SequenceDefinition_skeletonsArchive, var4, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var4);
					}

					var6 = var7;
				}

				var3 = var6;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var11 = var1.toSharedSequenceModel(!var3.method3262());
				var11.method4349(var3, var2);
				return var11;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhr;III)Lhr;",
		garbageValue = "-1759663007"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var11 = GameEngine.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var11 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var11.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var10.rotateY270Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY90Ccw();
				}

				var10.animate(var11, var2);
				if (var3 == 1) {
					var10.rotateY90Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY270Ccw();
				}

				return var10;
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId;
			class142 var7 = WidgetDefinition.method6556(var5);
			int var6;
			if (var7 == null) {
				var6 = 2;
			} else {
				var6 = var7.method3288() ? 0 : 1;
			}

			class142 var4;
			if (var6 != 0) {
				var4 = null;
			} else {
				class142 var8 = (class142)SequenceDefinition_cachedModel.get((long)var5);
				if (var8 != null) {
					var7 = var8;
				} else {
					var8 = ObjectComposition.method5131(SequenceDefinition_animationsArchive, class164.SequenceDefinition_skeletonsArchive, var5, false);
					if (var8 != null) {
						SequenceDefinition_cachedModel.put(var8, (long)var5);
					}

					var7 = var8;
				}

				var4 = var7;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var12 = var1.toSharedSequenceModel(!var4.method3262());
				var3 &= 3;
				if (var3 == 1) {
					var12.rotateY270Ccw();
				} else if (var3 == 2) {
					var12.rotateY180();
				} else if (var3 == 3) {
					var12.rotateY90Ccw();
				}

				var12.method4349(var4, var2);
				if (var3 == 1) {
					var12.rotateY90Ccw();
				} else if (var3 == 2) {
					var12.rotateY180();
				} else if (var3 == 3) {
					var12.rotateY270Ccw();
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhr;II)Lhr;",
		garbageValue = "540627867"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var10 = GameEngine.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var10 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var9 = var1.toSharedSpotAnimationModel(!var10.hasAlphaTransform(var2));
				var9.animate(var10, var2);
				return var9;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class142 var6 = WidgetDefinition.method6556(var4);
			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method3288() ? 0 : 1;
			}

			class142 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				class142 var7 = (class142)SequenceDefinition_cachedModel.get((long)var4);
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = ObjectComposition.method5131(SequenceDefinition_animationsArchive, class164.SequenceDefinition_skeletonsArchive, var4, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var4);
					}

					var6 = var7;
				}

				var3 = var6;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var11 = var1.toSharedSpotAnimationModel(!var3.method3262());
				var11.method4349(var3, var2);
				return var11;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhr;ILkr;II)Lhr;",
		garbageValue = "-839350680"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2881 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method5273(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class142 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method5277();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2877 == null) {
					var5.method4349(var9, var2);
					return var5;
				}

				var8 = var9.field1632;
				var5.method4232(var8, var9, var2, this.field2877, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = GameEngine.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2876 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2876 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4233(var7, var2, this.field2876, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method5277();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1632;
				}

				var5.method4232(var8, var9, var4, this.field2877, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = GameEngine.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4233(var10, var4, this.field2876, true);
			}

			if (var6 && var7 != null) {
				var5.method4233(var7, var2, this.field2876, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhr;ILkr;IB)Lhr;",
		garbageValue = "-64"
	)
	Model method5273(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = GameEngine.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = GameEngine.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2876);
				return var7;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lhr;II)Lhr;",
		garbageValue = "-970065689"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = GameEngine.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = GameEngine.getFrames(var6 >> 16);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "553559781"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-590525767"
	)
	public int method5307() {
		return this.field2884 - this.field2869;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lfq;",
		garbageValue = "1"
	)
	class142 method5277() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class142 var4 = WidgetDefinition.method6556(var2);
			int var3;
			if (var4 == null) {
				var3 = 2;
			} else {
				var3 = var4.method3288() ? 0 : 1;
			}

			class142 var1;
			if (var3 != 0) {
				var1 = null;
			} else {
				class142 var5 = (class142)SequenceDefinition_cachedModel.get((long)var2);
				if (var5 != null) {
					var4 = var5;
				} else {
					var5 = ObjectComposition.method5131(SequenceDefinition_animationsArchive, class164.SequenceDefinition_skeletonsArchive, var2, false);
					if (var5 != null) {
						SequenceDefinition_cachedModel.put(var5, (long)var2);
					}

					var4 = var5;
				}

				var1 = var4;
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1853374733"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field143.startsWith("win")) {
				GrandExchangeOfferAgeComparator.method7414(var0, 0, "openjs");
			} else if (class31.field143.startsWith("mac")) {
				GrandExchangeOfferAgeComparator.method7414(var0, 1, "openjs");
			} else {
				GrandExchangeOfferAgeComparator.method7414(var0, 2, "openjs");
			}
		} else {
			GrandExchangeOfferAgeComparator.method7414(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsd;",
		garbageValue = "-253010948"
	)
	static class486[] method5285() {
		return new class486[]{class486.field5009, class486.field5010, class486.field5006, class486.field5008};
	}
}
