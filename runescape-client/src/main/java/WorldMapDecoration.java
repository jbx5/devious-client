import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2080162465
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1504481025
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1419490017
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-215676095"
   )
   @Export("drawLoadingMessage")
   static final void drawLoadingMessage(String var0, boolean var1) {
      if (Client.showLoadingMessages) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = WallDecoration.fontPlain12.lineWidth(var0, 250);
         int var6 = WallDecoration.fontPlain12.lineCount(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
         WallDecoration.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         int var7 = var3 - var2;
         int var8 = var4 - var2;
         int var9 = var5 + var2 + var2;
         int var10 = var2 + var6 + var2;

         for(int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
            if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
               Client.field705[var11] = true;
            }
         }

         if (var1) {
            RouteStrategy.rasterProvider.drawFull(0, 0);
         } else {
            FriendsChat.invalidateMenu(var3, var4, var5, var6);
         }

      }
   }
}
