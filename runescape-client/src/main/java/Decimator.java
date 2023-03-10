import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Decimator")
public class Decimator {
   @ObfuscatedName("aq")
   @Export("Tiles_underlays2")
   static byte[][][] Tiles_underlays2;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1441139311
   )
   @Export("inputRate")
   int inputRate;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1644975557
   )
   @Export("outputRate")
   int outputRate;
   @ObfuscatedName("ao")
   @Export("table")
   int[][] table;

   public Decimator(int var1, int var2) {
      if (var2 != var1) {
         int var3 = Client.method1780(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.inputRate = var1;
         this.outputRate = var2;
         this.table = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.table[var4];
            double var6 = 6.0 + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0 + (var6 - 7.0));
            if (var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(var6 + 7.0);
            if (var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = ((double)var8 - var6) * Math.PI;
               double var14 = var10;
               if (var12 < -1.0E-4 || var12 > 1.0E-4) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54 + 0.46 * Math.cos(((double)var8 - var6) * 0.2243994752564138);
               var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
            }
         }

      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "581070602"
   )
   @Export("resample")
   byte[] resample(byte[] var1) {
      if (this.table != null) {
         int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         int var7;
         for(var6 = 0; var6 < var1.length; ++var6) {
            var7 = var1[var6];
            int[] var8 = this.table[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var8[var9] * var7;
            }

            var5 += this.outputRate;
            var9 = var5 / this.inputRate;
            var4 += var9;
            var5 -= var9 * this.inputRate;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var3[var6] + '耀' >> 16;
            if (var7 < -128) {
               var1[var6] = -128;
            } else if (var7 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var7;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1978966471"
   )
   @Export("scaleRate")
   int scaleRate(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
      }

      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "122"
   )
   @Export("scalePosition")
   int scalePosition(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
      }

      return var1;
   }

   @ObfuscatedName("al")
   public static boolean method1127(long var0) {
      return var0 != 0L && !ClanSettings.method3197(var0);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "-1641012787"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BIIII[Liz;B)V",
      garbageValue = "75"
   )
   static final void method1125(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  int[] var10000 = var5[var6].flags[var7 + var1];
                  var10000[var8 + var2] &= -16777217;
               }
            }
         }
      }

      Buffer var12 = new Buffer(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = var8 + var1;
               int var11 = var9 + var2;
               WorldMapScaleHandler.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0);
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "421048908"
   )
   static int method1114() {
      return Login.loginIndex;
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-617298505"
   )
   static final void method1120() {
      if (PlayerCompositionColorTextureOverride.field1875) {
         class174.method3493();
         PlayerCompositionColorTextureOverride.field1875 = false;
      }

   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)V",
      garbageValue = "-2138006752"
   )
   static final void method1124(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         var10.field1133 = -1;
         class27.method383(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1135 = var4;
      var10.field1132 = var5;
      var10.field1131 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2344(var7);
   }
}
