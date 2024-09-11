import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 502769567
	)
	@Export("id")
	int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1460932083
	)
	@Export("model")
	int model;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ao")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("as")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("aj")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -324495311
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1361945459
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 386446141
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2002872145
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 146221969
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -777644377
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -8414531
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 535485375
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 311933229
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1668381135
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1198528189
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bj")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bp")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("by")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bb")
	public String[][] field2254;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -859697847
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1408546041
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 273334313
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -263761239
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 261457567
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 575554467
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -563399797
	)
	int field2261;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1947311745
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1247828415
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1170943015
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -2002107399
	)
	int field2265;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 198605767
	)
	int field2266;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 285576259
	)
	int field2257;
	@ObfuscatedName("ch")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cf")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 404832843
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1789641365
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 231860173
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2093216237
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 575743429
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1504865705
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 2144552575
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -665072939
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1348275849
	)
	public int field2278;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cq")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 158178209
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 427861615
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2096386953
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -250423299
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.examine = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleModel2 = -1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.field2254 = null;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2261 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2265 = -1;
		this.field2266 = -1;
		this.field2257 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2278 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1896407397"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2278 = 0;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "37"
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
		descriptor = "(Lvf;II)V",
		garbageValue = "1285422287"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 3) {
			this.examine = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) {
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort();
			this.field2261 = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 43) {
				var3 = var1.readUnsignedByte();
				if (this.field2254 == null) {
					this.field2254 = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.field2254[var3] == null) {
					this.field2254[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.field2254[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2278 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2266 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2265 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2257 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = class166.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;I)V",
		garbageValue = "1101916789"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.examine = "Swap this note at any bank for the equivalent item";
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;I)V",
		garbageValue = "-1890794964"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.examine = var2.examine;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.field2265 = var2.field2265;
		this.field2266 = var2.field2266;
		this.field2257 = var2.field2257;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2278 = var2.field2278;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.field2254 != null) {
			this.field2254 = new String[5][];
			System.arraycopy(var2.field2254, 0, this.field2254, 0, 4);
		} else {
			this.field2254 = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;B)V",
		garbageValue = "0"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.examine = var2.examine;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "803539935"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return MouseRecorder.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-436503456"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return MouseRecorder.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-1869633315"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return MouseRecorder.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	public final boolean method4284(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "85772641"
	)
	public final ModelData method4224(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2261 != 0) {
				var5.changeOffset(0, this.field2261, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1792716689"
	)
	public final boolean method4225(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2265;
		if (var1 == 1) {
			var2 = this.field2266;
			var3 = this.field2257;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljv;",
		garbageValue = "-17"
	)
	public final ModelData method4226(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2265;
		if (var1 == 1) {
			var2 = this.field2266;
			var3 = this.field2257;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-16"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class27.method421(this.params, var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "5"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "749063098"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-124"
	)
	boolean method4229() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1511918523"
	)
	boolean method4228() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-8"
	)
	static void method4281(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class162.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}
}
