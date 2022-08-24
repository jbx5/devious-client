import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("gh")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("s")
	static boolean field2169 = false;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);

	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive12")
	static Archive archive12;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1415278789)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId = -1;

	@ObfuscatedName("o")
	public Map field2174;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1128191889)
	int field2164 = 0;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -2047273713)
	int field2175 = 0;

	@ObfuscatedName("a")
	@Export("frameIds")
	public int[] frameIds;

	@ObfuscatedName("m")
	@Export("chatFrameIds")
	int[] chatFrameIds;

	@ObfuscatedName("u")
	@Export("frameLengths")
	public int[] frameLengths;

	@ObfuscatedName("l")
	@Export("soundEffects")
	public int[] soundEffects;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 383344731)
	@Export("frameCount")
	public int frameCount = -1;

	@ObfuscatedName("r")
	int[] field2171;

	@ObfuscatedName("y")
	boolean[] field2172;

	@ObfuscatedName("p")
	public boolean field2173 = false;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -809328371)
	public int field2157 = 5;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -1366245483)
	@Export("shield")
	public int shield = -1;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 506341681)
	@Export("weapon")
	public int weapon = -1;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -111055229)
	public int field2177 = 99;

	@ObfuscatedName("t")
	public boolean field2178 = false;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -239889375)
	public int field2179 = -1;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1316679313)
	public int field2180 = -1;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = -1618338471)
	public int field2181 = 2;

	SequenceDefinition() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-1342737139")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;IB)V", garbageValue = "108")
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
			this.field2171 = new int[var3 + 1];
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2171[var4] = var1.readUnsignedByte();
			}
			this.field2171[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2173 = true;
		} else if (var2 == 5) {
			this.field2157 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2177 = var1.readUnsignedByte();
			this.field2178 = true;
		} else if (var2 == 9) {
			this.field2179 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2180 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2181 = var1.readUnsignedByte();
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
			this.field2174 = new HashMap();
			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2174.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2164 = var1.readUnsignedShort();
			this.field2175 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2172 = new boolean[256];
			for (var3 = 0; var3 < this.field2172.length; ++var3) {
				this.field2172[var3] = false;
			}
			var3 = var1.readUnsignedByte();
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2172[var1.readUnsignedByte()] = true;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "333129993")
	@Export("postDecode")
	void postDecode() {
		if (this.field2179 == -1) {
			if (this.field2171 == null && this.field2172 == null) {
				this.field2179 = 0;
			} else {
				this.field2179 = 2;
			}
		}
		if (this.field2180 == -1) {
			if (this.field2171 == null && this.field2172 == null) {
				this.field2180 = 0;
			} else {
				this.field2180 = 2;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lhp;II)Lhp;", garbageValue = "-1857589724")
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class142.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = StructComposition.method3543(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2743());
				var4.method4305(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lhp;III)Lhp;", garbageValue = "740382570")
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class142.getFrames(var2 >> 16);
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
			class122 var4 = StructComposition.method3543(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2743());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}
				var5.method4305(var4, var2);
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lhp;II)Lhp;", garbageValue = "-2034924646")
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class142.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = StructComposition.method3543(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2743());
				var4.method4305(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lhp;ILgh;IS)Lhp;", garbageValue = "248")
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2169 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method3723(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class122 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method3726();
				if (var9 == null) {
					return var5;
				}
				if (var3.isCachedModelIdSet() && this.field2172 == null) {
					var5.method4305(var9, var2);
					return var5;
				}
				var8 = var9.field1498;
				var5.method4285(var8, var9, var2, this.field2172, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class142.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}
				if (!var3.isCachedModelIdSet() && (this.field2171 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}
				if (this.field2171 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}
				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4286(var7, var2, this.field2171, false);
				}
			}
			if (var3.isCachedModelIdSet()) {
				var9 = var3.method3726();
				if (var9 == null) {
					return var5;
				}
				if (var8 == null) {
					var8 = var9.field1498;
				}
				var5.method4285(var8, var9, var4, this.field2172, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class142.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}
				var5.method4286(var10, var4, this.field2171, true);
			}
			if (var6 && var7 != null) {
				var5.method4286(var7, var2, this.field2171, false);
			}
			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lhp;ILgh;II)Lhp;", garbageValue = "1957595121")
	Model method3723(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class142.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class142.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2171);
				return var7;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lhp;IB)Lhp;", garbageValue = "1")
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class142.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class142.getFrames(var6 >> 16);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "60")
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "7")
	public int method3729() {
		return this.field2175 - this.field2164;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)Ldk;", garbageValue = "-56777197")
	class122 method3726() {
		return this.isCachedModelIdSet() ? StructComposition.method3543(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "486945829")
	static final int method3770() {
		return ViewportMouse.ViewportMouse_x;
	}
}