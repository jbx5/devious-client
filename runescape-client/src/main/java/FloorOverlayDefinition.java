import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fm")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("FloorOverlayDefinition_archive")
    public static AbstractArchive FloorOverlayDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("FloorOverlayDefinition_cached")
    public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;

    @ObfuscatedName("pq")
    @ObfuscatedSignature(descriptor = "Lop;")
    @Export("HitSplatDefinition_cached")
    static class409 HitSplatDefinition_cached;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1253258649)
    @Export("primaryRgb")
    public int primaryRgb;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -2096043849)
    @Export("texture")
    public int texture;

    @ObfuscatedName("r")
    @Export("hideUnderlay")
    public boolean hideUnderlay;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 583754113)
    @Export("secondaryRgb")
    public int secondaryRgb;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -457325531)
    @Export("hue")
    public int hue;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1533328135)
    @Export("saturation")
    public int saturation;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 61984717)
    @Export("lightness")
    public int lightness;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1537463893)
    @Export("secondaryHue")
    public int secondaryHue;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 1841738529)
    @Export("secondarySaturation")
    public int secondarySaturation;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1909179785)
    @Export("secondaryLightness")
    public int secondaryLightness;

    static {
        FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    public FloorOverlayDefinition() {
        this.primaryRgb = 0;
        this.texture = -1;
        this.hideUnderlay = true;
        this.secondaryRgb = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
    @Export("postDecode")
    public void postDecode() {
        if (this.secondaryRgb != (-1)) {
            this.setHsl(this.secondaryRgb);
            this.secondaryHue = this.hue;
            this.secondarySaturation = this.saturation;
            this.secondaryLightness = this.lightness;
        }
        this.setHsl(this.primaryRgb);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "207241390")
    @Export("decode")
    public void decode(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUnsignedByte();
            if (var3 == 0) {
                return;
            }
            this.decodeNext(var1, var3, var2);
        } 
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;III)V", garbageValue = "-1432325027")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.primaryRgb = var1.readMedium();
        } else if (var2 == 2) {
            this.texture = var1.readUnsignedByte();
        } else if (var2 == 5) {
            this.hideUnderlay = false;
        } else if (var2 == 7) {
            this.secondaryRgb = var1.readMedium();
        } else if (var2 == 8) {
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-38")
    @Export("setHsl")
    void setHsl(int var1) {
        double var2 = ((double) ((var1 >> 16) & 255)) / 256.0;
        double var4 = ((double) ((var1 >> 8) & 255)) / 256.0;
        double var6 = ((double) (var1 & 255)) / 256.0;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = (var8 + var10) / 2.0;
        if (var10 != var8) {
            if (var16 < 0.5) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5) {
                var14 = (var10 - var8) / ((2.0 - var10) - var8);
            }
            if (var10 == var2) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = ((var6 - var2) / (var10 - var8)) + 2.0;
            } else if (var10 == var6) {
                var12 = ((var2 - var4) / (var10 - var8)) + 4.0;
            }
        }
        var12 /= 6.0;
        this.hue = ((int) (256.0 * var12));
        this.saturation = ((int) (var14 * 256.0));
        this.lightness = ((int) (256.0 * var16));
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.lightness < 0) {
            this.lightness = 0;
        } else if (this.lightness > 255) {
            this.lightness = 255;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "18")
    static void method3588(int var0) {
        class370.field4230 = var0;
        class370.field4235 = new class370[var0];
        class370.field4231 = 0;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-2023848504")
    static String method3573() {
        String var0;
        if (class424.clientPreferences.hideUsername) {
            String var2 = Login.Login_username;
            int var4 = var2.length();
            char[] var5 = new char[var4];
            for (int var6 = 0; var6 < var4; ++var6) {
                var5[var6] = '*';
            }
            String var3 = new String(var5);
            var0 = var3;
        } else {
            var0 = Login.Login_username;
        }
        return var0;
    }
}