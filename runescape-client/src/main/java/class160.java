import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class160 extends class142 {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -249747583
   )
   @Export("RunException_revision")
   public static int RunException_revision;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1877537383
   )
   int field1753;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1700119723
   )
   int field1751;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class160(class145 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1753 = var1.readInt();
      this.field1751 = var1.readInt();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3203(this.field1753, this.field1751);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZB)Z",
      garbageValue = "125"
   )
   static boolean method3324(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
