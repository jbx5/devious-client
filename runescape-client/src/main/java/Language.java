import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lj")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_EN")
	public static final Language Language_EN;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_DE")
	static final Language Language_DE;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_FR")
	public static final Language Language_FR;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_PT")
	static final Language Language_PT;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_NL")
	static final Language Language_NL;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_ES")
	public static final Language Language_ES;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Llj;")
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "[Llj;")
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;

	@ObfuscatedName("mt")
	@ObfuscatedGetter(intValue = -695588165)
	@Export("menuX")
	static int menuX;

	@ObfuscatedName("j")
	final String field4120;

	@ObfuscatedName("h")
	@Export("language")
	final String language;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1032541303)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4138, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4138, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4138, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4138, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4131, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4131, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4138, 6, "MX");
		Language[] var0 = new Language[]{ Language_ES, Language_FR, Language_PT, Language_EN, Language_DE, Language_ES_MX, Language_NL };
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

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llk;ILjava/lang/String;)V")
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4120 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-340818487")
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIII)Lqj;", garbageValue = "-1481678220")
	static SpritePixels method6088(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = ((long) (var2 << 16 | var0 << 8 | var1));
		return ((SpritePixels) (var3.get(var4)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Llj;", garbageValue = "1424526549")
	public static Language method6080(int var0) {
		return var0 >= 0 && var0 < Language.Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIZIZI)V", garbageValue = "2081959468")
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class93.World_worlds[var6];
			class93.World_worlds[var6] = class93.World_worlds[var1];
			class93.World_worlds[var1] = var8;
			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = class93.World_worlds[var9];
				int var12 = class329.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = class329.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}
				if (var10 <= 0) {
					World var14 = class93.World_worlds[var9];
					class93.World_worlds[var9] = class93.World_worlds[var7];
					class93.World_worlds[var7++] = var14;
				}
			}
			class93.World_worlds[var1] = class93.World_worlds[var7];
			class93.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("j")
	static int method6087(long var0) {
		return ((int) (var0 >>> 14 & 3L));
	}
}