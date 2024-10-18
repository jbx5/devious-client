import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class177 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1792887659
	)
	static int field1883;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Lph;II)Lph;",
		garbageValue = "-1875781163"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "1422702121"
	)
	public static TransformationMatrix method3843() {
		synchronized(TransformationMatrix.field4781) {
			if (SecureRandomCallable.field1053 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4781[--SecureRandomCallable.field1053].method8271();
				return TransformationMatrix.field4781[SecureRandomCallable.field1053];
			}
		}
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1357372195"
	)
	static void method3844() {
		TaskHandler.clientPreferences.updateEULA(Client.field537);
	}
}
