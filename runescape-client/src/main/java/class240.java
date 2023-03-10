import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class240 {
   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "343853799"
   )
   static final void method4792() {
      PacketBufferNode var0 = UserComparator9.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field836 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            class17.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         class69.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field836 = false;
   }
}
