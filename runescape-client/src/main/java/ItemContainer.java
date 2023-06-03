import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ItemContainer")
public class ItemContainer extends Node {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("itemContainers")
   static NodeHashTable itemContainers = new NodeHashTable(32);
   @ObfuscatedName("an")
   @Export("ids")
   int[] ids = new int[]{-1};
   @ObfuscatedName("av")
   @Export("quantities")
   int[] quantities = new int[]{0};

   ItemContainer() {
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-7"
   )
   static final int method2230(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1737946308"
   )
   static final void method2239(int var0) {
      int[] var1 = class33.sceneMinimapSprite.pixels;
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
               class36.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
            }

            if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
               class36.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
            }

            var4 += 4;
         }
      }

      var3 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
      var4 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
      class33.sceneMinimapSprite.setRaster();

      int var6;
      for(var5 = 1; var5 < 103; ++var5) {
         for(var6 = 1; var6 < 103; ++var6) {
            if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
               UserComparator10.drawObject(var0, var6, var5, var3, var4);
            }

            if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
               UserComparator10.drawObject(var0 + 1, var6, var5, var3, var4);
            }
         }
      }

      Client.mapIconCount = 0;

      for(var5 = 0; var5 < 104; ++var5) {
         for(var6 = 0; var6 < 104; ++var6) {
            long var7 = class36.scene.getFloorDecorationTag(Clock.Client_plane, var5, var6);
            if (var7 != 0L) {
               int var9 = class215.Entity_unpackID(var7);
               int var10 = class175.getObjectDefinition(var9).mapIconId;
               if (var10 >= 0 && class147.WorldMapElement_get(var10).field1908) {
                  Client.mapIcons[Client.mapIconCount] = class147.WorldMapElement_get(var10).getSpriteBool(false);
                  Client.mapIconXs[Client.mapIconCount] = var5;
                  Client.mapIconYs[Client.mapIconCount] = var6;
                  ++Client.mapIconCount;
               }
            }
         }
      }

      WorldMapSectionType.rasterProvider.apply();
   }
}
