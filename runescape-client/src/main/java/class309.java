import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class309 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -90398499
   )
   public int field3493;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 216034339
   )
   public int field3489;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1912484269
   )
   public int field3491;

   class309() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "1826563573"
   )
   @Export("sortItemsByName")
   static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }
}
