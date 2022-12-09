import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
   @ObfuscatedName("tu")
   @ObfuscatedSignature(
      descriptor = "Lax;"
   )
   @Export("pcmPlayer1")
   static PcmPlayer pcmPlayer1;
   @ObfuscatedName("fi")
   @ObfuscatedGetter(
      intValue = 1658638723
   )
   static int field1461;
   @ObfuscatedName("h")
   @Export("reversed")
   final boolean reversed;

   public UserComparator8(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;B)I",
      garbageValue = "81"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world) {
         if (var2.world != Client.worldId) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world == Client.worldId) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lql;III)I",
      garbageValue = "2141786547"
   )
   static int method2819(IterableNodeHashTable var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         IntegerNode var3 = (IntegerNode)var0.get((long)var1);
         return var3 == null ? var2 : var3.integer;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-100254626"
   )
   static int method2820(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         class87.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = PlayerCompositionColorTextureOverride.getWidget(var9);
            if (var6.children == null) {
               var6.children = new Widget[var11 + 1];
            }

            if (var6.children.length <= var11) {
               Widget[] var7 = new Widget[var11 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if (var11 > 0 && var6.children[var11 - 1] == null) {
               throw new RuntimeException("" + (var11 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.childIndex = var11;
               var12.isIf3 = true;
               if (var4 == 12) {
                  var12.method6261();
                  var12.method6167().method5927(new class101(var12));
                  var12.method6167().method5926(new class102(var12));
               }

               var6.children[var11] = var12;
               if (var2) {
                  class190.scriptDotWidget = var12;
               } else {
                  class360.scriptActiveWidget = var12;
               }

               class69.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
            Widget var10 = PlayerCompositionColorTextureOverride.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            class69.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
            var3.children = null;
            class69.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     class190.scriptDotWidget = var3;
                  } else {
                     class360.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class87.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
            Widget var5 = AttackOption.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  class190.scriptDotWidget = var5;
               } else {
                  class360.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }
}
