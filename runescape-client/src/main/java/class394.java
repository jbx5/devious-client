import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class394 {
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = 1915324789
   )
   static int field4443;
   @ObfuscatedName("at")
   public char field4438;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 406816295
   )
   public int field4441 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -493099907
   )
   public int field4440 = 0;

   class394() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIIZIB)J",
      garbageValue = "85"
   )
   @Export("calculateTag")
   public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }
}
