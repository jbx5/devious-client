import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public enum class441 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqe;"
   )
   field4706(1, 1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lqe;"
   )
   field4702(3, 2),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lqe;"
   )
   field4704(2, 3),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lqe;"
   )
   field4705(0, 10);

   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 748215985
   )
   final int field4703;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 211243431
   )
   final int field4707;

   class441(int var3, int var4) {
      this.field4703 = var3;
      this.field4707 = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4707;
   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1069312243"
   )
   @Export("Clan_leaveChat")
   static final void Clan_leaveChat() {
      PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(0);
      Client.packetWriter.addNode(var0);
   }
}
