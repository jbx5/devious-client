import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("AABB")
public class AABB {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2096870165
   )
   @Export("xMid")
   int xMid;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 332866065
   )
   @Export("yMid")
   int yMid;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -2013647353
   )
   @Export("zMid")
   int zMid;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 465602659
   )
   @Export("xMidOffset")
   int xMidOffset;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 838590455
   )
   @Export("yMidOffset")
   int yMidOffset;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1243099435
   )
   @Export("zMidOffset")
   int zMidOffset;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = var1;
      this.yMid = var2;
      this.zMid = var3;
      this.xMidOffset = var4;
      this.yMidOffset = var5;
      this.zMidOffset = var6;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;III)[Lrs;",
      garbageValue = "-1540758388"
   )
   public static SpritePixels[] method4629(AbstractArchive var0, int var1, int var2) {
      if (!Buffer.method8892(var0, var1, var2)) {
         return null;
      } else {
         SpritePixels[] var4 = new SpritePixels[class488.SpriteBuffer_spriteCount];

         for(int var5 = 0; var5 < class488.SpriteBuffer_spriteCount; ++var5) {
            SpritePixels var6 = var4[var5] = new SpritePixels();
            var6.width = class488.SpriteBuffer_spriteWidth;
            var6.height = class488.SpriteBuffer_spriteHeight;
            var6.xOffset = class488.SpriteBuffer_xOffsets[var5];
            var6.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var5];
            var6.subWidth = FriendsList.SpriteBuffer_spriteWidths[var5];
            var6.subHeight = class132.SpriteBuffer_spriteHeights[var5];
            int var7 = var6.subWidth * var6.subHeight;
            byte[] var8 = class140.SpriteBuffer_pixels[var5];
            var6.pixels = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.pixels[var9] = class100.SpriteBuffer_spritePalette[var8[var9] & 255];
            }
         }

         class100.method2724();
         return var4;
      }
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1608051056"
   )
   static final void method4628(int var0, int var1, int var2, int var3) {
      Client.field626 = 0;
      int var4 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
      int var5 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
      if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
         Client.field626 = 1;
      }

      if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
         Client.field626 = 1;
      }

      if (Client.field626 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
         Client.field626 = 0;
      }

   }
}
