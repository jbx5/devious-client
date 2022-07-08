import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.math.BigInteger;
@ObfuscatedName("qt")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("i")
	@Export("crc32Table")
	static int[] crc32Table;

	@ObfuscatedName("t")
	@Export("crc64Table")
	static long[] crc64Table;

	@ObfuscatedName("w")
	@Export("array")
	public byte[] array;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1883142675)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256];
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
				if (1L == (var0 & 1L)) {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}
			crc64Table[var2] = var0;
		}
	}

	public Buffer(int var1) {
		this.array = class292.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-36")
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			class93.ByteArrayPool_release(this.array);
		}
		this.array = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "151339125")
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1514673034")
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "27")
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1371008869")
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
	}

	@ObfuscatedName("be")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 40)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 32)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 24)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 16)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1 >> 8)));
		this.array[++this.offset - 1] = ((byte) ((int) (var1)));
	}

	@ObfuscatedName("bz")
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1418973998")
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "115")
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += class165.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1115427467")
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += class165.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V", garbageValue = "2028256801")
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
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var4);
		var4 = this.offset * 1978245093;
		byte[] var6 = this.array;
		int var7 = this.offset;
		int var8 = var1.length();
		int var9 = var7;
		for (int var10 = 0; var10 < var8; ++var10) {
			char var11 = var1.charAt(var10);
			if (var11 <= 127) {
				var6[var9++] = ((byte) (var11));
			} else if (var11 <= 2047) {
				var6[var9++] = ((byte) (192 | var11 >> 6));
				var6[var9++] = ((byte) (128 | var11 & '?'));
			} else {
				var6[var9++] = ((byte) (224 | var11 >> '\f'));
				var6[var9++] = ((byte) (128 | var11 >> 6 & 63));
				var6[var9++] = ((byte) (128 | var11 & '?'));
			}
		}
		var5 = var9 - var7;
		this.offset = (var5 * 1978245093 + var4) * -1883142675;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "61")
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-1400539464")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-529420858")
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "51")
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = ((byte) (var1 >> 8));
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "1130")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = ((byte) (var1));
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "70")
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1627850032")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-201311106")
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "(B)B", garbageValue = "-71")
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-46298821")
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-249689915")
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
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "1")
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-901053269")
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "(I)J", garbageValue = "2116235370")
	@Export("readLong")
	public long readLong() {
		long var1 = ((long) (this.readInt())) & 4294967295L;
		long var3 = ((long) (this.readInt())) & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "(B)F", garbageValue = "-50")
	public float method7740() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-538390978")
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1745591116")
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "155229795")
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;
		while (this.array[++this.offset - 1] != 0) {
		} 
		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : SceneTilePaint.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "6614")
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
			return var3 == 0 ? "" : SceneTilePaint.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "54")
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-2142383702")
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "56")
	@Export("readShortSmart")
	public int readShortSmartSub64() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2108856121")
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2138528151")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "48")
	public int readIncrSmallSmart() {
		int var1 = 0;
		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}
		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1085782298")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1323097871")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "340244581")
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];
		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}
		return var2 | var1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2025161944")
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(descriptor = "([II)V", garbageValue = "-479355866")
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
	@ObfuscatedSignature(descriptor = "([II)V", garbageValue = "1150734409")
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(descriptor = "([IIII)V", garbageValue = "-610547163")
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "([IIII)V", garbageValue = "271624033")
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", garbageValue = "2045732819")
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1915568779")
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class93.method2404(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "822358683")
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = class93.method2404(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "619719503")
	public void writeByteAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-473301254")
	public void writeByteNeg(int var1) {
		this.array[++this.offset - 1] = ((byte) (0 - var1));
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "666329941")
	public void writeByteSub(int var1) {
		this.array[++this.offset - 1] = ((byte) (128 - var1));
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1632273244")
	public int readUnsignedByteAdd() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1669846078")
	public int readUnsignedByteNeg() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1192268151")
	public int readUnsignedByteSub() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "1645158393")
	public byte readByteAdd() {
		return ((byte) (this.array[++this.offset - 1] - 128));
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "1729941736")
	public byte readByteNeg() {
		return ((byte) (0 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(descriptor = "(I)B", garbageValue = "2111803583")
	public byte readByteSub() {
		return ((byte) (128 - this.array[++this.offset - 1]));
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "9")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-13")
	public void writeShortAdd(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "28")
	public void writeShortAddLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 + 128));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-62610324")
	public int readUnsignedShortLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1993381368")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1071222046")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-8")
	public int readShortLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-123")
	public int readShortAdd() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "36")
	public int readShortAddLE() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
	public int readUnsignedMediumRME() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "1")
	public int readUnsignedMediumLME() {
		this.offset += 3;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "-9895")
	public void writeIntLE(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-408580075")
	public void writeIntIME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-93")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = ((byte) (var1 >> 16));
		this.array[++this.offset - 1] = ((byte) (var1 >> 24));
		this.array[++this.offset - 1] = ((byte) (var1));
		this.array[++this.offset - 1] = ((byte) (var1 >> 8));
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "5")
	public int readUnsignedIntLE() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2015577981")
	public int readUnsignedIntIME() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1155925608")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(descriptor = "([BIIB)V", garbageValue = "-65")
	public void readBytesAdd(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = ((byte) (this.array[++this.offset - 1] - 128));
		}
	}
}