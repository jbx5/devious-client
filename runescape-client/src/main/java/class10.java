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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
public class class10 {
   @ObfuscatedName("h")
   HttpsURLConnection field53;
   @ObfuscatedName("e")
   final Map field49;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   class421 field50;
   @ObfuscatedName("x")
   Map field57;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   final class9 field48;
   @ObfuscatedName("q")
   boolean field51 = false;
   @ObfuscatedName("f")
   boolean field54 = false;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 315851455
   )
   int field55 = 300000;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lb;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      if (!var2.method69()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
      } else {
         this.field53 = (HttpsURLConnection)var1.openConnection();
         if (!var3) {
            HttpsURLConnection var4 = this.field53;
            if (class15.field90 == null) {
               class15.field90 = new class15();
            }

            class15 var5 = class15.field90;
            var4.setSSLSocketFactory(var5);
         }

         this.field48 = var2;
         this.field49 = new HashMap();
         this.field57 = new HashMap();
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-825590030"
   )
   public void method86(String var1, String var2) {
      if (!this.field51) {
         this.field49.put(var1, var2);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-953268261"
   )
   String method84() {
      ArrayList var1 = new ArrayList(this.field57.entrySet());
      Collections.sort(var1, new class18(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class420)var4.getKey()).method7905());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = Float.toString(var5).substring(0, 4);
            var2.append(";q=" + var6);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1499670769"
   )
   void method87() throws ProtocolException {
      if (!this.field51) {
         this.field53.setRequestMethod(this.field48.method70());
         if (!this.field57.isEmpty()) {
            this.field49.put("Accept", this.method84());
         }

         Iterator var1 = this.field49.entrySet().iterator();

         while(var1.hasNext()) {
            Map.Entry var2 = (Map.Entry)var1.next();
            this.field53.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
         }

         if (this.field48.method71() && this.field50 != null) {
            this.field53.setDoOutput(true);
            ByteArrayOutputStream var13 = new ByteArrayOutputStream();

            try {
               var13.write(this.field50.vmethod7924());
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

         this.field53.setConnectTimeout(this.field55);
         this.field53.setInstanceFollowRedirects(this.field54);
         this.field51 = true;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "71873329"
   )
   boolean method88() throws IOException, SocketTimeoutException {
      if (!this.field51) {
         this.method87();
      }

      this.field53.connect();
      return this.field53.getResponseCode() == -1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)Lp;",
      garbageValue = "39"
   )
   class21 method89() {
      try {
         if (!this.field51 || this.field53.getResponseCode() == -1) {
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-609690388"
   )
   static int method100(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         class87.Interpreter_intStackSize -= 2;
         Client.field778 = (short)AttackOption.method2610(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]);
         if (Client.field778 <= 0) {
            Client.field778 = 256;
         }

         Client.field550 = (short)AttackOption.method2610(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
         if (Client.field550 <= 0) {
            Client.field550 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         class87.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         class87.Interpreter_intStackSize -= 4;
         Client.field690 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
         if (Client.field690 <= 0) {
            Client.field690 = 1;
         }

         Client.field783 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
         if (Client.field783 <= 0) {
            Client.field783 = 32767;
         } else if (Client.field783 < Client.field690) {
            Client.field783 = Client.field690;
         }

         Client.field784 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
         if (Client.field784 <= 0) {
            Client.field784 = 1;
         }

         Client.field510 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3];
         if (Client.field510 <= 0) {
            Client.field510 = 32767;
         } else if (Client.field510 < Client.field784) {
            Client.field510 = Client.field784;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            class143.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeEvents.method6569(Client.field778);
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeEvents.method6569(Client.field550);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = CollisionMap.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Language.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
