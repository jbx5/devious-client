import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ak")
public class class28 {
    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Lpg;")
    @Export("logoSprite")
    static IndexedSprite logoSprite;

    static {
        ImageIO.setUseCache(false);
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(Lex;III)Lag;", garbageValue = "1463903450")
    public static final PcmPlayer method405(TaskHandler var0, int var1, int var2) {
        if ((var1 >= 0) && (var1 < 2)) {
            if (var2 < 256) {
                var2 = 256;
            }
            try {
                PcmPlayer var3 = class339.pcmPlayerProvider.player();
                var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
                var3.field296 = var2;
                var3.init();
                var3.capacity = (var2 & (-1024)) + 1024;
                if (var3.capacity > 16384) {
                    var3.capacity = 16384;
                }
                var3.open(var3.capacity);
                if ((DevicePcmPlayerProvider.field156 > 0) && (class415.soundSystem == null)) {
                    class415.soundSystem = new SoundSystem();
                    PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
                    PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class415.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (class415.soundSystem != null) {
                    if (class415.soundSystem.players[var1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class415.soundSystem.players[var1] = var3;
                }
                return var3;
            } catch (Throwable var4) {
                return new PcmPlayer();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kf")
    @ObfuscatedSignature(descriptor = "(Ljz;I)V", garbageValue = "-576832412")
    static final void method406(Widget var0) {
        int var1 = var0.contentType;
        if (var1 == 324) {
            if (Client.field585 == (-1)) {
                Client.field585 = var0.spriteId2;
                Client.field773 = var0.spriteId;
            }
            if (Client.playerAppearance.isFemale) {
                var0.spriteId2 = Client.field585;
            } else {
                var0.spriteId2 = Client.field773;
            }
        } else if (var1 == 325) {
            if (Client.field585 == (-1)) {
                Client.field585 = var0.spriteId2;
                Client.field773 = var0.spriteId;
            }
            if (Client.playerAppearance.isFemale) {
                var0.spriteId2 = Client.field773;
            } else {
                var0.spriteId2 = Client.field585;
            }
        } else if (var1 == 327) {
            var0.modelAngleX = 150;
            var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
            var0.modelType = 5;
            var0.modelId = 0;
        } else if (var1 == 328) {
            var0.modelAngleX = 150;
            var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
            var0.modelType = 5;
            var0.modelId = 1;
        }
    }
}