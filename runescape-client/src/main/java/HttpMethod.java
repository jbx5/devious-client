import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static JagNetThread field32;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -683626941
	)
	int field33;
	@ObfuscatedName("at")
	@Export("name")
	String name;
	@ObfuscatedName("ab")
	boolean field36;
	@ObfuscatedName("ac")
	boolean field38;

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
		this.field36 = var3;
		this.field38 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field33;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1882357801"
	)
	boolean method68() {
		return this.field36;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "391142984"
	)
	boolean method77() {
		return this.field38;
	}
}
