import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fa")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("FloorUnderlayDefinition_archive")
    public static AbstractArchive FloorUnderlayDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("FloorUnderlayDefinition_cached")
    public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1100189113)
    @Export("rgb")
    int rgb;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1021869971)
    @Export("hue")
    public int hue;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -2965881)
    @Export("saturation")
    public int saturation;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1453637651)
    @Export("lightness")
    public int lightness;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1317928057)
    @Export("hueMultiplier")
    public int hueMultiplier;

    static {
        FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    public FloorUnderlayDefinition() {
        this.rgb = 0;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "41")
    @Export("postDecode")
    public void postDecode() {
        this.setHsl(this.rgb);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;IB)V", garbageValue = "98")
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
    @ObfuscatedSignature(descriptor = "(Lpi;III)V", garbageValue = "-2068951441")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.rgb = var1.readMedium();
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1351916677")
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
            } else if (var10 == var4) {
                var12 = ((var6 - var2) / (var10 - var8)) + 2.0;
            } else if (var6 == var10) {
                var12 = ((var2 - var4) / (var10 - var8)) + 4.0;
            }
        }
        var12 /= 6.0;
        this.saturation = ((int) (256.0 * var14));
        this.lightness = ((int) (var16 * 256.0));
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
        if (var16 > 0.5) {
            this.hueMultiplier = ((int) (((1.0 - var16) * var14) * 512.0));
        } else {
            this.hueMultiplier = ((int) ((512.0 * var14) * var16));
        }
        if (this.hueMultiplier < 1) {
            this.hueMultiplier = 1;
        }
        this.hue = ((int) (var12 * ((double) (this.hueMultiplier))));
    }
}