import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2134458045
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 528691249
	)
	@Export("id")
	int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 338107111
	)
	@Export("model")
	int model;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("ah")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("av")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ar")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ap")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -56732873
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1088397707
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -497711391
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 301356503
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1334237225
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1858279803
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -819989127
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2091113999
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1030629591
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 991738269
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -68046891
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bv")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bu")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bp")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("br")
	public String[][] field2824;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1101480017
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1849592403
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 145018855
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 929426021
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 238148773
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -158514649
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -970219829
	)
	int field2803;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1273526925
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1939722673
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1768605623
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 782025233
	)
	int field2827;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2696903
	)
	int field2843;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1072699843
	)
	int field2829;
	@ObfuscatedName("cu")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cz")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1107133219
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1002379281
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 359983951
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -980517021
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1844516493
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 2059123331
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 709950291
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1939194631
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1352030365
	)
	public int field2786;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("co")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1274306641
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 2059231589
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -68513175
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1031962161
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
		this.field2824 = null;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2803 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2827 = -1;
		this.field2843 = -1;
		this.field2829 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2786 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1645512837"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2786 = 0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1170883582"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IB)V",
		garbageValue = "-45"
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
			this.field2803 = var1.readUnsignedByte();
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
				if (this.field2824 == null) {
					this.field2824 = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.field2824[var3] == null) {
					this.field2824[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.field2824[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2786 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2843 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2827 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2829 = var1.readUnsignedShort();
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
				this.params = class143.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;I)V",
		garbageValue = "-1514764677"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;I)V",
		garbageValue = "-605382944"
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
		this.field2827 = var2.field2827;
		this.field2843 = var2.field2843;
		this.field2829 = var2.field2829;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2786 = var2.field2786;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.field2824 != null) {
			this.field2824 = new String[5][];
			System.arraycopy(var2.field2824, 0, this.field2824, 0, 4);
		} else {
			this.field2824 = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;B)V",
		garbageValue = "-64"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lgm;",
		garbageValue = "2127274401"
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
				return Player.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhr;",
		garbageValue = "55"
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
				return Player.ItemDefinition_get(var2).getModel(1);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-874771241"
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
				return Player.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1620709545"
	)
	public final boolean method5173(int var1) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgm;",
		garbageValue = "-37"
	)
	public final ModelData method5174(int var1) {
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

			if (var1 == 1 && this.field2803 != 0) {
				var5.changeOffset(0, this.field2803, 0);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public final boolean method5227(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2827;
		if (var1 == 1) {
			var2 = this.field2843;
			var3 = this.field2829;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lgm;",
		garbageValue = "-699783578"
	)
	public final ModelData method5176(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2827;
		if (var1 == 1) {
			var2 = this.field2843;
			var3 = this.field2829;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1639043521"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1962522120"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Archive.method7241(this.params, var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-379483845"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method5222() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "705260141"
	)
	boolean method5208() {
		return this.retextureTo != null;
	}
}
