import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class304 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldg;"
   )
   UrlRequest field3475;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lrs;"
   )
   SpritePixels field3474;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ldi;)V"
   )
   class304(String var1, UrlRequester var2) {
      try {
         this.field3475 = var2.request(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3475 = null;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ldg;)V"
   )
   class304(UrlRequest var1) {
      this.field3475 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "1593287997"
   )
   SpritePixels method5876() {
      if (this.field3474 == null && this.field3475 != null && this.field3475.isDone()) {
         if (this.field3475.getResponse() != null) {
            this.field3474 = class266.method5471(this.field3475.getResponse());
         }

         this.field3475 = null;
      }

      return this.field3474;
   }
}
