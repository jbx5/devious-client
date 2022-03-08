import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pi")
@Implements("Buffer")
public class Buffer extends Node {
    @ObfuscatedName("a")
    @Export("crc32Table")
    static int[] crc32Table;

    @ObfuscatedName("u")
    @Export("crc64Table")
    static long[] crc64Table;

    @ObfuscatedName("w")
    @Export("array")
    public byte[] array;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -128254341)
    @Export("offset")
    public int offset;

    static {
        crc32Table = new int[256];
        int var2;
        for (int var1 = 0; var1 < 256; ++var1) {
            int var4 = var1;
            for (var2 = 0; var2 < 8; ++var2) {
                if ((var4 & 1) == 1) {
                    var4 = (var4 >>> 1) ^ (-306674912);
                } else {
                    var4 >>>= 1;
                }
            }
            crc32Table[var1] = var4;
        }
        crc64Table = new long[256];
        for (var2 = 0; var2 < 256; ++var2) {
            long var0 = ((long) (var2));
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var0 & 1L) == 1L) {
                    var0 = (var0 >>> 1) ^ (-3932672073523589310L);
                } else {
                    var0 >>>= 1;
                }
            }
            crc64Table[var2] = var0;
        }
    }

    public Buffer(int var1) {
        this.array = InterfaceParent.ByteArrayPool_getArray(var1);
        this.offset = 0;
    }

    public Buffer(byte[] var1) {
        this.array = var1;
        this.offset = 0;
    }

    @ObfuscatedName("as")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "119")
    @Export("releaseArray")
    public void releaseArray() {
        if (this.array != null) {
            ScriptEvent.ByteArrayPool_release(this.array);
        }
        this.array = null;
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "94")
    @Export("writeByte")
    public void writeByte(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1));
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "255")
    @Export("writeShort")
    public void writeShort(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1));
    }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1187655626")
    @Export("writeMedium")
    public void writeMedium(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1));
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "18")
    @Export("writeInt")
    public void writeInt(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1));
    }

    @ObfuscatedName("at")
    @Export("writeLongMedium")
    public void writeLongMedium(long var1) {
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 40)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 32)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 24)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 16)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 8)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1)));
    }

    @ObfuscatedName("ae")
    @Export("writeLong")
    public void writeLong(long var1) {
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 56)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 48)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 40)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 32)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 24)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 16)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 8)));
        this.array[(++this.offset) - 1] = ((byte) ((int) (var1)));
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "4")
    @Export("writeBoolean")
    public void writeBoolean(boolean var1) {
        this.writeByte(var1 ? 1 : 0);
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-2105418018")
    @Export("writeStringCp1252NullTerminated")
    public void writeStringCp1252NullTerminated(String var1) {
        int var2 = var1.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.offset += class255.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
            this.array[(++this.offset) - 1] = 0;
        }
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-86251043")
    @Export("writeStringCp1252NullCircumfixed")
    public void writeStringCp1252NullCircumfixed(String var1) {
        int var2 = var1.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.array[(++this.offset) - 1] = 0;
            this.offset += class255.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
            this.array[(++this.offset) - 1] = 0;
        }
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V", garbageValue = "412537347")
    @Export("writeCESU8")
    public void writeCESU8(CharSequence var1) {
        int var2 = class186.method3692(var1);
        this.array[(++this.offset) - 1] = 0;
        this.writeVarInt(var2);
        this.offset += UrlRequester.method2420(this.array, this.offset, var1);
    }

    @ObfuscatedName("am")
    @ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-751072732")
    @Export("writeBytes")
    public void writeBytes(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < (var3 + var2); ++var4) {
            this.array[(++this.offset) - 1] = var1[var4];
        }
    }

    @ObfuscatedName("bt")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "226683380")
    @Export("writeBuffer")
    public void writeBuffer(Buffer var1) {
        this.writeBytes(var1.array, 0, var1.offset);
    }

    @ObfuscatedName("bn")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-489588257")
    @Export("writeLengthInt")
    public void writeLengthInt(int var1) {
        if (var1 < 0) {
            throw new IllegalArgumentException();
        } else {
            this.array[(this.offset - var1) - 4] = ((byte) (var1 >> 24));
            this.array[(this.offset - var1) - 3] = ((byte) (var1 >> 16));
            this.array[(this.offset - var1) - 2] = ((byte) (var1 >> 8));
            this.array[(this.offset - var1) - 1] = ((byte) (var1));
        }
    }

    @ObfuscatedName("bz")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "156866960")
    @Export("writeLengthShort")
    public void writeLengthShort(int var1) {
        if ((var1 >= 0) && (var1 <= 65535)) {
            this.array[(this.offset - var1) - 2] = ((byte) (var1 >> 8));
            this.array[(this.offset - var1) - 1] = ((byte) (var1));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bx")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2055427525")
    @Export("writeLengthByte")
    public void writeLengthByte(int var1) {
        if ((var1 >= 0) && (var1 <= 255)) {
            this.array[(this.offset - var1) - 1] = ((byte) (var1));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-793889673")
    @Export("writeSmartByteShort")
    public void writeSmartByteShort(int var1) {
        if ((var1 >= 0) && (var1 < 128)) {
            this.writeByte(var1);
        } else if ((var1 >= 0) && (var1 < 32768)) {
            this.writeShort(var1 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bg")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2108823362")
    @Export("writeVarInt")
    public void writeVarInt(int var1) {
        if ((var1 & (-128)) != 0) {
            if ((var1 & (-16384)) != 0) {
                if ((var1 & (-2097152)) != 0) {
                    if ((var1 & (-268435456)) != 0) {
                        this.writeByte((var1 >>> 28) | 128);
                    }
                    this.writeByte((var1 >>> 21) | 128);
                }
                this.writeByte((var1 >>> 14) | 128);
            }
            this.writeByte((var1 >>> 7) | 128);
        }
        this.writeByte(var1 & 127);
    }

    @ObfuscatedName("bm")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-879271951")
    @Export("readUnsignedByte")
    public int readUnsignedByte() {
        return this.array[(++this.offset) - 1] & 255;
    }

    @ObfuscatedName("bi")
    @ObfuscatedSignature(descriptor = "(S)B", garbageValue = "255")
    @Export("readByte")
    public byte readByte() {
        return this.array[(++this.offset) - 1];
    }

    @ObfuscatedName("bw")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "24")
    @Export("readUnsignedShort")
    public int readUnsignedShort() {
        this.offset += 2;
        return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
    }

    @ObfuscatedName("bu")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "37")
    @Export("readShort")
    public int readShort() {
        this.offset += 2;
        int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("bs")
    @ObfuscatedSignature(descriptor = "(S)I", garbageValue = "4032")
    @Export("readMedium")
    public int readMedium() {
        this.offset += 3;
        return (((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255)) + ((this.array[this.offset - 2] & 255) << 8);
    }

    @ObfuscatedName("bb")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
    @Export("readInt")
    public int readInt() {
        this.offset += 4;
        return ((((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255)) + ((this.array[this.offset - 2] & 255) << 8)) + ((this.array[this.offset - 4] & 255) << 24);
    }

    @ObfuscatedName("br")
    @ObfuscatedSignature(descriptor = "(I)J", garbageValue = "-1980860780")
    @Export("readLong")
    public long readLong() {
        long var1 = ((long) (this.readInt())) & 4294967295L;
        long var3 = ((long) (this.readInt())) & 4294967295L;
        return var3 + (var1 << 32);
    }

    @ObfuscatedName("bh")
    @ObfuscatedSignature(descriptor = "(I)F", garbageValue = "-2022142605")
    public float method7374() {
        return Float.intBitsToFloat(this.readInt());
    }

    @ObfuscatedName("bf")
    @ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "10416")
    @Export("readBoolean")
    public boolean readBoolean() {
        return (this.readUnsignedByte() & 1) == 1;
    }

    @ObfuscatedName("bq")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1507200448")
    @Export("readStringCp1252NullTerminatedOrNull")
    public String readStringCp1252NullTerminatedOrNull() {
        if (this.array[this.offset] == 0) {
            ++this.offset;
            return null;
        } else {
            return this.readStringCp1252NullTerminated();
        }
    }

    @ObfuscatedName("ba")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "2026301329")
    @Export("readStringCp1252NullTerminated")
    public String readStringCp1252NullTerminated() {
        int var1 = this.offset;
        while (this.array[(++this.offset) - 1] != 0) {
        } 
        int var2 = (this.offset - var1) - 1;
        return var2 == 0 ? "" : class140.decodeStringCp1252(this.array, var1, var2);
    }

    @ObfuscatedName("bv")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1876672545")
    @Export("readStringCp1252NullCircumfixed")
    public String readStringCp1252NullCircumfixed() {
        byte var1 = this.array[(++this.offset) - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        } else {
            int var2 = this.offset;
            while (this.array[(++this.offset) - 1] != 0) {
            } 
            int var3 = (this.offset - var2) - 1;
            return var3 == 0 ? "" : class140.decodeStringCp1252(this.array, var2, var3);
        }
    }

    @ObfuscatedName("bl")
    @ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "-24918")
    @Export("readCESU8")
    public String readCESU8() {
        byte var1 = this.array[(++this.offset) - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        } else {
            int var2 = this.readVarInt();
            if ((var2 + this.offset) > this.array.length) {
                throw new IllegalStateException("");
            } else {
                String var3 = class318.method5786(this.array, this.offset, var2);
                this.offset += var2;
                return var3;
            }
        }
    }

    @ObfuscatedName("bc")
    @ObfuscatedSignature(descriptor = "([BIIS)V", garbageValue = "11937")
    @Export("readBytes")
    public void readBytes(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < (var3 + var2); ++var4) {
            var1[var4] = this.array[(++this.offset) - 1];
        }
    }

    @ObfuscatedName("bj")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-23")
    @Export("readShortSmart")
    public int readShortSmart() {
        int var1 = this.array[this.offset] & 255;
        return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
    }

    @ObfuscatedName("bo")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1587760461")
    @Export("readUShortSmart")
    public int readUShortSmart() {
        int var1 = this.array[this.offset] & 255;
        return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
    }

    @ObfuscatedName("by")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1880855554")
    @Export("readIncrSmallSmart")
    public int readIncrSmallSmart() {
        int var1 = 0;
        int var2;
        for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
            var1 += 32767;
        }
        var1 += var2;
        return var1;
    }

    @ObfuscatedName("bk")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1274864235")
    @Export("readLargeSmart")
    public int readLargeSmart() {
        return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
    }

    @ObfuscatedName("bp")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "826281746")
    @Export("readNullableLargeSmart")
    public int readNullableLargeSmart() {
        if (this.array[this.offset] < 0) {
            return this.readInt() & Integer.MAX_VALUE;
        } else {
            int var1 = this.readUnsignedShort();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("ch")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-86778709")
    @Export("readVarInt")
    public int readVarInt() {
        byte var1 = this.array[(++this.offset) - 1];
        int var2;
        for (var2 = 0; var1 < 0; var1 = this.array[(++this.offset) - 1]) {
            var2 = (var2 | (var1 & 127)) << 7;
        }
        return var2 | var1;
    }

    @ObfuscatedName("cf")
    @ObfuscatedSignature(descriptor = "([II)V", garbageValue = "-563987489")
    @Export("xteaEncryptAll")
    public void xteaEncryptAll(int[] var1) {
        int var2 = this.offset / 8;
        this.offset = 0;
        for (int var3 = 0; var3 < var2; ++var3) {
            int var4 = this.readInt();
            int var5 = this.readInt();
            int var6 = 0;
            int var7 = -1640531527;
            for (int var8 = 32; (var8--) > 0; var5 += (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var1[(var6 >>> 11) & 3] + var6)) {
                var4 += (var5 + ((var5 << 4) ^ (var5 >>> 5))) ^ (var6 + var1[var6 & 3]);
                var6 += var7;
            }
            this.offset -= 8;
            this.writeInt(var4);
            this.writeInt(var5);
        }
    }

    @ObfuscatedName("cg")
    @ObfuscatedSignature(descriptor = "([IB)V", garbageValue = "69")
    @Export("xteaDecryptAll")
    public void xteaDecryptAll(int[] var1) {
        int var2 = this.offset / 8;
        this.offset = 0;
        for (int var3 = 0; var3 < var2; ++var3) {
            int var4 = this.readInt();
            int var5 = this.readInt();
            int var6 = -957401312;
            int var7 = -1640531527;
            for (int var8 = 32; (var8--) > 0; var4 -= (var5 + ((var5 << 4) ^ (var5 >>> 5))) ^ (var6 + var1[var6 & 3])) {
                var5 -= (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var1[(var6 >>> 11) & 3] + var6);
                var6 -= var7;
            }
            this.offset -= 8;
            this.writeInt(var4);
            this.writeInt(var5);
        }
    }

    @ObfuscatedName("cu")
    @ObfuscatedSignature(descriptor = "([IIII)V", garbageValue = "799009571")
    @Export("xteaEncrypt")
    public void xteaEncrypt(int[] var1, int var2, int var3) {
        int var4 = this.offset;
        this.offset = var2;
        int var5 = (var3 - var2) / 8;
        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = this.readInt();
            int var8 = this.readInt();
            int var9 = 0;
            int var10 = -1640531527;
            for (int var11 = 32; (var11--) > 0; var8 += (var7 + ((var7 << 4) ^ (var7 >>> 5))) ^ (var1[(var9 >>> 11) & 3] + var9)) {
                var7 += (var8 + ((var8 << 4) ^ (var8 >>> 5))) ^ (var9 + var1[var9 & 3]);
                var9 += var10;
            }
            this.offset -= 8;
            this.writeInt(var7);
            this.writeInt(var8);
        }
        this.offset = var4;
    }

    @ObfuscatedName("cw")
    @ObfuscatedSignature(descriptor = "([IIII)V", garbageValue = "1203878548")
    @Export("xteaDecrypt")
    public void xteaDecrypt(int[] var1, int var2, int var3) {
        int var4 = this.offset;
        this.offset = var2;
        int var5 = (var3 - var2) / 8;
        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = this.readInt();
            int var8 = this.readInt();
            int var9 = -957401312;
            int var10 = -1640531527;
            for (int var11 = 32; (var11--) > 0; var7 -= (var8 + ((var8 << 4) ^ (var8 >>> 5))) ^ (var9 + var1[var9 & 3])) {
                var8 -= (var7 + ((var7 << 4) ^ (var7 >>> 5))) ^ (var1[(var9 >>> 11) & 3] + var9);
                var9 -= var10;
            }
            this.offset -= 8;
            this.writeInt(var7);
            this.writeInt(var8);
        }
        this.offset = var4;
    }

    @ObfuscatedName("cb")
    @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = "-129972442")
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

    @ObfuscatedName("cq")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "424794387")
    @Export("writeCrc")
    public int writeCrc(int var1) {
        int var2 = ClientPreferences.method2230(this.array, var1, this.offset);
        this.writeInt(var2);
        return var2;
    }

    @ObfuscatedName("cd")
    @ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "1024")
    @Export("checkCrc")
    public boolean checkCrc() {
        this.offset -= 4;
        int var1 = ClientPreferences.method2230(this.array, 0, this.offset);
        int var2 = this.readInt();
        return var2 == var1;
    }

    @ObfuscatedName("cc")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1143251662")
    @Export("writeByteAdd")
    public void writeByteAdd(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
    }

    @ObfuscatedName("cs")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-26")
    @Export("writeByteNeg")
    public void writeByteNeg(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (0 - var1));
    }

    @ObfuscatedName("cl")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-662681481")
    @Export("writeByteSub")
    public void writeByteSub(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (128 - var1));
    }

    @ObfuscatedName("ck")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1451747396")
    @Export("readUnsignedByteAdd")
    public int readUnsignedByteAdd() {
        return (this.array[(++this.offset) - 1] - 128) & 255;
    }

    @ObfuscatedName("cy")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-554229996")
    @Export("readUnsignedByteNeg")
    public int readUnsignedByteNeg() {
        return (0 - this.array[(++this.offset) - 1]) & 255;
    }

    @ObfuscatedName("cn")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "17")
    @Export("readUnsignedByteSub")
    public int readUnsignedByteSub() {
        return (128 - this.array[(++this.offset) - 1]) & 255;
    }

    @ObfuscatedName("cr")
    @ObfuscatedSignature(descriptor = "(I)B", garbageValue = "-647604401")
    @Export("readByteAdd")
    public byte readByteAdd() {
        return ((byte) (this.array[(++this.offset) - 1] - 128));
    }

    @ObfuscatedName("co")
    @ObfuscatedSignature(descriptor = "(S)B", garbageValue = "446")
    @Export("readByteNeg")
    public byte readByteNeg() {
        return ((byte) (0 - this.array[(++this.offset) - 1]));
    }

    @ObfuscatedName("cj")
    @ObfuscatedSignature(descriptor = "(B)B", garbageValue = "1")
    @Export("readByteSub")
    public byte readByteSub() {
        return ((byte) (128 - this.array[(++this.offset) - 1]));
    }

    @ObfuscatedName("ci")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "127")
    @Export("writeShortLE")
    public void writeShortLE(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
    }

    @ObfuscatedName("ct")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "77")
    @Export("writeShortAdd")
    public void writeShortAdd(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
    }

    @ObfuscatedName("ca")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-15")
    @Export("writeShortAddLE")
    public void writeShortAddLE(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
    }

    @ObfuscatedName("cx")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1689370051")
    @Export("readUnsignedShortLE")
    public int readUnsignedShortLE() {
        this.offset += 2;
        return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
    }

    @ObfuscatedName("cz")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-121")
    @Export("readUnsignedShortAdd")
    public int readUnsignedShortAdd() {
        this.offset += 2;
        return ((this.array[this.offset - 1] - 128) & 255) + ((this.array[this.offset - 2] & 255) << 8);
    }

    @ObfuscatedName("cm")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "4")
    @Export("readUnsignedShortAddLE")
    public int readUnsignedShortAddLE() {
        this.offset += 2;
        return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 2] - 128) & 255);
    }

    @ObfuscatedName("cp")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-25")
    public int method7409() {
        this.offset += 2;
        int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ce")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-581040641")
    @Export("readShortAdd")
    public int readShortAdd() {
        this.offset += 2;
        int var1 = ((this.array[this.offset - 1] - 128) & 255) + ((this.array[this.offset - 2] & 255) << 8);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cv")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-553338804")
    @Export("readShortAddLE")
    public int readShortAddLE() {
        this.offset += 2;
        int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 2] - 128) & 255);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("ds")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1567459970")
    public int method7412() {
        this.offset += 3;
        return ((this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8)) + ((this.array[this.offset - 1] & 255) << 16);
    }

    @ObfuscatedName("de")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "614331119")
    @Export("writeIntLE")
    public void writeIntLE(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
    }

    @ObfuscatedName("df")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1428834929")
    @Export("writeIntIME")
    public void writeIntIME(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
        this.array[(++this.offset) - 1] = ((byte) (var1));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
    }

    @ObfuscatedName("db")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1468302894")
    @Export("writeIntME")
    public void writeIntME(int var1) {
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
        this.array[(++this.offset) - 1] = ((byte) (var1));
        this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
    }

    @ObfuscatedName("dr")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-942513755")
    @Export("readUnsignedIntLE")
    public int readUnsignedIntLE() {
        this.offset += 4;
        return (((this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8)) + ((this.array[this.offset - 2] & 255) << 16)) + ((this.array[this.offset - 1] & 255) << 24);
    }

    @ObfuscatedName("dq")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "39")
    @Export("readUnsignedIntIME")
    public int readUnsignedIntIME() {
        this.offset += 4;
        return ((((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8)) + (this.array[this.offset - 3] & 255)) + ((this.array[this.offset - 1] & 255) << 16);
    }

    @ObfuscatedName("dj")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1726545229")
    @Export("readUnsignedIntME")
    public int readUnsignedIntME() {
        this.offset += 4;
        return ((((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16)) + (this.array[this.offset - 2] & 255)) + ((this.array[this.offset - 3] & 255) << 24);
    }

    @ObfuscatedName("dz")
    @ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "0")
    @Export("readBytesAdd")
    public void readBytesAdd(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < (var3 + var2); ++var4) {
            var1[var4] = ((byte) (this.array[(++this.offset) - 1] - 128));
        }
    }

    @ObfuscatedName("du")
    @ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "-67")
    public void method7564(byte[] var1, int var2, int var3) {
        for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4) {
            var1[var4] = ((byte) (this.array[(++this.offset) - 1] - 128));
        }
    }
}