import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lb")
public final class class335 {
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1411725206")
    public static final boolean method6159(char var0) {
        return (((var0 == 160) || (var0 == ' ')) || (var0 == '_')) || (var0 == '-');
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1664667294")
    @Export("ItemContainer_getCount")
    static int ItemContainer_getCount(int var0, int var1) {
        ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var2 == null) {
            return 0;
        } else {
            return (var1 >= 0) && (var1 < var2.quantities.length) ? var2.quantities[var1] : 0;
        }
    }

    @ObfuscatedName("s")
    @Export("base37DecodeLong")
    public static String base37DecodeLong(long var0) {
        if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
            if (0L == (var0 % 37L)) {
                return null;
            } else {
                int var2 = 0;
                for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                    ++var2;
                }
                StringBuilder var5;
                char var8;
                for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                    long var6 = var0;
                    var0 /= 37L;
                    var8 = class337.base37Table[((int) (var6 - (37L * var0)))];
                    if (var8 == '_') {
                        int var9 = var5.length() - 1;
                        var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                        var8 = 160;
                    }
                }
                var5.reverse();
                var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
                return var5.toString();
            }
        } else {
            return null;
        }
    }
}