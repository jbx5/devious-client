import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2143806127
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -553684211
	)
	static int field2163;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -598837123
	)
	@Export("id")
	public int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1646163065
	)
	@Export("model")
	int model;
	@ObfuscatedName("d")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("a")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("l")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1460053017
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -261244577
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1658570107
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2032633839
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1735646735
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1093919805
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1137297211
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1805375479
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ar")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("aq")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1412905137
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 134424997
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1234953319
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 461018837
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 772213887
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 682609301
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -81759793
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -575364071
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1948073339
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -586217627
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 985383009
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1648040511
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -49400473
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ay")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ag")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1636735367
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1386991035
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -571617433
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1921192503
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -455884349
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 854813893
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -935392857
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1711938343
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bi")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1854820901
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -17755037
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 730607253
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -874772881
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemComposition() {
		this.name = "null"; // L: 34
		this.zoom2d = 2000; // L: 39
		this.xan2d = 0; // L: 40
		this.yan2d = 0; // L: 41
		this.zan2d = 0; // L: 42
		this.offsetX2d = 0; // L: 43
		this.offsetY2d = 0; // L: 44
		this.isStackable = 0; // L: 45
		this.price = 1; // L: 46
		this.isMembersOnly = false; // L: 47
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 48
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 49
		this.shiftClickIndex = -2; // L: 51
		this.maleModel = -1; // L: 52
		this.maleModel1 = -1; // L: 53
		this.maleOffset = 0; // L: 54
		this.femaleModel = -1; // L: 55
		this.femaleModel1 = -1; // L: 56
		this.femaleOffset = 0; // L: 57
		this.maleModel2 = -1; // L: 58
		this.femaleModel2 = -1; // L: 59
		this.maleHeadModel = -1; // L: 60
		this.maleHeadModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.note = -1; // L: 66
		this.noteTemplate = -1; // L: 67
		this.resizeX = 128; // L: 68
		this.resizeY = 128; // L: 69
		this.resizeZ = 128; // L: 70
		this.ambient = 0; // L: 71
		this.contrast = 0; // L: 72
		this.team = 0; // L: 73
		this.isTradable = false; // L: 75
		this.unnotedId = -1; // L: 76
		this.notedId = -1; // L: 77
		this.placeholder = -1; // L: 78
		this.placeholderTemplate = -1; // L: 79
	} // L: 81

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-361877486"
	)
	@Export("post")
	void post() {
	} // L: 129

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1203744789"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 133
			if (var2 == 0) { // L: 134
				return; // L: 137
			}

			this.decodeNext(var1, var2); // L: 135
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "1874005054"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 140
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 141
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 142
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 143
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 144
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 145
			this.offsetX2d = var1.readUnsignedShort(); // L: 146
			if (this.offsetX2d > 32767) { // L: 147
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 149
			this.offsetY2d = var1.readUnsignedShort(); // L: 150
			if (this.offsetY2d > 32767) { // L: 151
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 153
			var1.readStringCp1252NullTerminated(); // L: 154
		} else if (var2 == 11) { // L: 156
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 157
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 158
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 159
			this.maleModel = var1.readUnsignedShort(); // L: 160
			this.maleOffset = var1.readUnsignedByte(); // L: 161
		} else if (var2 == 24) { // L: 163
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 164
			this.femaleModel = var1.readUnsignedShort(); // L: 165
			this.femaleOffset = var1.readUnsignedByte(); // L: 166
		} else if (var2 == 26) { // L: 168
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 169
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 170
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 171
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 173
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 174
				var3 = var1.readUnsignedByte(); // L: 175
				this.recolorFrom = new short[var3]; // L: 176
				this.recolorTo = new short[var3]; // L: 177

				for (var4 = 0; var4 < var3; ++var4) { // L: 178
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 179
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 180
				}
			} else if (var2 == 41) { // L: 183
				var3 = var1.readUnsignedByte(); // L: 184
				this.retextureFrom = new short[var3]; // L: 185
				this.retextureTo = new short[var3]; // L: 186

				for (var4 = 0; var4 < var3; ++var4) { // L: 187
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 188
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 189
				}
			} else if (var2 == 42) { // L: 192
				this.shiftClickIndex = var1.readByte(); // L: 193
			} else if (var2 == 65) { // L: 195
				this.isTradable = true;
			} else if (var2 == 78) { // L: 196
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 197
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 198
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 199
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 200
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 201
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 202
				var1.readUnsignedShort(); // L: 203
			} else if (var2 == 95) { // L: 205
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort(); // L: 206
			} else if (var2 == 98) { // L: 207
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 208
				if (this.countobj == null) { // L: 209
					this.countobj = new int[10]; // L: 210
					this.countco = new int[10]; // L: 211
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 213
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 214
			} else if (var2 == 110) { // L: 216
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 217
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 218
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 219
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 220
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 221
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 222
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 223
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 224
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 225
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 226
				this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 228

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lgk;B)V",
		garbageValue = "-75"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 231
		this.zoom2d = var1.zoom2d; // L: 232
		this.xan2d = var1.xan2d; // L: 233
		this.yan2d = var1.yan2d; // L: 234
		this.zan2d = var1.zan2d; // L: 235
		this.offsetX2d = var1.offsetX2d; // L: 236
		this.offsetY2d = var1.offsetY2d; // L: 237
		this.recolorFrom = var1.recolorFrom; // L: 238
		this.recolorTo = var1.recolorTo; // L: 239
		this.retextureFrom = var1.retextureFrom; // L: 240
		this.retextureTo = var1.retextureTo; // L: 241
		this.name = var2.name; // L: 242
		this.isMembersOnly = var2.isMembersOnly; // L: 243
		this.price = var2.price; // L: 244
		this.isStackable = 1; // L: 245
	} // L: 246

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lgk;B)V",
		garbageValue = "60"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 249
		this.zoom2d = var1.zoom2d; // L: 250
		this.xan2d = var1.xan2d; // L: 251
		this.yan2d = var1.yan2d; // L: 252
		this.zan2d = var1.zan2d; // L: 253
		this.offsetX2d = var1.offsetX2d; // L: 254
		this.offsetY2d = var1.offsetY2d; // L: 255
		this.recolorFrom = var2.recolorFrom; // L: 256
		this.recolorTo = var2.recolorTo; // L: 257
		this.retextureFrom = var2.retextureFrom; // L: 258
		this.retextureTo = var2.retextureTo; // L: 259
		this.name = var2.name; // L: 260
		this.isMembersOnly = var2.isMembersOnly; // L: 261
		this.isStackable = var2.isStackable; // L: 262
		this.maleModel = var2.maleModel; // L: 263
		this.maleModel1 = var2.maleModel1; // L: 264
		this.maleModel2 = var2.maleModel2; // L: 265
		this.femaleModel = var2.femaleModel; // L: 266
		this.femaleModel1 = var2.femaleModel1; // L: 267
		this.femaleModel2 = var2.femaleModel2; // L: 268
		this.maleHeadModel = var2.maleHeadModel; // L: 269
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 270
		this.femaleHeadModel = var2.femaleHeadModel; // L: 271
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 272
		this.team = var2.team; // L: 273
		this.groundActions = var2.groundActions; // L: 274
		this.inventoryActions = new String[5]; // L: 275
		if (var2.inventoryActions != null) { // L: 276
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 277
		this.price = 0; // L: 278
	} // L: 279

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgk;Lgk;B)V",
		garbageValue = "71"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 282
		this.zoom2d = var1.zoom2d; // L: 283
		this.xan2d = var1.xan2d; // L: 284
		this.yan2d = var1.yan2d; // L: 285
		this.zan2d = var1.zan2d; // L: 286
		this.offsetX2d = var1.offsetX2d; // L: 287
		this.offsetY2d = var1.offsetY2d; // L: 288
		this.recolorFrom = var1.recolorFrom; // L: 289
		this.recolorTo = var1.recolorTo; // L: 290
		this.retextureFrom = var1.retextureFrom; // L: 291
		this.retextureTo = var1.retextureTo; // L: 292
		this.isStackable = var1.isStackable; // L: 293
		this.name = var2.name; // L: 294
		this.price = 0; // L: 295
		this.isMembersOnly = false; // L: 296
		this.isTradable = false; // L: 297
	} // L: 298

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgu;",
		garbageValue = "22"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 301
			int var2 = -1; // L: 302

			for (var3 = 0; var3 < 10; ++var3) { // L: 303
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 304
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 306
				return UserComparator3.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 308
		if (var4 == null) { // L: 309
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 310
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 311
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 312
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 313
				}
			}

			if (this.retextureFrom != null) { // L: 316
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 317
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 318
				}
			}

			return var4; // L: 321
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "11"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 325
			int var2 = -1; // L: 326

			for (int var3 = 0; var3 < 10; ++var3) { // L: 327
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 328
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 330
				return UserComparator3.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id); // L: 332
		if (var5 != null) { // L: 333
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0); // L: 334
			if (var6 == null) { // L: 335
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 336
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 337
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 338
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 339
					}
				}

				if (this.retextureFrom != null) { // L: 342
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 343
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 344
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 347
				var5.isSingleTile = true; // L: 348
				ItemDefinition_cachedModels.put(var5, (long)this.id); // L: 349
				return var5; // L: 350
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgk;",
		garbageValue = "77"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 354
			int var2 = -1; // L: 355

			for (int var3 = 0; var3 < 10; ++var3) { // L: 356
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 357
				}
			}

			if (var2 != -1) { // L: 359
				return UserComparator3.ItemDefinition_get(var2);
			}
		}

		return this; // L: 361
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-6"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 439
		int var3 = this.maleModel1; // L: 440
		int var4 = this.maleModel2; // L: 441
		if (var1) { // L: 442
			var2 = this.femaleModel; // L: 443
			var3 = this.femaleModel1; // L: 444
			var4 = this.femaleModel2; // L: 445
		}

		if (var2 == -1) { // L: 447
			return true;
		} else {
			boolean var5 = true; // L: 448
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 449
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 450
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) { // L: 451
				var5 = false;
			}

			return var5; // L: 452
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgu;",
		garbageValue = "-188391779"
	)
	public final ModelData method3887(boolean var1) {
		int var2 = this.maleModel; // L: 456
		int var3 = this.maleModel1; // L: 457
		int var4 = this.maleModel2; // L: 458
		if (var1) { // L: 459
			var2 = this.femaleModel; // L: 460
			var3 = this.femaleModel1; // L: 461
			var4 = this.femaleModel2; // L: 462
		}

		if (var2 == -1) { // L: 464
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 465
			if (var3 != -1) { // L: 466
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 467
				if (var4 != -1) { // L: 468
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0); // L: 469
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 470
					var5 = new ModelData(var8, 3); // L: 471
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 474
					var5 = new ModelData(var10, 2); // L: 475
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 478
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 479
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 480
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 481
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 482
				}
			}

			if (this.retextureFrom != null) { // L: 485
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 486
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 487
				}
			}

			return var5; // L: 490
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1482028767"
	)
	public final boolean method3833(boolean var1) {
		int var2 = this.maleHeadModel; // L: 494
		int var3 = this.maleHeadModel2; // L: 495
		if (var1) { // L: 496
			var2 = this.femaleHeadModel; // L: 497
			var3 = this.femaleHeadModel2; // L: 498
		}

		if (var2 == -1) { // L: 500
			return true;
		} else {
			boolean var4 = true; // L: 501
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) { // L: 502
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) { // L: 503
				var4 = false;
			}

			return var4; // L: 504
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgu;",
		garbageValue = "393820523"
	)
	public final ModelData method3845(boolean var1) {
		int var2 = this.maleHeadModel; // L: 508
		int var3 = this.maleHeadModel2; // L: 509
		if (var1) { // L: 510
			var2 = this.femaleHeadModel; // L: 511
			var3 = this.femaleHeadModel2; // L: 512
		}

		if (var2 == -1) { // L: 514
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0); // L: 515
			if (var3 != -1) { // L: 516
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0); // L: 517
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 518
				var4 = new ModelData(var6, 2); // L: 519
			}

			int var7;
			if (this.recolorFrom != null) { // L: 521
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 522
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 523
				}
			}

			if (this.retextureFrom != null) { // L: 526
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 527
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 528
				}
			}

			return var4; // L: 531
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "100"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return PlayerCompositionColorTextureOverride.method3508(this.params, var1, var2); // L: 535
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1913923430"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 540
		String var3;
		if (var4 == null) { // L: 542
			var3 = var2; // L: 543
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 546
			if (var5 == null) { // L: 547
				var3 = var2; // L: 548
			} else {
				var3 = (String)var5.obj; // L: 551
			}
		}

		return var3; // L: 553
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-729061898"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 557
			if (this.shiftClickIndex >= 0) { // L: 558
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 559
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1182386805"
	)
	boolean method3848() {
		return this.recolorTo != null; // L: 578
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2044081853"
	)
	boolean method3840() {
		return this.retextureTo != null; // L: 582
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljw;",
		garbageValue = "-1843784471"
	)
	public static class264[] method3911() {
		return new class264[]{class264.field3046, class264.field3047, class264.field3057, class264.field3054, class264.field3049, class264.field3051, class264.field3052, class264.field3053, class264.field3056, class264.field3055, class264.field3050}; // L: 18
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2069793085"
	)
	public static boolean method3909(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 29
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldy;",
		garbageValue = "-33"
	)
	public static class123 method3910(int var0) {
		class123 var1 = (class123)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 382
		if (var1 != null) { // L: 383
			return var1;
		} else {
			var1 = class93.method2541(JagexCache.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 384
			if (var1 != null) { // L: 385
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 386
		}
	}
}
