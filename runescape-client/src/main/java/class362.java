import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class362 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-38"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return ServerPacket.ByteArrayPool_getArrayBool(var0, false);
	}
}
