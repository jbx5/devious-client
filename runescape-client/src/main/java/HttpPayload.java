import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lsy;",
		garbageValue = "2086749416"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "529214667"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
