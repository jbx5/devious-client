import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lpe;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1010949943
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("av")
	final String field4625;
	@ObfuscatedName("ab")
	@Export("language")
	final String language;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1567769779
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4633, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4633, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4633, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4633, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4635, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4635, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4633, 6, "MX");
		Language[] var0 = method7425();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4625 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2045870852"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "1546153796"
	)
	public static void method7424(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpe;",
		garbageValue = "559601510"
	)
	static Language[] method7425() {
		return new Language[]{Language_FR, Language_ES, Language_DE, Language_PT, Language_NL, Language_ES_MX, Language_EN};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lpe;",
		garbageValue = "2116073364"
	)
	public static Language method7414(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-455981923"
	)
	static void method7421() {
		if (Strings.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-742358029"
	)
	static final void method7420() {
		if (class171.ClanChat_inClanChat) {
			if (Decimator.friendsChat != null) {
				Decimator.friendsChat.sort();
			}

			for (int var0 = 0; var0 < class511.topLevelWorldView.playerUpdateManager.playerCount; ++var0) {
				Player var1 = class511.topLevelWorldView.players[class511.topLevelWorldView.playerUpdateManager.playerIndices[var0]];
				var1.clearIsInFriendsChat();
			}

			class171.ClanChat_inClanChat = false;
		}

	}
}
