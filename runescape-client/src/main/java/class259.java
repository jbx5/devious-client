import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class259 implements WorldMapSection {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("ItemDefinition_fontPlain11")
   public static Font ItemDefinition_fontPlain11;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1715398721
   )
   int field2939;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1619423241
   )
   int field2933;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2099636653
   )
   int field2934;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -353578703
   )
   int field2943;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1060882957
   )
   int field2936;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -328437201
   )
   int field2932;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1625942991
   )
   int field2938;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -715393785
   )
   int field2942;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2031852083
   )
   int field2940;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1582030005
   )
   int field2941;

   class259() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lji;I)V",
      garbageValue = "941109568"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2936) {
         var1.regionLowX = this.field2936;
      }

      if (var1.regionHighX < this.field2936) {
         var1.regionHighX = this.field2936;
      }

      if (var1.regionLowY > this.field2932) {
         var1.regionLowY = this.field2932;
      }

      if (var1.regionHighY < this.field2932) {
         var1.regionHighY = this.field2932;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "4"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.field2939 && var1 < this.field2939 + this.field2933) {
         return var2 >= (this.field2934 << 6) + (this.field2938 << 3) && var2 <= (this.field2934 << 6) + (this.field2938 << 3) + 7 && var3 >= (this.field2943 << 6) + (this.field2942 << 3) && var3 <= (this.field2943 << 6) + (this.field2942 << 3) + 7;
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
      return var1 >= (this.field2936 << 6) + (this.field2940 << 3) && var1 <= (this.field2936 << 6) + (this.field2940 << 3) + 7 && var2 >= (this.field2932 << 6) + (this.field2941 << 3) && var2 <= (this.field2932 << 6) + (this.field2941 << 3) + 7;
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
         int[] var4 = new int[]{this.field2936 * 64 - this.field2934 * 64 + var2 + (this.field2940 * 8 - this.field2938 * 8), var3 + (this.field2932 * 64 - this.field2943 * 64) + (this.field2941 * 8 - this.field2942 * 8)};
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
         int var3 = this.field2934 * 64 - this.field2936 * 64 + (this.field2938 * 8 - this.field2940 * 8) + var1;
         int var4 = this.field2943 * 64 - this.field2932 * 64 + var2 + (this.field2942 * 8 - this.field2941 * 8);
         return new Coord(this.field2939, var3, var4);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "52437899"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field2939 = var1.readUnsignedByte();
      this.field2933 = var1.readUnsignedByte();
      this.field2934 = var1.readUnsignedShort();
      this.field2938 = var1.readUnsignedByte();
      this.field2943 = var1.readUnsignedShort();
      this.field2942 = var1.readUnsignedByte();
      this.field2936 = var1.readUnsignedShort();
      this.field2940 = var1.readUnsignedByte();
      this.field2932 = var1.readUnsignedShort();
      this.field2941 = var1.readUnsignedByte();
      this.method5362();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1761590084"
   )
   void method5362() {
   }
}
