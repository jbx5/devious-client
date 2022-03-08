import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("la")
public class class312 {
    @ObfuscatedName("it")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "124")
    @Export("resumePauseWidget")
    static void resumePauseWidget(int var0, int var1) {
        PacketBufferNode var2 = class135.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
        var2.packetBuffer.writeInt(var0);
        var2.packetBuffer.writeShort(var1);
        Client.packetWriter.addNode(var2);
    }
}