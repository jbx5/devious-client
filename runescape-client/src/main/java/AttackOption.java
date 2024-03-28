import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1358(2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1360(4);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -780233271
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "-530117581"
	)
	public static class180 method2678() {
		return class180.field1917;
	}
}
