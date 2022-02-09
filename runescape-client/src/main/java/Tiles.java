import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bo")
@Implements("Tiles")
public final class Tiles {
    @ObfuscatedName("c")
    @Export("Tiles_heights")
    static int[][][] Tiles_heights;

    @ObfuscatedName("l")
    @Export("Tiles_renderFlags")
    static byte[][][] Tiles_renderFlags;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1925711117)
    @Export("Tiles_minPlane")
    static int Tiles_minPlane;

    @ObfuscatedName("e")
    @Export("Tiles_underlays")
    static byte[][][] Tiles_underlays;

    @ObfuscatedName("r")
    @Export("Tiles_overlays")
    static byte[][][] Tiles_overlays;

    @ObfuscatedName("o")
    @Export("Tiles_shapes")
    static byte[][][] Tiles_shapes;

    @ObfuscatedName("i")
    static byte[][][] field998;

    @ObfuscatedName("d")
    static final int[] field999;

    @ObfuscatedName("j")
    static final int[] field1000;

    @ObfuscatedName("f")
    static final int[] field1001;

    @ObfuscatedName("g")
    static final int[] field1002;

    @ObfuscatedName("t")
    static final int[] field1003;

    @ObfuscatedName("k")
    static final int[] field1005;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -942884641)
    @Export("rndHue")
    static int rndHue;

    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -186340013)
    @Export("rndLightness")
    static int rndLightness;

    static {
        Tiles_heights = new int[4][105][105];
        Tiles_renderFlags = new byte[4][104][104];
        Tiles_minPlane = 99;
        field999 = new int[]{ 1, 2, 4, 8 };
        field1000 = new int[]{ 16, 32, 64, 128 };
        field1001 = new int[]{ 1, 0, -1, 0 };
        field1002 = new int[]{ 0, -1, 0, 1 };
        field1003 = new int[]{ 1, -1, -1, 1 };
        field1005 = new int[]{ -1, -1, 1, 1 };
        rndHue = ((int) (Math.random() * 17.0)) - 8;
        rndLightness = ((int) (Math.random() * 33.0)) - 16;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;ZI)[B", garbageValue = "-424882232")
    public static byte[] method2039(Object var0, boolean var1) {
        if (var0 == null) {
            return null;
        } else if (var0 instanceof byte[]) {
            byte[] var3 = ((byte[]) ((byte[]) (var0)));
            return var1 ? class255.method4983(var3) : var3;
        } else if (var0 instanceof AbstractByteArrayCopier) {
            AbstractByteArrayCopier var2 = ((AbstractByteArrayCopier) (var0));
            return var2.get();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "719361783")
    static int method2052(int var0, Script var1, boolean var2) {
        boolean var3 = true;
        Widget var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            var3 = false;
        } else {
            var4 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        }
        int var11;
        if (var0 == ScriptOpcodes.CC_SETOP) {
            var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
            if ((var11 >= 0) && (var11 <= 9)) {
                var4.setAction(var11, Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]);
                return 1;
            } else {
                --BufferedNetSocket.Interpreter_stringStackSize;
                return 1;
            }
        } else {
            int var6;
            if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
                Interpreter.Interpreter_intStackSize -= 2;
                var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var4.parent = ModeWhere.getWidgetChild(var11, var6);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
                var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
                var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
                var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
                var4.dataText = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
                var4.spellActionName = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                return 1;
            } else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
                var4.actions = null;
                return 1;
            } else if (var0 == 1308) {
                var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                return 1;
            } else if (var0 == 1309) {
                --Interpreter.Interpreter_intStackSize;
                return 1;
            } else {
                int var7;
                byte[] var8;
                if (var0 != ScriptOpcodes.CC_SETOPKEY) {
                    byte var5;
                    if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var5 = 10;
                        var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) };
                        byte[] var9 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) };
                        class265.Widget_setKey(var4, var5, var8, var9);
                        return 1;
                    } else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
                        Interpreter.Interpreter_intStackSize -= 3;
                        var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                        var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                        if ((var11 >= 0) && (var11 <= 9)) {
                            class11.Widget_setKeyRate(var4, var11, var6, var7);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
                        var5 = 10;
                        var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        class11.Widget_setKeyRate(var4, var5, var6, var7);
                        return 1;
                    } else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
                        --Interpreter.Interpreter_intStackSize;
                        var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
                        if ((var11 >= 0) && (var11 <= 9)) {
                            DynamicObject.Widget_setKeyIgnoreHeld(var4, var11);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
                        var5 = 10;
                        DynamicObject.Widget_setKeyIgnoreHeld(var4, var5);
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    byte[] var10 = null;
                    var8 = null;
                    if (var3) {
                        Interpreter.Interpreter_intStackSize -= 10;
                        for (var7 = 0; (var7 < 10) && (Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0); var7 += 2) {
                        }
                        if (var7 > 0) {
                            var10 = new byte[var7 / 2];
                            var8 = new byte[var7 / 2];
                            for (var7 -= 2; var7 >= 0; var7 -= 2) {
                                var10[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]));
                                var8[var7 / 2] = ((byte) (Interpreter.Interpreter_intStack[(var7 + Interpreter.Interpreter_intStackSize) + 1]));
                            }
                        }
                    } else {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var10 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) };
                        var8 = new byte[]{ ((byte) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) };
                    }
                    var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
                    if ((var7 >= 0) && (var7 <= 9)) {
                        class265.Widget_setKey(var4, var7, var10, var8);
                        return 1;
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "([BIIIIIIILgn;[Lgi;)V")
    static final void method2031(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
        Buffer var10 = new Buffer(var0);
        int var11 = -1;
        while (true) {
            int var12 = var10.readIncrSmallSmart();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.readUShortSmart();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 63;
                int var16 = (var13 >> 6) & 63;
                int var17 = var13 >> 12;
                int var18 = var10.readUnsignedByte();
                int var19 = var18 >> 2;
                int var20 = var18 & 3;
                if (((((var17 == var4) && (var16 >= var5)) && (var16 < (var5 + 8))) && (var15 >= var6)) && (var15 < (var6 + 8))) {
                    ObjectComposition var21 = ParamComposition.getObjectDefinition(var11);
                    int var24 = var16 & 7;
                    int var25 = var15 & 7;
                    int var27 = var21.sizeX;
                    int var28 = var21.sizeY;
                    int var29;
                    if ((var20 & 1) == 1) {
                        var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var26 = var7 & 3;
                    int var23;
                    if (var26 == 0) {
                        var23 = var24;
                    } else if (var26 == 1) {
                        var23 = var25;
                    } else if (var26 == 2) {
                        var23 = (7 - var24) - (var27 - 1);
                    } else {
                        var23 = (7 - var25) - (var28 - 1);
                    }
                    var29 = var2 + var23;
                    int var30 = var3 + class261.method5002(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
                    if ((((var29 > 0) && (var30 > 0)) && (var29 < 103)) && (var30 < 103)) {
                        int var31 = var1;
                        if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) {
                            var31 = var1 - 1;
                        }
                        CollisionMap var32 = null;
                        if (var31 >= 0) {
                            var32 = var9[var31];
                        }
                        class231.method4765(var1, var29, var30, var11, (var20 + var7) & 3, var19, var8, var32);
                    }
                }
            } 
        } 
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1679127844")
    static void method2027(boolean var0) {
        byte var1 = 0;
        if (!Skeleton.method3892()) {
            var1 = 12;
        } else if (class414.client.method1305() || class414.client.method1219()) {
            var1 = 10;
        }
        Player.method2159(var1);
        if (var0) {
            Login.Login_username = "";
            Login.Login_password = "";
            GameObject.field2588 = 0;
            class145.otp = "";
        }
        DynamicObject.method1998();
        WorldMapLabelSize.method4317();
    }

    @ObfuscatedName("jy")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1645011802")
    static void method2054(int var0, int var1) {
        MenuAction var2 = GrandExchangeEvents.tempMenuAction;
        class18.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1);
        GrandExchangeEvents.tempMenuAction = null;
    }
}