import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
   @ObfuscatedName("m")
   @Export("cacheName")
   String cacheName;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("archive")
   AbstractArchive archive;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -646591499
   )
   @Export("percentLoaded")
   int percentLoaded = 0;
   @ObfuscatedName("r")
   @Export("loaded")
   boolean loaded = false;

   @ObfuscatedSignature(
      descriptor = "(Lly;)V"
   )
   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "27"
   )
   @Export("reset")
   void reset(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.cacheName) {
            this.cacheName = var1;
            this.percentLoaded = 0;
            this.loaded = false;
            this.load();
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-811133174"
   )
   @Export("load")
   int load() {
      if (this.percentLoaded < 33) {
         if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3005.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 33;
      }

      if (this.percentLoaded == 33) {
         if (this.archive.isValidFileName(WorldMapCacheName.field3009.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3009.name, this.cacheName)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 66;
      }

      if (this.percentLoaded == 66) {
         if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3004.name)) {
            return this.percentLoaded;
         }

         this.percentLoaded = 100;
         this.loaded = true;
      }

      return this.percentLoaded;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-878428886"
   )
   @Export("isLoaded")
   boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "995068163"
   )
   @Export("getPercentLoaded")
   int getPercentLoaded() {
      return this.percentLoaded;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FB)I",
      garbageValue = "4"
   )
   public static int method7986(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class122.field1506;
      if (var7 <= var24) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var24) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var24 + var6[0] : var2 < var6[0] - var24;
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
            class412 var11 = new class412(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var21 = new float[var1 + 1];
            int var14 = method7986(var12, var1 - 1, var2, false, var4, false, var21);
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
                     var18 = SecureRandomFuture.method2120(var9, var1, var2);
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

                  var17 = SecureRandomFuture.method2120(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var24) {
                     if (var20 != var14 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = DefaultsGroup.method7714(var11, var16, var19, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }
}
