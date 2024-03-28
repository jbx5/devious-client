import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class165 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldg;",
		garbageValue = "449816066"
	)
	static class90[] method3400() {
		return new class90[]{class90.field1101, class90.field1107, class90.field1100, class90.field1105, class90.field1098};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-55941866"
	)
	static final int method3401(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
