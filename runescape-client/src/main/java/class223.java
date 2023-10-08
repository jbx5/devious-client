import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class223 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2355;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2343;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2344;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2353;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2346;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2356;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2354;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2349;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2347;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2351;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2352;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final class223 field2348;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2358;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class223 field2359;
	@ObfuscatedName("aw")
	public static String field2350;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1898440511
	)
	public final int field2342;

	static {
		field2355 = new class223(0);
		field2343 = new class223(1);
		field2344 = new class223(2);
		field2353 = new class223(3);
		field2346 = new class223(4, class209.field2110);
		field2356 = new class223(5);
		field2354 = new class223(6, class209.field2108);
		field2349 = new class223(7, class209.field2105);
		field2347 = new class223(8, class209.field2109);
		field2351 = new class223(9, class209.field2107);
		field2352 = new class223(10, class209.field2111);
		field2348 = new class223(11, class209.field2106);
		field2358 = new class223(12);
		field2359 = new class223(13);
	}

	class223(int var1) {
		this(var1, (class209)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILik;)V"
	)
	class223(int var1, class209 var2) {
		this.field2342 = var1;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-886545953"
	)
	@Export("initCredentials")
	static void initCredentials() {
		class467.accessToken = System.getenv("JX_ACCESS_TOKEN");
		class191.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		LoginScreenAnimation.sessionId = System.getenv("JX_SESSION_ID");
		class155.characterId = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
			var1 = var0;
		} else {
			var1 = "";
		}

		Login.displayName = var1;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "796213891"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class36.scrollBarSprites[0].drawAt(var0, var1);
		class36.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field598);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field801);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field601);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field601);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field601);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field601);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field556);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field556);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field556);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field556);
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(II)Luq;",
		garbageValue = "-134807305"
	)
	static DbTable method4212(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class313.field3396, var0);
		}

		return var1;
	}
}
