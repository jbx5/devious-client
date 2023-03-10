import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 392246011
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1656122133
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 746959191
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1499687973
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 308206289
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -443053619
   )
   @Export("regionEndY")
   int regionEndY;

   WorldMapSection1() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljw;B)V",
      garbageValue = "-27"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-779320103"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
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
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
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
         int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
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
         int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
         int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
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
      this.postRead();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "10421"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lmy;",
      garbageValue = "1167671998"
   )
   @Export("getWidget")
   public static Widget getWidget(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (class155.Widget_interfaceComponents[var1] == null || class155.Widget_interfaceComponents[var1][var2] == null) {
         boolean var3 = GrandExchangeEvent.loadInterface(var1);
         if (!var3) {
            return null;
         }
      }

      return class155.Widget_interfaceComponents[var1][var2];
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "92"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (GrandExchangeEvent.loadInterface(var0)) {
            Widget[] var1 = class155.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  class14.runScript(var4, 5000000, 0);
               }
            }

         }
      }
   }
}
