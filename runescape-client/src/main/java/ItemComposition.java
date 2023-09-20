import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 31317311
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -417962209
	)
	@Export("model")
	int model;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("au")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ai")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ae")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1057998401
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1754515169
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1795204901
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1187593135
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 589547843
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 596947893
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1508632709
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -285042601
	)
	@Export("price")
	public int price;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1077195455
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1354797915
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1537489037
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bz")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bb")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bo")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1579244945
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 536012213
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -423453005
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -69179763
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1767819159
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1062172741
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1629359479
	)
	int field2275;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -522815163
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 583486365
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 539396093
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1596751627
	)
	int field2254;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 264254425
	)
	int field2280;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -838294661
	)
	int field2289;
	@ObfuscatedName("bq")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bw")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1423084955
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1833904073
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2005871123
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 465631527
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 93683157
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1328297165
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 634019943
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -376257157
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 2008718027
	)
	public int field2292;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -192885251
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -212693525
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1559146309
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 558553629
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(50);
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
		this.field2275 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2254 = -1;
		this.field2280 = -1;
		this.field2289 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2292 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1200594754"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2292 = 0;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1772742303"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "215649893"
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
			this.field2275 = var1.readUnsignedByte();
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
				this.field2292 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2280 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2254 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2289 = var1.readUnsignedShort();
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
				this.params = class167.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Liy;Liy;B)V",
		garbageValue = "-75"
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
		descriptor = "(Liy;Liy;I)V",
		garbageValue = "2123004115"
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
		this.field2254 = var2.field2254;
		this.field2280 = var2.field2280;
		this.field2289 = var2.field2289;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2292 = var2.field2292;
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
		descriptor = "(Liy;Liy;S)V",
		garbageValue = "29021"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljw;",
		garbageValue = "37"
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
				return class214.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljn;",
		garbageValue = "108"
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
				return class214.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)HealthBarDefinition_cachedSprites.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, this.model, 0);
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
				HealthBarDefinition_cachedSprites.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Liy;",
		garbageValue = "587694924"
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
				return class214.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-274386962"
	)
	public final boolean method4059(int var1) {
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
			if (!class349.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class349.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class349.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljw;",
		garbageValue = "122"
	)
	public final ModelData method4128(int var1) {
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
			ModelData var5 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, var4, 0);
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

			if (var1 == 1 && this.field2275 != 0) {
				var5.changeOffset(0, this.field2275, 0);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1156430655"
	)
	public final boolean method4061(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2254;
		if (var1 == 1) {
			var2 = this.field2280;
			var3 = this.field2289;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!class349.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class349.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljw;",
		garbageValue = "1"
	)
	public final ModelData method4062(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field2254;
		if (var1 == 1) {
			var2 = this.field2280;
			var3 = this.field2289;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class349.ItemDefinition_modelArchive, var3, 0);
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
		descriptor = "(III)I",
		garbageValue = "1786847682"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return AttackOption.method2721(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "2"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class30.method448(this.params, var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2124438684"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	boolean method4066() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method4067() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Z",
		garbageValue = "5119"
	)
	static boolean method4137(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1262407240"
	)
	public static void method4136(int var0, int var1) {
		MouseHandler.method682(var0, var1, 0, 0);
		class319.field3440.clear();
		class319.field3435.clear();
		if (class319.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			class74.method2113();
		} else {
			class319.field3435.add(new DelayFadeTask((SongTask)null, class319.musicPlayerStatus));
			class319.field3435.add(new FadeOutTask((SongTask)null, 0, false, class319.field3438));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class319.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class319.field3435.add(new class416((SongTask)null, var3));
		}

	}
}
