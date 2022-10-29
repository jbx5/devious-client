import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("vk")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("grandExchangeEvents")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   public static final WorldMapCacheName field2954 = new WorldMapCacheName("details");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   public static final WorldMapCacheName field2949 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   public static final WorldMapCacheName field2948 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   static final WorldMapCacheName field2950 = new WorldMapCacheName("area");
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   public static final WorldMapCacheName field2952 = new WorldMapCacheName("labels");
   @ObfuscatedName("j")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqk;B)V",
      garbageValue = "-81"
   )
   @Export("updatePlayer")
   static final void updatePlayer(PacketBuffer var0) {
      var0.importIndex();
      int var1 = Client.localPlayerIndex;
      Player var2 = class296.localPlayer = Client.players[var1] = new Player();
      var2.index = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - KeyHandler.baseX * 64;
      var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
      var2.pathY[0] = var6 - class158.baseY * 64;
      var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
      ApproximateRouteStrategy.Client_plane = var2.plane = var4;
      if (Players.field1315[var1] != null) {
         var2.read(Players.field1315[var1]);
      }

      Players.Players_count = 0;
      Players.Players_indices[++Players.Players_count - 1] = var1;
      Players.field1323[var1] = 0;
      Players.Players_emptyIdxCount = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var1 != var7) {
            int var8 = var0.readBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
            Players.Players_orientations[var7] = 0;
            Players.Players_targetIndices[var7] = -1;
            Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
            Players.field1323[var7] = 0;
         }
      }

      var0.exportIndex();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqk;II)V",
      garbageValue = "1119932413"
   )
   @Export("updatePlayers")
   static final void updatePlayers(PacketBuffer var0, int var1) {
      int var2 = var0.offset;
      Players.Players_pendingUpdateCount = 0;
      TaskHandler.method3340(var0);
      class21.method297(var0);
      if (var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-2038399298"
   )
   static final void method5228(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class32.Tiles_underlays[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
               }

               if (var0 + var2 == var5 && var5 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
               }

               if (var4 == var3 + var1 && var4 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-101"
   )
   public static boolean method5229(int var0) {
      return (var0 >> 22 & 1) != 0;
   }
}
