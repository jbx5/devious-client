import net.runelite.mapping.*;

import java.math.BigInteger;

@ObfuscatedName("pd")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("r")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("x")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("q")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("f")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	1151186625)

	@Export("offset")
	public int offset;
	static 
	{
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
		this.array = class355.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"21")

	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			ServerPacket.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"367101248")
	@Export("writeByte")

	public void writeByte(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-2088026667")
	@Export("writeShort")

	public void writeShort(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1525771312")
	@Export("writeMedium")

	public void writeMedium(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-45")
	@Export("writeInt")

	public void writeInt(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1));
	}

	@ObfuscatedName("ap")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 40)));
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 32)));
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 24)));
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 16)));
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1 >> 8)));
		this.array[(++this.offset) - 1] = ((byte) ((int) (var1)));
	}

	@ObfuscatedName("ai")
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"-217562349")
	@Export("writeBoolean")

	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;S)V", garbageValue = 
	"768")

	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += NetSocket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[(++this.offset) - 1] = 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-382951646")

	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[(++this.offset) - 1] = 0;
			this.offset += NetSocket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[(++this.offset) - 1] = 0;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;I)V", garbageValue = 
	"1514369282")

	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			char var12 = var1.charAt(var5);
			if (var12 <= 127) {
				++var4;
			} else if (var12 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.array[(++this.offset) - 1] = 0;
		this.writeVarInt(var4);
		var4 = this.offset * 969660737;
		byte[] var6 = this.array;
		int var7 = this.offset;
		int var8 = var1.length();
		int var9 = var7;

		for (int var10 = 0; var10 < var8; ++var10) {
			char var11 = var1.charAt(var10);
			if (var11 <= 127) {
				var6[var9++] = ((byte) (var11));
			} else if (var11 <= 2047) {
				var6[var9++] = ((byte) (192 | (var11 >> 6)));
				var6[var9++] = ((byte) (128 | (var11 & '?')));
			} else {
				var6[var9++] = ((byte) (224 | (var11 >> '\f')));
				var6[var9++] = ((byte) (128 | ((var11 >> 6) & 63)));
				var6[var9++] = ((byte) (128 | (var11 & '?')));
			}
		}

		var5 = var9 - var7;
		this.offset = (var4 + (var5 * 969660737)) * 1151186625;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"969660737")
	@Export("writeBytes")

	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4) {
			this.array[(++this.offset) - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-195792372")
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"41")
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"417023489")
	@Export("writeLengthShort")

	public void writeLengthShort(int var1) {
		if ((var1 >= 0) && (var1 <= 65535)) {
			this.array[(this.offset - var1) - 2] = ((byte) (var1 >> 8));
			this.array[(this.offset - var1) - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1390922400")
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if ((var1 >= 0) && (var1 <= 255)) {
			this.array[(this.offset - var1) - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2016380670")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1383153261")
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1033498878")
	@Export("readUnsignedByte")

	public int readUnsignedByte() {
		return this.array[(++this.offset) - 1] & 255;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = 
	"(I)B", garbageValue = 
	"-1324632769")
	@Export("readByte")

	public byte readByte() {
		return this.array[(++this.offset) - 1];
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1409564993")
	@Export("readUnsignedShort")

	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"657531519")
	@Export("readShort")

	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-107")
	@Export("readMedium")

	public int readMedium() {
		this.offset += 3;
		return (((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255)) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-109")
	@Export("readInt")

	public int readInt() {
		this.offset += 4;
		return ((((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255)) + ((this.array[this.offset - 2] & 255) << 8)) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = 
	"(I)J", garbageValue = 
	"789375778")

	@Export("readLong")
	public long readLong() {
		long var1 = ((long) (this.readInt())) & 4294967295L;
		long var3 = ((long) (this.readInt())) & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = 
	"(I)F", garbageValue = 
	"-1692337724")

	public float method7965() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-82477001")
	@Export("readBoolean")

	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-58")
	@Export("readStringCp1252NullTerminatedOrNull")

	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-75")

	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[(++this.offset) - 1] != 0) {
		} 

		int var2 = (this.offset - var1) - 1;
		return var2 == 0 ? "" : class113.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-74")

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
			return var3 == 0 ? "" : class113.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"37")

	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[(++this.offset) - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			byte[] var4 = this.array;
			int var5 = this.offset;
			char[] var6 = new char[var2];
			int var7 = 0;
			int var8 = var5;

			int var11;
			for (int var9 = var5 + var2; var8 < var9; var6[var7++] = ((char) (var11))) {
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
					if ((var8 < var9) && ((var4[var8] & 192) == 128)) {
						var11 = ((var10 & 31) << 6) | (var4[var8++] & 63);
						if (var11 < 128) {
							var11 = 65533;
						}
					} else {
						var11 = 65533;
					}
				} else if (var10 < 240) {
					if ((((var8 + 1) < var9) && ((var4[var8] & 192) == 128)) && ((var4[var8 + 1] & 192) == 128)) {
						var11 = (((var10 & 15) << 12) | ((var4[var8++] & 63) << 6)) | (var4[var8++] & 63);
						if (var11 < 2048) {
							var11 = 65533;
						}
					} else {
						var11 = 65533;
					}
				} else if (var10 < 248) {
					if (((((var8 + 2) < var9) && ((var4[var8] & 192) == 128)) && ((var4[var8 + 1] & 192) == 128)) && ((var4[var8 + 2] & 192) == 128)) {
						var11 = ((((var10 & 7) << 18) | ((var4[var8++] & 63) << 12)) | ((var4[var8++] & 63) << 6)) | (var4[var8++] & 63);
						if ((var11 >= 65536) && (var11 <= 1114111)) {
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"1458631272")
	@Export("readBytes")

	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4) {
			var1[var4] = this.array[(++this.offset) - 1];
		}

	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-2097208875")
	@Export("readShortSmart")

	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-2140648366")
	@Export("readUShortSmart")

	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"257872718")
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1236920051")
	@Export("readLargeSmart")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-465686583")
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"12345678")
	@Export("readVarInt")

	public int readVarInt() {
		byte var1 = this.array[(++this.offset) - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[(++this.offset) - 1]) {
			var2 = (var2 | (var1 & 127)) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = 
	"([II)V", garbageValue = 
	"111077489")
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = 
	"([II)V", garbageValue = 
	"1617746307")
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = 
	"([IIII)V", garbageValue = 
	"-115673654")
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = 
	"([IIIS)V", garbageValue = 
	"-3424")
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = 
	"-589616199")
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"81")

	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class300.method5768(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"518058436")

	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = class300.method5768(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var2 == var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"482067645")
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1634404689")
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (0 - var1));
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"113")
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (128 - var1));
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1554649771")
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		return (this.array[(++this.offset) - 1] - 128) & 255;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-243060031")
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		return (0 - this.array[(++this.offset) - 1]) & 255;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1303302003")
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		return (128 - this.array[(++this.offset) - 1]) & 255;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = 
	"(B)B", garbageValue = 
	"7")
	@Export("readByteAdd")
	public byte readByteAdd() {
		return ((byte) (this.array[(++this.offset) - 1] - 128));
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = 
	"(B)B", garbageValue = 
	"1")
	@Export("readByteNeg")
	public byte readByteNeg() {
		return ((byte) (0 - this.array[(++this.offset) - 1]));
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = 
	"(B)B", garbageValue = 
	"121")
	@Export("readByteSub")
	public byte readByteSub() {
		return ((byte) (128 - this.array[(++this.offset) - 1]));
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"578446044")
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1274838633")
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-10")
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 + 128));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-89")
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"-4458")
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return ((this.array[this.offset - 1] - 128) & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1088098149")
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 2] - 128) & 255);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-769215047")

	public int method7769() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1347269170")
	@Export("readShortAdd")
	public int readShortAdd() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] - 128) & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-788053700")
	@Export("writeMediumLME")
	public void writeMediumLME(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
		this.array[(++this.offset) - 1] = ((byte) (var1));
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"690490648")

	public int method7877() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8)) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-474982434")

	public int method7805() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8)) + ((this.array[this.offset - 2] & 255) << 16);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1204851511")
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-646414330")
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
		this.array[(++this.offset) - 1] = ((byte) (var1));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-6")
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 16));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 24));
		this.array[(++this.offset) - 1] = ((byte) (var1));
		this.array[(++this.offset) - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"11")
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		this.offset += 4;
		return (((this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8)) + ((this.array[this.offset - 2] & 255) << 16)) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"-7883")
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.offset += 4;
		return ((((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8)) + (this.array[this.offset - 3] & 255)) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1708646906")
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16)) + (this.array[this.offset - 2] & 255)) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"464396885")
	@Export("readBytesReversed")
	public void readBytesReversed(byte[] var1, int var2, int var3) {
		for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[(++this.offset) - 1];
		}

	}
}