import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class387 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "8"
   )
   @Export("RunException_sendStackTrace")
   public static void RunException_sendStackTrace(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               var2 = class210.method4292(var1);
            }

            if (var0 != null) {
               if (var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if (class100.RunException_applet == null) {
               return;
            }

            URL var3 = new URL(class100.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class441.field4731 + "&u=" + RunException.field5158 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
            DataInputStream var4 = new DataInputStream(var3.openStream());
            var4.read();
            var4.close();
         } catch (Exception var5) {
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "-59"
   )
   static final int method7599(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }
}
