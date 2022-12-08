import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   public static AbstractArchive field2135;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   public static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("HitSplatDefinition_cached")
   static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -452341601
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 29790821
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1571140211
   )
   public int field2132 = 70;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1857088509
   )
   int field2138 = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 519800861
   )
   int field2145 = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1875529689
   )
   int field2140 = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 866194173
   )
   int field2141 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1183512901
   )
   public int field2142 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 695762813
   )
   public int field2137 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -220285237
   )
   public int field2144 = -1;
   @ObfuscatedName("p")
   String field2128 = "";
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1451388863
   )
   public int field2146 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1013670435
   )
   public int field2147 = 0;
   @ObfuscatedName("z")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 327667697
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -20536057
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1235490196"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "2"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2138 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2140 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2145 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2141 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2142 = var1.readShort();
      } else if (var2 == 8) {
         this.field2128 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2132 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2137 = var1.readShort();
      } else if (var2 == 11) {
         this.field2144 = 0;
      } else if (var2 == 12) {
         this.field2146 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2147 = var1.readShort();
      } else if (var2 == 14) {
         this.field2144 = var1.readUnsignedShort();
      } else if (var2 == 17 || var2 == 18) {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)Lgm;",
      garbageValue = "-80"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = PlayerCompositionColorTextureOverride.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class364.method6987(var2) : null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "633340831"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2128;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Huffman.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(S)Lrx;",
      garbageValue = "-31390"
   )
   public SpritePixels method3827() {
      if (this.field2138 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2138);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class125.SpriteBuffer_getSprite(field2135, this.field2138, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2138);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)Lrx;",
      garbageValue = "14281"
   )
   public SpritePixels method3828() {
      if (this.field2145 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2145);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class125.SpriteBuffer_getSprite(field2135, this.field2145, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2145);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)Lrx;",
      garbageValue = "1577011085"
   )
   public SpritePixels method3862() {
      if (this.field2140 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2140);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class125.SpriteBuffer_getSprite(field2135, this.field2140, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2140);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)Lrx;",
      garbageValue = "0"
   )
   public SpritePixels method3830() {
      if (this.field2141 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2141);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class125.SpriteBuffer_getSprite(field2135, this.field2141, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2141);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Lnv;",
      garbageValue = "15"
   )
   @Export("getFont")
   public Font getFont() {
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            var1 = Timer.method7358(field2135, HitSplatDefinition_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-25"
   )
   public static void method3850(int var0) {
      if (var0 != -1) {
         if (Language.Widget_loadedInterfaces[var0]) {
            class422.Widget_archive.clearFilesGroup(var0);
            if (class71.Widget_interfaceComponents[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < class71.Widget_interfaceComponents[var0].length; ++var2) {
                  if (class71.Widget_interfaceComponents[var0][var2] != null) {
                     if (class71.Widget_interfaceComponents[var0][var2].type != 2) {
                        class71.Widget_interfaceComponents[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if (var1) {
                  class71.Widget_interfaceComponents[var0] = null;
               }

               Language.Widget_loadedInterfaces[var0] = false;
            }
         }
      }
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "23723"
   )
   static boolean method3824() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         while(Client.archiveLoadersDone < Client.archiveLoaders.size()) {
            ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
            if (!var0.isLoaded()) {
               return false;
            }

            ++Client.archiveLoadersDone;
         }

         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-745676909"
   )
   static final void method3860() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         Player var3 = Client.players[var1[var2]];
         if (var3 != null) {
            FloorDecoration.updateActorSequence(var3, 1);
         }
      }

   }
}
