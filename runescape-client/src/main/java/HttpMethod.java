import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 818729035
	)
	static int field36;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 2033208005
	)
	static int field38;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 906294433
	)
	int field32;
	@ObfuscatedName("ab")
	@Export("name")
	String name;
	@ObfuscatedName("aw")
	boolean field34;
	@ObfuscatedName("ad")
	boolean field35;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field32 = var1;
		this.name = var2;
		this.field34 = var3;
		this.field35 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field32;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-123083614"
	)
	boolean method68() {
		return this.field34;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1604233669"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2110880381"
	)
	boolean method70() {
		return this.field35;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-638846758"
	)
	public static long method83(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "64"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		FriendSystem.scrollBarSprites[0].drawAt(var0, var1);
		FriendSystem.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field560);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field590);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field592);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field592);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field592);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field592);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field624);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field624);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field624);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field624);
	}
}
