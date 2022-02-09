import java.util.Comparator;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kd")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
    @ObfuscatedName("fb")
    @ObfuscatedGetter(intValue = 1878402299)
    static int field3941;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lld;Lld;I)I", garbageValue = "-463570911")
    @Export("compare_bridged")
    int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
        return var1.age < var2.age ? -1 : var2.age == var1.age ? 0 : 1;
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1171711232")
    static int method5707(int var0, Script var1, boolean var2) {
        Widget var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
        } else {
            var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
        }
        String var4 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
        int[] var5 = null;
        if ((var4.length() > 0) && (var4.charAt(var4.length() - 1) == 'Y')) {
            int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var6 > 0) {
                for (var5 = new int[var6]; (var6--) > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var8 = new Object[var4.length() + 1];
        int var7;
        for (var7 = var8.length - 1; var7 >= 1; --var7) {
            if (var4.charAt(var7 - 1) == 's') {
                var8[var7] = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
            } else {
                var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            }
        }
        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
        if (var7 != (-1)) {
            var8[0] = new Integer(var7);
        } else {
            var8 = null;
        }
        if (var0 == ScriptOpcodes.CC_SETONCLICK) {
            var3.onClick = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
            var3.onHold = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
            var3.onRelease = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
            var3.onMouseOver = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
            var3.onMouseLeave = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
            var3.onDrag = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
            var3.onTargetLeave = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
            var3.onVarTransmit = var8;
            var3.varTransmitTriggers = var5;
        } else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
            var3.onTimer = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONOP) {
            var3.onOp = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
            var3.onDragComplete = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
            var3.onClickRepeat = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
            var3.onMouseRepeat = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
            var3.onInvTransmit = var8;
            var3.invTransmitTriggers = var5;
        } else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
            var3.onStatTransmit = var8;
            var3.statTransmitTriggers = var5;
        } else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
            var3.onTargetEnter = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
            var3.onScroll = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
            var3.onChatTransmit = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONKEY) {
            var3.onKey = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
            var3.onFriendTransmit = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
            var3.onClanTransmit = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
            var3.onMiscTransmit = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
            var3.onDialogAbort = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
            var3.onSubChange = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
            var3.onStockTransmit = var8;
        } else if (var0 == 1426) {
            var3.field3385 = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
            var3.onResize = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
            var3.field3328 = var8;
        } else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
            var3.field3271 = var8;
        } else if (var0 == 1430) {
            var3.field3374 = var8;
        } else {
            if (var0 != 1431) {
                return 2;
            }
            var3.field3321 = var8;
        }
        var3.hasListener = true;
        return 1;
    }
}