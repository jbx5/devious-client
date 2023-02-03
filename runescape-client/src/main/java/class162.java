import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fu")
public class class162 extends class155 {
   @ObfuscatedName("f")
   String field1809;
   @ObfuscatedName("w")
   byte field1806;
   @ObfuscatedName("v")
   byte field1807;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfn;"
   )
   final class156 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfn;)V"
   )
   class162(class156 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "-123"
   )
   void vmethod3387(Buffer var1) {
      this.field1809 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1809 != null) {
         var1.readUnsignedByte();
         this.field1806 = var1.readByte();
         this.field1807 = var1.readByte();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lfm;I)V",
      garbageValue = "127147356"
   )
   void vmethod3388(ClanChannel var1) {
      var1.name = this.field1809;
      if (this.field1809 != null) {
         var1.field1794 = this.field1806;
         var1.field1795 = this.field1807;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-1856713774"
   )
   static int method3392(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class307 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6235();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.method5971().method7078();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.text;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollWidth;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollHeight;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelZoom;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleX;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleZ;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleY;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyTop;
            return 1;
         } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyBot;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color2;
            return 1;
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
            return 1;
         } else {
            class302 var4;
            if (var0 == 1617) {
               var4 = var3.method6226();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3465 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6226();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3470 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6235();
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6128().method7078() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6226();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3467 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5950() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5983() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5984() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5974() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5973().method7307() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6235();
                  int var5 = var7 != null ? var7.method5978() : 0;
                  int var6 = var7 != null ? var7.method6145() : 0;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6145() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5985() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5948() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6058() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6235();
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5987() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6227();
                     Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method6227();
                     Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method394((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6235();
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5954() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
