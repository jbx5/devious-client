import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1506750069
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1361943361
	)
	@Export("id")
	int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -455859265
	)
	@Export("model")
	int model;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ad")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ax")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 231578805
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1039968077
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1204826743
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1304292829
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1322677663
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -357889571
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1382901153
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2044853295
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 432108275
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1037945215
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1144197189
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bc")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("by")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("br")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bn")
	public String[][] field2257;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 356693807
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1804503545
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -248398659
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 80021283
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1597063077
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2113142537
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -2081412029
	)
	int field2264;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1826691607
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 958671385
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 165413545
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 381039309
	)
	int field2268;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -897927899
	)
	int field2269;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1066789621
	)
	int field2270;
	@ObfuscatedName("cb")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cd")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1645774315
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1338868597
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1503986707
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1855579453
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1412089361
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -2076921851
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1038223529
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1995955561
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1655693585
	)
	public int field2271;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cg")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1533877969
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1376159487
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1191328669
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1610839045
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
		this.field2257 = null;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2264 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2268 = -1;
		this.field2269 = -1;
		this.field2270 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2271 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1115715186"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2271 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "8"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "-12"
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
			this.field2264 = var1.readUnsignedByte();
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
				if (this.field2257 == null) {
					this.field2257 = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.field2257[var3] == null) {
					this.field2257[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.field2257[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2271 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2269 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2268 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2270 = var1.readUnsignedShort();
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
				this.params = DynamicObject.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lip;Lip;I)V",
		garbageValue = "-849696436"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lip;Lip;I)V",
		garbageValue = "-1401936365"
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
		this.field2268 = var2.field2268;
		this.field2269 = var2.field2269;
		this.field2270 = var2.field2270;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2271 = var2.field2271;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.field2257 != null) {
			this.field2257 = new String[5][];
			System.arraycopy(var2.field2257, 0, this.field2257, 0, 4);
		} else {
			this.field2257 = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lip;Lip;B)V",
		garbageValue = "113"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljj;",
		garbageValue = "14"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return Bounds.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4283(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljy;",
		garbageValue = "1409228859"
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
				return Bounds.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4283(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgz;I)Ljy;",
		garbageValue = "-1209961018"
	)
	public final Model method4295(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1867;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var1.field1876, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4283(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1867 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lip;",
		garbageValue = "-192439308"
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
				return Bounds.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILgz;I)Z",
		garbageValue = "1340125117"
	)
	public final boolean method4302(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null) {
			var3 = var1 == 0 ? var2.field1868 : var2.field1873;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!TransformationMatrix.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !TransformationMatrix.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !TransformationMatrix.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILgz;B)Ljj;",
		garbageValue = "18"
	)
	public final ModelData method4280(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null) {
			var3 = var1 == 0 ? var2.field1868 : var2.field1873;
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var5, 0);
					ModelData[] var9 = new ModelData[]{var6, var7, var8};
					var6 = new ModelData(var9, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var6, var7};
					var6 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var6.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2264 != 0) {
				var6.changeOffset(0, this.field2264, 0);
			}

			this.method4283(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILgz;B)Z",
		garbageValue = "-36"
	)
	public final boolean method4281(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2268;
		if (var1 == 1) {
			var3 = this.field2269;
			var4 = this.field2270;
		}

		if (var2 != null) {
			var3 = var1 == 0 ? var2.field1874 : var2.field1875;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!TransformationMatrix.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !TransformationMatrix.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILgz;I)Ljj;",
		garbageValue = "1365700545"
	)
	public final ModelData method4310(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2268;
		if (var1 == 1) {
			var3 = this.field2269;
			var4 = this.field2270;
		}

		if (var2 != null) {
			var3 = var1 == 0 ? var2.field1874 : var2.field1875;
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(TransformationMatrix.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4283(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Lgz;I)V",
		garbageValue = "1678343968"
	)
	void method4283(ModelData var1, PlayerCompositionColorTextureOverride var2) {
		short[] var3;
		short[] var4;
		int var5;
		if (this.recolorFrom != null) {
			var3 = this.recolorFrom;
			var4 = this.recolorTo;
			if (var2 != null && var2.playerCompositionRecolorTo != null && this.recolorTo.length == var2.playerCompositionRecolorTo.length) {
				var4 = var2.playerCompositionRecolorTo;
			}

			for (var5 = 0; var5 < this.recolorFrom.length; ++var5) {
				var1.recolor(var3[var5], var4[var5]);
			}
		}

		if (this.retextureFrom != null) {
			var3 = this.retextureFrom;
			var4 = this.retextureTo;
			if (var2 != null && var2.playerCompositionRetextureTo != null && this.retextureTo.length == var2.playerCompositionRetextureTo.length) {
				var4 = var2.playerCompositionRetextureTo;
			}

			for (var5 = 0; var5 < this.retextureFrom.length; ++var5) {
				var1.retexture(var3[var5], var4[var5]);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-557150157"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class180.method3850(this.params, var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1133351921"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class298.method6296(this.params, var1, var2);
	}

	@ObfuscatedName("av")
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	boolean method4273() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method4288() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	public static void method4318() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
