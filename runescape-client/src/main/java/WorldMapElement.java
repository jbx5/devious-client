import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("uv")
   @ObfuscatedGetter(
      intValue = 942361787
   )
   static int field1937;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("WorldMapElement_archive")
   static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lhw;"
   )
   @Export("WorldMapElement_cached")
   static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("WorldMapElement_cachedSprites")
   static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 219774827
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1458003089
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 2035390535
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("al")
   @Export("name")
   public String name;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1080412371
   )
   public int field1917;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 952315347
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("ao")
   public boolean field1923 = true;
   @ObfuscatedName("ax")
   public boolean field1925 = false;
   @ObfuscatedName("ai")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("ag")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("ah")
   int[] field1913;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 2140325741
   )
   int field1933 = Integer.MAX_VALUE;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1117233973
   )
   int field1924 = Integer.MAX_VALUE;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1897586587
   )
   int field1930 = Integer.MIN_VALUE;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2068879661
   )
   int field1931 = Integer.MIN_VALUE;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lhn;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("az")
   int[] field1934;
   @ObfuscatedName("ad")
   byte[] field1935;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -461862935
   )
   @Export("category")
   public int category;

   WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1056093346"
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
      descriptor = "(Lsg;II)V",
      garbageValue = "1073520708"
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
         this.field1917 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var6;
         if (var2 == 7) {
            var6 = var1.readUnsignedByte();
            if ((var6 & 1) == 0) {
               this.field1923 = false;
            }

            if ((var6 & 2) == 2) {
               this.field1925 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var6 = var1.readUnsignedByte();
            this.field1913 = new int[var6 * 2];

            int var4;
            for(var4 = 0; var4 < var6 * 2; ++var4) {
               this.field1913[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1934 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1934.length; ++var5) {
               this.field1934[var5] = var1.readInt();
            }

            this.field1935 = new byte[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.field1935[var5] = var1.readByte();
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
               this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(class473.method8839(), var1.readUnsignedByte());
            } else if (var2 == 30) {
               VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2054, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2059};
               this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(var3, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "262144"
   )
   void method3659() {
      if (this.field1913 != null) {
         for(int var1 = 0; var1 < this.field1913.length; var1 += 2) {
            if (this.field1913[var1] < this.field1933) {
               this.field1933 = this.field1913[var1];
            } else if (this.field1913[var1] > this.field1930) {
               this.field1930 = this.field1913[var1];
            }

            if (this.field1913[var1 + 1] < this.field1924) {
               this.field1924 = this.field1913[var1 + 1];
            } else if (this.field1913[var1 + 1] > this.field1931) {
               this.field1931 = this.field1913[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZI)Ltq;",
      garbageValue = "-16711936"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)Ltq;",
      garbageValue = "685104861"
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
            var2 = class484.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "557788055"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   static final void method3662() {
      if (ItemContainer.field1024) {
         for(int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.method2296();
         }

         ItemContainer.field1024 = false;
      }

   }
}
