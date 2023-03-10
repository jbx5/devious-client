import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("FloorOverlayDefinition_archive")
   static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("FloorOverlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1010405763
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -624038787
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("an")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 206943377
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 292821743
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 657845037
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1773552047
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1576787029
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1927812135
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 86788293
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   FloorOverlayDefinition() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1984965099"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.secondaryRgb != -1) {
         this.setHsl(this.secondaryRgb);
         this.secondaryHue = this.hue;
         this.secondarySaturation = this.saturation;
         this.secondaryLightness = this.lightness;
      }

      this.setHsl(this.primaryRgb);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;IS)V",
      garbageValue = "-43"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsy;III)V",
      garbageValue = "625888358"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1998078375"
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
      double var16 = (var8 + var10) / 2.0;
      if (var10 != var8) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      this.hue = (int)(256.0 * var12);
      this.saturation = (int)(var14 * 256.0);
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

   }
}
