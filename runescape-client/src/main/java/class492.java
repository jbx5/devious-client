import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public class class492 {
	@ObfuscatedName("am")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "645086624"
	)
	static int method8812(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}
}
