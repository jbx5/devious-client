import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public final class class386 {
   @ObfuscatedName("at")
   @Export("base37Table")
   static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("an")
   static long[] field4401 = new long[12];

   static {
      for(int var0 = 0; var0 < field4401.length; ++var0) {
         field4401[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;S)V",
      garbageValue = "24146"
   )
   public static void method7207(AbstractArchive var0) {
      DbTableType.field4983 = var0;
   }
}
