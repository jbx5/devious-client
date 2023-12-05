import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("Language")
public class Language implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -126881359
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field4412;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -656646349
	)
	static int field4410;
	@ObfuscatedName("ac")
	final String field4407;
	@ObfuscatedName("al")
	@Export("language")
	final String language;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 680948119
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4417, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4417, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4417, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4417, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4416, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4416, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4417, 6, "MX");
		Language[] var0 = method7189();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lok;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4407 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1714564751"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfa;",
		garbageValue = "-1038072000"
	)
	static class132[] method7187() {
		return new class132[]{class132.field1549, class132.field1550, class132.field1551, class132.field1552, class132.field1557, class132.field1554};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lof;",
		garbageValue = "0"
	)
	static Language[] method7189() {
		return new Language[]{Language_PT, Language_ES_MX, Language_FR, Language_EN, Language_NL, Language_DE, Language_ES};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FFFFFFFFB)V",
		garbageValue = "1"
	)
	static void method7200(class131 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if ((double)var9 != 0.0D) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1531 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if ((double)var12[0] < 0.0D) {
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) {
					var12[1] = 1.0F;
				}

				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) {
					var12[1] = 1.0F - var12[1];
					if (var12[0] < 0.0F) {
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) {
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) {
						float var15 = (float)(1.0D + ((double)var12[1] - 2.0D) * (double)var12[1] + (double)(var12[0] * (var12[1] + (var12[0] - 2.0F))));
						if (var15 + class127.field1484 > 0.0F) {
							if (class127.field1484 + var12[0] < 1.3333334F) {
								float var16 = var12[0] - 2.0F;
								float var17 = var12[0] - 1.0F;
								float var18 = (float)Math.sqrt((double)(var16 * var16 - var17 * var17 * 4.0F));
								float var19 = (-var16 + var18) * 0.5F;
								if (var12[1] + class127.field1484 > var19) {
									var12[1] = var19 - class127.field1484;
								} else {
									var19 = 0.5F * (-var16 - var18);
									if (var12[1] < class127.field1484 + var19) {
										var12[1] = class127.field1484 + var19;
									}
								}
							} else {
								var12[0] = 1.3333334F - class127.field1484;
								var12[1] = 0.33333334F - class127.field1484;
							}
						}
					}

					var12[1] = 1.0F - var12[1];
				}

				if (var12[0] != var13) {
					var2 = var12[0] * var9 + var1;
					if (0.0D != (double)var13) {
						var6 = var5 + var12[0] * (var6 - var5) / var13;
					}
				}

				if (var12[1] != var14) {
					float var10000 = var1 + var12[1] * var9;
					if ((double)var14 != 1.0D) {
						var7 = (float)((double)var8 - (1.0D - (double)var12[1]) * (double)(var8 - var7) / (1.0D - (double)var14));
					}
				}

				var0.field1538 = var1;
				var0.field1533 = var4;
				class145.method3246(0.0F, var12[0], var12[1], 1.0F, var0);
				Canvas.method334(var5, var6, var7, var8, var0);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lof;",
		garbageValue = "15"
	)
	public static Language method7190(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "458832274"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return WorldMapData_0.getNextWorldListWorld();
	}
}
