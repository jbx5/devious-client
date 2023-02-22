import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("WorldMapEvent")
public class WorldMapEvent {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1743176151
   )
   @Export("mapElement")
   public int mapElement;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("coord1")
   public Coord coord1;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("coord2")
   public Coord coord2;

   @ObfuscatedSignature(
      descriptor = "(ILlt;Llt;)V"
   )
   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "33"
   )
   static int method5376(int var0, Script var1, boolean var2) {
      return 2;
   }
}
