import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lol;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("Widget_cachedModels")
	static class513 Widget_cachedModels;
	@ObfuscatedName("ao")
	final String field4452;
	@ObfuscatedName("ae")
	@Export("language")
	final String language;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1390111945
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4471, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4471, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4471, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4471, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4461, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4461, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4471, 6, "MX");
		Language[] var0 = new Language[]{Language_PT, Language_ES_MX, Language_DE, Language_FR, Language_ES, Language_NL, Language_EN};
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpr;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4452 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-289659104"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
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

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}
}
