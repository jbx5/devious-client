import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("s")
   public static boolean field2953 = true;
   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 232722432
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -838943168
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 183398775
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -232473513
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 89984523
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2028062533
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1564355211
   )
   @Export("groupId")
   int groupId = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -728019783
   )
   @Export("fileId")
   int fileId = -1;
   @ObfuscatedName("i")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("o")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("n")
   byte[][][] field2950;
   @ObfuscatedName("k")
   byte[][][] field2951;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[[[[Liz;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("l")
   boolean field2954;
   @ObfuscatedName("t")
   boolean field2955;

   AbstractWorldMapData() {
      new LinkedList();
      this.field2954 = false;
      this.field2955 = false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1703912011"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2145704000"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field2954 && this.field2955;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lly;I)V",
      garbageValue = "1014997119"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field2954 = true;
            this.field2955 = true;
         }

      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1690828901"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds = null;
      this.floorOverlayIds = null;
      this.field2950 = null;
      this.field2951 = null;
      this.decorations = null;
      this.field2954 = false;
      this.field2955 = false;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IILqy;I)V",
      garbageValue = "-2009986284"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method5243(var1, var2, var3, var4);
         } else {
            this.method5244(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IILqy;II)V",
      garbageValue = "463825576"
   )
   void method5243(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      }

      this.floorUnderlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IILqy;IB)V",
      garbageValue = "103"
   )
   void method5244(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = field2953 ? (short)var3.readUnsignedShort() : (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var14 = field2953 ? var3.readUnsignedShort() : var3.readUnsignedByte();
            if (var14 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var14;
               var11 = var3.readUnsignedByte();
               this.field2950[var9][var1][var2] = (byte)(var11 >> 2);
               this.field2951[var9][var1][var2] = (byte)(var11 & 3);
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2028878275"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-574491107"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;IIB)[Lra;",
      garbageValue = "21"
   )
   public static IndexedSprite[] method5238(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         VarpDefinition.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : class282.method5509();
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "2188"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromIgnored();
      }

      if (class281.friendsChat != null) {
         class281.friendsChat.invalidateIgnoreds();
      }

   }
}
