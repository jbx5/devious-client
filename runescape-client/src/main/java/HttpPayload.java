import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsp;",
		garbageValue = "46"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-62513224"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
