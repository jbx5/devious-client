import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("HealthBarDefinition_archive")
   public static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   public static AbstractArchive field1952;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("HealthBarDefinition_cached")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("HealthBarDefinition_cachedSprites")
   static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1932635953
   )
   public int field1954;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1625569879
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 750422699
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 205889791
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1908977665
   )
   public int field1960 = 1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1295532583
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1810270273
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 511268141
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1838106225
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -563933335
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "536910502"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-2057188465"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "-553105347"
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
            var1 = class107.SpriteBuffer_getSprite(field1952, this.frontSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "-235452519"
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
            var1 = class107.SpriteBuffer_getSprite(field1952, this.backSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Lnw;",
      garbageValue = "2145594899"
   )
   @Export("PlayerType_values")
   public static PlayerType[] PlayerType_values() {
      return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.field4205, PlayerType.field4204, PlayerType.field4211, PlayerType.PlayerType_ironman, PlayerType.field4212, PlayerType.field4208, PlayerType.field4203, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4206, PlayerType.field4207, PlayerType.PlayerType_normal, PlayerType.field4202, PlayerType.field4209, PlayerType.field4213, PlayerType.PlayerType_jagexModerator};
   }
}
