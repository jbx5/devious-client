import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1336(2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1340(4);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1525855533
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfj;",
		garbageValue = "-25003"
	)
	static class138 method2668(int var0) {
		class138 var1 = (class138)ClientPreferences.findEnumerated(GZipDecompressor.method9734(), var0);
		if (var1 == null) {
			var1 = class138.field1623;
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static final boolean method2669() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	static final boolean method2660() {
		return Client.isMenuOpen;
	}
}
