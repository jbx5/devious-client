import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("n")
public class class16 implements ThreadFactory {
    @ObfuscatedName("ua")
    @ObfuscatedSignature(descriptor = "Lnb;")
    @Export("masterDisk")
    static ArchiveDisk masterDisk;

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("scriptDotWidget")
    static Widget scriptDotWidget;

    @ObfuscatedName("c")
    final ThreadGroup field93;

    @ObfuscatedName("l")
    final AtomicInteger field90;

    @ObfuscatedSignature(descriptor = "Lx;")
    final class14 this$0;

    @ObfuscatedSignature(descriptor = "(Lx;)V")
    class16(class14 var1) {
        this.this$0 = var1;
        this.field90 = new AtomicInteger(1);
        SecurityManager var2 = System.getSecurityManager();
        this.field93 = (var2 != null) ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    public Thread newThread(Runnable var1) {
        Thread var2 = new Thread(this.field93, var1, (this.this$0.field83 + "-rest-request-") + this.field90.getAndIncrement(), 0L);
        var2.setDaemon(true);
        var2.setPriority(5);
        return var2;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IILgx;Lgi;I)Z", garbageValue = "891896577")
    public static final boolean method199(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
        int var4 = var0;
        int var5 = var1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = var0 - var6;
        int var9 = var1 - var7;
        class186.directions[var6][var7] = 99;
        class186.distances[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class186.bufferX[var10] = var0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class186.bufferY[var10001] = var1;
        int[][] var12 = var3.flags;
        while (var11 != var18) {
            var4 = class186.bufferX[var11];
            var5 = class186.bufferY[var11];
            var11 = (var11 + 1) & 4095;
            int var16 = var4 - var8;
            int var17 = var5 - var9;
            int var13 = var4 - var3.xInset;
            int var14 = var5 - var3.yInset;
            if (var2.hasArrived(1, var4, var5, var3)) {
                SecureRandomCallable.field1009 = var4;
                class7.field39 = var5;
                return true;
            }
            int var15 = class186.distances[var16][var17] + 1;
            if (((var16 > 0) && (class186.directions[var16 - 1][var17] == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17] = 2;
                class186.distances[var16 - 1][var17] = var15;
            }
            if (((var16 < 127) && (class186.directions[var16 + 1][var17] == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17] = 8;
                class186.distances[var16 + 1][var17] = var15;
            }
            if (((var17 > 0) && (class186.directions[var16][var17 - 1] == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
                class186.bufferX[var18] = var4;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16][var17 - 1] = 1;
                class186.distances[var16][var17 - 1] = var15;
            }
            if (((var17 < 127) && (class186.directions[var16][var17 + 1] == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
                class186.bufferX[var18] = var4;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16][var17 + 1] = 4;
                class186.distances[var16][var17 + 1] = var15;
            }
            if ((((((var16 > 0) && (var17 > 0)) && (class186.directions[var16 - 1][var17 - 1] == 0)) && ((var12[var13 - 1][var14 - 1] & 19136782) == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17 - 1] = 3;
                class186.distances[var16 - 1][var17 - 1] = var15;
            }
            if ((((((var16 < 127) && (var17 > 0)) && (class186.directions[var16 + 1][var17 - 1] == 0)) && ((var12[var13 + 1][var14 - 1] & 19136899) == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5 - 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17 - 1] = 9;
                class186.distances[var16 + 1][var17 - 1] = var15;
            }
            if ((((((var16 > 0) && (var17 < 127)) && (class186.directions[var16 - 1][var17 + 1] == 0)) && ((var12[var13 - 1][var14 + 1] & 19136824) == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
                class186.bufferX[var18] = var4 - 1;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 - 1][var17 + 1] = 6;
                class186.distances[var16 - 1][var17 + 1] = var15;
            }
            if ((((((var16 < 127) && (var17 < 127)) && (class186.directions[var16 + 1][var17 + 1] == 0)) && ((var12[var13 + 1][var14 + 1] & 19136992) == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
                class186.bufferX[var18] = var4 + 1;
                class186.bufferY[var18] = var5 + 1;
                var18 = (var18 + 1) & 4095;
                class186.directions[var16 + 1][var17 + 1] = 12;
                class186.distances[var16 + 1][var17 + 1] = var15;
            }
        } 
        SecureRandomCallable.field1009 = var4;
        class7.field39 = var5;
        return false;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpc;II)Z", garbageValue = "220440385")
    @Export("updateExternalPlayer")
    static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
        int var2 = var0.readBits(2);
        int var3;
        int var4;
        int var7;
        int var8;
        int var9;
        int var10;
        if (var2 == 0) {
            if (var0.readBits(1) != 0) {
                updateExternalPlayer(var0, var1);
            }
            var3 = var0.readBits(13);
            var4 = var0.readBits(13);
            boolean var12 = var0.readBits(1) == 1;
            if (var12) {
                Players.Players_pendingUpdateIndices[(++Players.Players_pendingUpdateCount) - 1] = var1;
            }
            if (Client.players[var1] != null) {
                throw new RuntimeException();
            } else {
                Player var11 = Client.players[var1] = new Player();
                var11.index = var1;
                if (Players.field1278[var1] != null) {
                    var11.read(Players.field1278[var1]);
                }
                var11.orientation = Players.Players_orientations[var1];
                var11.targetIndex = Players.Players_targetIndices[var1];
                var7 = Players.Players_regions[var1];
                var8 = var7 >> 28;
                var9 = (var7 >> 14) & 255;
                var10 = var7 & 255;
                var11.pathTraversed[0] = Players.field1277[var1];
                var11.plane = ((byte) (var8));
                var11.resetPath(((var9 << 13) + var3) - Canvas.baseX, ((var10 << 13) + var4) - class118.baseY);
                var11.field1067 = false;
                return true;
            }
        } else if (var2 == 1) {
            var3 = var0.readBits(2);
            var4 = Players.Players_regions[var1];
            Players.Players_regions[var1] = (var4 & 268435455) + ((((var4 >> 28) + var3) & 3) << 28);
            return false;
        } else {
            int var5;
            int var6;
            if (var2 == 2) {
                var3 = var0.readBits(5);
                var4 = var3 >> 3;
                var5 = var3 & 7;
                var6 = Players.Players_regions[var1];
                var7 = ((var6 >> 28) + var4) & 3;
                var8 = (var6 >> 14) & 255;
                var9 = var6 & 255;
                if (var5 == 0) {
                    --var8;
                    --var9;
                }
                if (var5 == 1) {
                    --var9;
                }
                if (var5 == 2) {
                    ++var8;
                    --var9;
                }
                if (var5 == 3) {
                    --var8;
                }
                if (var5 == 4) {
                    ++var8;
                }
                if (var5 == 5) {
                    --var8;
                    ++var9;
                }
                if (var5 == 6) {
                    ++var9;
                }
                if (var5 == 7) {
                    ++var8;
                    ++var9;
                }
                Players.Players_regions[var1] = ((var8 << 14) + var9) + (var7 << 28);
                return false;
            } else {
                var3 = var0.readBits(18);
                var4 = var3 >> 16;
                var5 = (var3 >> 8) & 255;
                var6 = var3 & 255;
                var7 = Players.Players_regions[var1];
                var8 = ((var7 >> 28) + var4) & 3;
                var9 = (var5 + (var7 >> 14)) & 255;
                var10 = (var6 + var7) & 255;
                Players.Players_regions[var1] = ((var9 << 14) + var10) + (var8 << 28);
                return false;
            }
        }
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "28")
    static int method203(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
            Interpreter.Interpreter_intStackSize -= 2;
            Client.field775 = ((short) (class123.method2719(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])));
            if (Client.field775 <= 0) {
                Client.field775 = 256;
            }
            Client.field759 = ((short) (class123.method2719(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])));
            if (Client.field759 <= 0) {
                Client.field759 = 256;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
            Interpreter.Interpreter_intStackSize -= 2;
            Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
            if (Client.zoomHeight <= 0) {
                Client.zoomHeight = 256;
            }
            Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
            if (Client.zoomWidth <= 0) {
                Client.zoomWidth = 320;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
            Interpreter.Interpreter_intStackSize -= 4;
            Client.field762 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
            if (Client.field762 <= 0) {
                Client.field762 = 1;
            }
            Client.field763 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
            if (Client.field763 <= 0) {
                Client.field763 = 32767;
            } else if (Client.field763 < Client.field762) {
                Client.field763 = Client.field762;
            }
            Client.field656 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]));
            if (Client.field656 <= 0) {
                Client.field656 = 1;
            }
            Client.field514 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]));
            if (Client.field514 <= 0) {
                Client.field514 = 32767;
            } else if (Client.field514 < Client.field656) {
                Client.field514 = Client.field656;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
            if (Client.viewportWidget != null) {
                class124.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.viewportWidth;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.viewportHeight;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.zoomHeight;
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.zoomWidth;
            return 1;
        } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapCacheName.method4829(Client.field775);
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapCacheName.method4829(Client.field759);
            return 1;
        } else if (var0 == 6220) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            return 1;
        } else if (var0 == 6221) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            return 1;
        } else if (var0 == 6222) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = DirectByteArrayCopier.canvasWidth;
            return 1;
        } else if (var0 == 6223) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = NPC.canvasHeight;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZB)V", garbageValue = "-78")
    @Export("findItemDefinitions")
    static void findItemDefinitions(String var0, boolean var1) {
        var0 = var0.toLowerCase();
        short[] var2 = new short[16];
        int var3 = 0;
        for (int var4 = 0; var4 < HealthBarUpdate.ItemDefinition_fileCount; ++var4) {
            ItemComposition var9 = Client.ItemDefinition_get(var4);
            if ((((!var1) || var9.isTradable) && (var9.noteTemplate == (-1))) && (var9.name.toLowerCase().indexOf(var0) != (-1))) {
                if (var3 >= 250) {
                    FloorDecoration.foundItemIdCount = -1;
                    class133.foundItemIds = null;
                    return;
                }
                if (var3 >= var2.length) {
                    short[] var6 = new short[var2.length * 2];
                    for (int var7 = 0; var7 < var3; ++var7) {
                        var6[var7] = var2[var7];
                    }
                    var2 = var6;
                }
                var2[var3++] = ((short) (var4));
            }
        }
        class133.foundItemIds = var2;
        RouteStrategy.foundItemIndex = 0;
        FloorDecoration.foundItemIdCount = var3;
        String[] var8 = new String[FloorDecoration.foundItemIdCount];
        for (int var5 = 0; var5 < FloorDecoration.foundItemIdCount; ++var5) {
            var8[var5] = Client.ItemDefinition_get(var2[var5]).name;
        }
        Client.method1632(var8, class133.foundItemIds);
    }

    @ObfuscatedName("lt")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1378041734")
    static void method200() {
        if (Client.field587 && (WorldMapSprite.localPlayer != null)) {
            int var0 = WorldMapSprite.localPlayer.pathX[0];
            int var1 = WorldMapSprite.localPlayer.pathY[0];
            if ((((var0 < 0) || (var1 < 0)) || (var0 >= 104)) || (var1 >= 104)) {
                return;
            }
            class29.oculusOrbFocalPointX = WorldMapSprite.localPlayer.x;
            int var2 = class92.getTileHeight(WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight;
            if (var2 < SpriteMask.field3218) {
                SpriteMask.field3218 = var2;
            }
            class121.oculusOrbFocalPointY = WorldMapSprite.localPlayer.y;
            Client.field587 = false;
        }
    }
}