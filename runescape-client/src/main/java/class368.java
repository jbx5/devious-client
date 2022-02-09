import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("np")
public class class368 {
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(S)[Lpd;", garbageValue = "12112")
    @Export("FillMode_values")
    public static FillMode[] FillMode_values() {
        return new FillMode[]{ FillMode.field4588, FillMode.SOLID, FillMode.field4591 };
    }

    @ObfuscatedName("hx")
    @ObfuscatedSignature(descriptor = "(ZLpc;I)V", garbageValue = "89997932")
    @Export("updateNpcs")
    static final void updateNpcs(boolean var0, PacketBuffer var1) {
        Client.field625 = 0;
        Client.field548 = 0;
        SecureRandomCallable.method2059();
        class20.method290(var0, var1);
        class142.method2952(var1);
        int var2;
        for (var2 = 0; var2 < Client.field625; ++var2) {
            int var3 = Client.field683[var2];
            if (Client.npcs[var3].npcCycle != Client.cycle) {
                Client.npcs[var3].definition = null;
                Client.npcs[var3] = null;
            }
        }
        if (var1.offset != Client.packetWriter.serverPacketLength) {
            throw new RuntimeException((var1.offset + ",") + Client.packetWriter.serverPacketLength);
        } else {
            for (var2 = 0; var2 < Client.npcCount; ++var2) {
                if (Client.npcs[Client.npcIndices[var2]] == null) {
                    throw new RuntimeException((var2 + ",") + Client.npcCount);
                }
            }
        }
    }
}