import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ge")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;

	@ObfuscatedName("j")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1697092487)
	@Export("id")
	public int id;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1585601327)
	@Export("model")
	int model;

	@ObfuscatedName("b")
	@Export("name")
	public String name = "null";

	@ObfuscatedName("l")
	@Export("recolorFrom")
	public short[] recolorFrom;

	@ObfuscatedName("y")
	@Export("recolorTo")
	public short[] recolorTo;

	@ObfuscatedName("k")
	@Export("retextureFrom")
	public short[] retextureFrom;

	@ObfuscatedName("v")
	@Export("retextureTo")
	public short[] retextureTo;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1167053717)
	@Export("zoom2d")
	public int zoom2d = 2000;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1928391639)
	@Export("xan2d")
	public int xan2d = 0;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 721462877)
	@Export("yan2d")
	public int yan2d = 0;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -493009947)
	@Export("zan2d")
	public int zan2d = 0;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 21870283)
	@Export("offsetX2d")
	public int offsetX2d = 0;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 382722603)
	@Export("offsetY2d")
	public int offsetY2d = 0;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 544675235)
	@Export("isStackable")
	public int isStackable = 0;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 1299695001)
	@Export("price")
	public int price = 1;

	@ObfuscatedName("aj")
	@Export("isMembersOnly")
	public boolean isMembersOnly = false;

	@ObfuscatedName("au")
	@Export("groundActions")
	public String[] groundActions = new String[]{ null, null, "Take", null, null };

	@ObfuscatedName("af")
	@Export("inventoryActions")
	public String[] inventoryActions = new String[]{ null, null, null, null, "Drop" };

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 903327239)
	@Export("shiftClickIndex")
	int shiftClickIndex = -2;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -1008080273)
	@Export("maleModel")
	int maleModel = -1;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = -1024154051)
	@Export("maleModel1")
	int maleModel1 = -1;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 477344961)
	@Export("maleOffset")
	int maleOffset = 0;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = -994201417)
	@Export("femaleModel")
	int femaleModel = -1;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 2040594585)
	@Export("femaleModel1")
	int femaleModel1 = -1;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -1763818617)
	@Export("femaleOffset")
	int femaleOffset = 0;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 967603315)
	@Export("maleModel2")
	int maleModel2 = -1;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -334042993)
	@Export("femaleModel2")
	int femaleModel2 = -1;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 440054617)
	@Export("maleHeadModel")
	int maleHeadModel = -1;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1477745815)
	@Export("maleHeadModel2")
	int maleHeadModel2 = -1;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -1569608343)
	@Export("femaleHeadModel")
	int femaleHeadModel = -1;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = -2082564961)
	@Export("femaleHeadModel2")
	int femaleHeadModel2 = -1;

	@ObfuscatedName("ae")
	@Export("countobj")
	int[] countobj;

	@ObfuscatedName("ay")
	@Export("countco")
	int[] countco;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = -292764057)
	@Export("note")
	public int note = -1;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = -457985755)
	@Export("noteTemplate")
	public int noteTemplate = -1;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 357614883)
	@Export("resizeX")
	int resizeX = 128;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -1371277655)
	@Export("resizeY")
	int resizeY = 128;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = -687076507)
	@Export("resizeZ")
	int resizeZ = 128;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 1182739607)
	@Export("ambient")
	public int ambient = 0;

	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = 1596389833)
	@Export("contrast")
	public int contrast = 0;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = -1420581219)
	@Export("team")
	public int team = 0;

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("params")
	IterableNodeHashTable params;

	@ObfuscatedName("ba")
	@Export("isTradable")
	public boolean isTradable = false;

	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = -477287585)
	@Export("unnotedId")
	int unnotedId = -1;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = -1893346121)
	@Export("notedId")
	int notedId = -1;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 2068394453)
	@Export("placeholder")
	public int placeholder = -1;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = -832411553)
	@Export("placeholderTemplate")
	public int placeholderTemplate = -1;

	ItemComposition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "607205058")
	@Export("post")
	void post() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;S)V", garbageValue = "-4398")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "-50")
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
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort();
			this.maleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
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
					this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 78) {
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
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
				this.params = class125.readStringIntParameters(var1, this.params);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lge;Lge;I)V", garbageValue = "-1402873766")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lge;Lge;I)V", garbageValue = "1300542943")
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
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}
		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lge;Lge;I)V", garbageValue = "-474283631")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)Lgw;", garbageValue = "1809583243")
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
				return class258.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IB)Lhd;", garbageValue = "-123")
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
				return class258.ItemDefinition_get(var2).getModel(1);
			}
		}
		Model var5 = ((Model) (ItemDefinition_cachedModels.get(((long) (this.id)))));
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
				ItemDefinition_cachedModels.put(var5, ((long) (this.id)));
				return var5;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)Lge;", garbageValue = "296063352")
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
				return class258.ItemDefinition_get(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(ZI)Z", garbageValue = "-1980519580")
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ZI)Lgw;", garbageValue = "-394692090")
	public final ModelData method3710(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}
		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{ var5, var6, var7 };
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{ var5, var6 };
					var5 = new ModelData(var10, 2);
				}
			}
			if (!var1 && this.maleOffset != 0) {
				var5.changeOffset(0, this.maleOffset, 0);
			}
			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ZB)Z", garbageValue = "41")
	public final boolean method3711(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ZB)Lgw;", garbageValue = "-63")
	public final ModelData method3717(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}
		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{ var4, var5 };
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1455842920")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = ((IntegerNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}
		return var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "1195722147")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Messages.method2575(this.params, var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2129241972")
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "5901")
	boolean method3716() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-773272356")
	boolean method3731() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-187084750")
	static void method3703() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.stream1 != null) {
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}
			if (var0.stream2 != null) {
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}
		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1960768573")
	public static int method3764(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = ((int) (var2 >>> 0 & 127L));
		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2074950429")
	public static void method3782() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "3")
	static void method3712() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}