import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ag")
	@Export("name")
	public final String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1242609261
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
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

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class150.clientPreferences.method2478()) {
			label40: {
				if (class150.clientPreferences.method2478() == 0) {
					boolean var1 = !class306.field3398.isEmpty();
					if (var1) {
						Archive var2 = class13.archive6;
						if (!class306.field3398.isEmpty()) {
							ArrayList var3 = new ArrayList();
							Iterator var4 = class306.field3398.iterator();

							while (var4.hasNext()) {
								MusicSong var5 = (MusicSong)var4.next();
								var5.field3508 = false;
								var5.field3513 = false;
								var5.field3515 = false;
								var5.musicTrackArchive = var2;
								var5.musicTrackVolume = var0;
								var5.field3511 = 0.0F;
								var3.add(var5);
							}

							UserComparator4.method2858(var3, class306.musicPlayerStatus, class306.field3402, class306.field3403, class306.field3407, false);
						}

						Client.playingJingle = false;
						break label40;
					}
				}

				if (var0 == 0) {
					RouteStrategy.method4227(0, 0);
					Client.playingJingle = false;
				} else {
					class7.method60(var0);
				}
			}

			class150.clientPreferences.method2528(var0);
		}

	}
}
