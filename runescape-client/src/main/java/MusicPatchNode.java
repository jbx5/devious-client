import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jm")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 905415817)
    int field3181;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Ljj;")
    @Export("patch")
    MusicPatch patch;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lab;")
    @Export("rawSound")
    RawSound rawSound;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lju;")
    MusicPatchNode2 field3174;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1108464415)
    int field3171;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1785058687)
    int field3189;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1851943945)
    int field3180;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1470131471)
    int field3178;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -223988985)
    int field3179;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1717394441)
    int field3177;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 1149313219)
    int field3187;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2117022949)
    int field3182;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -640394321)
    int field3183;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2027710829)
    int field3176;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1280883207)
    int field3186;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -25428693)
    int field3175;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 1679424453)
    int field3184;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -1077318025)
    int field3188;

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "Lae;")
    @Export("stream")
    RawPcmStream stream;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -722172641)
    int field3190;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 2048843905)
    int field3191;

    MusicPatchNode() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1702959189")
    void method5275() {
        this.patch = null;
        this.rawSound = null;
        this.field3174 = null;
        this.stream = null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-441192749")
    public static void method5276(int var0) {
        if (var0 != (-1)) {
            if (class145.Widget_loadedInterfaces[var0]) {
                UserComparator6.Widget_archive.clearFilesGroup(var0);
                if (Widget.Widget_interfaceComponents[var0] != null) {
                    boolean var1 = true;
                    for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
                        if (Widget.Widget_interfaceComponents[var0][var2] != null) {
                            if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
                                Widget.Widget_interfaceComponents[var0][var2] = null;
                            } else {
                                var1 = false;
                            }
                        }
                    }
                    if (var1) {
                        Widget.Widget_interfaceComponents[var0] = null;
                    }
                    class145.Widget_loadedInterfaces[var0] = false;
                }
            }
        }
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-2086058343")
    static int method5277(int var0, Script var1, boolean var2) {
        if (var0 == 7400) {
            --Interpreter.Interpreter_intStackSize;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        } else if (var0 == 7401) {
            --Interpreter.Interpreter_intStackSize;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        } else if (var0 == 7402) {
            Interpreter.Interpreter_intStackSize -= 2;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        } else if (var0 == 7403) {
            Interpreter.Interpreter_intStackSize -= 2;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        } else if (var0 == 7404) {
            --Interpreter.Interpreter_intStackSize;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        } else if (var0 == 7405) {
            Interpreter.Interpreter_intStackSize -= 2;
            return 1;
        } else if (var0 == 7406) {
            --Interpreter.Interpreter_intStackSize;
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
            return 1;
        } else if (var0 == 7407) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            return 1;
        } else if (var0 == 7408) {
            Interpreter.Interpreter_intStackSize -= 2;
            --BufferedNetSocket.Interpreter_stringStackSize;
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            return 1;
        } else if (var0 == 7409) {
            --Interpreter.Interpreter_intStackSize;
            return 1;
        } else {
            return 2;
        }
    }
}