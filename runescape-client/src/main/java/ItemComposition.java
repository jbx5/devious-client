import java.util.Date;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fn")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ItemDefinition_cached")
    public static EvictingDualNodeHashTable ItemDefinition_cached;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ItemDefinition_cachedModels")
    public static EvictingDualNodeHashTable ItemDefinition_cachedModels;

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ItemDefinition_cachedSprites")
    public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 10175285)
    @Export("id")
    public int id;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 219671675)
    @Export("model")
    int model;

    @ObfuscatedName("p")
    @Export("name")
    public String name;

    @ObfuscatedName("n")
    @Export("recolorFrom")
    public short[] recolorFrom;

    @ObfuscatedName("m")
    @Export("recolorTo")
    public short[] recolorTo;

    @ObfuscatedName("d")
    @Export("retextureFrom")
    public short[] retextureFrom;

    @ObfuscatedName("j")
    @Export("retextureTo")
    public short[] retextureTo;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -1493883015)
    @Export("zoom2d")
    public int zoom2d;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 1925466431)
    @Export("xan2d")
    public int xan2d;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -547177487)
    @Export("yan2d")
    public int yan2d;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -382410223)
    @Export("zan2d")
    public int zan2d;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -47110387)
    @Export("offsetX2d")
    public int offsetX2d;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 816442611)
    @Export("offsetY2d")
    public int offsetY2d;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = -1422910445)
    @Export("isStackable")
    public int isStackable;

    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -784364215)
    @Export("price")
    public int price;

    @ObfuscatedName("ak")
    @Export("isMembersOnly")
    public boolean isMembersOnly;

    @ObfuscatedName("av")
    @Export("groundActions")
    public String[] groundActions;

    @ObfuscatedName("ar")
    @Export("inventoryActions")
    public String[] inventoryActions;

    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = 1209180117)
    @Export("shiftClickIndex")
    int shiftClickIndex;

    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = 1113370729)
    @Export("maleModel")
    int maleModel;

    @ObfuscatedName("aq")
    @ObfuscatedGetter(intValue = -1910819745)
    @Export("maleModel1")
    int maleModel1;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = 1412919849)
    @Export("maleOffset")
    int maleOffset;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 424745263)
    @Export("femaleModel")
    int femaleModel;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = -380747249)
    @Export("femaleModel1")
    int femaleModel1;

    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 1659014001)
    @Export("femaleOffset")
    int femaleOffset;

    @ObfuscatedName("ag")
    @ObfuscatedGetter(intValue = 555475811)
    @Export("maleModel2")
    int maleModel2;

    @ObfuscatedName("az")
    @ObfuscatedGetter(intValue = -2069455293)
    @Export("femaleModel2")
    int femaleModel2;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(intValue = 1357305835)
    @Export("maleHeadModel")
    int maleHeadModel;

    @ObfuscatedName("au")
    @ObfuscatedGetter(intValue = 78767189)
    @Export("maleHeadModel2")
    int maleHeadModel2;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -2117294067)
    @Export("femaleHeadModel")
    int femaleHeadModel;

    @ObfuscatedName("ae")
    @ObfuscatedGetter(intValue = 744408283)
    @Export("femaleHeadModel2")
    int femaleHeadModel2;

    @ObfuscatedName("an")
    @Export("countobj")
    int[] countobj;

    @ObfuscatedName("aw")
    @Export("countco")
    int[] countco;

    @ObfuscatedName("aj")
    @ObfuscatedGetter(intValue = -419650277)
    @Export("note")
    public int note;

    @ObfuscatedName("ax")
    @ObfuscatedGetter(intValue = -693825153)
    @Export("noteTemplate")
    public int noteTemplate;

    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = 1296779621)
    @Export("resizeX")
    int resizeX;

    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = 40847009)
    @Export("resizeY")
    int resizeY;

    @ObfuscatedName("am")
    @ObfuscatedGetter(intValue = 1854368879)
    @Export("resizeZ")
    int resizeZ;

    @ObfuscatedName("be")
    @ObfuscatedGetter(intValue = 924855673)
    @Export("ambient")
    public int ambient;

    @ObfuscatedName("bt")
    @ObfuscatedGetter(intValue = 1830795679)
    @Export("contrast")
    public int contrast;

    @ObfuscatedName("bn")
    @ObfuscatedGetter(intValue = 1781281599)
    @Export("team")
    public int team;

    @ObfuscatedName("bz")
    @ObfuscatedSignature(descriptor = "Lon;")
    @Export("params")
    IterableNodeHashTable params;

    @ObfuscatedName("bx")
    @Export("isTradable")
    public boolean isTradable;

    @ObfuscatedName("bd")
    @ObfuscatedGetter(intValue = -1463185163)
    @Export("unnotedId")
    int unnotedId;

    @ObfuscatedName("bg")
    @ObfuscatedGetter(intValue = -507852577)
    @Export("notedId")
    int notedId;

    @ObfuscatedName("bm")
    @ObfuscatedGetter(intValue = -433292947)
    @Export("placeholder")
    public int placeholder;

    @ObfuscatedName("bi")
    @ObfuscatedGetter(intValue = 2125854019)
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

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-1")
    @Export("post")
    void post() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "-1321920139")
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

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "174307131")
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
                this.params = class297.readStringIntParameters(var1, this.params);
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Lfn;Lfn;I)V", garbageValue = "-1378586099")
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

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lfn;Lfn;B)V", garbageValue = "2")
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

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lfn;Lfn;I)V", garbageValue = "-65024533")
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

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(IB)Lgq;", garbageValue = "-19")
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
                return Client.ItemDefinition_get(var2).getModelData(1);
            }
        }
        ModelData var4 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, this.model, 0);
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

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(IB)Lgf;", garbageValue = "1")
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
                return Client.ItemDefinition_get(var2).getModel(1);
            }
        }
        Model var5 = ((Model) (ItemDefinition_cachedModels.get(((long) (this.id)))));
        if (var5 != null) {
            return var5;
        } else {
            ModelData var6 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, this.model, 0);
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

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(IB)Lfn;", garbageValue = "39")
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
                return Client.ItemDefinition_get(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(ZB)Z", garbageValue = "29")
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
            if (!class6.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
                var5 = false;
            }
            if ((var3 != (-1)) && (!class6.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
                var5 = false;
            }
            if ((var4 != (-1)) && (!class6.ItemDefinition_modelArchive.tryLoadFile(var4, 0))) {
                var5 = false;
            }
            return var5;
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(ZI)Lgq;", garbageValue = "207147464")
    public final ModelData method3519(boolean var1) {
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
            ModelData var5 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var2, 0);
            if (var3 != (-1)) {
                ModelData var6 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var3, 0);
                if (var4 != (-1)) {
                    ModelData var7 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var4, 0);
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

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(ZI)Z", garbageValue = "-2143174120")
    public final boolean method3509(boolean var1) {
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
            if (!class6.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
                var4 = false;
            }
            if ((var3 != (-1)) && (!class6.ItemDefinition_modelArchive.tryLoadFile(var3, 0))) {
                var4 = false;
            }
            return var4;
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(ZI)Lgq;", garbageValue = "-339556470")
    public final ModelData method3521(boolean var1) {
        int var2 = this.maleHeadModel;
        int var3 = this.maleHeadModel2;
        if (var1) {
            var2 = this.femaleHeadModel;
            var3 = this.femaleHeadModel2;
        }
        if (var2 == (-1)) {
            return null;
        } else {
            ModelData var4 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var2, 0);
            if (var3 != (-1)) {
                ModelData var5 = ModelData.ModelData_get(class6.ItemDefinition_modelArchive, var3, 0);
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

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1259064286")
    @Export("getIntParam")
    public int getIntParam(int var1, int var2) {
        return UserComparator1.method7638(this.params, var1, var2);
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "-1598035032")
    @Export("getStringParam")
    public String getStringParam(int var1, String var2) {
        return class292.method5479(this.params, var1, var2);
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(S)I", garbageValue = "16759")
    @Export("getShiftClickIndex")
    public int getShiftClickIndex() {
        if ((this.shiftClickIndex != (-1)) && (this.inventoryActions != null)) {
            if (this.shiftClickIndex >= 0) {
                return this.inventoryActions[this.shiftClickIndex] != null ? (this.shiftClickIndex * 727163261) * 1209180117 : -1;
            } else {
                return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
            }
        } else {
            return -1;
        }
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-807230920")
    boolean method3525() {
        return this.recolorTo != null;
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1719436176")
    boolean method3553() {
        return this.retextureTo != null;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-108")
    static final int method3571(int var0, int var1) {
        if (var0 == (-1)) {
            return 12345678;
        } else {
            var1 = ((var0 & 127) * var1) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }
            return (var0 & 65408) + var1;
        }
    }

    @ObfuscatedName("al")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-400703400")
    static int method3572(int var0, Script var1, boolean var2) {
        String var3;
        int var9;
        if (var0 == ScriptOpcodes.APPEND_NUM) {
            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
            var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3 + var9;
            return 1;
        } else {
            String var4;
            if (var0 == ScriptOpcodes.APPEND) {
                BufferedNetSocket.Interpreter_stringStackSize -= 2;
                var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3 + var4;
                return 1;
            } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
                var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3 + class121.intToString(var9, true);
                return 1;
            } else if (var0 == ScriptOpcodes.LOWERCASE) {
                var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.toLowerCase();
                return 1;
            } else {
                int var6;
                int var10;
                if (var0 == ScriptOpcodes.FROMDATE) {
                    var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    long var13 = 86400000L * (11745L + ((long) (var10)));
                    Interpreter.Interpreter_calendar.setTime(new Date(var13));
                    var6 = Interpreter.Interpreter_calendar.get(5);
                    int var17 = Interpreter.Interpreter_calendar.get(2);
                    int var8 = Interpreter.Interpreter_calendar.get(1);
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (((var6 + "-") + Interpreter.Interpreter_MONTHS[var17]) + "-") + var8;
                    return 1;
                } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
                    if (var0 == ScriptOpcodes.TOSTRING) {
                        var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = Integer.toString(var10);
                        return 1;
                    } else if (var0 == ScriptOpcodes.COMPARE) {
                        BufferedNetSocket.Interpreter_stringStackSize -= 2;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = HitSplatDefinition.method3455(ClanSettings.compareStrings(Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1], class122.clientLanguage));
                        return 1;
                    } else {
                        int var5;
                        byte[] var11;
                        Font var12;
                        if (var0 == ScriptOpcodes.PARAHEIGHT) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_intStackSize -= 2;
                            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var11 = KitDefinition.archive13.takeFile(var5, 0);
                            var12 = new Font(var11);
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var12.lineCount(var3, var9);
                            return 1;
                        } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_intStackSize -= 2;
                            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var11 = KitDefinition.archive13.takeFile(var5, 0);
                            var12 = new Font(var11);
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var12.lineWidth(var3, var9);
                            return 1;
                        } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                            BufferedNetSocket.Interpreter_stringStackSize -= 2;
                            var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                            var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                            if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3;
                            } else {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4;
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.ESCAPE) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = AbstractFont.escapeBrackets(var3);
                            return 1;
                        } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3 + ((char) (var9));
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (DynamicObject.isCharPrintable(((char) (var10)))) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class124.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Ignored.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                            var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class118.isDigit(((char) (var10)))) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            if (var3 != null) {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.length();
                            } else {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.SUBSTRING) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_intStackSize -= 2;
                            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.substring(var9, var5);
                            return 1;
                        } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            StringBuilder var15 = new StringBuilder(var3.length());
                            boolean var16 = false;
                            for (var6 = 0; var6 < var3.length(); ++var6) {
                                char var7 = var3.charAt(var6);
                                if (var7 == '<') {
                                    var16 = true;
                                } else if (var7 == '>') {
                                    var16 = false;
                                } else if (!var16) {
                                    var15.append(var7);
                                }
                            }
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var15.toString();
                            return 1;
                        } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.indexOf(var9);
                            return 1;
                        } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                            BufferedNetSocket.Interpreter_stringStackSize -= 2;
                            var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                            var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                            var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.indexOf(var4, var5);
                            return 1;
                        } else if (var0 == 4122) {
                            var3 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.toUpperCase();
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    BufferedNetSocket.Interpreter_stringStackSize -= 2;
                    var3 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                    var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                    if ((WorldMapSprite.localPlayer.appearance != null) && WorldMapSprite.localPlayer.appearance.isFemale) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4;
                    } else {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3;
                    }
                    return 1;
                }
            }
        }
    }
}