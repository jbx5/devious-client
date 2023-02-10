import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1702426343
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1776682101
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1316025563
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1604457337
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 188484319
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 234003925
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1412477315
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 422903357
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1972947631
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1821981
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -804200583
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -136029891
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1664098361
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1465681713
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   WorldMapSection0() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "1606915966"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.newX) {
         var1.regionLowX = this.newX;
      }

      if (var1.regionHighX < this.newX) {
         var1.regionHighX = this.newX;
      }

      if (var1.regionLowY > this.newY) {
         var1.regionLowY = this.newY;
      }

      if (var1.regionHighY < this.newY) {
         var1.regionHighY = this.newY;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1059252076"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
         return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "158933591"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.oldZ = var1.readUnsignedByte();
      this.newZ = var1.readUnsignedByte();
      this.oldX = var1.readUnsignedShort();
      this.oldChunkXLow = var1.readUnsignedByte();
      this.oldChunkXHigh = var1.readUnsignedByte();
      this.oldY = var1.readUnsignedShort();
      this.oldChunkYLow = var1.readUnsignedByte();
      this.oldChunkYHigh = var1.readUnsignedByte();
      this.newX = var1.readUnsignedShort();
      this.newChunkXLow = var1.readUnsignedByte();
      this.newChunkXHigh = var1.readUnsignedByte();
      this.newY = var1.readUnsignedShort();
      this.newChunkYLow = var1.readUnsignedByte();
      this.newChunkYHigh = var1.readUnsignedByte();
      this.postRead();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "808293169"
   )
   @Export("postRead")
   void postRead() {
   }
}
