import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1304511159)

	static int field2076;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ci")
	public static char field2121;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(intValue = 
	879723765)

	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1358562449)

	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1795914843)

	@Export("model")
	int model;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("t")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	196878577)

	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	-665001803)

	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-2086760217)

	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	273423951)

	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	371108815)

	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1462314207)

	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 
	1832984021)

	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 
	-152346525)

	@Export("price")
	public int price;
	@ObfuscatedName("aw")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("am")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ak")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 
	-822939591)

	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 
	378265163)

	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	-1588045303)

	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	570767097)

	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	-950675371)

	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	1339664031)

	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 
	-1567941563)

	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 
	707810015)

	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	1223715049)

	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	-1614579943)

	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 
	-880790519)

	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	1611595155)

	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	-112485395)

	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ax")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	1339927085)

	@Export("note")
	public int note;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 
	-1457384295)

	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 
	533172981)

	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 
	-696696217)

	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	-2002126289)

	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 
	-999686443)

	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 
	-606259097)

	@Export("contrast")
	public int contrast;
	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = 
	1632999251)

	@Export("team")
	public int team;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = 
	"Lpt;")

	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 
	815357649)

	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = 
	715906289)

	@Export("notedId")
	int notedId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 
	-1861125713)

	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(intValue = 
	1550899901)

	@Export("placeholderTemplate")
	public int placeholderTemplate;
	static 
	{
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1176456710")

	@Export("post")
	void post() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"1")

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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-46032280")

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
		} else if ((var2 >= 30) && (var2 < 35)) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if ((var2 >= 35) && (var2 < 40)) {
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
			} else if ((var2 >= 100) && (var2 < 110)) {
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
				this.params = class214.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lgf;Lgf;B)V", garbageValue = 
	"8")

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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lgf;Lgf;I)V", garbageValue = 
	"-1718664847")

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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lgf;Lgf;B)V", garbageValue = 
	"72")

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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lhc;", garbageValue = 
	"-88")

	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if ((this.countobj != null) && (var1 > 1)) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if ((var1 >= this.countco[var3]) && (this.countco[var3] != 0)) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != (-1)) {
				return class19.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (((this.resizeX != 128) || (this.resizeY != 128)) || (this.resizeZ != 128)) {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Liq;", garbageValue = 
	"973895006")

	@Export("getModel")
	public final Model getModel(int var1) {
		if ((this.countobj != null) && (var1 > 1)) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if ((var1 >= this.countco[var3]) && (this.countco[var3] != 0)) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != (-1)) {
				return class19.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = ((Model) (ItemDefinition_cachedModels.get(((long) (this.id)))));
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (((this.resizeX != 128) || (this.resizeY != 128)) || (this.resizeZ != 128)) {
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgf;", garbageValue = 
	"215636085")

	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if ((this.countobj != null) && (var1 > 1)) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if ((var1 >= this.countco[var3]) && (this.countco[var3] != 0)) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != (-1)) {
				return class19.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Z", garbageValue = 
	"-480177998")

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

		if (var2 == (-1)) {
			return true;
		} else {
			boolean var5 = true;
			if (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if ((var3 != (-1)) && (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
				var5 = false;
			}

			if ((var4 != (-1)) && (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var4, 0))) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lhc;", garbageValue = 
	"1919870676")

	public final ModelData method3719(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == (-1)) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var2, 0);
			if (var3 != (-1)) {
				ModelData var6 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var3, 0);
				if (var4 != (-1)) {
					ModelData var7 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{ var5, var6, var7 };
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{ var5, var6 };
					var5 = new ModelData(var10, 2);
				}
			}

			if ((!var1) && (this.maleOffset != 0)) {
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && (this.femaleOffset != 0)) {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Z", garbageValue = 
	"1863743835")

	public final boolean method3723(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == (-1)) {
			return true;
		} else {
			boolean var4 = true;
			if (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if ((var3 != (-1)) && (!AttackOption.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lhc;", garbageValue = 
	"-1677053945")

	public final ModelData method3718(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == (-1)) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var2, 0);
			if (var3 != (-1)) {
				ModelData var5 = ModelData.ModelData_get(AttackOption.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-1076899733")

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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;B)Ljava/lang/String;", garbageValue = 
	"20")

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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1009297979")

	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if ((this.shiftClickIndex != (-1)) && (this.inventoryActions != null)) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? (this.shiftClickIndex * (-301597175)) * (-822939591) : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-340446903")

	boolean method3722() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1275094150")

	boolean method3708() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(III)Lky;", garbageValue = 
	"1784601570")

	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class127.getWidget(var0);
		if (var1 == (-1)) {
			return var2;
		} else {
			return ((var2 != null) && (var2.children != null)) && (var1 < var2.children.length) ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"([BIII)Z", garbageValue = 
	"796340469")

	static final boolean method3771(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label70 : while (
		true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label70;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = (var7 >> 6) & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if ((((var13 > 0) && (var14 > 0)) && (var13 < 103)) && (var14 < 103)) {
						ObjectComposition var15 = class146.getObjectDefinition(var5);
						if (((((var12 != 22) || (!Client.isLowDetail)) || (var15.int1 != 0)) || (var15.interactType == 1)) || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field558;
								var3 = false;
							}

							var8 = true;
						}
					}
				} 

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			} 
		} 
	}
}