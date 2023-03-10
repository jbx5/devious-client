import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("HealthBarDefinition_archive")
   public static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   public static AbstractArchive field1947;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("HealthBarDefinition_cached")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("HealthBarDefinition_cachedSprites")
   public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 758214251
   )
   public int field1946;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1872045827
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1053115535
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1554459737
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1621376523
   )
   public int field1942 = 1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1656797509
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1047664091
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1815861979
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1796624873
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1912503923
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   HealthBarDefinition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "67"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-442070903"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 4) {
         this.int3 = 0;
      } else if (var2 == 5) {
         this.int5 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.readUnsignedByte();
      } else if (var2 == 7) {
         this.frontSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 8) {
         this.backSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 11) {
         this.int3 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.width = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.widthPadding = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(S)Lsn;",
      garbageValue = "-18194"
   )
   @Export("getFrontSprite")
   public SpritePixels getFrontSprite() {
      if (this.frontSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1947, this.frontSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lsn;",
      garbageValue = "99"
   )
   @Export("getBackSprite")
   public SpritePixels getBackSprite() {
      if (this.backSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1947, this.backSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }
}
