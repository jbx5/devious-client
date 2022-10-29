import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ek")
public enum class131 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   field1560(0, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   field1564(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   field1559(4, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   field1561(3, 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   field1562(2, 4);

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lkf;"
   )
   @Export("musicTrack")
   public static MusicTrack musicTrack;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = -655594075
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1159505105
   )
   public final int field1563;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1577238385
   )
   @Export("id")
   final int id;

   class131(int var3, int var4) {
      this.field1563 = var3;
      this.id = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "4"
   )
   static boolean method2952(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "2076003691"
   )
   static int method2955(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class300 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6076();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.method5962().method6880();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.text;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollWidth;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollHeight;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelZoom;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleX;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleZ;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleY;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyTop;
            return 1;
         } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyBot;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color2;
            return 1;
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
            return 1;
         } else {
            class295 var4;
            if (var0 == 1617) {
               var4 = var3.method6153();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3399 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6153();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3401 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6076();
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5816().method6880() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6153();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3400 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5826() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5827() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5828() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5800() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5817().method7116() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6076();
                  int var5 = var7 != null ? var7.method5898() : 0;
                  int var6 = var7 != null ? var7.method5821() : 0;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5821() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method6030() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5829() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5954() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6076();
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5832() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6078();
                     Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method6078();
                     Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6076();
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5819() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "4"
   )
   static int method2956(int var0, Script var1, boolean var2) {
      if (var0 == 7463) {
         boolean var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1;
         class12.method164(var3);
         return 1;
      } else {
         return 2;
      }
   }
}
