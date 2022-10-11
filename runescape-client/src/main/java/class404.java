import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class404 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ldb;FZI)F",
      garbageValue = "1955665606"
   )
   static float method7600(class124 var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method2880() != 0) {
         float var4 = (float)var0.field1493[0].field1441;
         float var5 = (float)var0.field1493[var0.method2880() - 1].field1441;
         float var6 = var5 - var4;
         if ((double)var6 == 0.0) {
            return var0.field1493[0].field1438;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            double var8 = (double)((int)var7);
            float var10 = Math.abs((float)((double)var7 - var8));
            float var11 = var6 * var10;
            var8 = Math.abs(var8 + 1.0);
            double var12 = var8 / 2.0;
            double var14 = (double)((int)var12);
            var10 = (float)(var12 - var14);
            float var16;
            float var17;
            if (var2) {
               if (var0.field1490 == class123.field1472) {
                  if ((double)var10 != 0.0) {
                     var11 += var4;
                  } else {
                     var11 = var5 - var11;
                  }
               } else if (var0.field1490 != class123.field1474 && var0.field1490 != class123.field1473) {
                  if (var0.field1490 == class123.field1471) {
                     var11 = var4 - var1;
                     var16 = var0.field1493[0].field1440;
                     var17 = var0.field1493[0].field1439;
                     var3 = var0.field1493[0].field1438;
                     if ((double)var16 != 0.0) {
                        var3 -= var11 * var17 / var16;
                     }

                     return var3;
                  }
               } else {
                  var11 = var5 - var11;
               }
            } else if (var0.field1489 == class123.field1472) {
               if ((double)var10 != 0.0) {
                  var11 = var5 - var11;
               } else {
                  var11 += var4;
               }
            } else if (var0.field1489 != class123.field1474 && var0.field1489 != class123.field1473) {
               if (var0.field1489 == class123.field1471) {
                  var11 = var1 - var5;
                  var16 = var0.field1493[var0.method2880() - 1].field1442;
                  var17 = var0.field1493[var0.method2880() - 1].field1443;
                  var3 = var0.field1493[var0.method2880() - 1].field1438;
                  if (0.0 != (double)var16) {
                     var3 += var11 * var17 / var16;
                  }

                  return var3;
               }
            } else {
               var11 += var4;
            }

            var3 = class132.method2966(var0, var11);
            float var18;
            if (var2 && var0.field1490 == class123.field1473) {
               var18 = var0.field1493[var0.method2880() - 1].field1438 - var0.field1493[0].field1438;
               var3 = (float)((double)var3 - (double)var18 * var8);
            } else if (!var2 && var0.field1489 == class123.field1473) {
               var18 = var0.field1493[var0.method2880() - 1].field1438 - var0.field1493[0].field1438;
               var3 = (float)((double)var3 + var8 * (double)var18);
            }

            return var3;
         }
      } else {
         return var3;
      }
   }
}
