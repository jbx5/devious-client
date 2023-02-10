import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapSection")
public interface WorldMapSection {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "1606915966"
   )
   @Export("expandBounds")
   void expandBounds(WorldMapArea var1);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1059252076"
   )
   @Export("containsCoord")
   boolean containsCoord(int var1, int var2, int var3);

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1209851870"
   )
   @Export("containsPosition")
   boolean containsPosition(int var1, int var2);

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-1188894867"
   )
   @Export("getBorderTileLengths")
   int[] getBorderTileLengths(int var1, int var2, int var3);

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(III)Lko;",
      garbageValue = "-1946236139"
   )
   @Export("coord")
   Coord coord(int var1, int var2);

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "158933591"
   )
   @Export("read")
   void read(Buffer var1);
}
