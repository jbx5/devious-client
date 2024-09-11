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
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("APPLICATION_X_WWW_FORM_URLENCODED")
	static final HttpContentType APPLICATION_X_WWW_FORM_URLENCODED;
	@ObfuscatedName("am")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		APPLICATION_X_WWW_FORM_URLENCODED = new HttpContentType("application/x-www-form-urlencoded");
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
