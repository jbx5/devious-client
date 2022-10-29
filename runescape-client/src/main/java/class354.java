import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public final class class354 {
   @ObfuscatedName("d")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "8240"
   )
   protected static final void method6768() {
      class362.clock.mark();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.graphicsTickTimes[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.clientTickTimes[var0] = 0L;
      }

      FloorDecoration.gameCyclesToDo = 0;
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "892679424"
   )
   static final void method6769() {
      PacketBufferNode var0 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field850 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            class7.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         class143.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field850 = false;
   }
}
