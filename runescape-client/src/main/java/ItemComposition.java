import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -163190337
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1195319881
	)
	@Export("model")
	int model;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ao")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -69298571
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2112257917
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 137011091
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1966828895
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1704892459
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -882045703
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -136732841
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1350476855
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 435680099
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1493944201
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2143296567
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bv")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bq")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bo")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1689705735
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1378659441
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1876259537
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -957723421
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -298134757
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1652189291
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2104455301
	)
	int field2218;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1826813109
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1607549661
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -262906591
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 321846629
	)
	int field2222;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1512074145
	)
	int field2223;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1292484959
	)
	int field2233;
	@ObfuscatedName("bg")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bj")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -386546403
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1466156845
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1229760533
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 911517565
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1030793615
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1274205593
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -148170885
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2023330695
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1138078011
	)
	public int field2240;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cm")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1262060089
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1383997373
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1971092783
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 575355903
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
		this.field2218 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2222 = -1;
		this.field2223 = -1;
		this.field2233 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2240 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "908624790"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2240 = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-591135841"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1732783795"
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
			this.field2218 = var1.readUnsignedByte();
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
				this.field2240 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2223 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2222 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2233 = var1.readUnsignedShort();
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
				this.params = class141.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;I)V",
		garbageValue = "-279159278"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;B)V",
		garbageValue = "74"
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
		this.field2222 = var2.field2222;
		this.field2223 = var2.field2223;
		this.field2233 = var2.field2233;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2240 = var2.field2240;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;B)V",
		garbageValue = "37"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "1090571932"
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
				return class125.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljo;",
		garbageValue = "1"
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
				return class125.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhc;",
		garbageValue = "1"
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
				return class125.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public final boolean method4040(int var1) {
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
			if (!class140.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class140.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class140.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "-1706198430"
	)
	public final ModelData method3975(int var1) {
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
			ModelData var5 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, var4, 0);
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

			if (var1 == 1 && this.field2218 != 0) {
				var5.changeOffset(0, this.field2218, 0);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1820118028"
	)
	public final boolean method3976(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2222;
		if (var1 == 1) {
			var2 = this.field2223;
			var3 = this.field2233;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!class140.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class140.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "1709950556"
	)
	public final ModelData method4027(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2222;
		if (var1 == 1) {
			var2 = this.field2223;
			var3 = this.field2233;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class140.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "655176958"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method3540(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1588687604"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "43603249"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "339"
	)
	boolean method3989() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1427886067"
	)
	boolean method3982() {
		return this.retextureTo != null;
	}
}
