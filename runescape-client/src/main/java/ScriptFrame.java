import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ScriptFrame")
public class ScriptFrame {
   @ObfuscatedName("ug")
   @ObfuscatedGetter(
      intValue = 1496735347
   )
   static int field469;
   @ObfuscatedName("bc")
   @Export("client")
   @ObfuscatedSignature(
      descriptor = "Lclient;"
   )
   static Client client;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   @Export("script")
   Script script;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1780087085
   )
   @Export("pc")
   int pc = -1;
   @ObfuscatedName("aw")
   @Export("intLocals")
   int[] intLocals;
   @ObfuscatedName("ac")
   @Export("stringLocals")
   String[] stringLocals;

   ScriptFrame() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1705605824"
   )
   public static int method1167(int var0) {
      return NPCComposition.method3824(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1708655552"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         MenuAction.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;

      int var8;
      for(var8 = 0; var8 < KeyHandler.method389(); ++var8) {
         long var23 = class30.method465(var8);
         if (var6 != var23) {
            var6 = var23;
            int var25 = FaceNormal.method4704(var8);
            int var12 = method1167(var8);
            int var13 = TextureProvider.method4736(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var15 = InterfaceParent.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var16 = var15;
            int var20;
            int var21;
            if (var13 == 2 && class31.scene.getObjectFlags(GameEngine.Client_plane, var25, var12, var23) >= 0) {
               ObjectComposition var17 = class144.getObjectDefinition(var15);
               if (var17.transforms != null) {
                  var17 = var17.transform();
               }

               if (var17 == null) {
                  continue;
               }

               PendingSpawn var18 = null;

               for(PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
                  if (var19.plane == GameEngine.Client_plane && var25 == var19.x && var12 == var19.y && var16 == var19.field1127) {
                     var18 = var19;
                     break;
                  }
               }

               if (Client.isItemSelected == 1) {
                  MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(65535) + var17.name, 1, var16, var25, var12);
               } else if (Client.isSpellSelected) {
                  if ((SecureRandomFuture.selectedSpellFlags & 4) == 4) {
                     MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(65535) + var17.name, 2, var16, var25, var12);
                  }
               } else {
                  String[] var33 = var17.actions;
                  if (var33 != null) {
                     for(var20 = 4; var20 >= 0; --var20) {
                        if ((var18 == null || var18.method2362(var20)) && var33[var20] != null) {
                           var21 = 0;
                           if (var20 == 0) {
                              var21 = 3;
                           }

                           if (var20 == 1) {
                              var21 = 4;
                           }

                           if (var20 == 2) {
                              var21 = 5;
                           }

                           if (var20 == 3) {
                              var21 = 6;
                           }

                           if (var20 == 4) {
                              var21 = 1001;
                           }

                           MenuAction.insertMenuItemNoShift(var33[var20], class383.colorStartTag(65535) + var17.name, var21, var16, var25, var12);
                        }
                     }
                  }

                  MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var12);
               }
            }

            int var26;
            Player var27;
            NPC var34;
            int[] var35;
            if (var13 == 1) {
               NPC var29 = Client.npcs[var16];
               if (var29 == null) {
                  continue;
               }

               if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) {
                  for(var26 = 0; var26 < Client.npcCount; ++var26) {
                     var34 = Client.npcs[Client.npcIndices[var26]];
                     if (var34 != null && var29 != var34 && var34.definition.size == 1 && var29.x == var34.x && var29.y == var34.y) {
                        InvDefinition.addNpcToMenu(var34, Client.npcIndices[var26], var25, var12);
                     }
                  }

                  var26 = Players.Players_count;
                  var35 = Players.Players_indices;

                  for(var20 = 0; var20 < var26; ++var20) {
                     var27 = Client.players[var35[var20]];
                     if (var27 != null && var27.x == var29.x && var27.y == var29.y) {
                        DynamicObject.addPlayerToMenu(var27, var35[var20], var25, var12);
                     }
                  }
               }

               InvDefinition.addNpcToMenu(var29, var16, var25, var12);
            }

            if (var13 == 0) {
               Player var30 = Client.players[var16];
               if (var30 == null) {
                  continue;
               }

               if ((var30.x & 127) == 64 && (var30.y & 127) == 64) {
                  for(var26 = 0; var26 < Client.npcCount; ++var26) {
                     var34 = Client.npcs[Client.npcIndices[var26]];
                     if (var34 != null && var34.definition.size == 1 && var30.x == var34.x && var34.y == var30.y) {
                        InvDefinition.addNpcToMenu(var34, Client.npcIndices[var26], var25, var12);
                     }
                  }

                  var26 = Players.Players_count;
                  var35 = Players.Players_indices;

                  for(var20 = 0; var20 < var26; ++var20) {
                     var27 = Client.players[var35[var20]];
                     if (var27 != null && var30 != var27 && var30.x == var27.x && var27.y == var30.y) {
                        DynamicObject.addPlayerToMenu(var27, var35[var20], var25, var12);
                     }
                  }
               }

               if (var16 != Client.combatTargetPlayerIndex) {
                  DynamicObject.addPlayerToMenu(var30, var16, var25, var12);
               } else {
                  var4 = var23;
               }
            }

            if (var13 == 3) {
               NodeDeque var31 = Client.groundItems[GameEngine.Client_plane][var25][var12];
               if (var31 != null) {
                  for(TileItem var32 = (TileItem)var31.first(); var32 != null; var32 = (TileItem)var31.next()) {
                     ItemComposition var36 = HealthBarUpdate.ItemDefinition_get(var32.id);
                     if (Client.isItemSelected == 1) {
                        MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16748608) + var36.name, 16, var32.id, var25, var12);
                     } else if (Client.isSpellSelected) {
                        if ((SecureRandomFuture.selectedSpellFlags & 1) == 1) {
                           MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16748608) + var36.name, 17, var32.id, var25, var12);
                        }
                     } else {
                        String[] var28 = var36.groundActions;

                        for(var21 = 4; var21 >= 0; --var21) {
                           if (var32.method2671(var21)) {
                              if (var28 != null && var28[var21] != null) {
                                 byte var22 = 0;
                                 if (var21 == 0) {
                                    var22 = 18;
                                 }

                                 if (var21 == 1) {
                                    var22 = 19;
                                 }

                                 if (var21 == 2) {
                                    var22 = 20;
                                 }

                                 if (var21 == 3) {
                                    var22 = 21;
                                 }

                                 if (var21 == 4) {
                                    var22 = 22;
                                 }

                                 MenuAction.insertMenuItemNoShift(var28[var21], class383.colorStartTag(16748608) + var36.name, var22, var32.id, var25, var12);
                              } else if (var21 == 2) {
                                 MenuAction.insertMenuItemNoShift("Take", class383.colorStartTag(16748608) + var36.name, 20, var32.id, var25, var12);
                              }
                           }
                        }

                        MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16748608) + var36.name, 1004, var32.id, var25, var12);
                     }
                  }
               }
            }
         }
      }

      if (var4 != -1L) {
         var8 = (int)(var4 >>> 0 & 127L);
         int var10 = NPCComposition.method3824(var4);
         Player var11 = Client.players[Client.combatTargetPlayerIndex];
         DynamicObject.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
      }

   }

   @ObfuscatedName("mg")
   static final void method1164(double var0) {
      class18.method285(var0);
      ((TextureProvider)Rasterizer3D.field2514.Rasterizer3D_textureLoader).setBrightness(var0);
      class127.method3118();
      class20.clientPreferences.method2458(var0);
   }

   @ObfuscatedName("nt")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-42"
   )
   static void method1166(String var0) {
      class108.field1403 = var0;

      try {
         String var1 = client.getParameter(Integer.toString(18));
         String var2 = client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class136.method3194(class96.method2634() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class26.method392(client, "document.cookie=\"" + var3 + "\"");
      } catch (Throwable var4) {
      }

   }
}
