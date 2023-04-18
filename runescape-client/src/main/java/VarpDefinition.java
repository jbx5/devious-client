import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("VarpDefinition_archive")
   public static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -774485467
   )
   public static int field1908;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("VarpDefinition_cached")
   public static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1412530625
   )
   @Export("musicTrackFileId")
   public static int musicTrackFileId;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1911979431
   )
   @Export("type")
   public int type = 0;

   VarpDefinition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "955579844"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "1359565158"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIII)Ltq;",
      garbageValue = "2091722822"
   )
   static SpritePixels method3654(int var0, int var1, int var2) {
      return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(BuddyRankComparator.method2959(var0, var1, var2));
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Ley;",
      garbageValue = "335062925"
   )
   static class126[] method3655() {
      return new class126[]{class126.field1535, class126.field1532, class126.field1533, class126.field1538, class126.field1539, class126.field1536};
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1740756415"
   )
   public static void method3653(int var0, int var1, int var2) {
      Rasterizer3D.field2514.method4948(var0, var1, var2);
   }
}
