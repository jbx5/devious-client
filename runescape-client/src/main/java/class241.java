import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class241 implements WorldMapSection {
   @ObfuscatedName("ik")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1969178469
   )
   int field2903;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 615846431
   )
   int field2898;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -853915891
   )
   int field2899;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -43926615
   )
   int field2897;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 226314255
   )
   int field2905;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -207940669
   )
   int field2901;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 910146715
   )
   int field2904;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 2086561209
   )
   int field2900;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1092240015
   )
   int field2902;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1048164915
   )
   int field2906;

   class241() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lit;B)V",
      garbageValue = "86"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2905) {
         var1.regionLowX = this.field2905;
      }

      if (var1.regionHighX < this.field2905) {
         var1.regionHighX = this.field2905;
      }

      if (var1.regionLowY > this.field2901) {
         var1.regionLowY = this.field2901;
      }

      if (var1.regionHighY < this.field2901) {
         var1.regionHighY = this.field2901;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "986597458"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.field2903 && var1 < this.field2903 + this.field2898) {
         return var2 >= (this.field2899 << 6) + (this.field2904 << 3) && var2 <= (this.field2899 << 6) + (this.field2904 << 3) + 7 && var3 >= (this.field2897 << 6) + (this.field2900 << 3) && var3 <= (this.field2897 << 6) + (this.field2900 << 3) + 7;
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
      return var1 >= (this.field2905 << 6) + (this.field2902 << 3) && var1 <= (this.field2905 << 6) + (this.field2902 << 3) + 7 && var2 >= (this.field2901 << 6) + (this.field2906 << 3) && var2 <= (this.field2901 << 6) + (this.field2906 << 3) + 7;
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
         int[] var4 = new int[]{this.field2905 * 64 - this.field2899 * 64 + var2 + (this.field2902 * 8 - this.field2904 * 8), var3 + (this.field2901 * 64 - this.field2897 * 64) + (this.field2906 * 8 - this.field2900 * 8)};
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
         int var3 = this.field2899 * 64 - this.field2905 * 64 + (this.field2904 * 8 - this.field2902 * 8) + var1;
         int var4 = this.field2897 * 64 - this.field2901 * 64 + var2 + (this.field2900 * 8 - this.field2906 * 8);
         return new Coord(this.field2903, var3, var4);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1737950913"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field2903 = var1.readUnsignedByte();
      this.field2898 = var1.readUnsignedByte();
      this.field2899 = var1.readUnsignedShort();
      this.field2904 = var1.readUnsignedByte();
      this.field2897 = var1.readUnsignedShort();
      this.field2900 = var1.readUnsignedByte();
      this.field2905 = var1.readUnsignedShort();
      this.field2902 = var1.readUnsignedByte();
      this.field2901 = var1.readUnsignedShort();
      this.field2906 = var1.readUnsignedByte();
      this.method5169();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "556947124"
   )
   void method5169() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-31"
   )
   public static void method5186() {
      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

   }
}
