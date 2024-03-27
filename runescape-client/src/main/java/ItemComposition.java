import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 610943889
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 89446857
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -331366277
	)
	@Export("model")
	int model;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ay")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ap")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("aa")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1102837677
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 503649653
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1943737471
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -661785609
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1979973685
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1395029919
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -718484241
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1025691377
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2019263849
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -898322847
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -2128979135
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bx")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bl")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bh")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -835128691
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1528055805
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1128123567
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1577591191
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1194586729
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1057903281
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1790553163
	)
	int field2307;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 898507413
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1686684813
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 397634165
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1925379179
	)
	int field2320;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1012196935
	)
	int field2308;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -237416595
	)
	int field2342;
	@ObfuscatedName("bg")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cb")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -959673499
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 185590851
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 912600711
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1131354191
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1535121285
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1608007329
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -451149597
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -77241073
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 201086427
	)
	public int field2325;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cc")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -535511093
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 2100018853
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1456235845
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -220858723
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
		this.field2307 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2320 = -1;
		this.field2308 = -1;
		this.field2342 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2325 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6686"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2325 = 0;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "35"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "1"
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
			this.field2307 = var1.readUnsignedByte();
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
				this.field2325 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2308 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2320 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2342 = var1.readUnsignedShort();
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
				this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "215888205"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "881834881"
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
		this.field2320 = var2.field2320;
		this.field2308 = var2.field2308;
		this.field2342 = var2.field2342;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2325 = var2.field2325;
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
		descriptor = "(Lid;Lid;S)V",
		garbageValue = "16384"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljj;",
		garbageValue = "100"
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
				return HttpRequest.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljn;",
		garbageValue = "47"
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
				return HttpRequest.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "967095729"
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
				return HttpRequest.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "851849474"
	)
	public final boolean method4141(int var1) {
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
			if (!WorldMapSectionType.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !WorldMapSectionType.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !WorldMapSectionType.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljj;",
		garbageValue = "1536981242"
	)
	public final ModelData method4142(int var1) {
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
			ModelData var5 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, var4, 0);
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

			if (var1 == 1 && this.field2307 != 0) {
				var5.changeOffset(0, this.field2307, 0);
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
		garbageValue = "815400903"
	)
	public final boolean method4143(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2320;
		if (var1 == 1) {
			var2 = this.field2308;
			var3 = this.field2342;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!WorldMapSectionType.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !WorldMapSectionType.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljj;",
		garbageValue = "-79"
	)
	public final ModelData method4162(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2320;
		if (var1 == 1) {
			var2 = this.field2308;
			var3 = this.field2342;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(WorldMapSectionType.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2030562724"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Sound.method4074(this.params, var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1342151957"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1925456075"
	)
	boolean method4200() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1592503972"
	)
	boolean method4149() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1432293746"
	)
	static void method4204(int var0) {
		Message.tempMenuAction = new MenuAction();
		Message.tempMenuAction.param0 = Client.menuArguments1[var0];
		Message.tempMenuAction.param1 = Client.menuArguments2[var0];
		Message.tempMenuAction.opcode = Client.menuOpcodes[var0];
		Message.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		Message.tempMenuAction.itemId = Client.menuItemIds[var0];
		Message.tempMenuAction.action = Client.menuActions[var0];
		Message.tempMenuAction.target = Client.menuTargets[var0];
	}
}
