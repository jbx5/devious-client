import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-1424786403)

	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-1291049625)

	@Export("model")
	int model;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1089547483)

	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	2132200919)

	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	414158331)

	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	1333380267)

	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-23856347)

	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1059420037)

	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	-255409775)

	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 
	-1263710905)

	@Export("price")
	public int price;
	@ObfuscatedName("ay")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("au")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("at")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	1456259873)

	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 
	1418259267)

	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	-743899863)

	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 
	1028842285)

	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	-2010302793)

	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 
	2125070369)

	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 
	-347919981)

	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 
	1552154783)

	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	1453565087)

	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 
	-825371741)

	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	-1673807591)

	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 
	-237546465)

	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 
	-1334231601)

	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("al")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ak")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 
	-1260944307)

	@Export("note")
	public int note;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 
	-1173128683)

	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	-960009279)

	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 
	660120769)

	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 
	1619595717)

	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 
	-1280760379)

	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 
	-653241173)

	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 
	1399712671)

	@Export("team")
	public int team;
	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bt")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 
	2142919937)

	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = 
	-97110731)

	@Export("notedId")
	int notedId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 
	511512867)

	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = 
	-399396833)

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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-40965747")

	@Export("post")
	void post() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-2138867228")

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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"-1448342708")

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
				this.params = NetFileRequest.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lgz;Lgz;I)V", garbageValue = 
	"2121998029")

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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lgz;Lgz;I)V", garbageValue = 
	"1223500684")

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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lgz;Lgz;I)V", garbageValue = 
	"312351702")

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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lgt;", garbageValue = 
	"0")

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
				return class67.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lhx;", garbageValue = 
	"-63")

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
				return class67.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = ((Model) (ItemDefinition_cachedModels.get(((long) (this.id)))));
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgz;", garbageValue = 
	"-275581318")

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
				return class67.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Z", garbageValue = 
	"-1169753555")

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
			if (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if ((var3 != (-1)) && (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
				var5 = false;
			}

			if ((var4 != (-1)) && (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var4, 0))) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(ZB)Lgt;", garbageValue = 
	"-116")

	public final ModelData method3693(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var2, 0);
			if (var3 != (-1)) {
				ModelData var6 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var3, 0);
				if (var4 != (-1)) {
					ModelData var7 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var4, 0);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Z", garbageValue = 
	"-2071485201")

	public final boolean method3748(boolean var1) {
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
			if (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if ((var3 != (-1)) && (!GameEngine.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lgt;", garbageValue = 
	"2006094113")

	public final ModelData method3730(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == (-1)) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var2, 0);
			if (var3 != (-1)) {
				ModelData var5 = ModelData.ModelData_get(GameEngine.ItemDefinition_modelArchive, var3, 0);
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
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-1671267558")

	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ClanSettings.method2976(this.params, var1, var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"-464900314")

	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class19.method315(this.params, var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2083279530")

	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if ((this.shiftClickIndex != (-1)) && (this.inventoryActions != null)) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? (this.shiftClickIndex * 1031307489) * 1456259873 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-872015802")

	boolean method3763() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-21")

	boolean method3711() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"183")

	public static void method3764(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1435197973")

	static void method3751() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if ((var1[var2] != Client.combatTargetPlayerIndex) && (var1[var2] != Client.localPlayerIndex)) {
				class166.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(descriptor = 
	"(Lcw;I)Z", garbageValue = 
	"1004876196")

	static boolean method3706(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class19.localPlayer != var0) {
				var1 = (Client.drawPlayerNames & 4) != 0;
				boolean var2 = var1 || (FloorDecoration.method3981() && var0.isFriend());
				if (!var2) {
					boolean var3 = (Client.drawPlayerNames & 2) != 0;
					var2 = var3 && var0.isFriendsChatMember();
				}

				return var2;
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIB)V", garbageValue = 
	"-13")

	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (MusicPatchNode2.loadInterface(var0)) {
			Varcs.updateInterface(EnumComposition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;II)V", garbageValue = 
	"-2087809225")

	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (((var3 != null) && (var3.parentId == var1)) && ((!var3.isIf3) || (!class263.isComponentHidden(var3)))) {
				int var5;
				if (var3.type == 0) {
					if (((!var3.isIf3) && class263.isComponentHidden(var3)) && (var3 != Player.mousedOverWidgetIf1)) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						var5 = var4.group;
						if (MusicPatchNode2.loadInterface(var5)) {
							drawModelComponents(EnumComposition.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if ((var3.sequenceId != (-1)) || (var3.sequenceId2 != (-1))) {
						boolean var7 = PacketWriter.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != (-1)) {
							SequenceDefinition var6 = ItemContainer.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field550; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class290.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if ((var3.modelFrame < 0) || (var3.modelFrame >= var6.frameIds.length)) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if ((var3.field3399 != 0) && (!var3.isIf3)) {
						int var8 = var3.field3399 >> 16;
						var5 = (var3.field3399 << 16) >> 16;
						var8 *= Client.field550;
						var5 *= Client.field550;
						var3.modelAngleX = (var8 + var3.modelAngleX) & 2047;
						var3.modelAngleY = (var5 + var3.modelAngleY) & 2047;
						class290.invalidateWidget(var3);
					}
				}
			}
		}

	}
}