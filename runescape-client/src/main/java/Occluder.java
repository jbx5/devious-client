import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jw")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1495797239
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 2083881213
   )
   @Export("maxTileX")
   int maxTileX;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2139762069
   )
   @Export("minTileY")
   int minTileY;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2105212115
   )
   @Export("maxTileY")
   int maxTileY;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1011543871
   )
   @Export("type")
   int type;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1459036587
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1190260059
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1803048977
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 710256461
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1382049521
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 123469707
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1429765685
   )
   int field2638;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -385546895
   )
   int field2644;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -853956623
   )
   int field2643;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1632011863
   )
   int field2641;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1716665463
   )
   int field2642;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -878350737
   )
   int field2634;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1182818911
   )
   int field2640;

   Occluder() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1459036587"
   )
   static int method4725(int var0, int var1, int var2) {
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "1"
   )
   static int method4726(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      }

      String var4 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var9.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var9[var7] = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         } else {
            var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         }
      }

      var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
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
         var3.field3725 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
         var3.onResize = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
         var3.field3718 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
         var3.field3719 = var9;
      } else if (var0 == 1430) {
         var3.field3714 = var9;
      } else if (var0 == 1431) {
         var3.field3715 = var9;
      } else if (var0 == 1434) {
         var3.field3703 = var9;
      } else if (var0 == 1435) {
         var3.field3739 = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class325 var8 = var3.method6383();
         if (var8 != null) {
            if (var0 == 1436) {
               var8.field3532 = var9;
            } else if (var0 == 1437) {
               var8.field3533 = var9;
            } else if (var0 == 1438) {
               var8.field3534 = var9;
            } else if (var0 == 1439) {
               var8.field3528 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }
}
