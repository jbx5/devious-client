import java.awt.Component;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class NewStuff {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 5255399683281497365L
   )
   public long field2021;
   @ObfuscatedName("w")
   int[] field2018;
   @ObfuscatedName("v")
   short[] field2019;
   @ObfuscatedName("s")
   short[] field2020;

   public NewStuff(long var1, int[] var3, short[] var4, short[] var5) {
      this.field2021 = var1;
      this.field2018 = var3;
      this.field2019 = var4;
      this.field2020 = var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "-2"
   )
   static void method3717(Component var0) {
      var0.removeMouseListener(MouseHandler.MouseHandler_instance);
      var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Lra;",
      garbageValue = "25"
   )
   public static PrivateChatMode method3719(int var0) {
      PrivateChatMode[] var1 = class33.method495();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PrivateChatMode var3 = var1[var2];
         if (var0 == var3.field5071) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2040479563"
   )
   public static boolean method3716(int var0) {
      return (var0 >> 22 & 1) != 0;
   }

   @ObfuscatedName("lv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2132622819"
   )
   static void method3718(String var0) {
      GraphicsDefaults.field4623 = var0;

      try {
         String var1 = Decimator.client.getParameter(Integer.toString(18));
         String var2 = Decimator.client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var4 = var3 + "; Expires=";
            long var6 = class153.method3317() + 94608000000L;
            Calendar.Calendar_calendar.setTime(new Date(var6));
            int var8 = Calendar.Calendar_calendar.get(7);
            int var9 = Calendar.Calendar_calendar.get(5);
            int var10 = Calendar.Calendar_calendar.get(2);
            int var11 = Calendar.Calendar_calendar.get(1);
            int var12 = Calendar.Calendar_calendar.get(11);
            int var13 = Calendar.Calendar_calendar.get(12);
            int var14 = Calendar.Calendar_calendar.get(13);
            String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
            var3 = var4 + var5 + "; Max-Age=" + 94608000L;
         }

         class26.method387(Decimator.client, "document.cookie=\"" + var3 + "\"");
      } catch (Throwable var15) {
      }

   }
}
