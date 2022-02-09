import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("et")
public class class133 extends class126 {
    @ObfuscatedName("uy")
    @Export("foundItemIds")
    static short[] foundItemIds;

    @ObfuscatedName("bq")
    @ObfuscatedGetter(intValue = -2050424251)
    static int field1560;

    @ObfuscatedName("ix")
    @ObfuscatedGetter(intValue = 948344683)
    @Export("selectedItemWidget")
    static int selectedItemWidget;

    @ObfuscatedName("c")
    boolean field1559;

    @ObfuscatedName("l")
    byte field1565;

    @ObfuscatedName("s")
    byte field1562;

    @ObfuscatedName("e")
    byte field1558;

    @ObfuscatedName("r")
    byte field1561;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class133(class129 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1559 = var1.readUnsignedByte() == 1;
        this.field1565 = var1.readByte();
        this.field1562 = var1.readByte();
        this.field1558 = var1.readByte();
        this.field1561 = var1.readByte();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.allowGuests = this.field1559;
        var1.field1593 = this.field1565;
        var1.field1594 = this.field1562;
        var1.field1595 = this.field1558;
        var1.field1596 = this.field1561;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-278213073")
    public static boolean method2813(int var0) {
        return (var0 & 1) != 0;
    }

    @ObfuscatedName("ft")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "31")
    @Export("logOut")
    static final void logOut() {
        Client.packetWriter.close();
        UserComparator8.method2449();
        Decimator.scene.clear();
        for (int var0 = 0; var0 < 4; ++var0) {
            Client.collisionMaps[var0].clear();
        }
        System.gc();
        class259.method4998(2);
        Client.currentTrackGroupId = -1;
        Client.field744 = false;
        SequenceDefinition.method3623();
        class111.updateGameState(10);
    }

    @ObfuscatedName("lo")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "119")
    public static boolean method2807() {
        return Client.staffModLevel >= 2;
    }
}