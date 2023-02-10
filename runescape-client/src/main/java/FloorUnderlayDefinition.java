import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("FloorUnderlayDefinition_archive")
   public static AbstractArchive FloorUnderlayDefinition_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("FloorUnderlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -425847811
   )
   @Export("rgb")
   int rgb = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1860129533
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1269276951
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -661866217
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1462532523
   )
   @Export("hueMultiplier")
   public int hueMultiplier;

   FloorUnderlayDefinition() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "47120163"
   )
   @Export("postDecode")
   void postDecode() {
      this.setHsl(this.rgb);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IS)V",
      garbageValue = "334"
   )
   @Export("decode")
   void decode(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;III)V",
      garbageValue = "723763837"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium();
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2083501850"
   )
   @Export("setHsl")
   void setHsl(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.saturation = (int)(256.0 * var14);
      this.lightness = (int)(var16 * 256.0);
      if (this.saturation < 0) {
         this.saturation = 0;
      } else if (this.saturation > 255) {
         this.saturation = 255;
      }

      if (this.lightness < 0) {
         this.lightness = 0;
      } else if (this.lightness > 255) {
         this.lightness = 255;
      }

      if (var16 > 0.5) {
         this.hueMultiplier = (int)(512.0 * (1.0 - var16) * var14);
      } else {
         this.hueMultiplier = (int)(512.0 * var14 * var16);
      }

      if (this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)(var12 * (double)this.hueMultiplier);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2038548197"
   )
   static final int method3806(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }
}
