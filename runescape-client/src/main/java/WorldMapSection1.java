import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = 1991455261
   )
   @Export("cameraYaw")
   static int cameraYaw;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -829573619
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -971196123
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1316060349
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 20920713
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1187251441
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 922994349
   )
   @Export("regionEndY")
   int regionEndY;

   WorldMapSection1() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;S)V",
      garbageValue = "2518"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.regionEndX) {
         var1.regionLowX = this.regionEndX;
      }

      if (var1.regionHighX < this.regionEndX) {
         var1.regionHighX = this.regionEndX;
      }

      if (var1.regionLowY > this.regionEndY) {
         var1.regionLowY = this.regionEndY;
      }

      if (var1.regionHighY < this.regionEndY) {
         var1.regionHighY = this.regionEndY;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "24"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
         return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1979934212"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2141431041"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lki;",
      garbageValue = "1"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
         int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2122367720"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "568981163"
   )
   @Export("postRead")
   void postRead() {
   }
}
