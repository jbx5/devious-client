import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("WorldMapSection")
public interface WorldMapSection {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljw;B)V",
      garbageValue = "-27"
   )
   @Export("expandBounds")
   void expandBounds(WorldMapArea var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-779320103"
   )
   @Export("containsCoord")
   boolean containsCoord(int var1, int var2, int var3);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "207934155"
   )
   @Export("containsPosition")
   boolean containsPosition(int var1, int var2);

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-1684969021"
   )
   @Export("getBorderTileLengths")
   int[] getBorderTileLengths(int var1, int var2, int var3);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)Llt;",
      garbageValue = "2016097062"
   )
   @Export("coord")
   Coord coord(int var1, int var2);

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "1437872186"
   )
   @Export("read")
   void read(Buffer var1);
}
