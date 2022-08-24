import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.math.BigInteger;
import net.runelite.mapping.Export;
@ObfuscatedName("qr")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("n")
	@Export("crc32Table")
	static int[] crc32Table = new int[256];

	@ObfuscatedName("a")
	@Export("crc64Table")
	static long[] crc64Table;

	@ObfuscatedName("k")
	@Export("array")
	public byte[] array;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1795921631)
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
		this.array = ArchiveDiskActionHandler.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1764416929")
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			WorldMapData_1.ByteArrayPool_release(this.array);
		}
		this.array = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1915818947")
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "119")
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "74")
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-72")
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("at")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 40)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 32)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 24)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 16)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 8)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1)));
	}

	@ObfuscatedName("bq")
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-36")
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1003366182")
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-721485512")
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V", garbageValue = "-1379588442")
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = DefaultsGroup.method6839(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		int var3 = this.offset;
		byte[] var5 = this.array;
		int var6 = this.offset;
		int var7 = var1.length();
		int var8 = var6;
		for (int var9 = 0; var9 < var7; ++var9) {
			char var10 = var1.charAt(var9);
			if (var10 <= 127) {
				var5[var8++] = ((byte) (var10));
			} else if (var10 <= 2047) {
				var5[var8++] = ((byte) (192 | var10 >> 6));
				var5[var8++] = ((byte) (128 | var10 & 63));
			} else {
				var5[var8++] = ((byte) (224 | var10 >> 12));
				var5[var8++] = ((byte) (128 | var10 >> 6 & 63));
				var5[var8++] = ((byte) (128 | var10 & 63));
			}
		}
		int var4 = var8 - var6;
		this.offset = var4 + var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-416671839")
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "973037689")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "86")
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "12")
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = ((byte) (var1 >> 8));
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1055230457")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1788689105")
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1009141318")
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "1900344023")
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2109416823")
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "76")
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
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "3")
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2131643014")
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(I)J", garbageValue = "2087656534")
	@Export("readLong")
	public long readLong() {
		long var1 = ((long) (this.readInt())) & 4294967295L;
		long var3 = ((long) (this.readInt())) & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "(I)F", garbageValue = "-1947413679")
	public float method7740() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2140414999")
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "1")
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1593523976")
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;
		while (this.array[++this.offset - 1] != 0) {
		} 
		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "0")
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
			return var3 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1176842476")
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
				String var3 = class155.method3173(this.array, this.offset, var2);
				this.offset += var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-1347382902")
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1791266795")
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "56437292")
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '耀';
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "764188397")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '老';
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "1")
	public int readIncrSmallSmart() {
		int var1 = 0;
		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}
		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-146391413")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "650858821")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2038161509")
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];
		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}
		return var2 | var1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1636623700")
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "([IB)V", garbageValue = "-50")
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = "([II)V", garbageValue = "1441782561")
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "([IIII)V", garbageValue = "1013272337")
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "([IIIB)V", garbageValue = "-24")
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = "-993415767")
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1068645456")
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class282.method5435(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-853618098")
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = class282.method5435(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1596036812")
	public void writeByteAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "1")
	public void writeByteNeg(int var1) {
		this.array[++this.offset - 1] = ((byte) (0 - var1));
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-30")
	public void writeByteSub(int var1) {
		this.array[++this.offset - 1] = ((byte) (128 - var1));
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "8676")
	public int readUnsignedByteAdd() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
	public int readUnsignedByteNeg() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-395870938")
	public int readUnsignedByteSub() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "-26268727")
	public byte readByteAdd() {
		return ((byte) (this.array[++this.offset - 1] - 128));
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "-1217115908")
	public byte readByteNeg() {
		return ((byte) (0 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "34153829")
	public byte readByteSub() {
		return ((byte) (128 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1503573008")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2089807290")
	public void writeShortAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1363453178")
	public void writeShortAddLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-798319323")
	public int readUnsignedShortLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1118370619")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "84")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1895545337")
	public int readShortLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1928317338")
	public int readShortAdd() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "1109")
	public int readShortAddLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "-1032")
	public void writeMediumLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-844786428")
	public int readMediumME() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1998969031")
	public int readUnsignedMediumRME() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "774127570")
	public void writeIntLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1875833485")
	public void writeIntIME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1142876030")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1018502212")
	public int readUnsignedIntLE() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
	public int readUnsignedIntIME() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-611411034")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-202977831")
	public void readBytesLE(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}
	}
}