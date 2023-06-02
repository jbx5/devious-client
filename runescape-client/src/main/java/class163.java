import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class163 {
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 939869835
   )
   public static int field1773;

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(IIIIS)V",
      garbageValue = "26478"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         class138.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = ViewportMouse.ViewportMouse_entityCount;
         if (var8 >= var10) {
            if (var4 != -1L) {
               var8 = (int)(var4 >>> 0 & 127L);
               var10 = class166.method3386(var4);
               Player var11 = Client.players[Client.combatTargetPlayerIndex];
               class1.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
            }

            return;
         }

         long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
         if (var6 != var26) {
            label369: {
               var6 = var26;
               int var15 = class14.method185(var8);
               int var16 = class166.method3386(ViewportMouse.ViewportMouse_entityTags[var8]);
               int var17 = var16;
               int var18 = class134.method3040(var8);
               int var19 = ArchiveDisk.method8022(var8);
               int var23;
               int var24;
               if (var18 == 2 && class36.scene.getObjectFlags(Clock.Client_plane, var15, var16, var26) >= 0) {
                  ObjectComposition var20 = class175.getObjectDefinition(var19);
                  if (var20.transforms != null) {
                     var20 = var20.transform();
                  }

                  if (var20 == null) {
                     break label369;
                  }

                  PendingSpawn var21 = null;

                  for(PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
                     if (var22.plane == Clock.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1148) {
                        var21 = var22;
                        break;
                     }
                  }

                  if (Client.isItemSelected == 1) {
                     class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + Strings.colorStartTag(65535) + var20.name, 1, var19, var15, var17);
                  } else if (Client.isSpellSelected) {
                     if ((class125.selectedSpellFlags & 4) == 4) {
                        class138.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Strings.colorStartTag(65535) + var20.name, 2, var19, var15, var17);
                     }
                  } else {
                     String[] var35 = var20.actions;
                     if (var35 != null) {
                        for(var23 = 4; var23 >= 0; --var23) {
                           if ((var21 == null || var21.method2351(var23)) && var35[var23] != null) {
                              var24 = 0;
                              if (var23 == 0) {
                                 var24 = 3;
                              }

                              if (var23 == 1) {
                                 var24 = 4;
                              }

                              if (var23 == 2) {
                                 var24 = 5;
                              }

                              if (var23 == 3) {
                                 var24 = 6;
                              }

                              if (var23 == 4) {
                                 var24 = 1001;
                              }

                              class138.insertMenuItemNoShift(var35[var23], Strings.colorStartTag(65535) + var20.name, var24, var19, var15, var17);
                           }
                        }
                     }

                     class138.insertMenuItemNoShift("Examine", Strings.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17);
                  }
               }

               int var28;
               Player var29;
               NPC var36;
               int[] var37;
               if (var18 == 1) {
                  NPC var31 = Client.npcs[var19];
                  if (var31 == null) {
                     break label369;
                  }

                  if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
                     for(var28 = 0; var28 < Client.npcCount; ++var28) {
                        var36 = Client.npcs[Client.npcIndices[var28]];
                        if (var36 != null && var31 != var36 && var36.definition.size == 1 && var31.x == var36.x && var36.y == var31.y) {
                           Language.addNpcToMenu(var36, Client.npcIndices[var28], var15, var17);
                        }
                     }

                     var28 = Players.Players_count;
                     var37 = Players.Players_indices;

                     for(var23 = 0; var23 < var28; ++var23) {
                        var29 = Client.players[var37[var23]];
                        if (var29 != null && var31.x == var29.x && var31.y == var29.y) {
                           class1.addPlayerToMenu(var29, var37[var23], var15, var17);
                        }
                     }
                  }

                  Language.addNpcToMenu(var31, var19, var15, var17);
               }

               if (var18 == 0) {
                  Player var32 = Client.players[var19];
                  if (var32 == null) {
                     break label369;
                  }

                  if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
                     for(var28 = 0; var28 < Client.npcCount; ++var28) {
                        var36 = Client.npcs[Client.npcIndices[var28]];
                        if (var36 != null && var36.definition.size == 1 && var36.x == var32.x && var32.y == var36.y) {
                           Language.addNpcToMenu(var36, Client.npcIndices[var28], var15, var17);
                        }
                     }

                     var28 = Players.Players_count;
                     var37 = Players.Players_indices;

                     for(var23 = 0; var23 < var28; ++var23) {
                        var29 = Client.players[var37[var23]];
                        if (var29 != null && var29 != var32 && var32.x == var29.x && var32.y == var29.y) {
                           class1.addPlayerToMenu(var29, var37[var23], var15, var17);
                        }
                     }
                  }

                  if (var19 != Client.combatTargetPlayerIndex) {
                     class1.addPlayerToMenu(var32, var19, var15, var17);
                  } else {
                     var4 = var26;
                  }
               }

               if (var18 == 3) {
                  NodeDeque var33 = Client.groundItems[Clock.Client_plane][var15][var17];
                  if (var33 != null) {
                     for(TileItem var34 = (TileItem)var33.first(); var34 != null; var34 = (TileItem)var33.next()) {
                        ItemComposition var38 = class300.ItemDefinition_get(var34.id);
                        if (Client.isItemSelected == 1) {
                           class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + Strings.colorStartTag(16748608) + var38.name, 16, var34.id, var15, var17);
                        } else if (Client.isSpellSelected) {
                           if ((class125.selectedSpellFlags & 1) == 1) {
                              class138.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Strings.colorStartTag(16748608) + var38.name, 17, var34.id, var15, var17);
                           }
                        } else {
                           String[] var30 = var38.groundActions;

                           for(var24 = 4; var24 >= 0; --var24) {
                              if (var34.method2661(var24)) {
                                 if (var30 != null && var30[var24] != null) {
                                    byte var25 = 0;
                                    if (var24 == 0) {
                                       var25 = 18;
                                    }

                                    if (var24 == 1) {
                                       var25 = 19;
                                    }

                                    if (var24 == 2) {
                                       var25 = 20;
                                    }

                                    if (var24 == 3) {
                                       var25 = 21;
                                    }

                                    if (var24 == 4) {
                                       var25 = 22;
                                    }

                                    class138.insertMenuItemNoShift(var30[var24], Strings.colorStartTag(16748608) + var38.name, var25, var34.id, var15, var17);
                                 } else if (var24 == 2) {
                                    class138.insertMenuItemNoShift("Take", Strings.colorStartTag(16748608) + var38.name, 20, var34.id, var15, var17);
                                 }
                              }
                           }

                           class138.insertMenuItemNoShift("Examine", Strings.colorStartTag(16748608) + var38.name, 1004, var34.id, var15, var17);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
