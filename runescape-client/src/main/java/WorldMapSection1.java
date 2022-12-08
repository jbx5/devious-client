import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 897193583
   )
   static int field2998;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1811972457
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -707740511
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 103357569
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 136845125
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2099845231
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1628788577
   )
   @Export("regionEndY")
   int regionEndY;

   WorldMapSection1() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lit;B)V",
      garbageValue = "86"
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "986597458"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
         return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIS)Z",
      garbageValue = "-11823"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "-52"
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(III)Lky;",
      garbageValue = "1584933614"
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1737950913"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1963900296"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIIZIZI)V",
      garbageValue = "-60308064"
   )
   @Export("doWorldSorting")
   static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = World.World_worlds[var6];
         World.World_worlds[var6] = World.World_worlds[var1];
         World.World_worlds[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if (class143.method3134(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
               World var10 = World.World_worlds[var9];
               World.World_worlds[var9] = World.World_worlds[var7];
               World.World_worlds[var7++] = var10;
            }
         }

         World.World_worlds[var1] = World.World_worlds[var7];
         World.World_worlds[var7] = var8;
         doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
         doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
