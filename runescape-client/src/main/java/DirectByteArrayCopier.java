import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	static ClanSettings field4026;
	@ObfuscatedName("ac")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-63683089"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-70"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}
}
