import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("s")
	@Export("name")
	public final String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -306404747
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}
}
