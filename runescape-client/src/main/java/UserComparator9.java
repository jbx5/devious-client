import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator9(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;I)I",
      garbageValue = "150312401"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world && var2.world == Client.worldId) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-798861149"
   )
   static void method2933() {
      if (class441.field4729 == null) {
         class441.field4729 = new int[65536];
         double var0 = 0.949999988079071;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125 + (double)(var2 >> 10 & 63) / 64.0;
            double var5 = (double)(var2 >> 7 & 7) / 8.0 + 0.0625;
            double var7 = (double)(var2 & 127) / 128.0;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0) {
               double var15;
               if (var7 < 0.5) {
                  var15 = var7 * (1.0 + var5);
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = var7 * 2.0 - var15;
               double var19 = 0.3333333333333333 + var3;
               if (var19 > 1.0) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333;
               if (var23 < 0.0) {
                  ++var23;
               }

               if (6.0 * var19 < 1.0) {
                  var9 = var17 + var19 * 6.0 * (var15 - var17);
               } else if (var19 * 2.0 < 1.0) {
                  var9 = var15;
               } else if (3.0 * var19 < 2.0) {
                  var9 = var17 + 6.0 * (var15 - var17) * (0.6666666666666666 - var19);
               } else {
                  var9 = var17;
               }

               if (6.0 * var3 < 1.0) {
                  var11 = 6.0 * (var15 - var17) * var3 + var17;
               } else if (2.0 * var3 < 1.0) {
                  var11 = var15;
               } else if (3.0 * var3 < 2.0) {
                  var11 = (var15 - var17) * (0.6666666666666666 - var3) * 6.0 + var17;
               } else {
                  var11 = var17;
               }

               if (var23 * 6.0 < 1.0) {
                  var13 = var23 * 6.0 * (var15 - var17) + var17;
               } else if (var23 * 2.0 < 1.0) {
                  var13 = var15;
               } else if (3.0 * var23 < 2.0) {
                  var13 = 6.0 * (0.6666666666666666 - var23) * (var15 - var17) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(256.0 * var9);
            int var16 = (int)(var11 * 256.0);
            int var26 = (int)(var13 * 256.0);
            int var18 = var26 + (var16 << 8) + (var25 << 16);
            class441.field4729[var2] = var18 & 16777215;
         }

      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)Lec;",
      garbageValue = "-500821406"
   )
   static class127 method2940(int var0) {
      class127 var1 = (class127)StructComposition.findEnumerated(class121.method2989(), var0);
      if (var1 == null) {
         var1 = class127.field1545;
      }

      return var1;
   }
}
