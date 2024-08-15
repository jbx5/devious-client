import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "1599165377"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2134421183"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
