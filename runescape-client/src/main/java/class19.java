import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class19 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1331663105
   )
   @Export("pcmSampleLength")
   public static int pcmSampleLength;
   @ObfuscatedName("a")
   Future field105;
   @ObfuscatedName("f")
   String field103;

   class19(Future var1) {
      this.field105 = var1;
   }

   class19(String var1) {
      this.method271(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-5"
   )
   void method271(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field103 = var1;
      if (this.field105 != null) {
         this.field105.cancel(true);
         this.field105 = null;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-484632623"
   )
   public final String method277() {
      return this.field103;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "13"
   )
   public boolean method285() {
      return this.field103 != null || this.field105 == null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1019253670"
   )
   public final boolean method273() {
      return this.method285() ? true : this.field105.isDone();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Li;",
      garbageValue = "81"
   )
   public final class21 method274() {
      if (this.method285()) {
         return new class21(this.field103);
      } else if (!this.method273()) {
         return null;
      } else {
         try {
            return (class21)this.field105.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method271(var2);
            return new class21(var2);
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrx;"
   )
   @Export("newRunException")
   public static RunException newRunException(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZI)I",
      garbageValue = "-2003159676"
   )
   public static int method286(CharSequence var0, int var1, boolean var2) {
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
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
