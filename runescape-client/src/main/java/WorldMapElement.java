import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lht;"
   )
   @Export("WorldMapElement_cached")
   static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("WorldMapElement_cachedSprites")
   public static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1498609815
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -961459711
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1394980627
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("ak")
   @Export("name")
   public String name;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 907418181
   )
   public int field1909;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 943944433
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("aa")
   public boolean field1912 = true;
   @ObfuscatedName("aj")
   public boolean field1908 = false;
   @ObfuscatedName("ad")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("ac")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("ag")
   int[] field1920;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 189601575
   )
   int field1921 = Integer.MAX_VALUE;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1285420045
   )
   int field1918 = Integer.MAX_VALUE;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 2073371107
   )
   int field1923 = Integer.MIN_VALUE;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1725539649
   )
   int field1924 = Integer.MIN_VALUE;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lhw;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("aw")
   int[] field1927;
   @ObfuscatedName("ay")
   byte[] field1928;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1662338059
   )
   @Export("category")
   public int category;

   WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "-70"
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "1492165512"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.sprite1 = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.sprite2 = var1.readNullableLargeSmart();
      } else if (var2 == 3) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.field1909 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var6;
         if (var2 == 7) {
            var6 = var1.readUnsignedByte();
            if ((var6 & 1) == 0) {
               this.field1912 = false;
            }

            if ((var6 & 2) == 2) {
               this.field1908 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var6 = var1.readUnsignedByte();
            this.field1920 = new int[var6 * 2];

            int var4;
            for(var4 = 0; var4 < var6 * 2; ++var4) {
               this.field1920[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1927 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1927.length; ++var5) {
               this.field1927[var5] = var1.readInt();
            }

            this.field1928 = new byte[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.field1928[var5] = var1.readByte();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.menuTargetName = var1.readStringCp1252NullTerminated();
            } else if (var2 == 18) {
               var1.readNullableLargeSmart();
            } else if (var2 == 19) {
               this.category = var1.readUnsignedShort();
            } else if (var2 == 21) {
               var1.readInt();
            } else if (var2 == 22) {
               var1.readInt();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.readShort();
               var1.readShort();
            } else if (var2 == 25) {
               var1.readNullableLargeSmart();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (var2 == 29) {
               HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1981, HorizontalAlignment.field1982, HorizontalAlignment.HorizontalAlignment_centered};
               this.horizontalAlignment = (HorizontalAlignment)GameObject.findEnumerated(var3, var1.readUnsignedByte());
            } else if (var2 == 30) {
               VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2043, VerticalAlignment.field2045};
               this.verticalAlignment = (VerticalAlignment)GameObject.findEnumerated(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2112078621"
   )
   void method3591() {
      if (this.field1920 != null) {
         for(int var1 = 0; var1 < this.field1920.length; var1 += 2) {
            if (this.field1920[var1] < this.field1921) {
               this.field1921 = this.field1920[var1];
            } else if (this.field1920[var1] > this.field1923) {
               this.field1923 = this.field1920[var1];
            }

            if (this.field1920[var1 + 1] < this.field1918) {
               this.field1918 = this.field1920[var1 + 1];
            } else if (this.field1920[var1 + 1] > this.field1924) {
               this.field1924 = this.field1920[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ZI)Ltm;",
      garbageValue = "1127460703"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Ltm;",
      garbageValue = "1995009325"
   )
   @Export("getSprite")
   SpritePixels getSprite(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class107.SpriteBuffer_getSprite(class410.WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2095862653"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }
}
