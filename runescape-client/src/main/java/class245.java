import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class245 implements WorldMapSection {
   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "Ldi;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = 1069157793
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 533476471
   )
   int field2902;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2004436675
   )
   int field2898;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 254139963
   )
   int field2906;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 11381121
   )
   int field2900;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 757742787
   )
   int field2901;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1233776579
   )
   int field2899;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1852714875
   )
   int field2897;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 7478343
   )
   int field2903;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -602771723
   )
   int field2905;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2118067071
   )
   int field2904;

   class245() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "1606915966"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2901) {
         var1.regionLowX = this.field2901;
      }

      if (var1.regionHighX < this.field2901) {
         var1.regionHighX = this.field2901;
      }

      if (var1.regionLowY > this.field2899) {
         var1.regionLowY = this.field2899;
      }

      if (var1.regionHighY < this.field2899) {
         var1.regionHighY = this.field2899;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "1059252076"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.field2902 && var1 < this.field2902 + this.field2898) {
         return var2 >= (this.field2906 << 6) + (this.field2897 << 3) && var2 <= (this.field2906 << 6) + (this.field2897 << 3) + 7 && var3 >= (this.field2900 << 6) + (this.field2903 << 3) && var3 <= (this.field2900 << 6) + (this.field2903 << 3) + 7;
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
      return var1 >= (this.field2901 << 6) + (this.field2905 << 3) && var1 <= (this.field2901 << 6) + (this.field2905 << 3) + 7 && var2 >= (this.field2899 << 6) + (this.field2904 << 3) && var2 <= (this.field2899 << 6) + (this.field2904 << 3) + 7;
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
         int[] var4 = new int[]{this.field2901 * 64 - this.field2906 * 64 + var2 + (this.field2905 * 8 - this.field2897 * 8), var3 + (this.field2899 * 64 - this.field2900 * 64) + (this.field2904 * 8 - this.field2903 * 8)};
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
         int var3 = this.field2906 * 64 - this.field2901 * 64 + (this.field2897 * 8 - this.field2905 * 8) + var1;
         int var4 = this.field2900 * 64 - this.field2899 * 64 + var2 + (this.field2903 * 8 - this.field2904 * 8);
         return new Coord(this.field2902, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "158933591"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field2902 = var1.readUnsignedByte();
      this.field2898 = var1.readUnsignedByte();
      this.field2906 = var1.readUnsignedShort();
      this.field2897 = var1.readUnsignedByte();
      this.field2900 = var1.readUnsignedShort();
      this.field2903 = var1.readUnsignedByte();
      this.field2901 = var1.readUnsignedShort();
      this.field2905 = var1.readUnsignedByte();
      this.field2899 = var1.readUnsignedShort();
      this.field2904 = var1.readUnsignedByte();
      this.method5231();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "432580282"
   )
   void method5231() {
   }
}
