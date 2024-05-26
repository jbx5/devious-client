import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("aj")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "10"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-2061884702"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class415.World_worlds != null) {
			class197.doWorldSorting(0, class415.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
