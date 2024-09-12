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
	static boolean field2303;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1824748027
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ad")
	public Map field2310;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1326134629
	)
	int field2305;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1985864945
	)
	int field2304;
	@ObfuscatedName("ab")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("az")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("aa")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("soundEffects")
	public Sound[] soundEffects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1317182493
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("as")
	int[] field2318;
	@ObfuscatedName("ay")
	boolean[] field2311;
	@ObfuscatedName("aj")
	public boolean field2320;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 977017053
	)
	public int field2321;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1326457921
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -815731495
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1967207071
	)
	public int field2324;
	@ObfuscatedName("bn")
	public boolean field2325;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1890691075
	)
	public int field2302;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 761270303
	)
	public int field2327;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -124286531
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2303 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2305 = 0;
		this.field2304 = 0;
		this.frameCount = -1;
		this.field2320 = false;
		this.field2321 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2324 = 99;
		this.field2325 = false;
		this.field2302 = -1;
		this.field2327 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "283342224"
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
		descriptor = "(Lvf;IB)V",
		garbageValue = "-76"
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
			this.field2318 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2318[var4] = var1.readUnsignedByte();
			}

			this.field2318[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2320 = true;
		} else if (var2 == 5) {
			this.field2321 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2324 = var1.readUnsignedByte();
			this.field2325 = true;
		} else if (var2 == 9) {
			this.field2302 = var1.readUnsignedByte();
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
					label158: {
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
								break label158;
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
				this.field2310 = new HashMap();

				for (var4 = 0; var4 < var3; ++var4) {
					int var5;
					Sound var6;
					label171: {
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
								break label171;
							}
						}

						var6 = null;
					}

					this.field2310.put(var5, var6);
				}
			} else if (var2 == 16) {
				this.field2305 = var1.readUnsignedShort();
				this.field2304 = var1.readUnsignedShort();
			} else if (var2 == 17) {
				this.field2311 = new boolean[256];

				for (var3 = 0; var3 < this.field2311.length; ++var3) {
					this.field2311[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field2311[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1129515892"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2302 == -1) {
			if (this.field2318 == null && this.field2311 == null) {
				this.field2302 = 0;
			} else {
				this.field2302 = 2;
			}
		}

		if (this.field2327 == -1) {
			if (this.field2318 == null && this.field2311 == null) {
				this.field2327 = 0;
			} else {
				this.field2327 = 2;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "181956277"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class160.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class145 var3 = class111.method2990(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3395());
				var4.method5308(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)Ljm;",
		garbageValue = "-1511335826"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class160.getFrames(var2 >> 16);
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
			class145 var4 = class111.method2990(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3395());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5308(var4, var2);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "-1082991211"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class160.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class145 var3 = class111.method2990(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3395());
				var4.method5308(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILif;II)Ljm;",
		garbageValue = "1657765057"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2303 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4321(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class145 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4325();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2311 == null) {
					var5.method5308(var9, var2);
					return var5;
				}

				var8 = var9.field1673;
				var5.method5243(var8, var9, var2, this.field2311, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class160.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2318 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2318 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5297(var7, var2, this.field2318, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4325();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1673;
				}

				var5.method5243(var8, var9, var4, this.field2311, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class160.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5297(var10, var4, this.field2318, true);
			}

			if (var6 && var7 != null) {
				var5.method5297(var7, var2, this.field2318, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILif;IB)Ljm;",
		garbageValue = "127"
	)
	Model method4321(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class160.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class160.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2318);
				return var7;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "-68716743"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class160.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class160.getFrames(var6 >> 16);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2009442178"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1034108582"
	)
	public int method4368() {
		return this.field2304 - this.field2305;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfo;",
		garbageValue = "-820155515"
	)
	class145 method4325() {
		return this.isCachedModelIdSet() ? class111.method2990(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	static void method4344(int var0) {
		TransformationMatrix.field4735 = var0;
		TransformationMatrix.field4734 = new TransformationMatrix[var0];
		TransformationMatrix.field4738 = 0;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "1"
	)
	static int method4362(int var0, Script var1, boolean var2) {
		return 2;
	}
}
