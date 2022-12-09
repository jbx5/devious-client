import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class280 {
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("worldSelectStars")
   static IndexedSprite[] worldSelectStars;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqx;I)V",
      garbageValue = "785365671"
   )
   @Export("updatePlayer")
   static final void updatePlayer(PacketBuffer var0) {
      var0.importIndex();
      int var1 = Client.localPlayerIndex;
      Player var2 = class155.localPlayer = Client.players[var1] = new Player();
      var2.index = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - class154.baseX * 64;
      var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
      var2.pathY[0] = var6 - class365.baseY * 64;
      var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
      class383.Client_plane = var2.plane = var4;
      if (Players.field1372[var1] != null) {
         var2.read(Players.field1372[var1]);
      }

      Players.Players_count = 0;
      Players.Players_indices[++Players.Players_count - 1] = var1;
      Players.field1370[var1] = 0;
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
            Players.field1370[var7] = 0;
         }
      }

      var0.exportIndex();
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "63"
   )
   static final void method5498(int var0, int var1, int var2) {
      if (class145.cameraX < var0) {
         class145.cameraX = (var0 - class145.cameraX) * Tile.field2481 / 1000 + class145.cameraX + class31.field181;
         if (class145.cameraX > var0) {
            class145.cameraX = var0;
         }
      }

      if (class145.cameraX > var0) {
         class145.cameraX -= (class145.cameraX - var0) * Tile.field2481 / 1000 + class31.field181;
         if (class145.cameraX < var0) {
            class145.cameraX = var0;
         }
      }

      if (class414.cameraY < var1) {
         class414.cameraY = (var1 - class414.cameraY) * Tile.field2481 / 1000 + class414.cameraY + class31.field181;
         if (class414.cameraY > var1) {
            class414.cameraY = var1;
         }
      }

      if (class414.cameraY > var1) {
         class414.cameraY -= (class414.cameraY - var1) * Tile.field2481 / 1000 + class31.field181;
         if (class414.cameraY < var1) {
            class414.cameraY = var1;
         }
      }

      if (ClanChannel.cameraZ < var2) {
         ClanChannel.cameraZ = (var2 - ClanChannel.cameraZ) * Tile.field2481 / 1000 + ClanChannel.cameraZ + class31.field181;
         if (ClanChannel.cameraZ > var2) {
            ClanChannel.cameraZ = var2;
         }
      }

      if (ClanChannel.cameraZ > var2) {
         ClanChannel.cameraZ -= (ClanChannel.cameraZ - var2) * Tile.field2481 / 1000 + class31.field181;
         if (ClanChannel.cameraZ < var2) {
            ClanChannel.cameraZ = var2;
         }
      }

   }
}
