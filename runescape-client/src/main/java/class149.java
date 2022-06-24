import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ey")
public class class149 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIIB)Lbi;", garbageValue = "-90")
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = Huffman.method5480(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var6 = (-3 - var2 << 8) + var0;
			var5 = Huffman.method5480(var6, var0);
			return var5 != null ? var5 : null;
		}
	}
}