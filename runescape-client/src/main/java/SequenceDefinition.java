import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("gc")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("sr")
	@ObfuscatedSignature(descriptor = "Lat;")
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	@ObfuscatedName("o")
	static boolean field2155 = false;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);

	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = -1880277889)
	public static int field2176;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 623530715)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId = -1;

	@ObfuscatedName("h")
	public Map field2159;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1990276969)
	int field2172 = 0;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -725076183)
	int field2164 = 0;

	@ObfuscatedName("n")
	@Export("frameIds")
	public int[] frameIds;

	@ObfuscatedName("x")
	@Export("chatFrameIds")
	int[] chatFrameIds;

	@ObfuscatedName("g")
	@Export("frameLengths")
	public int[] frameLengths;

	@ObfuscatedName("p")
	@Export("soundEffects")
	public int[] soundEffects;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 220322921)
	@Export("frameCount")
	public int frameCount = -1;

	@ObfuscatedName("l")
	int[] field2165;

	@ObfuscatedName("y")
	boolean[] field2160;

	@ObfuscatedName("k")
	public boolean field2167 = false;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1807890315)
	public int field2168 = 5;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1258545031)
	@Export("shield")
	public int shield = -1;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -66294021)
	@Export("weapon")
	public int weapon = -1;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1002119731)
	public int field2166 = 99;

	@ObfuscatedName("i")
	public boolean field2174 = false;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1270638441)
	public int field2173 = -1;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 855452311)
	public int field2156 = -1;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -1725407875)
	public int field2175 = 2;

	SequenceDefinition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "1")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "1805713737")
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
			this.field2165 = new int[var3 + 1];
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2165[var4] = var1.readUnsignedByte();
			}
			this.field2165[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2167 = true;
		} else if (var2 == 5) {
			this.field2168 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2166 = var1.readUnsignedByte();
			this.field2174 = true;
		} else if (var2 == 9) {
			this.field2173 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2156 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2175 = var1.readUnsignedByte();
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
			this.field2159 = new HashMap();
			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2159.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2172 = var1.readUnsignedShort();
			this.field2164 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2160 = new boolean[256];
			for (var3 = 0; var3 < this.field2160.length; ++var3) {
				this.field2160[var3] = false;
			}
			var3 = var1.readUnsignedByte();
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2160[var1.readUnsignedByte()] = true;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2072822091")
	@Export("postDecode")
	void postDecode() {
		if (this.field2173 == -1) {
			if (this.field2165 == null && this.field2160 == null) {
				this.field2173 = 0;
			} else {
				this.field2173 = 2;
			}
		}
		if (this.field2156 == -1) {
			if (this.field2165 == null && this.field2160 == null) {
				this.field2156 = 0;
			} else {
				this.field2156 = 2;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lhd;II)Lhd;", garbageValue = "-519779474")
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
			class122 var3 = class282.method5493(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2828());
				var4.method4372(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lhd;III)Lhd;", garbageValue = "1864568782")
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
			class122 var4 = class282.method5493(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2828());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}
				var5.method4372(var4, var2);
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lhd;II)Lhd;", garbageValue = "-2075457680")
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
			class122 var3 = class282.method5493(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2828());
				var4.method4372(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lhd;ILgc;IB)Lhd;", garbageValue = "-10")
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2155 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method3809(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class122 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method3801();
				if (var9 == null) {
					return var5;
				}
				if (var3.isCachedModelIdSet() && this.field2160 == null) {
					var5.method4372(var9, var2);
					return var5;
				}
				var8 = var9.field1498;
				var5.method4352(var8, var9, var2, this.field2160, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class143.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}
				if (!var3.isCachedModelIdSet() && (this.field2165 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}
				if (this.field2165 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}
				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4441(var7, var2, this.field2165, false);
				}
			}
			if (var3.isCachedModelIdSet()) {
				var9 = var3.method3801();
				if (var9 == null) {
					return var5;
				}
				if (var8 == null) {
					var8 = var9.field1498;
				}
				var5.method4352(var8, var9, var4, this.field2160, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class143.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}
				var5.method4441(var10, var4, this.field2165, true);
			}
			if (var6 && var7 != null) {
				var5.method4441(var7, var2, this.field2165, false);
			}
			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lhd;ILgc;II)Lhd;", garbageValue = "-132918024")
	Model method3809(Model var1, int var2, SequenceDefinition var3, int var4) {
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
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2165);
				return var7;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Lhd;IB)Lhd;", garbageValue = "-115")
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
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class143.getFrames(var6 >> 16);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "678280636")
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "180")
	public int method3812() {
		return this.field2164 - this.field2172;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)Ldj;", garbageValue = "-2065576976")
	class122 method3801() {
		return this.isCachedModelIdSet() ? class282.method5493(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Ldk;", garbageValue = "-1004740067")
	static class118 method3854(int var0) {
		class118 var1 = ((class118) (class271.findEnumerated(Script.method2024(), var0)));
		if (var1 == null) {
			var1 = class118.field1462;
		}
		return var1;
	}
}