import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("worldSelectBackSprites")
   static SpritePixels[] worldSelectBackSprites;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2105423835
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -261827881
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1668522289
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1086992079
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 729085761
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1309504773
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -524055721
   )
   int field2835;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -478777111
   )
   int field2832;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2071494357
   )
   int field2836;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 2054424291
   )
   int field2837;

   WorldMapSection2() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljw;B)V",
      garbageValue = "-27"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2835) {
         var1.regionLowX = this.field2835;
      }

      if (var1.regionHighX < this.field2836) {
         var1.regionHighX = this.field2836;
      }

      if (var1.regionLowY > this.field2832) {
         var1.regionLowY = this.field2832;
      }

      if (var1.regionHighY < this.field2837) {
         var1.regionHighY = this.field2837;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-779320103"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "207934155"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field2835 && var1 >> 6 <= this.field2836 && var2 >> 6 >= this.field2832 && var2 >> 6 <= this.field2837;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-1684969021"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2835 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2832 * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)Llt;",
      garbageValue = "2016097062"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.field2835 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2832 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "1437872186"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field2835 = var1.readUnsignedShort();
      this.field2832 = var1.readUnsignedShort();
      this.field2836 = var1.readUnsignedShort();
      this.field2837 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1750529073"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "30"
   )
   public static final synchronized long method4844() {
      long var0 = System.currentTimeMillis();
      if (var0 < class289.field3305) {
         class289.field3306 += class289.field3305 - var0;
      }

      class289.field3305 = var0;
      return class289.field3306 + var0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(CS)Z",
      garbageValue = "21072"
   )
   public static boolean method4833(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = class365.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2040870462"
   )
   static void method4824() {
      for(ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var0.obj != null) {
            var0.set();
         }
      }

   }
}
