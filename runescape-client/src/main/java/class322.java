import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public class class322 {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ldu;FFFFFFFFI)V",
      garbageValue = "295803656"
   )
   static void method6388(class125 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var0 != null) {
         var0.field1543 = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (0.0 != (double)var11) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if ((double)var11 != 0.0) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var12 * var9;
         float var16 = var13 * var9;
         var0.field1545 = (var16 + var15 - var10 - var10) * var14 / var9;
         var0.field1559 = var14 * (var10 + var10 + var10 - var15 - var15 - var16);
         var0.field1537 = var12;
         var0.field1548 = var5;
      }
   }
}
