import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class191 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive7")
	static EvictingDualNodeHashTable archive7;
	@ObfuscatedName("gg")
	static String field1917;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -1127038976
	)
	static int field1922;

	static {
		archive7 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "-1132254955"
	)
	public static void method3628(AbstractArchive var0) {
		class30.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Liw;",
		garbageValue = "0"
	)
	public static HitSplatDefinition method3627(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
