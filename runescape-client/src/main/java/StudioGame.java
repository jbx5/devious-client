import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("am")
	@Export("name")
	public final String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -461682725
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
