import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jk")
public class class265 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("musicPatchesArchive")
    public static AbstractArchive musicPatchesArchive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("musicSamplesArchive")
    public static AbstractArchive musicSamplesArchive;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Ljb;")
    @Export("midiPcmStream")
    public static MidiPcmStream midiPcmStream;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1954424185)
    @Export("musicPlayerStatus")
    public static int musicPlayerStatus;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("musicTrackArchive")
    public static AbstractArchive musicTrackArchive;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -629142723)
    @Export("musicTrackGroupId")
    public static int musicTrackGroupId;

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "Ljp;")
    @Export("musicTrack")
    public static MusicTrack musicTrack;

    static {
        musicPlayerStatus = 0;
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Ljz;I[B[BI)V", garbageValue = "-1577741603")
    @Export("Widget_setKey")
    static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
        if (var0.field3339 == null) {
            if (var2 == null) {
                return;
            }
            var0.field3339 = new byte[11][];
            var0.field3397 = new byte[11][];
            var0.field3341 = new int[11];
            var0.field3342 = new int[11];
        }
        var0.field3339[var1] = var2;
        if (var2 != null) {
            var0.field3338 = true;
        } else {
            var0.field3338 = false;
            for (int var4 = 0; var4 < var0.field3339.length; ++var4) {
                if (var0.field3339[var4] != null) {
                    var0.field3338 = true;
                    break;
                }
            }
        }
        var0.field3397[var1] = var3;
    }

    @ObfuscatedName("hs")
    @ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "-490777223")
    static final void method5030(int var0, int var1, boolean var2) {
        if (((!var2) || (var0 != MouseHandler.field240)) || (UserComparator7.field1352 != var1)) {
            MouseHandler.field240 = var0;
            UserComparator7.field1352 = var1;
            class111.updateGameState(25);
            Calendar.drawLoadingMessage("Loading - please wait.", true);
            int var3 = Canvas.baseX;
            int var4 = class118.baseY;
            Canvas.baseX = (var0 - 6) * 8;
            class118.baseY = (var1 - 6) * 8;
            int var5 = Canvas.baseX - var3;
            int var6 = class118.baseY - var4;
            var3 = Canvas.baseX;
            var4 = class118.baseY;
            int var7;
            int var9;
            int[] var10000;
            for (var7 = 0; var7 < 32768; ++var7) {
                NPC var19 = Client.npcs[var7];
                if (var19 != null) {
                    for (var9 = 0; var9 < 10; ++var9) {
                        var10000 = var19.pathX;
                        var10000[var9] -= var5;
                        var10000 = var19.pathY;
                        var10000[var9] -= var6;
                    }
                    var19.x -= var5 * 128;
                    var19.y -= var6 * 128;
                }
            }
            for (var7 = 0; var7 < 2048; ++var7) {
                Player var22 = Client.players[var7];
                if (var22 != null) {
                    for (var9 = 0; var9 < 10; ++var9) {
                        var10000 = var22.pathX;
                        var10000[var9] -= var5;
                        var10000 = var22.pathY;
                        var10000[var9] -= var6;
                    }
                    var22.x -= var5 * 128;
                    var22.y -= var6 * 128;
                }
            }
            byte var20 = 0;
            byte var8 = 104;
            byte var21 = 1;
            if (var5 < 0) {
                var20 = 103;
                var8 = -1;
                var21 = -1;
            }
            byte var10 = 0;
            byte var11 = 104;
            byte var12 = 1;
            if (var6 < 0) {
                var10 = 103;
                var11 = -1;
                var12 = -1;
            }
            int var14;
            for (int var13 = var20; var13 != var8; var13 += var21) {
                for (var14 = var10; var11 != var14; var14 += var12) {
                    int var15 = var5 + var13;
                    int var16 = var14 + var6;
                    for (int var17 = 0; var17 < 4; ++var17) {
                        if ((((var15 >= 0) && (var16 >= 0)) && (var15 < 104)) && (var16 < 104)) {
                            Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
                        } else {
                            Client.groundItems[var17][var13][var14] = null;
                        }
                    }
                }
            }
            for (PendingSpawn var18 = ((PendingSpawn) (Client.pendingSpawns.last())); var18 != null; var18 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
                var18.x -= var5;
                var18.y -= var6;
                if ((((var18.x < 0) || (var18.y < 0)) || (var18.x >= 104)) || (var18.y >= 104)) {
                    var18.remove();
                }
            }
            if (Client.destinationX != 0) {
                Client.destinationX -= var5;
                Client.destinationY -= var6;
            }
            Client.soundEffectCount = 0;
            Client.isCameraLocked = false;
            class414.cameraX -= var5 << 7;
            GrandExchangeOfferOwnWorldComparator.cameraZ -= var6 << 7;
            class29.oculusOrbFocalPointX -= var5 << 7;
            class121.oculusOrbFocalPointY -= var6 << 7;
            Client.field735 = -1;
            Client.graphicsObjects.clear();
            Client.projectiles.clear();
            for (var14 = 0; var14 < 4; ++var14) {
                Client.collisionMaps[var14].clear();
            }
        }
    }
}