import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("f")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -20630993
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("b")
   static boolean field1381;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lda;FZI)F",
      garbageValue = "-2108882173"
   )
   static float method2821(class125 var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method3060() != 0) {
         float var4 = (float)var0.field1524[0].field1474;
         float var5 = (float)var0.field1524[var0.method3060() - 1].field1474;
         float var6 = var5 - var4;
         if ((double)var6 == 0.0) {
            return var0.field1524[0].field1467;
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
               if (var0.field1522 == class123.field1505) {
                  if ((double)var10 != 0.0) {
                     var11 += var4;
                  } else {
                     var11 = var5 - var11;
                  }
               } else if (var0.field1522 != class123.field1503 && var0.field1522 != class123.field1506) {
                  if (var0.field1522 == class123.field1504) {
                     var11 = var4 - var1;
                     var16 = var0.field1524[0].field1469;
                     var17 = var0.field1524[0].field1470;
                     var3 = var0.field1524[0].field1467;
                     if (0.0 != (double)var16) {
                        var3 -= var17 * var11 / var16;
                     }

                     return var3;
                  }
               } else {
                  var11 = var5 - var11;
               }
            } else if (var0.field1541 == class123.field1505) {
               if (0.0 != (double)var10) {
                  var11 = var5 - var11;
               } else {
                  var11 += var4;
               }
            } else if (var0.field1541 != class123.field1503 && var0.field1541 != class123.field1506) {
               if (var0.field1541 == class123.field1504) {
                  var11 = var1 - var5;
                  var16 = var0.field1524[var0.method3060() - 1].field1473;
                  var17 = var0.field1524[var0.method3060() - 1].field1472;
                  var3 = var0.field1524[var0.method3060() - 1].field1467;
                  if (0.0 != (double)var16) {
                     var3 += var17 * var11 / var16;
                  }

                  return var3;
               }
            } else {
               var11 += var4;
            }

            var3 = UrlRequester.method2874(var0, var11);
            float var18;
            if (var2 && var0.field1522 == class123.field1506) {
               var18 = var0.field1524[var0.method3060() - 1].field1467 - var0.field1524[0].field1467;
               var3 = (float)((double)var3 - var8 * (double)var18);
            } else if (!var2 && var0.field1541 == class123.field1506) {
               var18 = var0.field1524[var0.method3060() - 1].field1467 - var0.field1524[0].field1467;
               var3 = (float)((double)var3 + var8 * (double)var18);
            }

            return var3;
         }
      } else {
         return var3;
      }
   }
}
