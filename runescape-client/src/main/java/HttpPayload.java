import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lsd;",
		garbageValue = "14"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "26"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
