import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsb;",
		garbageValue = "12"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "524737236"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
