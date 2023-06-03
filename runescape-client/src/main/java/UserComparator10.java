import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public UserComparator10(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Lqg;I)I",
      garbageValue = "584410763"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "42"
   )
   static String method2879() {
      String var0;
      if (class10.clientPreferences.method2472()) {
         String var2 = Login.Login_username;
         String var1 = GrandExchangeOfferAgeComparator.method6832('*', var2.length());
         var0 = var1;
      } else {
         var0 = Login.Login_username;
      }

      return var0;
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "1"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class36.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      if (0L != var5) {
         var7 = class36.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (GameEngine.method563(var5)) {
            var10 = var4;
         }

         int[] var11 = class33.sceneMinimapSprite.pixels;
         var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var13 = class215.Entity_unpackID(var5);
         ObjectComposition var14 = class175.getObjectDefinition(var13);
         if (var14.mapSceneId != -1) {
            IndexedSprite var15 = class47.mapSceneSprites[var14.mapSceneId];
            if (var15 != null) {
               int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
               int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
               var15.drawAt(var1 * 4 + var16 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 1) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var11[var12] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = class36.scene.getGameObjectTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class36.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class215.Entity_unpackID(var5);
         ObjectComposition var24 = class175.getObjectDefinition(var10);
         int var19;
         if (var24.mapSceneId != -1) {
            IndexedSprite var20 = class47.mapSceneSprites[var24.mapSceneId];
            if (var20 != null) {
               var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
               var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
               var20.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48);
            }
         } else if (var9 == 9) {
            var12 = 15658734;
            if (GameEngine.method563(var5)) {
               var12 = 15597568;
            }

            int[] var18 = class33.sceneMinimapSprite.pixels;
            var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var18[var19] = var12;
               var18[var19 + 1 + 512] = var12;
               var18[var19 + 1024 + 2] = var12;
               var18[var19 + 1536 + 3] = var12;
            } else {
               var18[var19 + 1536] = var12;
               var18[var19 + 1 + 1024] = var12;
               var18[var19 + 512 + 2] = var12;
               var18[var19 + 3] = var12;
            }
         }
      }

      var5 = class36.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class215.Entity_unpackID(var5);
         ObjectComposition var21 = class175.getObjectDefinition(var7);
         if (var21.mapSceneId != -1) {
            IndexedSprite var22 = class47.mapSceneSprites[var21.mapSceneId];
            if (var22 != null) {
               var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
               int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
               var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48);
            }
         }
      }

   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(Lmb;III)V",
      garbageValue = "993209306"
   )
   @Export("clickWidget")
   static final void clickWidget(Widget var0, int var1, int var2) {
      if (Client.clickedWidget == null && !Client.isMenuOpen) {
         if (var0 != null) {
            Widget var5 = var0;
            int var6 = Interpreter.method1961(StudioGame.getWidgetFlags(var0));
            Widget var4;
            int var7;
            if (var6 == 0) {
               var4 = null;
            } else {
               var7 = 0;

               while(true) {
                  if (var7 >= var6) {
                     var4 = var5;
                     break;
                  }

                  var5 = FriendSystem.getWidget(var5.parentId);
                  if (var5 == null) {
                     var4 = null;
                     break;
                  }

                  ++var7;
               }
            }

            Widget var8 = var4;
            if (var4 == null) {
               var8 = var0.parent;
            }

            if (var8 != null) {
               Client.clickedWidget = var0;
               var5 = var0;
               var6 = Interpreter.method1961(StudioGame.getWidgetFlags(var0));
               if (var6 == 0) {
                  var4 = null;
               } else {
                  var7 = 0;

                  while(true) {
                     if (var7 >= var6) {
                        var4 = var5;
                        break;
                     }

                     var5 = FriendSystem.getWidget(var5.parentId);
                     if (var5 == null) {
                        var4 = null;
                        break;
                     }

                     ++var7;
                  }
               }

               var8 = var4;
               if (var4 == null) {
                  var8 = var0.parent;
               }

               Client.clickedWidgetParent = var8;
               Client.widgetClickX = var1;
               Client.widgetClickY = var2;
               class348.widgetDragDuration = 0;
               Client.isDraggingWidget = false;
               int var9 = class132.method3034();
               if (var9 != -1) {
                  VerticalAlignment.createMenuAction(var9);
               }

               return;
            }
         }

      }
   }
}
