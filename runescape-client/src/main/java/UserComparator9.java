import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
   @ObfuscatedName("a")
   @Export("reversed")
   final boolean reversed;

   public UserComparator9(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lof;Lof;I)I",
      garbageValue = "-1386733058"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IIII)V",
      garbageValue = "-1431754984"
   )
   @Export("Widget_setKeyRate")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
      if (var0.field3611 == null) {
         throw new RuntimeException();
      } else {
         var0.field3611[var1] = var2;
         var0.field3565[var1] = var3;
      }
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(Lco;IIIB)V",
      garbageValue = "14"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (class296.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            int var7;
            if (var0.skillLevel == 0) {
               String var5 = var0.actions[0] + var0.username + var0.actions[1];
               var7 = var0.combatLevel;
               int var8 = class296.localPlayer.combatLevel;
               int var9 = var8 - var7;
               String var6;
               if (var9 < -9) {
                  var6 = GameObject.colorStartTag(16711680);
               } else if (var9 < -6) {
                  var6 = GameObject.colorStartTag(16723968);
               } else if (var9 < -3) {
                  var6 = GameObject.colorStartTag(16740352);
               } else if (var9 < 0) {
                  var6 = GameObject.colorStartTag(16756736);
               } else if (var9 > 9) {
                  var6 = GameObject.colorStartTag(65280);
               } else if (var9 > 6) {
                  var6 = GameObject.colorStartTag(4259584);
               } else if (var9 > 3) {
                  var6 = GameObject.colorStartTag(8453888);
               } else if (var9 > 0) {
                  var6 = GameObject.colorStartTag(12648192);
               } else {
                  var6 = GameObject.colorStartTag(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var10;
            if (Client.isItemSelected == 1) {
               class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((UserComparator5.selectedSpellFlags & 8) == 8) {
                  class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if (Client.playerMenuActions[var10] != null) {
                     short var11 = 0;
                     if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
                        if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                           continue;
                        }

                        if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class296.localPlayer.combatLevel) {
                           var11 = 2000;
                        }

                        if (class296.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == class296.localPlayer.team) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        } else if (AttackOption.field1289 == Client.playerAttackOption && var0.isClanMember()) {
                           var11 = 2000;
                        }
                     } else if (Client.playerOptionsPriorities[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = Client.playerMenuOpcodes[var10] + var11;
                     class16.insertMenuItemNoShift(Client.playerMenuActions[var10], GameObject.colorStartTag(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
               if (Client.menuOpcodes[var10] == 23) {
                  Client.menuTargets[var10] = GameObject.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
