import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ev")
public class class135 extends class126 {
    @ObfuscatedName("ub")
    @ObfuscatedSignature(descriptor = "Lke;")
    @Export("grandExchangeEvents")
    static GrandExchangeEvents grandExchangeEvents;

    @ObfuscatedName("c")
    String field1576;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class135(class129 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1576 = var1.readStringCp1252NullTerminated();
        var1.readInt();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.name = this.field1576;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lie;Lpv;B)Lii;", garbageValue = "-119")
    @Export("getPacketBufferNode")
    public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
        PacketBufferNode var2;
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
            var2 = new PacketBufferNode();
        } else {
            var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
        }
        var2.clientPacket = var0;
        var2.clientPacketLength = var0.length;
        if (var2.clientPacketLength == (-1)) {
            var2.packetBuffer = new PacketBuffer(260);
        } else if (var2.clientPacketLength == (-2)) {
            var2.packetBuffer = new PacketBuffer(10000);
        } else if (var2.clientPacketLength <= 18) {
            var2.packetBuffer = new PacketBuffer(20);
        } else if (var2.clientPacketLength <= 98) {
            var2.packetBuffer = new PacketBuffer(100);
        } else {
            var2.packetBuffer = new PacketBuffer(260);
        }
        var2.packetBuffer.setIsaacCipher(var1);
        var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
        var2.index = 0;
        return var2;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1063067599")
    @Export("Widget_unpackTargetMask")
    public static int Widget_unpackTargetMask(int var0) {
        return (var0 >> 11) & 63;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(S)I", garbageValue = "-29709")
    public static int method2834() {
        return KeyHandler.KeyHandler_idleCycles;
    }
}