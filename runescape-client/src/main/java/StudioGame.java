import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("af")
	@Export("name")
	public final String name;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -648630575
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
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-698538677"
	)
	static final void method7437() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = var3.players[var1[var4]];
				if (var5 != null) {
					class425.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
