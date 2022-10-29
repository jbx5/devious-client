import java.awt.FontMetrics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class10 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ler;"
   )
   static ClanSettings field56;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1116853935
   )
   @Export("canvasHeight")
   public static int canvasHeight;
   @ObfuscatedName("ac")
   @Export("loginScreenFontMetrics")
   static FontMetrics loginScreenFontMetrics;
   @ObfuscatedName("a")
   HttpsURLConnection field53;
   @ObfuscatedName("f")
   final Map field59;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpc;"
   )
   class418 field52;
   @ObfuscatedName("x")
   Map field51;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   final class9 field54;
   @ObfuscatedName("j")
   boolean field55 = false;
   @ObfuscatedName("y")
   boolean field50 = false;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1255809723
   )
   int field57 = 300000;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lr;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      if (!var2.method73()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
      } else {
         this.field53 = (HttpsURLConnection)var1.openConnection();
         if (!var3) {
            HttpsURLConnection var4 = this.field53;
            if (class15.field81 == null) {
               class15.field81 = new class15();
            }

            class15 var5 = class15.field81;
            var4.setSSLSocketFactory(var5);
         }

         this.field54 = var2;
         this.field59 = new HashMap();
         this.field51 = new HashMap();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "3"
   )
   public void method79(String var1, String var2) {
      if (!this.field55) {
         this.field59.put(var1, var2);
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1448491896"
   )
   String method80() {
      ArrayList var1 = new ArrayList(this.field51.entrySet());
      Collections.sort(var1, new class18(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class417)var4.getKey()).method7779());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = Float.toString(var5).substring(0, 4);
            var2.append(";q=" + var6);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-894417470"
   )
   void method78() throws ProtocolException {
      if (!this.field55) {
         this.field53.setRequestMethod(this.field54.method70());
         if (!this.field51.isEmpty()) {
            this.field59.put("Accept", this.method80());
         }

         Iterator var1 = this.field59.entrySet().iterator();

         while(var1.hasNext()) {
            Map.Entry var2 = (Map.Entry)var1.next();
            this.field53.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
         }

         if (this.field54.method62() && this.field52 != null) {
            this.field53.setDoOutput(true);
            ByteArrayOutputStream var13 = new ByteArrayOutputStream();

            try {
               var13.write(this.field52.vmethod7797());
               var13.writeTo(this.field53.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               if (var13 != null) {
                  try {
                     var13.close();
                  } catch (IOException var10) {
                     var10.printStackTrace();
                  }
               }

            }
         }

         this.field53.setConnectTimeout(this.field57);
         this.field53.setInstanceFollowRedirects(this.field50);
         this.field55 = true;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "820553438"
   )
   boolean method84() throws IOException, SocketTimeoutException {
      if (!this.field55) {
         this.method78();
      }

      this.field53.connect();
      return this.field53.getResponseCode() == -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Li;",
      garbageValue = "1461670023"
   )
   class21 method83() {
      try {
         if (!this.field55 || this.field53.getResponseCode() == -1) {
            return new class21("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field53.disconnect();
         return new class21("Error decoding REST response code: " + var10.getMessage());
      }

      class21 var1 = null;

      class21 var3;
      try {
         var1 = new class21(this.field53);
         return var1;
      } catch (IOException var8) {
         var3 = new class21("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field53.disconnect();
      }

      return var3;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([Lbt;II[I[II)V",
      garbageValue = "-1552533114"
   )
   @Export("sortWorlds")
   static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var6].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var6].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var6].id;
                     var12 = var8.id;
                  }

                  if (var11 != var12) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var5].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var5].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var5].id;
                     var12 = var8.id;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               World var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         sortWorlds(var0, var1, var6, var3, var4);
         sortWorlds(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "870241653"
   )
   static void method93(int var0) {
      PendingSpawn.tempMenuAction = new MenuAction();
      PendingSpawn.tempMenuAction.param0 = Client.menuArguments1[var0];
      PendingSpawn.tempMenuAction.param1 = Client.menuArguments2[var0];
      PendingSpawn.tempMenuAction.opcode = Client.menuOpcodes[var0];
      PendingSpawn.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      PendingSpawn.tempMenuAction.itemId = Client.menuItemIds[var0];
      PendingSpawn.tempMenuAction.action = Client.menuActions[var0];
      PendingSpawn.tempMenuAction.target = Client.menuTargets[var0];
   }
}
