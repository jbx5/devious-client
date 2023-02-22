import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("Calendar")
public class Calendar {
   @ObfuscatedName("aj")
   @Export("MONTH_NAMES_ENGLISH_GERMAN")
   static final String[][] MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   @ObfuscatedName("al")
   @Export("DAYS_OF_THE_WEEK")
   static final String[] DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfuscatedName("ac")
   @Export("Calendar_calendar")
   static java.util.Calendar Calendar_calendar;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = 2115286599
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;

   static {
      java.util.Calendar.getInstance();
      Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)Lic;",
      garbageValue = "426761497"
   )
   public static class208 method6292() {
      return Client.field712;
   }
}
