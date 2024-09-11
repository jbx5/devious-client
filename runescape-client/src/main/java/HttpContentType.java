import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final HttpContentType field5084;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("am")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		field5084 = new HttpContentType("text/plain");
		TEXT_PLAIN = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1075959671"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
