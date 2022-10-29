import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
   @ObfuscatedName("tk")
   @ObfuscatedGetter(
      intValue = 915448903
   )
   static int field2829;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1385569557
   )
   @Export("chunkXLow")
   int chunkXLow;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 15181741
   )
   @Export("chunkYLow")
   int chunkYLow;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 920865019
   )
   @Export("chunkX")
   int chunkX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1931163575
   )
   @Export("chunkY")
   int chunkY;

   WorldMapData_1() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "459095608"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field2924.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 64;
         super.regionYLow = var1.readUnsignedShort() * 64;
         this.chunkXLow = var1.readUnsignedByte();
         this.chunkYLow = var1.readUnsignedByte();
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         this.chunkX = var1.readUnsignedByte();
         this.chunkY = var1.readUnsignedByte();
         super.groupId = var1.readNullableLargeSmart();
         super.fileId = var1.readNullableLargeSmart();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1742589874"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field2886 = new byte[super.planes][64][64];
      super.field2887 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class248.field2919.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         int var6 = var1.readUnsignedByte();
         if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
            for(int var7 = 0; var7 < 8; ++var7) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-754434660"
   )
   @Export("getChunkXLow")
   int getChunkXLow() {
      return this.chunkXLow;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1027502460"
   )
   @Export("getChunkYLow")
   int getChunkYLow() {
      return this.chunkYLow;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1818719188"
   )
   @Export("getChunkX")
   int getChunkX() {
      return this.chunkX;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "512521287"
   )
   @Export("getChunkY")
   int getChunkY() {
      return this.chunkY;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof WorldMapData_1)) {
         return false;
      } else {
         WorldMapData_1 var2 = (WorldMapData_1)var1;
         if (var2.regionX == super.regionX && var2.regionY == super.regionY) {
            return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "16"
   )
   static int method5020(int var0, Script var1, boolean var2) {
      return 2;
   }
}
