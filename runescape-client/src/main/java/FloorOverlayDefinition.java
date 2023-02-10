import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("tw")
   @ObfuscatedGetter(
      intValue = -1461054387
   )
   static int field2266;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("FloorOverlayDefinition_archive")
   public static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("FloorOverlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1932156485
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -324883547
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("z")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -788139287
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 2059431479
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1087787593
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1590005757
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -594146849
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 92274617
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1733464847
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "24"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "-1230969930"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;III)V",
      garbageValue = "573553274"
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

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "338648813"
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
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
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

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "613614059"
   )
   static final void method4027(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class103.cameraPitch < var0) {
         class103.cameraPitch = (var0 - class103.cameraPitch) * AttackOption.field1320 / 1000 + class103.cameraPitch + Message.field485;
         if (class103.cameraPitch > var0) {
            class103.cameraPitch = var0;
         }
      }

      if (class103.cameraPitch > var0) {
         class103.cameraPitch -= (class103.cameraPitch - var0) * AttackOption.field1320 / 1000 + Message.field485;
         if (class103.cameraPitch < var0) {
            class103.cameraPitch = var0;
         }
      }

      int var2 = var1 - class285.cameraYaw;
      if (var2 > 1024) {
         var2 -= 2048;
      }

      if (var2 < -1024) {
         var2 += 2048;
      }

      if (var2 > 0) {
         class285.cameraYaw = var2 * AttackOption.field1320 / 1000 + class285.cameraYaw + Message.field485;
         class285.cameraYaw &= 2047;
      }

      if (var2 < 0) {
         class285.cameraYaw -= -var2 * AttackOption.field1320 / 1000 + Message.field485;
         class285.cameraYaw &= 2047;
      }

      int var3 = var1 - class285.cameraYaw;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
         class285.cameraYaw = var1;
      }

   }
}
