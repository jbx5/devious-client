import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1543897929
   )
   static int field1389;
   @ObfuscatedName("a")
   final Thread field1385 = new Thread(this);
   @ObfuscatedName("f")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("c")
   @Export("requests")
   Queue requests = new LinkedList();
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 392198645
   )
   int field1386;

   UrlRequester(int var1) {
      this.field1385.setPriority(1);
      this.field1385.start();
      this.field1386 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)V",
      garbageValue = "-1777205234"
   )
   abstract void vmethod2700(UrlRequest var1) throws IOException;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "-2112853190"
   )
   void method2680(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1386);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Lde;I)V",
      garbageValue = "229890496"
   )
   void method2681(URLConnection var1, UrlRequest var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = class4444.ByteArrayPool_getArray(5000);

            byte[] var8;
            for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
               var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
            }

            class199.ByteArrayPool_release(var6);
         }

         var2.response0 = var4;
      } catch (IOException var10) {
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var9) {
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;I)Lde;",
      garbageValue = "-77220349"
   )
   @Export("request")
   public UrlRequest request(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "66"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1385.join();
      } catch (InterruptedException var4) {
      }

   }

   public void run() {
      while(!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized(this) {
               var1 = (UrlRequest)this.requests.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod2700(var1);
         } catch (Exception var7) {
            class421.RunException_sendStackTrace((String)null, var7);
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZZB)V",
      garbageValue = "11"
   )
   @Export("openURL")
   public static void openURL(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
            }
         }

         if (class32.field176.startsWith("win")) {
            class411.method7742(var0, 0, "openjs");
         } else if (class32.field176.startsWith("mac")) {
            class411.method7742(var0, 1, "openjs");
         } else {
            class411.method7742(var0, 2, "openjs");
         }
      } else {
         class411.method7742(var0, 3, "openjs");
      }

   }
}
