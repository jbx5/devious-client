import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lte;",
		garbageValue = "-757803973"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-115375452"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
