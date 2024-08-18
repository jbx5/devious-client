import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1989801867
	)
	static int field4602;
	@ObfuscatedName("ac")
	final String field4604;
	@ObfuscatedName("ae")
	@Export("language")
	final String language;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 787662213
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4607, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4607, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4607, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4607, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4609, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4609, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4607, 6, "MX");
		Language[] var0 = new Language[]{Language_PT, Language_DE, Language_ES, Language_NL, Language_ES_MX, Language_EN, Language_FR};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lps;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4604 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1430164649"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "756377527"
	)
	static int method7494() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;ZI)V",
		garbageValue = "-1429517432"
	)
	public static void method7504(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lpg;",
		garbageValue = "-1861522812"
	)
	public static Language method7492(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILnv;ZI)V",
		garbageValue = "-1818355471"
	)
	static void method7503(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class343.getWorldMap().getMapArea(var0);
		int var4 = class253.localPlayer.plane;
		int var5 = (class253.localPlayer.x >> 7) + ConcurrentMidiTask.topLevelWorldView.baseX;
		int var6 = (class253.localPlayer.y >> 7) + ConcurrentMidiTask.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class343.getWorldMap().method9082(var3, var7, var1, var2);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1610897042"
	)
	static void method7502(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class328.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				class328.worldView.groundItems[var0][var1][var2] = null;
			}

			HitSplatDefinition.updateItemPile(var0, var1, var2);
		}

	}
}
