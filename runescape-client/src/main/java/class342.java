import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class342 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1173953551"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return ClanChannelMember.ByteArrayPool_getArrayBool(var0, false);
	}
}
