import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("au")
	static boolean field2302;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 124948705
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aq")
	public Map field2321;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2133181577
	)
	int field2310;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1905371671
	)
	int field2311;
	@ObfuscatedName("ar")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ab")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ag")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("am")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -544230683
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ah")
	int[] field2318;
	@ObfuscatedName("as")
	boolean[] field2309;
	@ObfuscatedName("ay")
	public boolean field2319;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1577193721
	)
	public int field2320;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1817971347
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1203670721
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2102587695
	)
	public int field2304;
	@ObfuscatedName("bh")
	public boolean field2324;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -857247231
	)
	public int field2325;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -92873933
	)
	public int field2326;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 117564031
	)
	public int field2327;

	static {
		field2302 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2310 = 0;
		this.field2311 = 0;
		this.frameCount = -1;
		this.field2319 = false;
		this.field2320 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2304 = 99;
		this.field2324 = false;
		this.field2325 = -1;
		this.field2326 = -1;
		this.field2327 = 2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1228314075"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-998572107"
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
			this.field2319 = true;
		} else if (var2 == 5) {
			this.field2320 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2304 = var1.readUnsignedByte();
			this.field2324 = true;
		} else if (var2 == 9) {
			this.field2325 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2326 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2327 = var1.readUnsignedByte();
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
			this.field2321 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2321.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2310 = var1.readUnsignedShort();
			this.field2311 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2309 = new boolean[256];

			for (var3 = 0; var3 < this.field2309.length; ++var3) {
				this.field2309[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2309[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "968421208"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2325 == -1) {
			if (this.field2318 == null && this.field2309 == null) {
				this.field2325 = 0;
			} else {
				this.field2325 = 2;
			}
		}

		if (this.field2326 == -1) {
			if (this.field2318 == null && this.field2309 == null) {
				this.field2326 = 0;
			} else {
				this.field2326 = 2;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "-2024092599"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = MidiPcmStream.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class137 var3 = Tile.method4372(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3060());
				var4.method4782(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljr;IIB)Ljr;",
		garbageValue = "93"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = MidiPcmStream.getFrames(var2 >> 16);
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
			class137 var4 = Tile.method4372(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3060());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4782(var4, var2);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "1650193615"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = MidiPcmStream.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class137 var3 = Tile.method4372(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3060());
				var4.method4782(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljr;ILib;II)Ljr;",
		garbageValue = "-587997563"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2302 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4031(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class137 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4035();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2309 == null) {
					var5.method4782(var9, var2);
					return var5;
				}

				var8 = var9.field1622;
				var5.method4786(var8, var9, var2, this.field2309, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = MidiPcmStream.getFrames(var2 >> 16);
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
					var5.method4787(var7, var2, this.field2318, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4035();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1622;
				}

				var5.method4786(var8, var9, var4, this.field2309, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = MidiPcmStream.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4787(var10, var4, this.field2318, true);
			}

			if (var6 && var7 != null) {
				var5.method4787(var7, var2, this.field2318, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljr;ILib;II)Ljr;",
		garbageValue = "-2128259101"
	)
	Model method4031(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = MidiPcmStream.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = MidiPcmStream.getFrames(var4 >> 16);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "-1580674405"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = MidiPcmStream.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = MidiPcmStream.getFrames(var6 >> 16);
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
		garbageValue = "-1169271782"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2010728570"
	)
	public int method4034() {
		return this.field2311 - this.field2310;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lfv;",
		garbageValue = "-46871670"
	)
	class137 method4035() {
		return this.isCachedModelIdSet() ? Tile.method4372(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ltb;",
		garbageValue = "1250355259"
	)
	public static class502 method4071(int var0) {
		int var1 = class500.field5024[var0];
		if (var1 == 1) {
			return class502.field5035;
		} else if (var1 == 2) {
			return class502.field5030;
		} else {
			return var1 == 3 ? class502.field5037 : null;
		}
	}
}
