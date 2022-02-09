import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ng")
public class class372 {
    @ObfuscatedName("c")
    float field4256;

    @ObfuscatedName("l")
    float field4253;

    @ObfuscatedName("s")
    float field4247;

    @ObfuscatedName("e")
    float field4248;

    @ObfuscatedName("r")
    float field4245;

    @ObfuscatedName("o")
    float field4249;

    @ObfuscatedName("i")
    float field4251;

    @ObfuscatedName("w")
    float field4252;

    @ObfuscatedName("v")
    float field4254;

    @ObfuscatedName("a")
    float field4250;

    @ObfuscatedName("y")
    float field4255;

    @ObfuscatedName("u")
    float field4246;

    static {
        new class372();
    }

    class372() {
        this.method6738();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1422082779")
    void method6738() {
        this.field4246 = 0.0F;
        this.field4255 = 0.0F;
        this.field4250 = 0.0F;
        this.field4252 = 0.0F;
        this.field4251 = 0.0F;
        this.field4249 = 0.0F;
        this.field4248 = 0.0F;
        this.field4247 = 0.0F;
        this.field4253 = 0.0F;
        this.field4254 = 1.0F;
        this.field4245 = 1.0F;
        this.field4256 = 1.0F;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "1946927400")
    void method6746(float var1) {
        float var2 = ((float) (Math.cos(((double) (var1)))));
        float var3 = ((float) (Math.sin(((double) (var1)))));
        float var4 = this.field4253;
        float var5 = this.field4245;
        float var6 = this.field4252;
        float var7 = this.field4255;
        this.field4253 = (var4 * var2) - (var3 * this.field4247);
        this.field4247 = (var4 * var3) + (var2 * this.field4247);
        this.field4245 = (var5 * var2) - (this.field4249 * var3);
        this.field4249 = (var3 * var5) + (var2 * this.field4249);
        this.field4252 = (var6 * var2) - (this.field4254 * var3);
        this.field4254 = (var2 * this.field4254) + (var6 * var3);
        this.field4255 = (var2 * var7) - (this.field4246 * var3);
        this.field4246 = (var3 * var7) + (this.field4246 * var2);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(FB)V", garbageValue = "2")
    void method6740(float var1) {
        float var2 = ((float) (Math.cos(((double) (var1)))));
        float var3 = ((float) (Math.sin(((double) (var1)))));
        float var4 = this.field4256;
        float var5 = this.field4248;
        float var6 = this.field4251;
        float var7 = this.field4250;
        this.field4256 = (var2 * var4) + (var3 * this.field4247);
        this.field4247 = (var2 * this.field4247) - (var4 * var3);
        this.field4248 = (var5 * var2) + (var3 * this.field4249);
        this.field4249 = (this.field4249 * var2) - (var5 * var3);
        this.field4251 = (var2 * var6) + (var3 * this.field4254);
        this.field4254 = (this.field4254 * var2) - (var3 * var6);
        this.field4250 = (var2 * var7) + (this.field4246 * var3);
        this.field4246 = (this.field4246 * var2) - (var7 * var3);
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(FS)V", garbageValue = "255")
    void method6741(float var1) {
        float var2 = ((float) (Math.cos(((double) (var1)))));
        float var3 = ((float) (Math.sin(((double) (var1)))));
        float var4 = this.field4256;
        float var5 = this.field4248;
        float var6 = this.field4251;
        float var7 = this.field4250;
        this.field4256 = (var2 * var4) - (var3 * this.field4253);
        this.field4253 = (var3 * var4) + (var2 * this.field4253);
        this.field4248 = (var2 * var5) - (var3 * this.field4245);
        this.field4245 = (var2 * this.field4245) + (var5 * var3);
        this.field4251 = (var2 * var6) - (var3 * this.field4252);
        this.field4252 = (var3 * var6) + (this.field4252 * var2);
        this.field4250 = (var7 * var2) - (this.field4255 * var3);
        this.field4255 = (this.field4255 * var2) + (var7 * var3);
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(FFFI)V", garbageValue = "-1555400039")
    void method6742(float var1, float var2, float var3) {
        this.field4250 += var1;
        this.field4255 += var2;
        this.field4246 += var3;
    }

    public String toString() {
        return (((((((((((((((((((((this.field4256 + ",") + this.field4248) + ",") + this.field4251) + ",") + this.field4250) + "\n") + this.field4253) + ",") + this.field4245) + ",") + this.field4252) + ",") + this.field4255) + "\n") + this.field4247) + ",") + this.field4249) + ",") + this.field4254) + ",") + this.field4246;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "-101")
    @Export("SpriteBuffer_decode")
    public static void SpriteBuffer_decode(byte[] var0) {
        Buffer var1 = new Buffer(var0);
        var1.offset = var0.length - 2;
        class434.SpriteBuffer_spriteCount = var1.readUnsignedShort();
        class434.SpriteBuffer_xOffsets = new int[class434.SpriteBuffer_spriteCount];
        class434.SpriteBuffer_yOffsets = new int[class434.SpriteBuffer_spriteCount];
        class434.SpriteBuffer_spriteWidths = new int[class434.SpriteBuffer_spriteCount];
        Fonts.SpriteBuffer_spriteHeights = new int[class434.SpriteBuffer_spriteCount];
        WorldMapLabelSize.SpriteBuffer_pixels = new byte[class434.SpriteBuffer_spriteCount][];
        var1.offset = (var0.length - 7) - (class434.SpriteBuffer_spriteCount * 8);
        class434.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
        class434.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
        int var2 = (var1.readUnsignedByte() & 255) + 1;
        int var3;
        for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) {
            class434.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
        }
        for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) {
            class434.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
        }
        for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) {
            class434.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
        }
        for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) {
            Fonts.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
        }
        var1.offset = ((var0.length - 7) - (class434.SpriteBuffer_spriteCount * 8)) - ((var2 - 1) * 3);
        HealthBarUpdate.SpriteBuffer_spritePalette = new int[var2];
        for (var3 = 1; var3 < var2; ++var3) {
            HealthBarUpdate.SpriteBuffer_spritePalette[var3] = var1.readMedium();
            if (HealthBarUpdate.SpriteBuffer_spritePalette[var3] == 0) {
                HealthBarUpdate.SpriteBuffer_spritePalette[var3] = 1;
            }
        }
        var1.offset = 0;
        for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) {
            int var4 = class434.SpriteBuffer_spriteWidths[var3];
            int var5 = Fonts.SpriteBuffer_spriteHeights[var3];
            int var6 = var5 * var4;
            byte[] var7 = new byte[var6];
            WorldMapLabelSize.SpriteBuffer_pixels[var3] = var7;
            int var8 = var1.readUnsignedByte();
            int var9;
            if (var8 == 0) {
                for (var9 = 0; var9 < var6; ++var9) {
                    var7[var9] = var1.readByte();
                }
            } else if (var8 == 1) {
                for (var9 = 0; var9 < var4; ++var9) {
                    for (int var10 = 0; var10 < var5; ++var10) {
                        var7[var9 + (var4 * var10)] = var1.readByte();
                    }
                }
            }
        }
    }
}