import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("WorldMapElement_archive")
   public static AbstractArchive WorldMapElement_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "[Lfm;"
   )
   @Export("WorldMapElement_cached")
   public static WorldMapElement[] WorldMapElement_cached;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1016505837
   )
   @Export("WorldMapElement_count")
   public static int WorldMapElement_count;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("WorldMapElement_cachedSprites")
   public static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 914760617
   )
   @Export("objectId")
   public final int objectId;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -211487071
   )
   @Export("sprite1")
   public int sprite1 = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1538930309
   )
   @Export("sprite2")
   int sprite2 = -1;
   @ObfuscatedName("r")
   @Export("name")
   public String name;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1750958439
   )
   public int field1947;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 743086435
   )
   @Export("textSize")
   public int textSize = 0;
   @ObfuscatedName("g")
   public boolean field1936 = true;
   @ObfuscatedName("i")
   public boolean field1940 = false;
   @ObfuscatedName("o")
   @Export("menuActions")
   public String[] menuActions = new String[5];
   @ObfuscatedName("n")
   @Export("menuTargetName")
   public String menuTargetName;
   @ObfuscatedName("k")
   int[] field1933;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -151297473
   )
   int field1941 = Integer.MAX_VALUE;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1016813489
   )
   int field1942 = Integer.MAX_VALUE;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2004701437
   )
   int field1943 = Integer.MIN_VALUE;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2089039459
   )
   int field1937 = Integer.MIN_VALUE;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   @Export("horizontalAlignment")
   public HorizontalAlignment horizontalAlignment;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   @Export("verticalAlignment")
   public VerticalAlignment verticalAlignment;
   @ObfuscatedName("d")
   int[] field1930;
   @ObfuscatedName("y")
   byte[] field1948;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -249321649
   )
   @Export("category")
   public int category;

   public WorldMapElement(int var1) {
      this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
      this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
      this.category = -1;
      this.objectId = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "2"
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
      garbageValue = "1"
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
         this.field1947 = var1.readMedium();
      } else if (var2 == 5) {
         var1.readMedium();
      } else if (var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var6;
         if (var2 == 7) {
            var6 = var1.readUnsignedByte();
            if ((var6 & 1) == 0) {
               this.field1936 = false;
            }

            if ((var6 & 2) == 2) {
               this.field1940 = true;
            }
         } else if (var2 == 8) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
         } else if (var2 == 15) {
            var6 = var1.readUnsignedByte();
            this.field1933 = new int[var6 * 2];

            int var4;
            for(var4 = 0; var4 < var6 * 2; ++var4) {
               this.field1933[var4] = var1.readShort();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field1930 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field1930.length; ++var5) {
               this.field1930[var5] = var1.readInt();
            }

            this.field1948 = new byte[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.field1948[var5] = var1.readByte();
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
               HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2010, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2008};
               this.horizontalAlignment = (HorizontalAlignment)World.findEnumerated(var3, var1.readUnsignedByte());
            } else if (var2 == 30) {
               VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field2073, VerticalAlignment.field2072, VerticalAlignment.VerticalAlignment_centered};
               this.verticalAlignment = (VerticalAlignment)World.findEnumerated(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1089817679"
   )
   public void method3554() {
      if (this.field1933 != null) {
         for(int var1 = 0; var1 < this.field1933.length; var1 += 2) {
            if (this.field1933[var1] < this.field1941) {
               this.field1941 = this.field1933[var1];
            } else if (this.field1933[var1] > this.field1943) {
               this.field1943 = this.field1933[var1];
            }

            if (this.field1933[var1 + 1] < this.field1942) {
               this.field1942 = this.field1933[var1 + 1];
            } else if (this.field1933[var1 + 1] > this.field1937) {
               this.field1937 = this.field1933[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lrx;",
      garbageValue = "-36987014"
   )
   @Export("getSpriteBool")
   public SpritePixels getSpriteBool(boolean var1) {
      int var2 = this.sprite1;
      return this.getSprite(var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)Lrx;",
      garbageValue = "-2019258857"
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
            var2 = class125.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
            if (var2 != null) {
               WorldMapElement_cachedSprites.put(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-125"
   )
   @Export("getObjectId")
   public int getObjectId() {
      return this.objectId;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lcb;B)V",
      garbageValue = "31"
   )
   @Export("runScriptEvent")
   public static void runScriptEvent(ScriptEvent var0) {
      class125.runScript(var0, 500000, 475000);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IB)I",
      garbageValue = "98"
   )
   public static int method3568(CharSequence var0, int var1) {
      return class318.method6373(var0, var1, true);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1005315742"
   )
   static final boolean method3564() {
      return ViewportMouse.ViewportMouse_isInViewport;
   }
}
