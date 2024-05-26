import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -558612465
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1891049619
	)
	@Export("model")
	int model;
	@ObfuscatedName("ax")
	@Export("name")
	public String name;
	@ObfuscatedName("ay")
	@Export("examine")
	public String examine;
	@ObfuscatedName("au")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("as")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("aw")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1617833383
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1257142657
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2120307137
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1016391741
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1028567095
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -314721137
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1408392127
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -427615883
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1935034199
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -687880009
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1470760447
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("be")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bg")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bu")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1867501819
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2081772481
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1763969177
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -610640497
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -918933579
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2140824901
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -400917297
	)
	int field2383;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1878716249
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -404639237
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1329993409
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1373272217
	)
	int field2369;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1483772391
	)
	int field2351;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1205093539
	)
	int field2370;
	@ObfuscatedName("by")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cw")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -311416291
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2128621985
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1545237839
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -979213605
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1806382181
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -290746929
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -560580849
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1192094443
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1014867729
	)
	public int field2332;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cr")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1892327489
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 49262071
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1391845273
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1162428887
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
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2383 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2369 = -1;
		this.field2351 = -1;
		this.field2370 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2332 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1486353790"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2332 = 0;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-122"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "0"
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
			this.field2383 = var1.readUnsignedByte();
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
				this.field2332 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2351 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2369 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2370 = var1.readUnsignedShort();
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
				this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lix;I)V",
		garbageValue = "2118422403"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lix;I)V",
		garbageValue = "-1567398201"
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
		this.field2369 = var2.field2369;
		this.field2351 = var2.field2351;
		this.field2370 = var2.field2370;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2332 = var2.field2332;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lix;I)V",
		garbageValue = "293192064"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljb;",
		garbageValue = "-1044934879"
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
				return KeyHandler.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkb;",
		garbageValue = "-1636499435"
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
				return KeyHandler.ItemDefinition_get(var2).getModel(1);
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

				var5 = var6.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lix;",
		garbageValue = "-125"
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
				return KeyHandler.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-835231710"
	)
	public final boolean method4261(int var1) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljb;",
		garbageValue = "127"
	)
	public final ModelData method4298(int var1) {
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

			if (var1 == 1 && this.field2383 != 0) {
				var5.changeOffset(0, this.field2383, 0);
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
		descriptor = "(II)Z",
		garbageValue = "488444912"
	)
	public final boolean method4244(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2369;
		if (var1 == 1) {
			var2 = this.field2351;
			var3 = this.field2370;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljb;",
		garbageValue = "-2057094345"
	)
	public final ModelData method4245(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2369;
		if (var1 == 1) {
			var2 = this.field2351;
			var3 = this.field2370;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-43"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-658334878"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return NPC.method2726(this.params, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2008218812"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1032862605"
	)
	boolean method4249() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1033541984"
	)
	boolean method4250() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-949126106"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
