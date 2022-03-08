import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jo")
@Implements("PlayerComposition")
public class PlayerComposition {
    @ObfuscatedName("v")
    public static short[] field3236;

    @ObfuscatedName("h")
    @Export("equipmentIndices")
    static final int[] equipmentIndices;

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("PlayerAppearance_cachedModels")
    static EvictingDualNodeHashTable PlayerAppearance_cachedModels;

    @ObfuscatedName("c")
    @Export("equipment")
    int[] equipment;

    @ObfuscatedName("l")
    @Export("bodyColors")
    int[] bodyColors;

    @ObfuscatedName("s")
    @Export("isFemale")
    public boolean isFemale;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1101955915)
    @Export("npcTransformId")
    public int npcTransformId;

    @ObfuscatedName("r")
    @ObfuscatedGetter(longValue = 4799938533214702255L)
    @Export("hash")
    long hash;

    @ObfuscatedName("o")
    @ObfuscatedGetter(longValue = -4769079458956676051L)
    long field3239;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "[Lff;")
    class160[] field3242;

    @ObfuscatedName("w")
    boolean field3241;

    static {
        equipmentIndices = new int[]{ 8, 11, 4, 6, 9, 7, 10 };
        PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
    }

    public PlayerComposition() {
        this.field3241 = false;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([I[Lff;Z[IZII)V", garbageValue = "1694277618")
    public void method5361(int[] var1, class160[] var2, boolean var3, int[] var4, boolean var5, int var6) {
        this.field3242 = var2;
        this.field3241 = var3;
        this.update(var1, var4, var5, var6);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "([I[IZIB)V", garbageValue = "25")
    @Export("update")
    public void update(int[] var1, int[] var2, boolean var3, int var4) {
        if (var1 == null) {
            var1 = new int[12];
            for (int var5 = 0; var5 < 7; ++var5) {
                for (int var6 = 0; var6 < UserComparator10.KitDefinition_fileCount; ++var6) {
                    KitDefinition var7 = class149.KitDefinition_get(var6);
                    if (((var7 != null) && (!var7.nonSelectable)) && (var7.bodypartID == (var5 + (var3 ? 7 : 0)))) {
                        var1[equipmentIndices[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.equipment = var1;
        this.bodyColors = var2;
        this.isFemale = var3;
        this.npcTransformId = var4;
        this.setHash();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IZB)V", garbageValue = "32")
    @Export("changeAppearance")
    public void changeAppearance(int var1, boolean var2) {
        if ((var1 != 1) || (!this.isFemale)) {
            int var3 = this.equipment[equipmentIndices[var1]];
            if (var3 != 0) {
                var3 -= 256;
                KitDefinition var4;
                do {
                    if (!var2) {
                        --var3;
                        if (var3 < 0) {
                            var3 = UserComparator10.KitDefinition_fileCount - 1;
                        }
                    } else {
                        ++var3;
                        if (var3 >= UserComparator10.KitDefinition_fileCount) {
                            var3 = 0;
                        }
                    }
                    var4 = class149.KitDefinition_get(var3);
                } while (((var4 == null) || var4.nonSelectable) || (var4.bodypartID != ((this.isFemale ? 7 : 0) + var1)) );
                this.equipment[equipmentIndices[var1]] = var3 + 256;
                this.setHash();
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "1082291273")
    public void method5393(int var1, boolean var2) {
        int var3 = this.bodyColors[var1];
        if (!var2) {
            do {
                --var3;
                if (var3 < 0) {
                    var3 = class1.field8[var1].length - 1;
                }
            } while (!BuddyRankComparator.method2513(var1, var3) );
        } else {
            do {
                ++var3;
                if (var3 >= class1.field8[var1].length) {
                    var3 = 0;
                }
            } while (!BuddyRankComparator.method2513(var1, var3) );
        }
        this.bodyColors[var1] = var3;
        this.setHash();
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-71")
    @Export("changeSex")
    public void changeSex(boolean var1) {
        if (this.isFemale != var1) {
            this.update(((int[]) (null)), this.bodyColors, var1, -1);
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "1180218700")
    @Export("write")
    public void write(Buffer var1) {
        var1.writeByte(this.isFemale ? 1 : 0);
        int var2;
        for (var2 = 0; var2 < 7; ++var2) {
            int var3 = this.equipment[equipmentIndices[var2]];
            if (var3 == 0) {
                var1.writeByte(-1);
            } else {
                var1.writeByte(var3 - 256);
            }
        }
        for (var2 = 0; var2 < 5; ++var2) {
            var1.writeByte(this.bodyColors[var2]);
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-73481198")
    @Export("setHash")
    void setHash() {
        long var1 = this.hash;
        int var3 = this.equipment[5];
        int var4 = this.equipment[9];
        this.equipment[5] = var4;
        this.equipment[9] = var3;
        this.hash = 0L;
        int var5;
        for (var5 = 0; var5 < 12; ++var5) {
            this.hash <<= 4;
            if (this.equipment[var5] >= 256) {
                this.hash += ((long) (this.equipment[var5] - 256));
            }
        }
        if (this.equipment[0] >= 256) {
            this.hash += ((long) ((this.equipment[0] - 256) >> 4));
        }
        if (this.equipment[1] >= 256) {
            this.hash += ((long) ((this.equipment[1] - 256) >> 8));
        }
        for (var5 = 0; var5 < 5; ++var5) {
            this.hash <<= 3;
            this.hash += ((long) (this.bodyColors[var5]));
        }
        this.hash <<= 1;
        this.hash += ((long) ((this.isFemale) ? 1 : 0));
        this.equipment[5] = var3;
        this.equipment[9] = var4;
        if (((0L != var1) && (var1 != this.hash)) || this.field3241) {
            PlayerAppearance_cachedModels.remove(var1);
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Lgm;ILgm;IB)Lgf;", garbageValue = "20")
    @Export("getModel")
    public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
        if (this.npcTransformId != (-1)) {
            return UserComparator10.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
        } else {
            long var5 = this.hash;
            int[] var7 = this.equipment;
            if ((var1 != null) && ((var1.shield >= 0) || (var1.weapon >= 0))) {
                var7 = new int[12];
                for (int var8 = 0; var8 < 12; ++var8) {
                    var7[var8] = this.equipment[var8];
                }
                if (var1.shield >= 0) {
                    var5 += ((long) ((var1.shield - this.equipment[5]) << 40));
                    var7[5] = var1.shield;
                }
                if (var1.weapon >= 0) {
                    var5 += ((long) ((var1.weapon - this.equipment[3]) << 48));
                    var7[3] = var1.weapon;
                }
            }
            Model var18 = ((Model) (PlayerAppearance_cachedModels.get(var5)));
            if (var18 == null) {
                boolean var9 = false;
                int var11;
                for (int var10 = 0; var10 < 12; ++var10) {
                    var11 = var7[var10];
                    if (((var11 >= 256) && (var11 < 512)) && (!class149.KitDefinition_get(var11 - 256).ready())) {
                        var9 = true;
                    }
                    if ((var11 >= 512) && (!Client.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale))) {
                        var9 = true;
                    }
                }
                if (var9) {
                    if ((-1L) != this.field3239) {
                        var18 = ((Model) (PlayerAppearance_cachedModels.get(this.field3239)));
                    }
                    if (var18 == null) {
                        return null;
                    }
                }
                if (var18 == null) {
                    ModelData[] var19 = new ModelData[12];
                    var11 = 0;
                    int var13;
                    for (int var12 = 0; var12 < 12; ++var12) {
                        var13 = var7[var12];
                        if ((var13 >= 256) && (var13 < 512)) {
                            ModelData var14 = class149.KitDefinition_get(var13 - 256).getModelData();
                            if (var14 != null) {
                                var19[var11++] = var14;
                            }
                        }
                        if (var13 >= 512) {
                            ItemComposition var22 = Client.ItemDefinition_get(var13 - 512);
                            ModelData var15 = var22.method3519(this.isFemale);
                            if (var15 != null) {
                                if (this.field3242 != null) {
                                    class160 var16 = this.field3242[var12];
                                    if (var16 != null) {
                                        int var17;
                                        if (((var16.field1745 != null) && (var22.recolorFrom != null)) && (var22.recolorTo.length == var16.field1745.length)) {
                                            for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
                                                var15.recolor(var22.recolorTo[var17], var16.field1745[var17]);
                                            }
                                        }
                                        if (((var16.field1746 != null) && (var22.retextureFrom != null)) && (var22.retextureTo.length == var16.field1746.length)) {
                                            for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
                                                var15.retexture(var22.retextureTo[var17], var16.field1746[var17]);
                                            }
                                        }
                                    }
                                }
                                var19[var11++] = var15;
                            }
                        }
                    }
                    ModelData var20 = new ModelData(var19, var11);
                    for (var13 = 0; var13 < 5; ++var13) {
                        if (this.bodyColors[var13] < class1.field8[var13].length) {
                            var20.recolor(field3236[var13], class1.field8[var13][this.bodyColors[var13]]);
                        }
                        if (this.bodyColors[var13] < class7.field40[var13].length) {
                            var20.recolor(class21.field120[var13], class7.field40[var13][this.bodyColors[var13]]);
                        }
                    }
                    var18 = var20.toModel(64, 850, -30, -50, -30);
                    PlayerAppearance_cachedModels.put(var18, var5);
                    this.field3239 = var5;
                }
            }
            if ((var1 == null) && (var3 == null)) {
                return var18;
            } else {
                Model var21;
                if ((var1 != null) && (var3 != null)) {
                    var21 = var1.applyTransformations(var18, var2, var3, var4);
                } else if (var1 != null) {
                    var21 = var1.transformActorModel(var18, var2);
                } else {
                    var21 = var3.transformActorModel(var18, var4);
                }
                return var21;
            }
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(I)Lgq;", garbageValue = "-798178876")
    @Export("getModelData")
    ModelData getModelData() {
        if (this.npcTransformId != (-1)) {
            return UserComparator10.getNpcDefinition(this.npcTransformId).getModelData();
        } else {
            boolean var1 = false;
            int var3;
            for (int var2 = 0; var2 < 12; ++var2) {
                var3 = this.equipment[var2];
                if (((var3 >= 256) && (var3 < 512)) && (!class149.KitDefinition_get(var3 - 256).method3211())) {
                    var1 = true;
                }
                if ((var3 >= 512) && (!Client.ItemDefinition_get(var3 - 512).method3509(this.isFemale))) {
                    var1 = true;
                }
            }
            if (var1) {
                return null;
            } else {
                ModelData[] var7 = new ModelData[12];
                var3 = 0;
                int var5;
                for (int var4 = 0; var4 < 12; ++var4) {
                    var5 = this.equipment[var4];
                    ModelData var6;
                    if ((var5 >= 256) && (var5 < 512)) {
                        var6 = class149.KitDefinition_get(var5 - 256).getKitDefinitionModels();
                        if (var6 != null) {
                            var7[var3++] = var6;
                        }
                    }
                    if (var5 >= 512) {
                        var6 = Client.ItemDefinition_get(var5 - 512).method3521(this.isFemale);
                        if (var6 != null) {
                            var7[var3++] = var6;
                        }
                    }
                }
                ModelData var8 = new ModelData(var7, var3);
                for (var5 = 0; var5 < 5; ++var5) {
                    if (this.bodyColors[var5] < class1.field8[var5].length) {
                        var8.recolor(field3236[var5], class1.field8[var5][this.bodyColors[var5]]);
                    }
                    if (this.bodyColors[var5] < class7.field40[var5].length) {
                        var8.recolor(class21.field120[var5], class7.field40[var5][this.bodyColors[var5]]);
                    }
                }
                return var8;
            }
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "4")
    @Export("getChatHeadId")
    public int getChatHeadId() {
        return this.npcTransformId == (-1) ? (((((this.equipment[0] << 15) + this.equipment[1]) + (this.equipment[11] << 5)) + (this.equipment[8] << 10)) + (this.bodyColors[0] << 25)) + (this.bodyColors[4] << 20) : 305419896 + UserComparator10.getNpcDefinition(this.npcTransformId).id;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IILgx;Lgi;B)Z", garbageValue = "-83")
    public static final boolean method5395(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
        int var4 = var0;
        int var5 = var1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = var0 - var6;
        int var9 = var1 - var7;
        class186.directions[var6][var7] = 99;
        class186.distances[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class186.bufferX[var10] = var0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class186.bufferY[var10001] = var1;
        int[][] var12 = var3.flags;
        while (var18 != var11) {
            var4 = class186.bufferX[var11];
            var5 = class186.bufferY[var11];
            var11 = (var11 + 1) & 4095;
            int var16 = var4 - var8;
            int var17 = var5 - var9;
            int var13 = var4 - var3.xInset;
            int var14 = var5 - var3.yInset;
            if (var2.hasArrived(2, var4, var5, var3)) {
                SecureRandomCallable.field1009 = var4;
                class7.field39 = var5;
                return true;
            }
            int var15 = class186.distances[var16][var17] + 1;
            if ((((var16 > 0) && (class186.directions[var16 - 1][var17] == 0)) && ((var12[var13 - 1][var14] & 19136782) == 0)) && ((var12[var13 - 1][var14 + 1] & 19136824) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17] = 2;
                class186.distances[var16 - 1][var17] = var15;
            }
            if ((((var16 < 126) && (class186.directions[var16 + 1][var17] == 0)) && ((var12[var13 + 2][var14] & 19136899) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136992) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17] = 8;
                class186.distances[var16 + 1][var17] = var15;
            }
            if ((((var17 > 0) && (class186.directions[var16][var17 - 1] == 0)) && ((var12[var13][var14 - 1] & 19136782) == 0)) && ((var12[var13 + 1][var14 - 1] & 19136899) == 0)) {
                class186.bufferX[var18] = var4;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16][var17 - 1] = 1;
                class186.distances[var16][var17 - 1] = var15;
            }
            if ((((var17 < 126) && (class186.directions[var16][var17 + 1] == 0)) && ((var12[var13][var14 + 2] & 19136824) == 0)) && ((var12[var13 + 1][var14 + 2] & 19136992) == 0)) {
                class186.bufferX[var18] = var4;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16][var17 + 1] = 4;
                class186.distances[var16][var17 + 1] = var15;
            }
            if ((((((var16 > 0) && (var17 > 0)) && (class186.directions[var16 - 1][var17 - 1] == 0)) && ((var12[var13 - 1][var14] & 19136830) == 0)) && ((var12[var13 - 1][var14 - 1] & 19136782) == 0)) && ((var12[var13][var14 - 1] & 19136911) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17 - 1] = 3;
                class186.distances[var16 - 1][var17 - 1] = var15;
            }
            if ((((((var16 < 126) && (var17 > 0)) && (class186.directions[var16 + 1][var17 - 1] == 0)) && ((var12[var13 + 1][var14 - 1] & 19136911) == 0)) && ((var12[var13 + 2][var14 - 1] & 19136899) == 0)) && ((var12[var13 + 2][var14] & 19136995) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17 - 1] = 9;
                class186.distances[var16 + 1][var17 - 1] = var15;
            }
            if ((((((var16 > 0) && (var17 < 126)) && (class186.directions[var16 - 1][var17 + 1] == 0)) && ((var12[var13 - 1][var14 + 1] & 19136830) == 0)) && ((var12[var13 - 1][var14 + 2] & 19136824) == 0)) && ((var12[var13][var14 + 2] & 19137016) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17 + 1] = 6;
                class186.distances[var16 - 1][var17 + 1] = var15;
            }
            if ((((((var16 < 126) && (var17 < 126)) && (class186.directions[var16 + 1][var17 + 1] == 0)) && ((var12[var13 + 1][var14 + 2] & 19137016) == 0)) && ((var12[var13 + 2][var14 + 2] & 19136992) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136995) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17 + 1] = 12;
                class186.distances[var16 + 1][var17 + 1] = var15;
            }
        } 
        SecureRandomCallable.field1009 = var4;
        class7.field39 = var5;
        return false;
    }

    @ObfuscatedName("lp")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-1596938205")
    static String method5380(String var0) {
        PlayerType[] var1 = MidiPcmStream.PlayerType_values();
        for (int var2 = 0; var2 < var1.length; ++var2) {
            PlayerType var3 = var1[var2];
            if ((var3.modIcon != (-1)) && var0.startsWith(WorldMapSectionType.method4720(var3.modIcon))) {
                var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
                break;
            }
        }
        return var0;
    }
}