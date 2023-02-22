import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("aj")
   @Export("directBuffer")
   ByteBuffer directBuffer;

   DirectByteArrayCopier() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "118"
   )
   @Export("get")
   byte[] get() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      this.directBuffer.position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "-25"
   )
   @Export("set")
   void set(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      this.directBuffer.position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)V",
      garbageValue = "1115242547"
   )
   @Export("updatePlayer")
   static final void updatePlayer(PacketBuffer var0) {
      var0.importIndex();
      int var1 = Client.localPlayerIndex;
      Player var2 = BuddyRankComparator.localPlayer = Client.players[var1] = new Player();
      var2.index = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - GameEngine.baseX * 64;
      var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
      var2.pathY[0] = var6 - class178.baseY * 64;
      var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
      TaskHandler.Client_plane = var2.plane = var4;
      if (Players.field1335[var1] != null) {
         var2.read(Players.field1335[var1]);
      }

      Players.Players_count = 0;
      Players.Players_indices[++Players.Players_count - 1] = var1;
      Players.field1336[var1] = 0;
      Players.Players_emptyIdxCount = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var7 != var1) {
            int var8 = var0.readBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
            Players.Players_orientations[var7] = 0;
            Players.Players_targetIndices[var7] = -1;
            Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
            Players.field1336[var7] = 0;
         }
      }

      var0.exportIndex();
   }
}
