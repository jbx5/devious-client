import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "-2007074756"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
