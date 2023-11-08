import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -211744297
	)
	@Export("js5Port")
	static int js5Port;

	AbstractSocket() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "278911957"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1133909296"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1251290768"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-54"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1734190943"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1195407219"
	)
	@Export("close")
	public abstract void close();
}
