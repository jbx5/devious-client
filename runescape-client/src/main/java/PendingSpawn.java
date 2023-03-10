import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2091348261
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1750766831
   )
   @Export("type")
   int type;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1589620863
   )
   @Export("x")
   int x;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1917723923
   )
   @Export("y")
   int y;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -215829263
   )
   @Export("objectId")
   int objectId;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2017792735
   )
   int field1128;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1031118679
   )
   int field1130;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1609452867
   )
   int field1135;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1840767699
   )
   int field1131;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1919497029
   )
   int field1132;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -2144249083
   )
   int field1133;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -974620651
   )
   int field1134 = 31;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 412374047
   )
   @Export("delay")
   int delay = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 468175117
   )
   @Export("hitpoints")
   int hitpoints = -1;

   PendingSpawn() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1524864888"
   )
   void method2344(int var1) {
      this.field1134 = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "37"
   )
   boolean method2345(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1134 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIILip;Liz;I)Z",
      garbageValue = "806683414"
   )
   static final boolean method2343(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
      int var5 = var0;
      int var6 = var1;
      int var7 = 64;
      int var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class212.directions[var7][var8] = 99;
      class212.distances[var7][var8] = 0;
      int var11 = 0;
      int var12 = 0;
      class212.bufferX[var11] = var0;
      class212.bufferY[var11++] = var1;
      int[][] var13 = var4.flags;

      while(true) {
         label305:
         while(true) {
            int var14;
            int var15;
            int var16;
            int var17;
            do {
               do {
                  do {
                     label282:
                     do {
                        if (var11 == var12) {
                           class212.field2344 = var5;
                           class83.field1035 = var6;
                           return false;
                        }

                        var5 = class212.bufferX[var12];
                        var6 = class212.bufferY[var12];
                        var12 = var12 + 1 & 4095;
                        var7 = var5 - var9;
                        var8 = var6 - var10;
                        var14 = var5 - var4.xInset;
                        var15 = var6 - var4.yInset;
                        if (var3.hasArrived(var2, var5, var6, var4)) {
                           class212.field2344 = var5;
                           class83.field1035 = var6;
                           return true;
                        }

                        var16 = class212.distances[var7][var8] + 1;
                        if (var7 > 0 && class212.directions[var7 - 1][var8] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class212.bufferX[var11] = var5 - 1;
                                 class212.bufferY[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7 - 1][var8] = 2;
                                 class212.distances[var7 - 1][var8] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && class212.directions[var7 + 1][var8] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class212.bufferX[var11] = var5 + 1;
                                 class212.bufferY[var11] = var6;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7 + 1][var8] = 8;
                                 class212.distances[var7 + 1][var8] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 > 0 && class212.directions[var7][var8 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class212.bufferX[var11] = var5;
                                 class212.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7][var8 - 1] = 1;
                                 class212.distances[var7][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var8 < 128 - var2 && class212.directions[var7][var8 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2 - 1) {
                                 class212.bufferX[var11] = var5;
                                 class212.bufferY[var11] = var6 + 1;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7][var8 + 1] = 4;
                                 class212.distances[var7][var8 + 1] = var16;
                                 break;
                              }

                              if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 > 0 && class212.directions[var7 - 1][var8 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 class212.bufferX[var11] = var5 - 1;
                                 class212.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7 - 1][var8 - 1] = 3;
                                 class212.distances[var7 - 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 < 128 - var2 && var8 > 0 && class212.directions[var7 + 1][var8 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
                           var17 = 1;

                           while(true) {
                              if (var17 >= var2) {
                                 class212.bufferX[var11] = var5 + 1;
                                 class212.bufferY[var11] = var6 - 1;
                                 var11 = var11 + 1 & 4095;
                                 class212.directions[var7 + 1][var8 - 1] = 9;
                                 class212.distances[var7 + 1][var8 - 1] = var16;
                                 break;
                              }

                              if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var17 + var14][var15 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var17;
                           }
                        }

                        if (var7 > 0 && var8 < 128 - var2 && class212.directions[var7 - 1][var8 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
                           for(var17 = 1; var17 < var2; ++var17) {
                              if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
                                 continue label282;
                              }
                           }

                           class212.bufferX[var11] = var5 - 1;
                           class212.bufferY[var11] = var6 + 1;
                           var11 = var11 + 1 & 4095;
                           class212.directions[var7 - 1][var8 + 1] = 6;
                           class212.distances[var7 - 1][var8 + 1] = var16;
                        }
                     } while(var7 >= 128 - var2);
                  } while(var8 >= 128 - var2);
               } while(class212.directions[var7 + 1][var8 + 1] != 0);
            } while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

            for(var17 = 1; var17 < var2; ++var17) {
               if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
                  continue label305;
               }
            }

            class212.bufferX[var11] = var5 + 1;
            class212.bufferY[var11] = var6 + 1;
            var11 = var11 + 1 & 4095;
            class212.directions[var7 + 1][var8 + 1] = 12;
            class212.distances[var7 + 1][var8 + 1] = var16;
         }
      }
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-183595775"
   )
   static final void method2350() {
      if (Client.logoutTimer > 0) {
         class278.logOut();
      } else {
         Client.timer.method7323();
         class19.updateGameState(40);
         FloorDecoration.field2411 = Client.packetWriter.getSocket();
         Client.packetWriter.removeSocket();
      }
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-587511051"
   )
   static final void method2351(int var0, int var1, int var2) {
      if (class381.cameraX < var0) {
         class381.cameraX = (var0 - class381.cameraX) * class313.field3676 / 1000 + class381.cameraX + class19.field104;
         if (class381.cameraX > var0) {
            class381.cameraX = var0;
         }
      }

      if (class381.cameraX > var0) {
         class381.cameraX -= (class381.cameraX - var0) * class313.field3676 / 1000 + class19.field104;
         if (class381.cameraX < var0) {
            class381.cameraX = var0;
         }
      }

      if (class351.cameraY < var1) {
         class351.cameraY = (var1 - class351.cameraY) * class313.field3676 / 1000 + class351.cameraY + class19.field104;
         if (class351.cameraY > var1) {
            class351.cameraY = var1;
         }
      }

      if (class351.cameraY > var1) {
         class351.cameraY -= (class351.cameraY - var1) * class313.field3676 / 1000 + class19.field104;
         if (class351.cameraY < var1) {
            class351.cameraY = var1;
         }
      }

      if (class471.cameraZ < var2) {
         class471.cameraZ = (var2 - class471.cameraZ) * class313.field3676 / 1000 + class471.cameraZ + class19.field104;
         if (class471.cameraZ > var2) {
            class471.cameraZ = var2;
         }
      }

      if (class471.cameraZ > var2) {
         class471.cameraZ -= (class471.cameraZ - var2) * class313.field3676 / 1000 + class19.field104;
         if (class471.cameraZ < var2) {
            class471.cameraZ = var2;
         }
      }

   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "(Ldq;IB)V",
      garbageValue = "-47"
   )
   static final void method2355(Actor var0, int var1) {
      GrandExchangeOfferUnitPriceComparator.worldToScreen(var0.x, var0.y, var1);
   }

   @ObfuscatedName("nz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZB)V",
      garbageValue = "49"
   )
   @Export("findItemDefinitions")
   static void findItemDefinitions(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < ChatChannel.ItemDefinition_fileCount; ++var4) {
         ItemComposition var9 = ParamComposition.ItemDefinition_get(var4);
         if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               class323.foundItemIdCount = -1;
               GrandExchangeEvents.foundItemIds = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      GrandExchangeEvents.foundItemIds = var2;
      class173.foundItemIndex = 0;
      class323.foundItemIdCount = var3;
      String[] var8 = new String[class323.foundItemIdCount];

      for(int var5 = 0; var5 < class323.foundItemIdCount; ++var5) {
         var8[var5] = ParamComposition.ItemDefinition_get(var2[var5]).name;
      }

      short[] var10 = GrandExchangeEvents.foundItemIds;
      MouseRecorder.sortItemsByName(var8, var10, 0, var8.length - 1);
   }
}
