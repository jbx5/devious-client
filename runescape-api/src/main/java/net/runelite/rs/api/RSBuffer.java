package net.runelite.rs.api;

import net.runelite.api.Buffer;
import net.runelite.mapping.Import;

public interface RSBuffer extends Buffer, RSNode
{
	@Import("array")
	byte[] getPayload();

	@Import("offset")
	int getOffset();

	@Import("offset")
	void setOffset(int offset);

	@Import("readUnsignedByte")
	int readUnsignedByte();

	@Import("readByte")
	byte readByte();

	@Import("readUnsignedShort")
	int readUnsignedShort();

	@Import("readShort")
	int readShort();

	@Import("readInt")
	int readInt();

	@Import("readStringCp1252NullTerminated")
	String readStringCp1252NullTerminated();

	@Import("writeBoolean")
	void writeBoolean(boolean i);

	@Import("writeBuffer")
	void writeBuffer(Buffer i);

	@Import("writeByte")
	void writeByte(int i);

	@Import("writeByteAdd")
	void writeByteAdd(int i);

	@Import("writeByteNeg")
	void writeByteNeg(int i);

	@Import("writeByteSub")
	void writeByteSub(int i);

	@Import("writeBytes")
	void writeBytes(byte[] var1, int var2, int var3);

	@Import("writeCESU8")
	void writeCESU8(CharSequence i);

	@Import("writeCrc")
	int writeCrc(int i);

	@Import("writeInt")
	void writeInt(int i);

	@Import("writeIntIME")
	void writeIntIME(int i);

	@Import("writeIntLE")
	void writeIntLE(int i);

	@Import("writeIntME")
	void writeIntME(int i);

	@Import("writeLengthByte")
	void writeLengthByte(int i);

	@Import("writeLengthInt")
	void writeLengthInt(int i);

	@Import("writeLengthShort")
	void writeLengthShort(int i);

	@Import("writeLong")
	void writeLong(long i);

	@Import("writeLongMedium")
	void writeLongMedium(long i);

	@Import("writeMedium")
	void writeMedium(int i);

	@Import("writeShort")
	void writeShort(int i);

	@Import("writeShortAdd")
	void writeShortAdd(int i);

	@Import("writeShortAddLE")
	void writeShortAddLE(int i);

	@Import("writeShortLE")
	void writeShortLE(int i);

	@Import("writeSmartByteShort")
	void writeSmartByteShort(int i);

	@Import("writeStringCp1252NullCircumfixed")
	void writeStringCp1252NullCircumfixed(String i);

	@Import("writeStringCp1252NullTerminated")
	void writeStringCp1252NullTerminated(String i);

	@Import("writeVarInt")
	void writeVarInt(int i);
}
