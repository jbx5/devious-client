import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class72 {
   @ObfuscatedName("ax")
   static final BigInteger field890 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("ap")
   static final BigInteger field891 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FI)I",
      garbageValue = "-11306176"
   )
   public static int method2044(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class125.field1463;
      if (var7 <= var24) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = var0[var10] * (1.0F / var7);
         }

         while(Math.abs(var9[var1]) < var24) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24;
            boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0];
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            class440 var11 = new class440(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var21 = new float[var1 + 1];
            int var14 = method2044(var12, var1 - 1, var2, false, var4, false, var21);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = FriendLoginUpdate.method7784(var9, var1, var2);
                     if (Math.abs(var18) <= var24 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var21[var20];
                  }

                  var17 = FriendLoginUpdate.method7784(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var24) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = AbstractArchive.method6743(var11, var16, var19, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
                        var6[var10 - 2] = 0.5F * (var6[var10 - 2] + var6[var10 - 1]);
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Leq;FZB)F",
      garbageValue = "-113"
   )
   static float method2050(class129 var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method2981() != 0) {
         float var4 = (float)var0.field1510[0].field1457;
         float var5 = (float)var0.field1510[var0.method2981() - 1].field1457;
         float var6 = var5 - var4;
         if ((double)var6 == 0.0) {
            return var0.field1510[0].field1455;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            double var8 = (double)((int)var7);
            float var10 = Math.abs((float)((double)var7 - var8));
            float var11 = var10 * var6;
            var8 = Math.abs(1.0 + var8);
            double var12 = var8 / 2.0;
            double var14 = (double)((int)var12);
            var10 = (float)(var12 - var14);
            float var16;
            float var17;
            if (var2) {
               if (var0.field1506 == class127.field1491) {
                  if ((double)var10 != 0.0) {
                     var11 += var4;
                  } else {
                     var11 = var5 - var11;
                  }
               } else if (var0.field1506 != class127.field1487 && var0.field1506 != class127.field1488) {
                  if (var0.field1506 == class127.field1486) {
                     var11 = var4 - var1;
                     var16 = var0.field1510[0].field1456;
                     var17 = var0.field1510[0].field1461;
                     var3 = var0.field1510[0].field1455;
                     if (0.0 != (double)var16) {
                        var3 -= var11 * var17 / var16;
                     }

                     return var3;
                  }
               } else {
                  var11 = var5 - var11;
               }
            } else if (var0.field1507 == class127.field1491) {
               if (0.0 != (double)var10) {
                  var11 = var5 - var11;
               } else {
                  var11 += var4;
               }
            } else if (var0.field1507 != class127.field1487 && var0.field1507 != class127.field1488) {
               if (var0.field1507 == class127.field1486) {
                  var11 = var1 - var5;
                  var16 = var0.field1510[var0.method2981() - 1].field1458;
                  var17 = var0.field1510[var0.method2981() - 1].field1459;
                  var3 = var0.field1510[var0.method2981() - 1].field1455;
                  if (0.0 != (double)var16) {
                     var3 += var17 * var11 / var16;
                  }

                  return var3;
               }
            } else {
               var11 += var4;
            }

            var3 = class130.method3002(var0, var11);
            float var18;
            if (var2 && var0.field1506 == class127.field1488) {
               var18 = var0.field1510[var0.method2981() - 1].field1455 - var0.field1510[0].field1455;
               var3 = (float)((double)var3 - var8 * (double)var18);
            } else if (!var2 && var0.field1507 == class127.field1488) {
               var18 = var0.field1510[var0.method2981() - 1].field1455 - var0.field1510[0].field1455;
               var3 = (float)((double)var3 + (double)var18 * var8);
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltl;II)V",
      garbageValue = "-1616435394"
   )
   @Export("readPlayerUpdate")
   static void readPlayerUpdate(PacketBuffer var0, int var1) {
      boolean var2 = var0.readBits(1) == 1;
      if (var2) {
         Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
      }

      int var3 = var0.readBits(2);
      Player var4 = Client.players[var1];
      if (var3 == 0) {
         if (var2) {
            var4.field1124 = false;
         } else if (Client.localPlayerIndex == var1) {
            throw new RuntimeException();
         } else {
            Players.Players_regions[var1] = (var4.plane << 28) + (class213.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class101.baseY * 64 + var4.pathY[0] >> 13);
            if (var4.field1228 != -1) {
               Players.Players_orientations[var1] = var4.field1228;
            } else {
               Players.Players_orientations[var1] = var4.orientation;
            }

            Players.Players_targetIndices[var1] = var4.targetIndex;
            Client.players[var1] = null;
            if (var0.readBits(1) != 0) {
               UserComparator7.updateExternalPlayer(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if (var3 == 1) {
            var5 = var0.readBits(3);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               --var6;
               --var7;
            } else if (var5 == 1) {
               --var7;
            } else if (var5 == 2) {
               ++var6;
               --var7;
            } else if (var5 == 3) {
               --var6;
            } else if (var5 == 4) {
               ++var6;
            } else if (var5 == 5) {
               --var6;
               ++var7;
            } else if (var5 == 6) {
               ++var7;
            } else if (var5 == 7) {
               ++var6;
               ++var7;
            }

            if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.resetPath(var6, var7);
               var4.field1124 = false;
            } else if (var2) {
               var4.field1124 = true;
               var4.tileX = var6;
               var4.tileY = var7;
            } else {
               var4.field1124 = false;
               var4.method2301(var6, var7, Players.field1328[var1]);
            }

         } else if (var3 == 2) {
            var5 = var0.readBits(4);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if (var5 == 1) {
               --var6;
               var7 -= 2;
            } else if (var5 == 2) {
               var7 -= 2;
            } else if (var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if (var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if (var5 == 5) {
               var6 -= 2;
               --var7;
            } else if (var5 == 6) {
               var6 += 2;
               --var7;
            } else if (var5 == 7) {
               var6 -= 2;
            } else if (var5 == 8) {
               var6 += 2;
            } else if (var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if (var5 == 10) {
               var6 += 2;
               ++var7;
            } else if (var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if (var5 == 12) {
               --var6;
               var7 += 2;
            } else if (var5 == 13) {
               var7 += 2;
            } else if (var5 == 14) {
               ++var6;
               var7 += 2;
            } else if (var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.resetPath(var6, var7);
               var4.field1124 = false;
            } else if (var2) {
               var4.field1124 = true;
               var4.tileX = var6;
               var4.tileY = var7;
            } else {
               var4.field1124 = false;
               var4.method2301(var6, var7, Players.field1328[var1]);
            }

         } else {
            var5 = var0.readBits(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if (var5 == 0) {
               var6 = var0.readBits(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if (var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.pathX[0];
               var11 = var9 + var4.pathY[0];
               if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.resetPath(var10, var11);
                  var4.field1124 = false;
               } else if (var2) {
                  var4.field1124 = true;
                  var4.tileX = var10;
                  var4.tileY = var11;
               } else {
                  var4.field1124 = false;
                  var4.method2301(var10, var11, Players.field1328[var1]);
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  Clock.Client_plane = var4.plane;
               }

            } else {
               var6 = var0.readBits(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (class213.baseX * 64 + var8 + var4.pathX[0] & 16383) - class213.baseX * 64;
               var11 = (class101.baseY * 64 + var9 + var4.pathY[0] & 16383) - class101.baseY * 64;
               if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.resetPath(var10, var11);
                  var4.field1124 = false;
               } else if (var2) {
                  var4.field1124 = true;
                  var4.tileX = var10;
                  var4.tileY = var11;
               } else {
                  var4.field1124 = false;
                  var4.method2301(var10, var11, Players.field1328[var1]);
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  Clock.Client_plane = var4.plane;
               }

            }
         }
      }
   }
}
