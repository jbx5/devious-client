import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("Skills")
public class Skills {
   @ObfuscatedName("f")
   @Export("Skills_enabled")
   public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("c")
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "74"
   )
   public static void method6245() {
      ByteArrayPool.field4393.clear();
      ByteArrayPool.field4393.add(100);
      ByteArrayPool.field4393.add(5000);
      ByteArrayPool.field4393.add(10000);
      ByteArrayPool.field4393.add(30000);
   }
}
