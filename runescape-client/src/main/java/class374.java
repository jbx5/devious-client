import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class374 extends RuntimeException {
   @ObfuscatedName("al")
   static ThreadPoolExecutor field4387;

   public class374(String var1, Object[] var2) {
      super(String.format(var1, var2));
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2014413605"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = class147.getTileHeight(var0, var1, GameEngine.Client_plane) - var2;
         var0 -= class36.cameraX;
         var3 -= class174.cameraY;
         var1 -= class297.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[WorldMapSectionType.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[WorldMapSectionType.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class125.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class125.cameraYaw];
         int var8 = var0 * var7 + var6 * var1 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var5 * var1 + var3 * var4 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }
}
