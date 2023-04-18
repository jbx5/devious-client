import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class81 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;I)Z",
      garbageValue = "1164059747"
   )
   static boolean method2247(Date var0) {
      java.util.Calendar var1 = java.util.Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-2147193321"
   )
   @Export("addPendingSpawnToScene")
   static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.isLowDetail && var0 != GameEngine.Client_plane) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if (var1 == 0) {
            var8 = class31.scene.getBoundaryObjectTag(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class31.scene.getWallDecorationTag(var0, var2, var3);
         }

         if (var1 == 2) {
            var8 = class31.scene.getGameObjectTag(var0, var2, var3);
         }

         if (var1 == 3) {
            var8 = class31.scene.getFloorDecorationTag(var0, var2, var3);
         }

         int var13;
         if (var8 != 0L) {
            var13 = class31.scene.getObjectFlags(var0, var2, var3, var8);
            int var15 = InterfaceParent.Entity_unpackID(var8);
            int var16 = var13 & 31;
            int var17 = var13 >> 6 & 3;
            ObjectComposition var14;
            if (var1 == 0) {
               class31.scene.removeBoundaryObject(var0, var2, var3);
               var14 = class144.getObjectDefinition(var15);
               if (var14.interactType != 0) {
                  Client.collisionMaps[var0].method4252(var2, var3, var16, var17, var14.boolean1);
               }
            }

            if (var1 == 1) {
               class31.scene.removeWallDecoration(var0, var2, var3);
            }

            if (var1 == 2) {
               class31.scene.removeGameObject(var0, var2, var3);
               var14 = class144.getObjectDefinition(var15);
               if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
                  return;
               }

               if (var14.interactType != 0) {
                  Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
               }
            }

            if (var1 == 3) {
               class31.scene.removeFloorDecoration(var0, var2, var3);
               var14 = class144.getObjectDefinition(var15);
               if (var14.interactType == 1) {
                  Client.collisionMaps[var0].method4254(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var13 = var0;
            if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
               var13 = var0 + 1;
            }

            class165.method3480(var0, var13, var2, var3, var4, var5, var6, var7, class31.scene, Client.collisionMaps[var0]);
         }
      }

   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "27574"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeIntME(var0);
      var2.packetBuffer.writeShortLE(var1);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2013563855"
   )
   static boolean method2249(int var0) {
      for(int var1 = 0; var1 < Client.field487; ++var1) {
         if (Client.field556[var1] == var0) {
            return true;
         }
      }

      return false;
   }
}
