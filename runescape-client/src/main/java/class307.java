import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class307 {
   @ObfuscatedName("uy")
   @ObfuscatedGetter(
      intValue = 1460153413
   )
   static int field3449;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Leo;"
   )
   UrlRequest field3448;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   SpritePixels field3446;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Leb;)V"
   )
   class307(String var1, UrlRequester var2) {
      try {
         this.field3448 = var2.request(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3448 = null;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Leo;)V"
   )
   class307(UrlRequest var1) {
      this.field3448 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Lsn;",
      garbageValue = "-923586250"
   )
   SpritePixels method5779() {
      if (this.field3446 == null && this.field3448 != null && this.field3448.isDone()) {
         if (this.field3448.getResponse() != null) {
            this.field3446 = class139.method3105(this.field3448.getResponse());
         }

         this.field3448 = null;
      }

      return this.field3446;
   }
}
