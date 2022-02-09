import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cr")
public class class92 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1103523851)
    int field1259;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 304225625)
    int field1258;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1607522393)
    int field1257;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -534320671)
    int field1260;

    class92(int var1, int var2, int var3, int var4) {
        this.field1259 = var1;
        this.field1258 = var2;
        this.field1257 = var3;
        this.field1260 = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1046968979")
    int method2276() {
        return this.field1259;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "88")
    int method2274() {
        return this.field1258;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-243783355")
    int method2275() {
        return this.field1257;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "112")
    int method2282() {
        return this.field1260;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lcg;B)V", garbageValue = "-91")
    @Export("runScriptEvent")
    public static void runScriptEvent(ScriptEvent var0) {
        class1.runScript(var0, 500000, 475000);
    }

    @ObfuscatedName("hq")
    @ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "0")
    @Export("getTileHeight")
    static final int getTileHeight(int var0, int var1, int var2) {
        int var3 = var0 >> 7;
        int var4 = var1 >> 7;
        if ((((var3 >= 0) && (var4 >= 0)) && (var3 <= 103)) && (var4 <= 103)) {
            int var5 = var2;
            if ((var2 < 3) && ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2)) {
                var5 = var2 + 1;
            }
            int var6 = var0 & 127;
            int var7 = var1 & 127;
            int var8 = (((128 - var6) * Tiles.Tiles_heights[var5][var3][var4]) + (var6 * Tiles.Tiles_heights[var5][var3 + 1][var4])) >> 7;
            int var9 = ((var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1]) + (Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6))) >> 7;
            return ((var9 * var7) + (var8 * (128 - var7))) >> 7;
        } else {
            return 0;
        }
    }
}