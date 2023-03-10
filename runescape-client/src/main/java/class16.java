import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class16 implements ThreadFactory {
   @ObfuscatedName("ao")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Leo;"
   )
   @Export("World_request")
   static UrlRequest World_request;
   @ObfuscatedName("aw")
   @Export("userHomeDirectory")
   static String userHomeDirectory;
   @ObfuscatedName("aj")
   final ThreadGroup field83;
   @ObfuscatedName("al")
   final AtomicInteger field79;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lam;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lam;)V"
   )
   class16(class14 var1) {
      this.this$0 = var1;
      this.field79 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field83 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field83, var1, this.this$0.field70 + "-rest-request-" + this.field79.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIILip;Liz;Z[I[II)I",
      garbageValue = "-1121357907"
   )
   public static int method207(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            class212.directions[var8][var9] = 0;
            class212.distances[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var28;
      if (var2 == 1) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = 64;
         var14 = var0 - var12;
         var15 = var1 - var13;
         class212.directions[var12][var13] = 99;
         class212.distances[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         class212.bufferX[var16] = var0;
         class212.bufferY[var16++] = var1;
         int[][] var18 = var4.flags;

         boolean var29;
         while(true) {
            if (var16 == var17) {
               class212.field2344 = var10;
               class83.field1035 = var11;
               var29 = false;
               break;
            }

            var10 = class212.bufferX[var17];
            var11 = class212.bufferY[var17];
            var17 = var17 + 1 & 4095;
            var12 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - var4.xInset;
            var20 = var11 - var4.yInset;
            if (var3.hasArrived(1, var10, var11, var4)) {
               class212.field2344 = var10;
               class83.field1035 = var11;
               var29 = true;
               break;
            }

            var21 = class212.distances[var12][var13] + 1;
            if (var12 > 0 && class212.directions[var12 - 1][var13] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
               class212.bufferX[var16] = var10 - 1;
               class212.bufferY[var16] = var11;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 - 1][var13] = 2;
               class212.distances[var12 - 1][var13] = var21;
            }

            if (var12 < 127 && class212.directions[var12 + 1][var13] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
               class212.bufferX[var16] = var10 + 1;
               class212.bufferY[var16] = var11;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 + 1][var13] = 8;
               class212.distances[var12 + 1][var13] = var21;
            }

            if (var13 > 0 && class212.directions[var12][var13 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class212.bufferX[var16] = var10;
               class212.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12][var13 - 1] = 1;
               class212.distances[var12][var13 - 1] = var21;
            }

            if (var13 < 127 && class212.directions[var12][var13 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class212.bufferX[var16] = var10;
               class212.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12][var13 + 1] = 4;
               class212.distances[var12][var13 + 1] = var21;
            }

            if (var12 > 0 && var13 > 0 && class212.directions[var12 - 1][var13 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class212.bufferX[var16] = var10 - 1;
               class212.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 - 1][var13 - 1] = 3;
               class212.distances[var12 - 1][var13 - 1] = var21;
            }

            if (var12 < 127 && var13 > 0 && class212.directions[var12 + 1][var13 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               class212.bufferX[var16] = var10 + 1;
               class212.bufferY[var16] = var11 - 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 + 1][var13 - 1] = 9;
               class212.distances[var12 + 1][var13 - 1] = var21;
            }

            if (var12 > 0 && var13 < 127 && class212.directions[var12 - 1][var13 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class212.bufferX[var16] = var10 - 1;
               class212.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 - 1][var13 + 1] = 6;
               class212.distances[var12 - 1][var13 + 1] = var21;
            }

            if (var12 < 127 && var13 < 127 && class212.directions[var12 + 1][var13 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
               class212.bufferX[var16] = var10 + 1;
               class212.bufferY[var16] = var11 + 1;
               var16 = var16 + 1 & 4095;
               class212.directions[var12 + 1][var13 + 1] = 12;
               class212.distances[var12 + 1][var13 + 1] = var21;
            }
         }

         var28 = var29;
      } else if (var2 == 2) {
         var28 = class130.method3028(var0, var1, var3, var4);
      } else {
         var28 = PendingSpawn.method2343(var0, var1, var2, var3, var4);
      }

      var9 = var0 - 64;
      var10 = var1 - 64;
      var11 = class212.field2344;
      var12 = class83.field1035;
      if (!var28) {
         var13 = Integer.MAX_VALUE;
         var14 = Integer.MAX_VALUE;
         byte var31 = 10;
         var16 = var3.approxDestinationX;
         var17 = var3.approxDestinationY;
         int var27 = var3.approxDestinationSizeX;
         var19 = var3.approxDestinationSizeY;

         for(var20 = var16 - var31; var20 <= var16 + var31; ++var20) {
            for(var21 = var17 - var31; var21 <= var31 + var17; ++var21) {
               int var22 = var20 - var9;
               int var23 = var21 - var10;
               if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class212.distances[var22][var23] < 100) {
                  int var24 = 0;
                  if (var20 < var16) {
                     var24 = var16 - var20;
                  } else if (var20 > var16 + var27 - 1) {
                     var24 = var20 - (var27 + var16 - 1);
                  }

                  int var25 = 0;
                  if (var21 < var17) {
                     var25 = var17 - var21;
                  } else if (var21 > var17 + var19 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if (var26 < var13 || var26 == var13 && class212.distances[var22][var23] < var14) {
                     var13 = var26;
                     var14 = class212.distances[var22][var23];
                     var11 = var20;
                     var12 = var21;
                  }
               }
            }
         }

         if (var13 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var11 && var12 == var1) {
         var6[0] = var11;
         var7[0] = var12;
         return 0;
      } else {
         byte var30 = 0;
         class212.bufferX[var30] = var11;
         var13 = var30 + 1;
         class212.bufferY[var30] = var12;

         for(var14 = var15 = class212.directions[var11 - var9][var12 - var10]; var0 != var11 || var12 != var1; var14 = class212.directions[var11 - var9][var12 - var10]) {
            if (var15 != var14) {
               var15 = var14;
               class212.bufferX[var13] = var11;
               class212.bufferY[var13++] = var12;
            }

            if ((var14 & 2) != 0) {
               ++var11;
            } else if ((var14 & 8) != 0) {
               --var11;
            }

            if ((var14 & 1) != 0) {
               ++var12;
            } else if ((var14 & 4) != 0) {
               --var12;
            }
         }

         var16 = 0;

         while(var13-- > 0) {
            var6[var16] = class212.bufferX[var13];
            var7[var16++] = class212.bufferY[var13];
            if (var16 >= var6.length) {
               break;
            }
         }

         return var16;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "-2075076819"
   )
   public static void method208(AbstractArchive var0) {
      FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([Lcz;II[I[II)V",
      garbageValue = "-1922698011"
   )
   @Export("sortWorlds")
   static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var6].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var6].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var6].id;
                     var12 = var8.id;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var5].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var5].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var5].id;
                     var12 = var8.id;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               World var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         sortWorlds(var0, var1, var6, var3, var4);
         sortWorlds(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZB)V",
      garbageValue = "-75"
   )
   @Export("drawLoadingMessage")
   static final void drawLoadingMessage(String var0, boolean var1) {
      if (Client.showLoadingMessages) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class420.fontPlain12.lineWidth(var0, 250);
         int var6 = class420.fontPlain12.lineCount(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215);
         class420.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         class167.method3445(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6);
         if (var1) {
            StudioGame.rasterProvider.drawFull(0, 0);
         } else {
            VarbitComposition.method3769(var3, var4, var5, var6);
         }

      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(Lht;I)V",
      garbageValue = "1869289523"
   )
   static void method201(class207 var0) {
      if (var0 != null && var0.field2284 != null) {
         if (var0.field2284.childIndex >= 0) {
            Widget var1 = WorldMapSection1.getWidget(var0.field2284.parentId);
            if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2284.childIndex >= var1.children.length || var0.field2284 != var1.children[var0.field2284.childIndex]) {
               return;
            }
         }

         if (var0.field2284.type == 11 && var0.field2285 == 0) {
            if (var0.field2284.method6190(var0.field2281, var0.field2282, 0, 0)) {
               switch (var0.field2284.method6111()) {
                  case 0:
                     KeyHandler.openURL(var0.field2284.method6113(), true, false);
                     break;
                  case 1:
                     if (UserComparator5.method2862(ParamComposition.getWidgetFlags(var0.field2284))) {
                        int[] var4 = var0.field2284.method6114();
                        if (var4 != null) {
                           PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher);
                           var2.packetBuffer.writeIntIME(var4[1]);
                           var2.packetBuffer.writeInt(var4[0]);
                           var2.packetBuffer.writeInt(var0.field2284.id);
                           var2.packetBuffer.writeIntME(var4[2]);
                           var2.packetBuffer.writeIntME(var0.field2284.method6121());
                           var2.packetBuffer.writeShort(var0.field2284.childIndex);
                           Client.packetWriter.addNode(var2);
                        }
                     }
               }
            }
         } else if (var0.field2284.type == 12) {
            class310 var3 = var0.field2284.method6118();
            if (var3 != null && var3.method5933()) {
               switch (var0.field2285) {
                  case 0:
                     Client.field713.method4049(var0.field2284);
                     var3.method5891(true);
                     var3.method5856(var0.field2281, var0.field2282, Client.field712.method4074(82), Client.field712.method4074(81));
                     break;
                  case 1:
                     var3.method5857(var0.field2281, var0.field2282);
               }
            }
         }

      }
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "991801272"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class1.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      if (0L != var5) {
         var7 = class1.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (Decimator.method1127(var5)) {
            var10 = var4;
         }

         int[] var11 = class188.sceneMinimapSprite.pixels;
         var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var13 = class279.Entity_unpackID(var5);
         ObjectComposition var14 = WallDecoration.getObjectDefinition(var13);
         if (var14.mapSceneId != -1) {
            IndexedSprite var15 = LoginScreenAnimation.mapSceneSprites[var14.mapSceneId];
            if (var15 != null) {
               int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
               int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
               var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
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

      var5 = class1.scene.getGameObjectTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class1.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class279.Entity_unpackID(var5);
         ObjectComposition var24 = WallDecoration.getObjectDefinition(var10);
         int var19;
         if (var24.mapSceneId != -1) {
            IndexedSprite var20 = LoginScreenAnimation.mapSceneSprites[var24.mapSceneId];
            if (var20 != null) {
               var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
               var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
               var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
            }
         } else if (var9 == 9) {
            var12 = 15658734;
            if (Decimator.method1127(var5)) {
               var12 = 15597568;
            }

            int[] var18 = class188.sceneMinimapSprite.pixels;
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

      var5 = class1.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class279.Entity_unpackID(var5);
         ObjectComposition var21 = WallDecoration.getObjectDefinition(var7);
         if (var21.mapSceneId != -1) {
            IndexedSprite var22 = LoginScreenAnimation.mapSceneSprites[var21.mapSceneId];
            if (var22 != null) {
               var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
               int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
               var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
            }
         }
      }

   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(Ldh;IIII)V",
      garbageValue = "-39008914"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (BuddyRankComparator.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            if (var0.skillLevel == 0) {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + NPC.method2569(var0.combatLevel, BuddyRankComparator.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var5;
            if (Client.isItemSelected == 1) {
               class110.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Canvas.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((class90.selectedSpellFlags & 8) == 8) {
                  class110.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Canvas.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var5 = 7; var5 >= 0; --var5) {
                  if (Client.playerMenuActions[var5] != null) {
                     short var6 = 0;
                     if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
                        if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
                           continue;
                        }

                        if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > BuddyRankComparator.localPlayer.combatLevel) {
                           var6 = 2000;
                        }

                        if (BuddyRankComparator.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == BuddyRankComparator.localPlayer.team) {
                              var6 = 2000;
                           } else {
                              var6 = 0;
                           }
                        } else if (Client.playerAttackOption == AttackOption.field1306 && var0.isClanMember()) {
                           var6 = 2000;
                        }
                     } else if (Client.playerOptionsPriorities[var5]) {
                        var6 = 2000;
                     }

                     boolean var7 = false;
                     int var8 = Client.playerMenuOpcodes[var5] + var6;
                     class110.insertMenuItemNoShift(Client.playerMenuActions[var5], Canvas.colorStartTag(16777215) + var4, var8, var1, var2, var3);
                  }
               }
            }

            for(var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
               if (Client.menuOpcodes[var5] == 23) {
                  Client.menuTargets[var5] = Canvas.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
