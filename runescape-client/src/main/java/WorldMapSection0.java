import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lsq;"
   )
   @Export("JagexCache_idxFiles")
   public static BufferedFile[] JagexCache_idxFiles;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1231275311
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -390490095
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -306335475
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -128512007
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 848276355
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -952647425
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 588661787
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 164871379
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 538303021
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1837510813
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -461035981
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1826647347
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -751434405
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 224437129
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   WorldMapSection0() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lji;I)V",
      garbageValue = "941109568"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "4"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
         return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "52437899"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1968592402"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("ni")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1788544754"
   )
   static void method5416(int var0) {
      Client.oculusOrbState = var0;
   }
}
