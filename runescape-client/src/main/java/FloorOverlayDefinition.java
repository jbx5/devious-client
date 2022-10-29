import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("FloorOverlayDefinition_archive")
   public static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("FloorOverlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1174010993
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1474349185
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("h")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1385166991
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -646835729
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2135346039
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1306332663
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -714227545
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 490012585
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2141765349
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1609785955"
   )
   @Export("postDecode")
   public void postDecode() {
      if (this.secondaryRgb != -1) {
         this.setHsl(this.secondaryRgb);
         this.secondaryHue = this.hue;
         this.secondarySaturation = this.saturation;
         this.secondaryLightness = this.lightness;
      }

      this.setHsl(this.primaryRgb);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "2"
   )
   @Export("decode")
   public void decode(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;III)V",
      garbageValue = "-48419062"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.primaryRgb = var1.readMedium();
      } else if (var2 == 2) {
         this.texture = var1.readUnsignedByte();
      } else if (var2 == 5) {
         this.hideUnderlay = false;
      } else if (var2 == 7) {
         this.secondaryRgb = var1.readMedium();
      } else if (var2 == 8) {
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "22"
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
      if (var10 != var8) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      this.hue = (int)(var12 * 256.0);
      this.saturation = (int)(var14 * 256.0);
      this.lightness = (int)(256.0 * var16);
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

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1977955677"
   )
   public static int method3863(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(CLmo;B)I",
      garbageValue = "-67"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-1106441508"
   )
   public static void method3864(Buffer var0, int var1) {
      if (JagexCache.JagexCache_randomDat != null) {
         try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
         } catch (Exception var3) {
         }
      }

   }
}
