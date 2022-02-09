import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("b")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -1574703913)
    static int field156;

    DevicePcmPlayerProvider() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)Lag;", garbageValue = "-33")
    @Export("player")
    public PcmPlayer player() {
        return new DevicePcmPlayer();
    }

    @ObfuscatedName("jq")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-356427702")
    @Export("runIntfCloseListeners")
    static final void runIntfCloseListeners(int var0, int var1) {
        if (class13.loadInterface(var0)) {
            class33.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
        }
    }

    @ObfuscatedName("le")
    @ObfuscatedSignature(descriptor = "(IIIZB)V", garbageValue = "-119")
    public static void method361(int var0, int var1, int var2, boolean var3) {
        PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher);
        var4.packetBuffer.writeIntIME(var3 ? (Client.field513 * 1156105773) * 1721858469 : 0);
        var4.packetBuffer.writeShortLE(var0);
        var4.packetBuffer.writeByteSub(var2);
        var4.packetBuffer.writeShortLE(var1);
        Client.packetWriter.addNode(var4);
    }
}