import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class36 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("reflectionChecks")
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();
   @ObfuscatedName("js")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   @Export("scene")
   static Scene scene;

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      descriptor = "(Lmb;B)V",
      garbageValue = "-1"
   )
   static final void method658(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field790 == -1) {
            Client.field790 = var0.spriteId2;
            Client.field791 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field790;
         } else {
            var0.spriteId2 = Client.field791;
         }

      } else if (var1 == 325) {
         if (Client.field790 == -1) {
            Client.field790 = var0.spriteId2;
            Client.field791 = var0.spriteId;
         }

         if (Client.playerAppearance.gender == 1) {
            var0.spriteId2 = Client.field791;
         } else {
            var0.spriteId2 = Client.field790;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }

   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1961721798"
   )
   static final void method664() {
      PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field875 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            SoundCache.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         Messages.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field875 = false;
   }
}
