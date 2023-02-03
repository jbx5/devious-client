import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Calendar")
public class Calendar {
   @ObfuscatedName("f")
   @Export("MONTH_NAMES_ENGLISH_GERMAN")
   public static final String[][] MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   @ObfuscatedName("w")
   @Export("DAYS_OF_THE_WEEK")
   public static final String[] DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfuscatedName("v")
   @Export("Calendar_calendar")
   public static java.util.Calendar Calendar_calendar;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Loj;"
   )
   static Bounds field3727;
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = 356855855
   )
   @Export("currentPort")
   static int currentPort;
   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "[Lrs;"
   )
   @Export("crossSprites")
   static SpritePixels[] crossSprites;

   static {
      java.util.Calendar.getInstance();
      Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }
}
