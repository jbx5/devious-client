import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class253 {
   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-597857379"
   )
   static final void method5283() {
      if (class383.Client_plane != Client.field619) {
         Client.field619 = class383.Client_plane;
         int var0 = class383.Client_plane;
         int[] var1 = GameObject.sceneMinimapSprite.pixels;
         int var2 = var1.length;

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            var1[var3] = 0;
         }

         int var4;
         int var5;
         for(var3 = 1; var3 < 103; ++var3) {
            var4 = (103 - var3) * 2048 + 24628;

            for(var5 = 1; var5 < 103; ++var5) {
               if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
                  ReflectionCheck.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
               }

               if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
                  ReflectionCheck.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
               }

               var4 += 4;
            }
         }

         var3 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
         var4 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
         GameObject.sceneMinimapSprite.setRaster();

         int var6;
         for(var5 = 1; var5 < 103; ++var5) {
            for(var6 = 1; var6 < 103; ++var6) {
               if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
                  class182.drawObject(var0, var6, var5, var3, var4);
               }

               if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
                  class182.drawObject(var0 + 1, var6, var5, var3, var4);
               }
            }
         }

         Client.mapIconCount = 0;

         for(var5 = 0; var5 < 104; ++var5) {
            for(var6 = 0; var6 < 104; ++var6) {
               long var7 = ReflectionCheck.scene.getFloorDecorationTag(class383.Client_plane, var5, var6);
               if (var7 != 0L) {
                  int var9 = Occluder.Entity_unpackID(var7);
                  int var10 = VarpDefinition.getObjectDefinition(var9).mapIconId;
                  if (var10 >= 0 && JagexCache.WorldMapElement_get(var10).field1940) {
                     Client.mapIcons[Client.mapIconCount] = JagexCache.WorldMapElement_get(var10).getSpriteBool(false);
                     Client.mapIconXs[Client.mapIconCount] = var5;
                     Client.mapIconYs[Client.mapIconCount] = var6;
                     ++Client.mapIconCount;
                  }
               }
            }
         }

         RouteStrategy.rasterProvider.apply();
      }

   }
}
