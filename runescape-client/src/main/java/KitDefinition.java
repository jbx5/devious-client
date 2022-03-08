import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fb")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("KitDefinition_archive")
    static AbstractArchive KitDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("KitDefinition_modelsArchive")
    static AbstractArchive KitDefinition_modelsArchive;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("KitDefinition_cached")
    public static EvictingDualNodeHashTable KitDefinition_cached;

    @ObfuscatedName("ew")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive13")
    static Archive archive13;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 881058349)
    @Export("bodypartID")
    public int bodypartID;

    @ObfuscatedName("o")
    @Export("models2")
    int[] models2;

    @ObfuscatedName("i")
    @Export("recolorFrom")
    short[] recolorFrom;

    @ObfuscatedName("w")
    @Export("recolorTo")
    short[] recolorTo;

    @ObfuscatedName("v")
    @Export("retextureFrom")
    short[] retextureFrom;

    @ObfuscatedName("a")
    @Export("retextureTo")
    short[] retextureTo;

    @ObfuscatedName("y")
    @Export("models")
    int[] models;

    @ObfuscatedName("u")
    @Export("nonSelectable")
    public boolean nonSelectable;

    static {
        KitDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    KitDefinition() {
        this.bodypartID = -1;
        this.models = new int[]{ -1, -1, -1, -1, -1 };
        this.nonSelectable = false;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "2132914364")
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
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-1190059495")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.bodypartID = var1.readUnsignedByte();
        } else {
            int var3;
            int var4;
            if (var2 == 2) {
                var3 = var1.readUnsignedByte();
                this.models2 = new int[var3];
                for (var4 = 0; var4 < var3; ++var4) {
                    this.models2[var4] = var1.readUnsignedShort();
                }
            } else if (var2 == 3) {
                this.nonSelectable = true;
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
            } else if ((var2 >= 60) && (var2 < 70)) {
                this.models[var2 - 60] = var1.readUnsignedShort();
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "338194552")
    @Export("ready")
    public boolean ready() {
        if (this.models2 == null) {
            return true;
        } else {
            boolean var1 = true;
            for (int var2 = 0; var2 < this.models2.length; ++var2) {
                if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)Lgq;", garbageValue = "70436420")
    @Export("getModelData")
    public ModelData getModelData() {
        if (this.models2 == null) {
            return null;
        } else {
            ModelData[] var1 = new ModelData[this.models2.length];
            for (int var2 = 0; var2 < this.models2.length; ++var2) {
                var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
            }
            ModelData var4;
            if (var1.length == 1) {
                var4 = var1[0];
            } else {
                var4 = new ModelData(var1, var1.length);
            }
            int var3;
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
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1914002715")
    public boolean method3211() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; ++var2) {
            if ((this.models[var2] != (-1)) && (!KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0))) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)Lgq;", garbageValue = "-566809681")
    @Export("getKitDefinitionModels")
    public ModelData getKitDefinitionModels() {
        ModelData[] var1 = new ModelData[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; ++var3) {
            if (this.models[var3] != (-1)) {
                var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
            }
        }
        ModelData var5 = new ModelData(var1, var2);
        int var4;
        if (this.recolorFrom != null) {
            for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
                var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
            }
        }
        if (this.retextureFrom != null) {
            for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
                var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
            }
        }
        return var5;
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "78")
    @Export("hslToRgb")
    static final int hslToRgb(int var0, int var1, int var2) {
        if (var2 > 179) {
            var1 /= 2;
        }
        if (var2 > 192) {
            var1 /= 2;
        }
        if (var2 > 217) {
            var1 /= 2;
        }
        if (var2 > 243) {
            var1 /= 2;
        }
        int var3 = (((var1 / 32) << 7) + ((var0 / 4) << 10)) + (var2 / 2);
        return var3;
    }
}