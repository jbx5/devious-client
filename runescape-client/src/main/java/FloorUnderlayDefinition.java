import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("FloorUnderlayDefinition_archive")
   static AbstractArchive FloorUnderlayDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("FloorUnderlayDefinition_cached")
   static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 2077737549
   )
   @Export("rgb")
   int rgb = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1739144969
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -416925451
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1681634759
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 420102639
   )
   @Export("hueMultiplier")
   public int hueMultiplier;

   FloorUnderlayDefinition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "370807324"
   )
   @Export("postDecode")
   void postDecode() {
      this.setHsl(this.rgb);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-302666705"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IIS)V",
      garbageValue = "128"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1548957414"
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
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
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
         this.hueMultiplier = (int)(512.0 * var14 * (1.0 - var16));
      } else {
         this.hueMultiplier = (int)(var14 * var16 * 512.0);
      }

      if (this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)((double)this.hueMultiplier * var12);
   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "78"
   )
   static final void method3803() {
      Client.field709 = Client.cycleCntr;
      class155.field1722 = true;
   }
}
