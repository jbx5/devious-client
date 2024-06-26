import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1613497083
	)
	int field33;
	@ObfuscatedName("aj")
	@Export("name")
	String name;
	@ObfuscatedName("av")
	boolean field34;
	@ObfuscatedName("ab")
	boolean field42;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field33 = var1;
		this.name = var2;
		this.field34 = var3;
		this.field42 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field33;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1679958433"
	)
	boolean method66() {
		return this.field34;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1923575133"
	)
	boolean method68() {
		return this.field42;
	}
}
