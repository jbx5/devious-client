import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gd")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("c")
	static boolean field2198;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -274023937
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("m")
	public Map field2201;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1128373281
	)
	int field2202;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2052672279
	)
	int field2209;
	@ObfuscatedName("v")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("h")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("t")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1066943779
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("b")
	int[] field2200;
	@ObfuscatedName("a")
	boolean[] field2210;
	@ObfuscatedName("l")
	public boolean field2211;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1146243941
	)
	public int field2212;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1445095861
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 281864239
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1205456445
	)
	public int field2215;
	@ObfuscatedName("r")
	public boolean field2194;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1902123473
	)
	public int field2217;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -933411461
	)
	public int field2218;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1104732541
	)
	public int field2219;

	static {
		field2198 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 21
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 22
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 23
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 24
		this.field2202 = 0;
		this.field2209 = 0; // L: 27
		this.frameCount = -1; // L: 32
		this.field2211 = false; // L: 35
		this.field2212 = 5; // L: 36
		this.shield = -1; // L: 37
		this.weapon = -1; // L: 38
		this.field2215 = 99; // L: 39
		this.field2194 = false; // L: 40
		this.field2217 = -1; // L: 41
		this.field2218 = -1; // L: 42
		this.field2219 = 2; // L: 43
	} // L: 45

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "45526819"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 64
			if (var2 == 0) { // L: 65
				return; // L: 68
			}

			this.decodeNext(var1, var2); // L: 66
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "29"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 71
			var3 = var1.readUnsignedShort(); // L: 72
			this.frameLengths = new int[var3]; // L: 73

			for (var4 = 0; var4 < var3; ++var4) { // L: 74
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 75

			for (var4 = 0; var4 < var3; ++var4) { // L: 76
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 79
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 80
			var3 = var1.readUnsignedByte(); // L: 81
			this.field2200 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2200[var4] = var1.readUnsignedByte();
			}

			this.field2200[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2211 = true;
		} else if (var2 == 5) { // L: 87
			this.field2212 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2215 = var1.readUnsignedByte(); // L: 91
			this.field2194 = true; // L: 92
		} else if (var2 == 9) { // L: 94
			this.field2217 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 95
			this.field2218 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 96
			this.field2219 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 97
			var3 = var1.readUnsignedByte(); // L: 98
			this.chatFrameIds = new int[var3]; // L: 99

			for (var4 = 0; var4 < var3; ++var4) { // L: 100
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 101
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 103
			var3 = var1.readUnsignedByte(); // L: 104
			this.soundEffects = new int[var3]; // L: 105

			for (var4 = 0; var4 < var3; ++var4) { // L: 106
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 108
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 109
		} else if (var2 == 15) { // L: 111
			var3 = var1.readUnsignedShort(); // L: 112
			this.field2201 = new HashMap(); // L: 113

			for (var4 = 0; var4 < var3; ++var4) { // L: 114
				int var5 = var1.readUnsignedShort(); // L: 115
				int var6 = var1.readMedium(); // L: 116
				this.field2201.put(var5, var6); // L: 117
			}
		} else if (var2 == 16) { // L: 120
			this.field2202 = var1.readUnsignedShort(); // L: 121
			this.field2209 = var1.readUnsignedShort(); // L: 122
		} else if (var2 == 17) { // L: 124
			this.field2210 = new boolean[256]; // L: 125

			for (var3 = 0; var3 < this.field2210.length; ++var3) { // L: 126
				this.field2210[var3] = false; // L: 127
			}

			var3 = var1.readUnsignedByte(); // L: 129

			for (var4 = 0; var4 < var3; ++var4) { // L: 130
				this.field2210[var1.readUnsignedByte()] = true; // L: 131
			}
		}

	} // L: 135

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1766094362"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2217 == -1) { // L: 138
			if (this.field2200 == null && this.field2210 == null) { // L: 139
				this.field2217 = 0; // L: 140
			} else {
				this.field2217 = 2;
			}
		}

		if (this.field2218 == -1) { // L: 142
			if (this.field2200 == null && this.field2210 == null) { // L: 143
				this.field2218 = 0; // L: 144
			} else {
				this.field2218 = 2;
			}
		}

	} // L: 146

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lha;IB)Lha;",
		garbageValue = "-123"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 149
			var2 = this.frameIds[var2]; // L: 150
			Frames var5 = ViewportMouse.getFrames(var2 >> 16); // L: 151
			var2 &= 65535; // L: 152
			if (var5 == null) { // L: 153
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 154
				var4.animate(var5, var2); // L: 155
				return var4; // L: 156
			}
		} else {
			class123 var3 = ItemComposition.method3910(this.SequenceDefinition_cachedModelId); // L: 159
			if (var3 == null) { // L: 160
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2931()); // L: 161
				var4.method4601(var3, var2); // L: 162
				return var4; // L: 163
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIB)Lha;",
		garbageValue = "-115"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 168
			var2 = this.frameIds[var2]; // L: 169
			Frames var6 = ViewportMouse.getFrames(var2 >> 16); // L: 170
			var2 &= 65535; // L: 171
			if (var6 == null) { // L: 172
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 173
				var3 &= 3; // L: 174
				if (var3 == 1) { // L: 175
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 176
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 177
				}

				var5.animate(var6, var2); // L: 178
				if (var3 == 1) { // L: 179
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 180
					var5.rotateY180();
				} else if (var3 == 3) { // L: 181
					var5.rotateY270Ccw();
				}

				return var5; // L: 182
			}
		} else {
			class123 var4 = ItemComposition.method3910(this.SequenceDefinition_cachedModelId); // L: 185
			if (var4 == null) { // L: 186
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2931()); // L: 187
				var3 &= 3; // L: 188
				if (var3 == 1) { // L: 189
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 190
					var5.rotateY180();
				} else if (var3 == 3) { // L: 191
					var5.rotateY90Ccw();
				}

				var5.method4601(var4, var2); // L: 192
				if (var3 == 1) { // L: 193
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 194
				} else if (var3 == 3) { // L: 195
					var5.rotateY270Ccw();
				}

				return var5; // L: 196
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lha;II)Lha;",
		garbageValue = "1665587932"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 201
			var2 = this.frameIds[var2]; // L: 202
			Frames var5 = ViewportMouse.getFrames(var2 >> 16); // L: 203
			var2 &= 65535; // L: 204
			if (var5 == null) { // L: 205
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 206
				var4.animate(var5, var2); // L: 207
				return var4; // L: 208
			}
		} else {
			class123 var3 = ItemComposition.method3910(this.SequenceDefinition_cachedModelId); // L: 211
			if (var3 == null) { // L: 212
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2931()); // L: 213
				var4.method4601(var3, var2); // L: 214
				return var4; // L: 215
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILgd;IB)Lha;",
		garbageValue = "11"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2198 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 220
			return this.method3958(var1, var2, var3, var4); // L: 221
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 223
			boolean var6 = false; // L: 224
			Frames var7 = null; // L: 225
			Skeleton var8 = null; // L: 226
			class123 var9;
			if (this.isCachedModelIdSet()) { // L: 227
				var9 = this.method3937(); // L: 228
				if (var9 == null) { // L: 229
					return var5; // L: 230
				}

				if (var3.isCachedModelIdSet() && this.field2210 == null) { // L: 232
					var5.method4601(var9, var2); // L: 233
					return var5; // L: 234
				}

				var8 = var9.field1516; // L: 236
				var5.method4517(var8, var9, var2, this.field2210, false, !var3.isCachedModelIdSet()); // L: 237
			} else {
				var2 = this.frameIds[var2]; // L: 240
				var7 = ViewportMouse.getFrames(var2 >> 16); // L: 241
				var2 &= 65535; // L: 242
				if (var7 == null) { // L: 243
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2200 == null || var4 == -1)) { // L: 244
					var5.animate(var7, var2); // L: 245
					return var5; // L: 246
				}

				if (this.field2200 == null || var4 == -1) { // L: 248
					var5.animate(var7, var2); // L: 249
					return var5; // L: 250
				}

				var6 = var3.isCachedModelIdSet(); // L: 252
				if (!var6) { // L: 253
					var5.method4522(var7, var2, this.field2200, false); // L: 254
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 257
				var9 = var3.method3937(); // L: 258
				if (var9 == null) { // L: 259
					return var5; // L: 260
				}

				if (var8 == null) { // L: 262
					var8 = var9.field1516; // L: 263
				}

				var5.method4517(var8, var9, var4, this.field2210, true, true); // L: 265
			} else {
				var4 = var3.frameIds[var4]; // L: 268
				Frames var10 = ViewportMouse.getFrames(var4 >> 16); // L: 269
				var4 &= 65535; // L: 270
				if (var10 == null) { // L: 271
					return this.transformActorModel(var1, var2);
				}

				var5.method4522(var10, var4, this.field2200, true); // L: 272
			}

			if (var6 && var7 != null) { // L: 274
				var5.method4522(var7, var2, this.field2200, false); // L: 275
			}

			var5.resetBounds(); // L: 277
			return var5; // L: 278
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILgd;II)Lha;",
		garbageValue = "1315162548"
	)
	Model method3958(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 282
		Frames var5 = ViewportMouse.getFrames(var2 >> 16); // L: 283
		var2 &= 65535; // L: 284
		if (var5 == null) { // L: 285
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 286
			Frames var6 = ViewportMouse.getFrames(var4 >> 16); // L: 287
			var4 &= 65535; // L: 288
			Model var7;
			if (var6 == null) { // L: 289
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 290
				var7.animate(var5, var2); // L: 291
				return var7; // L: 292
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 294
				var7.animate2(var5, var2, var6, var4, this.field2200); // L: 295
				return var7; // L: 296
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lha;II)Lha;",
		garbageValue = "2145195358"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 300
			int var3 = this.frameIds[var2]; // L: 301
			Frames var4 = ViewportMouse.getFrames(var3 >> 16); // L: 302
			var3 &= 65535; // L: 303
			if (var4 == null) { // L: 304
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 305
				int var6 = 0; // L: 306
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 307
					var6 = this.chatFrameIds[var2]; // L: 308
					var5 = ViewportMouse.getFrames(var6 >> 16); // L: 309
					var6 &= 65535; // L: 310
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 312
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 317
					var7.animate(var4, var3); // L: 318
					var7.animate(var5, var6); // L: 319
					return var7; // L: 320
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 313
					var7.animate(var4, var3); // L: 314
					return var7; // L: 315
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 323
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "57"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 328
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	public int method3950() {
		return this.field2209 - this.field2202; // L: 332
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Ldy;",
		garbageValue = "938787548"
	)
	class123 method3937() {
		return this.isCachedModelIdSet() ? ItemComposition.method3910(this.SequenceDefinition_cachedModelId) : null; // L: 373 374 377
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnw;",
		garbageValue = "-74"
	)
	public static class389 method3974() {
		synchronized(class389.field4437) { // L: 25
			if (class389.field4439 == 0) { // L: 26
				return new class389();
			} else {
				class389.field4437[--class389.field4439].method7172(); // L: 28
				return class389.field4437[class389.field4439]; // L: 29
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-614759671"
	)
	static int method3977(int var0, Script var1, boolean var2) {
		Widget var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1329
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1330
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1331
			return 1; // L: 1332
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1334
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1338
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.text; // L: 1339
			return 1; // L: 1340
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1342
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1343
			return 1; // L: 1344
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1346
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1350
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1354
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1355
			return 1; // L: 1356
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1358
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1359
			return 1; // L: 1360
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1362
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1363
			return 1; // L: 1364
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1366
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1367
			return 1; // L: 1368
		} else if (var0 == 2610) { // L: 1370
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1374
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1378
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1379
			return 1; // L: 1380
		} else if (var0 == 2613) { // L: 1382
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1386
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1387
			return 1; // L: 1388
		} else {
			return 2; // L: 1390
		}
	}
}
