import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 396408023
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 67501725
	)
	@Export("model")
	int model;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ak")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("as")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1808513671
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1469955321
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2079710603
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1439528195
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 15950827
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 97893915
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1112129761
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 505903557
	)
	@Export("price")
	public int price;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1813143259
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1201491755
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1146272737
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bn")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("by")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bc")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 676150055
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 293702471
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -652913305
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 846134699
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -823206307
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1797620825
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1529917941
	)
	int field2147;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 738183983
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 272675031
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1157073735
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1000892995
	)
	int field2183;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -496297307
	)
	int field2184;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2022806343
	)
	int field2189;
	@ObfuscatedName("bz")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bo")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -198894579
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1459112621
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1034970341
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1070590053
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 720174449
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 8808505
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1523807923
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 34330985
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -142629457
	)
	public int field2196;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cd")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1159465703
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 2006987733
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1022656111
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 193378535
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
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2147 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2183 = -1;
		this.field2184 = -1;
		this.field2189 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2196 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1706710416"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2196 = 0;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1999549861"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1482516127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
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
			this.field2147 = var1.readUnsignedByte();
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
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2196 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2184 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2183 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2189 = var1.readUnsignedShort();
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
				this.contrast = var1.readByte();
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
				this.params = WorldMapSection2.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;I)V",
		garbageValue = "-1604451846"
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
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;I)V",
		garbageValue = "346533262"
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
		this.field2183 = var2.field2183;
		this.field2184 = var2.field2184;
		this.field2189 = var2.field2189;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2196 = var2.field2196;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;B)V",
		garbageValue = "1"
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
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "-36"
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
				return class341.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lko;",
		garbageValue = "-90603822"
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
				return class341.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, this.model, 0);
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

				var5 = var6.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "1135514847"
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
				return class341.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-88"
	)
	public final boolean method3994(int var1) {
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
			if (!class166.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-155780402"
	)
	public final ModelData method3989(int var1) {
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
			ModelData var5 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var4, 0);
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

			if (var1 == 1 && this.field2147 != 0) {
				var5.changeOffset(0, this.field2147, 0);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "12"
	)
	public final boolean method4018(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2183;
		if (var1 == 1) {
			var2 = this.field2184;
			var3 = this.field2189;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!class166.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "100"
	)
	public final ModelData method3997(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2183;
		if (var1 == 1) {
			var2 = this.field2184;
			var3 = this.field2189;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var3, 0);
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
		descriptor = "(III)I",
		garbageValue = "-231958194"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "739364563"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "195810862"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1236262389"
	)
	boolean method4001() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1856052962"
	)
	boolean method3990() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1996387073"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class401.field4493[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class401.field4493[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class401.field4493[(var6 & 15) << 2 | var7 >>> 6]).append(class401.field4493[var7 & 63]);
				} else {
					var3.append(class401.field4493[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class401.field4493[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Luc;",
		garbageValue = "437145975"
	)
	static SpritePixels[] method4054() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class388.SpriteBuffer_yOffsets[var1];
			var2.subWidth = FriendsList.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class230.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = SecureUrlRequester.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		class388.SpriteBuffer_yOffsets = null;
		FriendsList.SpriteBuffer_spriteWidths = null;
		GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null;
		SecureUrlRequester.SpriteBuffer_spritePalette = null;
		class230.SpriteBuffer_pixels = null;
		return var0;
	}
}
