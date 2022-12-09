import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
   @ObfuscatedName("i")
   @Export("worldMapData0Set")
   HashSet worldMapData0Set;
   @ObfuscatedName("o")
   @Export("worldMapData1Set")
   HashSet worldMapData1Set;
   @ObfuscatedName("n")
   @Export("iconList")
   List iconList;

   WorldMapAreaData() {
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lqy;IZI)V",
      garbageValue = "-2083183142"
   )
   @Export("init")
   void init(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.read(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.worldMapData0Set = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.worldMapData0Set.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.worldMapData1Set = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.worldMapData1Set.add(var8);
      }

      this.initIconsList(var2, var4);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Lqy;ZB)V",
      garbageValue = "31"
   )
   @Export("initIconsList")
   void initIconsList(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.readNullableLargeSmart();
         Coord var6 = new Coord(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
         }
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(Lcj;ZB)V",
      garbageValue = "8"
   )
   @Export("addPlayerToScene")
   static void addPlayerToScene(Player var0, boolean var1) {
      if (var0 != null && var0.isVisible() && !var0.isHidden) {
         var0.isUnanimated = false;
         if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
            var0.isUnanimated = true;
         }

         int var2 = var0.x >> 7;
         int var3 = var0.y >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = GameEngine.calculateTag(0, 0, 0, false, var0.index);
            if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
               var0.isUnanimated = false;
               var0.tileHeight = SpotAnimationDefinition.getTileHeight(var0.x, var0.y, class383.Client_plane);
               var0.playerCycle = Client.cycle;
               ReflectionCheck.scene.addNullableObject(class383.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
            } else {
               if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
                     return;
                  }

                  Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
               }

               var0.tileHeight = SpotAnimationDefinition.getTileHeight(var0.x, var0.y, class383.Client_plane);
               var0.playerCycle = Client.cycle;
               ReflectionCheck.scene.drawEntity(class383.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
            }
         }
      }

   }
}
