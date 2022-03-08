import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jx")
@Implements("Calendar")
public class Calendar {
    @ObfuscatedName("c")
    @Export("MONTH_NAMES_ENGLISH_GERMAN")
    public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;

    @ObfuscatedName("l")
    @Export("DAYS_OF_THE_WEEK")
    public static final String[] DAYS_OF_THE_WEEK;

    @ObfuscatedName("s")
    @Export("Calendar_calendar")
    public static java.util.Calendar Calendar_calendar;

    @ObfuscatedName("mx")
    @ObfuscatedGetter(intValue = -943283195)
    @Export("menuWidth")
    static int menuWidth;

    static {
        MONTH_NAMES_ENGLISH_GERMAN = new String[][]{ new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, new String[]{ "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, new String[]{ "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, new String[]{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
        DAYS_OF_THE_WEEK = new String[]{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        java.util.Calendar.getInstance();
        Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;I)V", garbageValue = "-406761643")
    public static void method5310(AbstractArchive var0) {
        VarbitComposition.VarbitDefinition_archive = var0;
    }

    @ObfuscatedName("gs")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V", garbageValue = "-9554865")
    @Export("drawLoadingMessage")
    static final void drawLoadingMessage(String var0, boolean var1) {
        if (Client.showLoadingMessages) {
            byte var2 = 4;
            int var3 = var2 + 6;
            int var4 = var2 + 6;
            int var5 = Players.fontPlain12.lineWidth(var0, 250);
            int var6 = Players.fontPlain12.lineCount(var0, 250) * 13;
            Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, (var2 + var5) + var2, (var2 + var6) + var2, 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, (var2 + var5) + var2, (var6 + var2) + var2, 16777215);
            Players.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
            SceneTilePaint.method4268(var3 - var2, var4 - var2, (var2 + var5) + var2, (var2 + var6) + var2);
            if (var1) {
                PcmPlayer.rasterProvider.drawFull(0, 0);
            } else {
                class127.method2765(var3, var4, var5, var6);
            }
        }
    }
}