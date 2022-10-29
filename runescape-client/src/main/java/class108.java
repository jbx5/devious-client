import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class108 extends UrlRequester {
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      intValue = -1494209957
   )
   @Export("menuY")
   static int menuY;
   @ObfuscatedName("h")
   final boolean field1394;

   public class108(boolean var1, int var2) {
      super(var2);
      this.field1394 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)V",
      garbageValue = "-1777205234"
   )
   void vmethod2700(UrlRequest var1) throws IOException {
      URLConnection var2 = null;

      try {
         String var3 = var1.url.getProtocol();
         if (var3.equals("http")) {
            var2 = this.method2707(var1);
         } else {
            if (!var3.equals("https")) {
               var1.isDone0 = true;
               return;
            }

            var2 = this.method2699(var1);
         }

         this.method2681(var2, var1);
      } catch (IOException var7) {
      } finally {
         var1.isDone0 = true;
         if (var2 != null) {
            if (var2 instanceof HttpURLConnection) {
               ((HttpURLConnection)var2).disconnect();
            } else if (var2 instanceof HttpsURLConnection) {
               ((HttpsURLConnection)var2).disconnect();
            }
         }

      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)Ljava/net/URLConnection;",
      garbageValue = "-455993048"
   )
   URLConnection method2707(UrlRequest var1) throws IOException {
      URLConnection var2 = var1.url.openConnection();
      this.method2680(var2);
      return var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)Ljava/net/URLConnection;",
      garbageValue = "-1856660904"
   )
   URLConnection method2699(UrlRequest var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection();
      if (!this.field1394) {
         if (class15.field81 == null) {
            class15.field81 = new class15();
         }

         class15 var4 = class15.field81;
         var2.setSSLSocketFactory(var4);
      }

      this.method2680(var2);
      return var2;
   }

   @ObfuscatedName("lc")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IIII)V",
      garbageValue = "-1442042247"
   )
   @Export("drawCompass")
   static final void drawCompass(Widget var0, int var1, int var2, int var3) {
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         if (Client.minimapState < 3) {
            BuddyRankComparator.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

      }
   }
}
