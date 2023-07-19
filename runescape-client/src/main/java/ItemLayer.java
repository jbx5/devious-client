import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -228605615
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1908534059
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1502481589
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 8507773082671382891L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1910314939
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldw;",
		garbageValue = "-986587125"
	)
	static AttackOption[] method4293() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1336, AttackOption.field1340};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Luc;",
		garbageValue = "643907738"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field5151, FillMode.field5149};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2136056509"
	)
	public static int method4292(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
