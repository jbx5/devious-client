import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("aj")
   final Thread field1393 = new Thread(this);
   @ObfuscatedName("al")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("ac")
   @Export("requests")
   Queue requests = new LinkedList();
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -409897459
   )
   int field1392;

   UrlRequester(int var1) {
      this.field1393.setPriority(1);
      this.field1393.start();
      this.field1392 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Leo;I)V",
      garbageValue = "1239593024"
   )
   abstract void vmethod2809(UrlRequest var1) throws IOException;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;B)I",
      garbageValue = "-62"
   )
   int method2790(URLConnection var1) {
      int var2 = -1;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "929925271"
   )
   void method2791(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1392);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Leo;I)V",
      garbageValue = "1639089980"
   )
   void method2802(URLConnection var1, UrlRequest var2) {
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
            byte[] var6 = Decimator.ByteArrayPool_getArray(5000);

            byte[] var8;
            for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
               var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
            }

            class366.ByteArrayPool_release(var6);
         }

         var2.response0 = var4;
      } catch (IOException var14) {
         var2.response0 = null;
      } finally {
         var2.field1402 = this.method2790(var1);
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var13) {
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;I)Leo;",
      garbageValue = "-166475337"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "62"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1393.join();
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

            this.vmethod2809(var1);
         } catch (Exception var7) {
            class364.RunException_sendStackTrace((String)null, var7);
         }
      }

   }
}
