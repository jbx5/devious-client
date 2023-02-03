import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
   AbstractByteArrayCopier() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "2088056836"
   )
   @Export("get")
   abstract byte[] get();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1513593399"
   )
   @Export("set")
   public abstract void set(byte[] var1);

   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1554709844"
   )
   static final void method6400(int var0, int var1) {
      ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class482.guestClanChannel;
      if (var2 != null && var1 >= 0 && var1 < var2.method3359()) {
         ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
         if (var3.rank == -1) {
            String var4 = var3.username.getName();
            PacketBufferNode var5 = Renderable.getPacketBufferNode(ClientPacket.field3095, Client.packetWriter.isaacCipher);
            var5.packetBuffer.writeByte(3 + class96.stringCp1252NullTerminatedByteSize(var4));
            var5.packetBuffer.writeByte(var0);
            var5.packetBuffer.writeShort(var1);
            var5.packetBuffer.writeStringCp1252NullTerminated(var4);
            Client.packetWriter.addNode(var5);
         }
      }
   }
}
