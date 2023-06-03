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

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
   @ObfuscatedName("oy")
   @ObfuscatedSignature(
      descriptor = "Lcn;"
   )
   @Export("tempMenuAction")
   static MenuAction tempMenuAction;
   @ObfuscatedName("at")
   final Thread field1395 = new Thread(this);
   @ObfuscatedName("an")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("av")
   @Export("requests")
   Queue requests = new LinkedList();
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2102049249
   )
   int field1397;

   UrlRequester(int var1) {
      this.field1395.setPriority(1);
      this.field1395.start();
      this.field1397 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Let;I)V",
      garbageValue = "2051535253"
   )
   abstract void vmethod2824(UrlRequest var1) throws IOException;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)I",
      garbageValue = "601333595"
   )
   int method2801(URLConnection var1) {
      int var2 = UrlRequest.field1405;
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "20210019"
   )
   void method2802(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1397);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Let;I)V",
      garbageValue = "-916847883"
   )
   void method2803(URLConnection var1, UrlRequest var2) {
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
            byte[] var6 = WorldMapSection1.ByteArrayPool_getArray(5000);

            byte[] var8;
            for(int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
               var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
            }

            MusicPatchPcmStream.ByteArrayPool_release(var6);
         }

         var2.response0 = var4;
      } catch (IOException var14) {
         var2.response0 = null;
      } finally {
         var2.field1403 = this.method2801(var1);
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var13) {
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;I)Let;",
      garbageValue = "-1833072628"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "562063725"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1395.join();
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

            this.vmethod2824(var1);
         } catch (Exception var7) {
            class260.RunException_sendStackTrace((String)null, var7);
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "2051956986"
   )
   @Export("encodeStringCp1252")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (var7 == 710) {
            var3[var6 + var4] = -120;
         } else if (var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if (var7 == 352) {
            var3[var6 + var4] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if (var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var6 + var4] = -100;
         } else if (var7 == 382) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }
}
