/*
 * Copyright (c) 2020, Noodleeater <noodleeater4@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

/**
 * Represents a byte buffer
 */
public interface Buffer extends Node
{
	byte[] getPayload();

	int getOffset();

	/**
	 * Use this api to write to byte buffers
	 */

	void writeBoolean(boolean i);

	void writeBuffer(Buffer i);

	void writeByte(int i);

	void writeByteAdd(int i);

	void writeByteNeg(int i);

	void writeByteSub(int i);

	void writeBytes(byte[] var1, int var2, int var3);

	void writeCESU8(CharSequence i);

	int writeCrc(int i);

	void writeInt(int i);

	void writeIntIME(int i);

	void writeIntLE(int i);

	void writeIntME(int i);

	void writeLengthByte(int i);

	void writeLengthInt(int i);

	void writeLengthShort(long i);

	void writeLong(long i);

	void writeLongMedium(int i);
	
	void writeMedium(int i);

	void writeShort(int i);

	void writeShortAdd(int i);

	void writeShortAddLE(int i);

	void writeShortLE(int i);

	void writeSmartByteShort(int i);

	void writeStringCp1252NullCircumfixed(String i);

	void writeStringCp1252NullTerminated(String i);

	void writeVarInt(int i);
}
