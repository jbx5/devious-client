import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("Widget_fontsArchive")
   static AbstractArchive Widget_fontsArchive;
   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;
   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("scrollBarSprites")
   static IndexedSprite[] scrollBarSprites;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1108258816
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2020249408
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 722457029
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 816121643
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2111148991
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 783728307
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 913213903
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1984668763
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("as")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("ay")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("am")
   byte[][][] field2949;
   @ObfuscatedName("az")
   byte[][][] field2952;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "[[[[Lji;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("au")
   boolean field2946;
   @ObfuscatedName("ag")
   boolean field2953;

   AbstractWorldMapData() {
      new LinkedList();
      this.field2946 = false;
      this.field2953 = false;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-724858915"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "61"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field2946 && this.field2953;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "1818291623"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field2946 = true;
            this.field2953 = true;
         }

      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field2949 = null;
      this.field2952 = null;
      this.decorations = null;
      this.field2946 = false;
      this.field2953 = false;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(IILsy;I)V",
      garbageValue = "418636304"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method5197(var1, var2, var3, var4);
         } else {
            this.method5202(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(IILsy;II)V",
      garbageValue = "1058114421"
   )
   void method5197(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
      }

      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(IILsy;II)V",
      garbageValue = "-1054740043"
   )
   void method5202(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = var3.readUnsignedShort();
            if (var14 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var14;
               var11 = var3.readUnsignedByte();
               this.field2949[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2952[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if (var9 != 0) {
               WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.readNullableLargeSmart();
                  int var13 = var3.readUnsignedByte();
                  var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-662100601"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1971165411"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)J",
      garbageValue = "32"
   )
   public static long method5218(int var0) {
      if (var0 > 63) {
         throw new class370("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "1633919038"
   )
   @Export("updateRootInterface")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (GrandExchangeEvent.loadInterface(var0)) {
         class169.updateInterface(class155.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(Lmy;III)V",
      garbageValue = "-2047743771"
   )
   @Export("clickWidget")
   static final void clickWidget(Widget var0, int var1, int var2) {
      if (Client.clickedWidget == null && !Client.isMenuOpen) {
         if (var0 != null) {
            Widget var4 = class287.method5477(var0);
            if (var4 == null) {
               var4 = var0.parent;
            }

            if (var4 != null) {
               Client.clickedWidget = var0;
               var4 = class287.method5477(var0);
               if (var4 == null) {
                  var4 = var0.parent;
               }

               Client.clickedWidgetParent = var4;
               Client.widgetClickX = var1;
               Client.widgetClickY = var2;
               class371.widgetDragDuration = 0;
               Client.isDraggingWidget = false;
               int var6 = Client.menuOptionsCount - 1;
               if (var6 != -1) {
                  TaskHandler.method3457(var6);
               }

               return;
            }
         }

      }
   }
}
