import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("Buffer")
public class Buffer extends Node {
   @ObfuscatedName("af")
   static int[] field5019 = new int[256];
   @ObfuscatedName("aa")
   static long[] field5021;
   @ObfuscatedName("ak")
   @Export("array")
   public byte[] array;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1705195685
   )
   @Export("offset")
   public int offset;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var4 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var4 & 1) == 1) {
               var4 = var4 >>> 1 ^ -306674912;
            } else {
               var4 >>>= 1;
            }
         }

         field5019[var1] = var4;
      }

      field5021 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var0 & 1L) == 1L) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         field5021[var2] = var0;
      }

   }

   public Buffer(int var1, boolean var2) {
      this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2);
   }

   public Buffer(int var1) {
      this.array = WorldMapSection1.ByteArrayPool_getArray(var1);
      this.offset = 0;
   }

   public Buffer(byte[] var1) {
      this.array = var1;
      this.offset = 0;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1615836876"
   )
   @Export("releaseArray")
   public void releaseArray() {
      if (this.array != null) {
         MusicPatchPcmStream.ByteArrayPool_release(this.array);
      }

      this.array = null;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-3"
   )
   @Export("writeByte")
   public void writeByte(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "3408"
   )
   @Export("writeShort")
   public void writeShort(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "763103406"
   )
   @Export("writeMedium")
   public void writeMedium(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-88709237"
   )
   @Export("writeInt")
   public void writeInt(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bi")
   @Export("writeLongMedium")
   public void writeLongMedium(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bk")
   @Export("writeLong")
   public void writeLong(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "244232126"
   )
   @Export("writeBoolean")
   public void writeBoolean(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   @Export("writeStringCp1252NullTerminated")
   public void writeStringCp1252NullTerminated(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += UrlRequester.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1859717548"
   )
   @Export("writeStringCp1252NullCircumfixed")
   public void writeStringCp1252NullCircumfixed(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[++this.offset - 1] = 0;
         this.offset += UrlRequester.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)V",
      garbageValue = "122"
   )
   @Export("writeCESU8")
   public void writeCESU8(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 <= 127) {
            ++var4;
         } else if (var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.array[++this.offset - 1] = 0;
      this.writeVarInt(var4);
      this.offset += class85.method2241(this.array, this.offset, var1);
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1032630785"
   )
   @Export("writeBytes")
   public void writeBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.array[++this.offset - 1] = var1[var4];
      }

   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "1362476277"
   )
   public void writeBuffer(Buffer var1) {
      this.writeBytes(var1.array, 0, var1.offset);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "30492170"
   )
   @Export("writeLengthInt")
   public void writeLengthInt(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
         this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
         this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[this.offset - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1245706053"
   )
   @Export("writeLengthShort")
   public void writeLengthShort(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1397846024"
   )
   public void writeLengthByte(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-66"
   )
   @Export("writeSmartByteShort")
   public void writeSmartByteShort(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.writeShort(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1593395164"
   )
   @Export("writeVarInt")
   public void writeVarInt(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-339823759"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() {
      return this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(B)B",
      garbageValue = "78"
   )
   @Export("readByte")
   public byte readByte() {
      return this.array[++this.offset - 1];
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1837628027"
   )
   @Export("readUnsignedShort")
   public int readUnsignedShort() {
      this.offset += 2;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1973288200"
   )
   @Export("readShort")
   public int readShort() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-540858369"
   )
   @Export("readMedium")
   public int readMedium() {
      this.offset += 3;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1468578386"
   )
   @Export("readInt")
   public int readInt() {
      this.offset += 4;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "2045646917"
   )
   @Export("readLong")
   public long readLong() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(B)F",
      garbageValue = "53"
   )
   public float method8916() {
      return Float.intBitsToFloat(this.readInt());
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("readBoolean")
   public boolean readBoolean() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   @Export("readStringCp1252NullTerminatedOrNull")
   public String readStringCp1252NullTerminatedOrNull() {
      if (this.array[this.offset] == 0) {
         ++this.offset;
         return null;
      } else {
         return this.readStringCp1252NullTerminated();
      }
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1224435060"
   )
   @Export("readStringCp1252NullTerminated")
   public String readStringCp1252NullTerminated() {
      int var1 = this.offset;

      while(this.array[++this.offset - 1] != 0) {
      }

      int var2 = this.offset - var1 - 1;
      return var2 == 0 ? "" : MusicPatchNode2.decodeStringCp1252(this.array, var1, var2);
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1480638125"
   )
   @Export("readStringCp1252NullCircumfixed")
   public String readStringCp1252NullCircumfixed() {
      byte var1 = this.array[++this.offset - 1];
      int var2 = this.offset;

      while(this.array[++this.offset - 1] != 0) {
      }

      int var3 = this.offset - var2 - 1;
      return var3 == 0 ? "" : MusicPatchNode2.decodeStringCp1252(this.array, var2, var3);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1705195685"
   )
   @Export("readCESU8")
   public String readCESU8() {
      byte var1 = this.array[++this.offset - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.readVarInt();
         if (var2 + this.offset > this.array.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = Language.method6915(this.array, this.offset, var2);
            this.offset += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1443960330"
   )
   @Export("readBytes")
   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1361401562"
   )
   @Export("readShortSmart")
   public int readShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-538902516"
   )
   @Export("readUShortSmart")
   public int readUShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1328689110"
   )
   public int readShortSmartSub() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '老';
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-385969755"
   )
   public int readIncrSmallSmart() {
      int var1 = 0;

      int var2;
      for(var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "42559123"
   )
   public int readLargeSmart() {
      return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "29"
   )
   public int readNullableLargeSmart() {
      if (this.array[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-59"
   )
   @Export("readVarInt")
   public int readVarInt() {
      byte var1 = this.array[++this.offset - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "474066363"
   )
   public int packBytesToInt() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.readUnsignedByte();
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 127);

      return var2;
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "-381988593"
   )
   @Export("xteaEncryptAll")
   public void xteaEncryptAll(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "-672432737"
   )
   @Export("xteaDecryptAll")
   public void xteaDecryptAll(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1160250297"
   )
   @Export("xteaEncrypt")
   public void xteaEncrypt(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1566135984"
   )
   @Export("xteaDecrypt")
   public void xteaDecrypt(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "790929313"
   )
   @Export("encryptRsa")
   public void encryptRsa(BigInteger var1, BigInteger var2) {
      int var3 = this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.readBytes(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.writeShort(var7.length);
      this.writeBytes(var7, 0, var7.length);
   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1215448455"
   )
   @Export("writeCrc")
   public int writeCrc(int var1) {
      byte[] var3 = this.array;
      int var4 = this.offset;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field5019[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.writeInt(var5);
      return var5;
   }

   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-96"
   )
   @Export("checkCrc")
   public boolean checkCrc() {
      this.offset -= 4;
      byte[] var2 = this.array;
      int var3 = this.offset;
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4 = var4 >>> 8 ^ field5019[(var4 ^ var2[var5]) & 255];
      }

      var4 = ~var4;
      var5 = this.readInt();
      return var5 == var4;
   }

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1334856703"
   )
   public void writeByteAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2062130313"
   )
   public void writeByteNeg(int var1) {
      this.array[++this.offset - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "7"
   )
   public void writeByteSub(int var1) {
      this.array[++this.offset - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-24"
   )
   public int readUnsignedByteAdd() {
      return this.array[++this.offset - 1] - 128 & 255;
   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "101"
   )
   public int readUnsignedByteNeg() {
      return 0 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-516850775"
   )
   public int readUnsignedByteSub() {
      return 128 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-1344595480"
   )
   public byte readByteAdd() {
      return (byte)(this.array[++this.offset - 1] - 128);
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "(B)B",
      garbageValue = "6"
   )
   public byte readByteNeg() {
      return (byte)(0 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "823714739"
   )
   public byte readByteSub() {
      return (byte)(128 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1752473602"
   )
   public void writeShortLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2027016403"
   )
   public void writeShortAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-5"
   )
   public void writeShortAddLE(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-558290666"
   )
   public int readUnsignedShortLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
   }

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "266433617"
   )
   public int readUnsignedShortAdd() {
      this.offset += 2;
      return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1118234371"
   )
   public int readUnsignedShortAddLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
   }

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "675350847"
   )
   public int method8953() {
      this.offset += 2;
      int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1438443675"
   )
   public int readShortLE() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-143730578"
   )
   public void writeMediumLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int method9106() {
      this.offset += 3;
      return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1861144152"
   )
   public int method8957() {
      this.offset += 3;
      return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1573106788"
   )
   public int method9027() {
      this.offset += 3;
      int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1443422912"
   )
   public int method8959() {
      this.offset += 3;
      int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1426704705"
   )
   public void writeIntLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-35"
   )
   public void writeIntIME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2095385223"
   )
   public void writeIntME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-101"
   )
   public int readUnsignedIntLE() {
      this.offset += 4;
      return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1257210540"
   )
   public int readUnsignedIntIME() {
      this.offset += 4;
      return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1881127123"
   )
   public int readUnsignedIntME() {
      this.offset += 4;
      return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
   }

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-35733991"
   )
   public void readBytesLE(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }

   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "48"
   )
   public void method9155(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1824124703"
   )
   public static void method9158(int var0, int var1) {
      VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var3 = new VarbitComposition();
         if (var4 != null) {
            var3.decode(new Buffer(var4));
         }

         VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.baseVar;
      int var5 = var2.startBit;
      int var6 = var2.endBit;
      int var7 = Varps.Varps_masks[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
   }
}
