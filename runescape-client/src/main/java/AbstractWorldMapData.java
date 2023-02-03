import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("o")
   public static boolean field2951 = true;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1017977792
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 13856768
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 827902535
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -255256689
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1536744925
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1761460877
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 347944191
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -872993431
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("b")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("m")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("t")
   byte[][][] field2960;
   @ObfuscatedName("h")
   byte[][][] field2956;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "[[[[Lik;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("u")
   boolean field2957;
   @ObfuscatedName("x")
   boolean field2958;

   AbstractWorldMapData() {
      new LinkedList();
      this.field2957 = false;
      this.field2958 = false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "9"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-217482611"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field2957 && this.field2958;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lln;B)V",
      garbageValue = "110"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field2957 = true;
            this.field2958 = true;
         }

      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "126"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field2960 = null;
      this.field2956 = null;
      this.decorations = null;
      this.field2957 = false;
      this.field2958 = false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IILrd;B)V",
      garbageValue = "1"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method5303(var1, var2, var3, var4);
         } else {
            this.method5327(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IILrd;II)V",
      garbageValue = "-2024811095"
   )
   void method5303(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      }

      this.floorUnderlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IILrd;II)V",
      garbageValue = "2043326073"
   )
   void method5327(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = field2951 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = field2951 ? var3.readUnsignedShort() : var3.readUnsignedByte();
            if (var14 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var14;
               var11 = var3.readUnsignedByte();
               this.field2960[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2956[var9][var1][var2] = (byte)(var11 & 3);
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1948785623"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1777462733"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "([Lkz;Lkz;ZB)V",
      garbageValue = "-1"
   )
   @Export("revalidateWidgetScroll")
   static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
      int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
      class374.resizeInterface(var0, var1.id, var3, var4, var2);
      if (var1.children != null) {
         class374.resizeInterface(var1.children, var1.id, var3, var4, var2);
      }

      InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
      if (var5 != null) {
         int var6 = var5.group;
         if (class153.loadInterface(var6)) {
            class374.resizeInterface(WorldMapLabel.Widget_interfaceComponents[var6], -1, var3, var4, var2);
         }
      }

      if (var1.contentType == 1337) {
      }

   }
}
