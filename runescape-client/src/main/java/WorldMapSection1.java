import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 947763427
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1563224291
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -788684191
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1277019967
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1024792075
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 183857153
   )
   @Export("regionEndY")
   int regionEndY;

   WorldMapSection1() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "1606915966"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1059252076"
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
      descriptor = "(III)Z",
      garbageValue = "1209851870"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
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
         int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
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
         int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
         int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "158933591"
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-92"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("w")
   @Export("base37DecodeLong")
   public static String base37DecodeLong(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class366.base37Table[(int)(var6 - 37L * var0)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)[Lle;",
      garbageValue = "1"
   )
   public static StudioGame[] method5371() {
      return new StudioGame[]{StudioGame.stellardawn, StudioGame.runescape, StudioGame.game4, StudioGame.game5, StudioGame.game3, StudioGame.oldscape};
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "809861333"
   )
   static int method5370(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
      }
   }
}
