import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Calendar")
public class Calendar {
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("sceneMinimapSprite")
   static SpritePixels sceneMinimapSprite;
   @ObfuscatedName("a")
   @Export("MONTH_NAMES_ENGLISH_GERMAN")
   static final String[][] MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   @ObfuscatedName("f")
   @Export("DAYS_OF_THE_WEEK")
   static final String[] DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfuscatedName("c")
   @Export("Calendar_calendar")
   static java.util.Calendar Calendar_calendar;

   static {
      java.util.Calendar.getInstance();
      Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1393150588"
   )
   static final void method6226(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      BufferedSink.clientPreferences.method2394(var0);
   }
}
