import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("titleboxSprite")
   static IndexedSprite titleboxSprite;
   @ObfuscatedName("al")
   @Export("tileColors")
   final int[] tileColors;

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2092140456"
   )
   @Export("getTileColor")
   final int getTileColor(int var1, int var2) {
      return this.tileColors[var1 + var2 * 64];
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsq;II)V",
      garbageValue = "1646831270"
   )
   @Export("updatePlayers")
   static final void updatePlayers(PacketBuffer var0, int var1) {
      int var2 = var0.offset;
      Players.Players_pendingUpdateCount = 0;
      WorldMapRectangle.method5219(var0);

      for(int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
         int var4 = Players.Players_pendingUpdateIndices[var3];
         Player var5 = Client.players[var4];
         int var6 = var0.readUnsignedByte();
         if ((var6 & 2) != 0) {
            var6 += var0.readUnsignedByte() << 8;
         }

         Frames.method4561(var0, var4, var5, var6);
      }

      if (var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }
}
