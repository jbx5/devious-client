import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ok")
@Implements("LoginType")
public class LoginType {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lok;")
    @Export("oldscape")
    public static final LoginType oldscape;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4455;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4449;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4450;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4451;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4452;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4453;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Lok;")
    static final LoginType field4457;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Lok;")
    public static final LoginType field4454;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -2103098327)
    final int field4456;

    @ObfuscatedName("y")
    final String field4448;

    static {
        oldscape = new LoginType(4, 0, "", "");
        field4455 = new LoginType(3, 1, "", "");
        field4449 = new LoginType(8, 2, "", "");
        field4450 = new LoginType(6, 3, "", "");
        field4451 = new LoginType(2, 4, "", "");
        field4452 = new LoginType(1, 5, "", "");
        field4453 = new LoginType(5, 6, "", "");
        field4457 = new LoginType(7, 7, "", "");
        field4454 = new LoginType(0, -1, "", "", true, new LoginType[]{ oldscape, field4455, field4449, field4451, field4450 });
    }

    LoginType(int var1, int var2, String var3, String var4) {
        this.field4456 = var1;
        this.field4448 = var4;
    }

    @ObfuscatedSignature(descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lok;)V")
    LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
        this.field4456 = var1;
        this.field4448 = var4;
    }

    public String toString() {
        return this.field4448;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Ldt;FZI)F", garbageValue = "1071876585")
    static float method7148(class115 var0, float var1, boolean var2) {
        float var3 = 0.0F;
        if ((var0 != null) && (var0.method2617() != 0)) {
            float var4 = ((float) (var0.field1430[0].field1377));
            float var5 = ((float) (var0.field1430[var0.method2617() - 1].field1377));
            float var6 = var5 - var4;
            if (((double) (var6)) == 0.0) {
                return var0.field1430[0].field1384;
            } else {
                float var7 = 0.0F;
                if (var1 > var5) {
                    var7 = (var1 - var5) / var6;
                } else {
                    var7 = (var1 - var4) / var6;
                }
                double var8 = ((double) ((int) (var7)));
                float var10 = Math.abs(((float) (((double) (var7)) - var8)));
                float var11 = var6 * var10;
                var8 = Math.abs(var8 + 1.0);
                double var12 = var8 / 2.0;
                double var14 = ((double) ((int) (var12)));
                var10 = ((float) (var12 - var14));
                float var16;
                float var17;
                if (var2) {
                    if (var0.field1422 == class114.field1412) {
                        if (((double) (var10)) != 0.0) {
                            var11 += var4;
                        } else {
                            var11 = var5 - var11;
                        }
                    } else if ((var0.field1422 != class114.field1410) && (var0.field1422 != class114.field1413)) {
                        if (var0.field1422 == class114.field1409) {
                            var11 = var4 - var1;
                            var16 = var0.field1430[0].field1379;
                            var17 = var0.field1430[0].field1380;
                            var3 = var0.field1430[0].field1384;
                            if (((double) (var16)) != 0.0) {
                                var3 -= (var11 * var17) / var16;
                            }
                            return var3;
                        }
                    } else {
                        var11 = var5 - var11;
                    }
                } else if (var0.field1420 == class114.field1412) {
                    if (0.0 != ((double) (var10))) {
                        var11 = var5 - var11;
                    } else {
                        var11 += var4;
                    }
                } else if ((var0.field1420 != class114.field1410) && (var0.field1420 != class114.field1413)) {
                    if (var0.field1420 == class114.field1409) {
                        var11 = var1 - var5;
                        var16 = var0.field1430[var0.method2617() - 1].field1381;
                        var17 = var0.field1430[var0.method2617() - 1].field1378;
                        var3 = var0.field1430[var0.method2617() - 1].field1384;
                        if (0.0 != ((double) (var16))) {
                            var3 += (var17 * var11) / var16;
                        }
                        return var3;
                    }
                } else {
                    var11 += var4;
                }
                var3 = class127.method2767(var0, var11);
                float var18;
                if (var2 && (var0.field1422 == class114.field1413)) {
                    var18 = var0.field1430[var0.method2617() - 1].field1384 - var0.field1430[0].field1384;
                    var3 = ((float) (((double) (var3)) - (var8 * ((double) (var18)))));
                } else if ((!var2) && (var0.field1420 == class114.field1413)) {
                    var18 = var0.field1430[var0.method2617() - 1].field1384 - var0.field1430[0].field1384;
                    var3 = ((float) (((double) (var3)) + (((double) (var18)) * var8)));
                }
                return var3;
            }
        } else {
            return var3;
        }
    }

    @ObfuscatedName("ka")
    static final void method7149(double var0) {
        Rasterizer3D.Rasterizer3D_setBrightness(var0);
        ((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(var0);
        GraphicsObject.method1890();
        class424.clientPreferences.brightness = var0;
        GameEngine.savePreferences();
    }
}