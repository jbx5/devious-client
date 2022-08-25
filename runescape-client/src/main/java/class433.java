import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("pk")
public class class433 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpk;")
	public static final class433 field4659 = new class433(0, 0, Integer.class, new class430());

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lpk;")
	public static final class433 field4653 = new class433(2, 1, Long.class, new class432());

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpk;")
	public static final class433 field4655 = new class433(1, 2, String.class, new class434());

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lfa;")
	@Export("clock")
	static Clock clock;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -432754423)
	public final int field4657;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -132270883)
	public final int field4658;

	@ObfuscatedName("q")
	public final Class field4656;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lpo;")
	final class429 field4654;

	@ObfuscatedSignature(descriptor = "(IILjava/lang/Class;Lpo;)V")
	class433(int var1, int var2, Class var3, class429 var4) {
		this.field4657 = var1;
		this.field4658 = var2;
		this.field4656 = var3;
		this.field4654 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4658;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqr;I)Ljava/lang/Object;", garbageValue = "2145801451")
	public Object method7493(Buffer var1) {
		return this.field4654.vmethod7514(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)[Lpk;", garbageValue = "56")
	public static class433[] method7494() {
		return new class433[]{ field4659, field4653, field4655 };
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1615573183")
	static int method7491(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Class;I)Lpk;", garbageValue = "855089675")
	public static class433 method7490(Class var0) {
		class433[] var1 = method7494();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			class433 var3 = var1[var2];
			if (var3.field4656 == var0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lpn;", garbageValue = "9")
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class125.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}
		String var4 = "";
		if (class340.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class340.cacheGamebuild == 34) {
			var4 = "_wip";
		}
		File var5 = new File(BufferedNetSocket.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}
		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Class;I)Lpo;", garbageValue = "482185445")
	public static class429 method7504(Class var0) {
		class433 var1 = method7490(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4654;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-68")
	static final int method7492(int var0, int var1) {
		int var2 = ViewportMouse.method4395(var0 + '넵', var1 + 91923, 4) - 128 + (ViewportMouse.method4395(var0 + 10294, var1 + '鎽', 2) - 128 >> 1) + (ViewportMouse.method4395(var0, var1, 1) - 128 >> 2);
		var2 = ((int) (((double) (var2)) * 0.3)) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}
		return var2;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(descriptor = "(IIIIIB)V", garbageValue = "37")
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		InterfaceParent.scrollBarSprites[0].drawAt(var0, var1);
		InterfaceParent.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field667);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field624);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field537);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field537);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field537);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field537);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field552);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field552);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field552);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field552);
	}
}