import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jc")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
    @ObfuscatedName("u")
    @Export("Tiles_lightness")
    static int[] Tiles_lightness;

    AbstractByteArrayCopier() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "1552068154")
    @Export("get")
    abstract byte[] get();

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "46")
    @Export("set")
    public abstract void set(byte[] var1);

    @ObfuscatedName("l")
    public static String method5309(long var0) {
        if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
            if ((var0 % 37L) == 0L) {
                return null;
            } else {
                int var2 = 0;
                for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                    ++var2;
                }
                StringBuilder var5 = new StringBuilder(var2);
                while (var0 != 0L) {
                    long var6 = var0;
                    var0 /= 37L;
                    var5.append(class337.base37Table[((int) (var6 - (37L * var0)))]);
                } 
                return var5.reverse().toString();
            }
        } else {
            return null;
        }
    }
}