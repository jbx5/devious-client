import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class10 {
   @ObfuscatedName("vn")
   @ObfuscatedSignature(
      descriptor = "Ldy;"
   )
   @Export("clientPreferences")
   static ClientPreferences clientPreferences;
   @ObfuscatedName("at")
   final HttpsURLConnection field40;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   final class407 field42;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Laf;"
   )
   final class9 field41;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   class449 field43;
   @ObfuscatedName("ax")
   boolean field44;
   @ObfuscatedName("ap")
   boolean field45;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1577314221
   )
   int field46;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Laf;Lpj;Z)V"
   )
   public class10(URL var1, class9 var2, class407 var3, boolean var4) throws IOException {
      this.field44 = false;
      this.field45 = false;
      this.field46 = 300000;
      if (!var2.method70()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method82());
      } else {
         this.field40 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field40.setSSLSocketFactory(class15.method206());
         }

         this.field41 = var2;
         this.field42 = var3 != null ? var3 : new class407();
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Laf;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      this(var1, var2, new class407(), var3);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Lpj;",
      garbageValue = "4"
   )
   public class407 method93() {
      return this.field42;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)V",
      garbageValue = "28"
   )
   public void method91(class449 var1) {
      if (!this.field44) {
         if (var1 == null) {
            this.field42.method7643("Content-Type");
            this.field43 = null;
         } else {
            this.field43 = var1;
            if (this.field43.vmethod8254() != null) {
               this.field42.method7647(this.field43.vmethod8254());
            } else {
               this.field42.method7645();
            }

         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-2983"
   )
   void method87() throws ProtocolException {
      if (!this.field44) {
         this.field40.setRequestMethod(this.field41.method82());
         this.field42.method7640(this.field40);
         if (this.field41.method68() && this.field43 != null) {
            this.field40.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field43.vmethod8248());
               var1.writeTo(this.field40.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.field40.setConnectTimeout(this.field46);
         this.field40.setInstanceFollowRedirects(this.field45);
         this.field44 = true;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2119989742"
   )
   boolean method101() throws IOException {
      if (!this.field44) {
         this.method87();
      }

      this.field40.connect();
      return this.field40.getResponseCode() == -1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)Lai;",
      garbageValue = "52"
   )
   class20 method95() {
      try {
         if (!this.field44 || this.field40.getResponseCode() == -1) {
            return new class20("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field40.disconnect();
         return new class20("Error decoding REST response code: " + var10.getMessage());
      }

      class20 var3;
      try {
         class20 var1 = new class20(this.field40);
         return var1;
      } catch (IOException var8) {
         var3 = new class20("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field40.disconnect();
      }

      return var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "126"
   )
   static void method104(int var0) {
      UserComparator9.field1437 = var0;
      class438.field4682 = new class438[var0];
      class438.field4684 = 0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lmb;B)I",
      garbageValue = "46"
   )
   static int method103(Widget var0) {
      if (var0.type != 11) {
         Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize - 1] = "";
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var0.method6372(var1);
         return 1;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-560521371"
   )
   static final void method102(String var0, int var1) {
      PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      var2.packetBuffer.writeByteAdd(var1);
      Client.packetWriter.addNode(var2);
   }
}
