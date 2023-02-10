import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ej")
public abstract class class139 extends Node {
   class139() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   abstract void vmethod3394(Buffer var1);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   abstract void vmethod3393(ClanSettings var1);

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1744506320"
   )
   static int method3157(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      }

      String var4 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]) {
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var9.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var9[var7] = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
         } else {
            var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         }
      }

      var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
      if (var7 != -1) {
         var9[0] = new Integer(var7);
      } else {
         var9 = null;
      }

      if (var0 == ScriptOpcodes.CC_SETONCLICK) {
         var3.onClick = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
         var3.onHold = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
         var3.onRelease = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
         var3.onMouseOver = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
         var3.onMouseLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
         var3.onDrag = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
         var3.onTargetLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
         var3.onVarTransmit = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
         var3.onTimer = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONOP) {
         var3.onOp = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
         var3.onDragComplete = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
         var3.onClickRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
         var3.onMouseRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
         var3.onInvTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
         var3.onStatTransmit = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
         var3.onTargetEnter = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
         var3.onScroll = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
         var3.onChatTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONKEY) {
         var3.onKey = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
         var3.onFriendTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
         var3.onClanTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
         var3.onMiscTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
         var3.onDialogAbort = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
         var3.onSubChange = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1426) {
         var3.field3679 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
         var3.onResize = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
         var3.field3672 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
         var3.field3673 = var9;
      } else if (var0 == 1430) {
         var3.field3604 = var9;
      } else if (var0 == 1431) {
         var3.field3669 = var9;
      } else if (var0 == 1434) {
         var3.field3680 = var9;
      } else if (var0 == 1435) {
         var3.field3664 = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class305 var8 = var3.method6228();
         if (var8 != null) {
            if (var0 == 1436) {
               var8.field3480 = var9;
            } else if (var0 == 1437) {
               var8.field3479 = var9;
            } else if (var0 == 1438) {
               var8.field3482 = var9;
            } else if (var0 == 1439) {
               var8.field3481 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "32"
   )
   @Export("hslToRgb")
   static final int hslToRgb(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }
}
