import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static Archive field2932;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -775946595
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2093535297
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -800807313
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1297788611
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -579844915
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1584822871
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 606340351
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 590623623
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1894538493
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1241213671
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 676896973
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 233278855
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1590440195
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -305259083
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   WorldMapSection0() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lit;B)V",
      garbageValue = "86"
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "986597458"
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
      descriptor = "(IIS)Z",
      garbageValue = "-11823"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1737950913"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "49"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-408404102"
   )
   static void method5228() {
      if (class29.loadWorlds()) {
         Login.worldSelectOpen = true;
         Login.worldSelectPage = 0;
         Login.worldSelectPagesCount = 0;
      }

   }
}
