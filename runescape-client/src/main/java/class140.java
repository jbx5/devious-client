import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public abstract class class140 extends Node {
   class140() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   abstract void vmethod3361(Buffer var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   abstract void vmethod3362(ClanSettings var1);

   @ObfuscatedName("aj")
   public static String method3114(long var0) {
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

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Z",
      garbageValue = "-1531736711"
   )
   static final boolean method3113(int var0, int var1, int var2, int var3, int var4) {
      PendingSpawn var5 = null;

      for(PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
            var5 = var6;
            break;
         }
      }

      if (var5 != null) {
         var5.field1133 = var4;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "71"
   )
   static void method3106(boolean var0) {
      Client.leftClickOpensMenu = var0;
   }
}
