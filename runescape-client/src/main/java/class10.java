import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class10 {
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -121467123
   )
   static int field53;
   @ObfuscatedName("aj")
   final HttpsURLConnection field48;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   final class390 field46;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   final class9 field47;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lqb;"
   )
   class432 field45;
   @ObfuscatedName("an")
   boolean field52;
   @ObfuscatedName("ao")
   boolean field50;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1952365041
   )
   int field51;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lar;Lpu;Z)V"
   )
   public class10(URL var1, class9 var2, class390 var3, boolean var4) throws IOException {
      this.field52 = false;
      this.field50 = false;
      this.field51 = 300000;
      if (!var2.method62()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method63());
      } else {
         this.field48 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            HttpsURLConnection var5 = this.field48;
            if (class15.field76 == null) {
               class15.field76 = new class15();
            }

            class15 var6 = class15.field76;
            var5.setSSLSocketFactory(var6);
         }

         this.field47 = var2;
         this.field46 = var3 != null ? var3 : new class390();
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lar;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      this(var1, var2, new class390(), var3);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(S)Lpu;",
      garbageValue = "8183"
   )
   public class390 method78() {
      return this.field46;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lqb;B)V",
      garbageValue = "121"
   )
   public void method79(class432 var1) {
      if (!this.field52) {
         if (var1 == null) {
            this.field46.method7358("Content-Type");
            this.field45 = null;
         } else {
            this.field45 = var1;
            if (this.field45.vmethod7993() != null) {
               this.field46.method7362(this.field45.vmethod7993());
            } else {
               this.field46.method7363();
            }

         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1245579304"
   )
   void method80() throws ProtocolException {
      if (!this.field52) {
         this.field48.setRequestMethod(this.field47.method63());
         this.field46.method7355(this.field48);
         if (this.field47.method64() && this.field45 != null) {
            this.field48.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field45.vmethod7994());
               var1.writeTo(this.field48.getOutputStream());
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

         this.field48.setConnectTimeout(this.field51);
         this.field48.setInstanceFollowRedirects(this.field50);
         this.field52 = true;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-105"
   )
   boolean method81() throws IOException {
      if (!this.field52) {
         this.method80();
      }

      this.field48.connect();
      return this.field48.getResponseCode() == -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Laf;",
      garbageValue = "2110513112"
   )
   class20 method89() {
      try {
         if (!this.field52 || this.field48.getResponseCode() == -1) {
            return new class20("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field48.disconnect();
         return new class20("Error decoding REST response code: " + var10.getMessage());
      }

      class20 var3;
      try {
         class20 var1 = new class20(this.field48);
         return var1;
      } catch (IOException var8) {
         var3 = new class20("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field48.disconnect();
      }

      return var3;
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "(Lhx;IIII)V",
      garbageValue = "-793671958"
   )
   static void method91(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.method2463() != 0) {
         if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
            int var4 = var0.soundEffects[var1];
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }
}
