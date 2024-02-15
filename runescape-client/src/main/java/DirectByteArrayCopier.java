import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("aq")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1949273929"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-994274734"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lic;",
		garbageValue = "772879827"
	)
	static class230[] method6962() {
		return new class230[]{class230.field2450, class230.field2448, class230.field2449, class230.field2447, class230.field2445, class230.field2451, class230.field2446};
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "1514000923"
	)
	public static NodeDeque method6959() {
		return Client.scriptEvents;
	}
}
