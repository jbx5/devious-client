package net.runelite.rs.api;

import net.runelite.api.Buffer;
import net.runelite.mapping.Import;

import java.math.BigInteger;

public interface RSBuffer extends Buffer, RSNode
{
	@Import("array")
	byte[] getPayload();

	@Import("offset")
	int getOffset();

	@Import("offset")
	void setOffset(int offset);

	@Import("checkCrc")
	boolean checkCrc();

	@Import("encryptRsa")
	void encryptRsa(BigInteger var1, BigInteger var2);

	@Import("packBytesToInt")
	int packBytesToInt();

	@Import("readBoolean")
	boolean readBoolean();

	@Import("readByte")
	byte readByte();

	@Import("readByteAdd")
	byte readByteAdd();

	@Import("readByteNeg")
	byte readByteNeg();

	@Import("readByteSub")
	byte readByteSub();

	@Import("readBytes")
	void readBytes(byte[] var1, int var2, int var3);

	//@Import("readBytesLE")
	//void readBytesLE(byte[] var1, int var2, int var3);

	@Import("readCESU8")
	String readCESU8();

	@Import("readIncrSmallSmart")
	int readIncrSmallSmart();

	@Import("readInt")
	int readInt();

	@Import("readLargeSmart")
	int readLargeSmart();

	@Import("readLong")
	long readLong();

	@Import("readMedium")
	int readMedium();

	@Import("readNullableLargeSmart")
	int readNullableLargeSmart();

	@Import("readShort")
	int readShort();

	@Import("readShortLE")
	int readShortLE();

	@Import("readShortSmartSub")
	int readShortSmartSub();

	@Import("readStringCp1252NullCircumfixed")
	String readStringCp1252NullCircumfixed();

	@Import("readStringCp1252NullTerminated")
	String readStringCp1252NullTerminated();

	@Import("readStringCp1252NullTerminatedOrNull")
	String readStringCp1252NullTerminatedOrNull();

	@Import("readUShortSmart")
	int readUShortSmart();

	@Import("readUnsignedByte")
	int readUnsignedByte();

	@Import("readUnsignedByteAdd")
	int readUnsignedByteAdd();

	@Import("readUnsignedByteNeg")
	int readUnsignedByteNeg();

	@Import("readUnsignedByteSub")
	int readUnsignedByteSub();

	@Import("readUnsignedIntIME")
	int readUnsignedIntIME();

	@Import("readUnsignedIntLE")
	int readUnsignedIntLE();

	@Import("readUnsignedIntME")
	int readUnsignedIntME();

	@Import("readUnsignedShort")
	int readUnsignedShort();

	@Import("readUnsignedShortAdd")
	int readUnsignedShortAdd();

	@Import("readUnsignedShortAddLE")
	int readUnsignedShortAddLE();

	@Import("readUnsignedShortLE")
	int readUnsignedShortLE();

	@Import("readVarInt")
	int readVarInt();

	@Import("releaseArray")
	void releaseArray();

	@Import("writeBoolean")
	void writeBoolean(boolean var1);

	@Import("writeBuffer")
	void writeBuffer(Buffer var1);

	@Import("writeByte")
	void writeByte(int var1);

	@Import("writeByteAdd")
	void writeByteAdd(int var1);

	@Import("writeByteNeg")
	void writeByteNeg(int var1);

	@Import("writeByteSub")
	void writeByteSub(int var1);

	@Import("writeBytes")
	void writeBytes(byte[] var1, int var2, int var3);

	@Import("writeCESU8")
	void writeCESU8(CharSequence var1);

	@Import("writeCrc")
	int writeCrc(int var1);

	@Import("writeInt")
	void writeInt(int var1);

	@Import("writeIntIME")
	void writeIntIME(int var1);

	@Import("writeIntLE")
	void writeIntLE(int var1);

	@Import("writeIntME")
	void writeIntME(int var1);

	@Import("writeLengthByte")
	void writeLengthByte(int var1);

	@Import("writeLengthInt")
	void writeLengthInt(int var1);

	@Import("writeLengthShort")
	void writeLengthShort(int var1);

	@Import("writeLong")
	void writeLong(long var1);

	@Import("writeLongMedium")
	void writeLongMedium(long var1);

	@Import("writeMedium")
	void writeMedium(int var1);

	@Import("writeShort")
	void writeShort(int var1);

	@Import("writeShortAdd")
	void writeShortAdd(int var1);

	@Import("writeShortAddLE")
	void writeShortAddLE(int var1);

	@Import("writeShortLE")
	void writeShortLE(int var1);

	@Import("writeSmartByteShort")
	void writeSmartByteShort(int var1);

	@Import("writeStringCp1252NullCircumfixed")
	void writeStringCp1252NullCircumfixed(String var1);

	@Import("writeStringCp1252NullTerminated")
	void writeStringCp1252NullTerminated(String var1);

	@Import("writeVarInt")
	void writeVarInt(int var1);

	@Import("xteaDecrypt")
	void xteaDecrypt(int[] var1, int var2, int var3);

	@Import("xteaDecryptAll")
	void xteaDecryptAll(int[] var1);

	@Import("xteaEncrypt")
	void xteaEncrypt(int[] var1, int var2, int var3);

	@Import("xteaEncryptAll")
	void xteaEncryptAll(int[] var1);
}
