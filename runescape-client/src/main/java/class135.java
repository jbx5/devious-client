import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class135 {
	@ObfuscatedName("av")
	static int[][] field1601;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static class455 field1600;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lig;",
		garbageValue = "-825741403"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1370825623"
	)
	public static int method3050(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}
}
