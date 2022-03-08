import java.util.HashMap;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lk")
public class class317 {
    @ObfuscatedName("c")
    @Export("spriteMap")
    final HashMap spriteMap;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lna;")
    @Export("bounds")
    Bounds bounds;

    @ObfuscatedName("s")
    int[] field3968;

    @ObfuscatedName("e")
    int[] field3970;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 531245581)
    int field3967;

    public class317() {
        this.spriteMap = new HashMap();
        this.bounds = new Bounds(0, 0);
        this.field3968 = new int[2048];
        this.field3970 = new int[2048];
        this.field3967 = 0;
        WorldMapData_1.method4642();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-178971158")
    void method5762(int var1) {
        int var2 = (var1 * 2) + 1;
        double var4 = ((double) (((float) (var1)) / 3.0F));
        int var6 = (var1 * 2) + 1;
        double[] var7 = new double[var6];
        int var8 = -var1;
        for (int var9 = 0; var8 <= var1; ++var9) {
            double var16 = ((double) (var8 - 0)) / var4;
            double var14 = Math.exp(((-var16) * var16) / 2.0) / Math.sqrt(6.283185307179586);
            double var24 = var14 / var4;
            var7[var9] = var24;
            ++var8;
        }
        double[] var18 = var7;
        double var19 = var7[var1] * var7[var1];
        int[] var21 = new int[var2 * var2];
        boolean var10 = false;
        for (int var11 = 0; var11 < var2; ++var11) {
            for (int var12 = 0; var12 < var2; ++var12) {
                int var13 = var21[var12 + (var2 * var11)] = ((int) (((var18[var11] * var18[var12]) / var19) * 256.0));
                if ((!var10) && (var13 > 0)) {
                    var10 = true;
                }
            }
        }
        SpritePixels var22 = new SpritePixels(var21, var2, var2);
        this.spriteMap.put(var1, var22);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IB)Lpt;", garbageValue = "109")
    SpritePixels method5781(int var1) {
        if (!this.spriteMap.containsKey(var1)) {
            this.method5762(var1);
        }
        return ((SpritePixels) (this.spriteMap.get(var1)));
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-702903043")
    public final void method5764(int var1, int var2) {
        if (this.field3967 < this.field3968.length) {
            this.field3968[this.field3967] = var1;
            this.field3970[this.field3967] = var2;
            ++this.field3967;
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "5275")
    public final void method5765() {
        this.field3967 = 0;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(IILpt;FI)V", garbageValue = "802145631")
    public final void method5766(int var1, int var2, SpritePixels var3, float var4) {
        int var5 = ((int) (var4 * 18.0F));
        SpritePixels var6 = this.method5781(var5);
        int var7 = (var5 * 2) + 1;
        Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
        Bounds var9 = new Bounds(0, 0);
        this.bounds.setHigh(var7, var7);
        System.nanoTime();
        int var10;
        int var11;
        int var12;
        for (var10 = 0; var10 < this.field3967; ++var10) {
            var11 = this.field3968[var10];
            var12 = this.field3970[var10];
            int var13 = ((int) (var4 * ((float) (var11 - var1)))) - var5;
            int var14 = ((int) (((float) (var3.subHeight)) - (var4 * ((float) (var12 - var2))))) - var5;
            this.bounds.setLow(var13, var14);
            this.bounds.method6600(var8, var9);
            this.method5767(var6, var3, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (var10 = 0; var10 < var3.pixels.length; ++var10) {
            if (var3.pixels[var10] == 0) {
                var3.pixels[var10] = -16777216;
            } else {
                var11 = ((var3.pixels[var10] + 64) - 1) / 256;
                if (var11 <= 0) {
                    var3.pixels[var10] = -16777216;
                } else {
                    if (var11 > VerticalAlignment.field1884.length) {
                        var11 = VerticalAlignment.field1884.length;
                    }
                    var12 = VerticalAlignment.field1884[var11 - 1];
                    var3.pixels[var10] = (-16777216) | var12;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lpt;Lpt;Lna;B)V", garbageValue = "34")
    void method5767(SpritePixels var1, SpritePixels var2, Bounds var3) {
        if ((var3.highX != 0) && (var3.highY != 0)) {
            int var4 = 0;
            int var5 = 0;
            if (var3.lowX == 0) {
                var4 = var1.subWidth - var3.highX;
            }
            if (var3.lowY == 0) {
                var5 = var1.subHeight - var3.highY;
            }
            int var6 = var4 + (var5 * var1.subWidth);
            int var7 = (var2.subWidth * var3.lowY) + var3.lowX;
            for (int var8 = 0; var8 < var3.highY; ++var8) {
                for (int var9 = 0; var9 < var3.highX; ++var9) {
                    int[] var10000 = var2.pixels;
                    int var10001 = var7++;
                    var10000[var10001] += var1.pixels[var6++];
                }
                var6 += var1.subWidth - var3.highX;
                var7 += var2.subWidth - var3.highX;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)Lpg;", garbageValue = "344070416")
    static IndexedSprite method5780() {
        IndexedSprite var0 = new IndexedSprite();
        var0.width = class434.SpriteBuffer_spriteWidth;
        var0.height = class434.SpriteBuffer_spriteHeight;
        var0.xOffset = class434.SpriteBuffer_xOffsets[0];
        var0.yOffset = class434.SpriteBuffer_yOffsets[0];
        var0.subWidth = class434.SpriteBuffer_spriteWidths[0];
        var0.subHeight = Fonts.SpriteBuffer_spriteHeights[0];
        var0.palette = HealthBarUpdate.SpriteBuffer_spritePalette;
        var0.pixels = WorldMapLabelSize.SpriteBuffer_pixels[0];
        Canvas.method365();
        return var0;
    }

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1895797746")
    static int method5768(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.CLIENTCLOCK) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.cycle;
            return 1;
        } else {
            int var3;
            int var4;
            if (var0 == ScriptOpcodes.INV_GETOBJ) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class341.method6228(var3, var4);
                return 1;
            } else if (var0 == ScriptOpcodes.INV_GETNUM) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class335.ItemContainer_getCount(var3, var4);
                return 1;
            } else if (var0 == ScriptOpcodes.INV_TOTAL) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class141.method2942(var3, var4);
                return 1;
            } else if (var0 == ScriptOpcodes.INV_SIZE) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = UserComparator10.getInvDefinition(var3).size;
                return 1;
            } else if (var0 == ScriptOpcodes.STAT) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.currentLevels[var3];
                return 1;
            } else if (var0 == ScriptOpcodes.STAT_BASE) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.levels[var3];
                return 1;
            } else if (var0 == ScriptOpcodes.STAT_XP) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.experience[var3];
                return 1;
            } else {
                int var5;
                if (var0 == ScriptOpcodes.COORD) {
                    var3 = SoundSystem.Client_plane;
                    var4 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX;
                    var5 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((var4 << 14) + var5) + (var3 << 28);
                    return 1;
                } else if (var0 == ScriptOpcodes.COORDX) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3 >> 14) & 16383;
                    return 1;
                } else if (var0 == ScriptOpcodes.COORDZ) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 >> 28;
                    return 1;
                } else if (var0 == ScriptOpcodes.COORDY) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 & 16383;
                    return 1;
                } else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.isMembersWorld) ? 1 : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
                    var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class341.method6228(var3, var4);
                    return 1;
                } else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
                    var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class335.ItemContainer_getCount(var3, var4);
                    return 1;
                } else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
                    var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class141.method2942(var3, var4);
                    return 1;
                } else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
                    if (Client.staffModLevel >= 2) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.staffModLevel;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.REBOOTTIMER) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.rebootTimer;
                    return 1;
                } else if (var0 == ScriptOpcodes.MAP_WORLD) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.worldId;
                    return 1;
                } else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.runEnergy;
                    return 1;
                } else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.weight;
                    return 1;
                } else if (var0 == ScriptOpcodes.PLAYERMOD) {
                    if (Client.playerMod) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.WORLDFLAGS) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.worldProperties;
                    return 1;
                } else if (var0 == ScriptOpcodes.MOVECOORD) {
                    Interpreter.Interpreter_intStackSize -= 4;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                    var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                    var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                    int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
                    var3 += var4 << 14;
                    var3 += var5 << 28;
                    var3 += var6;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
                    return 1;
                } else if (var0 == 3326) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.field508;
                    return 1;
                } else if (var0 == 3327) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.field509;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }
}