import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   public static AbstractArchive field2101;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("HitSplatDefinition_cached")
   public static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -835052111
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1665459543
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1243299901
   )
   public int field2107 = 70;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -60122229
   )
   int field2108 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1814913713
   )
   int field2109 = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1638166329
   )
   int field2104 = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -285634307
   )
   int field2111 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1031873387
   )
   public int field2112 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 250642051
   )
   public int field2122 = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -891854567
   )
   public int field2114 = -1;
   @ObfuscatedName("ai")
   String field2115 = "";
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 980825829
   )
   public int field2116 = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1938875509
   )
   public int field2106 = 0;
   @ObfuscatedName("ah")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1720772527
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1905615485
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;S)V",
      garbageValue = "26153"
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
      descriptor = "(Lsy;IB)V",
      garbageValue = "-46"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2108 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2104 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2109 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2111 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2112 = var1.readShort();
      } else if (var2 == 8) {
         this.field2115 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2107 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2122 = var1.readShort();
      } else if (var2 == 11) {
         this.field2114 = 0;
      } else if (var2 == 12) {
         this.field2116 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2106 = var1.readShort();
      } else if (var2 == 14) {
         this.field2114 = var1.readUnsignedShort();
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Lhf;",
      garbageValue = "-1139535160"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class17.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? NewStuff.method3664(var2) : null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "87"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2115;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class393.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Lsn;",
      garbageValue = "-522182464"
   )
   public SpritePixels method3853() {
      if (this.field2108 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2108);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2108, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2108);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Lsn;",
      garbageValue = "-1592628135"
   )
   public SpritePixels method3833() {
      if (this.field2109 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2109);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2109, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2109);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Lsn;",
      garbageValue = "146201023"
   )
   public SpritePixels method3828() {
      if (this.field2104 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2104);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2104, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2104);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Lsn;",
      garbageValue = "-30"
   )
   public SpritePixels method3829() {
      if (this.field2111 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2111);
         if (var1 != null) {
            return var1;
         } else {
            var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2111, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2111);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Loe;",
      garbageValue = "2030805519"
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
            AbstractArchive var3 = field2101;
            AbstractArchive var4 = SecureRandomFuture.HitSplatDefinition_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               class212.SpriteBuffer_decode(var7);
               var6 = true;
            }

            Font var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.takeFile(var5, 0);
               Font var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  Font var9 = new Font(var8, class492.SpriteBuffer_xOffsets, Canvas.SpriteBuffer_yOffsets, InterfaceParent.SpriteBuffer_spriteWidths, class144.SpriteBuffer_spriteHeights, class181.SpriteBuffer_spritePalette, class144.SpriteBuffer_pixels);
                  FriendsList.method7473();
                  var10 = var9;
               }

               var2 = var10;
            }

            if (var2 != null) {
               HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-28"
   )
   public static int method3856(int var0, int var1) {
      return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167) & 2047;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "36"
   )
   static final int method3854() {
      return ViewportMouse.ViewportMouse_x;
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IIII)V",
      garbageValue = "-626091022"
   )
   @Export("drawCompass")
   static final void drawCompass(Widget var0, int var1, int var2, int var3) {
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         if (Client.minimapState < 3) {
            class149.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

      }
   }
}
