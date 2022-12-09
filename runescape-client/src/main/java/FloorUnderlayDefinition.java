import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("FloorUnderlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive4")
   static Archive archive4;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 96971943
   )
   @Export("rgb")
   int rgb = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1260139413
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -565427519
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 181988641
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1840693311
   )
   @Export("hueMultiplier")
   public int hueMultiplier;

   FloorUnderlayDefinition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "838197238"
   )
   @Export("postDecode")
   void postDecode() {
      this.setHsl(this.rgb);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "66"
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqy;III)V",
      garbageValue = "-1969198767"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium();
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1966104725"
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

      if (var16 > 0.5) {
         this.hueMultiplier = (int)(512.0 * var14 * (1.0 - var16));
      } else {
         this.hueMultiplier = (int)(512.0 * var16 * var14);
      }

      if (this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)((double)this.hueMultiplier * var12);
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1437452921"
   )
   static final boolean method3767() {
      return Client.isMenuOpen;
   }
}
