import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1385(2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1384(4);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1126248633
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Lth;I)Lth;",
		garbageValue = "1072922823"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = ModeWhere.method7432(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lue;",
		garbageValue = "-646650341"
	)
	public static class534 method2792(int var0) {
		int var1 = class532.field5282[var0];
		if (var1 == 1) {
			return class534.field5290;
		} else if (var1 == 2) {
			return class534.field5286;
		} else {
			return var1 == 3 ? class534.field5284 : null;
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	static final boolean method2786() {
		return Client.isMenuOpen;
	}
}
