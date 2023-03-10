import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
   WorldMapData_0() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-716170974"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field2991.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 4096;
         super.regionYLow = var1.readUnsignedShort() * 64;
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         super.groupId = var1.readNullableLargeSmart();
         super.fileId = var1.readNullableLargeSmart();
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-724858915"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field2949 = new byte[super.planes][64][64];
      super.field2952 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class258.field2980.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         if (var3 == super.regionX && var4 == super.regionY) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.readTile(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return super.regionX == var2.regionX && super.regionY == var2.regionY;
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-698742703"
   )
   static int method4791(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.quantities.length; ++var4) {
            if (var2.ids[var4] == var1) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1796138717"
   )
   static final boolean method4790(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var1 = Client.menuOpcodes[var0];
         if (var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }
}
