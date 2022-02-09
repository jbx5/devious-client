import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("em")
public class class148 extends class126 {
    @ObfuscatedName("ed")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive12")
    static Archive archive12;

    @ObfuscatedName("c")
    @ObfuscatedGetter(longValue = -7662104054816781627L)
    long field1673;

    @ObfuscatedName("l")
    String field1669;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class148(class129 var1) {
        this.this$0 = var1;
        this.field1673 = -1L;
        this.field1669 = null;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        if (var1.readUnsignedByte() != 255) {
            --var1.offset;
            this.field1673 = var1.readLong();
        }
        this.field1669 = var1.readStringCp1252NullTerminatedOrNull();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2877(this.field1673, this.field1669);
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "2116759731")
    public static boolean method3005(int var0) {
        return (var0 >= 0) && (var0 < 112) ? KeyHandler.field138[var0] : false;
    }

    @ObfuscatedName("hc")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-1390458390")
    @Export("worldToScreen")
    static final void worldToScreen(int var0, int var1, int var2) {
        if ((((var0 >= 128) && (var1 >= 128)) && (var0 <= 13056)) && (var1 <= 13056)) {
            int var3 = class92.getTileHeight(var0, var1, SoundSystem.Client_plane) - var2;
            var0 -= class414.cameraX;
            var3 -= WorldMapDecoration.cameraY;
            var1 -= GrandExchangeOfferOwnWorldComparator.cameraZ;
            int var4 = Rasterizer3D.Rasterizer3D_sine[class7.cameraPitch];
            int var5 = Rasterizer3D.Rasterizer3D_cosine[class7.cameraPitch];
            int var6 = Rasterizer3D.Rasterizer3D_sine[class7.cameraYaw];
            int var7 = Rasterizer3D.Rasterizer3D_cosine[class7.cameraYaw];
            int var8 = ((var6 * var1) + (var0 * var7)) >> 16;
            var1 = ((var7 * var1) - (var0 * var6)) >> 16;
            var0 = var8;
            var8 = ((var5 * var3) - (var4 * var1)) >> 16;
            var1 = ((var4 * var3) + (var5 * var1)) >> 16;
            if (var1 >= 50) {
                Client.viewportTempX = ((var0 * Client.viewportZoom) / var1) + (Client.viewportWidth / 2);
                Client.viewportTempY = (Client.viewportHeight / 2) + ((var8 * Client.viewportZoom) / var1);
            } else {
                Client.viewportTempX = -1;
                Client.viewportTempY = -1;
            }
        } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
        }
    }
}