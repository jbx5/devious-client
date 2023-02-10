import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("iw")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 626739277
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 462528053
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1808578733
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1090582517
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1337123697
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1869420189
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -547983943
   )
   int field2836;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -950632927
   )
   int field2835;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1695178763
   )
   int field2841;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1110945225
   )
   int field2842;

   WorldMapSection2() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "1606915966"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2836) {
         var1.regionLowX = this.field2836;
      }

      if (var1.regionHighX < this.field2841) {
         var1.regionHighX = this.field2841;
      }

      if (var1.regionLowY > this.field2835) {
         var1.regionLowY = this.field2835;
      }

      if (var1.regionHighY < this.field2842) {
         var1.regionHighY = this.field2842;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1059252076"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1209851870"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field2836 && var1 >> 6 <= this.field2841 && var2 >> 6 >= this.field2835 && var2 >> 6 <= this.field2842;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-1188894867"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2836 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2835 * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(III)Lko;",
      garbageValue = "-1946236139"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.field2836 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2835 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "158933591"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field2836 = var1.readUnsignedShort();
      this.field2835 = var1.readUnsignedShort();
      this.field2841 = var1.readUnsignedShort();
      this.field2842 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1264343644"
   )
   @Export("postRead")
   void postRead() {
   }
}
