import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("SpotAnimationDefinition_archive")
   static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("SpotAnimationDefinition_modelArchive")
   static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("SpotAnimationDefinition_cached")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1537555243
   )
   @Export("id")
   int id;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 903909845
   )
   @Export("archive")
   int archive;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -295593061
   )
   @Export("sequence")
   public int sequence = -1;
   @ObfuscatedName("r")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("u")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("b")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("j")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -289907207
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1592669609
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 919548227
   )
   @Export("orientation")
   int orientation = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 291323671
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1468773977
   )
   @Export("contrast")
   int contrast = 0;

   SpotAnimationDefinition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "48"
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
      descriptor = "(Lqy;IB)V",
      garbageValue = "76"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.archive = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.sequence = var1.readUnsignedShort();
      } else if (var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.ambient = var1.readUnsignedByte();
      } else if (var2 == 8) {
         this.contrast = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Lhh;",
      garbageValue = "975498886"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
      if (var2 == null) {
         ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (this.recolorFrom != null) {
            for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
               var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
            }
         }

         if (this.retextureFrom != null) {
            for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
               var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
            }
         }

         var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
      }

      Model var5;
      if (this.sequence != -1 && var1 != -1) {
         var5 = AABB.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
      } else {
         var5 = var2.toSharedSpotAnimationModel(true);
      }

      if (this.widthScale != 128 || this.heightScale != 128) {
         var5.scale(this.widthScale, this.heightScale, this.widthScale);
      }

      if (this.orientation != 0) {
         if (this.orientation == 90) {
            var5.rotateY90Ccw();
         }

         if (this.orientation == 180) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }

         if (this.orientation == 270) {
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
            var5.rotateY90Ccw();
         }
      }

      return var5;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lop;",
      garbageValue = "-1315664177"
   )
   public static class409 method3751() {
      synchronized(class409.field4601) {
         if (class409.field4604 == 0) {
            return new class409();
         } else {
            class409.field4601[--class409.field4604].method7763();
            return class409.field4601[class409.field4604];
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-891167706"
   )
   static void method3743() {
      StructComposition.field2122 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var2;
      int var3;
      for(var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class201.method4112((double)((float)var1 / 360.0F), 0.9998999834060669, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
         StructComposition.field2122[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(var2 = var1 / 6; var0 < StructComposition.field2122.length; var1 -= var2) {
         var3 = var0 * 2;

         for(int var4 = class201.method4112((double)((float)var1 / 360.0F), 0.9998999834060669, 0.5); var0 < var3 && var0 < StructComposition.field2122.length; ++var0) {
            StructComposition.field2122[var0] = var4;
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)[Ljn;",
      garbageValue = "113"
   )
   public static class276[] method3732() {
      return new class276[]{class276.field3170, class276.field3158, class276.field3159, class276.field3171, class276.field3161, class276.field3166, class276.field3168, class276.field3164, class276.field3165, class276.field3157, class276.field3167, class276.field3160, class276.field3169, class276.field3163};
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1666232175"
   )
   @Export("getTileHeight")
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7;
         int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
         return var8 * (128 - var7) + var7 * var9 >> 7;
      } else {
         return 0;
      }
   }
}
