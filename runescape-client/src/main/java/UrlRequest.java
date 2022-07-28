import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cb")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("tz")
	@ObfuscatedGetter(intValue = 99769733)
	static int field1350;

	@ObfuscatedName("lb")
	@ObfuscatedSignature(descriptor = "Lhm;")
	@Export("textureProvider")
	static TextureProvider textureProvider;

	@ObfuscatedName("mo")
	@ObfuscatedGetter(intValue = -1080470825)
	@Export("menuY")
	static int menuY;

	@ObfuscatedName("o")
	@Export("url")
	final URL url;

	@ObfuscatedName("q")
	@Export("isDone0")
	volatile boolean isDone0;

	@ObfuscatedName("f")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "63")
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "-1645564466")
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1459888208")
	public String method2638() {
		return this.url.toString();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-407109329")
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}