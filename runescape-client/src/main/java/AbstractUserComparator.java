import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
   @ObfuscatedName("an")
   @Export("nextComparator")
   Comparator nextComparator;

   protected AbstractUserComparator() {
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1664695442"
   )
   @Export("addComparator")
   final void addComparator(Comparator var1) {
      if (this.nextComparator == null) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lpw;Lpw;I)I",
      garbageValue = "641920470"
   )
   @Export("compareUser")
   protected final int compareUser(User var1, User var2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "1539640011"
   )
   static int method7860(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class314 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6392();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.method6135().method7265();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.text;
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
            class309 var4;
            if (var0 == 1617) {
               var4 = var3.method6394();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3493 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6394();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3489 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6392();
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6136().method7265() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6394();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3491 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6392();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6146() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6392();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6329() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6392();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6099() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6392();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6138() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6137().method7522() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6392();
                  int var5 = var7 != null ? var7.method6142() : 0;
                  int var6 = var7 != null ? var7.method6141() : 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6141() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6148() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6149() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6151() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6392();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6152() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6367();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method409(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method6367();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method410((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6392();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6139() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
