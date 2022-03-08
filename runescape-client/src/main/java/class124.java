import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dg")
public class class124 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(longValue = 2123389290096035419L)
    long field1511;

    @ObfuscatedName("l")
    String field1510;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class124(class129 var1) {
        this.this$0 = var1;
        this.field1511 = -1L;
        this.field1510 = null;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        if (var1.readUnsignedByte() != 255) {
            --var1.offset;
            this.field1511 = var1.readLong();
        }
        this.field1510 = var1.readStringCp1252NullTerminatedOrNull();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2859(this.field1511, this.field1510, 0);
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "263719312")
    @Export("isAlphaNumeric")
    public static boolean isAlphaNumeric(char var0) {
        return (((var0 >= '0') && (var0 <= '9')) || ((var0 >= 'A') && (var0 <= 'Z'))) || ((var0 >= 'a') && (var0 <= 'z'));
    }

    @ObfuscatedName("gp")
    @ObfuscatedSignature(descriptor = "(IIIIZB)V", garbageValue = "-28")
    @Export("setViewportShape")
    static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
        if (var2 < 1) {
            var2 = 1;
        }
        if (var3 < 1) {
            var3 = 1;
        }
        int var5 = var3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = Client.field775;
        } else if (var5 >= 100) {
            var6 = Client.field759;
        } else {
            var6 = (((Client.field759 - Client.field775) * var5) / 100) + Client.field775;
        }
        int var7 = ((var3 * var6) * 512) / (var2 * 334);
        int var8;
        int var9;
        short var10;
        if (var7 < Client.field656) {
            var10 = Client.field656;
            var6 = ((var10 * var2) * 334) / (var3 * 512);
            if (var6 > Client.field763) {
                var6 = Client.field763;
                var8 = ((var3 * var6) * 512) / (var10 * 334);
                var9 = (var2 - var8) / 2;
                if (var4) {
                    Rasterizer2D.Rasterizer2D_resetClip();
                    Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
                    Rasterizer2D.Rasterizer2D_fillRectangle((var0 + var2) - var9, var1, var9, var3, -16777216);
                }
                var0 += var9;
                var2 -= var9 * 2;
            }
        } else if (var7 > Client.field514) {
            var10 = Client.field514;
            var6 = ((var10 * var2) * 334) / (var3 * 512);
            if (var6 < Client.field762) {
                var6 = Client.field762;
                var8 = ((var10 * var2) * 334) / (var6 * 512);
                var9 = (var3 - var8) / 2;
                if (var4) {
                    Rasterizer2D.Rasterizer2D_resetClip();
                    Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
                    Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var3 + var1) - var9, var2, var9, -16777216);
                }
                var1 += var9;
                var3 -= var9 * 2;
            }
        }
        Client.viewportZoom = (var3 * var6) / 334;
        if ((var2 != Client.viewportWidth) || (var3 != Client.viewportHeight)) {
            NetSocket.method3096(var2, var3);
        }
        Client.viewportOffsetX = var0;
        Client.viewportOffsetY = var1;
        Client.viewportWidth = var2;
        Client.viewportHeight = var3;
    }

    @ObfuscatedName("is")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljz;I)Ljava/lang/String;", garbageValue = "926041177")
    static String method2725(String var0, Widget var1) {
        if (var0.indexOf("%") != (-1)) {
            for (int var2 = 1; var2 <= 5; ++var2) {
                while (true) {
                    int var3 = var0.indexOf("%" + var2);
                    if (var3 == (-1)) {
                        break;
                    }
                    var0 = (var0.substring(0, var3) + class231.method4766(class376.method6791(var1, var2 - 1))) + var0.substring(var3 + 2);
                } 
            }
        }
        return var0;
    }
}