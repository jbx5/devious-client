import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class249 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2633;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2628;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2629;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2630;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2631;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2632;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public static final class249 field2627;
	@ObfuscatedName("ad")
	public static int[] field2636;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field2637;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1846520311
	)
	public final int field2635;

	static {
		field2633 = new class249(0);
		field2628 = new class249(1);
		field2629 = new class249(2);
		field2630 = new class249(3);
		field2631 = new class249(4);
		field2632 = new class249(5);
		field2627 = new class249(6);
		field2636 = null;
	}

	class249(int var1) {
		this.field2635 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "62"
	)
	public static int method4980(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1656085230"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class129.scrollBarSprites[0].drawAt(var0, var1);
		class129.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field611);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field585);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field587);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field587);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field587);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field587);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field717);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field717);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field717);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field717);
	}
}
