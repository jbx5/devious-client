import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -43988345
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1227224767
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1511040213
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("af")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("at")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "106"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "8"
	)
	static final void method6248(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					TextureProvider.Tiles_underlays2[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)I",
		garbageValue = "1"
	)
	static int method6247(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var0.method6770(var1);
			return 1;
		}
	}
}
