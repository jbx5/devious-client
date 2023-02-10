import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class168 {
   @ObfuscatedName("q")
   @Export("operatingSystemName")
   public static String operatingSystemName;

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-105"
   )
   public static void method3488() {
      NPCComposition.NpcDefinition_cached.clear();
      NPCComposition.NpcDefinition_cachedModels.clear();
   }

   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      descriptor = "(IIIZI)V",
      garbageValue = "-1456500003"
   )
   public static void method3487(int var0, int var1, int var2, boolean var3) {
      PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByteNeg(var2);
      var4.packetBuffer.writeShortAddLE(var1);
      var4.packetBuffer.writeShortAdd(var0);
      var4.packetBuffer.writeIntIME(var3 ? Client.field594 : 0);
      Client.packetWriter.addNode(var4);
   }
}
