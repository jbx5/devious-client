import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class385 {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-1249793384"
   )
   static final void method7407(String var0, int var1) {
      PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeByteSub(var1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }
}
