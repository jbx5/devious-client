import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("ao")
   public static short[] field3036;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -124192589
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 261919341
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1051560981
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1357840947
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -872906085
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1758851113
   )
   @Export("regionEndY")
   int regionEndY;

   WorldMapSection1() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lji;I)V",
      garbageValue = "941109568"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "4"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1852131731"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "1844199592"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)Lmg;",
      garbageValue = "1427373477"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "52437899"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "10"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;B)V",
      garbageValue = "-118"
   )
   public static void method5501(AbstractArchive var0) {
      InvDefinition.InvDefinition_archive = var0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)[B",
      garbageValue = "57"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }
}
