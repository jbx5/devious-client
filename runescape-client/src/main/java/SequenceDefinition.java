import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("v")
	static boolean field2150;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1904575055)

	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("u")
	public Map field2170;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1007143009)

	int field2151;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1999392015)

	int field2157;
	@ObfuscatedName("x")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("c")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("j")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("p")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-754201145)

	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("b")
	int[] field2156;
	@ObfuscatedName("w")
	boolean[] field2164;
	@ObfuscatedName("a")
	public boolean field2165;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-1512546953)

	public int field2166;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1639485167)

	@Export("shield")
	public int shield;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	480167985)

	@Export("weapon")
	public int weapon;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	-1414981787)

	public int field2169;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	142595323)

	public int field2162;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	1199184569)

	public int field2171;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1417760427)

	public int field2172;
	static 
	{
		field2150 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2151 = 0;
		this.field2157 = 0;
		this.frameCount = -1;
		this.field2165 = false;
		this.field2166 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2169 = 99;
		this.field2162 = -1;
		this.field2171 = -1;
		this.field2172 = 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-4")

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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"429154180")

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
			this.field2156 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2156[var4] = var1.readUnsignedByte();
			}

			this.field2156[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2165 = true;
		} else if (var2 == 5) {
			this.field2166 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2169 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2162 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2171 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2172 = var1.readUnsignedByte();
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
			this.field2170 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2170.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2151 = var1.readUnsignedShort();
			this.field2157 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2164 = new boolean[256];

			for (var3 = 0; var3 < this.field2164.length; ++var3) {
				this.field2164[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2164[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"45")

	@Export("postDecode")
	void postDecode() {
		if (this.field2162 == (-1)) {
			if ((this.field2156 == null) && (this.field2164 == null)) {
				this.field2162 = 0;
			} else {
				this.field2162 = 2;
			}
		}

		if (this.field2171 == (-1)) {
			if ((this.field2156 == null) && (this.field2164 == null)) {
				this.field2171 = 0;
			} else {
				this.field2171 = 2;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;II)Lhx;", garbageValue = 
	"1225828332")

	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class143.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class117.method2724(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2784());
				var4.method4363(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;III)Lhx;", garbageValue = 
	"804450447")

	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class143.getFrames(var2 >> 16);
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
			class122 var4 = class117.method2724(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2784());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4363(var4, var2);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;IB)Lhx;", garbageValue = 
	"-28")

	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class143.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class117.method2724(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2784());
				var4.method4363(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;ILgg;II)Lhx;", garbageValue = 
	"-181616819")

	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if ((field2150 && (!this.isCachedModelIdSet())) && (!var3.isCachedModelIdSet())) {
			return this.method3800(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			class122 var8;
			if (this.isCachedModelIdSet()) {
				var8 = this.method3801();
				if (var3.isCachedModelIdSet() && (this.field2164 == null)) {
					var5.method4363(var8, var2);
					return var5;
				}

				var5.method4367(var8, var2, this.field2164, false);
			} else {
				var2 = this.frameIds[var2];
				var7 = class143.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if ((!var3.isCachedModelIdSet()) && ((this.field2156 == null) || (var4 == (-1)))) {
					var5.animate(var7, var2);
					return var5;
				}

				if ((this.field2156 == null) || (var4 == (-1))) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4368(var7, var2, this.field2156, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var8 = var3.method3801();
				var5.method4367(var8, var4, this.field2164, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = class143.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4368(var9, var4, this.field2156, true);
			}

			if (var6 && (var7 != null)) {
				var5.method4368(var7, var2, this.field2156, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;ILgg;IB)Lhx;", garbageValue = 
	"-117")

	Model method3800(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class143.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class143.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel((!var5.hasAlphaTransform(var2)) & (!var6.hasAlphaTransform(var4)));
				var7.animate2(var5, var2, var6, var4, this.field2156);
				return var7;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;II)Lhx;", garbageValue = 
	"-863329997")

	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class143.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if ((this.chatFrameIds != null) && (var2 < this.chatFrameIds.length)) {
					var6 = this.chatFrameIds[var2];
					var5 = class143.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if ((var5 != null) && (var6 != 65535)) {
					var7 = var1.toSharedSequenceModel((!var4.hasAlphaTransform(var3)) & (!var5.hasAlphaTransform(var6)));
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-5")

	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1948000582")

	public int method3827() {
		return this.field2157 - this.field2151;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(I)Ldu;", garbageValue = 
	"-1115190580")

	public class122 method3801() {
		return this.isCachedModelIdSet() ? class117.method2724(this.SequenceDefinition_cachedModelId) : null;
	}
}