import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("js5SocketTask")
   static Task js5SocketTask;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1490859351
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1180089391
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 275577107
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -365078831
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1555384875
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -347980981
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 534868105
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1257977427
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 593688545
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 849738307
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -320125941
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1970066063
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1911161937
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -264659017
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   WorldMapSection0() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljs;I)V",
      garbageValue = "1131699138"
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
      garbageValue = "3"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
         return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "0"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1817267737"
   )
   @Export("postRead")
   void postRead() {
   }
}
