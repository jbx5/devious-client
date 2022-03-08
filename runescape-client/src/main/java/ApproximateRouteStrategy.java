import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bg")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
    ApproximateRouteStrategy() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IIILgi;S)Z", garbageValue = "-10612")
    @Export("hasArrived")
    public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
        return (var2 == super.approxDestinationX) && (var3 == super.approxDestinationY);
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Lpc;II)V", garbageValue = "530302706")
    @Export("readPlayerUpdate")
    static void readPlayerUpdate(PacketBuffer var0, int var1) {
        boolean var2 = var0.readBits(1) == 1;
        if (var2) {
            Players.Players_pendingUpdateIndices[(++Players.Players_pendingUpdateCount) - 1] = var1;
        }
        int var3 = var0.readBits(2);
        Player var4 = Client.players[var1];
        if (var3 == 0) {
            if (var2) {
                var4.field1067 = false;
            } else if (Client.localPlayerIndex == var1) {
                throw new RuntimeException();
            } else {
                Players.Players_regions[var1] = ((var4.plane << 28) + ((class118.baseY + var4.pathY[0]) >> 13)) + (((Canvas.baseX + var4.pathX[0]) >> 13) << 14);
                if (var4.field1138 != (-1)) {
                    Players.Players_orientations[var1] = var4.field1138;
                } else {
                    Players.Players_orientations[var1] = var4.orientation;
                }
                Players.Players_targetIndices[var1] = var4.targetIndex;
                Client.players[var1] = null;
                if (var0.readBits(1) != 0) {
                    class16.updateExternalPlayer(var0, var1);
                }
            }
        } else {
            int var5;
            int var6;
            int var7;
            if (var3 == 1) {
                var5 = var0.readBits(3);
                var6 = var4.pathX[0];
                var7 = var4.pathY[0];
                if (var5 == 0) {
                    --var6;
                    --var7;
                } else if (var5 == 1) {
                    --var7;
                } else if (var5 == 2) {
                    ++var6;
                    --var7;
                } else if (var5 == 3) {
                    --var6;
                } else if (var5 == 4) {
                    ++var6;
                } else if (var5 == 5) {
                    --var6;
                    ++var7;
                } else if (var5 == 6) {
                    ++var7;
                } else if (var5 == 7) {
                    ++var6;
                    ++var7;
                }
                if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
                    var4.resetPath(var6, var7);
                    var4.field1067 = false;
                } else if (var2) {
                    var4.field1067 = true;
                    var4.tileX = var6;
                    var4.tileY = var7;
                } else {
                    var4.field1067 = false;
                    var4.method2122(var6, var7, Players.field1277[var1]);
                }
            } else if (var3 == 2) {
                var5 = var0.readBits(4);
                var6 = var4.pathX[0];
                var7 = var4.pathY[0];
                if (var5 == 0) {
                    var6 -= 2;
                    var7 -= 2;
                } else if (var5 == 1) {
                    --var6;
                    var7 -= 2;
                } else if (var5 == 2) {
                    var7 -= 2;
                } else if (var5 == 3) {
                    ++var6;
                    var7 -= 2;
                } else if (var5 == 4) {
                    var6 += 2;
                    var7 -= 2;
                } else if (var5 == 5) {
                    var6 -= 2;
                    --var7;
                } else if (var5 == 6) {
                    var6 += 2;
                    --var7;
                } else if (var5 == 7) {
                    var6 -= 2;
                } else if (var5 == 8) {
                    var6 += 2;
                } else if (var5 == 9) {
                    var6 -= 2;
                    ++var7;
                } else if (var5 == 10) {
                    var6 += 2;
                    ++var7;
                } else if (var5 == 11) {
                    var6 -= 2;
                    var7 += 2;
                } else if (var5 == 12) {
                    --var6;
                    var7 += 2;
                } else if (var5 == 13) {
                    var7 += 2;
                } else if (var5 == 14) {
                    ++var6;
                    var7 += 2;
                } else if (var5 == 15) {
                    var6 += 2;
                    var7 += 2;
                }
                if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
                    var4.resetPath(var6, var7);
                    var4.field1067 = false;
                } else if (var2) {
                    var4.field1067 = true;
                    var4.tileX = var6;
                    var4.tileY = var7;
                } else {
                    var4.field1067 = false;
                    var4.method2122(var6, var7, Players.field1277[var1]);
                }
            } else {
                var5 = var0.readBits(1);
                int var8;
                int var9;
                int var10;
                int var11;
                if (var5 == 0) {
                    var6 = var0.readBits(12);
                    var7 = var6 >> 10;
                    var8 = (var6 >> 5) & 31;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var9 = var6 & 31;
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var10 = var8 + var4.pathX[0];
                    var11 = var9 + var4.pathY[0];
                    if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
                        var4.resetPath(var10, var11);
                        var4.field1067 = false;
                    } else if (var2) {
                        var4.field1067 = true;
                        var4.tileX = var10;
                        var4.tileY = var11;
                    } else {
                        var4.field1067 = false;
                        var4.method2122(var10, var11, Players.field1277[var1]);
                    }
                    var4.plane = ((byte) ((var7 + var4.plane) & 3));
                    if (Client.localPlayerIndex == var1) {
                        SoundSystem.Client_plane = var4.plane;
                    }
                } else {
                    var6 = var0.readBits(30);
                    var7 = var6 >> 28;
                    var8 = (var6 >> 14) & 16383;
                    var9 = var6 & 16383;
                    var10 = (((var8 + Canvas.baseX) + var4.pathX[0]) & 16383) - Canvas.baseX;
                    var11 = (((var9 + class118.baseY) + var4.pathY[0]) & 16383) - class118.baseY;
                    if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
                        var4.resetPath(var10, var11);
                        var4.field1067 = false;
                    } else if (var2) {
                        var4.field1067 = true;
                        var4.tileX = var10;
                        var4.tileY = var11;
                    } else {
                        var4.field1067 = false;
                        var4.method2122(var10, var11, Players.field1277[var1]);
                    }
                    var4.plane = ((byte) ((var7 + var4.plane) & 3));
                    if (Client.localPlayerIndex == var1) {
                        SoundSystem.Client_plane = var4.plane;
                    }
                }
            }
        }
    }
}