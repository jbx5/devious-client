import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public enum class132 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   field1624(2, 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   field1629(4, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   field1625(0, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   field1626(3, 3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   field1628(1, 4);

   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2018184127
   )
   public final int field1627;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1796142361
   )
   @Export("id")
   final int id;

   class132(int var3, int var4) {
      this.field1627 = var3;
      this.id = var4;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      garbageValue = "1018084003"
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

               label61:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if (var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label61;
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
            if (class422.RunException_applet == null) {
               return;
            }

            URL var3 = new URL(class422.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5065 + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
         }

      }
   }
}
