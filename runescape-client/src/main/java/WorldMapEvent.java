import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapEvent")
public class WorldMapEvent {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1618357717
   )
   @Export("mapElement")
   public int mapElement;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llb;"
   )
   @Export("coord1")
   public Coord coord1;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llb;"
   )
   @Export("coord2")
   public Coord coord2;

   @ObfuscatedSignature(
      descriptor = "(ILlb;Llb;)V"
   )
   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }
}
