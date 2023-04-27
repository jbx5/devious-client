import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("Clock")
public abstract class Clock {
   Clock() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-331366942"
   )
   @Export("mark")
   public abstract void mark();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1491982008"
   )
   @Export("wait")
   public abstract int wait(int var1, int var2);

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "787854296"
   )
   static final void method3627(int var0, int var1, boolean var2) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3416()) {
            ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            PacketBufferNode var4 = class330.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher);
            var4.packetBuffer.writeByte(4 + DynamicObject.stringCp1252NullTerminatedByteSize(var3.username.getName()));
            var4.packetBuffer.writeByte(var0);
            var4.packetBuffer.writeShort(var1);
            var4.packetBuffer.writeBoolean(var2);
            var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
            Client.packetWriter.addNode(var4);
         }
      }
   }
}
