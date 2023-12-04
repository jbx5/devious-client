import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("HttpContent")
public interface HttpContent {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
	HttpContentType type();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	byte[] vmethod8587() throws UnsupportedEncodingException;
}
