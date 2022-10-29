import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class376 {
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   static StudioGame field4411;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FB)I",
      garbageValue = "121"
   )
   public static int method7196(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class121.field1454;
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
            boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24;
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
            class409 var11 = new class409(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = var9[var13] * (float)var13;
            }

            float[] var21 = new float[var1 + 1];
            int var14 = method7196(var12, var1 - 1, var2, false, var4, false, var21);
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
                     var18 = class1.method8(var9, var1, var2);
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

                  var17 = class1.method8(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var24) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = class406.method7618(var11, var16, var19, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
                        var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1392553380"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      UserComparator4.method2738();
      class139.scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      Client.field734.method3933();
      System.gc();
      class283.musicPlayerStatus = 1;
      DevicePcmPlayerProvider.musicTrackArchive = null;
      class283.musicTrackGroupId = -1;
      class283.musicTrackFileId = -1;
      Messages.musicTrackVolume = 0;
      GrandExchangeEvents.musicTrackBoolean = false;
      class19.pcmSampleLength = 2;
      Client.currentTrackGroupId = -1;
      Client.playingJingle = false;
      class87.method2257();
      class21.updateGameState(10);
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1722772442"
   )
   @Export("forceDisconnect")
   static final void forceDisconnect(int var0) {
      logOut();
      switch (var0) {
         case 1:
            class11.method102();
            break;
         case 2:
            class13.method169();
      }

   }
}
