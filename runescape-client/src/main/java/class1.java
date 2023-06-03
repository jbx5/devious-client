import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class1 implements Callable {
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 2000420327
   )
   static int field4;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   final Buffer field3;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   final class3 field5;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lak;"
   )
   final class7 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lak;Ltz;Las;)V"
   )
   class1(class7 var1, Buffer var2, class3 var3) {
      this.this$0 = var1;
      this.field3 = var2;
      this.field5 = var3;
   }

   public Object call() {
      return this.field5.vmethod10(this.field3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-691860209"
   )
   public static String method9(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-55"
   )
   static final void method3() {
      int[] var0 = Players.Players_indices;

      int var1;
      for(var1 = 0; var1 < Players.Players_count; ++var1) {
         Player var4 = Client.players[var0[var1]];
         if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
            --var4.overheadTextCyclesRemaining;
            if (var4.overheadTextCyclesRemaining == 0) {
               var4.overheadText = null;
            }
         }
      }

      for(var1 = 0; var1 < Client.npcCount; ++var1) {
         int var2 = Client.npcIndices[var1];
         NPC var3 = Client.npcs[var2];
         if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
            --var3.overheadTextCyclesRemaining;
            if (var3.overheadTextCyclesRemaining == 0) {
               var3.overheadText = null;
            }
         }
      }

   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "(Ldh;IIII)V",
      garbageValue = "1283151153"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (Projectile.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            int var7;
            if (var0.skillLevel == 0) {
               String var5 = var0.actions[0] + var0.username + var0.actions[1];
               var7 = var0.combatLevel;
               int var8 = Projectile.localPlayer.combatLevel;
               int var9 = var8 - var7;
               String var6;
               if (var9 < -9) {
                  var6 = Strings.colorStartTag(16711680);
               } else if (var9 < -6) {
                  var6 = Strings.colorStartTag(16723968);
               } else if (var9 < -3) {
                  var6 = Strings.colorStartTag(16740352);
               } else if (var9 < 0) {
                  var6 = Strings.colorStartTag(16756736);
               } else if (var9 > 9) {
                  var6 = Strings.colorStartTag(65280);
               } else if (var9 > 6) {
                  var6 = Strings.colorStartTag(4259584);
               } else if (var9 > 3) {
                  var6 = Strings.colorStartTag(8453888);
               } else if (var9 > 0) {
                  var6 = Strings.colorStartTag(12648192);
               } else {
                  var6 = Strings.colorStartTag(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var10;
            if (Client.isItemSelected == 1) {
               class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + Strings.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((class125.selectedSpellFlags & 8) == 8) {
                  class138.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Strings.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if (Client.playerMenuActions[var10] != null) {
                     short var11 = 0;
                     if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
                        if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
                           continue;
                        }

                        if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Projectile.localPlayer.combatLevel) {
                           var11 = 2000;
                        }

                        if (Projectile.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == Projectile.localPlayer.team) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        } else if (AttackOption.field1307 == Client.playerAttackOption && var0.isClanMember()) {
                           var11 = 2000;
                        }
                     } else if (Client.playerOptionsPriorities[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = Client.playerMenuOpcodes[var10] + var11;
                     class138.insertMenuItemNoShift(Client.playerMenuActions[var10], Strings.colorStartTag(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
               if (Client.menuOpcodes[var10] == 23) {
                  Client.menuTargets[var10] = Strings.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }

   @ObfuscatedName("nz")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-693827652"
   )
   static void method6(boolean var0) {
      Client.leftClickOpensMenu = var0;
   }
}
