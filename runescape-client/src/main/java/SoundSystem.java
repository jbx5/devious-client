import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ad")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
    @ObfuscatedName("lm")
    @ObfuscatedGetter(intValue = 750290801)
    @Export("Client_plane")
    static int Client_plane;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "[Lag;")
    @Export("players")
    volatile PcmPlayer[] players;

    SoundSystem() {
        this.players = new PcmPlayer[2];
    }

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; ++var1) {
                PcmPlayer var2 = this.players[var1];
                if (var2 != null) {
                    var2.run();
                }
            }
        } catch (Exception var4) {
            FloorDecoration.RunException_sendStackTrace(((String) (null)), var4);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;B)V", garbageValue = "0")
    public static void method782(AbstractArchive var0) {
        EnumComposition.EnumDefinition_archive = var0;
    }
}