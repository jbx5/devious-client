import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("tj")
   @ObfuscatedGetter(
      intValue = 1380668207
   )
   static int field1912;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("HealthBarDefinition_archive")
   static AbstractArchive HealthBarDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   static AbstractArchive field1913;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("HealthBarDefinition_cached")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("HealthBarDefinition_cachedSprites")
   public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1502305409
   )
   static int field1923;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -407646153
   )
   public int field1929;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1343351829
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 577688891
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1787371733
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -2035054583
   )
   public int field1926 = 1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1473771893
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1474339781
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -683499783
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 187532401
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1813140989
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   HealthBarDefinition() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;S)V",
      garbageValue = "255"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "120"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lri;",
      garbageValue = "-1781859751"
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
            var1 = FriendsList.SpriteBuffer_getSprite(field1913, this.frontSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Lri;",
      garbageValue = "119501813"
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
            var1 = FriendsList.SpriteBuffer_getSprite(field1913, this.backSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgu;",
      garbageValue = "1"
   )
   @Export("getNpcDefinition")
   public static NPCComposition getNpcDefinition(int var0) {
      NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lri;",
      garbageValue = "329379604"
   )
   static SpritePixels method3494(int var0, int var1, int var2) {
      return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(SpotAnimationDefinition.method3591(var0, var1, var2));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-50"
   )
   public static String method3513(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class161.method3268(var5);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1270280049"
   )
   static final int method3516(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }
}
