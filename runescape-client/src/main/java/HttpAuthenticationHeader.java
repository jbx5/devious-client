import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("BASIC")
	static final HttpAuthenticationHeader BASIC;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("bm")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aj")
	@Export("key")
	final String key;

	static {
		BASIC = new HttpAuthenticationHeader("Basic");
		BEARER = new HttpAuthenticationHeader("Bearer");
	}

	HttpAuthenticationHeader(String var1) {
		this.key = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-110"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1395652670"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-139734262"
	)
	static int method8417(int var0, Script var1, boolean var2) {
		return 2;
	}
}
