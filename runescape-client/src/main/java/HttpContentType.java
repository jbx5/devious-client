import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static final HttpContentType field5131;
	@ObfuscatedName("aj")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		field5131 = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1393979685"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
