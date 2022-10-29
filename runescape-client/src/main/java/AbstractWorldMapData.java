import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("t")
   public static boolean field2885 = true;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1343248832
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 263583808
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 91255593
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1863551975
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1146340121
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -72337353
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1089891869
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1760383059
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("p")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("b")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("o")
   byte[][][] field2886;
   @ObfuscatedName("u")
   byte[][][] field2887;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "[[[[Lis;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("w")
   boolean field2890;
   @ObfuscatedName("m")
   boolean field2891;

   AbstractWorldMapData() {
      new LinkedList();
      this.field2890 = false;
      this.field2891 = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1742589874"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "24597379"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field2890 && this.field2891;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Llg;B)V",
      garbageValue = "-41"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field2890 = true;
            this.field2891 = true;
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field2886 = null;
      this.field2887 = null;
      this.decorations = null;
      this.field2890 = false;
      this.field2891 = false;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IILqr;I)V",
      garbageValue = "-1353996451"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method5118(var1, var2, var3, var4);
         } else {
            this.method5119(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IILqr;II)V",
      garbageValue = "-1671335311"
   )
   void method5118(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      }

      this.floorUnderlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IILqr;IB)V",
      garbageValue = "120"
   )
   void method5119(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = field2885 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = field2885 ? var3.readUnsignedShort() : var3.readUnsignedByte();
            if (var14 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var14;
               var11 = var3.readUnsignedByte();
               this.field2886[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2887[var9][var1][var2] = (byte)(var11 & 3);
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "333998070"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1797386560"
   )
   public static int method5137(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2081964554"
   )
   public static boolean method5144(int var0) {
      return var0 >= WorldMapDecorationType.field3685.id && var0 <= WorldMapDecorationType.field3688.id || var0 == WorldMapDecorationType.field3676.id;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2145282762"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }
}
