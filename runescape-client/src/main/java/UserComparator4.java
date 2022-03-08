import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cp")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator4(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;I)I", garbageValue = "689643923")
    @Export("compare_bridged")
    int compare_bridged(Buddy var1, Buddy var2) {
        return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
    }

    public int compare(Object var1, Object var2) {
        return this.compare_bridged(((Buddy) (var1)), ((Buddy) (var2)));
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ZS)V", garbageValue = "10562")
    public static void method2434(boolean var0) {
        if (NetCache.NetCache_socket != null) {
            try {
                Buffer var1 = new Buffer(4);
                var1.writeByte(var0 ? 2 : 3);
                var1.writeMedium(0);
                NetCache.NetCache_socket.write(var1.array, 0, 4);
            } catch (IOException var4) {
                try {
                    NetCache.NetCache_socket.close();
                } catch (Exception var3) {
                }
                ++NetCache.NetCache_ioExceptions;
                NetCache.NetCache_socket = null;
            }
        }
    }

    @ObfuscatedName("gx")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-63")
    static final void method2443() {
        int var0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        if (Client.oculusOrbState == 0) {
            var0 = WorldMapSprite.localPlayer.x;
            var1 = WorldMapSprite.localPlayer.y;
            if (((((class29.oculusOrbFocalPointX - var0) < (-500)) || ((class29.oculusOrbFocalPointX - var0) > 500)) || ((class121.oculusOrbFocalPointY - var1) < (-500))) || ((class121.oculusOrbFocalPointY - var1) > 500)) {
                class29.oculusOrbFocalPointX = var0;
                class121.oculusOrbFocalPointY = var1;
            }
            if (var0 != class29.oculusOrbFocalPointX) {
                class29.oculusOrbFocalPointX += (var0 - class29.oculusOrbFocalPointX) / 16;
            }
            if (var1 != class121.oculusOrbFocalPointY) {
                class121.oculusOrbFocalPointY += (var1 - class121.oculusOrbFocalPointY) / 16;
            }
            var2 = class29.oculusOrbFocalPointX >> 7;
            var3 = class121.oculusOrbFocalPointY >> 7;
            var4 = class92.getTileHeight(class29.oculusOrbFocalPointX, class121.oculusOrbFocalPointY, SoundSystem.Client_plane);
            var5 = 0;
            int var6;
            if ((((var2 > 3) && (var3 > 3)) && (var2 < 100)) && (var3 < 100)) {
                for (var6 = var2 - 4; var6 <= (var2 + 4); ++var6) {
                    for (int var7 = var3 - 4; var7 <= (var3 + 4); ++var7) {
                        int var8 = SoundSystem.Client_plane;
                        if ((var8 < 3) && ((Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2)) {
                            ++var8;
                        }
                        int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            var6 = var5 * 192;
            if (var6 > 98048) {
                var6 = 98048;
            }
            if (var6 < 32768) {
                var6 = 32768;
            }
            if (var6 > Client.field590) {
                Client.field590 += (var6 - Client.field590) / 24;
            } else if (var6 < Client.field590) {
                Client.field590 += (var6 - Client.field590) / 80;
            }
            SpriteMask.field3218 = class92.getTileHeight(WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight;
        } else if (Client.oculusOrbState == 1) {
            class16.method200();
            short var10 = -1;
            if (KeyHandler.KeyHandler_pressedKeys[33]) {
                var10 = 0;
            } else if (KeyHandler.KeyHandler_pressedKeys[49]) {
                var10 = 1024;
            }
            if (KeyHandler.KeyHandler_pressedKeys[48]) {
                if (var10 == 0) {
                    var10 = 1792;
                } else if (var10 == 1024) {
                    var10 = 1280;
                } else {
                    var10 = 1536;
                }
            } else if (KeyHandler.KeyHandler_pressedKeys[50]) {
                if (var10 == 0) {
                    var10 = 256;
                } else if (var10 == 1024) {
                    var10 = 768;
                } else {
                    var10 = 512;
                }
            }
            byte var11 = 0;
            if (KeyHandler.KeyHandler_pressedKeys[35]) {
                var11 = -1;
            } else if (KeyHandler.KeyHandler_pressedKeys[51]) {
                var11 = 1;
            }
            var2 = 0;
            if ((var10 >= 0) || (var11 != 0)) {
                var2 = (KeyHandler.KeyHandler_pressedKeys[81]) ? (Client.oculusOrbSlowedSpeed * (-1756488183)) * 714395705 : (Client.oculusOrbNormalSpeed * (-1640452853)) * 1261221539;
                var2 *= 16;
                Client.field497 = var10;
                Client.field583 = var11;
            }
            if (Client.field581 < var2) {
                Client.field581 += var2 / 8;
                if (Client.field581 > var2) {
                    Client.field581 = var2;
                }
            } else if (Client.field581 > var2) {
                Client.field581 = (Client.field581 * 9) / 10;
            }
            if (Client.field581 > 0) {
                var3 = Client.field581 / 16;
                if (Client.field497 >= 0) {
                    var0 = (Client.field497 - class7.cameraYaw) & 2047;
                    var4 = Rasterizer3D.Rasterizer3D_sine[var0];
                    var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
                    class29.oculusOrbFocalPointX += (var3 * var4) / 65536;
                    class121.oculusOrbFocalPointY += (var3 * var5) / 65536;
                }
                if (Client.field583 != 0) {
                    SpriteMask.field3218 += var3 * Client.field583;
                    if (SpriteMask.field3218 > 0) {
                        SpriteMask.field3218 = 0;
                    }
                }
            } else {
                Client.field497 = -1;
                Client.field583 = -1;
            }
            if (KeyHandler.KeyHandler_pressedKeys[13]) {
                Client.packetWriter.addNode(class135.getPacketBufferNode(ClientPacket.field2891, Client.packetWriter.isaacCipher));
                Client.oculusOrbState = 0;
            }
        }
        if ((MouseHandler.MouseHandler_currentButton == 4) && class370.mouseCam) {
            var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
            Client.camAngleDX = var0 * 2;
            Client.mouseCamClickedY = ((var0 != (-1)) && (var0 != 1)) ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : (MouseHandler.MouseHandler_y * 674458539) * 231487235;
            var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
            Client.camAngleDY = var1 * 2;
            Client.mouseCamClickedX = ((var1 != (-1)) && (var1 != 1)) ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : (MouseHandler.MouseHandler_x * (-639406763)) * 977348605;
        } else {
            if (KeyHandler.KeyHandler_pressedKeys[96]) {
                Client.camAngleDY += ((-24) - Client.camAngleDY) / 2;
            } else if (KeyHandler.KeyHandler_pressedKeys[97]) {
                Client.camAngleDY += (24 - Client.camAngleDY) / 2;
            } else {
                Client.camAngleDY /= 2;
            }
            if (KeyHandler.KeyHandler_pressedKeys[98]) {
                Client.camAngleDX += (12 - Client.camAngleDX) / 2;
            } else if (KeyHandler.KeyHandler_pressedKeys[99]) {
                Client.camAngleDX += ((-12) - Client.camAngleDX) / 2;
            } else {
                Client.camAngleDX /= 2;
            }
            Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
            Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
        }
        Client.camAngleY = ((Client.camAngleDY / 2) + Client.camAngleY) & 2047;
        Client.camAngleX += Client.camAngleDX / 2;
        if (Client.camAngleX < 128) {
            Client.camAngleX = 128;
        }
        if (Client.camAngleX > 383) {
            Client.camAngleX = 383;
        }
    }
}