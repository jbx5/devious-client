import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("HealthBarDefinition_archive")
   public static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static AbstractArchive field1975;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("HealthBarDefinition_cached")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("HealthBarDefinition_cachedSprites")
   static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = 1053176985
   )
   static int field1989;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 683600327
   )
   public int field1983;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1073329769
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1259926695
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2123277021
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1492750821
   )
   public int field1976 = 1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -280259539
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1047498223
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 187372523
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1356193103
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 72194099
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "72"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "-24"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)Lrx;",
      garbageValue = "-1477397901"
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
            var1 = class125.SpriteBuffer_getSprite(field1975, this.frontSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)Lrx;",
      garbageValue = "-2117406619"
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
            var1 = class125.SpriteBuffer_getSprite(field1975, this.backSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lkd;I)Ljava/lang/String;",
      garbageValue = "1353163423"
   )
   static String method3622(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = GraphicsObject.method2025(var1, var2 - 1);
               String var5;
               if (var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
