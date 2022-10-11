import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kp")
public class class295 {
   @ObfuscatedName("ts")
   @ObfuscatedGetter(
      intValue = 963392047
   )
   static int field3402;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -374813941
   )
   public int field3399;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 971643155
   )
   public int field3401;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 942829249
   )
   public int field3400;

   class295() {
   }

   @ObfuscatedName("a")
   public static String method5712(long var0) {
      Calendar.Calendar_calendar.setTime(new Date(var0));
      int var2 = Calendar.Calendar_calendar.get(7);
      int var3 = Calendar.Calendar_calendar.get(5);
      int var4 = Calendar.Calendar_calendar.get(2);
      int var5 = Calendar.Calendar_calendar.get(1);
      int var6 = Calendar.Calendar_calendar.get(11);
      int var7 = Calendar.Calendar_calendar.get(12);
      int var8 = Calendar.Calendar_calendar.get(13);
      return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }
}
