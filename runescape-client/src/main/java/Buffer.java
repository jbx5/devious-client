import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("Buffer")
public class Buffer extends Node {
   @ObfuscatedName("aa")
   static int[] field4992 = new int[256];
   @ObfuscatedName("ao")
   static long[] field4993;
   @ObfuscatedName("al")
   @Export("array")
   public byte[] array;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1633313603
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

         field4992[var1] = var4;
      }

      field4993 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var0 & 1L)) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         field4993[var2] = var0;
      }

   }

   public Buffer(int var1, boolean var2) {
      this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2);
   }

   public Buffer(int var1) {
      this.array = AbstractWorldMapData.ByteArrayPool_getArray(var1);
      this.offset = 0;
   }

   public Buffer(byte[] var1) {
      this.array = var1;
      this.offset = 0;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "265255722"
   )
   @Export("releaseArray")
   public void releaseArray() {
      if (this.array != null) {
         InterfaceParent.ByteArrayPool_release(this.array);
      }

      this.array = null;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "36"
   )
   @Export("writeByte")
   public void writeByte(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "55"
   )
   @Export("writeShort")
   public void writeShort(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-968749381"
   )
   @Export("writeMedium")
   public void writeMedium(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2081835031"
   )
   @Export("writeInt")
   public void writeInt(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bv")
   @Export("writeLongMedium")
   public void writeLongMedium(long var1) {
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.array[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bl")
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

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "614283261"
   )
   @Export("writeBoolean")
   public void writeBoolean(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1772573081"
   )
   @Export("writeStringCp1252NullTerminated")
   public void writeStringCp1252NullTerminated(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += WorldMapSprite.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1492929913"
   )
   @Export("writeStringCp1252NullCircumfixed")
   public void writeStringCp1252NullCircumfixed(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[++this.offset - 1] = 0;
         this.offset += WorldMapSprite.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
         this.array[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)V",
      garbageValue = "-81"
   )
   @Export("writeCESU8")
   public void writeCESU8(CharSequence var1) {
      int var2 = class173.method3587(var1);
      this.array[++this.offset - 1] = 0;
      this.writeVarInt(var2);
      this.offset += GrandExchangeOffer.method6873(this.array, this.offset, var1);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "9"
   )
   @Export("writeBytes")
   public void writeBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.array[++this.offset - 1] = var1[var4];
      }

   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "1254495951"
   )
   public void writeBuffer(Buffer var1) {
      this.writeBytes(var1.array, 0, var1.offset);
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1718879396"
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

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1708168699"
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

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "713822283"
   )
   public void writeLengthByte(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-101"
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

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "67"
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

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   @Export("readUnsignedByte")
   public int readUnsignedByte() {
      return this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "435772489"
   )
   @Export("readByte")
   public byte readByte() {
      return this.array[++this.offset - 1];
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-697993691"
   )
   @Export("readUnsignedShort")
   public int readUnsignedShort() {
      this.offset += 2;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-12"
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

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2130592697"
   )
   @Export("readMedium")
   public int readMedium() {
      this.offset += 3;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   public int method9117() {
      this.offset += 3;
      int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1694820613"
   )
   @Export("readInt")
   public int readInt() {
      this.offset += 4;
      return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "1"
   )
   @Export("readLong")
   public long readLong() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "1038383495"
   )
   public float method9064() {
      return Float.intBitsToFloat(this.readInt());
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1404535452"
   )
   @Export("readBoolean")
   public boolean readBoolean() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-85"
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

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   @Export("readStringCp1252NullTerminated")
   public String readStringCp1252NullTerminated() {
      int var1 = this.offset;

      while(this.array[++this.offset - 1] != 0) {
      }

      int var2 = this.offset - var1 - 1;
      return var2 == 0 ? "" : decodeStringCp1252(this.array, var1, var2);
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "-16960"
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
         return var3 == 0 ? "" : decodeStringCp1252(this.array, var2, var3);
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1368086059"
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
            byte[] var4 = this.array;
            int var5 = this.offset;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if (var10 < 128) {
                  if (var10 == 0) {
                     var11 = 65533;
                  } else {
                     var11 = var10;
                  }
               } else if (var10 < 192) {
                  var11 = 65533;
               } else if (var10 < 224) {
                  if (var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if (var11 < 128) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 240) {
                  if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 < 2048) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 248) {
                  if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 >= 65536 && var11 <= 1114111) {
                        var11 = 65533;
                     } else {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else {
                  var11 = 65533;
               }
            }

            String var3 = new String(var6, 0, var7);
            this.offset += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1570744551"
   )
   @Export("readBytes")
   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.array[++this.offset - 1];
      }

   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1391642638"
   )
   @Export("readShortSmart")
   public int readShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1555687167"
   )
   @Export("readUShortSmart")
   public int readUShortSmart() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1370697348"
   )
   public int readShortSmartSub() {
      int var1 = this.array[this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '老';
   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-53"
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

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "714180890"
   )
   public int readLargeSmart() {
      return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "203805527"
   )
   public int readNullableLargeSmart() {
      if (this.array[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1171795391"
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

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-7"
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
      garbageValue = "-794961409"
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

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "2136223901"
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

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "383031129"
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

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1350839672"
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

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "1086371939"
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

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-2013538167"
   )
   @Export("writeCrc")
   public int writeCrc(int var1) {
      int var2 = SequenceDefinition.method4176(this.array, var1, this.offset);
      this.writeInt(var2);
      return var2;
   }

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1987573484"
   )
   @Export("checkCrc")
   public boolean checkCrc() {
      this.offset -= 4;
      int var1 = SequenceDefinition.method4176(this.array, 0, this.offset);
      int var2 = this.readInt();
      return var1 == var2;
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-36"
   )
   public void writeByteAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-531273454"
   )
   public void writeByteNeg(int var1) {
      this.array[++this.offset - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "483460280"
   )
   public void writeByteSub(int var1) {
      this.array[++this.offset - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-113"
   )
   public int readUnsignedByteAdd() {
      return this.array[++this.offset - 1] - 128 & 255;
   }

   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2049377759"
   )
   public int readUnsignedByteNeg() {
      return 0 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2070899692"
   )
   public int readUnsignedByteSub() {
      return 128 - this.array[++this.offset - 1] & 255;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-270768016"
   )
   public byte readByteAdd() {
      return (byte)(this.array[++this.offset - 1] - 128);
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-1640834672"
   )
   public byte readByteNeg() {
      return (byte)(0 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-2139483258"
   )
   public byte readByteSub() {
      return (byte)(128 - this.array[++this.offset - 1]);
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "70"
   )
   public void writeShortLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "26"
   )
   public void writeShortAdd(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2096365522"
   )
   public void writeShortAddLE(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 + 128);
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "418943913"
   )
   public int readUnsignedShortLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-523126268"
   )
   public int readUnsignedShortAdd() {
      this.offset += 2;
      return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "718104300"
   )
   public int readUnsignedShortAddLE() {
      this.offset += 2;
      return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
   }

   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "68"
   )
   public int method9219() {
      this.offset += 2;
      int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1019786063"
   )
   public int method9101() {
      this.offset += 2;
      int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-381986387"
   )
   public int readShortLE() {
      this.offset += 2;
      int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-379952376"
   )
   public void method9103(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1641573586"
   )
   public int method9084() {
      this.offset += 3;
      return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1943847738"
   )
   public int method9105() {
      this.offset += 3;
      return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
   }

   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-118"
   )
   public int method9106() {
      this.offset += 3;
      int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("es")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-604065252"
   )
   public void writeIntLE(int var1) {
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-90"
   )
   public void writeIntIME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-437883978"
   )
   public void writeIntME(int var1) {
      this.array[++this.offset - 1] = (byte)(var1 >> 16);
      this.array[++this.offset - 1] = (byte)(var1 >> 24);
      this.array[++this.offset - 1] = (byte)var1;
      this.array[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "383378593"
   )
   public int readUnsignedIntLE() {
      this.offset += 4;
      return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "363073604"
   )
   public int readUnsignedIntIME() {
      this.offset += 4;
      return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-18"
   )
   public int readUnsignedIntME() {
      this.offset += 4;
      return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "548759659"
   )
   @Export("decodeStringCp1252")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class369.cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
