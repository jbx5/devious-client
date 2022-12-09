import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class456 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   public static final class456 field4874 = new class456(0, 0, Integer.class, new class453());
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   public static final class456 field4870 = new class456(2, 1, Long.class, new class455());
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   public static final class456 field4871 = new class456(1, 2, String.class, new class457());
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1157568029
   )
   public final int field4872;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 984459831
   )
   public final int field4876;
   @ObfuscatedName("q")
   public final Class field4875;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   final class452 field4869;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/Class;Lqu;)V"
   )
   class456(int var1, int var2, Class var3, class452 var4) {
      this.field4872 = var1;
      this.field4876 = var2;
      this.field4875 = var3;
      this.field4869 = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4876;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Ljava/lang/Object;",
      garbageValue = "-667358219"
   )
   public Object method8396(Buffer var1) {
      return this.field4869.vmethod8414(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(S)[Lqr;",
      garbageValue = "155"
   )
   public static class456[] method8407() {
      return new class456[]{field4874, field4870, field4871};
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-107"
   )
   static String method8410(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IILgg;Lgw;I)Z",
      garbageValue = "-2047038701"
   )
   static final boolean method8411(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
      int var4 = var0;
      int var5 = var1;
      int var6 = 64;
      int var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class205.directions[var6][var7] = 99;
      class205.distances[var6][var7] = 0;
      int var10 = 0;
      int var11 = 0;
      class205.bufferX[var10] = var0;
      class205.bufferY[var10++] = var1;
      int[][] var12 = var3.flags;

      while(var10 != var11) {
         var4 = class205.bufferX[var11];
         var5 = class205.bufferY[var11];
         var11 = var11 + 1 & 4095;
         var6 = var4 - var8;
         var7 = var5 - var9;
         int var13 = var4 - var3.xInset;
         int var14 = var5 - var3.yInset;
         if (var2.hasArrived(1, var4, var5, var3)) {
            class205.field2359 = var4;
            class205.field2364 = var5;
            return true;
         }

         int var15 = class205.distances[var6][var7] + 1;
         if (var6 > 0 && class205.directions[var6 - 1][var7] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
            class205.bufferX[var10] = var4 - 1;
            class205.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 - 1][var7] = 2;
            class205.distances[var6 - 1][var7] = var15;
         }

         if (var6 < 127 && class205.directions[var6 + 1][var7] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
            class205.bufferX[var10] = var4 + 1;
            class205.bufferY[var10] = var5;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 + 1][var7] = 8;
            class205.distances[var6 + 1][var7] = var15;
         }

         if (var7 > 0 && class205.directions[var6][var7 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class205.bufferX[var10] = var4;
            class205.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6][var7 - 1] = 1;
            class205.distances[var6][var7 - 1] = var15;
         }

         if (var7 < 127 && class205.directions[var6][var7 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class205.bufferX[var10] = var4;
            class205.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6][var7 + 1] = 4;
            class205.distances[var6][var7 + 1] = var15;
         }

         if (var6 > 0 && var7 > 0 && class205.directions[var6 - 1][var7 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class205.bufferX[var10] = var4 - 1;
            class205.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 - 1][var7 - 1] = 3;
            class205.distances[var6 - 1][var7 - 1] = var15;
         }

         if (var6 < 127 && var7 > 0 && class205.directions[var6 + 1][var7 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
            class205.bufferX[var10] = var4 + 1;
            class205.bufferY[var10] = var5 - 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 + 1][var7 - 1] = 9;
            class205.distances[var6 + 1][var7 - 1] = var15;
         }

         if (var6 > 0 && var7 < 127 && class205.directions[var6 - 1][var7 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class205.bufferX[var10] = var4 - 1;
            class205.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 - 1][var7 + 1] = 6;
            class205.distances[var6 - 1][var7 + 1] = var15;
         }

         if (var6 < 127 && var7 < 127 && class205.directions[var6 + 1][var7 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
            class205.bufferX[var10] = var4 + 1;
            class205.bufferY[var10] = var5 + 1;
            var10 = var10 + 1 & 4095;
            class205.directions[var6 + 1][var7 + 1] = 12;
            class205.distances[var6 + 1][var7 + 1] = var15;
         }
      }

      class205.field2359 = var4;
      class205.field2364 = var5;
      return false;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;B)Lqr;",
      garbageValue = "56"
   )
   public static class456 method8394(Class var0) {
      class456[] var1 = method8407();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class456 var3 = var1[var2];
         if (var3.field4875 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqy;I)V",
      garbageValue = "383102179"
   )
   public static void method8395(Object var0, Buffer var1) {
      class452 var2 = method8408(var0.getClass());
      var2.vmethod8422(var0, var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;B)Lqu;",
      garbageValue = "-2"
   )
   static class452 method8408(Class var0) {
      class456 var1 = method8394(var0);
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return var1.field4869;
      }
   }
}
