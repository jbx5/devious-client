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
	@ObfuscatedName("c")
	static boolean field2166;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1654992317)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;

	@ObfuscatedName("y")
	public Map field2172;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 197023681)
	int field2173;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 310114289)
	int field2164;

	@ObfuscatedName("t")
	@Export("frameIds")
	public int[] frameIds;

	@ObfuscatedName("z")
	@Export("chatFrameIds")
	int[] chatFrameIds;

	@ObfuscatedName("r")
	@Export("frameLengths")
	public int[] frameLengths;

	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 790194713)
	@Export("frameCount")
	public int frameCount;

	@ObfuscatedName("h")
	int[] field2180;

	@ObfuscatedName("x")
	boolean[] field2181;

	@ObfuscatedName("l")
	public boolean field2182;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1662385101)
	public int field2183;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1893104295)
	@Export("shield")
	public int shield;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -216403099)
	@Export("weapon")
	public int weapon;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1939539881)
	public int field2186;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -174247791)
	public int field2187;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 1763697953)
	public int field2188;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1018362487)
	public int field2174;

	static {
		field2166 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2173 = 0;
		this.field2164 = 0;
		this.frameCount = -1;
		this.field2182 = false;
		this.field2183 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2186 = 99;
		this.field2187 = -1;
		this.field2188 = -1;
		this.field2174 = 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-950901529")
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
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "325602175")
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
			this.field2180 = new int[var3 + 1];
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2180[var4] = var1.readUnsignedByte();
			}
			this.field2180[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2182 = true;
		} else if (var2 == 5) {
			this.field2183 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2186 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2187 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2188 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field2174 = var1.readUnsignedByte();
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
			this.field2172 = new HashMap();
			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2172.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2173 = var1.readUnsignedShort();
			this.field2164 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2181 = new boolean[256];
			for (var3 = 0; var3 < this.field2181.length; ++var3) {
				this.field2181[var3] = false;
			}
			var3 = var1.readUnsignedByte();
			for (var4 = 0; var4 < var3; ++var4) {
				this.field2181[var1.readUnsignedByte()] = true;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "283328116")
	@Export("postDecode")
	void postDecode() {
		if (this.field2187 == -1) {
			if (this.field2180 == null && this.field2181 == null) {
				this.field2187 = 0;
			} else {
				this.field2187 = 2;
			}
		}
		if (this.field2188 == -1) {
			if (this.field2180 == null && this.field2181 == null) {
				this.field2188 = 0;
			} else {
				this.field2188 = 2;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lhy;II)Lhy;", garbageValue = "-427559290")
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = ParamComposition.getFrames(var2 >> 16);
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
			class122 var5 = ((class122) (SequenceDefinition_cachedModel.get(((long) (var4)))));
			class122 var3;
			if (var5 != null) {
				var3 = var5;
			} else {
				var5 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false);
				if (var5 != null) {
					SequenceDefinition_cachedModel.put(var5, ((long) (var4)));
				}
				var3 = var5;
			}
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method2778());
				var6.method4404(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lhy;III)Lhy;", garbageValue = "-331559312")
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = ParamComposition.getFrames(var2 >> 16);
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
			class122 var6 = ((class122) (SequenceDefinition_cachedModel.get(((long) (var5)))));
			class122 var4;
			if (var6 != null) {
				var4 = var6;
			} else {
				var6 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var5, false);
				if (var6 != null) {
					SequenceDefinition_cachedModel.put(var6, ((long) (var5)));
				}
				var4 = var6;
			}
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method2778());
				var3 &= 3;
				if (var3 == 1) {
					var7.rotateY270Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY90Ccw();
				}
				var7.method4404(var4, var2);
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lhy;II)Lhy;", garbageValue = "-1841001380")
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = ParamComposition.getFrames(var2 >> 16);
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
			class122 var5 = ((class122) (SequenceDefinition_cachedModel.get(((long) (var4)))));
			class122 var3;
			if (var5 != null) {
				var3 = var5;
			} else {
				var5 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false);
				if (var5 != null) {
					SequenceDefinition_cachedModel.put(var5, ((long) (var4)));
				}
				var3 = var5;
			}
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method2778());
				var6.method4404(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lhy;ILgc;II)Lhy;", garbageValue = "-1919480423")
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2166 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method3828(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			class122 var8;
			if (this.isCachedModelIdSet()) {
				var8 = this.method3836();
				if (var3.isCachedModelIdSet() && this.field2181 == null) {
					var5.method4404(var8, var2);
					return var5;
				}
				var5.method4399(var8, var2, this.field2181, false);
			} else {
				var2 = this.frameIds[var2];
				var7 = ParamComposition.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}
				if (!var3.isCachedModelIdSet() && (this.field2180 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}
				if (this.field2180 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}
				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4398(var7, var2, this.field2180, false);
				}
			}
			if (var3.isCachedModelIdSet()) {
				var8 = var3.method3836();
				var5.method4399(var8, var4, this.field2181, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = ParamComposition.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}
				var5.method4398(var9, var4, this.field2180, true);
			}
			if (var6 && var7 != null) {
				var5.method4398(var7, var2, this.field2180, false);
			}
			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lhy;ILgc;IB)Lhy;", garbageValue = "63")
	Model method3828(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ParamComposition.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ParamComposition.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2180);
				return var7;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lhy;II)Lhy;", garbageValue = "-212353813")
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = ParamComposition.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = ParamComposition.getFrames(var6 >> 16);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1630749054")
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2120991547")
	public int method3835() {
		return this.field2164 - this.field2173;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Lda;", garbageValue = "-1352870748")
	public class122 method3836() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class122 var3 = ((class122) (SequenceDefinition_cachedModel.get(((long) (var2)))));
			class122 var1;
			if (var3 != null) {
				var1 = var3;
			} else {
				var3 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var2, false);
				if (var3 != null) {
					SequenceDefinition_cachedModel.put(var3, ((long) (var2)));
				}
				var1 = var3;
			}
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIIII)I", garbageValue = "-1897967162")
	static final int method3827(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZS)V", garbageValue = "26429")
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = DevicePcmPlayerProvider.fontPlain12.lineWidth(var0, 250);
			int var6 = DevicePcmPlayerProvider.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215);
			DevicePcmPlayerProvider.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var2 + var2 + var6;
			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.field703[var11] = true;
				}
			}
			if (var1) {
				Message.rasterProvider.drawFull(0, 0);
			} else {
				var11 = var3;
				int var12 = var4;
				int var13 = var5;
				int var14 = var6;
				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) {
					if (Client.rootWidgetXs[var15] + Client.rootWidgetWidths[var15] > var11 && Client.rootWidgetXs[var15] < var13 + var11 && Client.rootWidgetYs[var15] + Client.rootWidgetHeights[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) {
						Client.field704[var15] = true;
					}
				}
			}
		}
	}
}