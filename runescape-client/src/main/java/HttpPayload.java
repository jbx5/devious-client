import java.io.UnsupportedEncodingException;
<<<<<<<< HEAD:runescape-client/src/main/java/HttpContent.java
========
import net.runelite.mapping.Export;
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpPayload.java
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
<<<<<<<< HEAD:runescape-client/src/main/java/HttpContent.java
@Implements("HttpContent")
public interface HttpContent {
========
@Implements("HttpPayload")
public interface HttpPayload
{
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpPayload.java
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
<<<<<<<< HEAD:runescape-client/src/main/java/HttpContent.java
	HttpContentType type();
========
	@Export("getContentType")
	HttpContentType getContentType();
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpPayload.java

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
