import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class163 extends class156 {
   @ObfuscatedName("aj")
   String field1773;
   @ObfuscatedName("al")
   byte field1774;
   @ObfuscatedName("ac")
   byte field1772;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgk;"
   )
   final class157 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgk;)V"
   )
   class163(class157 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2070491057"
   )
   void vmethod3353(Buffer var1) {
      this.field1773 = var1.readStringCp1252NullTerminatedOrNull();
      if (this.field1773 != null) {
         var1.readUnsignedByte();
         this.field1774 = var1.readByte();
         this.field1772 = var1.readByte();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;B)V",
      garbageValue = "-82"
   )
   void vmethod3354(ClanChannel var1) {
      var1.name = this.field1773;
      if (this.field1773 != null) {
         var1.field1758 = this.field1774;
         var1.field1761 = this.field1772;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lne;IIIZI)V",
      garbageValue = "590202172"
   )
   public static void method3352(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class293.musicPlayerStatus = 1;
      class364.musicTrackArchive = var0;
      IntHashTable.musicTrackGroupId = var1;
      class293.musicTrackFileId = var2;
      class368.musicTrackVolume = var3;
      class293.musicTrackBoolean = var4;
      AbstractRasterProvider.pcmSampleLength = 10000;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1594025816"
   )
   public static void method3357() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("nf")
   @ObfuscatedSignature(
      descriptor = "(IIIZI)V",
      garbageValue = "370588109"
   )
   public static void method3359(int var0, int var1, int var2, boolean var3) {
      PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeShort(var0);
      var4.packetBuffer.writeByteSub(var2);
      var4.packetBuffer.writeIntME(var3 ? Client.field575 : 0);
      var4.packetBuffer.writeShortAdd(var1);
      Client.packetWriter.addNode(var4);
   }
}
