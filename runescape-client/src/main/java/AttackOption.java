import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1384(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1385(2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1390(4);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1536688327
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
