import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 776464435
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Model var12 = this.getModel();
		if (var12 != null) {
			this.height = var12.height;
			int var13 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var14 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var15 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var16 = Rasterizer3D.Rasterizer3D_cosine[var3];
			var12.draw(var1, var13, var14, var15, var16, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ILqg;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, class424 var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.draw(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "90"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class413.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
