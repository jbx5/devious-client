import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public final class class292 {
   @ObfuscatedName("aw")
   static final HashMap field3358 = new HashMap();
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;

   static {
      java.util.Calendar.getInstance(method5717("Europe/London"));
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
      garbageValue = "-1017888567"
   )
   static TimeZone method5717(String var0) {
      synchronized(field3358) {
         TimeZone var2 = (TimeZone)field3358.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3358.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-964267539"
   )
   @Export("isWorldMapEvent")
   public static boolean isWorldMapEvent(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
