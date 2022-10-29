import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public enum class323 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field4092(-1),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field4088(0),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field4090(1),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   field4089(2);

   @ObfuscatedName("tu")
   @ObfuscatedGetter(
      intValue = 1507802483
   )
   static int field4093;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -174911481
   )
   final int field4091;

   class323(int var3) {
      this.field4091 = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4091;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1944501029"
   )
   static final void method6271(boolean var0) {
      class355.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }
}
