import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("WorldMapElement_archive")
   public static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lfd;"
   )
   @Export("WorldMapElement_cached")
   public static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1161109167
   )
   @Export("WorldMapElement_count")
   public static int WorldMapElement_count;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("WorldMapElement_cachedSprites")
   static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2052373877
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1983314433
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 748178793
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("d")
   @Export("name")
   public String name;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1680634377
   )
   public int field1883;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1651551537
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("s")
   public boolean field1879 = true;
   @ObfuscatedName("p")
   public boolean field1871 = false;
   @ObfuscatedName("b")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("o")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("u")
   int[] field1882;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1739407459
   )
   int field1887 = Integer.MAX_VALUE;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 778653995
   )
   int field1888 = Integer.MAX_VALUE;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1785500701
   )
   int field1873 = Integer.MIN_VALUE;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1428519697
   )
   int field1890 = Integer.MIN_VALUE;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("e")
   int[] field1893;
   @ObfuscatedName("g")
   byte[] field1894;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -797897937
   )
   @Export("category")
   public int category;

   public WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1372723798"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "1480478308"
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
         this.field1883 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var3;
         if (var2 == 7) {
            var3 = var1.readUnsignedByte();
            if ((var3 & 1) == 0) {
               this.field1879 = false;
            }

            if ((var3 & 2) == 2) {
               this.field1871 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field1882 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field1882[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1893 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1893.length; ++var5) {
               this.field1893[var5] = var1.readInt();
            }

            this.field1894 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field1894[var5] = var1.readByte();
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
               this.horizontalAlignment = (HorizontalAlignment)WallDecoration.findEnumerated(class101.method2565(), var1.readUnsignedByte());
            } else if (var2 == 30) {
               this.verticalAlignment = (VerticalAlignment)WallDecoration.findEnumerated(class120.method2813(), var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "623854316"
   )
   public void method3436() {
      if (this.field1882 != null) {
         for(int var1 = 0; var1 < this.field1882.length; var1 += 2) {
            if (this.field1882[var1] < this.field1887) {
               this.field1887 = this.field1882[var1];
            } else if (this.field1882[var1] > this.field1873) {
               this.field1873 = this.field1882[var1];
            }

            if (this.field1882[var1 + 1] < this.field1888) {
               this.field1888 = this.field1882[var1 + 1];
            } else if (this.field1882[var1 + 1] > this.field1890) {
               this.field1890 = this.field1882[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lri;",
      garbageValue = "458010968"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Lri;",
      garbageValue = "-1031771281"
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
            var2 = FriendsList.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1600914494"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lgg;",
      garbageValue = "-45896361"
   )
   @Export("SequenceDefinition_get")
   public static SequenceDefinition SequenceDefinition_get(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
         var1 = new SequenceDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
