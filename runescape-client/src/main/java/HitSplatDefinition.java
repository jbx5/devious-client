import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("HitSplatDefinition_archive")
   static AbstractArchive HitSplatDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   static AbstractArchive field2057;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("HitSplatDefinition_cached")
   public static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1458391581
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1394618349
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1837819167
   )
   public int field2056 = 70;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1148141215
   )
   int field2072 = -1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1602286727
   )
   int field2066 = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -280894947
   )
   int field2076 = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1201778459
   )
   int field2070 = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 785279913
   )
   public int field2074 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1564107787
   )
   public int field2079 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1188300249
   )
   public int field2073 = -1;
   @ObfuscatedName("i")
   String field2071 = "";
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -842937459
   )
   public int field2067 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -288003729
   )
   public int field2068 = 0;
   @ObfuscatedName("k")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1177874963
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2054718277
   )
   @Export("transformVarp")
   int transformVarp = -1;

   HitSplatDefinition() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2116146280"
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
      garbageValue = "-16"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.readNullableLargeSmart();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field2072 = var1.readNullableLargeSmart();
      } else if (var2 == 4) {
         this.field2076 = var1.readNullableLargeSmart();
      } else if (var2 == 5) {
         this.field2066 = var1.readNullableLargeSmart();
      } else if (var2 == 6) {
         this.field2070 = var1.readNullableLargeSmart();
      } else if (var2 == 7) {
         this.field2074 = var1.readShort();
      } else if (var2 == 8) {
         this.field2071 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field2056 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2079 = var1.readShort();
      } else if (var2 == 11) {
         this.field2073 = 0;
      } else if (var2 == 12) {
         this.field2067 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field2068 = var1.readShort();
      } else if (var2 == 14) {
         this.field2073 = var1.readUnsignedShort();
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lgx;",
      garbageValue = "-677481530"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = Login.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class158.method3241(var2) : null;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "57"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field2071;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Canvas.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Lri;",
      garbageValue = "-486727132"
   )
   public SpritePixels method3703() {
      if (this.field2072 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2072);
         if (var1 != null) {
            return var1;
         } else {
            var1 = FriendsList.SpriteBuffer_getSprite(field2057, this.field2072, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2072);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Lri;",
      garbageValue = "2097291121"
   )
   public SpritePixels method3693() {
      if (this.field2066 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2066);
         if (var1 != null) {
            return var1;
         } else {
            var1 = FriendsList.SpriteBuffer_getSprite(field2057, this.field2066, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2066);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)Lri;",
      garbageValue = "15"
   )
   public SpritePixels method3685() {
      if (this.field2076 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2076);
         if (var1 != null) {
            return var1;
         } else {
            var1 = FriendsList.SpriteBuffer_getSprite(field2057, this.field2076, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2076);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(S)Lri;",
      garbageValue = "256"
   )
   public SpritePixels method3712() {
      if (this.field2070 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2070);
         if (var1 != null) {
            return var1;
         } else {
            var1 = FriendsList.SpriteBuffer_getSprite(field2057, this.field2070, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field2070);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Lnl;",
      garbageValue = "937020156"
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
            var1 = ByteArrayPool.method7165(field2057, HitSplatDefinition_fontsArchive, this.fontId, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ly;S)Lx;",
      garbageValue = "3308"
   )
   public static class3 method3716(class6 var0) {
      switch (var0.field23) {
         case 0:
            return new class0();
         default:
            throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIII[Lgr;B)V",
      garbageValue = "51"
   )
   static final void method3717(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               int[] var10000 = var8[var1].flags[var9 + var2];
               var10000[var10 + var3] &= -16777217;
            }
         }
      }

      Buffer var20 = new Buffer(var0);

      for(var10 = 0; var10 < 4; ++var10) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var12 = 0; var12 < 64; ++var12) {
               if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
                  int var17 = var11 & 7;
                  int var18 = var12 & 7;
                  int var19 = var7 & 3;
                  int var16;
                  if (var19 == 0) {
                     var16 = var17;
                  } else if (var19 == 1) {
                     var16 = var18;
                  } else if (var19 == 2) {
                     var16 = 7 - var17;
                  } else {
                     var16 = 7 - var18;
                  }

                  WorldMapRegion.loadTerrain(var20, var1, var16 + var2, var3 + SequenceDefinition.method3898(var11 & 7, var12 & 7, var7), 0, 0, var7);
               } else {
                  WorldMapRegion.loadTerrain(var20, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }
}
