import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hb")
@Implements("WorldMapID")
public class WorldMapID {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lhb;")
    static final WorldMapID field2773;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lhb;")
    static final WorldMapID field2771;

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lcm;")
    @Export("World_request")
    static UrlRequest World_request;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1457945663)
    @Export("value")
    final int value;

    static {
        field2773 = new WorldMapID(0);
        field2771 = new WorldMapID(1);
    }

    WorldMapID(int var1) {
        this.value = var1;
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "-101")
    static int method4767(int var0, Script var1, boolean var2) {
        if (((((var0 != 6700) && (var0 != 6702)) && (var0 != 6704)) && (var0 != 6706)) && (var0 != 6708)) {
            if (((((var0 != 6701) && (var0 != 6703)) && (var0 != 6705)) && (var0 != 6707)) && (var0 != 6709)) {
                if (var0 == 6750) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    return 1;
                } else if (((var0 != 6751) && (var0 != 6752)) && (var0 != 6753)) {
                    if (var0 == 6754) {
                        int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        NPCComposition var4 = UserComparator10.getNpcDefinition(var3);
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = (var4 != null) ? var4.name : "";
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                    return 1;
                }
            } else {
                --Interpreter.Interpreter_intStackSize;
                return 1;
            }
        } else {
            Interpreter.Interpreter_intStackSize -= 2;
            --BufferedNetSocket.Interpreter_stringStackSize;
            return 1;
        }
    }
}