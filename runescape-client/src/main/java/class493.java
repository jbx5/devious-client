import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class493 {
	@ObfuscatedName("ao")
	static final char[] field5002;
	@ObfuscatedName("at")
	static final char[] field5001;

	static {
		field5002 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field5001 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "1089015752"
	)
	static String method8807(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Luk;",
		garbageValue = "-94"
	)
	public static IndexedSprite method8806() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class529.SpriteBuffer_spriteWidth;
		var0.height = class420.SpriteBuffer_spriteHeight;
		var0.xOffset = class529.SpriteBuffer_xOffsets[0];
		var0.yOffset = class152.SpriteBuffer_yOffsets[0];
		var0.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SpriteMask.SpriteBuffer_spriteHeights[0];
		var0.palette = DbTableType.SpriteBuffer_spritePalette;
		var0.pixels = Coord.SpriteBuffer_pixels[0];
		class529.SpriteBuffer_xOffsets = null;
		class152.SpriteBuffer_yOffsets = null;
		HealthBarUpdate.SpriteBuffer_spriteWidths = null;
		SpriteMask.SpriteBuffer_spriteHeights = null;
		DbTableType.SpriteBuffer_spritePalette = null;
		Coord.SpriteBuffer_pixels = null;
		return var0;
	}
}
