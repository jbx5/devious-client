import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lpx;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ce")
	@Export("otp")
	static String otp;
	@ObfuscatedName("at")
	final String field4655;
	@ObfuscatedName("au")
	@Export("language")
	final String language;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1433910639
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4661, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4661, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4661, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4661, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4658, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4658, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4661, 6, "MX");
		Language[] var0 = method7762();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpc;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4655 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1280956978"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpx;",
		garbageValue = "-419870162"
	)
	static Language[] method7762() {
		return new Language[]{Language_ES_MX, Language_EN, Language_FR, Language_ES, Language_PT, Language_NL, Language_DE};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lpx;",
		garbageValue = "1905490669"
	)
	public static Language method7757(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}
}
