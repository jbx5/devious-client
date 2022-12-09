import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("io")
   @ObfuscatedSignature(
      descriptor = "Lhc;"
   )
   @Export("scene")
   static Scene scene;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1143257971
   )
   @Export("id")
   int id;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1361333621
   )
   @Export("size")
   int size;
   @ObfuscatedName("v")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("x")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("m")
   @Export("arguments")
   byte[][][] arguments;
   @ObfuscatedName("q")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("f")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("r")
   @Export("methods")
   Method[] methods;

   ReflectionCheck() {
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "65850729"
   )
   static final void method714(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field731[var4] = true;
         }
      }

   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "(Lcg;IIIB)V",
      garbageValue = "-113"
   )
   @Export("addNpcToMenu")
   static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
      NPCComposition var4 = var0.definition;
      if (Client.menuOptionsCount < 400) {
         if (var4.transforms != null) {
            var4 = var4.transform();
         }

         if (var4 != null) {
            if (var4.isInteractable) {
               if (!var4.isFollower || Client.followerIndex == var1) {
                  String var5 = var0.method2535();
                  int var6;
                  if (var4.combatLevel != 0 && var0.field1253 != 0) {
                     var6 = var0.field1253 != -1 ? var0.field1253 : var4.combatLevel;
                     var5 = var5 + class125.method2971(var6, class155.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
                  }

                  if (var4.isFollower && Client.followerOpsLowPriority) {
                     ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (Client.isItemSelected == 1) {
                     ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16776960) + var5, 7, var1, var2, var3);
                  } else if (Client.isSpellSelected) {
                     if ((class21.selectedSpellFlags & 2) == 2) {
                        ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
                     String[] var7 = var4.actions;
                     int var8;
                     int var9;
                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2576(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
                              var9 = 0;
                              if (var8 == 0) {
                                 var9 = var6 + 9;
                              }

                              if (var8 == 1) {
                                 var9 = var6 + 10;
                              }

                              if (var8 == 2) {
                                 var9 = var6 + 11;
                              }

                              if (var8 == 3) {
                                 var9 = var6 + 12;
                              }

                              if (var8 == 4) {
                                 var9 = var6 + 13;
                              }

                              ObjectSound.insertMenuItemNoShift(var7[var8], MouseRecorder.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2576(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
                              short var10 = 0;
                              if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
                                 if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class155.localPlayer.combatLevel) {
                                    var10 = 2000;
                                 }

                                 var9 = 0;
                                 if (var8 == 0) {
                                    var9 = var10 + 9;
                                 }

                                 if (var8 == 1) {
                                    var9 = var10 + 10;
                                 }

                                 if (var8 == 2) {
                                    var9 = var10 + 11;
                                 }

                                 if (var8 == 3) {
                                    var9 = var10 + 12;
                                 }

                                 if (var8 == 4) {
                                    var9 = var10 + 13;
                                 }

                                 ObjectSound.insertMenuItemNoShift(var7[var8], MouseRecorder.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var4.isFollower || !Client.followerOpsLowPriority) {
                        ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1865520604"
   )
   static void method711(int var0) {
      PendingSpawn.tempMenuAction = new MenuAction();
      PendingSpawn.tempMenuAction.param0 = Client.menuArguments1[var0];
      PendingSpawn.tempMenuAction.param1 = Client.menuArguments2[var0];
      PendingSpawn.tempMenuAction.opcode = Client.menuOpcodes[var0];
      PendingSpawn.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      PendingSpawn.tempMenuAction.itemId = Client.menuItemIds[var0];
      PendingSpawn.tempMenuAction.action = Client.menuActions[var0];
      PendingSpawn.tempMenuAction.target = Client.menuTargets[var0];
   }

   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "10506"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (class281.friendsChat != null) {
         PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
