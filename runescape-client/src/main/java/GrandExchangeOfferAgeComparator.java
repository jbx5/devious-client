import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;B)I",
		garbageValue = "122"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "71"
	)
	public static char method6156(char var0) {
		switch(var0) { // L: 16
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 72
		case '#':
		case '[':
		case ']':
			return var0; // L: 76
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 27
		case 'Ç':
		case 'ç':
			return 'c'; // L: 67
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 59
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 37
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 62
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 50
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 85
		case 'ß':
			return 'b'; // L: 64
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 30
		default:
			return Character.toLowerCase(var0); // L: 39
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1985359771"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "571864509"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 134

		try {
			var0 = SceneTilePaint.getPreferencesFile("", class153.field1729.name, true); // L: 136
			Buffer var1 = Player.clientPreferences.toBuffer(); // L: 137
			var0.write(var1.array, 0, var1.offset); // L: 138
		} catch (Exception var3) { // L: 140
		}

		try {
			if (var0 != null) { // L: 142
				var0.closeSync(true); // L: 143
			}
		} catch (Exception var2) { // L: 146
		}

	} // L: 147
}
