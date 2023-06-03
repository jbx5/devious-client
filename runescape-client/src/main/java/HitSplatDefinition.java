import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("uw")
   @ObfuscatedGetter(
      intValue = -1746790609
   )
   static int field2142;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("HitSplatDefinition_archive")
   public static AbstractArchive HitSplatDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   public static AbstractArchive field2118;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   public static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("HitSplatDefinition_cached")
   static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   static EvictingDualNodeHashTable field2122 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -121541591
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -213241665
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -352189493
   )
   public int field2134 = 70;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 281747617
   )
   int field2129 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1265437581
   )
   int field2130 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1271971627
   )
   int field2139 = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1741647535
   )
   int field2132 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 763368609
   )
   public int field2133 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1533306371
   )
   public int field2140 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 310035987
   )
   public int field2137 = -1;
   @ObfuscatedName("aq")
   String field2136 = "";
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1961409
   )
   public int field2128 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1778108739
   )
   public int field2138 = 0;
   @ObfuscatedName("al")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 66224933
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 637611487
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-1923086278"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "1692063671"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2129 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2139 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2130 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2132 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2133 = var1.readShort();
      } else if (var2 == 8) {
         this.field2136 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2134 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2140 = var1.readShort();
      } else if (var2 == 11) {
         this.field2137 = 0;
      } else if (var2 == 12) {
         this.field2128 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2138 = var1.readShort();
      } else if (var2 == 14) {
         this.field2137 = var1.readUnsignedShort();
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Lhl;",
      garbageValue = "1146309729"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class343.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? PlayerComposition.method6053(var2) : null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1477064661"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2136;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + ChatChannel.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "1572311176"
   )
   public SpritePixels method3862() {
      if (this.field2129 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2122.get((long)this.field2129);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class107.SpriteBuffer_getSprite(field2118, this.field2129, 0);
            if (var1 != null) {
               field2122.put(var1, (long)this.field2129);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "1971141014"
   )
   public SpritePixels method3863() {
      if (this.field2130 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2122.get((long)this.field2130);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class107.SpriteBuffer_getSprite(field2118, this.field2130, 0);
            if (var1 != null) {
               field2122.put(var1, (long)this.field2130);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "-980783206"
   )
   public SpritePixels method3885() {
      if (this.field2139 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2122.get((long)this.field2139);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class107.SpriteBuffer_getSprite(field2118, this.field2139, 0);
            if (var1 != null) {
               field2122.put(var1, (long)this.field2139);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "-1515329169"
   )
   public SpritePixels method3872() {
      if (this.field2132 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2122.get((long)this.field2132);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class107.SpriteBuffer_getSprite(field2118, this.field2132, 0);
            if (var1 != null) {
               field2122.put(var1, (long)this.field2132);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lph;",
      garbageValue = "1541896410"
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
            var1 = Bounds.method8030(field2118, HitSplatDefinition_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
            }

            return var1;
         }
      }
   }
}
