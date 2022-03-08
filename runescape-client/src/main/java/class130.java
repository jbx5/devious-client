import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("er")
public class class130 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1690885745)
    int field1541;

    @ObfuscatedName("l")
    byte field1540;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class130(class129 var1) {
        this.this$0 = var1;
        this.field1541 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1541 = var1.readUnsignedShort();
        this.field1540 = var1.readByte();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2857(this.field1541, this.field1540);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IB)Ljz;", garbageValue = "1")
    @Export("getWidget")
    public static Widget getWidget(int var0) {
        int var1 = var0 >> 16;
        int var2 = var0 & 65535;
        if ((Widget.Widget_interfaceComponents[var1] == null) || (Widget.Widget_interfaceComponents[var1][var2] == null)) {
            boolean var3 = class13.loadInterface(var1);
            if (!var3) {
                return null;
            }
        }
        return Widget.Widget_interfaceComponents[var1][var2];
    }
}