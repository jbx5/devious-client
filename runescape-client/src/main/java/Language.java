import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lu")
@Implements("Language")
public class Language implements MouseWheel {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_EN")
    public static final Language Language_EN;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_DE")
    static final Language Language_DE;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_FR")
    public static final Language Language_FR;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_PT")
    static final Language Language_PT;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_NL")
    static final Language Language_NL;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_ES")
    public static final Language Language_ES;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Llu;")
    @Export("Language_ES_MX")
    static final Language Language_ES_MX;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "[Llu;")
    @Export("Language_valuesOrdered")
    public static final Language[] Language_valuesOrdered;

    @ObfuscatedName("bn")
    @ObfuscatedSignature(descriptor = "Lkf;")
    static GameBuild field3990;

    @ObfuscatedName("w")
    final String field3985;

    @ObfuscatedName("v")
    @Export("language")
    final String language;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -5412249)
    @Export("id")
    final int id;

    static {
        Language_EN = new Language("EN", "en", "English", ModeWhere.field3995, 0, "GB");
        Language_DE = new Language("DE", "de", "German", ModeWhere.field3995, 1, "DE");
        Language_FR = new Language("FR", "fr", "French", ModeWhere.field3995, 2, "FR");
        Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3995, 3, "BR");
        Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3994, 4, "NL");
        Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3994, 5, "ES");
        Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3995, 6, "MX");
        Language[] var0 = method5808();
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

    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lll;ILjava/lang/String;)V")
    Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
        this.field3985 = var1;
        this.language = var2;
        this.id = var5;
        if (var6 != null) {
            new Locale(var2.substring(0, 2), var6);
        } else {
            new Locale(var2.substring(0, 2));
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "408804890")
    @Export("getLanguage")
    String getLanguage() {
        return this.language;
    }

    public String toString() {
        return this.getLanguage().toLowerCase(Locale.ENGLISH);
    }

    @ObfuscatedName("c")
    public static final void method5813(long var0) {
        if (var0 > 0L) {
            if ((var0 % 10L) == 0L) {
                long var2 = var0 - 1L;
                try {
                    Thread.sleep(var2);
                } catch (InterruptedException var8) {
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var7) {
                }
            } else {
                try {
                    Thread.sleep(var0);
                } catch (InterruptedException var6) {
                }
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "392166386")
    public static boolean method5810() {
        ReflectionCheck var0 = ((ReflectionCheck) (class33.reflectionChecks.last()));
        return var0 != null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)[Llu;", garbageValue = "1896848864")
    static Language[] method5808() {
        return new Language[]{ Language_ES_MX, Language_EN, Language_FR, Language_DE, Language_NL, Language_ES, Language_PT };
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "33")
    public static void method5812() {
        PlayerComposition.PlayerAppearance_cachedModels.clear();
    }

    @ObfuscatedName("lm")
    @ObfuscatedSignature(descriptor = "(Ljz;B)I", garbageValue = "19")
    @Export("getWidgetFlags")
    static int getWidgetFlags(Widget var0) {
        IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.get((((long) (var0.id)) << 32) + ((long) (var0.childIndex)))));
        return var1 != null ? var1.integer : var0.flags;
    }
}