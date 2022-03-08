import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("go")
@Implements("FloorDecoration")
public final class FloorDecoration {
    @ObfuscatedName("uc")
    @ObfuscatedGetter(intValue = -251371719)
    @Export("foundItemIdCount")
    static int foundItemIdCount;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1811324103)
    @Export("tileHeight")
    int tileHeight;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -601207927)
    @Export("x")
    int x;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1611852145)
    @Export("y")
    int y;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lgp;")
    @Export("renderable")
    public Renderable renderable;

    @ObfuscatedName("r")
    @ObfuscatedGetter(longValue = -7858163560617167859L)
    @Export("tag")
    public long tag;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 339444929)
    @Export("flags")
    int flags;

    FloorDecoration() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", garbageValue = "-66389342")
    @Export("RunException_sendStackTrace")
    public static void RunException_sendStackTrace(String var0, Throwable var1) {
        if (var1 != null) {
            var1.printStackTrace();
        } else {
            try {
                String var2 = "";
                if (var1 != null) {
                    Throwable var4 = var1;
                    String var5;
                    if (var1 instanceof RunException) {
                        RunException var6 = ((RunException) (var1));
                        var5 = var6.message + " | ";
                        var4 = var6.throwable;
                    } else {
                        var5 = "";
                    }
                    StringWriter var18 = new StringWriter();
                    PrintWriter var7 = new PrintWriter(var18);
                    var4.printStackTrace(var7);
                    var7.close();
                    String var8 = var18.toString();
                    BufferedReader var9 = new BufferedReader(new StringReader(var8));
                    String var10 = var9.readLine();
                    label63 : while (true) {
                        while (true) {
                            String var11 = var9.readLine();
                            if (var11 == null) {
                                var5 = (var5 + "| ") + var10;
                                var2 = var5;
                                break label63;
                            }
                            int var12 = var11.indexOf(40);
                            int var13 = var11.indexOf(41, var12 + 1);
                            if ((var12 >= 0) && (var13 >= 0)) {
                                String var14 = var11.substring(var12 + 1, var13);
                                int var15 = var14.indexOf(".java:");
                                if (var15 >= 0) {
                                    var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                                    var5 = (var5 + var14) + ' ';
                                    continue;
                                }
                                var11 = var11.substring(0, var12);
                            }
                            var11 = var11.trim();
                            var11 = var11.substring(var11.lastIndexOf(32) + 1);
                            var11 = var11.substring(var11.lastIndexOf(9) + 1);
                            var5 = (var5 + var11) + ' ';
                        } 
                    } 
                }
                if (var0 != null) {
                    if (var1 != null) {
                        var2 = var2 + " | ";
                    }
                    var2 = var2 + var0;
                }
                System.out.println("Error: " + var2);
                var2 = var2.replace(':', '.');
                var2 = var2.replace('@', '_');
                var2 = var2.replace('&', '_');
                var2 = var2.replace('#', '_');
                if (RunException.RunException_applet == null) {
                    return;
                }
                URL var3 = new URL(RunException.RunException_applet.getCodeBase(), (((((((((("clienterror.ws?c=" + class1.RunException_revision) + "&u=") + RunException.localPlayerName) + "&v1=") + TaskHandler.javaVendor) + "&v2=") + class134.javaVersion) + "&ct=") + RunException.clientType) + "&e=") + var2);
                DataInputStream var17 = new DataInputStream(var3.openStream());
                var17.read();
                var17.close();
            } catch (Exception var16) {
            }
        }
    }

    @ObfuscatedName("hy")
    @ObfuscatedSignature(descriptor = "(IIIIIIII)V", garbageValue = "1835518500")
    @Export("addPendingSpawnToScene")
    static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if ((((var2 >= 1) && (var3 >= 1)) && (var2 <= 102)) && (var3 <= 102)) {
            if (Client.isLowDetail && (var0 != SoundSystem.Client_plane)) {
                return;
            }
            long var7 = 0L;
            boolean var9 = true;
            boolean var10 = false;
            boolean var11 = false;
            if (var1 == 0) {
                var7 = Decimator.scene.getBoundaryObjectTag(var0, var2, var3);
            }
            if (var1 == 1) {
                var7 = Decimator.scene.getWallDecorationTag(var0, var2, var3);
            }
            if (var1 == 2) {
                var7 = Decimator.scene.getGameObjectTag(var0, var2, var3);
            }
            if (var1 == 3) {
                var7 = Decimator.scene.getFloorDecorationTag(var0, var2, var3);
            }
            int var12;
            if (var7 != 0L) {
                var12 = Decimator.scene.getObjectFlags(var0, var2, var3, var7);
                int var38 = Skeleton.Entity_unpackID(var7);
                int var39 = var12 & 31;
                int var40 = (var12 >> 6) & 3;
                ObjectComposition var13;
                if (var1 == 0) {
                    Decimator.scene.removeBoundaryObject(var0, var2, var3);
                    var13 = ParamComposition.getObjectDefinition(var38);
                    if (var13.interactType != 0) {
                        Client.collisionMaps[var0].method3653(var2, var3, var39, var40, var13.boolean1);
                    }
                }
                if (var1 == 1) {
                    Decimator.scene.removeWallDecoration(var0, var2, var3);
                }
                if (var1 == 2) {
                    Decimator.scene.removeGameObject(var0, var2, var3);
                    var13 = ParamComposition.getObjectDefinition(var38);
                    if (((((var2 + var13.sizeX) > 103) || ((var3 + var13.sizeX) > 103)) || ((var2 + var13.sizeY) > 103)) || ((var3 + var13.sizeY) > 103)) {
                        return;
                    }
                    if (var13.interactType != 0) {
                        Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
                    }
                }
                if (var1 == 3) {
                    Decimator.scene.removeFloorDecoration(var0, var2, var3);
                    var13 = ParamComposition.getObjectDefinition(var38);
                    if (var13.interactType == 1) {
                        Client.collisionMaps[var0].method3656(var2, var3);
                    }
                }
            }
            if (var4 >= 0) {
                var12 = var0;
                if ((var0 < 3) && ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2)) {
                    var12 = var0 + 1;
                }
                Scene var41 = Decimator.scene;
                CollisionMap var14 = Client.collisionMaps[var0];
                ObjectComposition var15 = ParamComposition.getObjectDefinition(var4);
                int var16;
                int var17;
                if ((var5 != 1) && (var5 != 3)) {
                    var16 = var15.sizeX;
                    var17 = var15.sizeY;
                } else {
                    var16 = var15.sizeY;
                    var17 = var15.sizeX;
                }
                int var18;
                int var19;
                if ((var16 + var2) <= 104) {
                    var18 = (var16 >> 1) + var2;
                    var19 = var2 + ((var16 + 1) >> 1);
                } else {
                    var18 = var2;
                    var19 = var2 + 1;
                }
                int var20;
                int var21;
                if ((var3 + var17) <= 104) {
                    var20 = var3 + (var17 >> 1);
                    var21 = var3 + ((var17 + 1) >> 1);
                } else {
                    var20 = var3;
                    var21 = var3 + 1;
                }
                int[][] var22 = Tiles.Tiles_heights[var12];
                int var23 = (((var22[var19][var21] + var22[var19][var20]) + var22[var18][var20]) + var22[var18][var21]) >> 2;
                int var24 = (var2 << 7) + (var16 << 6);
                int var25 = (var3 << 7) + (var17 << 6);
                long var26 = ScriptEvent.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
                int var28 = (var5 << 6) + var6;
                if (var15.int3 == 1) {
                    var28 += 256;
                }
                Object var36;
                if (var6 == 22) {
                    if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                        var36 = var15.getModel(22, var5, var22, var24, var23, var25);
                    } else {
                        var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                    }
                    var41.newFloorDecoration(var0, var2, var3, var23, ((Renderable) (var36)), var26, var28);
                    if (var15.interactType == 1) {
                        var14.setBlockedByFloorDec(var2, var3);
                    }
                } else if ((var6 != 10) && (var6 != 11)) {
                    if (var6 >= 12) {
                        if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                            var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
                        } else {
                            var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                        }
                        var41.method4027(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
                        if (var15.interactType != 0) {
                            var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
                        }
                    } else if (var6 == 0) {
                        if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                            var36 = var15.getModel(0, var5, var22, var24, var23, var25);
                        } else {
                            var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                        }
                        var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field999[var5], 0, var26, var28);
                        if (var15.interactType != 0) {
                            var14.method3651(var2, var3, var6, var5, var15.boolean1);
                        }
                    } else if (var6 == 1) {
                        if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                            var36 = var15.getModel(1, var5, var22, var24, var23, var25);
                        } else {
                            var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                        }
                        var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field1000[var5], 0, var26, var28);
                        if (var15.interactType != 0) {
                            var14.method3651(var2, var3, var6, var5, var15.boolean1);
                        }
                    } else {
                        int var29;
                        if (var6 == 2) {
                            var29 = (var5 + 1) & 3;
                            Object var31;
                            Object var37;
                            if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
                                var31 = var15.getModel(2, var29, var22, var24, var23, var25);
                            } else {
                                var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                            }
                            var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var37)), ((Renderable) (var31)), Tiles.field999[var5], Tiles.field999[var29], var26, var28);
                            if (var15.interactType != 0) {
                                var14.method3651(var2, var3, var6, var5, var15.boolean1);
                            }
                        } else if (var6 == 3) {
                            if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                var36 = var15.getModel(3, var5, var22, var24, var23, var25);
                            } else {
                                var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                            }
                            var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field1000[var5], 0, var26, var28);
                            if (var15.interactType != 0) {
                                var14.method3651(var2, var3, var6, var5, var15.boolean1);
                            }
                        } else if (var6 == 9) {
                            if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
                            } else {
                                var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                            }
                            var41.method4027(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
                            if (var15.interactType != 0) {
                                var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
                            }
                        } else if (var6 == 4) {
                            if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                var36 = var15.getModel(4, var5, var22, var24, var23, var25);
                            } else {
                                var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                            }
                            var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field999[var5], 0, 0, 0, var26, var28);
                        } else {
                            long var30;
                            Object var32;
                            if (var6 == 5) {
                                var29 = 16;
                                var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                                if (0L != var30) {
                                    var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2;
                                }
                                if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                    var32 = var15.getModel(4, var5, var22, var24, var23, var25);
                                } else {
                                    var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                }
                                var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), Tiles.field999[var5], 0, var29 * Tiles.field1001[var5], var29 * Tiles.field1002[var5], var26, var28);
                            } else if (var6 == 6) {
                                var29 = 8;
                                var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                                if (0L != var30) {
                                    var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2 / 2;
                                }
                                if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                    var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
                                } else {
                                    var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                }
                                var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), 256, var5, var29 * Tiles.field1003[var5], var29 * Tiles.field1005[var5], var26, var28);
                            } else if (var6 == 7) {
                                int var35 = (var5 + 2) & 3;
                                if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                    var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
                                } else {
                                    var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                }
                                var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), 256, var35, 0, 0, var26, var28);
                            } else if (var6 == 8) {
                                var29 = 8;
                                var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                                if (0L != var30) {
                                    var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2 / 2;
                                }
                                int var34 = (var5 + 2) & 3;
                                Object var33;
                                if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                                    var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
                                    var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
                                } else {
                                    var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                    var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                                }
                                var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (var33)), 256, var5, var29 * Tiles.field1003[var5], var29 * Tiles.field1005[var5], var26, var28);
                            }
                        }
                    }
                } else {
                    if ((var15.animationId == (-1)) && (var15.transforms == null)) {
                        var36 = var15.getModel(10, var5, var22, var24, var23, var25);
                    } else {
                        var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
                    }
                    if (var36 != null) {
                        var41.method4027(var0, var2, var3, var23, var16, var17, ((Renderable) (var36)), var6 == 11 ? 256 : 0, var26, var28);
                    }
                    if (var15.interactType != 0) {
                        var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
                    }
                }
            }
        }
    }
}