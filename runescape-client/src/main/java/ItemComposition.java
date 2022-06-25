import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gs")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 2108545751)
	static int field2148;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lmt;")
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 142649669)
	@Export("id")
	public int id;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 553949055)
	@Export("model")
	int model;

	@ObfuscatedName("k")
	@Export("name")
	public String name;

	@ObfuscatedName("h")
	@Export("recolorFrom")
	public short[] recolorFrom;

	@ObfuscatedName("x")
	@Export("recolorTo")
	public short[] recolorTo;

	@ObfuscatedName("l")
	@Export("retextureFrom")
	public short[] retextureFrom;

	@ObfuscatedName("a")
	@Export("retextureTo")
	public short[] retextureTo;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 117034067)
	@Export("zoom2d")
	public int zoom2d;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1968958487)
	@Export("xan2d")
	public int xan2d;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 497010155)
	@Export("yan2d")
	public int yan2d;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 2142239479)
	@Export("zan2d")
	public int zan2d;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 1590307369)
	@Export("offsetX2d")
	public int offsetX2d;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 2110307741)
	@Export("offsetY2d")
	public int offsetY2d;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 665211783)
	@Export("isStackable")
	public int isStackable;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 1270794781)
	@Export("price")
	public int price;

	@ObfuscatedName("al")
	@Export("isMembersOnly")
	public boolean isMembersOnly;

	@ObfuscatedName("ao")
	@Export("groundActions")
	public String[] groundActions;

	@ObfuscatedName("ab")
	@Export("inventoryActions")
	public String[] inventoryActions;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 659363445)
	@Export("shiftClickIndex")
	int shiftClickIndex;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = -1456247863)
	@Export("maleModel")
	int maleModel;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = -1755681103)
	@Export("maleModel1")
	int maleModel1;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -502498621)
	@Export("maleOffset")
	int maleOffset;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 1834954723)
	@Export("femaleModel")
	int femaleModel;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -815758567)
	@Export("femaleModel1")
	int femaleModel1;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1384966233)
	@Export("femaleOffset")
	int femaleOffset;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 1446242479)
	@Export("maleModel2")
	int maleModel2;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -1972184355)
	@Export("femaleModel2")
	int femaleModel2;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 1072268467)
	@Export("maleHeadModel")
	int maleHeadModel;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 2093699443)
	@Export("maleHeadModel2")
	int maleHeadModel2;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 774813039)
	@Export("femaleHeadModel")
	int femaleHeadModel;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 164218125)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;

	@ObfuscatedName("az")
	@Export("countobj")
	int[] countobj;

	@ObfuscatedName("av")
	@Export("countco")
	int[] countco;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -923940143)
	@Export("note")
	public int note;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = -1949641275)
	@Export("noteTemplate")
	public int noteTemplate;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 1639689769)
	@Export("resizeX")
	int resizeX;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 50323611)
	@Export("resizeY")
	int resizeY;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1107675065)
	@Export("resizeZ")
	int resizeZ;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = -776893781)
	@Export("ambient")
	public int ambient;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 484513503)
	@Export("contrast")
	public int contrast;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -1969616473)
	@Export("team")
	public int team;

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "Lpb;")
	@Export("params")
	IterableNodeHashTable params;

	@ObfuscatedName("bg")
	@Export("isTradable")
	public boolean isTradable;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = -1091413639)
	@Export("unnotedId")
	int unnotedId;

	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = 1288624393)
	@Export("notedId")
	int notedId;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 307308711)
	@Export("placeholder")
	public int placeholder;

	@ObfuscatedName("bc")
	@ObfuscatedGetter(intValue = -1966743229)
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
		this.isMembersOnly = false;
		this.groundActions = new String[]{ null, null, "Take", null, null };
		this.inventoryActions = new String[]{ null, null, null, null, "Drop" };
		this.shiftClickIndex = -2;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleOffset = 0;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleModel2 = -1;
		this.femaleModel2 = -1;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "898206035")
	@Export("post")
	void post() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "1165172162")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "987827879")
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
				this.params = LoginScreenAnimation.readStringIntParameters(var1, this.params);
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lgs;Lgs;I)V", garbageValue = "-1987499814")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lgs;Lgs;B)V", garbageValue = "-3")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lgs;Lgs;I)V", garbageValue = "-791198801")
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(II)Lgw;", garbageValue = "1000978404")
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
				return EnumComposition.ItemDefinition_get(var2).getModelData(1);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(IB)Lhy;", garbageValue = "0")
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
				return EnumComposition.ItemDefinition_get(var2).getModel(1);
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IS)Lgs;", garbageValue = "5217")
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
				return EnumComposition.ItemDefinition_get(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(ZB)Z", garbageValue = "-52")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(ZI)Lgw;", garbageValue = "969758302")
	public final ModelData method3721(boolean var1) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ZB)Z", garbageValue = "-73")
	public final boolean method3746(boolean var1) {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ZB)Lgw;", garbageValue = "-29")
	public final ModelData method3723(boolean var1) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "113")
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class124.method2818(this.params, var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "26512624")
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = ((ObjectNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = ((String) (var5.obj));
			}
		}
		return var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-31")
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * 869501405 * 659363445 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1639689769")
	boolean method3737() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-124871566")
	boolean method3728() {
		return this.retextureTo != null;
	}
}