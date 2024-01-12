import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ag")
	@Export("name")
	public final String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1224767023
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
