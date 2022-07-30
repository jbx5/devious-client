import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("nj")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-17")
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-717230257")
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "354179744")
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "([BIIB)I", garbageValue = "42")
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "-1292249553")
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1642633675")
	@Export("close")
	public abstract void close();
}