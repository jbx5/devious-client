import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("FloorOverlayDefinition_archive")
   public static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("FloorOverlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("hr")
   static int[] field2268;
   @ObfuscatedName("uh")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 2120418151
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 91594995
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("ax")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1909348793
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1169710103
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -914575673
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1082285021
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 358320181
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -855683399
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1715930167
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "10897"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "1351995456"
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IIB)V",
      garbageValue = "60"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2003241893"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "23674"
   )
   public static int method4023(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "339603144"
   )
   public static boolean method4035(int var0) {
      return var0 == WorldMapDecorationType.field3804.id;
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "(Lmb;I)Z",
      garbageValue = "1654223314"
   )
   static final boolean method4043(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 205) {
         Client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.changeAppearance(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.method6014(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.playerAppearance.method6015(0);
         }

         if (var1 == 325) {
            Client.playerAppearance.method6015(1);
         }

         if (var1 == 326) {
            PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(var4.packetBuffer);
            Client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
