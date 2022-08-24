import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
@ObfuscatedName("jm")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("rs")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;

	@ObfuscatedName("s")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "-946242295")
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "1451224319")
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}
}