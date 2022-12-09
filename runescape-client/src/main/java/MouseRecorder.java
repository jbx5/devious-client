import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "Lpz;"
   )
   @Export("WorldMapElement_fonts")
   static Fonts WorldMapElement_fonts;
   @ObfuscatedName("h")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("e")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1063919825
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("x")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("m")
   @Export("ys")
   int[] ys = new int[500];
   @ObfuscatedName("q")
   @Export("millis")
   long[] millis = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.isRunning; class12.method157(50L)) {
         synchronized(this.lock) {
            if (this.index < 500) {
               this.xs[this.index] = MouseHandler.MouseHandler_x;
               this.ys[this.index] = MouseHandler.MouseHandler_y;
               this.millis[this.index] = MouseHandler.MouseHandler_millis;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "110"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-732526221"
   )
   static int method2264(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else if (var0 == 2707) {
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method6172() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         return class300.method5846(var3);
      } else if (var0 == 2709) {
         var3 = PlayerCompositionColorTextureOverride.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         return LoginScreenAnimation.method2380(var3);
      } else {
         return 2;
      }
   }

   @ObfuscatedName("lv")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-91"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      class136.method3073();
      HealthBar.method2526();
      int var1 = class109.VarpDefinition_get(var0).type;
      if (var1 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               FileSystem.method3480(0.9);
            }

            if (var2 == 2) {
               FileSystem.method3480(0.8);
            }

            if (var2 == 3) {
               FileSystem.method3480(0.7);
            }

            if (var2 == 4) {
               FileSystem.method3480(0.6);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class299.method5834(255);
            }

            if (var2 == 1) {
               class299.method5834(192);
            }

            if (var2 == 2) {
               class299.method5834(128);
            }

            if (var2 == 3) {
               class299.method5834(64);
            }

            if (var2 == 4) {
               class299.method5834(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               class7.method43(127);
            }

            if (var2 == 1) {
               class7.method43(96);
            }

            if (var2 == 2) {
               class7.method43(64);
            }

            if (var2 == 3) {
               class7.method43(32);
            }

            if (var2 == 4) {
               class7.method43(0);
            }
         }

         if (var1 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var1 == 6) {
            Client.chatEffects = var2;
         }

         if (var1 == 9) {
            Client.field685 = var2;
         }

         if (var1 == 10) {
            if (var2 == 0) {
               class18.method270(127);
            }

            if (var2 == 1) {
               class18.method270(96);
            }

            if (var2 == 2) {
               class18.method270(64);
            }

            if (var2 == 3) {
               class18.method270(32);
            }

            if (var2 == 4) {
               class18.method270(0);
            }
         }

         if (var1 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         AttackOption[] var3;
         if (var1 == 18) {
            var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1347, AttackOption.field1346};
            Client.playerAttackOption = (AttackOption)World.findEnumerated(var3, var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var1 == 22) {
            var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1347, AttackOption.field1346};
            Client.npcAttackOption = (AttackOption)World.findEnumerated(var3, var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
