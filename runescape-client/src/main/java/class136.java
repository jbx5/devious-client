import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class136 {
	@ObfuscatedName("am")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static Bounds field1626;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lic;",
		garbageValue = "2083266518"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class559.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
