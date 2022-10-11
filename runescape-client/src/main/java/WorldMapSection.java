import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("WorldMapSection")
public interface WorldMapSection {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;S)V",
      garbageValue = "2518"
   )
   @Export("expandBounds")
   void expandBounds(WorldMapArea var1);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "24"
   )
   @Export("containsCoord")
   boolean containsCoord(int var1, int var2, int var3);

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1979934212"
   )
   @Export("containsPosition")
   boolean containsPosition(int var1, int var2);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2141431041"
   )
   @Export("getBorderTileLengths")
   int[] getBorderTileLengths(int var1, int var2, int var3);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lki;",
      garbageValue = "1"
   )
   @Export("coord")
   Coord coord(int var1, int var2);

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2122367720"
   )
   @Export("read")
   void read(Buffer var1);
}
