import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static Fonts field4063;
	@ObfuscatedName("at")
	@Export("name")
	public final String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1627568649
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
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
