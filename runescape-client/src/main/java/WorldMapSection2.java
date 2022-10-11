import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1797168669
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 685698139
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1572279841
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -282528877
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -782908171
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1052989583
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1937495829
   )
   int field2770;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1454618305
   )
   int field2774;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1524054285
   )
   int field2775;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1078508321
   )
   int field2776;

   WorldMapSection2() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;S)V",
      garbageValue = "2518"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2770) {
         var1.regionLowX = this.field2770;
      }

      if (var1.regionHighX < this.field2775) {
         var1.regionHighX = this.field2775;
      }

      if (var1.regionLowY > this.field2774) {
         var1.regionLowY = this.field2774;
      }

      if (var1.regionHighY < this.field2776) {
         var1.regionHighY = this.field2776;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "24"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
      return var1 >> 6 >= this.field2770 && var1 >> 6 <= this.field2775 && var2 >> 6 >= this.field2774 && var2 >> 6 <= this.field2776;
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
         int[] var4 = new int[]{this.field2770 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2774 * 64 - this.regionStartY * 64)};
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
         int var3 = this.regionStartX * 64 - this.field2770 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2774 * 64 + var2;
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
      this.field2770 = var1.readUnsignedShort();
      this.field2774 = var1.readUnsignedShort();
      this.field2775 = var1.readUnsignedShort();
      this.field2776 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1306977104"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Llt;",
      garbageValue = "-33"
   )
   public static GameBuild method4746(int var0) {
      GameBuild[] var1 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE};
      GameBuild[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GameBuild var4 = var2[var3];
         if (var0 == var4.buildId) {
            return var4;
         }
      }

      return null;
   }
}
