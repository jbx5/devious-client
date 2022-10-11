import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class411 implements class416 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lpa;"
   )
   public final class441 field4592;

   @ObfuscatedSignature(
      descriptor = "(Lqn;)V"
   )
   class411(class442 var1) {
      this.field4592 = var1;
   }

   @ObfuscatedSignature(
      descriptor = "(Loi;)V"
   )
   public class411(class412 var1) {
      this(new class442(var1));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1584215817"
   )
   public int method7743(int var1) {
      return this.field4592.vmethod8144(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
      garbageValue = "-1546082096"
   )
   static boolean method7742(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class32.field176.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var3 = class27.method402(class32.field175, var2, new Object[]{(new URL(class32.field175.getCodeBase(), var0)).toString()});
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class27.method398(class32.field175, "loggedout");
         } catch (Throwable var9) {
         }

         try {
            class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
