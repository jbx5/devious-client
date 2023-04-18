import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("HitSplatDefinition_archive")
   public static AbstractArchive HitSplatDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   public static AbstractArchive field2131;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   public static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("HitSplatDefinition_cached")
   static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   static EvictingDualNodeHashTable field2134 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1857366871
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2000718353
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 292771999
   )
   public int field2142 = 70;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 728089333
   )
   int field2155 = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -466249443
   )
   int field2143 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1100815213
   )
   int field2144 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 170092719
   )
   int field2145 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 895105585
   )
   public int field2130 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 498242719
   )
   public int field2147 = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1413310139
   )
   public int field2154 = -1;
   @ObfuscatedName("ak")
   String field2150 = "";
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1897913521
   )
   public int field2149 = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1785373205
   )
   public int field2151 = 0;
   @ObfuscatedName("ae")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1173802085
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1580274447
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "1967654150"
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "1"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2155 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2144 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2143 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2145 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2130 = var1.readShort();
      } else if (var2 == 8) {
         this.field2150 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2142 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2147 = var1.readShort();
      } else if (var2 == 11) {
         this.field2154 = 0;
      } else if (var2 == 12) {
         this.field2149 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2151 = var1.readShort();
      } else if (var2 == 14) {
         this.field2154 = var1.readUnsignedShort();
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Lhb;",
      garbageValue = "-85"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class252.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class122.method3046(var2) : null;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-280765442"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2150;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + KitDefinition.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Ltq;",
      garbageValue = "2059907674"
   )
   public SpritePixels method3948() {
      if (this.field2155 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2155);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field2131, this.field2155, 0);
            if (var1 != null) {
               field2134.put(var1, (long)this.field2155);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Ltq;",
      garbageValue = "-2117307389"
   )
   public SpritePixels method3949() {
      if (this.field2143 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2143);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field2131, this.field2143, 0);
            if (var1 != null) {
               field2134.put(var1, (long)this.field2143);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Ltq;",
      garbageValue = "1640774602"
   )
   public SpritePixels method3943() {
      if (this.field2144 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2144);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field2131, this.field2144, 0);
            if (var1 != null) {
               field2134.put(var1, (long)this.field2144);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Ltq;",
      garbageValue = "57"
   )
   public SpritePixels method3951() {
      if (this.field2145 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2145);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class484.SpriteBuffer_getSprite(field2131, this.field2145, 0);
            if (var1 != null) {
               field2134.put(var1, (long)this.field2145);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lon;",
      garbageValue = "1644925127"
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
            AbstractArchive var3 = field2131;
            AbstractArchive var4 = HitSplatDefinition_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               class485.SpriteBuffer_decode(var7);
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
                  Font var9 = new Font(var8, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                  class398.method7709();
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

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "1"
   )
   static int method3977(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == 3500) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4229(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4214(var3) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4231(var3) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
