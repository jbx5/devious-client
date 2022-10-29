import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("SpotAnimationDefinition_archive")
   public static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("SpotAnimationDefinition_modelArchive")
   public static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("SpotAnimationDefinition_cached")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("worldSelectStars")
   static IndexedSprite[] worldSelectStars;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 112872075
   )
   @Export("id")
   int id;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1921428249
   )
   @Export("archive")
   int archive;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -407882935
   )
   @Export("sequence")
   public int sequence = -1;
   @ObfuscatedName("d")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("n")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("r")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("l")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1904272911
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1359658687
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -535278233
   )
   @Export("orientation")
   int orientation = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1137902335
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -608370479
   )
   @Export("contrast")
   int contrast = 0;

   SpotAnimationDefinition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "1953563970"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-1244957740"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Lha;",
      garbageValue = "-572346987"
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
         var5 = WorldMapElement.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIII)J",
      garbageValue = "-878617555"
   )
   static long method3591(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lbt;Lbt;IZIZI)I",
      garbageValue = "-977260089"
   )
   static int method3600(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class270.compareWorlds(var0, var1, var2, var3);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = class270.compareWorlds(var0, var1, var4, var5);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIZII)J",
      garbageValue = "2119003678"
   )
   @Export("calculateTag")
   public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }
}
