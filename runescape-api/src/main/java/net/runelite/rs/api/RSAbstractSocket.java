package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSAbstractSocket
{
	@Import("isAvailable")
	boolean isAvailable(int num);

	@Import("read")
	int read(byte[] var1, int var2, int var3);

	@Import("write")
	void write(byte[] var1, int var2, int var3);
}
