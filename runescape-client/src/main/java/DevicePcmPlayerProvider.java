import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("musicTrackArchive")
   public static AbstractArchive musicTrackArchive;
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = -1833710583
   )
   static int field122;

   DevicePcmPlayerProvider() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Lab;",
      garbageValue = "469257339"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "146"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (MenuAction.friendsChat != null) {
         PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
