import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1146220544
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 763222976
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1159667627
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1674687277
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1615088237
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1632558421
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1716482187
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -715724743
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("ax")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("ai")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("ag")
   byte[][][] field2990;
   @ObfuscatedName("ah")
   byte[][][] field2996;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "[[[[Ljl;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("ar")
   boolean field2998;
   @ObfuscatedName("am")
   boolean field2999;

   AbstractWorldMapData() {
      new LinkedList();
      this.field2998 = false;
      this.field2999 = false;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;S)V",
      garbageValue = "2348"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-556860665"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field2998 && this.field2999;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lnm;B)V",
      garbageValue = "97"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field2998 = true;
            this.field2999 = true;
         }

      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "216938688"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field2990 = null;
      this.field2996 = null;
      this.decorations = null;
      this.field2998 = false;
      this.field2999 = false;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(IILsg;I)V",
      garbageValue = "1675486274"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method5434(var1, var2, var3, var4);
         } else {
            this.method5435(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(IILsg;IB)V",
      garbageValue = "-28"
   )
   void method5434(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
      }

      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(IILsg;II)V",
      garbageValue = "675570307"
   )
   void method5435(int var1, int var2, Buffer var3, int var4) {
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
               this.field2990[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2996[var9][var1][var2] = (byte)(var11 & 3);
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

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "790722291"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2104723155"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "1786635610"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }
}
