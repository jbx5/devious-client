import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("Skills")
public class Skills {
   @ObfuscatedName("w")
   @Export("Skills_enabled")
   public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("v")
   @Export("Skills_experienceTable")
   public static int[] Skills_experienceTable = new int[99];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         Skills_experienceTable[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-1575431639"
   )
   @Export("addPendingSpawnToScene")
   static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.isLowDetail && var0 != class103.Client_plane) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var7 = WorldMapAreaData.scene.getBoundaryObjectTag(var0, var2, var3);
         }

         if (var1 == 1) {
            var7 = WorldMapAreaData.scene.getWallDecorationTag(var0, var2, var3);
         }

         if (var1 == 2) {
            var7 = WorldMapAreaData.scene.getGameObjectTag(var0, var2, var3);
         }

         if (var1 == 3) {
            var7 = WorldMapAreaData.scene.getFloorDecorationTag(var0, var2, var3);
         }

         int var12;
         if (0L != var7) {
            var12 = WorldMapAreaData.scene.getObjectFlags(var0, var2, var3, var7);
            int var14 = class124.Entity_unpackID(var7);
            int var15 = var12 & 31;
            int var16 = var12 >> 6 & 3;
            ObjectComposition var13;
            if (var1 == 0) {
               WorldMapAreaData.scene.removeBoundaryObject(var0, var2, var3);
               var13 = class463.getObjectDefinition(var14);
               if (var13.interactType != 0) {
                  Client.collisionMaps[var0].method4200(var2, var3, var15, var16, var13.boolean1);
               }
            }

            if (var1 == 1) {
               WorldMapAreaData.scene.removeWallDecoration(var0, var2, var3);
            }

            if (var1 == 2) {
               WorldMapAreaData.scene.removeGameObject(var0, var2, var3);
               var13 = class463.getObjectDefinition(var14);
               if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
                  return;
               }

               if (var13.interactType != 0) {
                  Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
               }
            }

            if (var1 == 3) {
               WorldMapAreaData.scene.removeFloorDecoration(var0, var2, var3);
               var13 = class463.getObjectDefinition(var14);
               if (var13.interactType == 1) {
                  Client.collisionMaps[var0].method4192(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            class155.method3331(var0, var12, var2, var3, var4, var5, var6, WorldMapAreaData.scene, Client.collisionMaps[var0]);
         }
      }

   }

   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1079799001"
   )
   static void method6427(int var0, int var1) {
      MenuAction var2 = class148.tempMenuAction;
      if (var2 != null) {
         FileSystem.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action, var2.target, var0, var1);
      }

      class148.tempMenuAction = null;
   }
}
