import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ln")
@Implements("LoginPacket")
public class LoginPacket implements class281 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static final LoginPacket field3290 = new LoginPacket(14, 0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static final LoginPacket field3285 = new LoginPacket(15, 4);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static final LoginPacket field3288 = new LoginPacket(16, -2);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static final LoginPacket field3286 = new LoginPacket(18, -2);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   public static final LoginPacket field3289 = new LoginPacket(19, -2);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static final LoginPacket field3284 = new LoginPacket(27, 0);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "[Lln;"
   )
   @Export("LoginPacket_indexedValues")
   static final LoginPacket[] LoginPacket_indexedValues = new LoginPacket[32];
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1208472821
   )
   @Export("id")
   public final int id;

   static {
      LoginPacket[] var0 = WorldMapArea.method4920();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         LoginPacket_indexedValues[var0[var1].id] = var0[var1];
      }

   }

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   LoginPacket(int var1, int var2) {
      this.id = var1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "-1936355145"
   )
   static int method5473(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class310 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6118();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.method5865().method6999();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.text;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
            return 1;
         } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
            return 1;
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
            return 1;
         } else {
            class305 var4;
            if (var0 == 1617) {
               var4 = var3.method6119();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3436 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6119();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3437 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6118();
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5866().method6999() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6119();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3440 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6118();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5876() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6118();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5818() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6118();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5880() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6118();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5955() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5867().method7244() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6118();
                  int var5 = var7 != null ? var7.method6029() : 0;
                  int var6 = var7 != null ? var7.method5871() : 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5871() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5913() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5879() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5881() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6118();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5943() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6120();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method386(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method6120();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method387((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6118();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5933() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
