import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field4435;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1015843523
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("ab")
	final String field4431;
	@ObfuscatedName("am")
	@Export("language")
	final String language;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 314658107
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4446, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4446, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4446, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4446, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4441, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4441, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4446, 6, "MX");
		Language[] var0 = method7155();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lor;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4431 = var1;
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
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-351070004"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1873739638"
	)
	static int method7161(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596579775"
	)
	public static void method7159() {
		class191.archive7.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)[Loa;",
		garbageValue = "-24301"
	)
	static Language[] method7155() {
		return new Language[]{Language_ES, Language_PT, Language_FR, Language_NL, Language_EN, Language_DE, Language_ES_MX};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Loa;",
		garbageValue = "1742943694"
	)
	public static Language method7160(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "0"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			Calendar.method6761(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			TextureProvider.method4884(class199.archive8, var0.properties);
		}

		MouseHandler.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		UserComparator3.field1471 = var0.field833;
		ObjectComposition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class363.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class164.currentPort = ObjectComposition.worldPort;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmp;B)V",
		garbageValue = "-9"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var3 * var8 + var9 * var2 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			ParamComposition.redHintArrowSprite.method9687(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			SecureRandomFuture.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
