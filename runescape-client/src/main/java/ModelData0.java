import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("ModelData0")
public class ModelData0 {
   ModelData0() {
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2046467677"
   )
   static final int method4641() {
      if (BufferedSink.clientPreferences.method2452()) {
         return ApproximateRouteStrategy.Client_plane;
      } else {
         int var0 = class132.getTileHeight(TextureProvider.cameraX, class313.cameraZ, ApproximateRouteStrategy.Client_plane);
         return var0 - class31.cameraY < 800 && (Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][TextureProvider.cameraX >> 7][class313.cameraZ >> 7] & 4) != 0 ? ApproximateRouteStrategy.Client_plane : 3;
      }
   }
}
