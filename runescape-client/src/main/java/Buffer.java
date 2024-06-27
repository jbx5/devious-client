import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ai")
	static int[] field5360;
	@ObfuscatedName("au")
	static long[] field5366;
	@ObfuscatedName("av")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -57914867
	)
	@Export("offset")
	public int offset;

	static {
		field5360 = new int[256];

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

			field5360[var1] = var4;
		}

		field5366 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var0 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var0 & 1L) == 1L) {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}

			field5366[var2] = var0;
		}

	}

	public Buffer(int var1, boolean var2) {
		this.array = WorldMapEvent.ByteArrayPool_getArrayBool(var1, var2);
	}

	public Buffer(int var1) {
		byte[] var2 = WorldMapEvent.ByteArrayPool_getArrayBool(var1, false);
		this.array = var2;
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1043819053"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			Player.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "647509619"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1066866586"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1683573887"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "184111978"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bq")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bd")
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "341973372"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1390716375"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += WorldMapSection0.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "50"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += WorldMapSection0.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "960915900"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
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
		this.offset += ConcurrentMidiTask.method8274(this.array, this.offset, var1);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1999595935"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lvp;S)V",
		garbageValue = "5668"
	)
	@Export("writeBuffer")
	public void writeBuffer(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-511264075"
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
		descriptor = "(IB)V",
		garbageValue = "-105"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1394133610"
	)
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-584464556"
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-606396233"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2135624935"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1177676595"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1158917113"
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1773525196"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "736783092"
	)
	public int method9613() {
		this.offset += 3;
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1879960250"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1257158504"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1934606327"
	)
	public float method9565() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2053261317"
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
		garbageValue = "-1004932699"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : Renderable.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
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
			return var3 == 0 ? "" : Renderable.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-365472197"
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
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) {
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "85"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1730023236"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-32567"
	)
	@Export("readShortSmartSub")
	public int readShortSmartSub() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-292983458"
	)
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

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "823868712"
	)
	@Export("readLargeSmart")
	public int readLargeSmart() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-956172161"
	)
	@Export("readNullableLargeSmart")
	public int readNullableLargeSmart() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "527139757"
	)
	@Export("packBytesToInt")
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "12"
	)
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

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-2147483645"
	)
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

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "888662375"
	)
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

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "110"
	)
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

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "603613831"
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

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "119"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class240.method4537(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1677101568"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = class240.method4537(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-838214214"
	)
	@Export("writeByteAdd")
	public void writeByteAdd(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	@Export("writeByteNeg")
	public void writeByteNeg(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2117851757"
	)
	@Export("writeByteSub")
	public void writeByteSub(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-290427099"
	)
	@Export("readUnsignedByteAdd")
	public int readUnsignedByteAdd() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1946158009"
	)
	@Export("readUnsignedByteNeg")
	public int readUnsignedByteNeg() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1028816017"
	)
	@Export("readUnsignedByteSub")
	public int readUnsignedByteSub() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "9"
	)
	@Export("readByteAdd")
	public byte readByteAdd() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "769603281"
	)
	@Export("readByteNeg")
	public byte readByteNeg() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-16"
	)
	@Export("readByteSub")
	public byte readByteSub() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1744330685"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-2"
	)
	@Export("writeShortAddLE")
	public void writeShortAddLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "591706145"
	)
	@Export("writeShortAdd")
	public void writeShortAdd(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1952279329"
	)
	@Export("readUnsignedShortLE")
	public int readUnsignedShortLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1034359091"
	)
	@Export("readUnsignedShortAdd")
	public int readUnsignedShortAdd() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readUnsignedShortAddLE")
	public int readUnsignedShortAddLE() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2144888009"
	)
	@Export("readShortLE")
	public int readShortLE() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	@Export("readSignedShort")
	public int readSignedShort() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "19774"
	)
	public int method9785() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "668402602"
	)
	public int method9708() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method9760() {
		this.offset += 3;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	public int method9607() {
		this.offset += 3;
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1785809719"
	)
	public int method9593() {
		this.offset += 3;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "303"
	)
	@Export("writeIntLE")
	public void writeIntLE(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "433766154"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-12"
	)
	@Export("writeIntIME")
	public void writeIntIME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("readUnsignedIntLE")
	public int readUnsignedIntLE() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1922053801"
	)
	@Export("readUnsignedIntIME")
	public int readUnsignedIntIME() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1599688104"
	)
	@Export("readUnsignedIntME")
	public int readUnsignedIntME() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1351488164"
	)
	public void method9615(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-296985120"
	)
	public void method9559(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	}
}
