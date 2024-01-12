import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field4844;
	@ObfuscatedName("af")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1789862284"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
