import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("Skills")
public class Skills {
   @ObfuscatedName("e")
   @Export("Skills_enabled")
   public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("v")
   @Export("Skills_experienceTable")
   public static int[] Skills_experienceTable = new int[99];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         Skills_experienceTable[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lf;",
      garbageValue = "992557969"
   )
   public static class6[] method6369() {
      return new class6[]{class6.field17};
   }
}
