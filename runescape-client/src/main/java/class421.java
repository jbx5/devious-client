import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class421 {
   @ObfuscatedName("h")
   static final int[] field4615 = new int[16384];
   @ObfuscatedName("j")
   static final int[] field4611 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4615[var2] = (int)(16384.0 * Math.sin((double)var2 * var0));
         field4611[var2] = (int)(16384.0 * Math.cos((double)var2 * var0));
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      garbageValue = "2050490034"
   )
   @Export("RunException_sendStackTrace")
   public static void RunException_sendStackTrace(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               Throwable var4 = var1;
               String var5;
               if (var1 instanceof RunException) {
                  RunException var6 = (RunException)var1;
                  var5 = var6.message + " | ";
                  var4 = var6.throwable;
               } else {
                  var5 = "";
               }

               StringWriter var18 = new StringWriter();
               PrintWriter var7 = new PrintWriter(var18);
               var4.printStackTrace(var7);
               var7.close();
               String var8 = var18.toString();
               BufferedReader var9 = new BufferedReader(new StringReader(var8));
               String var10 = var9.readLine();

               label63:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if (var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label63;
                     }

                     int var12 = var11.indexOf(40);
                     int var13 = var11.indexOf(41, var12 + 1);
                     if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                           var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                           var5 = var5 + var14 + ' ';
                           continue;
                        }

                        var11 = var11.substring(0, var12);
                     }

                     var11 = var11.trim();
                     var11 = var11.substring(var11.lastIndexOf(32) + 1);
                     var11 = var11.substring(var11.lastIndexOf(9) + 1);
                     var5 = var5 + var11 + ' ';
                  }
               }
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
            if (RunException.RunException_applet == null) {
               return;
            }

            URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5018 + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + Buffer.clientType + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
         }

      }
   }
}
