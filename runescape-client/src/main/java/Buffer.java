import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.math.BigInteger;
@ObfuscatedName("qw")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("a")
	@Export("crc32Table")
	public static int[] crc32Table = new int[256];

	@ObfuscatedName("n")
	@Export("crc64Table")
	static long[] crc64Table;

	@ObfuscatedName("j")
	@Export("array")
	public byte[] array;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 299978303)
	@Export("offset")
	public int offset;

	static {
		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var4 = var1;
			for (var2 = 0; var2 < 8; ++var2) {
				if ((var4 & 1) == 1) {
					var4 = var4 >>> 1 ^ -306674912;
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
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}
			crc64Table[var2] = var0;
		}
	}

	public Buffer(int var1) {
		this.array = class17.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			StudioGame.ByteArrayPool_release(this.array);
		}
		this.array = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "149670880")
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-69")
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "295087363")
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1402126391")
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("aa")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 40)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 32)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 24)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 16)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 8)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1)));
	}

	@ObfuscatedName("av")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 56)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 48)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 40)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 32)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 24)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 16)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 8)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1)));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1513673417")
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-943834690")
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += GrandExchangeEvents.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-102")
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += GrandExchangeEvents.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V", garbageValue = "-1719962204")
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = SceneTilePaint.method4491(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		this.offset += UserList.method6809(this.array, this.offset, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "1292342221")
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "1263061474")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "126")
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset - var1 - 4] = ((byte) (var1 >> 24));
			this.array[this.offset - var1 - 3] = ((byte) (var1 >> 16));
			this.array[this.offset - var1 - 2] = ((byte) (var1 >> 8));
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-104")
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = ((byte) (var1 >> 8));
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2089354265")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "44")
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1935508627")
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "120")
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(B)B", garbageValue = "1")
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1594859967")
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-727168829")
	@Export("readShort")
	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-781344431")
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1292815006")
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(B)J", garbageValue = "-20")
	@Export("readLong")
	public long readLong() {
		long var1 = ((long) (this.readInt())) & 4294967295L;
		long var3 = ((long) (this.readInt())) & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "(B)F", garbageValue = "75")
	public float readFloat() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "82")
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "892663987")
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-167008570")
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;
		while (this.array[++this.offset - 1] != 0) {
		} 
		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : class269.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-720153019")
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset;
			while (this.array[++this.offset - 1] != 0) {
			} 
			int var3 = this.offset - var2 - 1;
			return var3 == 0 ? "" : class269.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-76")
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "114072681")
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "212930917")
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "16")
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2074407218")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '老';
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-95")
	public int readIncrSmallSmart() {
		int var1 = 0;
		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}
		var1 += var2;
		return var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "468977892")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "8142")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1109780886")
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];
		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}
		return var2 | var1;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1681115749")
	public int packBytesToInt() {
		int var2 = 0;
		int var3 = 0;
		int var1;
		do {
			var1 = this.readUnsignedByte();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while (var1 > 127 );
		return var2;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "([II)V", garbageValue = "-1731472597")
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;
		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;
			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}
			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "([IB)V", garbageValue = "-49")
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;
		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;
			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}
			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "([IIIB)V", garbageValue = "1")
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
			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}
			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}
		this.offset = var4;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "([IIIB)V", garbageValue = "-49")
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
			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}
			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}
		this.offset = var4;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = "-510679906")
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "784373428")
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array;
		int var4 = this.offset;
		int var5 = -1;
		for (int var6 = var1; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255];
		}
		var5 = ~var5;
		this.writeInt(var5);
		return var5;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1779356823")
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		byte[] var2 = this.array;
		int var3 = this.offset;
		int var4 = -1;
		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255];
		}
		var4 = ~var4;
		var5 = this.readInt();
		return var5 == var4;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "2")
	public void writeByteAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-586870412")
	public void writeByteNeg(int var1) {
		this.array[++this.offset - 1] = ((byte) (0 - var1));
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
	public void writeByteSub(int var1) {
		this.array[++this.offset - 1] = ((byte) (128 - var1));
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "87")
	public int readUnsignedByteAdd() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1696217918")
	public int readUnsignedByteNeg() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "-23954")
	public int readUnsignedByteSub() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = "(B)B", garbageValue = "16")
	public byte readByteAdd() {
		return ((byte) (this.array[++this.offset - 1] - 128));
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "(B)B", garbageValue = "33")
	public byte readByteNeg() {
		return ((byte) (0 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "-749760822")
	public byte readByteSub() {
		return ((byte) (128 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-189070896")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-28")
	public void writeShortAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-698118384")
	public void writeShortAddLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1193527637")
	public int readUnsignedShortLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-261678124")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-4")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2132966287")
	public int readShortLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1799807952")
	public int readShortAdd() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1169101152")
	public int readShortAddLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "77")
	public void writeMediumLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1554181487")
	public int readMediumME() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-676670969")
	public int readUnsignedMediumRME() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-37")
	public void writeIntLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1551779613")
	public void writeIntIME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "38911446")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-14")
	public int readUnsignedIntLE() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "144215720")
	public int readUnsignedIntIME() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1492517135")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "-29")
	public void readBytesLE(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}
	}
}