import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ce")
public class class78 {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(descriptor = "Laf;")
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IB)Lfw;", garbageValue = "-14")
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = ((VarpDefinition) (VarpDefinition.VarpDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			VarpDefinition.VarpDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1585294077")
	public static boolean method2054(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field126[var0] : false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-2035745879")
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}