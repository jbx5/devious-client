import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class166 extends class178 {
   @ObfuscatedName("aj")
   String field1783;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   final class167 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgs;Ljava/lang/String;Ljava/lang/String;)V"
   )
   class166(class167 var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1783 = var3;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "30"
   )
   public int vmethod3513() {
      return 1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "217789139"
   )
   public String vmethod3511() {
      return this.field1783;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1963858223"
   )
   public static void method3383(boolean var0) {
      if (NetCache.NetCache_socket != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.writeByte(var0 ? 2 : 3);
            var1.writeMedium(0);
            NetCache.NetCache_socket.write(var1.array, 0, 4);
         } catch (IOException var4) {
            try {
               NetCache.NetCache_socket.close();
            } catch (Exception var3) {
            }

            ++NetCache.NetCache_ioExceptions;
            NetCache.NetCache_socket = null;
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
      garbageValue = "-29046151"
   )
   static boolean method3376(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class31.field161.startsWith("win")) {
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
            Object var3 = class26.method377(class31.field166, var2, new Object[]{(new URL(class31.field166.getCodeBase(), var0)).toString()});
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class31.field166.getAppletContext().showDocument(new URL(class31.field166.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class26.method374(class31.field166, "loggedout");
         } catch (Throwable var9) {
         }

         try {
            class31.field166.getAppletContext().showDocument(new URL(class31.field166.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "139465166"
   )
   public static long method3384(int var0) {
      return ViewportMouse.ViewportMouse_entityTags[var0];
   }
}
