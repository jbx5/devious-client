import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   static AbstractSocket field2411;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2014052669
   )
   @Export("z")
   int z;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1505259263
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1210489279
   )
   @Export("y")
   int y;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -2996017257920083777L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1777713769
   )
   @Export("flags")
   int flags;

   FloorDecoration() {
   }
}
