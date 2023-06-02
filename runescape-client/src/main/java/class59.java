import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class59 {
   @ObfuscatedName("bf")
   static Image field432;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lbw;"
   )
   VorbisFloor field428;
   @ObfuscatedName("an")
   boolean field429;
   @ObfuscatedName("av")
   int[] field430;
   @ObfuscatedName("as")
   int[] field431;
   @ObfuscatedName("ax")
   boolean[] field435;

   @ObfuscatedSignature(
      descriptor = "(Lbw;Z[I[I[Z)V"
   )
   class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.field428 = var1;
      this.field429 = var2;
      this.field430 = var3;
      this.field431 = var4;
      this.field435 = var5;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([FII)V",
      garbageValue = "275584497"
   )
   void method1112(float[] var1, int var2) {
      int var3 = this.field428.field270.length;
      VorbisFloor var10000 = this.field428;
      int var4 = VorbisFloor.field274[this.field428.multiplier - 1];
      boolean[] var5 = this.field435;
      this.field435[1] = true;
      var5[0] = true;

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var6 = 2; var6 < var3; ++var6) {
         var7 = this.field428.method731(this.field430, var6);
         var8 = this.field428.method732(this.field430, var6);
         var9 = this.field428.method744(this.field430[var7], this.field431[var7], this.field430[var8], this.field431[var8], this.field430[var6]);
         var10 = this.field431[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (var10 != 0) {
            boolean[] var14 = this.field435;
            this.field435[var8] = true;
            var14[var7] = true;
            this.field435[var6] = true;
            if (var10 >= var13) {
               this.field431[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
            } else {
               this.field431[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
            }
         } else {
            this.field435[var6] = false;
            this.field431[var6] = var9;
         }
      }

      this.VarbisFloor_sort(0, var3 - 1);
      var6 = 0;
      var7 = this.field428.multiplier * this.field431[0];

      for(var8 = 1; var8 < var3; ++var8) {
         if (this.field435[var8]) {
            var9 = this.field430[var8];
            var10 = this.field428.multiplier * this.field431[var8];
            this.field428.method733(var6, var7, var9, var10, var1, var2);
            if (var9 >= var2) {
               return;
            }

            var6 = var9;
            var7 = var10;
         }
      }

      var10000 = this.field428;
      float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

      for(var9 = var6; var9 < var2; ++var9) {
         var1[var9] *= var16;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-99"
   )
   boolean method1110() {
      return this.field429;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "106"
   )
   @Export("VarbisFloor_sort")
   void VarbisFloor_sort(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.field430[var1];
         int var5 = this.field431[var1];
         boolean var6 = this.field435[var1];

         for(int var7 = var1 + 1; var7 <= var2; ++var7) {
            int var8 = this.field430[var7];
            if (var8 < var4) {
               this.field430[var3] = var8;
               this.field431[var3] = this.field431[var7];
               this.field435[var3] = this.field435[var7];
               ++var3;
               this.field430[var7] = this.field430[var3];
               this.field431[var7] = this.field431[var3];
               this.field435[var7] = this.field435[var3];
            }
         }

         this.field430[var3] = var4;
         this.field431[var3] = var5;
         this.field435[var3] = var6;
         this.VarbisFloor_sort(var1, var3 - 1);
         this.VarbisFloor_sort(var3 + 1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1359097428"
   )
   @Export("addGameMessage")
   static void addGameMessage(int var0, String var1, String var2) {
      ApproximateRouteStrategy.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I[III)V",
      garbageValue = "2114034407"
   )
   static void method1116(int var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
         KitDefinition var4 = class154.KitDefinition_get(var3);
         if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) {
            var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
            break;
         }
      }

   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "(IIIILtm;Lmc;I)V",
      garbageValue = "-4112826"
   )
   @Export("drawSpriteOnMinimap")
   static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      if (var4 != null) {
         int var6 = Client.camAngleY & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method9410(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
            } else {
               var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
            }

         }
      }
   }
}
