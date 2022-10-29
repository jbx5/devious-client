import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("ty")
   @ObfuscatedGetter(
      intValue = 1772865743
   )
   static int field254;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1075873467
   )
   @Export("MouseHandler_y")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lap;"
   )
   @Export("MouseHandler_instance")
   static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 2060795891
   )
   @Export("MouseHandler_idleCycles")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = -6793974308829536977L
   )
   @Export("MouseHandler_millis")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1788510663
   )
   @Export("MouseHandler_currentButtonVolatile")
   static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1069914589
   )
   @Export("MouseHandler_xVolatile")
   static volatile int MouseHandler_xVolatile = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 956779955
   )
   @Export("MouseHandler_yVolatile")
   static volatile int MouseHandler_yVolatile = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 1896890509962247957L
   )
   @Export("MouseHandler_lastMovedVolatile")
   static volatile long MouseHandler_lastMovedVolatile = -1L;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1098515589
   )
   @Export("MouseHandler_currentButton")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -625005879
   )
   @Export("MouseHandler_x")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1951364831
   )
   @Export("MouseHandler_lastButtonVolatile")
   static volatile int MouseHandler_lastButtonVolatile = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1042044087
   )
   @Export("MouseHandler_lastPressedXVolatile")
   static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 986746059
   )
   @Export("MouseHandler_lastPressedYVolatile")
   static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 4690257101781228171L
   )
   @Export("MouseHandler_lastPressedTimeMillisVolatile")
   static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 505065843
   )
   @Export("MouseHandler_lastButton")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1216657077
   )
   @Export("MouseHandler_lastPressedX")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -556288967
   )
   @Export("MouseHandler_lastPressedY")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 5300731271990123067L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   @ObfuscatedName("i")
   @Export("operatingSystemName")
   public static String operatingSystemName;
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   static Archive field251;

   MouseHandler() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-657802875"
   )
   @Export("getButton")
   final int getButton(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX();
         MouseHandler_yVolatile = var1.getY();
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX();
         MouseHandler_lastPressedYVolatile = var1.getY();
         MouseHandler_lastPressedTimeMillisVolatile = UserComparator8.method2748();
         MouseHandler_lastButtonVolatile = this.getButton(var1);
         if (MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = -1;
         MouseHandler_yVolatile = -1;
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_currentButtonVolatile = 0;
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "6"
   )
   public static void method697(boolean var0) {
      if (NetCache.NetCache_socket != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.writeByte(var0 ? 2 : 3);
            var1.writeMedium(0);
            NetCache.NetCache_socket.write(var1.array, 0, 4);
         } catch (IOException var4) {
            try {
               NetCache.NetCache_socket.close();
            } catch (Exception var3) {
            }

            ++NetCache.NetCache_ioExceptions;
            NetCache.NetCache_socket = null;
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-369854215"
   )
   @Export("addGameMessage")
   static void addGameMessage(int var0, String var1, String var2) {
      ItemContainer.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-1668096410"
   )
   @Export("setViewportShape")
   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = Client.field764;
      } else if (var5 >= 100) {
         var6 = Client.field649;
      } else {
         var6 = (Client.field649 - Client.field764) * var5 / 100 + Client.field764;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var10;
      if (var7 < Client.field562) {
         var10 = Client.field562;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field769) {
            var6 = Client.field769;
            var8 = var3 * var6 * 512 / (var10 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field771) {
         var10 = Client.field771;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field601) {
            var6 = Client.field601;
            var8 = var10 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      Client.viewportZoom = var3 * var6 / 334;
      if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
         Archive.method6307(var2, var3);
      }

      Client.viewportOffsetX = var0;
      Client.viewportOffsetY = var1;
      Client.viewportWidth = var2;
      Client.viewportHeight = var3;
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2020873546"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         class16.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;

      int var8;
      for(var8 = 0; var8 < class69.method2018(); ++var8) {
         long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
         if (var6 != var26) {
            var6 = var26;
            int var13 = class406.method7640(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var14 = var13;
            int var15 = class14.method177(var8);
            long var18 = ViewportMouse.ViewportMouse_entityTags[var8];
            int var17 = (int)(var18 >>> 14 & 3L);
            int var28 = AttackOption.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var19 = var28;
            int var23;
            int var24;
            if (var17 == 2 && class139.scene.getObjectFlags(ApproximateRouteStrategy.Client_plane, var13, var15, var26) >= 0) {
               ObjectComposition var20 = InterfaceParent.getObjectDefinition(var28);
               if (var20.transforms != null) {
                  var20 = var20.transform();
               }

               if (var20 == null) {
                  continue;
               }

               PendingSpawn var21 = null;

               for(PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
                  if (var22.plane == ApproximateRouteStrategy.Client_plane && var14 == var22.x && var15 == var22.y && var19 == var22.field1127) {
                     var21 = var22;
                     break;
                  }
               }

               if (Client.isItemSelected == 1) {
                  class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(65535) + var20.name, 1, var19, var14, var15);
               } else if (Client.isSpellSelected) {
                  if ((UserComparator5.selectedSpellFlags & 4) == 4) {
                     class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(65535) + var20.name, 2, var19, var14, var15);
                  }
               } else {
                  String[] var36 = var20.actions;
                  if (var36 != null) {
                     for(var23 = 4; var23 >= 0; --var23) {
                        if ((var21 == null || var21.method2311(var23)) && var36[var23] != null) {
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

                           class16.insertMenuItemNoShift(var36[var23], GameObject.colorStartTag(65535) + var20.name, var24, var19, var14, var15);
                        }
                     }
                  }

                  class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(65535) + var20.name, 1002, var20.id, var14, var15);
               }
            }

            int var29;
            Player var30;
            NPC var37;
            int[] var38;
            if (var17 == 1) {
               NPC var32 = Client.npcs[var19];
               if (var32 == null) {
                  continue;
               }

               if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
                  for(var29 = 0; var29 < Client.npcCount; ++var29) {
                     var37 = Client.npcs[Client.npcIndices[var29]];
                     if (var37 != null && var37 != var32 && var37.definition.size == 1 && var37.x == var32.x && var32.y == var37.y) {
                        Coord.addNpcToMenu(var37, Client.npcIndices[var29], var14, var15);
                     }
                  }

                  var29 = Players.Players_count;
                  var38 = Players.Players_indices;

                  for(var23 = 0; var23 < var29; ++var23) {
                     var30 = Client.players[var38[var23]];
                     if (var30 != null && var30.x == var32.x && var32.y == var30.y) {
                        UserComparator9.addPlayerToMenu(var30, var38[var23], var14, var15);
                     }
                  }
               }

               Coord.addNpcToMenu(var32, var19, var14, var15);
            }

            if (var17 == 0) {
               Player var33 = Client.players[var19];
               if (var33 == null) {
                  continue;
               }

               if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
                  for(var29 = 0; var29 < Client.npcCount; ++var29) {
                     var37 = Client.npcs[Client.npcIndices[var29]];
                     if (var37 != null && var37.definition.size == 1 && var33.x == var37.x && var37.y == var33.y) {
                        Coord.addNpcToMenu(var37, Client.npcIndices[var29], var14, var15);
                     }
                  }

                  var29 = Players.Players_count;
                  var38 = Players.Players_indices;

                  for(var23 = 0; var23 < var29; ++var23) {
                     var30 = Client.players[var38[var23]];
                     if (var30 != null && var33 != var30 && var30.x == var33.x && var33.y == var30.y) {
                        UserComparator9.addPlayerToMenu(var30, var38[var23], var14, var15);
                     }
                  }
               }

               if (var19 != Client.combatTargetPlayerIndex) {
                  UserComparator9.addPlayerToMenu(var33, var19, var14, var15);
               } else {
                  var4 = var26;
               }
            }

            if (var17 == 3) {
               NodeDeque var34 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var14][var15];
               if (var34 != null) {
                  for(TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) {
                     ItemComposition var39 = MidiPcmStream.ItemDefinition_get(var35.id);
                     if (Client.isItemSelected == 1) {
                        class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var39.name, 16, var35.id, var14, var15);
                     } else if (Client.isSpellSelected) {
                        if ((UserComparator5.selectedSpellFlags & 1) == 1) {
                           class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16748608) + var39.name, 17, var35.id, var14, var15);
                        }
                     } else {
                        String[] var31 = var39.groundActions;

                        for(var24 = 4; var24 >= 0; --var24) {
                           if (var35.method2544(var24)) {
                              if (var31 != null && var31[var24] != null) {
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

                                 class16.insertMenuItemNoShift(var31[var24], GameObject.colorStartTag(16748608) + var39.name, var25, var35.id, var14, var15);
                              } else if (var24 == 2) {
                                 class16.insertMenuItemNoShift("Take", GameObject.colorStartTag(16748608) + var39.name, 20, var35.id, var14, var15);
                              }
                           }
                        }

                        class16.insertMenuItemNoShift("Examine", GameObject.colorStartTag(16748608) + var39.name, 1004, var35.id, var14, var15);
                     }
                  }
               }
            }
         }
      }

      if (var4 != -1L) {
         var8 = class406.method7640(var4);
         int var9 = FloorDecoration.method4136(var4);
         Player var10 = Client.players[Client.combatTargetPlayerIndex];
         UserComparator9.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
      }

   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(Lkn;B)Z",
      garbageValue = "52"
   )
   @Export("runCs1")
   static final boolean runCs1(Widget var0) {
      if (var0.cs1Comparisons == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
            int var2 = class268.method5366(var0, var1);
            int var3 = var0.cs1ComparisonValues[var1];
            if (var0.cs1Comparisons[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 4) {
               if (var3 == var2) {
                  return false;
               }
            } else if (var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "86850697"
   )
   public static Clipboard method676() {
      return ClanChannelMember.client.method510();
   }
}
