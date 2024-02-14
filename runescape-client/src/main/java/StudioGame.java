import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("aa")
	@Export("name")
	public final String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -882546409
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
