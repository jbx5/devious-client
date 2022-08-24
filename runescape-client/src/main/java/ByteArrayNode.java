import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oe")
@Implements("ByteArrayNode")
public class ByteArrayNode extends Node {
	@ObfuscatedName("s")
	@Export("byteArray")
	public byte[] byteArray;

	public ByteArrayNode(byte[] var1) {
		this.byteArray = var1;
	}
}