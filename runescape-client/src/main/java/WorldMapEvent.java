import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapEvent")
public class WorldMapEvent {
   @ObfuscatedName("r")
   @Export("SpriteBuffer_spritePalette")
   public static int[] SpriteBuffer_spritePalette;
   @ObfuscatedName("gb")
   static int[] field3020;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 778380961
   )
   @Export("mapElement")
   public int mapElement;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("coord1")
   public Coord coord1;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("coord2")
   public Coord coord2;

   @ObfuscatedSignature(
      descriptor = "(ILky;Lky;)V"
   )
   public WorldMapEvent(int var1, Coord var2, Coord var3) {
      this.mapElement = var1;
      this.coord1 = var2;
      this.coord2 = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lcy;",
      garbageValue = "1028083236"
   )
   static class86[] method5404() {
      return new class86[]{class86.field1100, class86.field1098, class86.field1106, class86.field1101, class86.field1097};
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "687315637"
   )
   public static int method5405(int var0, int var1, int var2) {
      int var3 = Actor.method2362(var2 - var1 + 1);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }
}
