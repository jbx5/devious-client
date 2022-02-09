import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ni")
public final class class371 {
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "[Lni;")
    static class371[] field4238;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 2057467461)
    static int field4240;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lni;")
    public static final class371 field4239;

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("title_muteSprite")
    static IndexedSprite[] title_muteSprite;

    @ObfuscatedName("r")
    public float[] field4241;

    static {
        field4238 = new class371[0];
        Coord.method5335(100);
        field4239 = new class371();
    }

    public class371() {
        this.field4241 = new float[16];
        this.method6677();
    }

    @ObfuscatedSignature(descriptor = "(Lni;)V")
    public class371(class371 var1) {
        this.field4241 = new float[16];
        this.method6699(var1);
    }

    @ObfuscatedSignature(descriptor = "(Lpi;Z)V")
    public class371(Buffer var1, boolean var2) {
        this.field4241 = new float[16];
        this.method6736(var1, var2);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-884140696")
    public void method6703() {
        synchronized(field4238) {
            if (class296.field3510 < (field4240 - 1)) {
                field4238[(++class296.field3510) - 1] = this;
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;ZB)V", garbageValue = "4")
    void method6736(Buffer var1, boolean var2) {
        if (var2) {
            class372 var4 = new class372();
            var4.method6746(class114.method2609(var1.readShort()));
            var4.method6740(class114.method2609(var1.readShort()));
            var4.method6741(class114.method2609(var1.readShort()));
            var4.method6742(((float) (var1.readShort())), ((float) (var1.readShort())), ((float) (var1.readShort())));
            this.method6689(var4);
        } else {
            for (int var3 = 0; var3 < 16; ++var3) {
                this.field4241[var3] = var1.method7374();
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "14")
    float[] method6675() {
        float[] var1 = new float[3];
        if ((((double) (this.field4241[2])) < 0.999) && (((double) (this.field4241[2])) > (-0.999))) {
            var1[1] = ((float) (-Math.asin(((double) (this.field4241[2])))));
            double var2 = Math.cos(((double) (var1[1])));
            var1[0] = ((float) (Math.atan2(((double) (this.field4241[6])) / var2, ((double) (this.field4241[10])) / var2)));
            var1[2] = ((float) (Math.atan2(((double) (this.field4241[1])) / var2, ((double) (this.field4241[0])) / var2)));
        } else {
            var1[0] = 0.0F;
            var1[1] = ((float) (Math.atan2(((double) (this.field4241[2])), 0.0)));
            var1[2] = ((float) (Math.atan2(((double) (-this.field4241[9])), ((double) (this.field4241[5])))));
        }
        return var1;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "20")
    public float[] method6732() {
        float[] var1 = new float[]{ ((float) (-Math.asin(((double) (this.field4241[6]))))), 0.0F, 0.0F };
        double var2 = Math.cos(((double) (var1[0])));
        double var4;
        double var6;
        if (Math.abs(var2) > 0.005) {
            var4 = ((double) (this.field4241[2]));
            var6 = ((double) (this.field4241[10]));
            double var8 = ((double) (this.field4241[4]));
            double var10 = ((double) (this.field4241[5]));
            var1[1] = ((float) (Math.atan2(var4, var6)));
            var1[2] = ((float) (Math.atan2(var8, var10)));
        } else {
            var4 = ((double) (this.field4241[1]));
            var6 = ((double) (this.field4241[0]));
            if (this.field4241[6] < 0.0F) {
                var1[1] = ((float) (Math.atan2(var4, var6)));
            } else {
                var1[1] = ((float) (-Math.atan2(var4, var6)));
            }
            var1[2] = 0.0F;
        }
        return var1;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "120901342")
    void method6677() {
        this.field4241[0] = 1.0F;
        this.field4241[1] = 0.0F;
        this.field4241[2] = 0.0F;
        this.field4241[3] = 0.0F;
        this.field4241[4] = 0.0F;
        this.field4241[5] = 1.0F;
        this.field4241[6] = 0.0F;
        this.field4241[7] = 0.0F;
        this.field4241[8] = 0.0F;
        this.field4241[9] = 0.0F;
        this.field4241[10] = 1.0F;
        this.field4241[11] = 0.0F;
        this.field4241[12] = 0.0F;
        this.field4241[13] = 0.0F;
        this.field4241[14] = 0.0F;
        this.field4241[15] = 1.0F;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-38")
    public void method6702() {
        this.field4241[0] = 0.0F;
        this.field4241[1] = 0.0F;
        this.field4241[2] = 0.0F;
        this.field4241[3] = 0.0F;
        this.field4241[4] = 0.0F;
        this.field4241[5] = 0.0F;
        this.field4241[6] = 0.0F;
        this.field4241[7] = 0.0F;
        this.field4241[8] = 0.0F;
        this.field4241[9] = 0.0F;
        this.field4241[10] = 0.0F;
        this.field4241[11] = 0.0F;
        this.field4241[12] = 0.0F;
        this.field4241[13] = 0.0F;
        this.field4241[14] = 0.0F;
        this.field4241[15] = 0.0F;
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lni;I)V", garbageValue = "-1704193184")
    public void method6699(class371 var1) {
        System.arraycopy(var1.field4241, 0, this.field4241, 0, 16);
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "1128809728")
    public void method6680(float var1) {
        this.method6681(var1, var1, var1);
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(FFFI)V", garbageValue = "-1129320536")
    public void method6681(float var1, float var2, float var3) {
        this.method6677();
        this.field4241[0] = var1;
        this.field4241[5] = var2;
        this.field4241[10] = var3;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(Lni;B)V", garbageValue = "9")
    public void method6704(class371 var1) {
        for (int var2 = 0; var2 < this.field4241.length; ++var2) {
            float[] var10000 = this.field4241;
            var10000[var2] += var1.field4241[var2];
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(Lni;I)V", garbageValue = "-2094021930")
    public void method6682(class371 var1) {
        float var2 = (((var1.field4241[0] * this.field4241[0]) + (this.field4241[1] * var1.field4241[4])) + (var1.field4241[8] * this.field4241[2])) + (this.field4241[3] * var1.field4241[12]);
        float var3 = (((this.field4241[2] * var1.field4241[9]) + (this.field4241[1] * var1.field4241[5])) + (var1.field4241[1] * this.field4241[0])) + (var1.field4241[13] * this.field4241[3]);
        float var4 = (((this.field4241[1] * var1.field4241[6]) + (this.field4241[0] * var1.field4241[2])) + (this.field4241[2] * var1.field4241[10])) + (this.field4241[3] * var1.field4241[14]);
        float var5 = (((var1.field4241[15] * this.field4241[3]) + (var1.field4241[3] * this.field4241[0])) + (var1.field4241[7] * this.field4241[1])) + (this.field4241[2] * var1.field4241[11]);
        float var6 = (((this.field4241[7] * var1.field4241[12]) + (var1.field4241[4] * this.field4241[5])) + (var1.field4241[0] * this.field4241[4])) + (this.field4241[6] * var1.field4241[8]);
        float var7 = (((var1.field4241[13] * this.field4241[7]) + (var1.field4241[9] * this.field4241[6])) + (this.field4241[4] * var1.field4241[1])) + (this.field4241[5] * var1.field4241[5]);
        float var8 = (((var1.field4241[6] * this.field4241[5]) + (var1.field4241[2] * this.field4241[4])) + (var1.field4241[10] * this.field4241[6])) + (var1.field4241[14] * this.field4241[7]);
        float var9 = (((var1.field4241[15] * this.field4241[7]) + (this.field4241[6] * var1.field4241[11])) + (var1.field4241[7] * this.field4241[5])) + (this.field4241[4] * var1.field4241[3]);
        float var10 = (((this.field4241[10] * var1.field4241[8]) + (var1.field4241[4] * this.field4241[9])) + (this.field4241[8] * var1.field4241[0])) + (this.field4241[11] * var1.field4241[12]);
        float var11 = (((var1.field4241[9] * this.field4241[10]) + (this.field4241[8] * var1.field4241[1])) + (var1.field4241[5] * this.field4241[9])) + (var1.field4241[13] * this.field4241[11]);
        float var12 = (((this.field4241[11] * var1.field4241[14]) + (var1.field4241[6] * this.field4241[9])) + (this.field4241[8] * var1.field4241[2])) + (var1.field4241[10] * this.field4241[10]);
        float var13 = (((this.field4241[10] * var1.field4241[11]) + (this.field4241[8] * var1.field4241[3])) + (var1.field4241[7] * this.field4241[9])) + (var1.field4241[15] * this.field4241[11]);
        float var14 = (((var1.field4241[8] * this.field4241[14]) + (this.field4241[12] * var1.field4241[0])) + (this.field4241[13] * var1.field4241[4])) + (this.field4241[15] * var1.field4241[12]);
        float var15 = (((this.field4241[12] * var1.field4241[1]) + (var1.field4241[5] * this.field4241[13])) + (var1.field4241[9] * this.field4241[14])) + (this.field4241[15] * var1.field4241[13]);
        float var16 = (((var1.field4241[14] * this.field4241[15]) + (var1.field4241[10] * this.field4241[14])) + (this.field4241[13] * var1.field4241[6])) + (this.field4241[12] * var1.field4241[2]);
        float var17 = (((var1.field4241[15] * this.field4241[15]) + (var1.field4241[7] * this.field4241[13])) + (var1.field4241[3] * this.field4241[12])) + (this.field4241[14] * var1.field4241[11]);
        this.field4241[0] = var2;
        this.field4241[1] = var3;
        this.field4241[2] = var4;
        this.field4241[3] = var5;
        this.field4241[4] = var6;
        this.field4241[5] = var7;
        this.field4241[6] = var8;
        this.field4241[7] = var9;
        this.field4241[8] = var10;
        this.field4241[9] = var11;
        this.field4241[10] = var12;
        this.field4241[11] = var13;
        this.field4241[12] = var14;
        this.field4241[13] = var15;
        this.field4241[14] = var16;
        this.field4241[15] = var17;
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(Lnq;B)V", garbageValue = "-108")
    public void method6683(class370 var1) {
        float var2 = var1.field4232 * var1.field4232;
        float var3 = var1.field4232 * var1.field4229;
        float var4 = var1.field4232 * var1.field4233;
        float var5 = var1.field4232 * var1.field4234;
        float var6 = var1.field4229 * var1.field4229;
        float var7 = var1.field4229 * var1.field4233;
        float var8 = var1.field4234 * var1.field4229;
        float var9 = var1.field4233 * var1.field4233;
        float var10 = var1.field4233 * var1.field4234;
        float var11 = var1.field4234 * var1.field4234;
        this.field4241[0] = ((var2 + var6) - var11) - var9;
        this.field4241[1] = ((var5 + var7) + var5) + var7;
        this.field4241[2] = ((var8 - var4) - var4) + var8;
        this.field4241[4] = var7 + ((var7 - var5) - var5);
        this.field4241[5] = ((var2 + var9) - var6) - var11;
        this.field4241[6] = ((var3 + var3) + var10) + var10;
        this.field4241[8] = ((var4 + var8) + var8) + var4;
        this.field4241[9] = ((var10 - var3) - var3) + var10;
        this.field4241[10] = ((var11 + var2) - var9) - var6;
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(Lng;I)V", garbageValue = "789710175")
    void method6689(class372 var1) {
        this.field4241[0] = var1.field4256;
        this.field4241[1] = var1.field4253;
        this.field4241[2] = var1.field4247;
        this.field4241[3] = 0.0F;
        this.field4241[4] = var1.field4248;
        this.field4241[5] = var1.field4245;
        this.field4241[6] = var1.field4249;
        this.field4241[7] = 0.0F;
        this.field4241[8] = var1.field4251;
        this.field4241[9] = var1.field4252;
        this.field4241[10] = var1.field4254;
        this.field4241[11] = 0.0F;
        this.field4241[12] = var1.field4250;
        this.field4241[13] = var1.field4255;
        this.field4241[14] = var1.field4246;
        this.field4241[15] = 1.0F;
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(B)F", garbageValue = "-1")
    float method6685() {
        return (((((((((((((((((((((((this.field4241[14] * this.field4241[9]) * this.field4241[0]) * this.field4241[7]) + (((this.field4241[0] * this.field4241[6]) * this.field4241[11]) * this.field4241[13])) + (((((this.field4241[15] * this.field4241[10]) * this.field4241[5]) * this.field4241[0]) - (((this.field4241[11] * this.field4241[5]) * this.field4241[0]) * this.field4241[14])) - (((this.field4241[9] * this.field4241[6]) * this.field4241[0]) * this.field4241[15]))) - (((this.field4241[13] * this.field4241[10]) * this.field4241[7]) * this.field4241[0])) - (((this.field4241[10] * this.field4241[1]) * this.field4241[4]) * this.field4241[15])) + (((this.field4241[14] * this.field4241[11]) * this.field4241[4]) * this.field4241[1])) + (((this.field4241[1] * this.field4241[6]) * this.field4241[8]) * this.field4241[15])) - (((this.field4241[12] * this.field4241[11]) * this.field4241[6]) * this.field4241[1])) - (((this.field4241[1] * this.field4241[7]) * this.field4241[8]) * this.field4241[14])) + (((this.field4241[12] * this.field4241[7]) * this.field4241[1]) * this.field4241[10])) + (((this.field4241[15] * this.field4241[2]) * this.field4241[4]) * this.field4241[9])) - (((this.field4241[13] * this.field4241[2]) * this.field4241[4]) * this.field4241[11])) - (((this.field4241[15] * this.field4241[8]) * this.field4241[2]) * this.field4241[5])) + (((this.field4241[11] * this.field4241[5]) * this.field4241[2]) * this.field4241[12])) + (((this.field4241[8] * this.field4241[2]) * this.field4241[7]) * this.field4241[13])) - (((this.field4241[9] * this.field4241[7]) * this.field4241[2]) * this.field4241[12])) - (((this.field4241[9] * this.field4241[3]) * this.field4241[4]) * this.field4241[14])) + (((this.field4241[13] * this.field4241[10]) * this.field4241[4]) * this.field4241[3])) + (((this.field4241[5] * this.field4241[3]) * this.field4241[8]) * this.field4241[14])) - (((this.field4241[3] * this.field4241[5]) * this.field4241[10]) * this.field4241[12])) - (((this.field4241[13] * this.field4241[8]) * this.field4241[6]) * this.field4241[3])) + (((this.field4241[9] * this.field4241[6]) * this.field4241[3]) * this.field4241[12]);
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1940439543")
    public void method6705() {
        float var1 = 1.0F / this.method6685();
        float var2 = (((((this.field4241[14] * this.field4241[7]) * this.field4241[9]) + ((this.field4241[13] * this.field4241[11]) * this.field4241[6])) + ((((this.field4241[15] * this.field4241[5]) * this.field4241[10]) - ((this.field4241[11] * this.field4241[5]) * this.field4241[14])) - ((this.field4241[15] * this.field4241[6]) * this.field4241[9]))) - ((this.field4241[13] * this.field4241[10]) * this.field4241[7])) * var1;
        float var3 = var1 * (((((((this.field4241[11] * this.field4241[1]) * this.field4241[14]) + ((this.field4241[15] * (-this.field4241[1])) * this.field4241[10])) + ((this.field4241[9] * this.field4241[2]) * this.field4241[15])) - ((this.field4241[2] * this.field4241[11]) * this.field4241[13])) - ((this.field4241[9] * this.field4241[3]) * this.field4241[14])) + ((this.field4241[3] * this.field4241[10]) * this.field4241[13]));
        float var4 = var1 * (((((((this.field4241[1] * this.field4241[6]) * this.field4241[15]) - ((this.field4241[14] * this.field4241[1]) * this.field4241[7])) - ((this.field4241[5] * this.field4241[2]) * this.field4241[15])) + ((this.field4241[13] * this.field4241[7]) * this.field4241[2])) + ((this.field4241[3] * this.field4241[5]) * this.field4241[14])) - ((this.field4241[6] * this.field4241[3]) * this.field4241[13]));
        float var5 = var1 * (((((((this.field4241[11] * this.field4241[2]) * this.field4241[5]) + ((this.field4241[10] * this.field4241[7]) * this.field4241[1])) + ((this.field4241[6] * (-this.field4241[1])) * this.field4241[11])) - ((this.field4241[2] * this.field4241[7]) * this.field4241[9])) - ((this.field4241[10] * this.field4241[5]) * this.field4241[3])) + ((this.field4241[9] * this.field4241[6]) * this.field4241[3]));
        float var6 = var1 * (((this.field4241[12] * this.field4241[10]) * this.field4241[7]) + ((((((this.field4241[15] * this.field4241[10]) * (-this.field4241[4])) + ((this.field4241[4] * this.field4241[11]) * this.field4241[14])) + ((this.field4241[8] * this.field4241[6]) * this.field4241[15])) - ((this.field4241[12] * this.field4241[6]) * this.field4241[11])) - ((this.field4241[14] * this.field4241[7]) * this.field4241[8])));
        float var7 = var1 * (((((this.field4241[14] * this.field4241[8]) * this.field4241[3]) + ((this.field4241[12] * this.field4241[11]) * this.field4241[2])) + ((((this.field4241[15] * this.field4241[10]) * this.field4241[0]) - ((this.field4241[14] * this.field4241[11]) * this.field4241[0])) - ((this.field4241[2] * this.field4241[8]) * this.field4241[15]))) - ((this.field4241[12] * this.field4241[10]) * this.field4241[3]));
        float var8 = var1 * (((((((this.field4241[15] * (-this.field4241[0])) * this.field4241[6]) + ((this.field4241[0] * this.field4241[7]) * this.field4241[14])) + ((this.field4241[4] * this.field4241[2]) * this.field4241[15])) - ((this.field4241[7] * this.field4241[2]) * this.field4241[12])) - ((this.field4241[3] * this.field4241[4]) * this.field4241[14])) + ((this.field4241[3] * this.field4241[6]) * this.field4241[12]));
        float var9 = var1 * (((((this.field4241[8] * this.field4241[7]) * this.field4241[2]) + ((((this.field4241[11] * this.field4241[0]) * this.field4241[6]) - ((this.field4241[7] * this.field4241[0]) * this.field4241[10])) - ((this.field4241[11] * this.field4241[4]) * this.field4241[2]))) + ((this.field4241[3] * this.field4241[4]) * this.field4241[10])) - ((this.field4241[6] * this.field4241[3]) * this.field4241[8]));
        float var10 = (((((this.field4241[11] * this.field4241[5]) * this.field4241[12]) + ((((this.field4241[4] * this.field4241[9]) * this.field4241[15]) - ((this.field4241[13] * this.field4241[11]) * this.field4241[4])) - ((this.field4241[15] * this.field4241[5]) * this.field4241[8]))) + ((this.field4241[13] * this.field4241[7]) * this.field4241[8])) - ((this.field4241[12] * this.field4241[7]) * this.field4241[9])) * var1;
        float var11 = var1 * (((this.field4241[9] * this.field4241[3]) * this.field4241[12]) + ((((((this.field4241[15] * this.field4241[8]) * this.field4241[1]) + ((this.field4241[15] * (-this.field4241[0])) * this.field4241[9])) + ((this.field4241[11] * this.field4241[0]) * this.field4241[13])) - ((this.field4241[1] * this.field4241[11]) * this.field4241[12])) - ((this.field4241[13] * this.field4241[8]) * this.field4241[3])));
        float var12 = var1 * (((((this.field4241[1] * this.field4241[7]) * this.field4241[12]) + ((((this.field4241[5] * this.field4241[0]) * this.field4241[15]) - ((this.field4241[7] * this.field4241[0]) * this.field4241[13])) - ((this.field4241[4] * this.field4241[1]) * this.field4241[15]))) + ((this.field4241[13] * this.field4241[4]) * this.field4241[3])) - ((this.field4241[5] * this.field4241[3]) * this.field4241[12]));
        float var13 = var1 * (((((((this.field4241[11] * this.field4241[5]) * (-this.field4241[0])) + ((this.field4241[9] * this.field4241[7]) * this.field4241[0])) + ((this.field4241[1] * this.field4241[4]) * this.field4241[11])) - ((this.field4241[8] * this.field4241[7]) * this.field4241[1])) - ((this.field4241[9] * this.field4241[3]) * this.field4241[4])) + ((this.field4241[5] * this.field4241[3]) * this.field4241[8]));
        float var14 = var1 * (((this.field4241[9] * this.field4241[6]) * this.field4241[12]) + ((((((this.field4241[8] * this.field4241[5]) * this.field4241[14]) + ((this.field4241[14] * (-this.field4241[4])) * this.field4241[9])) + ((this.field4241[4] * this.field4241[10]) * this.field4241[13])) - ((this.field4241[5] * this.field4241[10]) * this.field4241[12])) - ((this.field4241[6] * this.field4241[8]) * this.field4241[13])));
        float var15 = (((((((this.field4241[2] * this.field4241[8]) * this.field4241[13]) + ((this.field4241[14] * this.field4241[0]) * this.field4241[9])) - ((this.field4241[13] * this.field4241[0]) * this.field4241[10])) - ((this.field4241[14] * this.field4241[8]) * this.field4241[1])) + ((this.field4241[1] * this.field4241[10]) * this.field4241[12])) - ((this.field4241[12] * this.field4241[2]) * this.field4241[9])) * var1;
        float var16 = (((this.field4241[2] * this.field4241[5]) * this.field4241[12]) + ((((((this.field4241[1] * this.field4241[4]) * this.field4241[14]) + ((this.field4241[6] * this.field4241[0]) * this.field4241[13])) + ((this.field4241[5] * (-this.field4241[0])) * this.field4241[14])) - ((this.field4241[12] * this.field4241[1]) * this.field4241[6])) - ((this.field4241[13] * this.field4241[2]) * this.field4241[4]))) * var1;
        float var17 = var1 * (((((this.field4241[9] * this.field4241[2]) * this.field4241[4]) + ((this.field4241[8] * this.field4241[1]) * this.field4241[6])) + ((((this.field4241[5] * this.field4241[0]) * this.field4241[10]) - ((this.field4241[9] * this.field4241[0]) * this.field4241[6])) - ((this.field4241[4] * this.field4241[1]) * this.field4241[10]))) - ((this.field4241[8] * this.field4241[5]) * this.field4241[2]));
        this.field4241[0] = var2;
        this.field4241[1] = var3;
        this.field4241[2] = var4;
        this.field4241[3] = var5;
        this.field4241[4] = var6;
        this.field4241[5] = var7;
        this.field4241[6] = var8;
        this.field4241[7] = var9;
        this.field4241[8] = var10;
        this.field4241[9] = var11;
        this.field4241[10] = var12;
        this.field4241[11] = var13;
        this.field4241[12] = var14;
        this.field4241[13] = var15;
        this.field4241[14] = var16;
        this.field4241[15] = var17;
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "56")
    public float[] method6688() {
        float[] var1 = new float[3];
        class369 var2 = new class369(this.field4241[0], this.field4241[1], this.field4241[2]);
        class369 var3 = new class369(this.field4241[4], this.field4241[5], this.field4241[6]);
        class369 var4 = new class369(this.field4241[8], this.field4241[9], this.field4241[10]);
        var1[0] = var2.method6638();
        var1[1] = var3.method6638();
        var1[2] = var4.method6638();
        return var1;
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = (var2 * 31) + Arrays.hashCode(this.field4241);
        return var3;
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class371)) {
            return false;
        } else {
            class371 var2 = ((class371) (var1));
            for (int var3 = 0; var3 < 16; ++var3) {
                if (var2.field4241[var3] != this.field4241[var3]) {
                    return false;
                }
            }
            return true;
        }
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method6732();
        this.method6675();
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; var3 < 4; ++var3) {
                if (var3 > 0) {
                    var1.append("\t");
                }
                float var4 = this.field4241[var3 + (var2 * 4)];
                if (Math.sqrt(((double) (var4 * var4))) < 9.999999747378752E-5) {
                    var4 = 0.0F;
                }
                var1.append(var4);
            }
            var1.append("\n");
        }
        return var1.toString();
    }

    @ObfuscatedName("gt")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1467477264")
    static final void method6674(int var0, int var1) {
        if (Client.hintArrowType == 2) {
            class148.worldToScreen(((Client.hintArrowX - Canvas.baseX) << 7) + Client.hintArrowSubX, ((Client.hintArrowY - class118.baseY) << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
            if ((Client.viewportTempX > (-1)) && ((Client.cycle % 20) < 10)) {
                SequenceDefinition.headIconHintSprites[0].drawTransBgAt((var0 + Client.viewportTempX) - 12, (Client.viewportTempY + var1) - 28);
            }
        }
    }
}