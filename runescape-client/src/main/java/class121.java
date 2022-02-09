import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dp")
public enum class121 implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1483(0, 0),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1485(1, 1),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1481(2, 2),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1487(3, 3),
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1480(4, 4),
    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1484(5, 5),
    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1479(6, 6),
    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1486(7, 7),
    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Ldp;")
    field1482(8, 8);
    @ObfuscatedName("sr")
    @ObfuscatedGetter(intValue = -1405922867)
    static int field1492;

    @ObfuscatedName("m")
    @Export("cacheSubPaths")
    static String[] cacheSubPaths;

    @ObfuscatedName("jj")
    @ObfuscatedGetter(intValue = -983073929)
    @Export("oculusOrbFocalPointY")
    static int oculusOrbFocalPointY;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 618703283)
    final int field1488;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -1928062393)
    final int field1489;

    class121(int var3, int var4) {
        this.field1488 = var3;
        this.field1489 = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.field1489;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IZI)Ljava/lang/String;", garbageValue = "1999757429")
    @Export("intToString")
    public static String intToString(int var0, boolean var1) {
        if (var1 && (var0 >= 0)) {
            int var3 = var0;
            String var2;
            if (var1 && (var0 >= 0)) {
                int var4 = 2;
                for (int var5 = var0 / 10; var5 != 0; ++var4) {
                    var5 /= 10;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 - 1; var7 > 0; --var7) {
                    int var8 = var3;
                    var3 /= 10;
                    int var9 = var8 - (var3 * 10);
                    if (var9 >= 10) {
                        var6[var7] = ((char) (var9 + 87));
                    } else {
                        var6[var7] = ((char) (var9 + 48));
                    }
                }
                var2 = new String(var6);
            } else {
                var2 = Integer.toString(var0, 10);
            }
            return var2;
        } else {
            return Integer.toString(var0);
        }
    }
}