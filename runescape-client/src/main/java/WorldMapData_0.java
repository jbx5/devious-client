import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
   @ObfuscatedName("tp")
   @ObfuscatedGetter(
      intValue = 1048100864
   )
   static int field2806;

   WorldMapData_0() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2018545200"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field2992.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 64;
         super.regionYLow = var1.readUnsignedShort() * 4096;
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         super.groupId = var1.readNullableLargeSmart();
         super.fileId = var1.readNullableLargeSmart();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)V",
      garbageValue = "9"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field2960 = new byte[super.planes][64][64];
      super.field2956 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class255.field2990.value) {
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
         return var2.regionX == super.regionX && var2.regionY == super.regionY;
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)[Lre;",
      garbageValue = "-1511545880"
   )
   @Export("FillMode_values")
   public static FillMode[] FillMode_values() {
      return new FillMode[]{FillMode.field5017, FillMode.field5016, FillMode.SOLID};
   }
}
