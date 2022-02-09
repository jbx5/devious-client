import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fh")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lfh;")
    field1844(0, 0),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lfh;")
    @Export("HorizontalAlignment_centered")
    HorizontalAlignment_centered(1, 1),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lfh;")
    field1842(2, 2);
    @ObfuscatedName("bx")
    @ObfuscatedSignature(descriptor = "Lkr;")
    static StudioGame field1846;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1041895701)
    @Export("value")
    public final int value;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -829537569)
    @Export("id")
    final int id;

    HorizontalAlignment(int var3, int var4) {
        this.value = var3;
        this.id = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "90")
    public static boolean method3275(int var0) {
        return ((var0 >> 29) & 1) != 0;
    }

    @ObfuscatedName("hv")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1930800832")
    static final void method3279(boolean var0) {
        class122.playPcmPlayers();
        ++Client.packetWriter.pendingWrites;
        if ((Client.packetWriter.pendingWrites >= 50) || var0) {
            Client.packetWriter.pendingWrites = 0;
            if ((!Client.hadNetworkError) && (Client.packetWriter.getSocket() != null)) {
                PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2837, Client.packetWriter.isaacCipher);
                Client.packetWriter.addNode(var1);
                try {
                    Client.packetWriter.flush();
                } catch (IOException var3) {
                    Client.hadNetworkError = true;
                }
            }
        }
    }
}