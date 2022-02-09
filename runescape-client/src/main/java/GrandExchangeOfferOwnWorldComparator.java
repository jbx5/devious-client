import java.util.Comparator;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
    @ObfuscatedName("ij")
    @ObfuscatedGetter(intValue = 73955387)
    @Export("cameraZ")
    static int cameraZ;

    @ObfuscatedName("c")
    @Export("filterWorlds")
    boolean filterWorlds;

    GrandExchangeOfferOwnWorldComparator() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lld;Lld;I)I", garbageValue = "-23540014")
    @Export("compare_bridged")
    int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
        if (var2.world == var1.world) {
            return 0;
        } else {
            if (this.filterWorlds) {
                if (Client.worldId == var1.world) {
                    return -1;
                }
                if (var2.world == Client.worldId) {
                    return 1;
                }
            }
            return var1.world < var2.world ? -1 : 1;
        }
    }

    public int compare(Object var1, Object var2) {
        return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1983193854")
    public static int method1118(int var0) {
        return (var0 >> 17) & 7;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "-44")
    static int method1115(int var0, Script var1, boolean var2) {
        Widget var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
        if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollX;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollY;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETTEXT) {
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var3.text;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollWidth;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollHeight;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelZoom;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleX;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleZ;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleY;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETTRANS) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyTop;
            return 1;
        } else if (var0 == 2610) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyBot;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color2;
            return 1;
        } else if (var0 == 2613) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.fillMode.rsOrdinal();
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.modelTransparency) ? 1 : 0;
            return 1;
        } else if ((var0 != 2615) && (var0 != 2616)) {
            return 2;
        } else {
            ++Interpreter.Interpreter_intStackSize;
            return 1;
        }
    }

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1657692174")
    protected static final void method1121() {
        GameEngine.clock.mark();
        int var0;
        for (var0 = 0; var0 < 32; ++var0) {
            GameEngine.graphicsTickTimes[var0] = 0L;
        }
        for (var0 = 0; var0 < 32; ++var0) {
            GameEngine.clientTickTimes[var0] = 0L;
        }
        class147.gameCyclesToDo = 0;
    }
}