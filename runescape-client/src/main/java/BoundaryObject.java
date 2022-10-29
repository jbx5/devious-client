import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("z")
   @Export("ByteArrayPool_alternativeSizes")
   public static int[] ByteArrayPool_alternativeSizes;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 299140565
   )
   @Export("z")
   int z;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 746117995
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2113556951
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -56851093
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1231755129
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = -2635937448103982411L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -973581693
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(CIB)Ljava/lang/String;",
      garbageValue = "8"
   )
   static String method4642(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }
}
