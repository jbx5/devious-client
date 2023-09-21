import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ar")
	@Export("name")
	public final String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -490511051
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-444646790"
	)
	static char method6812(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6526"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class91.method2347();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
