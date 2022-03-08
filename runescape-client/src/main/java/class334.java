import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lj")
public class class334 {
    @ObfuscatedName("sh")
    @ObfuscatedGetter(intValue = -1671308737)
    static int field4057;

    @ObfuscatedName("c")
    static char[] field4052;

    @ObfuscatedName("l")
    static char[] field4051;

    @ObfuscatedName("s")
    static char[] field4053;

    @ObfuscatedName("e")
    static int[] field4054;

    static {
        field4052 = new char[64];
        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            field4052[var0] = ((char) (var0 + 65));
        }
        for (var0 = 26; var0 < 52; ++var0) {
            field4052[var0] = ((char) ((var0 + 97) - 26));
        }
        for (var0 = 52; var0 < 62; ++var0) {
            field4052[var0] = ((char) ((var0 + 48) - 52));
        }
        field4052[62] = '+';
        field4052[63] = '/';
        field4051 = new char[64];
        for (var0 = 0; var0 < 26; ++var0) {
            field4051[var0] = ((char) (var0 + 65));
        }
        for (var0 = 26; var0 < 52; ++var0) {
            field4051[var0] = ((char) ((var0 + 97) - 26));
        }
        for (var0 = 52; var0 < 62; ++var0) {
            field4051[var0] = ((char) ((var0 + 48) - 52));
        }
        field4051[62] = '*';
        field4051[63] = '-';
        field4053 = new char[64];
        for (var0 = 0; var0 < 26; ++var0) {
            field4053[var0] = ((char) (var0 + 65));
        }
        for (var0 = 26; var0 < 52; ++var0) {
            field4053[var0] = ((char) ((var0 + 97) - 26));
        }
        for (var0 = 52; var0 < 62; ++var0) {
            field4053[var0] = ((char) ((var0 + 48) - 52));
        }
        field4053[62] = '-';
        field4053[63] = '_';
        field4054 = new int[128];
        for (var0 = 0; var0 < class334.field4054.length; ++var0) {
            field4054[var0] = -1;
        }
        for (var0 = 65; var0 <= 90; ++var0) {
            field4054[var0] = var0 - 65;
        }
        for (var0 = 97; var0 <= 122; ++var0) {
            field4054[var0] = (var0 - 97) + 26;
        }
        for (var0 = 48; var0 <= 57; ++var0) {
            field4054[var0] = (var0 - 48) + 52;
        }
        int[] var2 = field4054;
        field4054[43] = 62;
        var2[42] = 62;
        int[] var1 = field4054;
        field4054[47] = 63;
        var1[45] = 63;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(II)Ldp;", garbageValue = "-2022855172")
    static class121 method6128(int var0) {
        class121 var1 = ((class121) (class140.findEnumerated(class115.method2620(), var0)));
        if (var1 == null) {
            var1 = class121.field1482;
        }
        return var1;
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-411703308")
    static int method6130(int var0, Script var1, boolean var2) {
        if (var0 == 6800) {
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
            return 1;
        } else if ((var0 != 6801) && (var0 != 6802)) {
            if (var0 == 6850) {
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                return 1;
            } else if ((var0 != 6851) && (var0 != 6852)) {
                if (var0 == 6853) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    return 1;
                } else {
                    return 2;
                }
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                return 1;
            }
        } else {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("gd")
    @ObfuscatedSignature(descriptor = "(Lcq;IB)V", garbageValue = "-18")
    @Export("updateActorSequence")
    static final void updateActorSequence(Actor var0, int var1) {
        int var2;
        int var3;
        int var4;
        if (var0.field1157 >= Client.cycle) {
            var2 = Math.max(1, var0.field1157 - Client.cycle);
            var3 = (var0.field1113 * 64) + (var0.field1153 * 128);
            var4 = (var0.field1113 * 64) + (var0.field1144 * 128);
            var0.x += (var3 - var0.x) / var2;
            var0.y += (var4 - var0.y) / var2;
            var0.field1175 = 0;
            var0.orientation = var0.field1159;
        } else if (var0.field1158 >= Client.cycle) {
            if ((((var0.field1158 == Client.cycle) || (var0.sequence == (-1))) || (var0.sequenceDelay != 0)) || ((var0.sequenceFrameCycle + 1) > class78.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame])) {
                var2 = var0.field1158 - var0.field1157;
                var3 = Client.cycle - var0.field1157;
                var4 = (var0.field1113 * 64) + (var0.field1153 * 128);
                int var5 = (var0.field1113 * 64) + (var0.field1144 * 128);
                int var6 = (var0.field1113 * 64) + (var0.field1147 * 128);
                int var7 = (var0.field1113 * 64) + (var0.field1156 * 128);
                var0.x = ((var3 * var6) + (var4 * (var2 - var3))) / var2;
                var0.y = ((var7 * var3) + (var5 * (var2 - var3))) / var2;
            }
            var0.field1175 = 0;
            var0.orientation = var0.field1159;
            var0.rotation = var0.orientation;
        } else {
            class17.method219(var0);
        }
        if ((((var0.x < 128) || (var0.y < 128)) || (var0.x >= 13184)) || (var0.y >= 13184)) {
            var0.sequence = -1;
            var0.spotAnimation = -1;
            var0.field1157 = 0;
            var0.field1158 = 0;
            var0.x = (var0.field1113 * 64) + (var0.pathX[0] * 128);
            var0.y = (var0.field1113 * 64) + (var0.pathY[0] * 128);
            var0.method2163();
        }
        if ((WorldMapSprite.localPlayer == var0) && ((((var0.x < 1536) || (var0.y < 1536)) || (var0.x >= 11776)) || (var0.y >= 11776))) {
            var0.sequence = -1;
            var0.spotAnimation = -1;
            var0.field1157 = 0;
            var0.field1158 = 0;
            var0.x = (var0.pathX[0] * 128) + (var0.field1113 * 64);
            var0.y = (var0.pathY[0] * 128) + (var0.field1113 * 64);
            var0.method2163();
        }
        if (var0.field1170 != 0) {
            if (var0.targetIndex != (-1)) {
                Object var8 = null;
                if (var0.targetIndex < 32768) {
                    var8 = Client.npcs[var0.targetIndex];
                } else if (var0.targetIndex >= 32768) {
                    var8 = Client.players[var0.targetIndex - 32768];
                }
                if (var8 != null) {
                    var3 = var0.x - ((Actor) (var8)).x;
                    var4 = var0.y - ((Actor) (var8)).y;
                    if ((var3 != 0) || (var4 != 0)) {
                        var0.orientation = ((int) (Math.atan2(((double) (var3)), ((double) (var4))) * 325.949)) & 2047;
                    }
                } else if (var0.false0) {
                    var0.targetIndex = -1;
                    var0.false0 = false;
                }
            }
            if ((var0.field1138 != (-1)) && ((var0.pathLength == 0) || (var0.field1175 > 0))) {
                var0.orientation = var0.field1138;
                var0.field1138 = -1;
            }
            var2 = (var0.orientation - var0.rotation) & 2047;
            if ((var2 == 0) && var0.false0) {
                var0.targetIndex = -1;
                var0.false0 = false;
            }
            if (var2 != 0) {
                ++var0.field1169;
                boolean var10;
                if (var2 > 1024) {
                    var0.rotation -= (var0.field1139) ? var2 : (var0.field1170 * 416354727) * (-1787394537);
                    var10 = true;
                    if ((var2 < var0.field1170) || (var2 > (2048 - var0.field1170))) {
                        var0.rotation = var0.orientation;
                        var10 = false;
                    }
                    if (((!var0.field1139) && (var0.idleSequence == var0.movementSequence)) && ((var0.field1169 > 25) || var10)) {
                        if (var0.turnLeftSequence != (-1)) {
                            var0.movementSequence = var0.turnLeftSequence;
                        } else {
                            var0.movementSequence = var0.walkSequence;
                        }
                    }
                } else {
                    var0.rotation += (var0.field1139) ? var2 : (416354727 * var0.field1170) * (-1787394537);
                    var10 = true;
                    if ((var2 < var0.field1170) || (var2 > (2048 - var0.field1170))) {
                        var0.rotation = var0.orientation;
                        var10 = false;
                    }
                    if (((!var0.field1139) && (var0.idleSequence == var0.movementSequence)) && ((var0.field1169 > 25) || var10)) {
                        if (var0.turnRightSequence != (-1)) {
                            var0.movementSequence = var0.turnRightSequence;
                        } else {
                            var0.movementSequence = var0.walkSequence;
                        }
                    }
                }
                var0.rotation &= 2047;
                var0.field1139 = false;
            } else {
                var0.field1169 = 0;
            }
        }
        class293.method5481(var0);
    }
}