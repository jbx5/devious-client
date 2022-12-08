import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -606144137
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 453228853
   )
   @Export("x")
   public int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 141048333
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Lky;)V"
   )
   public Coord(Coord var1) {
      this.plane = var1.plane;
      this.x = var1.x;
      this.y = var1.y;
   }

   public Coord(int var1, int var2, int var3) {
      this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "15"
   )
   @Export("packed")
   public int packed() {
      return class140.method3104(this.plane, this.x, this.y);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lky;I)Z",
      garbageValue = "-2001881010"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord var1) {
      if (this.plane != var1.plane) {
         return false;
      } else if (this.x != var1.x) {
         return false;
      } else {
         return this.y == var1.y;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "4"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public int hashCode() {
      return this.packed();
   }

   public String toString() {
      return this.toString(",");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }
}
