import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fg")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
    @ObfuscatedName("c")
    @Export("ObjectDefinition_isLowDetail")
    static boolean ObjectDefinition_isLowDetail;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("ObjectDefinition_modelsArchive")
    static AbstractArchive ObjectDefinition_modelsArchive;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ObjectDefinition_cached")
    static EvictingDualNodeHashTable ObjectDefinition_cached;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ObjectDefinition_cachedModelData")
    public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ObjectDefinition_cachedEntities")
    static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ObjectDefinition_cachedModels")
    static EvictingDualNodeHashTable ObjectDefinition_cachedModels;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "[Lgq;")
    static ModelData[] field1974;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -1553411247)
    @Export("id")
    public int id;

    @ObfuscatedName("a")
    @Export("modelIds")
    int[] modelIds;

    @ObfuscatedName("y")
    @Export("models")
    int[] models;

    @ObfuscatedName("u")
    @Export("name")
    public String name;

    @ObfuscatedName("h")
    @Export("recolorFrom")
    short[] recolorFrom;

    @ObfuscatedName("q")
    @Export("recolorTo")
    short[] recolorTo;

    @ObfuscatedName("x")
    @Export("retextureFrom")
    short[] retextureFrom;

    @ObfuscatedName("p")
    @Export("retextureTo")
    short[] retextureTo;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -874098071)
    @Export("sizeX")
    public int sizeX;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 1439472669)
    @Export("sizeY")
    public int sizeY;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -2056271343)
    @Export("interactType")
    public int interactType;

    @ObfuscatedName("j")
    @Export("boolean1")
    public boolean boolean1;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1216198177)
    @Export("int1")
    public int int1;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 394909517)
    @Export("clipType")
    int clipType;

    @ObfuscatedName("t")
    @Export("nonFlatShading")
    boolean nonFlatShading;

    @ObfuscatedName("k")
    @Export("modelClipped")
    public boolean modelClipped;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1331526123)
    @Export("animationId")
    public int animationId;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 13098187)
    @Export("int2")
    public int int2;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = -754493579)
    @Export("ambient")
    int ambient;

    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -1818102315)
    @Export("contrast")
    int contrast;

    @ObfuscatedName("ak")
    @Export("actions")
    public String[] actions;

    @ObfuscatedName("av")
    @ObfuscatedGetter(intValue = -1988030117)
    @Export("mapIconId")
    public int mapIconId;

    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = 266102009)
    @Export("mapSceneId")
    public int mapSceneId;

    @ObfuscatedName("al")
    @Export("isRotated")
    boolean isRotated;

    @ObfuscatedName("aa")
    @Export("clipped")
    public boolean clipped;

    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = 16081483)
    @Export("modelSizeX")
    int modelSizeX;

    @ObfuscatedName("aq")
    @ObfuscatedGetter(intValue = -1472354909)
    @Export("modelHeight")
    int modelHeight;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = 131533909)
    @Export("modelSizeY")
    int modelSizeY;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 1524110821)
    @Export("offsetX")
    int offsetX;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = -1864346537)
    @Export("offsetHeight")
    int offsetHeight;

    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 215625127)
    @Export("offsetY")
    int offsetY;

    @ObfuscatedName("ag")
    @Export("boolean2")
    public boolean boolean2;

    @ObfuscatedName("az")
    @Export("isSolid")
    boolean isSolid;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(intValue = -2129856503)
    @Export("int3")
    public int int3;

    @ObfuscatedName("au")
    @Export("transforms")
    public int[] transforms;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -1512872241)
    @Export("transformVarbit")
    int transformVarbit;

    @ObfuscatedName("ae")
    @ObfuscatedGetter(intValue = -200423313)
    @Export("transformVarp")
    int transformVarp;

    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = -2070438449)
    @Export("ambientSoundId")
    public int ambientSoundId;

    @ObfuscatedName("aw")
    @ObfuscatedGetter(intValue = 647939657)
    @Export("int7")
    public int int7;

    @ObfuscatedName("aj")
    @ObfuscatedGetter(intValue = -546307969)
    @Export("int5")
    public int int5;

    @ObfuscatedName("ax")
    @ObfuscatedGetter(intValue = -1443851875)
    @Export("int6")
    public int int6;

    @ObfuscatedName("ah")
    @Export("soundEffectIds")
    public int[] soundEffectIds;

    @ObfuscatedName("ai")
    @Export("boolean3")
    public boolean boolean3;

    @ObfuscatedName("am")
    @ObfuscatedSignature(descriptor = "Lon;")
    @Export("params")
    IterableNodeHashTable params;

    static {
        ObjectDefinition_isLowDetail = false;
        ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
        ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
        ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
        ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
        field1974 = new ModelData[4];
    }

    ObjectComposition() {
        this.name = "null";
        this.sizeX = 1;
        this.sizeY = 1;
        this.interactType = 2;
        this.boolean1 = true;
        this.int1 = -1;
        this.clipType = -1;
        this.nonFlatShading = false;
        this.modelClipped = false;
        this.animationId = -1;
        this.int2 = 16;
        this.ambient = 0;
        this.contrast = 0;
        this.actions = new String[5];
        this.mapIconId = -1;
        this.mapSceneId = -1;
        this.isRotated = false;
        this.clipped = true;
        this.modelSizeX = 128;
        this.modelHeight = 128;
        this.modelSizeY = 128;
        this.offsetX = 0;
        this.offsetHeight = 0;
        this.offsetY = 0;
        this.boolean2 = false;
        this.isSolid = false;
        this.int3 = -1;
        this.transformVarbit = -1;
        this.transformVarp = -1;
        this.ambientSoundId = -1;
        this.int7 = 0;
        this.int5 = 0;
        this.int6 = 0;
        this.boolean3 = true;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "4")
    @Export("postDecode")
    void postDecode() {
        if (this.int1 == (-1)) {
            this.int1 = 0;
            if ((this.modelIds != null) && ((this.models == null) || (this.models[0] == 10))) {
                this.int1 = 1;
            }
            for (int var1 = 0; var1 < 5; ++var1) {
                if (this.actions[var1] != null) {
                    this.int1 = 1;
                }
            }
        }
        if (this.int3 == (-1)) {
            this.int3 = (this.interactType != 0) ? 1 : 0;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "-599873965")
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

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "1809744525")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedByte();
            if (var3 > 0) {
                if ((this.modelIds != null) && (!ObjectDefinition_isLowDetail)) {
                    var1.offset += var3 * 3;
                } else {
                    this.models = new int[var3];
                    this.modelIds = new int[var3];
                    for (var4 = 0; var4 < var3; ++var4) {
                        this.modelIds[var4] = var1.readUnsignedShort();
                        this.models[var4] = var1.readUnsignedByte();
                    }
                }
            }
        } else if (var2 == 2) {
            this.name = var1.readStringCp1252NullTerminated();
        } else if (var2 == 5) {
            var3 = var1.readUnsignedByte();
            if (var3 > 0) {
                if ((this.modelIds != null) && (!ObjectDefinition_isLowDetail)) {
                    var1.offset += var3 * 2;
                } else {
                    this.models = null;
                    this.modelIds = new int[var3];
                    for (var4 = 0; var4 < var3; ++var4) {
                        this.modelIds[var4] = var1.readUnsignedShort();
                    }
                }
            }
        } else if (var2 == 14) {
            this.sizeX = var1.readUnsignedByte();
        } else if (var2 == 15) {
            this.sizeY = var1.readUnsignedByte();
        } else if (var2 == 17) {
            this.interactType = 0;
            this.boolean1 = false;
        } else if (var2 == 18) {
            this.boolean1 = false;
        } else if (var2 == 19) {
            this.int1 = var1.readUnsignedByte();
        } else if (var2 == 21) {
            this.clipType = 0;
        } else if (var2 == 22) {
            this.nonFlatShading = true;
        } else if (var2 == 23) {
            this.modelClipped = true;
        } else if (var2 == 24) {
            this.animationId = var1.readUnsignedShort();
            if (this.animationId == 65535) {
                this.animationId = -1;
            }
        } else if (var2 == 27) {
            this.interactType = 1;
        } else if (var2 == 28) {
            this.int2 = var1.readUnsignedByte();
        } else if (var2 == 29) {
            this.ambient = var1.readByte();
        } else if (var2 == 39) {
            this.contrast = var1.readByte() * 25;
        } else if ((var2 >= 30) && (var2 < 35)) {
            this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
            if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.actions[var2 - 30] = null;
            }
        } else if (var2 == 40) {
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
        } else if (var2 == 61) {
            var1.readUnsignedShort();
        } else if (var2 == 62) {
            this.isRotated = true;
        } else if (var2 == 64) {
            this.clipped = false;
        } else if (var2 == 65) {
            this.modelSizeX = var1.readUnsignedShort();
        } else if (var2 == 66) {
            this.modelHeight = var1.readUnsignedShort();
        } else if (var2 == 67) {
            this.modelSizeY = var1.readUnsignedShort();
        } else if (var2 == 68) {
            this.mapSceneId = var1.readUnsignedShort();
        } else if (var2 == 69) {
            var1.readUnsignedByte();
        } else if (var2 == 70) {
            this.offsetX = var1.readShort();
        } else if (var2 == 71) {
            this.offsetHeight = var1.readShort();
        } else if (var2 == 72) {
            this.offsetY = var1.readShort();
        } else if (var2 == 73) {
            this.boolean2 = true;
        } else if (var2 == 74) {
            this.isSolid = true;
        } else if (var2 == 75) {
            this.int3 = var1.readUnsignedByte();
        } else if ((var2 != 77) && (var2 != 92)) {
            if (var2 == 78) {
                this.ambientSoundId = var1.readUnsignedShort();
                this.int7 = var1.readUnsignedByte();
            } else if (var2 == 79) {
                this.int5 = var1.readUnsignedShort();
                this.int6 = var1.readUnsignedShort();
                this.int7 = var1.readUnsignedByte();
                var3 = var1.readUnsignedByte();
                this.soundEffectIds = new int[var3];
                for (var4 = 0; var4 < var3; ++var4) {
                    this.soundEffectIds[var4] = var1.readUnsignedShort();
                }
            } else if (var2 == 81) {
                this.clipType = var1.readUnsignedByte() * 256;
            } else if (var2 == 82) {
                this.mapIconId = var1.readUnsignedShort();
            } else if (var2 == 89) {
                this.boolean3 = false;
            } else if (var2 == 249) {
                this.params = class297.readStringIntParameters(var1, this.params);
            }
        } else {
            this.transformVarbit = var1.readUnsignedShort();
            if (this.transformVarbit == 65535) {
                this.transformVarbit = -1;
            }
            this.transformVarp = var1.readUnsignedShort();
            if (this.transformVarp == 65535) {
                this.transformVarp = -1;
            }
            var3 = -1;
            if (var2 == 92) {
                var3 = var1.readUnsignedShort();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            var4 = var1.readUnsignedByte();
            this.transforms = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; ++var5) {
                this.transforms[var5] = var1.readUnsignedShort();
                if (this.transforms[var5] == 65535) {
                    this.transforms[var5] = -1;
                }
            }
            this.transforms[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1473166025")
    public final boolean method3475(int var1) {
        if (this.models != null) {
            for (int var4 = 0; var4 < this.models.length; ++var4) {
                if (this.models[var4] == var1) {
                    return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
                }
            }
            return true;
        } else if (this.modelIds == null) {
            return true;
        } else if (var1 != 10) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
                var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
            }
            return var2;
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "440113254")
    @Export("needsModelFiles")
    public final boolean needsModelFiles() {
        if (this.modelIds == null) {
            return true;
        } else {
            boolean var1 = true;
            for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
                var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
            }
            return var1;
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(II[[IIIII)Lgp;", garbageValue = "-2144423565")
    @Export("getEntity")
    public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var7;
        if (this.models == null) {
            var7 = ((long) (var2 + (this.id << 10)));
        } else {
            var7 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
        }
        Object var9 = ((Renderable) (ObjectDefinition_cachedEntities.get(var7)));
        if (var9 == null) {
            ModelData var10 = this.getModelData(var1, var2);
            if (var10 == null) {
                return null;
            }
            if (!this.nonFlatShading) {
                var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            } else {
                var10.ambient = ((short) (this.ambient + 64));
                var10.contrast = ((short) (this.contrast + 768));
                var10.calculateVertexNormals();
                var9 = var10;
            }
            ObjectDefinition_cachedEntities.put(((DualNode) (var9)), var7);
        }
        if (this.nonFlatShading) {
            var9 = ((ModelData) (var9)).copyModelData();
        }
        if (this.clipType >= 0) {
            if (var9 instanceof Model) {
                var9 = ((Model) (var9)).contourGround(var3, var4, var5, var6, true, this.clipType);
            } else if (var9 instanceof ModelData) {
                var9 = ((ModelData) (var9)).method3707(var3, var4, var5, var6, true, this.clipType);
            }
        }
        return ((Renderable) (var9));
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(II[[IIIIB)Lgf;", garbageValue = "0")
    @Export("getModel")
    public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var7;
        if (this.models == null) {
            var7 = ((long) (var2 + (this.id << 10)));
        } else {
            var7 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
        }
        Model var9 = ((Model) (ObjectDefinition_cachedModels.get(var7)));
        if (var9 == null) {
            ModelData var10 = this.getModelData(var1, var2);
            if (var10 == null) {
                return null;
            }
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            ObjectDefinition_cachedModels.put(var9, var7);
        }
        if (this.clipType >= 0) {
            var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
        }
        return var9;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(II[[IIIILgm;IB)Lgf;", garbageValue = "37")
    @Export("getModelDynamic")
    public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
        long var9;
        if (this.models == null) {
            var9 = ((long) (var2 + (this.id << 10)));
        } else {
            var9 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
        }
        Model var11 = ((Model) (ObjectDefinition_cachedModels.get(var9)));
        if (var11 == null) {
            ModelData var12 = this.getModelData(var1, var2);
            if (var12 == null) {
                return null;
            }
            var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            ObjectDefinition_cachedModels.put(var11, var9);
        }
        if ((var7 == null) && (this.clipType == (-1))) {
            return var11;
        } else {
            if (var7 != null) {
                var11 = var7.transformObjectModel(var11, var8, var2);
            } else {
                var11 = var11.toSharedSequenceModel(true);
            }
            if (this.clipType >= 0) {
                var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
            }
            return var11;
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(III)Lgq;", garbageValue = "-624217510")
    @Export("getModelData")
    final ModelData getModelData(int var1, int var2) {
        ModelData var3 = null;
        boolean var4;
        int var5;
        int var7;
        if (this.models == null) {
            if (var1 != 10) {
                return null;
            }
            if (this.modelIds == null) {
                return null;
            }
            var4 = this.isRotated;
            if ((var1 == 2) && (var2 > 3)) {
                var4 = !var4;
            }
            var5 = this.modelIds.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                var7 = this.modelIds[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var7)))));
                if (var3 == null) {
                    var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3732();
                    }
                    ObjectDefinition_cachedModelData.put(var3, ((long) (var7)));
                }
                if (var5 > 1) {
                    field1974[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new ModelData(field1974, var5);
            }
        } else {
            int var9 = -1;
            for (var5 = 0; var5 < this.models.length; ++var5) {
                if (this.models[var5] == var1) {
                    var9 = var5;
                    break;
                }
            }
            if (var9 == (-1)) {
                return null;
            }
            var5 = this.modelIds[var9];
            boolean var10 = this.isRotated ^ (var2 > 3);
            if (var10) {
                var5 += 65536;
            }
            var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var5)))));
            if (var3 == null) {
                var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
                if (var3 == null) {
                    return null;
                }
                if (var10) {
                    var3.method3732();
                }
                ObjectDefinition_cachedModelData.put(var3, ((long) (var5)));
            }
        }
        if (((this.modelSizeX == 128) && (this.modelHeight == 128)) && (this.modelSizeY == 128)) {
            var4 = false;
        } else {
            var4 = true;
        }
        boolean var11;
        if (((this.offsetX == 0) && (this.offsetHeight == 0)) && (this.offsetY == 0)) {
            var11 = false;
        } else {
            var11 = true;
        }
        ModelData var8 = new ModelData(var3, ((var2 == 0) && (!var4)) && (!var11), null == this.recolorFrom, null == this.retextureFrom, true);
        if ((var1 == 4) && (var2 > 3)) {
            var8.method3716(256);
            var8.changeOffset(45, 0, -45);
        }
        var2 &= 3;
        if (var2 == 1) {
            var8.method3709();
        } else if (var2 == 2) {
            var8.method3710();
        } else if (var2 == 3) {
            var8.method3733();
        }
        if (this.recolorFrom != null) {
            for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
                var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
            }
        }
        if (this.retextureFrom != null) {
            for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
                var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
            }
        }
        if (var4) {
            var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
        }
        if (var11) {
            var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
        }
        return var8;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)Lfg;", garbageValue = "-284062119")
    @Export("transform")
    public final ObjectComposition transform() {
        int var1 = -1;
        if (this.transformVarbit != (-1)) {
            var1 = class375.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != (-1)) {
            var1 = Varps.Varps_main[this.transformVarp];
        }
        int var2;
        if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
            var2 = this.transforms[var1];
        } else {
            var2 = this.transforms[this.transforms.length - 1];
        }
        return var2 != (-1) ? ParamComposition.getObjectDefinition(var2) : null;
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-37")
    @Export("getIntParam")
    public int getIntParam(int var1, int var2) {
        return UserComparator1.method7638(this.params, var1, var2);
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "1860903703")
    @Export("getStringParam")
    public String getStringParam(int var1, String var2) {
        return class292.method5479(this.params, var1, var2);
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "509031538")
    @Export("hasSound")
    public boolean hasSound() {
        if (this.transforms == null) {
            return (this.ambientSoundId != (-1)) || (this.soundEffectIds != null);
        } else {
            for (int var1 = 0; var1 < this.transforms.length; ++var1) {
                if (this.transforms[var1] != (-1)) {
                    ObjectComposition var2 = ParamComposition.getObjectDefinition(this.transforms[var1]);
                    if ((var2.ambientSoundId != (-1)) || (var2.soundEffectIds != null)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;B)I", garbageValue = "109")
    static int method3498(AbstractArchive var0, AbstractArchive var1) {
        int var2 = 0;
        String[] var3 = Login.field924;
        int var4;
        String var5;
        for (var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (var0.tryLoadFileByNames(var5, "")) {
                ++var2;
            }
        }
        var3 = Login.field925;
        for (var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (var1.tryLoadFileByNames(var5, "")) {
                ++var2;
            }
        }
        return var2;
    }

    @ObfuscatedName("fa")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "1")
    static void method3508(int var0, int var1, int var2) {
        if (var0 != 0) {
            int var3 = var0 >> 8;
            int var4 = (var0 >> 4) & 7;
            int var5 = var0 & 15;
            Client.soundEffectIds[Client.soundEffectCount] = var3;
            Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
            Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
            Client.soundEffects[Client.soundEffectCount] = null;
            int var6 = (var1 - 64) / 128;
            int var7 = (var2 - 64) / 128;
            Client.soundLocations[Client.soundEffectCount] = (var5 + (var7 << 8)) + (var6 << 16);
            ++Client.soundEffectCount;
        }
    }

    @ObfuscatedName("fx")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "467535527")
    @Export("queueSoundEffect")
    static void queueSoundEffect(int var0, int var1, int var2) {
        if (((class424.clientPreferences.soundEffectsVolume != 0) && (var1 != 0)) && (Client.soundEffectCount < 50)) {
            Client.soundEffectIds[Client.soundEffectCount] = var0;
            Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
            Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
            Client.soundEffects[Client.soundEffectCount] = null;
            Client.soundLocations[Client.soundEffectCount] = 0;
            ++Client.soundEffectCount;
        }
    }
}