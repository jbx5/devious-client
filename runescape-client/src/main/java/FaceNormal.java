import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("FaceNormal")
public class FaceNormal {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1593342669
   )
   @Export("x")
   int x;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2131754663
   )
   @Export("y")
   int y;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1522131961
   )
   @Export("z")
   int z;

   FaceNormal() {
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "10"
   )
   public static int method4618(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1404253299"
   )
   static final void method4619() {
      if (Client.logoutTimer > 0) {
         Player.logOut();
      } else {
         Client.timer.method7330();
         class140.updateGameState(40);
         class14.field83 = Client.packetWriter.getSocket();
         Client.packetWriter.removeSocket();
      }
   }

   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "739721891"
   )
   static final void method4620(int var0, int var1, boolean var2) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3312()) {
            ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            PacketBufferNode var4 = class136.getPacketBufferNode(ClientPacket.field3078, Client.packetWriter.isaacCipher);
            var4.packetBuffer.writeByte(4 + class13.stringCp1252NullTerminatedByteSize(var3.username.getName()));
            var4.packetBuffer.writeByte(var0);
            var4.packetBuffer.writeShort(var1);
            var4.packetBuffer.writeBoolean(var2);
            var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
            Client.packetWriter.addNode(var4);
         }
      }
   }
}
