import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lx")
public class class318 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Llx;")
    static final class318 field3974;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Llx;")
    static final class318 field3973;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Llx;")
    static final class318 field3975;

    static {
        field3974 = new class318();
        field3973 = new class318();
        field3975 = new class318();
    }

    class318() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;", garbageValue = "1727065508")
    public static String method5786(byte[] var0, int var1, int var2) {
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = var1;
        int var8;
        for (int var6 = var2 + var1; var5 < var6; var3[var4++] = ((char) (var8))) {
            int var7 = var0[var5++] & 255;
            if (var7 < 128) {
                if (var7 == 0) {
                    var8 = 65533;
                } else {
                    var8 = var7;
                }
            } else if (var7 < 192) {
                var8 = 65533;
            } else if (var7 < 224) {
                if ((var5 < var6) && ((var0[var5] & 192) == 128)) {
                    var8 = ((var7 & 31) << 6) | (var0[var5++] & 63);
                    if (var8 < 128) {
                        var8 = 65533;
                    }
                } else {
                    var8 = 65533;
                }
            } else if (var7 < 240) {
                if ((((var5 + 1) < var6) && ((var0[var5] & 192) == 128)) && ((var0[var5 + 1] & 192) == 128)) {
                    var8 = (((var7 & 15) << 12) | ((var0[var5++] & 63) << 6)) | (var0[var5++] & 63);
                    if (var8 < 2048) {
                        var8 = 65533;
                    }
                } else {
                    var8 = 65533;
                }
            } else if (var7 < 248) {
                if (((((var5 + 2) < var6) && ((var0[var5] & 192) == 128)) && ((var0[var5 + 1] & 192) == 128)) && ((var0[var5 + 2] & 192) == 128)) {
                    var8 = ((((var7 & 7) << 18) | ((var0[var5++] & 63) << 12)) | ((var0[var5++] & 63) << 6)) | (var0[var5++] & 63);
                    if ((var8 >= 65536) && (var8 <= 1114111)) {
                        var8 = 65533;
                    } else {
                        var8 = 65533;
                    }
                } else {
                    var8 = 65533;
                }
            } else {
                var8 = 65533;
            }
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("jm")
    @ObfuscatedSignature(descriptor = "(Ljz;Lfn;IIZI)V", garbageValue = "829437847")
    @Export("addWidgetItemMenuItem")
    static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
        String[] var5 = var1.inventoryActions;
        byte var6 = -1;
        String var7 = null;
        if ((var5 != null) && (var5[var3] != null)) {
            if (var3 == 0) {
                var6 = 33;
            } else if (var3 == 1) {
                var6 = 34;
            } else if (var3 == 2) {
                var6 = 35;
            } else if (var3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[var3];
        } else if (var3 == 4) {
            var6 = 37;
            var7 = "Drop";
        }
        if ((var6 != (-1)) && (var7 != null)) {
            ArchiveLoader.insertMenuItem(var7, LoginScreenAnimation.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
        }
    }
}