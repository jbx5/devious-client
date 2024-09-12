import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 189845045
	)
	static int field5024;

	AbstractSocket() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-516422994"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1596036696"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1561207827"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "126"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1082282557"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2011680949"
	)
	@Export("close")
	public abstract void close();
}
