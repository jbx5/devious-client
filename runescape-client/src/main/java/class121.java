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

@ObfuscatedName("ds")
public class class121 {
   @ObfuscatedName("s")
   public static final float field1479 = Math.ulp(1.0F);
   @ObfuscatedName("z")
   public static final float field1480;
   @ObfuscatedName("j")
   static float[] field1477;
   @ObfuscatedName("i")
   static float[] field1485;
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = 615912493
   )
   static int field1483;

   static {
      field1480 = 2.0F * field1479;
      field1477 = new float[4];
      field1485 = new float[5];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "-15"
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
            if (RunException.RunException_applet == null) {
               return;
            }

            URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5089 + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "([BIIII[Lgv;I)V",
      garbageValue = "-1428016323"
   )
   static final void method2992(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
                  int[] var10000 = var5[var6].flags[var7 + var1];
                  var10000[var8 + var2] &= -16777217;
               }
            }
         }
      }

      Buffer var12 = new Buffer(var0);

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = var8 + var1;
               int var11 = var9 + var2;
               class427.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0);
            }
         }
      }

   }

   @ObfuscatedName("i")
   public static int method2987(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
