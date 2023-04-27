import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("InvDefinition_archive")
   static AbstractArchive InvDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("InvDefinition_cached")
   static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2010981849
   )
   @Export("size")
   public int size = 0;

   InvDefinition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "1"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "64174481"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      descriptor = "(Ldf;IIIS)V",
      garbageValue = "25450"
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
                  String var5 = var0.method2599();
                  int var6;
                  if (var4.combatLevel != 0 && var0.field1211 != 0) {
                     var6 = var0.field1211 != -1 ? var0.field1211 : var4.combatLevel;
                     var5 = var5 + ItemContainer.method2243(var6, MusicPatchNode.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
                  }

                  if (var4.isFollower && Client.followerOpsLowPriority) {
                     MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (Client.isItemSelected == 1) {
                     MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16776960) + var5, 7, var1, var2, var3);
                  } else if (Client.isSpellSelected) {
                     if ((SecureRandomFuture.selectedSpellFlags & 2) == 2) {
                        MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
                     String[] var7 = var4.actions;
                     int var8;
                     int var9;
                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2596(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
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

                              MenuAction.insertMenuItemNoShift(var7[var8], class383.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (var7 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var0.method2596(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
                              short var10 = 0;
                              if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
                                 if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > MusicPatchNode.localPlayer.combatLevel) {
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

                                 MenuAction.insertMenuItemNoShift(var7[var8], class383.colorStartTag(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var4.isFollower || !Client.followerOpsLowPriority) {
                        MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("nb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "1569639022"
   )
   static String method3645(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (class108.field1403 != null) {
         var3 = "/p=" + class108.field1403;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + ClanSettings.clientLanguage + "/a=" + TriBool.field4600 + var3 + "/";
   }

   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-70"
   )
   public static boolean method3646() {
      return Client.clickedWidget != null;
   }
}
