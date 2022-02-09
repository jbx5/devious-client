import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("w")
public class class7 {
    @ObfuscatedName("sp")
    @ObfuscatedGetter(intValue = -495360995)
    static int field33;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1430198081)
    public static int field39;

    @ObfuscatedName("a")
    @Export("Tiles_hue")
    static int[] Tiles_hue;

    @ObfuscatedName("u")
    public static short[][] field40;

    @ObfuscatedName("ep")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive0")
    static Archive archive0;

    @ObfuscatedName("ii")
    @ObfuscatedGetter(intValue = -1073511333)
    @Export("cameraPitch")
    static int cameraPitch;

    @ObfuscatedName("iq")
    @ObfuscatedGetter(intValue = 1883104503)
    @Export("cameraYaw")
    static int cameraYaw;

    @ObfuscatedName("c")
    ExecutorService field34;

    @ObfuscatedName("l")
    Future field42;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lpi;")
    final Buffer field30;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Le;")
    final class3 field31;

    @ObfuscatedSignature(descriptor = "(Lpi;Le;)V")
    public class7(Buffer var1, class3 var2) {
        this.field34 = Executors.newSingleThreadExecutor();
        this.field30 = var1;
        this.field31 = var2;
        this.method46();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "343029273")
    public boolean method43() {
        return this.field42.isDone();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-42")
    public void method44() {
        this.field34.shutdown();
        this.field34 = null;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Lpi;", garbageValue = "-149589484")
    public Buffer method45() {
        try {
            return ((Buffer) (this.field42.get()));
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2103816119")
    void method46() {
        this.field42 = this.field34.submit(new class1(this, this.field30, this.field31));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-863466486")
    static final void method51(int var0, int var1, int var2, int var3) {
        for (int var4 = var1; var4 <= (var3 + var1); ++var4) {
            for (int var5 = var0; var5 <= (var0 + var2); ++var5) {
                if ((((var5 >= 0) && (var5 < 104)) && (var4 >= 0)) && (var4 < 104)) {
                    class260.field3078[0][var5][var4] = 127;
                    if ((var0 == var5) && (var5 > 0)) {
                        Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
                    }
                    if ((var5 == (var0 + var2)) && (var5 < 103)) {
                        Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
                    }
                    if ((var4 == var1) && (var4 > 0)) {
                        Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
                    }
                    if ((var4 == (var3 + var1)) && (var4 < 103)) {
                        Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1815302672")
    @Export("Messages_getHistorySize")
    static int Messages_getHistorySize(int var0) {
        ChatChannel var1 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
        return var1 == null ? 0 : var1.size();
    }

    @ObfuscatedName("ar")
    @ObfuscatedSignature(descriptor = "(Lan;I)V", garbageValue = "2092950553")
    @Export("PcmStream_disable")
    static final void PcmStream_disable(PcmStream var0) {
        var0.active = false;
        if (var0.sound != null) {
            var0.sound.position = 0;
        }
        for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
            PcmStream_disable(var1);
        }
    }

    @ObfuscatedName("hw")
    @ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "-382096679")
    @Export("drawObject")
    static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
        long var5 = Decimator.scene.getBoundaryObjectTag(var0, var1, var2);
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var13;
        if (var5 != 0L) {
            var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5);
            var8 = (var7 >> 6) & 3;
            var9 = var7 & 31;
            var10 = var3;
            if (LoginScreenAnimation.method2219(var5)) {
                var10 = var4;
            }
            int[] var11 = class414.sceneMinimapSprite.pixels;
            var12 = ((var1 * 4) + ((103 - var2) * 2048)) + 24624;
            var13 = Skeleton.Entity_unpackID(var5);
            ObjectComposition var14 = ParamComposition.getObjectDefinition(var13);
            if (var14.mapSceneId != (-1)) {
                IndexedSprite var15 = class10.mapSceneSprites[var14.mapSceneId];
                if (var15 != null) {
                    int var16 = ((var14.sizeX * 4) - var15.subWidth) / 2;
                    int var17 = ((var14.sizeY * 4) - var15.subHeight) / 2;
                    var15.drawAt((var16 + (var1 * 4)) + 48, (var17 + (((104 - var2) - var14.sizeY) * 4)) + 48);
                }
            } else {
                if ((var9 == 0) || (var9 == 2)) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[(var12 + 512) + 3] = var10;
                        var11[(var12 + 1024) + 3] = var10;
                        var11[(var12 + 1536) + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[(var12 + 1536) + 1] = var10;
                        var11[(var12 + 1536) + 2] = var10;
                        var11[(var12 + 1536) + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[(var12 + 1536) + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[(var12 + 512) + 3] = var10;
                        var11[(var12 + 1024) + 3] = var10;
                        var11[(var12 + 1536) + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[(var12 + 1536) + 1] = var10;
                        var11[(var12 + 1536) + 2] = var10;
                        var11[(var12 + 1536) + 3] = var10;
                    }
                }
            }
        }
        var5 = Decimator.scene.getGameObjectTag(var0, var1, var2);
        if (0L != var5) {
            var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5);
            var8 = (var7 >> 6) & 3;
            var9 = var7 & 31;
            var10 = Skeleton.Entity_unpackID(var5);
            ObjectComposition var24 = ParamComposition.getObjectDefinition(var10);
            int var19;
            if (var24.mapSceneId != (-1)) {
                IndexedSprite var20 = class10.mapSceneSprites[var24.mapSceneId];
                if (var20 != null) {
                    var13 = ((var24.sizeX * 4) - var20.subWidth) / 2;
                    var19 = ((var24.sizeY * 4) - var20.subHeight) / 2;
                    var20.drawAt((var13 + (var1 * 4)) + 48, ((((104 - var2) - var24.sizeY) * 4) + var19) + 48);
                }
            } else if (var9 == 9) {
                var12 = 15658734;
                if (LoginScreenAnimation.method2219(var5)) {
                    var12 = 15597568;
                }
                int[] var18 = class414.sceneMinimapSprite.pixels;
                var19 = ((var1 * 4) + ((103 - var2) * 2048)) + 24624;
                if ((var8 != 0) && (var8 != 2)) {
                    var18[var19] = var12;
                    var18[(var19 + 1) + 512] = var12;
                    var18[(var19 + 1024) + 2] = var12;
                    var18[(var19 + 1536) + 3] = var12;
                } else {
                    var18[var19 + 1536] = var12;
                    var18[(var19 + 1) + 1024] = var12;
                    var18[(var19 + 512) + 2] = var12;
                    var18[var19 + 3] = var12;
                }
            }
        }
        var5 = Decimator.scene.getFloorDecorationTag(var0, var1, var2);
        if (0L != var5) {
            var7 = Skeleton.Entity_unpackID(var5);
            ObjectComposition var21 = ParamComposition.getObjectDefinition(var7);
            if (var21.mapSceneId != (-1)) {
                IndexedSprite var22 = class10.mapSceneSprites[var21.mapSceneId];
                if (var22 != null) {
                    var10 = ((var21.sizeX * 4) - var22.subWidth) / 2;
                    int var23 = ((var21.sizeY * 4) - var22.subHeight) / 2;
                    var22.drawAt(((var1 * 4) + var10) + 48, (var23 + (((104 - var2) - var21.sizeY) * 4)) + 48);
                }
            }
        }
    }
}