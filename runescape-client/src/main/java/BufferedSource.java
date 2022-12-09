import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
   @ObfuscatedName("h")
   @Export("thread")
   Thread thread;
   @ObfuscatedName("e")
   @Export("inputStream")
   InputStream inputStream;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1848700253
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("x")
   @Export("buffer")
   byte[] buffer;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1891508275
   )
   @Export("position")
   int position = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1884298899
   )
   @Export("limit")
   int limit = 0;
   @ObfuscatedName("f")
   @Export("exception")
   IOException exception;

   BufferedSource(InputStream var1, int var2) {
      this.inputStream = var1;
      this.capacity = var2 + 1;
      this.buffer = new byte[this.capacity];
      this.thread = new Thread(this);
      this.thread.setDaemon(true);
      this.thread.start();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "39"
   )
   @Export("isAvailable")
   boolean isAvailable(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.capacity) {
         synchronized(this) {
            int var3;
            if (this.position <= this.limit) {
               var3 = this.limit - this.position;
            } else {
               var3 = this.capacity - this.position + this.limit;
            }

            if (var3 < var1) {
               if (this.exception != null) {
                  throw new IOException(this.exception.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "115"
   )
   @Export("available")
   int available() throws IOException {
      synchronized(this) {
         int var2;
         if (this.position <= this.limit) {
            var2 = this.limit - this.position;
         } else {
            var2 = this.capacity - this.position + this.limit;
         }

         if (var2 <= 0 && this.exception != null) {
            throw new IOException(this.exception.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1587894570"
   )
   @Export("readUnsignedByte")
   int readUnsignedByte() throws IOException {
      synchronized(this) {
         if (this.position == this.limit) {
            if (this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.buffer[this.position] & 255;
            this.position = (this.position + 1) % this.capacity;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "-2101491252"
   )
   @Export("read")
   int read(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.position <= this.limit) {
               var5 = this.limit - this.position;
            } else {
               var5 = this.capacity - this.position + this.limit;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && this.exception != null) {
               throw new IOException(this.exception.toString());
            } else {
               if (var3 + this.position <= this.capacity) {
                  System.arraycopy(this.buffer, this.position, var1, var2, var3);
               } else {
                  int var6 = this.capacity - this.position;
                  System.arraycopy(this.buffer, this.position, var1, var2, var6);
                  System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
               }

               this.position = (var3 + this.position) % this.capacity;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1835564521"
   )
   @Export("close")
   void close() {
      synchronized(this) {
         if (this.exception == null) {
            this.exception = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.thread.join();
      } catch (InterruptedException var3) {
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.exception != null) {
                  return;
               }

               if (this.position == 0) {
                  var1 = this.capacity - this.limit - 1;
               } else if (this.position <= this.limit) {
                  var1 = this.capacity - this.limit;
               } else {
                  var1 = this.position - this.limit - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
               }
            }
         }

         int var7;
         try {
            var7 = this.inputStream.read(this.buffer, this.limit, var1);
            if (var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.exception = var3;
               return;
            }
         }

         synchronized(this) {
            this.limit = (var7 + this.limit) % this.capacity;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Ljava/lang/String;I)I",
      garbageValue = "-982647214"
   )
   public static int method7683(Buffer var0, String var1) {
      int var2 = var0.offset;
      int var4 = var1.length();
      byte[] var5 = new byte[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var5[var6] = (byte)var7;
         } else if (var7 == 8364) {
            var5[var6] = -128;
         } else if (var7 == 8218) {
            var5[var6] = -126;
         } else if (var7 == 402) {
            var5[var6] = -125;
         } else if (var7 == 8222) {
            var5[var6] = -124;
         } else if (var7 == 8230) {
            var5[var6] = -123;
         } else if (var7 == 8224) {
            var5[var6] = -122;
         } else if (var7 == 8225) {
            var5[var6] = -121;
         } else if (var7 == 710) {
            var5[var6] = -120;
         } else if (var7 == 8240) {
            var5[var6] = -119;
         } else if (var7 == 352) {
            var5[var6] = -118;
         } else if (var7 == 8249) {
            var5[var6] = -117;
         } else if (var7 == 338) {
            var5[var6] = -116;
         } else if (var7 == 381) {
            var5[var6] = -114;
         } else if (var7 == 8216) {
            var5[var6] = -111;
         } else if (var7 == 8217) {
            var5[var6] = -110;
         } else if (var7 == 8220) {
            var5[var6] = -109;
         } else if (var7 == 8221) {
            var5[var6] = -108;
         } else if (var7 == 8226) {
            var5[var6] = -107;
         } else if (var7 == 8211) {
            var5[var6] = -106;
         } else if (var7 == 8212) {
            var5[var6] = -105;
         } else if (var7 == 732) {
            var5[var6] = -104;
         } else if (var7 == 8482) {
            var5[var6] = -103;
         } else if (var7 == 353) {
            var5[var6] = -102;
         } else if (var7 == 8250) {
            var5[var6] = -101;
         } else if (var7 == 339) {
            var5[var6] = -100;
         } else if (var7 == 382) {
            var5[var6] = -98;
         } else if (var7 == 376) {
            var5[var6] = -97;
         } else {
            var5[var6] = 63;
         }
      }

      var0.writeSmartByteShort(var5.length);
      var0.offset += class308.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
      return var0.offset - var2;
   }
}
