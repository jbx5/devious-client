import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("og")
public final class class369 {
   @ObfuscatedName("aj")
   @Export("base37Table")
   static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("al")
   static long[] field4348 = new long[12];

   static {
      for(int var0 = 0; var0 < field4348.length; ++var0) {
         field4348[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }
}
