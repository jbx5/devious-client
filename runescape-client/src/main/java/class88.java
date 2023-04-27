import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class88 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IILia;Lif;I)Z",
      garbageValue = "1568495332"
   )
   static final boolean method2359(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 64;
      int var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class211.directions[var6][var7] = 99;
      class211.distances[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      class211.bufferX[var10] = var0;
      class211.bufferY[var10++] = var1;
      int[][] var12 = var3.flags;

      while(var11 != var10) {
         var4 = class211.bufferX[var11];
         var5 = class211.bufferY[var11];
         var11 = var11 + 1 & 4095;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.xInset;
         int var14 = var5 - var3.yInset;
         if (var2.hasArrived(1, var4, var5, var3)) {
            class18.field94 = var4;
            class397.field4534 = var5;
            return true;
         }

         int var15 = class211.distances[var6][var7] + 1;
         if (var6 > 0 && class211.directions[var6 - 1][var7] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
            class211.bufferX[var10] = var4 - 1;
            class211.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 - 1][var7] = 2;
            class211.distances[var6 - 1][var7] = var15;
         }

         if (var6 < 127 && class211.directions[var6 + 1][var7] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
            class211.bufferX[var10] = var4 + 1;
            class211.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 + 1][var7] = 8;
            class211.distances[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && class211.directions[var6][var7 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class211.bufferX[var10] = var4;
            class211.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6][var7 - 1] = 1;
            class211.distances[var6][var7 - 1] = var15;
         }

         if (var7 < 127 && class211.directions[var6][var7 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class211.bufferX[var10] = var4;
            class211.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6][var7 + 1] = 4;
            class211.distances[var6][var7 + 1] = var15;
         }

         if (var6 > 0 && var7 > 0 && class211.directions[var6 - 1][var7 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class211.bufferX[var10] = var4 - 1;
            class211.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 - 1][var7 - 1] = 3;
            class211.distances[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && class211.directions[var6 + 1][var7 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class211.bufferX[var10] = var4 + 1;
            class211.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 + 1][var7 - 1] = 9;
            class211.distances[var6 + 1][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 127 && class211.directions[var6 - 1][var7 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class211.bufferX[var10] = var4 - 1;
            class211.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 - 1][var7 + 1] = 6;
            class211.distances[var6 - 1][var7 + 1] = var15;
         }

         if (var6 < 127 && var7 < 127 && class211.directions[var6 + 1][var7 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class211.bufferX[var10] = var4 + 1;
            class211.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class211.directions[var6 + 1][var7 + 1] = 12;
            class211.distances[var6 + 1][var7 + 1] = var15;
         }
      }

      class18.field94 = var4;
      class397.field4534 = var5;
      return false;
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(I)Lrb;",
      garbageValue = "1134308322"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return class126.worldMap;
   }
}
