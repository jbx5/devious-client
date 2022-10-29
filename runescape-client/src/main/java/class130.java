import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public enum class130 implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1552(0, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1551(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1547(2, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1545(3, 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1546(4, 4),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1549(5, 5),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1550(6, 6),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1548(7, 7),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Les;"
   )
   field1553(8, 8);

   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 542971727
   )
   final int field1554;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1129342791
   )
   final int field1555;

   class130(int var3, int var4) {
      this.field1554 = var3;
      this.field1555 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1555;
   }

   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "159732315"
   )
   @Export("Clan_leaveChat")
   static final void Clan_leaveChat() {
      PacketBufferNode var0 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(0);
      Client.packetWriter.addNode(var0);
   }
}
