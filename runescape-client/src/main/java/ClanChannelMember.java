import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("ClanChannelMember")
public class ClanChannelMember {
   @ObfuscatedName("ab")
   @Export("JagexCache_locationFile")
   static File JagexCache_locationFile;
   @ObfuscatedName("aj")
   @Export("rank")
   public byte rank;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1389608253
   )
   @Export("world")
   public int world;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("username")
   public Username username;

   ClanChannelMember() {
   }

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("Clan_leaveChat")
   static final void Clan_leaveChat() {
      PacketBufferNode var0 = UserComparator9.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(0);
      Client.packetWriter.addNode(var0);
   }
}
