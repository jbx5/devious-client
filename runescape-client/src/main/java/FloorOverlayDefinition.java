import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("FloorOverlayDefinition_archive")
   public static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("FloorOverlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1889574527
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -202963991
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("au")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2085280195
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 174415927
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 470803713
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 532980473
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -187777599
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1797179473
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1379609783
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1436922747"
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IS)V",
      garbageValue = "128"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IIS)V",
      garbageValue = "132"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2082710578"
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

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.hue = (int)(256.0 * var12);
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lcl;I)V",
      garbageValue = "1003171316"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if (var0.isMembersOnly() != Client.isMembersWorld) {
         Client.isMembersWorld = var0.isMembersOnly();
         boolean var1 = var0.isMembersOnly();
         if (var1 != FileSystem.ItemDefinition_inMembersWorld) {
            class379.method7393();
            FileSystem.ItemDefinition_inMembersWorld = var1;
         }
      }

      if (var0.properties != Client.worldProperties) {
         Archive var3 = class452.archive8;
         int var2 = var0.properties;
         if ((var2 & 536870912) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
         } else if ((var2 & 1073741824) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
         } else if ((var2 & 256) != 0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
         } else {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
         }
      }

      UserComparator8.worldHost = var0.host;
      Client.worldId = var0.id;
      Client.worldProperties = var0.properties;
      FriendsChat.worldPort = Client.gameBuild == 0 ? 'ꩊ' : var0.id + '鱀';
      class127.js5Port = Client.gameBuild == 0 ? 443 : var0.id + '썐';
      ItemContainer.currentPort = FriendsChat.worldPort;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "2032974834"
   )
   static int method4123(int var0, Script var1, boolean var2) {
      return 2;
   }
}
