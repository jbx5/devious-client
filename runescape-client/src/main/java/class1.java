import java.util.concurrent.Callable;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("l")
public class class1 implements Callable {
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1680003247)
    @Export("RunException_revision")
    public static int RunException_revision;

    @ObfuscatedName("a")
    public static short[][] field8;

    @ObfuscatedName("h")
    @Export("Tiles_hueMultiplier")
    static int[] Tiles_hueMultiplier;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lpg;")
    @Export("options_buttons_2Sprite")
    static IndexedSprite options_buttons_2Sprite;

    @ObfuscatedName("gf")
    @ObfuscatedSignature(descriptor = "Llv;")
    @Export("fontPlain11")
    static Font fontPlain11;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lpi;")
    final Buffer field3;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Le;")
    final class3 field11;

    @ObfuscatedSignature(descriptor = "Lw;")
    final class7 this$0;

    @ObfuscatedSignature(descriptor = "(Lw;Lpi;Le;)V")
    class1(class7 var1, Buffer var2, class3 var3) {
        this.this$0 = var1;
        this.field3 = var2;
        this.field11 = var3;
    }

    public Object call() {
        return this.field11.vmethod10(this.field3);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lcg;III)V", garbageValue = "1010934095")
    @Export("runScript")
    static void runScript(ScriptEvent var0, int var1, int var2) {
        Object[] var3 = var0.args;
        Script var4;
        int var20;
        if (class408.isWorldMapEvent(var0.type)) {
            class17.worldMapEvent = ((WorldMapEvent) (var3[0]));
            WorldMapElement var5 = class126.WorldMapElement_get(class17.worldMapEvent.mapElement);
            var4 = GraphicsObject.getWorldMapScript(var0.type, var5.objectId, var5.category);
        } else {
            var20 = ((Integer) (var3[0]));
            var4 = Players.getScript(var20);
        }
        if (var4 != null) {
            Interpreter.Interpreter_intStackSize = 0;
            BufferedNetSocket.Interpreter_stringStackSize = 0;
            var20 = -1;
            int[] var6 = var4.opcodes;
            int[] var7 = var4.intOperands;
            byte var8 = -1;
            Interpreter.Interpreter_frameDepth = 0;
            Interpreter.field846 = false;
            boolean var9 = false;
            int var10 = 0;
            boolean var30 = false;
            label953 : {
                label954 : {
                    try {
                        int var13;
                        try {
                            var30 = true;
                            Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
                            int var11 = 0;
                            Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
                            int var12 = 0;
                            int var14;
                            String var21;
                            for (var13 = 1; var13 < var3.length; ++var13) {
                                if (var3[var13] instanceof Integer) {
                                    var14 = ((Integer) (var3[var13]));
                                    if (var14 == (-2147483647)) {
                                        var14 = var0.mouseX;
                                    }
                                    if (var14 == (-2147483646)) {
                                        var14 = var0.mouseY;
                                    }
                                    if (var14 == (-2147483645)) {
                                        var14 = (var0.widget != null) ? (var0.widget.id * 98457465) * (-180788535) : -1;
                                    }
                                    if (var14 == (-2147483644)) {
                                        var14 = var0.opIndex;
                                    }
                                    if (var14 == (-2147483643)) {
                                        var14 = (var0.widget != null) ? (var0.widget.childIndex * (-747196891)) * 685751725 : -1;
                                    }
                                    if (var14 == (-2147483642)) {
                                        var14 = (var0.dragTarget != null) ? (var0.dragTarget.id * 98457465) * (-180788535) : -1;
                                    }
                                    if (var14 == (-2147483641)) {
                                        var14 = (var0.dragTarget != null) ? (var0.dragTarget.childIndex * (-747196891)) * 685751725 : -1;
                                    }
                                    if (var14 == (-2147483640)) {
                                        var14 = var0.keyTyped;
                                    }
                                    if (var14 == (-2147483639)) {
                                        var14 = var0.keyPressed;
                                    }
                                    Interpreter.Interpreter_intLocals[var11++] = var14;
                                } else if (var3[var13] instanceof String) {
                                    var21 = ((String) (var3[var13]));
                                    if (var21.equals("event_opbase")) {
                                        var21 = var0.targetName;
                                    }
                                    Interpreter.Interpreter_stringLocals[var12++] = var21;
                                }
                            }
                            Interpreter.field849 = var0.field1041;
                            while (true) {
                                ++var10;
                                if (var10 > var1) {
                                    throw new RuntimeException();
                                }
                                ++var20;
                                int var33 = var6[var20];
                                if (var33 >= 100) {
                                    boolean var35;
                                    if (var4.intOperands[var20] == 1) {
                                        var35 = true;
                                    } else {
                                        var35 = false;
                                    }
                                    var14 = class11.method110(var33, var4, var35);
                                    switch (var14) {
                                        case 0 :
                                            var30 = false;
                                            break label954;
                                        case 1 :
                                        default :
                                            break;
                                        case 2 :
                                            throw new IllegalStateException();
                                    }
                                } else if (var33 == ScriptOpcodes.ICONST) {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7[var20];
                                } else if (var33 == ScriptOpcodes.GET_VARP) {
                                    var13 = var7[var20];
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Varps.Varps_main[var13];
                                } else if (var33 == ScriptOpcodes.SET_VARP) {
                                    var13 = var7[var20];
                                    Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                    NetFileRequest.changeGameOptions(var13);
                                } else if (var33 == ScriptOpcodes.SCONST) {
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4.stringOperands[var20];
                                } else if (var33 == ScriptOpcodes.JUMP) {
                                    var20 += var7[var20];
                                } else if (var33 == ScriptOpcodes.IF_ICMPNE) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.IF_ICMPLT) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.IF_ICMPGT) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.RETURN) {
                                    if (Interpreter.Interpreter_frameDepth == 0) {
                                        var30 = false;
                                        break label953;
                                    }
                                    ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
                                    var4 = var40.script;
                                    var6 = var4.opcodes;
                                    var7 = var4.intOperands;
                                    var20 = var40.pc;
                                    Interpreter.Interpreter_intLocals = var40.intLocals;
                                    Interpreter.Interpreter_stringLocals = var40.stringLocals;
                                } else if (var33 == ScriptOpcodes.GET_VARBIT) {
                                    var13 = var7[var20];
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class375.getVarbit(var13);
                                } else if (var33 == ScriptOpcodes.SET_VARBIT) {
                                    var13 = var7[var20];
                                    PcmPlayer.method764(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                                } else if (var33 == ScriptOpcodes.IF_ICMPLE) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.IF_ICMPGE) {
                                    Interpreter.Interpreter_intStackSize -= 2;
                                    if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
                                        var20 += var7[var20];
                                    }
                                } else if (var33 == ScriptOpcodes.ILOAD) {
                                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
                                } else if (var33 == ScriptOpcodes.ISTORE) {
                                    Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                } else if (var33 == ScriptOpcodes.SLOAD) {
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
                                } else if (var33 == ScriptOpcodes.SSTORE) {
                                    Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                                } else if (var33 == ScriptOpcodes.JOIN_STRING) {
                                    var13 = var7[var20];
                                    BufferedNetSocket.Interpreter_stringStackSize -= var13;
                                    var21 = PendingSpawn.method2161(Interpreter.Interpreter_stringStack, BufferedNetSocket.Interpreter_stringStackSize, var13);
                                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var21;
                                } else if (var33 == ScriptOpcodes.POP_INT) {
                                    --Interpreter.Interpreter_intStackSize;
                                } else if (var33 == ScriptOpcodes.POP_STRING) {
                                    --BufferedNetSocket.Interpreter_stringStackSize;
                                } else {
                                    int var17;
                                    if (var33 != ScriptOpcodes.INVOKE) {
                                        if (var33 == ScriptOpcodes.GET_VARC_INT) {
                                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = JagexCache.varcs.getInt(var7[var20]);
                                        } else if (var33 == ScriptOpcodes.SET_VARC_INT) {
                                            JagexCache.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                                        } else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
                                            var13 = var7[var20] >> 16;
                                            var14 = var7[var20] & 65535;
                                            int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                            if ((var24 < 0) || (var24 > 5000)) {
                                                throw new RuntimeException();
                                            }
                                            Interpreter.Interpreter_arrayLengths[var13] = var24;
                                            byte var25 = -1;
                                            if (var14 == 105) {
                                                var25 = 0;
                                            }
                                            for (var17 = 0; var17 < var24; ++var17) {
                                                Interpreter.Interpreter_arrays[var13][var17] = var25;
                                            }
                                        } else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
                                            var13 = var7[var20];
                                            var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                                            if ((var14 < 0) || (var14 >= Interpreter.Interpreter_arrayLengths[var13])) {
                                                throw new RuntimeException();
                                            }
                                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Interpreter.Interpreter_arrays[var13][var14];
                                        } else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
                                            var13 = var7[var20];
                                            Interpreter.Interpreter_intStackSize -= 2;
                                            var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                                            if ((var14 < 0) || (var14 >= Interpreter.Interpreter_arrayLengths[var13])) {
                                                throw new RuntimeException();
                                            }
                                            Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                                        } else {
                                            String var22;
                                            if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
                                                var22 = JagexCache.varcs.getStringOld(var7[var20]);
                                                if (var22 == null) {
                                                    var22 = "null";
                                                }
                                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var22;
                                            } else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
                                                JagexCache.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]);
                                            } else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
                                                var22 = JagexCache.varcs.getString(var7[var20]);
                                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var22;
                                            } else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
                                                JagexCache.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]);
                                            } else if (var33 == ScriptOpcodes.SWITCH) {
                                                IterableNodeHashTable var38 = var4.switches[var7[var20]];
                                                IntegerNode var37 = ((IntegerNode) (var38.get(((long) (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize])))));
                                                if (var37 != null) {
                                                    var20 += var37.integer;
                                                }
                                            } else {
                                                Integer var39;
                                                if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
                                                    var39 = WorldMapSection0.field2713.getTitleGroupValue(var7[var20]);
                                                    if (var39 == null) {
                                                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                                                    } else {
                                                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var39;
                                                    }
                                                } else {
                                                    if (var33 != ScriptOpcodes.GET_VARCLAN) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var39 = class221.field2680.method6778(var7[var20]);
                                                    if (var39 == null) {
                                                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                                                    } else {
                                                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var39;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var13 = var7[var20];
                                        Script var36 = Players.getScript(var13);
                                        int[] var15 = new int[var36.localIntCount];
                                        String[] var16 = new String[var36.localStringCount];
                                        for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
                                            var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
                                        }
                                        for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
                                            var16[var17] = Interpreter.Interpreter_stringStack[var17 + (BufferedNetSocket.Interpreter_stringStackSize - var36.stringArgumentCount)];
                                        }
                                        Interpreter.Interpreter_intStackSize -= var36.intArgumentCount;
                                        BufferedNetSocket.Interpreter_stringStackSize -= var36.stringArgumentCount;
                                        ScriptFrame var23 = new ScriptFrame();
                                        var23.script = var4;
                                        var23.pc = var20;
                                        var23.intLocals = Interpreter.Interpreter_intLocals;
                                        var23.stringLocals = Interpreter.Interpreter_stringLocals;
                                        Interpreter.Interpreter_frames[(++Interpreter.Interpreter_frameDepth) - 1] = var23;
                                        var4 = var36;
                                        var6 = var36.opcodes;
                                        var7 = var36.intOperands;
                                        var20 = -1;
                                        Interpreter.Interpreter_intLocals = var15;
                                        Interpreter.Interpreter_stringLocals = var16;
                                    }
                                }
                            } 
                        } catch (Exception var31) {
                            var9 = true;
                            StringBuilder var27 = new StringBuilder(30);
                            var27.append("").append(var4.key).append(" ");
                            var13 = Interpreter.Interpreter_frameDepth - 1;
                            while (true) {
                                if (var13 < 0) {
                                    var27.append("").append(var8);
                                    FloorDecoration.RunException_sendStackTrace(var27.toString(), var31);
                                    var30 = false;
                                    break;
                                }
                                var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
                                --var13;
                            } 
                        }
                    } finally {
                        if (var30) {
                            while (Interpreter.field832.size() > 0) {
                                class92 var19 = ((class92) (Interpreter.field832.remove(0)));
                                GameEngine.widgetDefaultMenuAction(var19.method2276(), var19.method2274(), var19.method2275(), var19.method2282(), "");
                            } 
                            if (Interpreter.field846) {
                                Interpreter.field846 = false;
                                VertexNormal.method4267();
                            }
                            if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
                                FloorDecoration.RunException_sendStackTrace((((("Warning: Script " + var4.field960) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
                            }
                        }
                    }
                    while (Interpreter.field832.size() > 0) {
                        class92 var26 = ((class92) (Interpreter.field832.remove(0)));
                        GameEngine.widgetDefaultMenuAction(var26.method2276(), var26.method2274(), var26.method2275(), var26.method2282(), "");
                    } 
                    if (Interpreter.field846) {
                        Interpreter.field846 = false;
                        VertexNormal.method4267();
                    }
                    if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
                        FloorDecoration.RunException_sendStackTrace((((("Warning: Script " + var4.field960) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
                    }
                    return;
                }
                while (Interpreter.field832.size() > 0) {
                    class92 var34 = ((class92) (Interpreter.field832.remove(0)));
                    GameEngine.widgetDefaultMenuAction(var34.method2276(), var34.method2274(), var34.method2275(), var34.method2282(), "");
                } 
                if (Interpreter.field846) {
                    Interpreter.field846 = false;
                    VertexNormal.method4267();
                }
                if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
                    FloorDecoration.RunException_sendStackTrace((((("Warning: Script " + var4.field960) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
                }
                return;
            }
            while (Interpreter.field832.size() > 0) {
                class92 var41 = ((class92) (Interpreter.field832.remove(0)));
                GameEngine.widgetDefaultMenuAction(var41.method2276(), var41.method2274(), var41.method2275(), var41.method2282(), "");
            } 
            if (Interpreter.field846) {
                Interpreter.field846 = false;
                VertexNormal.method4267();
            }
            if (((!var9) && (var2 > 0)) && (var10 >= var2)) {
                FloorDecoration.RunException_sendStackTrace((((("Warning: Script " + var4.field960) + " finished at op count ") + var10) + " of max ") + var1, ((Throwable) (null)));
            }
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1671672543")
    static int method4(int var0, Script var1, boolean var2) {
        int var4 = -1;
        Widget var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var3 = class130.getWidget(var4);
        } else {
            var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        }
        if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            if (var3.scrollX > (var3.scrollWidth - var3.width)) {
                var3.scrollX = var3.scrollWidth - var3.width;
            }
            if (var3.scrollX < 0) {
                var3.scrollX = 0;
            }
            var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var3.scrollY > (var3.scrollHeight - var3.height)) {
                var3.scrollY = var3.scrollHeight - var3.height;
            }
            if (var3.scrollY < 0) {
                var3.scrollY = 0;
            }
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
            var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETFILL) {
            var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETTRANS) {
            var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
            var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
            var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
            var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETTILING) {
            var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETMODEL) {
            var3.modelType = 1;
            var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            class112.invalidateWidget(var3);
            return 1;
        } else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
            Interpreter.Interpreter_intStackSize -= 6;
            var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
            var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
            class112.invalidateWidget(var3);
            return 1;
        } else {
            int var8;
            if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
                var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if (var8 != var3.sequenceId) {
                    var3.sequenceId = var8;
                    var3.modelFrame = 0;
                    var3.modelFrameCycle = 0;
                    class112.invalidateWidget(var3);
                }
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
                var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETTEXT) {
                String var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                if (!var7.equals(var3.text)) {
                    var3.text = var7;
                    class112.invalidateWidget(var3);
                }
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
                var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
                Interpreter.Interpreter_intStackSize -= 3;
                var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
                var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
                var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
                var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
                var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
                var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
                Interpreter.Interpreter_intStackSize -= 2;
                var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                class112.invalidateWidget(var3);
                if ((var4 != (-1)) && (var3.type == 0)) {
                    PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
                }
                return 1;
            } else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
                class312.resumePauseWidget(var3.id, var3.childIndex);
                Client.meslayerContinueWidget = var3;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == 1122) {
                var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
                var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == 1124) {
                var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == 1125) {
                var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                FillMode var6 = ((FillMode) (class140.findEnumerated(class368.FillMode_values(), var8)));
                if (var6 != null) {
                    var3.fillMode = var6;
                    class112.invalidateWidget(var3);
                }
                return 1;
            } else {
                boolean var5;
                if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
                    var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    var3.field3298 = var5;
                    return 1;
                } else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
                    var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                    var3.modelTransparency = var5;
                    return 1;
                } else if (var0 == 1128) {
                    Interpreter.Interpreter_intStackSize -= 2;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }
}