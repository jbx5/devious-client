import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ij")
public class class255 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2941;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2942;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2943;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2949;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2945;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2948;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2946;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2944;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2947;

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lij;")
    public static final class255 field2950;

    static {
        field2941 = new class255(5);
        field2942 = new class255(7);
        field2943 = new class255(3);
        field2949 = new class255(6);
        field2945 = new class255(4);
        field2948 = new class255(15);
        field2946 = new class255(4);
        field2944 = new class255(2);
        field2947 = new class255(14);
        field2950 = new class255(5);
    }

    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "5")
    class255(int var1) {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "([BS)[B", garbageValue = "-13275")
    public static byte[] method4983(byte[] var0) {
        int var1 = var0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(var0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BII)I", garbageValue = "-1627064681")
    @Export("encodeStringCp1252")
    public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
        int var5 = var2 - var1;
        for (int var6 = 0; var6 < var5; ++var6) {
            char var7 = var0.charAt(var6 + var1);
            if (((var7 > 0) && (var7 < 128)) || ((var7 >= 160) && (var7 <= 255))) {
                var3[var6 + var4] = ((byte) (var7));
            } else if (var7 == 8364) {
                var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
                var3[var6 + var4] = -126;
            } else if (var7 == 402) {
                var3[var6 + var4] = -125;
            } else if (var7 == 8222) {
                var3[var6 + var4] = -124;
            } else if (var7 == 8230) {
                var3[var6 + var4] = -123;
            } else if (var7 == 8224) {
                var3[var6 + var4] = -122;
            } else if (var7 == 8225) {
                var3[var6 + var4] = -121;
            } else if (var7 == 710) {
                var3[var6 + var4] = -120;
            } else if (var7 == 8240) {
                var3[var6 + var4] = -119;
            } else if (var7 == 352) {
                var3[var6 + var4] = -118;
            } else if (var7 == 8249) {
                var3[var6 + var4] = -117;
            } else if (var7 == 338) {
                var3[var6 + var4] = -116;
            } else if (var7 == 381) {
                var3[var6 + var4] = -114;
            } else if (var7 == 8216) {
                var3[var6 + var4] = -111;
            } else if (var7 == 8217) {
                var3[var6 + var4] = -110;
            } else if (var7 == 8220) {
                var3[var6 + var4] = -109;
            } else if (var7 == 8221) {
                var3[var6 + var4] = -108;
            } else if (var7 == 8226) {
                var3[var6 + var4] = -107;
            } else if (var7 == 8211) {
                var3[var6 + var4] = -106;
            } else if (var7 == 8212) {
                var3[var6 + var4] = -105;
            } else if (var7 == 732) {
                var3[var6 + var4] = -104;
            } else if (var7 == 8482) {
                var3[var6 + var4] = -103;
            } else if (var7 == 353) {
                var3[var6 + var4] = -102;
            } else if (var7 == 8250) {
                var3[var6 + var4] = -101;
            } else if (var7 == 339) {
                var3[var6 + var4] = -100;
            } else if (var7 == 382) {
                var3[var6 + var4] = -98;
            } else if (var7 == 376) {
                var3[var6 + var4] = -97;
            } else {
                var3[var6 + var4] = 63;
            }
        }
        return var5;
    }
}