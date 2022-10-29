import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class238 implements WorldMapSection {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1371578325
   )
   int field2837;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -668090217
   )
   int field2831;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -978912563
   )
   int field2832;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 888314259
   )
   int field2833;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1944116433
   )
   int field2834;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1335699939
   )
   int field2839;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1652092499
   )
   int field2836;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2138974477
   )
   int field2830;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1021872061
   )
   int field2838;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1968989875
   )
   int field2835;

   class238() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;S)V",
      garbageValue = "2518"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2834) {
         var1.regionLowX = this.field2834;
      }

      if (var1.regionHighX < this.field2834) {
         var1.regionHighX = this.field2834;
      }

      if (var1.regionLowY > this.field2839) {
         var1.regionLowY = this.field2839;
      }

      if (var1.regionHighY < this.field2839) {
         var1.regionHighY = this.field2839;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "24"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.field2837 && var1 < this.field2831 + this.field2837) {
         return var2 >= (this.field2832 << 6) + (this.field2836 << 3) && var2 <= (this.field2832 << 6) + (this.field2836 << 3) + 7 && var3 >= (this.field2833 << 6) + (this.field2830 << 3) && var3 <= (this.field2833 << 6) + (this.field2830 << 3) + 7;
      } else {
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1979934212"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >= (this.field2834 << 6) + (this.field2838 << 3) && var1 <= (this.field2834 << 6) + (this.field2838 << 3) + 7 && var2 >= (this.field2839 << 6) + (this.field2835 << 3) && var2 <= (this.field2839 << 6) + (this.field2835 << 3) + 7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2141431041"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2834 * 64 - this.field2832 * 64 + var2 + (this.field2838 * 8 - this.field2836 * 8), var3 + (this.field2839 * 64 - this.field2833 * 64) + (this.field2835 * 8 - this.field2830 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lki;",
      garbageValue = "1"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.field2832 * 64 - this.field2834 * 64 + (this.field2836 * 8 - this.field2838 * 8) + var1;
         int var4 = this.field2833 * 64 - this.field2839 * 64 + var2 + (this.field2830 * 8 - this.field2835 * 8);
         return new Coord(this.field2837, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2122367720"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field2837 = var1.readUnsignedByte();
      this.field2831 = var1.readUnsignedByte();
      this.field2832 = var1.readUnsignedShort();
      this.field2836 = var1.readUnsignedByte();
      this.field2833 = var1.readUnsignedShort();
      this.field2830 = var1.readUnsignedByte();
      this.field2834 = var1.readUnsignedShort();
      this.field2838 = var1.readUnsignedByte();
      this.field2839 = var1.readUnsignedShort();
      this.field2835 = var1.readUnsignedByte();
      this.method5032();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "321824095"
   )
   void method5032() {
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-931772505"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = WorldMapDecoration.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         ServerPacket.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      class124.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      UserComparator5.selectedSpellFlags = var2;
      class143.invalidateWidget(var4);
   }
}
