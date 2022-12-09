import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("uw")
   @ObfuscatedSignature(
      descriptor = "Lbi;"
   )
   @Export("friendSystem")
   public static FriendSystem friendSystem;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Loo;"
   )
   static final DefaultsGroup field4578 = new DefaultsGroup(3);
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 107189111
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Loz;FFFI)F",
      garbageValue = "-2105001824"
   )
   static float method7714(class412 var0, float var1, float var2, float var3) {
      float var4 = SecureRandomFuture.method2120(var0.field4630, var0.field4632, var1);
      if (Math.abs(var4) < class122.field1506) {
         return var1;
      } else {
         float var5 = SecureRandomFuture.method2120(var0.field4630, var0.field4632, var2);
         if (Math.abs(var5) < class122.field1506) {
            return var2;
         } else {
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            float var13 = 0.0F;
            boolean var14 = true;
            boolean var15 = false;

            do {
               var15 = false;
               if (var14) {
                  var6 = var1;
                  var13 = var4;
                  var7 = var2 - var1;
                  var8 = var7;
                  var14 = false;
               }

               if (Math.abs(var13) < Math.abs(var5)) {
                  var1 = var2;
                  var2 = var6;
                  var6 = var1;
                  var4 = var5;
                  var5 = var13;
                  var13 = var4;
               }

               float var16 = class122.field1507 * Math.abs(var2) + var3 * 0.5F;
               float var17 = 0.5F * (var6 - var2);
               boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
               if (var18) {
                  if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
                     float var12 = var5 / var4;
                     float var9;
                     float var10;
                     if (var6 == var1) {
                        var9 = 2.0F * var17 * var12;
                        var10 = 1.0F - var12;
                     } else {
                        var10 = var4 / var13;
                        float var11 = var5 / var13;
                        var9 = var12 * (var17 * 2.0F * var10 * (var10 - var11) - (var2 - var1) * (var11 - 1.0F));
                        var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
                     }

                     if ((double)var9 > 0.0) {
                        var10 = -var10;
                     } else {
                        var9 = -var9;
                     }

                     var12 = var8;
                     var8 = var7;
                     if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) {
                        var7 = var9 / var10;
                     } else {
                        var7 = var17;
                        var8 = var17;
                     }
                  } else {
                     var7 = var17;
                     var8 = var17;
                  }

                  var1 = var2;
                  var4 = var5;
                  if (Math.abs(var7) > var16) {
                     var2 += var7;
                  } else if ((double)var17 > 0.0) {
                     var2 += var16;
                  } else {
                     var2 -= var16;
                  }

                  var5 = SecureRandomFuture.method2120(var0.field4630, var0.field4632, var2);
                  if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0) {
                     var14 = true;
                     var15 = true;
                  } else {
                     var15 = true;
                  }
               }
            } while(var15);

            return var2;
         }
      }
   }
}
