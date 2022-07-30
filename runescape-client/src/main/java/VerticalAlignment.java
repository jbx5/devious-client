import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fd")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lfd;")
	field1952(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lfd;")
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lfd;")
	field1953(2, 2);
	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 854922769)
	@Export("value")
	public final int value;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1866966667)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1309846733")
	static String method3505() {
		return class260.clientPreferences.method2326() ? Calendar.method5512(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(descriptor = "(IIIIIB)V", garbageValue = "16")
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		MusicPatchNode2.scrollBarSprites[0].drawAt(var0, var1);
		MusicPatchNode2.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field557);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field559);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field561);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field561);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field561);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field561);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field560);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field560);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field560);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field560);
	}
}