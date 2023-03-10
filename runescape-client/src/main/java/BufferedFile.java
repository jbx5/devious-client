import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("rq")
@Implements("BufferedFile")
public class BufferedFile {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lre;"
   )
   @Export("accessFile")
   AccessFile accessFile;
   @ObfuscatedName("ac")
   @Export("readBuffer")
   byte[] readBuffer;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = 4851207705422840837L
   )
   @Export("readBufferOffset")
   long readBufferOffset = -1L;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1744870847
   )
   @Export("readBufferLength")
   int readBufferLength;
   @ObfuscatedName("ao")
   @Export("writeBuffer")
   byte[] writeBuffer;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      longValue = -6675704781799031807L
   )
   @Export("writeBufferOffset")
   long writeBufferOffset = -1L;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 76361545
   )
   @Export("writeBufferLength")
   int writeBufferLength = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -3315027133540290633L
   )
   @Export("offset")
   long offset;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 5620988364214818377L
   )
   @Export("fileLength")
   long fileLength;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      longValue = -5557770075075224611L
   )
   @Export("length")
   long length;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = -3964773144111466127L
   )
   @Export("fileOffset")
   long fileOffset;

   @ObfuscatedSignature(
      descriptor = "(Lre;II)V"
   )
   public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
      this.accessFile = var1;
      this.length = this.fileLength = var1.length();
      this.readBuffer = new byte[var2];
      this.writeBuffer = new byte[var3];
      this.offset = 0L;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1997012376"
   )
   @Export("close")
   public void close() throws IOException {
      this.flush();
      this.accessFile.close();
   }

   @ObfuscatedName("al")
   @Export("seek")
   public void seek(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.offset = var1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "93"
   )
   @Export("length")
   public long length() {
      return this.length;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "67"
   )
   @Export("readFully")
   public void readFully(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "64"
   )
   @Export("read")
   public void read(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.writeBufferOffset && this.offset >= this.writeBufferOffset && (long)var3 + this.offset <= this.writeBufferOffset + (long)this.writeBufferLength) {
            System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var1, var2, var3);
            this.offset += (long)var3;
            return;
         }

         long var4 = this.offset;
         int var7 = var3;
         int var8;
         if (this.offset >= this.readBufferOffset && this.offset < (long)this.readBufferLength + this.readBufferOffset) {
            var8 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), var1, var2, var8);
            this.offset += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.readBuffer.length) {
            this.accessFile.seek(this.offset);

            for(this.fileOffset = this.offset; var3 > 0; var3 -= var8) {
               var8 = this.accessFile.read(var1, var2, var3);
               if (var8 == -1) {
                  break;
               }

               this.fileOffset += (long)var8;
               this.offset += (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.load();
            var8 = var3;
            if (var3 > this.readBufferLength) {
               var8 = this.readBufferLength;
            }

            System.arraycopy(this.readBuffer, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.offset += (long)var8;
         }

         if (this.writeBufferOffset != -1L) {
            if (this.writeBufferOffset > this.offset && var3 > 0) {
               var8 = var2 + (int)(this.writeBufferOffset - this.offset);
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.offset;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if (this.writeBufferOffset >= var4 && this.writeBufferOffset < (long)var7 + var4) {
               var13 = this.writeBufferOffset;
            } else if (var4 >= this.writeBufferOffset && var4 < (long)this.writeBufferLength + this.writeBufferOffset) {
               var13 = var4;
            }

            if (this.writeBufferOffset + (long)this.writeBufferLength > var4 && (long)this.writeBufferLength + this.writeBufferOffset <= (long)var7 + var4) {
               var10 = this.writeBufferOffset + (long)this.writeBufferLength;
            } else if ((long)var7 + var4 > this.writeBufferOffset && (long)var7 + var4 <= (long)this.writeBufferLength + this.writeBufferOffset) {
               var10 = var4 + (long)var7;
            }

            if (var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.writeBuffer, (int)(var13 - this.writeBufferOffset), var1, (int)(var13 - var4) + var2, var12);
               if (var10 > this.offset) {
                  var3 = (int)((long)var3 - (var10 - this.offset));
                  this.offset = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.fileOffset = -1L;
         throw var16;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("load")
   void load() throws IOException {
      this.readBufferLength = 0;
      if (this.fileOffset != this.offset) {
         this.accessFile.seek(this.offset);
         this.fileOffset = this.offset;
      }

      int var2;
      for(this.readBufferOffset = this.offset; this.readBufferLength < this.readBuffer.length; this.readBufferLength += var2) {
         int var1 = this.readBuffer.length - this.readBufferLength;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.accessFile.read(this.readBuffer, this.readBufferLength, var1);
         if (var2 == -1) {
            break;
         }

         this.fileOffset += (long)var2;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([BIIS)V",
      garbageValue = "30295"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.offset + (long)var3 > this.length) {
            this.length = (long)var3 + this.offset;
         }

         if (-1L != this.writeBufferOffset && (this.offset < this.writeBufferOffset || this.offset > this.writeBufferOffset + (long)this.writeBufferLength)) {
            this.flush();
         }

         if (-1L != this.writeBufferOffset && (long)var3 + this.offset > this.writeBufferOffset + (long)this.writeBuffer.length) {
            int var4 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset));
            System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var4);
            this.offset += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.writeBufferLength = this.writeBuffer.length;
            this.flush();
         }

         if (var3 <= this.writeBuffer.length) {
            if (var3 > 0) {
               if (this.writeBufferOffset == -1L) {
                  this.writeBufferOffset = this.offset;
               }

               System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var3);
               this.offset += (long)var3;
               if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) {
                  this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
               }

            }
         } else {
            if (this.offset != this.fileOffset) {
               this.accessFile.seek(this.offset);
               this.fileOffset = this.offset;
            }

            this.accessFile.write(var1, var2, var3);
            this.fileOffset += (long)var3;
            if (this.fileOffset > this.fileLength) {
               this.fileLength = this.fileOffset;
            }

            long var9 = -1L;
            long var6 = -1L;
            if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) {
               var9 = this.offset;
            } else if (this.readBufferOffset >= this.offset && this.readBufferOffset < this.offset + (long)var3) {
               var9 = this.readBufferOffset;
            }

            if (this.offset + (long)var3 > this.readBufferOffset && (long)var3 + this.offset <= (long)this.readBufferLength + this.readBufferOffset) {
               var6 = (long)var3 + this.offset;
            } else if (this.readBufferOffset + (long)this.readBufferLength > this.offset && this.readBufferOffset + (long)this.readBufferLength <= (long)var3 + this.offset) {
               var6 = this.readBufferOffset + (long)this.readBufferLength;
            }

            if (var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.offset), this.readBuffer, (int)(var9 - this.readBufferOffset), var8);
            }

            this.offset += (long)var3;
         }
      } catch (IOException var12) {
         this.fileOffset = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-4"
   )
   @Export("flush")
   void flush() throws IOException {
      if (this.writeBufferOffset != -1L) {
         if (this.writeBufferOffset != this.fileOffset) {
            this.accessFile.seek(this.writeBufferOffset);
            this.fileOffset = this.writeBufferOffset;
         }

         this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength);
         this.fileOffset += 76361545L * (long)(this.writeBufferLength * -1976896775);
         if (this.fileOffset > this.fileLength) {
            this.fileLength = this.fileOffset;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset) {
            var1 = this.writeBufferOffset;
         } else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < this.writeBufferOffset + (long)this.writeBufferLength) {
            var1 = this.readBufferOffset;
         }

         if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset && (long)this.writeBufferLength + this.writeBufferOffset <= this.readBufferOffset + (long)this.readBufferLength) {
            var3 = (long)this.writeBufferLength + this.writeBufferOffset;
         } else if ((long)this.readBufferLength + this.readBufferOffset > this.writeBufferOffset && (long)this.readBufferLength + this.readBufferOffset <= this.writeBufferOffset + (long)this.writeBufferLength) {
            var3 = this.readBufferOffset + (long)this.readBufferLength;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.writeBuffer, (int)(var1 - this.writeBufferOffset), this.readBuffer, (int)(var1 - this.readBufferOffset), var5);
         }

         this.writeBufferOffset = -1L;
         this.writeBufferLength = 0;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "1479426877"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
      }
   }
}
