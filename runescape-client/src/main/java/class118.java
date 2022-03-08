import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dv")
public class class118 implements class110 {
    @ObfuscatedName("b")
    @Export("BZip2Decompressor_block")
    static int[] BZip2Decompressor_block;

    @ObfuscatedName("hc")
    @ObfuscatedGetter(intValue = 11763445)
    @Export("baseY")
    static int baseY;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-1768325568")
    @Export("isDigit")
    public static boolean isDigit(char var0) {
        return (var0 >= '0') && (var0 <= '9');
    }

    @ObfuscatedName("fy")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "5311")
    static final void method2657() {
        if (SoundSystem.Client_plane != Client.field735) {
            Client.field735 = SoundSystem.Client_plane;
            int var0 = SoundSystem.Client_plane;
            int[] var1 = class414.sceneMinimapSprite.pixels;
            int var2 = var1.length;
            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                var1[var3] = 0;
            }
            int var4;
            int var5;
            for (var3 = 1; var3 < 103; ++var3) {
                var4 = ((103 - var3) * 2048) + 24628;
                for (var5 = 1; var5 < 103; ++var5) {
                    if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
                        Decimator.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
                    }
                    if ((var0 < 3) && ((Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0)) {
                        Decimator.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
                    }
                    var4 += 4;
                }
            }
            var3 = ((((238 + ((int) (Math.random() * 20.0))) - 10) << 16) + (((238 + ((int) (Math.random() * 20.0))) - 10) << 8)) + ((238 + ((int) (Math.random() * 20.0))) - 10);
            var4 = ((238 + ((int) (Math.random() * 20.0))) - 10) << 16;
            class414.sceneMinimapSprite.setRaster();
            int var6;
            for (var5 = 1; var5 < 103; ++var5) {
                for (var6 = 1; var6 < 103; ++var6) {
                    if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
                        class7.drawObject(var0, var6, var5, var3, var4);
                    }
                    if ((var0 < 3) && ((Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0)) {
                        class7.drawObject(var0 + 1, var6, var5, var3, var4);
                    }
                }
            }
            Client.mapIconCount = 0;
            for (var5 = 0; var5 < 104; ++var5) {
                for (var6 = 0; var6 < 104; ++var6) {
                    long var7 = Decimator.scene.getFloorDecorationTag(SoundSystem.Client_plane, var5, var6);
                    if (var7 != 0L) {
                        int var9 = Skeleton.Entity_unpackID(var7);
                        int var10 = ParamComposition.getObjectDefinition(var9).mapIconId;
                        if ((var10 >= 0) && class126.WorldMapElement_get(var10).field1773) {
                            Client.mapIcons[Client.mapIconCount] = class126.WorldMapElement_get(var10).getSpriteBool(false);
                            Client.mapIconXs[Client.mapIconCount] = var5;
                            Client.mapIconYs[Client.mapIconCount] = var6;
                            ++Client.mapIconCount;
                        }
                    }
                }
            }
            PcmPlayer.rasterProvider.apply();
        }
    }
}