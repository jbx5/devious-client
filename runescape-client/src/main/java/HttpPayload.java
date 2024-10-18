import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "1116588540"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "60"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
