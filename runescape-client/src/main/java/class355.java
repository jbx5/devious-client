import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class355 {
   @ObfuscatedName("a")
   @Export("cp1252AsciiExtension")
   public static final char[] cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @ObfuscatedName("bf")
   @Export("otp")
   static String otp;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IS)V",
      garbageValue = "2814"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field3562 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field3564 == null) {
            var0.field3564 = new int[var0.field3562.length];
         }

         var0.field3564[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-30"
   )
   @Export("playPcmPlayers")
   static final void playPcmPlayers() {
      if (class86.pcmPlayer1 != null) {
         class86.pcmPlayer1.run();
      }

      if (HealthBar.pcmPlayer0 != null) {
         HealthBar.pcmPlayer0.run();
      }

   }

   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-488142945"
   )
   static final void method6770(int var0, int var1, boolean var2) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3215()) {
            ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher);
            var4.packetBuffer.writeByte(4 + Actor.stringCp1252NullTerminatedByteSize(var3.username.getName()));
            var4.packetBuffer.writeByte(var0);
            var4.packetBuffer.writeShort(var1);
            var4.packetBuffer.writeBoolean(var2);
            var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
            Client.packetWriter.addNode(var4);
         }
      }
   }
}
