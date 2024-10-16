import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 1044660289
	)
	static int field34;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1041997149
	)
	int field35;
	@ObfuscatedName("as")
	@Export("name")
	String name;
	@ObfuscatedName("ae")
	boolean field32;
	@ObfuscatedName("am")
	boolean field33;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field35 = var1;
		this.name = var2;
		this.field32 = var3;
		this.field33 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1934732865"
	)
	boolean method70() {
		return this.field32;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field35;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "4007"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1313325334"
	)
	boolean method77() {
		return this.field33;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "1177143826"
	)
	static boolean method83(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
