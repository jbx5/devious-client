import java.io.File;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("by")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
    @ObfuscatedName("l")
    @Export("FileSystem_cacheDir")
    static File FileSystem_cacheDir;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1997162195)
    public static int field1009;

    SecureRandomCallable() {
    }

    public Object call() {
        SecureRandom var2 = new SecureRandom();
        var2.nextInt();
        return var2;
    }

    @ObfuscatedName("hd")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "853607102")
    static final void method2059() {
        PacketBuffer var0 = Client.packetWriter.packetBuffer;
        var0.importIndex();
        int var1 = var0.readBits(8);
        int var2;
        if (var1 < Client.npcCount) {
            for (var2 = var1; var2 < Client.npcCount; ++var2) {
                Client.field683[(++Client.field625) - 1] = Client.npcIndices[var2];
            }
        }
        if (var1 > Client.npcCount) {
            throw new RuntimeException("");
        } else {
            Client.npcCount = 0;
            for (var2 = 0; var2 < var1; ++var2) {
                int var3 = Client.npcIndices[var2];
                NPC var4 = Client.npcs[var3];
                int var5 = var0.readBits(1);
                if (var5 == 0) {
                    Client.npcIndices[(++Client.npcCount) - 1] = var3;
                    var4.npcCycle = Client.cycle;
                } else {
                    int var6 = var0.readBits(2);
                    if (var6 == 0) {
                        Client.npcIndices[(++Client.npcCount) - 1] = var3;
                        var4.npcCycle = Client.cycle;
                        Client.field549[(++Client.field548) - 1] = var3;
                    } else {
                        int var7;
                        int var8;
                        if (var6 == 1) {
                            Client.npcIndices[(++Client.npcCount) - 1] = var3;
                            var4.npcCycle = Client.cycle;
                            var7 = var0.readBits(3);
                            var4.method2265(var7, class185.field2135);
                            var8 = var0.readBits(1);
                            if (var8 == 1) {
                                Client.field549[(++Client.field548) - 1] = var3;
                            }
                        } else if (var6 == 2) {
                            Client.npcIndices[(++Client.npcCount) - 1] = var3;
                            var4.npcCycle = Client.cycle;
                            if (var0.readBits(1) == 1) {
                                var7 = var0.readBits(3);
                                var4.method2265(var7, class185.field2132);
                                var8 = var0.readBits(3);
                                var4.method2265(var8, class185.field2132);
                            } else {
                                var7 = var0.readBits(3);
                                var4.method2265(var7, class185.field2133);
                            }
                            var7 = var0.readBits(1);
                            if (var7 == 1) {
                                Client.field549[(++Client.field548) - 1] = var3;
                            }
                        } else if (var6 == 3) {
                            Client.field683[(++Client.field625) - 1] = var3;
                        }
                    }
                }
            }
        }
    }
}