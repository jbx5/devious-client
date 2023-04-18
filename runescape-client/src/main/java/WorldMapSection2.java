import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("qk")
   @ObfuscatedSignature(
      descriptor = "[Lmq;"
   )
   static Widget[] field2877;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2017495751
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 737827993
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 2029294685
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1330856607
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1316670953
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 140125345
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1704678507
   )
   int field2878;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 710831151
   )
   int field2884;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 758652409
   )
   int field2885;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -422674435
   )
   int field2887;

   WorldMapSection2() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljs;I)V",
      garbageValue = "1131699138"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2878) {
         var1.regionLowX = this.field2878;
      }

      if (var1.regionHighX < this.field2885) {
         var1.regionHighX = this.field2885;
      }

      if (var1.regionLowY > this.field2884) {
         var1.regionLowY = this.field2884;
      }

      if (var1.regionHighY < this.field2887) {
         var1.regionHighY = this.field2887;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "3"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1795894381"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field2878 && var1 >> 6 <= this.field2885 && var2 >> 6 >= this.field2884 && var2 >> 6 <= this.field2887;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "21"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2878 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2884 * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIB)Llb;",
      garbageValue = "-4"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.field2878 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2884 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "0"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field2878 = var1.readUnsignedShort();
      this.field2884 = var1.readUnsignedShort();
      this.field2885 = var1.readUnsignedShort();
      this.field2887 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "344912093"
   )
   @Export("postRead")
   void postRead() {
   }
}
