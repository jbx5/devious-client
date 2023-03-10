import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("kk")
public class class260 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lcz;"
   )
   @Export("World_worlds")
   static World[] World_worlds;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
      garbageValue = "1723648490"
   )
   static float[] method5238(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(Ldz;IIII)V",
      garbageValue = "1949274220"
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
                  String var5 = var0.method2601();
                  int var6;
                  if (var4.combatLevel != 0 && var0.field1189 != 0) {
                     var6 = var0.field1189 != -1 ? var0.field1189 : var4.combatLevel;
                     var5 = var5 + NPC.method2569(var6, BuddyRankComparator.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
                  }

                  if (var4.isFollower && Client.followerOpsLowPriority) {
                     class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (Client.isItemSelected == 1) {
                     class110.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Canvas.colorStartTag(16776960) + var5, 7, var1, var2, var3);
                  } else if (Client.isSpellSelected) {
                     if ((class90.selectedSpellFlags & 2) == 2) {
                        class110.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Canvas.colorStartTag(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
                     String[] var7 = var4.actions;
                     int var8;
                     int var9;
                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2554(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
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

                              class110.insertMenuItemNoShift(var7[var8], Canvas.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2554(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
                              short var10 = 0;
                              if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
                                 if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > BuddyRankComparator.localPlayer.combatLevel) {
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

                                 class110.insertMenuItemNoShift(var7[var8], Canvas.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var4.isFollower || !Client.followerOpsLowPriority) {
                        class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
