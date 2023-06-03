import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldMapSection")
public interface WorldMapSection {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lji;I)V",
      garbageValue = "941109568"
   )
   @Export("expandBounds")
   void expandBounds(WorldMapArea var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "4"
   )
   @Export("containsCoord")
   boolean containsCoord(int var1, int var2, int var3);

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1852131731"
   )
   @Export("containsPosition")
   boolean containsPosition(int var1, int var2);

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "1844199592"
   )
   @Export("getBorderTileLengths")
   int[] getBorderTileLengths(int var1, int var2, int var3);

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)Lmg;",
      garbageValue = "1427373477"
   )
   @Export("coord")
   Coord coord(int var1, int var2);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "52437899"
   )
   @Export("read")
   void read(Buffer var1);
}
