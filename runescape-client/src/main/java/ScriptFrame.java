import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bx")
@Implements("ScriptFrame")
public class ScriptFrame {
    @ObfuscatedName("mw")
    @ObfuscatedGetter(intValue = -931159053)
    @Export("menuHeight")
    static int menuHeight;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lbl;")
    @Export("script")
    Script script;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 409105765)
    @Export("pc")
    int pc;

    @ObfuscatedName("s")
    @Export("intLocals")
    int[] intLocals;

    @ObfuscatedName("e")
    @Export("stringLocals")
    String[] stringLocals;

    ScriptFrame() {
        this.pc = -1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "877883177")
    public static void method1075() {
        synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
            MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
            MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
            MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
            MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
            MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
            MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
            MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
            MouseHandler.MouseHandler_lastButtonVolatile = 0;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "([BI)Lbl;", garbageValue = "431757029")
    @Export("newScript")
    static Script newScript(byte[] var0) {
        Script var1 = new Script();
        Buffer var2 = new Buffer(var0);
        var2.offset = var2.array.length - 2;
        int var3 = var2.readUnsignedShort();
        int var4 = ((var2.array.length - 2) - var3) - 12;
        var2.offset = var4;
        int var5 = var2.readInt();
        var1.localIntCount = var2.readUnsignedShort();
        var1.localStringCount = var2.readUnsignedShort();
        var1.intArgumentCount = var2.readUnsignedShort();
        var1.stringArgumentCount = var2.readUnsignedShort();
        int var6 = var2.readUnsignedByte();
        int var7;
        int var8;
        if (var6 > 0) {
            var1.switches = var1.newIterableNodeHashTable(var6);
            for (var7 = 0; var7 < var6; ++var7) {
                var8 = var2.readUnsignedShort();
                IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? GrandExchangeOfferNameComparator.method5702(var8) : 1);
                var1.switches[var7] = var9;
                while ((var8--) > 0) {
                    int var10 = var2.readInt();
                    int var11 = var2.readInt();
                    var9.put(new IntegerNode(var11), ((long) (var10)));
                } 
            }
        }
        var2.offset = 0;
        var1.field960 = var2.readStringCp1252NullTerminatedOrNull();
        var1.opcodes = new int[var5];
        var1.intOperands = new int[var5];
        var1.stringOperands = new String[var5];
        for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
            var8 = var2.readUnsignedShort();
            if (var8 == 3) {
                var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
            } else if ((((var8 < 100) && (var8 != 21)) && (var8 != 38)) && (var8 != 39)) {
                var1.intOperands[var7] = var2.readInt();
            } else {
                var1.intOperands[var7] = var2.readUnsignedByte();
            }
        }
        return var1;
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "1")
    static int method1077(int var0, Script var1, boolean var2) {
        Widget var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        if (var0 == ScriptOpcodes.CC_GETX) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.x;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETY) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.y;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.width;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.height;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETHIDE) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.isHidden) ? 1 : 0;
            return 1;
        } else if (var0 == ScriptOpcodes.CC_GETLAYER) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.parentId;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jo")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-679807359")
    static void method1076(int var0) {
        GrandExchangeEvents.tempMenuAction = new MenuAction();
        GrandExchangeEvents.tempMenuAction.param0 = Client.menuArguments1[var0];
        GrandExchangeEvents.tempMenuAction.param1 = Client.menuArguments2[var0];
        GrandExchangeEvents.tempMenuAction.opcode = Client.menuOpcodes[var0];
        GrandExchangeEvents.tempMenuAction.identifier = Client.menuIdentifiers[var0];
        GrandExchangeEvents.tempMenuAction.action = Client.menuActions[var0];
    }
}