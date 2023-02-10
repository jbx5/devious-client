import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("SpotAnimationDefinition_archive")
   public static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("SpotAnimationDefinition_modelArchive")
   public static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("SpotAnimationDefinition_cached")
   public static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("a")
   @Export("formattedOperatingSystemName")
   public static String formattedOperatingSystemName;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -795982807
   )
   @Export("id")
   int id;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1630056631
   )
   @Export("archive")
   int archive;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -501071795
   )
   @Export("sequence")
   public int sequence = -1;
   @ObfuscatedName("n")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("l")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("k")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("c")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -324226543
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1527622307
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 319694079
   )
   @Export("orientation")
   int orientation = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1353692067
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1524145331
   )
   @Export("contrast")
   int contrast = 0;

   SpotAnimationDefinition() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "1800363015"
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
      descriptor = "(Lrd;II)V",
      garbageValue = "-362652876"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Lhs;",
      garbageValue = "583517159"
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
         var5 = class85.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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
}
