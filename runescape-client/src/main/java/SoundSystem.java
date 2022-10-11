import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = 1567971571
   )
   static int field332;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Lab;"
   )
   @Export("players")
   volatile PcmPlayer[] players = new PcmPlayer[2];

   SoundSystem() {
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run();
            }
         }
      } catch (Exception var4) {
         class421.RunException_sendStackTrace((String)null, var4);
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1102083287"
   )
   static final void method859(String var0) {
      PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3031, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0));
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-2133811273"
   )
   static final boolean method862(int var0, int var1) {
      ObjectComposition var2 = InterfaceParent.getObjectDefinition(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method3759(var1);
   }
}
