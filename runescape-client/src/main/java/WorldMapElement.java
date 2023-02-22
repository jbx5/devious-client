import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("WorldMapElement_archive")
   static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lhd;"
   )
   @Export("WorldMapElement_cached")
   static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 269086767
   )
   @Export("WorldMapElement_count")
   public static int WorldMapElement_count;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("WorldMapElement_cachedSprites")
   public static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1352721151
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2111287869
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1892918285
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("aq")
   @Export("name")
   public String name;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 811916185
   )
   public int field1899;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1518317395
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("ax")
   public boolean field1909 = true;
   @ObfuscatedName("as")
   public boolean field1918 = false;
   @ObfuscatedName("ay")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("am")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("az")
   int[] field1906;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 953250331
   )
   int field1914 = Integer.MAX_VALUE;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1926223473
   )
   int field1915 = Integer.MAX_VALUE;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1717847263
   )
   int field1916 = Integer.MIN_VALUE;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1739215103
   )
   int field1917 = Integer.MIN_VALUE;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lhe;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("aw")
   int[] field1920;
   @ObfuscatedName("aa")
   byte[] field1921;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1664643035
   )
   @Export("category")
   public int category;

   WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "441973027"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-2127028416"
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
         this.field1899 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var3;
         if (var2 == 7) {
            var3 = var1.readUnsignedByte();
            if ((var3 & 1) == 0) {
               this.field1909 = false;
            }

            if ((var3 & 2) == 2) {
               this.field1918 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field1906 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field1906[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1920 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1920.length; ++var5) {
               this.field1920[var5] = var1.readInt();
            }

            this.field1921 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field1921[var5] = var1.readByte();
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
               this.horizontalAlignment = (HorizontalAlignment)SpriteMask.findEnumerated(GrandExchangeOfferOwnWorldComparator.method1210(), var1.readUnsignedByte());
            } else if (var2 == 30) {
               this.verticalAlignment = (VerticalAlignment)SpriteMask.findEnumerated(WorldMapLabelSize.method4799(), var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "737649030"
   )
   void method3564() {
      if (this.field1906 != null) {
         for(int var1 = 0; var1 < this.field1906.length; var1 += 2) {
            if (this.field1906[var1] < this.field1914) {
               this.field1914 = this.field1906[var1];
            } else if (this.field1906[var1] > this.field1916) {
               this.field1916 = this.field1906[var1];
            }

            if (this.field1906[var1 + 1] < this.field1915) {
               this.field1915 = this.field1906[var1 + 1];
            } else if (this.field1906[var1 + 1] > this.field1917) {
               this.field1917 = this.field1906[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lsn;",
      garbageValue = "76"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)Lsn;",
      garbageValue = "82"
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
            var2 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "4"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }
}
