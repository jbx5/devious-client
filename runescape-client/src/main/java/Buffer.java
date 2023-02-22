import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Buffer")
public class Buffer extends Node {
   @ObfuscatedName("ar")
   public static int[] field4904 = new int[256];
   @ObfuscatedName("ax")
   static long[] field4901;
   @ObfuscatedName("aq")
   @Export("array")
   public byte[] array;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 146201023
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

         field4904[var1] = var4;
      }

      field4901 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var0 & 1L) == 1L) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         field4901[var2] = var0;
      }

   }

   public Buffer(int var1, boolean var2) {
      this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2);
   }

   public Buffer(int var1) {
      this.array = Decimator.ByteArrayPool_getArray(var1);
      this.offset = 0;
   }

   public Buffer(byte[] var1) {
      this.array = var1;
      this.offset = 0;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1721696084"
   )
   @Export("releaseArray")
   public void releaseArray() {
      if (this.array != null) {
         class366.ByteArrayPool_release(this.array);
      }

      this.array = null;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-777398119"
   )
   @Export("writeByte")
   public void writeByte(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "325704528"
   )
   @Export("writeShort")
   public void writeShort(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2109256773"
   )
   @Export("writeMedium")
   public void writeMedium(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1571071880"
   )
   @Export("writeInt")
   public void writeInt(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("by")
   @Export("writeLongMedium")
   public void writeLongMedium(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bp")
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

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1473167525"
   )
   @Export("writeBoolean")
   public void writeBoolean(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2135367400"
   )
   @Export("writeStringCp1252NullTerminated")
   public void writeStringCp1252NullTerminated(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += class159.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1643587758"
   )
   @Export("writeStringCp1252NullCircumfixed")
   public void writeStringCp1252NullCircumfixed(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[++this.offset - 1] = 0;
         this.offset += class159.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "-1694484847"
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
      this.offset += class461.method8419(this.array, this.offset, var1);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "108"
   )
   @Export("writeBytes")
   public void writeBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.array[++this.offset - 1] = var1[var4];
      }

   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "92"
   )
   public void writeBuffer(Buffer var1) {
      this.writeBytes(var1.array, 0, var1.offset);
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-7"
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

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2006948279"
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

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-679716043"
   )
   public void writeLengthByte(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "313715633"
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

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1275262397"
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

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "1600"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() {
      return this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "492809326"
   )
   @Export("readByte")
   public byte readByte() {
      return this.array[++this.offset - 1];
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "869810996"
   )
   @Export("readUnsignedShort")
   public int readUnsignedShort() {
      this.offset += 2;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
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

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1564505597"
   )
   @Export("readMedium")
   public int readMedium() {
      this.offset += 3;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "776465859"
   )
   @Export("readInt")
   public int readInt() {
      this.offset += 4;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-1670000360"
   )
   @Export("readLong")
   public long readLong() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return var3 + (var1 << 32);
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(B)F",
      garbageValue = "-41"
   )
   public float method8626() {
      return Float.intBitsToFloat(this.readInt());
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "125"
   )
   @Export("readBoolean")
   public boolean readBoolean() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1351748880"
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

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "3"
   )
   @Export("readStringCp1252NullTerminated")
   public String readStringCp1252NullTerminated() {
      int var1 = this.offset;

      while(this.array[++this.offset - 1] != 0) {
      }

      int var2 = this.offset - var1 - 1;
      return var2 == 0 ? "" : GrandExchangeOfferUnitPriceComparator.decodeStringCp1252(this.array, var1, var2);
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "87069522"
   )
   @Export("readStringCp1252NullCircumfixed")
   public String readStringCp1252NullCircumfixed() {
      byte var1 = this.array[++this.offset - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset;

         while(this.array[++this.offset - 1] != 0) {
         }

         int var3 = this.offset - var2 - 1;
         return var3 == 0 ? "" : GrandExchangeOfferUnitPriceComparator.decodeStringCp1252(this.array, var2, var3);
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-96"
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
            String var3 = class131.method3032(this.array, this.offset, var2);
            this.offset += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "968722699"
   )
   @Export("readBytes")
   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1864496481"
   )
   @Export("readShortSmart")
   public int readShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-83"
   )
   @Export("readUShortSmart")
   public int readUShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1556847048"
   )
   public int readShortSmartSub() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '老';
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "851893541"
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

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1180291958"
   )
   public int readLargeSmart() {
      return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "456296356"
   )
   public int readNullableLargeSmart() {
      if (this.array[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1787990855"
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

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1924301166"
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

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "334061893"
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

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "([IB)V",
      garbageValue = "58"
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

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "([IIIB)V",
      garbageValue = "74"
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

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "([IIIB)V",
      garbageValue = "-6"
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

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "1974536127"
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

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-20"
   )
   @Export("writeCrc")
   public int writeCrc(int var1) {
      byte[] var3 = this.array;
      int var4 = this.offset;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field4904[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.writeInt(var5);
      return var5;
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "90"
   )
   @Export("checkCrc")
   public boolean checkCrc() {
      this.offset -= 4;
      byte[] var2 = this.array;
      int var3 = this.offset;
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4 = var4 >>> 8 ^ field4904[(var4 ^ var2[var5]) & 255];
      }

      var4 = ~var4;
      var5 = this.readInt();
      return var4 == var5;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "59"
   )
   public void writeByteAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1490727731"
   )
   public void writeByteNeg(int var1) {
      this.array[++this.offset - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1672277445"
   )
   public void writeByteSub(int var1) {
      this.array[++this.offset - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int readUnsignedByteAdd() {
      return this.array[++this.offset - 1] - 128 & 255;
   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2061320116"
   )
   public int readUnsignedByteNeg() {
      return 0 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "621032025"
   )
   public int readUnsignedByteSub() {
      return 128 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "880952253"
   )
   public byte readByteAdd() {
      return (byte)(this.array[++this.offset - 1] - 128);
   }

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-1850088884"
   )
   public byte readByteNeg() {
      return (byte)(0 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "1179146087"
   )
   public byte readByteSub() {
      return (byte)(128 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-4"
   )
   public void writeShortLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "69"
   )
   public void writeShortAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "28"
   )
   public void writeShortAddLE(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-198662608"
   )
   public int readUnsignedShortLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1348515939"
   )
   public int readUnsignedShortAdd() {
      this.offset += 2;
      return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1429501231"
   )
   public int readUnsignedShortAddLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int method8676() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1865601805"
   )
   public int readShortLE() {
      this.offset += 2;
      int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "891317600"
   )
   public void method8801(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "2853"
   )
   public int method8629() {
      this.offset += 3;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
   }

   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "872602777"
   )
   public int method8678() {
      this.offset += 3;
      int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "960929614"
   )
   public int method8668() {
      this.offset += 3;
      int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2033419243"
   )
   public void writeIntLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1632604314"
   )
   public void writeIntIME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "666893750"
   )
   public void writeIntME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-917619037"
   )
   public int readUnsignedIntLE() {
      this.offset += 4;
      return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-100346804"
   )
   public int readUnsignedIntIME() {
      this.offset += 4;
      return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1717847263"
   )
   public int readUnsignedIntME() {
      this.offset += 4;
      return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
   }

   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1265227585"
   )
   public void method8608(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
      }

   }

   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "63911841"
   )
   public void readBytesLE(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
      }

   }
}
