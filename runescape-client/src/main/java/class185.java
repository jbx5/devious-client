import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gl")
public enum class185 implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lgl;")
    field2137(((byte) (-1))),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lgl;")
    field2133(((byte) (0))),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lgl;")
    field2135(((byte) (1))),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lgl;")
    field2132(((byte) (2)));
    @ObfuscatedName("r")
    public byte field2136;

    class185(byte var3) {
        this.field2136 = var3;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.field2136;
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "0")
    static int method3686(int var0, Script var1, boolean var2) {
        int var3;
        if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (!Client.isCameraLocked) {
                Client.camAngleX = var3;
                Client.camAngleY = var4;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camAngleX;
            return 1;
        } else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camAngleY;
            return 1;
        } else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3 < 0) {
                var3 = 0;
            }
            Client.camFollowHeight = var3;
            return 1;
        } else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.camFollowHeight;
            return 1;
        } else {
            return 2;
        }
    }
}