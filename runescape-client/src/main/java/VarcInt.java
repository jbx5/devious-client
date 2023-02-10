import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("VarcInt")
public class VarcInt extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("VarcInt_archive")
   public static AbstractArchive VarcInt_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("VarcInt_cached")
   public static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("fp")
   static String field1962;
   @ObfuscatedName("v")
   @Export("persist")
   public boolean persist = false;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "865098803"
   )
   public void method3633(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method3636(var1, var2);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "4"
   )
   void method3636(Buffer var1, int var2) {
      if (var2 == 2) {
         this.persist = true;
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;I)Lrg;",
      garbageValue = "749635841"
   )
   @Export("SpriteBuffer_getIndexedSpriteByName")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      IndexedSprite var5;
      if (!Buffer.method8892(var0, var3, var4)) {
         var5 = null;
      } else {
         IndexedSprite var7 = new IndexedSprite();
         var7.width = class488.SpriteBuffer_spriteWidth;
         var7.height = class488.SpriteBuffer_spriteHeight;
         var7.xOffset = class488.SpriteBuffer_xOffsets[0];
         var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[0];
         var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[0];
         var7.subHeight = class132.SpriteBuffer_spriteHeights[0];
         var7.palette = class100.SpriteBuffer_spritePalette;
         var7.pixels = class140.SpriteBuffer_pixels[0];
         class100.method2724();
         var5 = var7;
      }

      return var5;
   }
}
