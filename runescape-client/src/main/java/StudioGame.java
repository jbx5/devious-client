import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("StudioGame")
public enum StudioGame implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("aa")
	@Export("name")
	public final String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1225878901
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
