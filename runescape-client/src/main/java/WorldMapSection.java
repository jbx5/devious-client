import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection")
public interface WorldMapSection {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljs;I)V",
      garbageValue = "1131699138"
   )
   @Export("expandBounds")
   void expandBounds(WorldMapArea var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "3"
   )
   @Export("containsCoord")
   boolean containsCoord(int var1, int var2, int var3);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1795894381"
   )
   @Export("containsPosition")
   boolean containsPosition(int var1, int var2);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "21"
   )
   @Export("getBorderTileLengths")
   int[] getBorderTileLengths(int var1, int var2, int var3);

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIB)Llb;",
      garbageValue = "-4"
   )
   @Export("coord")
   Coord coord(int var1, int var2);

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "0"
   )
   @Export("read")
   void read(Buffer var1);
}
