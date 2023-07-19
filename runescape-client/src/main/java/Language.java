import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lot;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ah")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("az")
	final String field4384;
	@ObfuscatedName("av")
	@Export("language")
	final String language;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1306254031
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4407, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4407, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4407, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4407, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4394, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4394, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4407, 6, "MX");
		Language[] var0 = method7003();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lox;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4384 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "57"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lot;",
		garbageValue = "2127004251"
	)
	static Language[] method7003() {
		return new Language[]{Language_ES_MX, Language_EN, Language_ES, Language_PT, Language_FR, Language_DE, Language_NL};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1823199498"
	)
	public static void method6993(AbstractArchive var0) {
		DbRowType.field5052 = var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZB)F",
		garbageValue = "53"
	)
	static float method7006(class130 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2999() != 0) {
			float var4 = (float)var0.field1536[0].field1483;
			float var5 = (float)var0.field1536[var0.method2999() - 1].field1483;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1536[0].field1488;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1534 == class128.field1521) {
						if ((double)var10 != 0.0D) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1534 != class128.field1517 && var0.field1534 != class128.field1518) {
						if (var0.field1534 == class128.field1516) {
							var11 = var4 - var1;
							var16 = var0.field1536[0].field1484;
							var17 = var0.field1536[0].field1482;
							var3 = var0.field1536[0].field1488;
							if (0.0D != (double)var16) {
								var3 -= var11 * var17 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1547 == class128.field1521) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1547 != class128.field1517 && var0.field1547 != class128.field1518) {
					if (var0.field1547 == class128.field1516) {
						var11 = var1 - var5;
						var16 = var0.field1536[var0.method2999() - 1].field1486;
						var17 = var0.field1536[var0.method2999() - 1].field1487;
						var3 = var0.field1536[var0.method2999() - 1].field1488;
						if (0.0D != (double)var16) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = ApproximateRouteStrategy.method1245(var0, var11);
				float var18;
				if (var2 && var0.field1534 == class128.field1518) {
					var18 = var0.field1536[var0.method2999() - 1].field1488 - var0.field1536[0].field1488;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1547 == class128.field1518) {
					var18 = var0.field1536[var0.method2999() - 1].field1488 - var0.field1536[0].field1488;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18764"
	)
	@Export("createMenuAction")
	static void createMenuAction(int var0) {
		WorldMapRegion.tempMenuAction = new MenuAction();
		WorldMapRegion.tempMenuAction.param0 = Client.menuArguments1[var0];
		WorldMapRegion.tempMenuAction.param1 = Client.menuArguments2[var0];
		WorldMapRegion.tempMenuAction.opcode = Client.menuOpcodes[var0];
		WorldMapRegion.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		WorldMapRegion.tempMenuAction.itemId = Client.menuItemIds[var0];
		WorldMapRegion.tempMenuAction.action = Client.menuActions[var0];
		WorldMapRegion.tempMenuAction.target = Client.menuTargets[var0];
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1791629405"
	)
	static void method7005(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class410.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
