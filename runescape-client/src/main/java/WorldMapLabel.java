import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hp")
@Implements("WorldMapLabel")
public class WorldMapLabel {
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -485692107)
    static int field2761;

    @ObfuscatedName("hw")
    @Export("regions")
    static int[] regions;

    @ObfuscatedName("c")
    @Export("text")
    String text;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -941943719)
    @Export("width")
    int width;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 238298517)
    @Export("height")
    int height;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lhh;")
    @Export("size")
    WorldMapLabelSize size;

    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IILhh;)V")
    WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
        this.text = var1;
        this.width = var2;
        this.height = var3;
        this.size = var4;
    }

    @ObfuscatedName("fc")
    @ObfuscatedSignature(descriptor = "(Lkz;Ljava/lang/String;I)V", garbageValue = "-1399246639")
    static void method4762(Archive var0, String var1) {
        ArchiveLoader var2 = new ArchiveLoader(var0, var1);
        Client.archiveLoaders.add(var2);
        Client.field698 += var2.groupCount;
    }

    @ObfuscatedName("iq")
    @ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "-1943247102")
    static final void method4763(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var2 - var0;
        int var7 = var3 - var1;
        int var8 = (var6 >= 0) ? var6 : -var6;
        int var9 = (var7 >= 0) ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 != 0) {
            int var11 = (var6 << 16) / var10;
            int var12 = (var7 << 16) / var10;
            if (var12 <= var11) {
                var11 = -var11;
            } else {
                var12 = -var12;
            }
            int var13 = (var5 * var12) >> 17;
            int var14 = ((var5 * var12) + 1) >> 17;
            int var15 = (var5 * var11) >> 17;
            int var16 = ((var5 * var11) + 1) >> 17;
            var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
            var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
            int var17 = var0 + var13;
            int var18 = var0 - var14;
            int var19 = (var0 + var6) - var14;
            int var20 = (var0 + var6) + var13;
            int var21 = var15 + var1;
            int var22 = var1 - var16;
            int var23 = (var7 + var1) - var16;
            int var24 = (var15 + var7) + var1;
            Rasterizer3D.method3792(var17, var18, var19);
            Rasterizer3D.method3797(var21, var22, var23, var17, var18, var19, var4);
            Rasterizer3D.method3792(var17, var19, var20);
            Rasterizer3D.method3797(var21, var23, var24, var17, var19, var20, var4);
        }
    }
}